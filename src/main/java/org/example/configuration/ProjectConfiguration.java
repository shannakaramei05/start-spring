package org.example.configuration;

import org.example.proxies.CommentNotificationProxy;
import org.example.proxies.EmailCommentNotificationProxy;
import org.example.repositories.CommentRepository;
import org.example.repositories.DBCommentRepository;
import org.example.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
//        "org.example.proxies",
       " org.example.services",
        "org.example.repositories",
})
public class ProjectConfiguration {

//    @Bean
//    public CommentService commentService() {
//        return new CommentService();
//    }
}
