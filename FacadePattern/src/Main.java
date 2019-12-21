import facade.TeacherActions;
import facade.TeacherActionsFacade;
import model.Teacher;
import service.TeacherForumService;
import service.TeacherRegistrationService;
import service.TeachingMaterialFinderService;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mindaugas", "Barcauskas", "Design patterns");
        TeacherActions teacherActionsFacade = new TeacherActionsFacade();

        teacherActionsFacade.register(teacher);
        teacherActionsFacade.findTeachingMaterial("Facade pattern slides");
        teacherActionsFacade.postMessage("Congratulations on making it to the facade pattern!",
                teacher);
    }
}
