package com.dotcms.rest.api.v1.authentication;

import com.dotcms.enterprise.LicenseUtil;
import com.dotcms.repackage.com.google.common.annotations.VisibleForTesting;
import com.dotcms.repackage.javax.ws.rs.POST;
import com.dotcms.repackage.javax.ws.rs.Path;
import com.dotcms.repackage.javax.ws.rs.Produces;
import com.dotcms.repackage.javax.ws.rs.core.Context;
import com.dotcms.repackage.javax.ws.rs.core.MediaType;
import com.dotcms.repackage.javax.ws.rs.core.Response;
import com.dotcms.repackage.org.glassfish.jersey.server.JSONP;
import com.dotcms.rest.ResponseEntityView;
import com.dotcms.rest.WebResource;
import com.dotcms.rest.annotation.NoCache;
import static com.dotcms.util.CollectionsUtils.*;

import com.dotcms.rest.api.LanguageView;
import com.dotcms.util.ConversionUtils;
import com.dotcms.util.I18NUtil;
import com.dotmarketing.business.APILocator;
import com.dotmarketing.business.ApiProvider;
import com.dotmarketing.portlets.languagesmanager.business.LanguageAPI;
import com.dotmarketing.portlets.languagesmanager.model.Language;
import com.liferay.portal.util.ReleaseInfo;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * Encapsulates the necessary info to show the login page.
 * @author jsanca
 */
@Path("/v1/loginform")
public class LoginFormResource implements Serializable {

    private final LanguageAPI languageAPI;
    private final WebResource webResource;
    private final AuthenticationHelper  authenticationHelper;
    private final ConversionUtils conversionUtils;
    private final I18NUtil i18NUtil;

    @SuppressWarnings("unused")
    public LoginFormResource() {
        this(I18NUtil.INSTANCE, APILocator.getLanguageAPI(),
                AuthenticationHelper.INSTANCE,
                ConversionUtils.INSTANCE,
                new WebResource(new ApiProvider()));
    }

    @VisibleForTesting
    protected LoginFormResource(final I18NUtil i18NUtil, final LanguageAPI languageAPI,
                                     final AuthenticationHelper  authenticationHelper,
                                     final ConversionUtils conversionUtils,
                                     final WebResource webResource) {

        this.i18NUtil = i18NUtil;
        this.conversionUtils = conversionUtils;
        this.languageAPI = languageAPI;
        this.authenticationHelper = authenticationHelper;
        this.webResource = webResource;
    }

    // todo: add the https annotation
    @POST
    @JSONP
    @NoCache
    @Produces({MediaType.APPLICATION_JSON, "application/javascript"})
    public final Response loginForm(@Context final HttpServletRequest request,
                                         final  LoginForm loginForm) {

        Response res = null;

        try {

            final LoginFormResultView.Builder builder =
                    new LoginFormResultView.Builder();

            builder.setServerId(LicenseUtil.getDisplayServerId())
                .setLevelName(LicenseUtil.getLevelName())
                .setVersion(ReleaseInfo.getVersion())
                .setBuildDateString(ReleaseInfo.getBuildDateString())
                .setLanguages(this.conversionUtils.convert(this.languageAPI.getLanguages(),
                        (final Language language) -> {

                            return new LanguageView(language.getLanguageCode(), language.getCountryCode());
                        }));


            // todo: get the custom options here
            builder.setBackgroundColor("#004a99")
                    .setBackgroundPicture("/html/images/backgrounds/bg-1.jpg")
                    .setColor("#ff00ff").setLogo("/image/company_logo?img_id=dotcms.org&key=203949");

            res = Response.ok(new ResponseEntityView(
                    builder.build(),
                    this.i18NUtil.getMessagesMap(
                            loginForm.getCountry(), loginForm.getLanguage(),
                            loginForm.getMessagesKey(), request)
                    )).build(); // 200
        } catch (Exception e) { // this is an unknown error, so we report as a 500.

            res = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }

        return res;
    } // authentication
} // E:O:F:LoginFormResource.
