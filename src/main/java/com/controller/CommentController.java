package com.controller;

import com.entity.Comment;
import com.entity.CommentPic;
import com.entity.Order;
import com.service.CommentService;
import com.service.FileService;
import com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
     * @param wxaccount
     * @return
     */
    @RequestMapping(value = "/vertify",method = RequestMethod.POST)
    public boolean vertify(String wxaccount){
        Order order = new Order();
        order.setWxaccount(wxaccount);
        List<Order> orders = orderService.getListBy(order);
        if(orders.size()==0){
            return false;
        }
        return true;
    }

    /**
     * 提交评论
     *
     * @param files
     * @param wxaccount
     * @param dishes
     * @param marks
     * @param commen
     * @param hid
     * @return
     */
    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public boolean submit(@RequestParam("files")MultipartFile[] files,
                          @RequestParam("wxaccount") String wxaccount,@RequestParam("dishes") String dishes,
                          @RequestParam("marks") Float marks,@RequestParam("comment")String commen,@RequestParam("hid")Integer hid){

        Comment comment = new Comment();
        comment.setWxaccount(wxaccount);
        comment.setComment(commen);
        comment.setDishes(dishes);
        comment.setMarks(marks);
        comment.setHid(hid);

        //完成图片的上传
        comment.setPics(fileService.uploadFile(files));

        long id = commentService.insert(comment);
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
