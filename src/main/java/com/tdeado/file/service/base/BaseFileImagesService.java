package com.tdeado.file.service.base;

import com.tdeado.file.entity.FileImages;
import com.github.pagehelper.PageInfo;

public interface BaseFileImagesService {
    FileImages addFileImages(FileImages obj);
    FileImages editFileImages(FileImages obj);
    PageInfo<FileImages> getFileImagesList(int page, int size, FileImages obj);
    FileImages getFileImages(FileImages obj);
    boolean delFileImages(int id);
}
