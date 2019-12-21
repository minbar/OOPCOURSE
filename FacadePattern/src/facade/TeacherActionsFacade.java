package facade;

import model.Teacher;
import model.TeachingMaterial;
import service.TeacherForumService;
import service.TeacherRegistrationService;
import service.TeachingMaterialFinderService;

import java.util.HashMap;

public class TeacherActionsFacade implements TeacherActions {

    private final TeacherRegistrationService teacherRegistrationService = new TeacherRegistrationService();
    private final TeacherForumService teacherForumService = new TeacherForumService();
    private final TeachingMaterialFinderService teachingMaterialFinder =
            new TeachingMaterialFinderService(new HashMap<>());



    @Override
    public void register(Teacher teacher) {
       teacherRegistrationService.register(teacher);
    }

    @Override
    public void postMessage(String message, Teacher teacher) {
        teacherForumService.postMessage(message, teacher);
    }

    @Override
    public TeachingMaterial findTeachingMaterial(String name) {
        return teachingMaterialFinder.findTeachingMaterial(name);
    }
}
