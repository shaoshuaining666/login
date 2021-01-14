package com.hotlel.demo.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;

public class FileReadName {

    public static File readFiles(MultipartFile file) {
        int n;
        File newFile = new File(file.getOriginalFilename());
        try (InputStream in = file.getInputStream(); OutputStream os = new FileOutputStream(newFile)) {
            byte[] buffer = new byte[4096];
            while ((n = in.read(buffer, 0, 4096)) != -1) {
                os.write(buffer, 0, n);
            }
        } catch (IOException e) {
            System.out.println("获取文件失败");
        }
        return newFile;
    }

}
