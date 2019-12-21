package service;

import model.Teacher;

public class TeacherForumService {

    public void postMessage(final String message, final Teacher teacher) {
        System.out.println("teacher: " + teacher.getFirstName() + " posted a message: " + message);
    }

    public void deleteMessage(final String messageId) {
        System.out.println("message " + messageId + " deleted");
    }
}
