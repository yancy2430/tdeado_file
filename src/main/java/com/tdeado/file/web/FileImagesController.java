package com.tdeado.file.web;

import com.tdeado.file.entity.FileImages;
import com.tdeado.file.handler.FileException;
import com.tdeado.file.utils.ImageUtils;
import com.tdeado.file.utils.Ret;
import com.tdeado.file.web.base.BaseFileImagesController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@RestController
@RequestMapping("/")
public class FileImagesController extends BaseFileImagesController {

    @Value("${img.directory}")
    private String directory;
    @Value("${img.domain}")
    private String domain;
    @PutMapping("/uploadMultipartImage")
    public Ret uploadMultipartImage(@RequestParam("files") MultipartFile[] multipartFile) {
        return Ret.ok(null);
    }
    @PutMapping("/uploadSingleImage")
    public Ret uploadSingleImage(@RequestParam("file") MultipartFile multipartFile) {
        String suffix = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf(".") + 1);
        if (multipartFile.isEmpty() || StringUtils.isBlank(multipartFile.getOriginalFilename())) {
            throw new FileException("请选择文件");
        }
        //获取路径
        String fileName = null;
        try {
            BufferedImage image = ImageIO.read(multipartFile.getInputStream());
            if (image == null) {//如果image=null 表示上传的不是图片格式
                throw new FileException("图片格式不正确");
            }
            String ymd = new SimpleDateFormat("yyyy/MM/dd/").format(new Date());
            String path=directory+ymd;
            fileName = ImageUtils.saveImg(multipartFile, path,suffix);
            FileImages images = new FileImages();
            images.setCreateTime(LocalDateTime.now());
            images.setUpdateTime(LocalDateTime.now());
            images.setPath(ymd+fileName);
            images.setAddress(domain+ymd+fileName);
            images.setSize((int) (multipartFile.getSize()/1024));
            images.setFilename(fileName);
            images.setType(multipartFile.getContentType());
            images.setWidth(image.getWidth());
            images.setHeight(image.getHeight());
            return Ret.ok(service.addFileImages(images));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Ret.err("上传失败");
    }
}
