package org.example.proxies;

import org.example.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
