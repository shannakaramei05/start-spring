package org.example;

import org.example.configuration.ProjectConfiguration;
import org.example.model.Comment;
import org.example.services.CommentService;
import org.example.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var s1 = context.getBean(CommentService.class);
        var s2 = context.getBean(UserService.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository();

        System.out.println(b);
    }
}