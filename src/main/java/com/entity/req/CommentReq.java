package com.entity.req;

import com.entity.Comment;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: kxr
 * @Date: 2020/3/5
 * @Description
 */
public class CommentReq {

    private MultipartFile[] files;
    private Comment comment;

    public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
