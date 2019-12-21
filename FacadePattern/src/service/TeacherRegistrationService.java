package service;

import model.Teacher;

public class TeacherRegistrationService {

    public void register(Teacher teacher) {
        System.out.println("Teacher: " + teacher.getFirstName() + " registered successfully");
    }

    public void deleteAccount(Teacher teacher) {
        System.out.println("Teacher: " + teacher.getFirstName() + " account deleted successfully");
    }
}
