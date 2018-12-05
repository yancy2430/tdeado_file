package com.tdeado.file.service.base.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tdeado.file.dao.FileImagesMapper;
import com.tdeado.file.entity.FileImages;
import com.tdeado.file.service.FileImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public abstract class BaseFileImagesServiceImpl implements FileImagesService {
    @Autowired
    protected FileImagesMapper mapper;
    @Override
    public FileImages addFileImages(FileImages obj) {
        if (mapper.insertFileImages(obj)>0){
            return obj;
        }
        throw new RuntimeException("FileImages数据库添加失败");
    }
    @Override
    public FileImages editFileImages(FileImages obj) {
        if (mapper.updateFileImages(obj)>0){
            return obj;
        }
        throw new RuntimeException("FileImages数据库修改失败");
    }
    @Override
    public FileImages getFileImages(FileImages obj) {
        return mapper.queryFileImagesLimit1(obj);
    }

    @Override
    public PageInfo<FileImages> getFileImagesList(int page, int size, FileImages obj) {
        PageHelper.startPage(page, size);
        List<FileImages> list = mapper.queryFileImages(obj);
        PageInfo<FileImages> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @Override
    public boolean delFileImages(int id) {
        if (mapper.delFileImages(id)>0){
            return true;
        }
        return false;
    }
}
