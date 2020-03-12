package com.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    //服务器存放图片的地址
    private String rpath = "/www/server/tomcat/webapps/pointpayment/";
    private String wpath = "D:\\小猪猪\\root";

    //项目的url地址
    private String url = "https://hfuu.top/pointpayment/";


    /**
     * 接收图片
     * @param files
     * @return
     */
    @RequestMapping(value = "/uploadFile",method = RequestMethod.POST)
    public List<String> uploadFile(@RequestParam("files")MultipartFile[] files,@RequestParam("path") String path){

        List<String> list = new ArrayList<>();

        for(MultipartFile multipartFile:files){
            String name = UUID.randomUUID().toString().replace("-", "")+
                    multipartFile.getOriginalFilename();


            File desFile = new File(rpath+path+"/"+name);
            if(!desFile.getParentFile().exists()){
                desFile.getParentFile().mkdirs();
            }

            try {
                multipartFile.transferTo(desFile);
            }catch (IllegalStateException | IOException e){
                e.printStackTrace();
                return null;
            }
            list.add(url+path+"/"+ name);
        }
        return list;
    }




}
