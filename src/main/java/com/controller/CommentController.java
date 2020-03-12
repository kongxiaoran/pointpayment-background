package com.controller;

import com.entity.Comment;
import com.entity.CommentPic;
import com.entity.Order;
import com.service.CommentService;
import com.service.FileService;
import com.service.OrderService;
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

    @Autowired
    OrderService orderService;

    @Autowired
    FileService fileService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public List<Comment> list(){
        return commentService.list();
    }

    /**
     * 验证该用户是否有评论权限
     * @param openId
     * @return
     */
    @RequestMapping(value = "/vertify",method = RequestMethod.POST)
    public boolean vertify(@RequestBody String openId){
        Order order = new Order();
        order.setOpenId(openId);
        List<Order> orders = orderService.getListBy(order);
        if(orders.size()==0){
            return false;
        }
        return true;
    }



//    @RequestParam("files")MultipartFile[] files,
//    @RequestParam("wxaccount") String wxaccount,@RequestParam("dishes") String dishes,
//    @RequestParam("marks") Float marks,@RequestParam("comment")String commen,@RequestParam("hid")Integer hid

    /**
     *
     * @param comment
     * @return
     */
    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public boolean submit(@RequestBody Comment comment){

        commentService.insert(comment);
        long id = comment.getId();
        List<String> pics = comment.getPics();
        for(String pic : pics){
            CommentPic commentPic = new CommentPic();
            commentPic.setPicture(pic);
            commentPic.setCommentid(id);
            commentService.insertPic(commentPic);
        }
        return true;
    }
}
