package com.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kxr
 * @Date: 2020/3/5
 * @Description
 */

@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/api/file")
public class FileController {


    /**
     * 接收评论图片
     * @param files
     * @return
     */
//    @RequestMapping(value = "/uploadFile",method = RequestMethod.POST)
//    public List<String> uploadFile(@RequestParam("files")MultipartFile[] files){
//
//        List<String> list = new ArrayList<>();
//
//        for(MultipartFile multipartFile:files){
//            String name = UUID.randomUUID().toString().replace("-", "")+
//                    multipartFile.getOriginalFilename();
//            String filePath = "/www/server/tomcat/webapps/pointpayment/commentPic/"+ name;
//
//            File desFile = new File(filePath);
//            if(!desFile.getParentFile().exists()){
//                desFile.getParentFile().mkdirs();
//            }
//
//            try {
//                multipartFile.transferTo(desFile);
//            }catch (IllegalStateException | IOException e){
//                e.printStackTrace();
//                return null;
//            }
//            list.add("http://101.133.228.179:8080/pointpayment/pic/"+ name);
//        }
//        return list;
//    }


}
