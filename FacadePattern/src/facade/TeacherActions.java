package facade;

import model.Teacher;
import model.TeachingMaterial;

public interface TeacherActions {

    void register(Teacher teacher);
    void postMessage(String message, Teacher teacher);
    TeachingMaterial findTeachingMaterial(final String name);
}
