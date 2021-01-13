package com.hotlel.demo.util;
import com.aliyun.oss.OSSClient;
import com.hotlel.demo.properties.AliyunProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class UploadUtil {

    @Autowired
    private AliyunProperties aliyunProperties;

    public String uploadPic(String key, InputStream inputStream){
        OSSClient client = null;
        try {
            client = new OSSClient(aliyunProperties.getEndpoint(), aliyunProperties.getAccessKeyId(),aliyunProperties.getAccessKeySecret());

            // 1. 保存
            client.putObject(aliyunProperties.getBucketName(), key, inputStream);

            // 2. 生成文件的保存时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = sdf.parse(aliyunProperties.getExpire());
            } catch (ParseException e) {
                e.printStackTrace();
            }

            // 3. 获取访问路径
            URL url = client.generatePresignedUrl(aliyunProperties.getBucketName(), key, date);


            // 4. 返回访问路径
            return url.toString();
        } finally {
            client.shutdown();
        }

    }

}
