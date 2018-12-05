package com.tdeado.file.web.base;

import com.github.pagehelper.PageInfo;
import com.tdeado.file.entity.FileImages;
import com.tdeado.file.service.FileImagesService;
import com.tdeado.file.utils.Ret;
import com.tdeado.file.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class BaseFileImagesController extends BaseController {

    @Autowired
    protected FileImagesService service;

    @RequestMapping(value = "FileImages/add", method = {RequestMethod.POST})
    protected Ret add(@RequestBody FileImages obj) {
        return Ret.ok(service.addFileImages(obj));
    }

    @RequestMapping(value = "FileImages/list", method = {RequestMethod.POST})
    protected Ret list(@RequestBody FileImages obj, int page, int size) {
        PageInfo<FileImages> list = service.getFileImagesList(page, size, obj);
    return Ret.ok(list);
    }

    @RequestMapping(value = "FileImages/item", method = {RequestMethod.POST})
    protected Ret item(@RequestBody FileImages obj) {
        return Ret.ok(service.getFileImages(obj));
    }

    @RequestMapping(value = "FileImages/dels", method = {RequestMethod.POST})
    protected Ret dels(@RequestBody int[] obj) {
        int b = 0;
        for (int i : obj) {
            if (service.delFileImages(i)){
                b++;
            }
        }
        return Ret.ok("成功"+b+"条,失败"+(obj.length-b));
    }
}
