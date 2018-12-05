package com.tdeado.file.dao.base;

import java.util.List;
import com.tdeado.file.entity.FileImages;

/**
*  @author author
*/
public interface BaseFileImagesMapper {

    int insertFileImages(FileImages object);

    int updateFileImages(FileImages object);

    int update(FileImages.UpdateBuilder object);

    List<FileImages> queryFileImages(FileImages object);

    FileImages queryFileImagesLimit1(FileImages object);

    int delFileImages(int id);
}