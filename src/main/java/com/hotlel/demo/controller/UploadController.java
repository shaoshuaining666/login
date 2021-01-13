package com.hotlel.demo.controller;
import com.hotlel.demo.enums.HotelEnum;
import com.hotlel.demo.util.R;
import com.hotlel.demo.util.RandomUtil;
import com.hotlel.demo.util.UploadUtil;
import com.hotlel.demo.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.hotlel.demo.constant.HotelConstant.APK_UPLOAD_SIZE;
import static com.hotlel.demo.constant.HotelConstant.MAX_UPLOAD_SIZE;


@RestController
@RequestMapping("/upload")
@Slf4j
public class UploadController {
    private final String PIC_DIR = "images";
    private final String APK_DIR = "apks";
    private final String APK_TYPE_NAME = ".apk";
    @Autowired
    private UploadUtil uploadUtil;
    @Value("${upload.pic.types}")
    private String types;

    @PostMapping("/pic")
    public ResultVO pic(MultipartFile file) throws IOException {
        //1. 是否非null.
        if (file == null) {
            log.info("【上传图片】 图片不能为null!!!");
            R.error(HotelEnum.PIC_EXISTS);
        }
        //2. 校验大小.
        if (file.getSize() > MAX_UPLOAD_SIZE) {
            //记录日志返回.
            log.info("【上传图片】 图片过大!!!");
            R.error(HotelEnum.PIC_TOO_BIG);
        }
        //3. 校验类型.
        boolean flag = false;

        String[] typesArray = types.split(",");
        for (String type : typesArray) {
            if (StringUtils.endsWithIgnoreCase(file.getOriginalFilename(), type)) {
                // 类型匹配.
                flag = true;
                break;
            }
        }

        if (!flag) {
            // 记录日志,返回结果
            log.info("【上传图片】 图片类型不正确!");
            R.error(HotelEnum.PIC_TYPE_ERROR);
        }

        //4. 是否损坏
        BufferedImage image = ImageIO.read(file.getInputStream());
        if (image == null) {
            // 记录日志,返回结果
            log.info("【上传图片】 图片已损坏!!");
            R.error(HotelEnum.PIC_ALREADY_BROKEN);
        }
        //5. 起个新名字
        String newName = RandomUtil.random() + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        //调用阿里云的appOs存储图片
        String url = uploadUtil.uploadPic(PIC_DIR + "/" + newName, file.getInputStream());
        //响应数据
        //7. 响应数据.
        Map<String, String> data = new HashMap<>();
        data.put("src", url);
        return R.ok(data);
    }

    @PostMapping("/apk")
    public ResultVO apk(MultipartFile file) throws IOException {
        //检验是否为空
        if (file == null) {
            log.info("【apk文件为空】");
            return R.error(HotelEnum.APK_EXIST);
        }
        //检验大小
        if (file.getSize() > APK_UPLOAD_SIZE) {
            log.info("apk文件过大");
            return R.error(HotelEnum.APK_BIG);
        }
        //检验类型
        if (!StringUtils.endsWithIgnoreCase(file.getOriginalFilename(), APK_TYPE_NAME)) {
            log.info("类型不匹配");
            return R.error(HotelEnum.APK_TYPE);
        }
        //4. 起个新名字.
        String apkName = RandomUtil.random() + APK_TYPE_NAME;
        //保存到OSS上
        String src = uploadUtil.uploadPic(APK_DIR + "/" + apkName, file.getInputStream());
        //6. 响应.
        Map<String, String> data = new HashMap<>();
        data.put("src", src);
        return R.ok(data);

    }

}

