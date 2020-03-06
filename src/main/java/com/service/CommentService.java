package com.service;

import com.dao.CommentDao;
import com.entity.Comment;
import com.entity.CommentPic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: kxr
 * @Date: 2020/3/2
 * @Description
 */

@Component(value = "commentService")
public class CommentService {

    @Autowired
    CommentDao commentDao;

    public List<Comment> list(){
        List<Comment> comments = commentDao.list();
        for(Comment c :comments){
            List<String> commentPic = commentDao.getCommentPic(c.getId());
            c.setPics(commentPic);
        }
        return comments;
    }

    public long insert(Comment comment) {
        return commentDao.insert(comment);
    }

    public long insertPic(CommentPic commentPic){
        return commentDao.insertPic(commentPic);
    }
}
