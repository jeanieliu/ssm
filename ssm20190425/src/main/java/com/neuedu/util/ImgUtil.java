package com.neuedu.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class ImgUtil {

    public static void onloadImg(String path, String filename, MultipartFile file) throws IOException {
        File pathfile=new File(path);
        if(!pathfile.exists()){
            pathfile.mkdir();
        }


        File newfile=new File(pathfile,filename);
        if(!newfile.exists()){
            newfile.createNewFile();
        }

        /**
         * 3：在新文件中传入数据
         */

        file.transferTo(newfile);

    }
}
