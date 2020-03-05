package com.controller;

import com.entity.Comment;
import com.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: kxr
 * @Date: 2020/3/2
 * @Description
 */

@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/api/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public List<Comment> list(){
        return commentService.list();
    }

    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public boolean submit(){

    }
}
