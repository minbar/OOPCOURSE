package com.dotcms.rest.api;

import java.io.Serializable;

/**
 * Encapsulate a language and country codes
 */
public class LanguageView implements Serializable {

    private final String language;

    private final String country;

    public LanguageView(String language, String country) {
        this.language = language;
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LanguageView that = (LanguageView) o;

        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        return country != null ? country.equals(that.country) : that.country == null;

    }

    @Override
    public int hashCode() {
        int result = language != null ? language.hashCode() : 0;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LanguageView{" +
                "language='" + language + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
} // E:O:F:LanguageView.
