package com.service;

import org.springframework.stereotype.Component;
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
@Component(value = "fileService")
public class FileService {

    public List<String> uploadFile(MultipartFile[] files){

        List<String> list = new ArrayList<>();

        for(MultipartFile multipartFile:files){
            String name = UUID.randomUUID().toString().replace("-", "")+
                    multipartFile.getOriginalFilename();
            String filePath = "/www/server/tomcat/webapps/pointpayment/commentPic/"+ name;

            File desFile = new File(filePath);
            if(!desFile.getParentFile().exists()){
                desFile.getParentFile().mkdirs();
            }

            try {
                multipartFile.transferTo(desFile);
            }catch (IllegalStateException | IOException e){
                e.printStackTrace();
                return null;
            }
            list.add("http://101.133.228.179:8080/pointpayment/pic/"+ name);
        }
        return list;
    }
}
