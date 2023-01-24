package org.example.repositories;

import org.example.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository {

    void storeComment(Comment comment);
}
