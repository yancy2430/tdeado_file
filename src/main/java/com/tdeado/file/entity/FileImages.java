package com.tdeado.file.entity;

import com.tdeado.file.entity.base.BaseFileImages;
import com.tdeado.file.entity.Base;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*/
public class FileImages extends BaseFileImages {

    private static final long serialVersionUID = 1544020812307L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 图片类型
    * isNullAble:0,defaultVal:
    */
    private String type;

    /**
    * 图片路径
    * isNullAble:1
    */
    private String path;

    /**
    * 文件名
    * isNullAble:1
    */
    private String filename;

    /**
    * 图片地址
    * isNullAble:1
    */
    private String address;

    /**
    * 创建时间
    * isNullAble:0
    */
    private java.time.LocalDateTime createTime;

    /**
    * 更新时间
    * isNullAble:1
    */
    private java.time.LocalDateTime updateTime;

    /**
    * 来源
    * isNullAble:1
    */
    private String source;

    /**
    * 缩略图
    * isNullAble:1
    */
    private String thumbnail;

    /**
    * 图片大小
    * isNullAble:1
    */
    private Integer size;

    /**
    * 图片宽度
    * isNullAble:1
    */
    private Integer width;

    /**
    * 图片高度
    * isNullAble:1
    */
    private Integer height;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setType(String type){this.type = type;}

    public String getType(){return this.type;}

    public void setPath(String path){this.path = path;}

    public String getPath(){return this.path;}

    public void setFilename(String filename){this.filename = filename;}

    public String getFilename(){return this.filename;}

    public void setAddress(String address){this.address = address;}

    public String getAddress(){return this.address;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setUpdateTime(java.time.LocalDateTime updateTime){this.updateTime = updateTime;}

    public java.time.LocalDateTime getUpdateTime(){return this.updateTime;}

    public void setSource(String source){this.source = source;}

    public String getSource(){return this.source;}

    public void setThumbnail(String thumbnail){this.thumbnail = thumbnail;}

    public String getThumbnail(){return this.thumbnail;}

    public void setSize(Integer size){this.size = size;}

    public Integer getSize(){return this.size;}

    public void setWidth(Integer width){this.width = width;}

    public Integer getWidth(){return this.width;}

    public void setHeight(Integer height){this.height = height;}

    public Integer getHeight(){return this.height;}
    @Override
    public String toString() {
        return "FileImages{" +
                "id='" + id + '\'' +
                "type='" + type + '\'' +
                "path='" + path + '\'' +
                "filename='" + filename + '\'' +
                "address='" + address + '\'' +
                "createTime='" + createTime + '\'' +
                "updateTime='" + updateTime + '\'' +
                "source='" + source + '\'' +
                "thumbnail='" + thumbnail + '\'' +
                "size='" + size + '\'' +
                "width='" + width + '\'' +
                "height='" + height + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private FileImages set;

        private ConditionBuilder where;

        public UpdateBuilder set(FileImages set){
            this.set = set;
            return this;
        }

        public FileImages getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends FileImages{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> typeList;

        public List<String> getTypeList(){return this.typeList;}


        private List<String> fuzzyType;

        public List<String> getFuzzyType(){return this.fuzzyType;}

        private List<String> rightFuzzyType;

        public List<String> getRightFuzzyType(){return this.rightFuzzyType;}
        private List<String> pathList;

        public List<String> getPathList(){return this.pathList;}


        private List<String> fuzzyPath;

        public List<String> getFuzzyPath(){return this.fuzzyPath;}

        private List<String> rightFuzzyPath;

        public List<String> getRightFuzzyPath(){return this.rightFuzzyPath;}
        private List<String> filenameList;

        public List<String> getFilenameList(){return this.filenameList;}


        private List<String> fuzzyFilename;

        public List<String> getFuzzyFilename(){return this.fuzzyFilename;}

        private List<String> rightFuzzyFilename;

        public List<String> getRightFuzzyFilename(){return this.rightFuzzyFilename;}
        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<String> sourceList;

        public List<String> getSourceList(){return this.sourceList;}


        private List<String> fuzzySource;

        public List<String> getFuzzySource(){return this.fuzzySource;}

        private List<String> rightFuzzySource;

        public List<String> getRightFuzzySource(){return this.rightFuzzySource;}
        private List<String> thumbnailList;

        public List<String> getThumbnailList(){return this.thumbnailList;}


        private List<String> fuzzyThumbnail;

        public List<String> getFuzzyThumbnail(){return this.fuzzyThumbnail;}

        private List<String> rightFuzzyThumbnail;

        public List<String> getRightFuzzyThumbnail(){return this.rightFuzzyThumbnail;}
        private List<Integer> sizeList;

        public List<Integer> getSizeList(){return this.sizeList;}

        private Integer sizeSt;

        private Integer sizeEd;

        public Integer getSizeSt(){return this.sizeSt;}

        public Integer getSizeEd(){return this.sizeEd;}

        private List<Integer> widthList;

        public List<Integer> getWidthList(){return this.widthList;}

        private Integer widthSt;

        private Integer widthEd;

        public Integer getWidthSt(){return this.widthSt;}

        public Integer getWidthEd(){return this.widthEd;}

        private List<Integer> heightList;

        public List<Integer> getHeightList(){return this.heightList;}

        private Integer heightSt;

        private Integer heightEd;

        public Integer getHeightSt(){return this.heightSt;}

        public Integer getHeightEd(){return this.heightEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyType (List<String> fuzzyType){
            this.fuzzyType = fuzzyType;
            return this;
        }

        public QueryBuilder fuzzyType (String ... fuzzyType){
            this.fuzzyType = solveNullList(fuzzyType);
            return this;
        }

        public QueryBuilder rightFuzzyType (List<String> rightFuzzyType){
            this.rightFuzzyType = rightFuzzyType;
            return this;
        }

        public QueryBuilder rightFuzzyType (String ... rightFuzzyType){
            this.rightFuzzyType = solveNullList(rightFuzzyType);
            return this;
        }

        public QueryBuilder type(String type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(String ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<String> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }

        public QueryBuilder fuzzyPath (List<String> fuzzyPath){
            this.fuzzyPath = fuzzyPath;
            return this;
        }

        public QueryBuilder fuzzyPath (String ... fuzzyPath){
            this.fuzzyPath = solveNullList(fuzzyPath);
            return this;
        }

        public QueryBuilder rightFuzzyPath (List<String> rightFuzzyPath){
            this.rightFuzzyPath = rightFuzzyPath;
            return this;
        }

        public QueryBuilder rightFuzzyPath (String ... rightFuzzyPath){
            this.rightFuzzyPath = solveNullList(rightFuzzyPath);
            return this;
        }

        public QueryBuilder path(String path){
            setPath(path);
            return this;
        }

        public QueryBuilder pathList(String ... path){
            this.pathList = solveNullList(path);
            return this;
        }

        public QueryBuilder pathList(List<String> path){
            this.pathList = path;
            return this;
        }

        public QueryBuilder fetchPath(){
            setFetchFields("fetchFields","path");
            return this;
        }

        public QueryBuilder excludePath(){
            setFetchFields("excludeFields","path");
            return this;
        }

        public QueryBuilder fuzzyFilename (List<String> fuzzyFilename){
            this.fuzzyFilename = fuzzyFilename;
            return this;
        }

        public QueryBuilder fuzzyFilename (String ... fuzzyFilename){
            this.fuzzyFilename = solveNullList(fuzzyFilename);
            return this;
        }

        public QueryBuilder rightFuzzyFilename (List<String> rightFuzzyFilename){
            this.rightFuzzyFilename = rightFuzzyFilename;
            return this;
        }

        public QueryBuilder rightFuzzyFilename (String ... rightFuzzyFilename){
            this.rightFuzzyFilename = solveNullList(rightFuzzyFilename);
            return this;
        }

        public QueryBuilder filename(String filename){
            setFilename(filename);
            return this;
        }

        public QueryBuilder filenameList(String ... filename){
            this.filenameList = solveNullList(filename);
            return this;
        }

        public QueryBuilder filenameList(List<String> filename){
            this.filenameList = filename;
            return this;
        }

        public QueryBuilder fetchFilename(){
            setFetchFields("fetchFields","filename");
            return this;
        }

        public QueryBuilder excludeFilename(){
            setFetchFields("excludeFields","filename");
            return this;
        }

        public QueryBuilder fuzzyAddress (List<String> fuzzyAddress){
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public QueryBuilder fuzzyAddress (String ... fuzzyAddress){
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public QueryBuilder rightFuzzyAddress (List<String> rightFuzzyAddress){
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public QueryBuilder rightFuzzyAddress (String ... rightFuzzyAddress){
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public QueryBuilder address(String address){
            setAddress(address);
            return this;
        }

        public QueryBuilder addressList(String ... address){
            this.addressList = solveNullList(address);
            return this;
        }

        public QueryBuilder addressList(List<String> address){
            this.addressList = address;
            return this;
        }

        public QueryBuilder fetchAddress(){
            setFetchFields("fetchFields","address");
            return this;
        }

        public QueryBuilder excludeAddress(){
            setFetchFields("excludeFields","address");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.time.LocalDateTime updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }

        public QueryBuilder fuzzySource (List<String> fuzzySource){
            this.fuzzySource = fuzzySource;
            return this;
        }

        public QueryBuilder fuzzySource (String ... fuzzySource){
            this.fuzzySource = solveNullList(fuzzySource);
            return this;
        }

        public QueryBuilder rightFuzzySource (List<String> rightFuzzySource){
            this.rightFuzzySource = rightFuzzySource;
            return this;
        }

        public QueryBuilder rightFuzzySource (String ... rightFuzzySource){
            this.rightFuzzySource = solveNullList(rightFuzzySource);
            return this;
        }

        public QueryBuilder source(String source){
            setSource(source);
            return this;
        }

        public QueryBuilder sourceList(String ... source){
            this.sourceList = solveNullList(source);
            return this;
        }

        public QueryBuilder sourceList(List<String> source){
            this.sourceList = source;
            return this;
        }

        public QueryBuilder fetchSource(){
            setFetchFields("fetchFields","source");
            return this;
        }

        public QueryBuilder excludeSource(){
            setFetchFields("excludeFields","source");
            return this;
        }

        public QueryBuilder fuzzyThumbnail (List<String> fuzzyThumbnail){
            this.fuzzyThumbnail = fuzzyThumbnail;
            return this;
        }

        public QueryBuilder fuzzyThumbnail (String ... fuzzyThumbnail){
            this.fuzzyThumbnail = solveNullList(fuzzyThumbnail);
            return this;
        }

        public QueryBuilder rightFuzzyThumbnail (List<String> rightFuzzyThumbnail){
            this.rightFuzzyThumbnail = rightFuzzyThumbnail;
            return this;
        }

        public QueryBuilder rightFuzzyThumbnail (String ... rightFuzzyThumbnail){
            this.rightFuzzyThumbnail = solveNullList(rightFuzzyThumbnail);
            return this;
        }

        public QueryBuilder thumbnail(String thumbnail){
            setThumbnail(thumbnail);
            return this;
        }

        public QueryBuilder thumbnailList(String ... thumbnail){
            this.thumbnailList = solveNullList(thumbnail);
            return this;
        }

        public QueryBuilder thumbnailList(List<String> thumbnail){
            this.thumbnailList = thumbnail;
            return this;
        }

        public QueryBuilder fetchThumbnail(){
            setFetchFields("fetchFields","thumbnail");
            return this;
        }

        public QueryBuilder excludeThumbnail(){
            setFetchFields("excludeFields","thumbnail");
            return this;
        }

        public QueryBuilder sizeBetWeen(Integer sizeSt,Integer sizeEd){
            this.sizeSt = sizeSt;
            this.sizeEd = sizeEd;
            return this;
        }

        public QueryBuilder sizeGreaterEqThan(Integer sizeSt){
            this.sizeSt = sizeSt;
            return this;
        }
        public QueryBuilder sizeLessEqThan(Integer sizeEd){
            this.sizeEd = sizeEd;
            return this;
        }


        public QueryBuilder size(Integer size){
            setSize(size);
            return this;
        }

        public QueryBuilder sizeList(Integer ... size){
            this.sizeList = solveNullList(size);
            return this;
        }

        public QueryBuilder sizeList(List<Integer> size){
            this.sizeList = size;
            return this;
        }

        public QueryBuilder fetchSize(){
            setFetchFields("fetchFields","size");
            return this;
        }

        public QueryBuilder excludeSize(){
            setFetchFields("excludeFields","size");
            return this;
        }

        public QueryBuilder widthBetWeen(Integer widthSt,Integer widthEd){
            this.widthSt = widthSt;
            this.widthEd = widthEd;
            return this;
        }

        public QueryBuilder widthGreaterEqThan(Integer widthSt){
            this.widthSt = widthSt;
            return this;
        }
        public QueryBuilder widthLessEqThan(Integer widthEd){
            this.widthEd = widthEd;
            return this;
        }


        public QueryBuilder width(Integer width){
            setWidth(width);
            return this;
        }

        public QueryBuilder widthList(Integer ... width){
            this.widthList = solveNullList(width);
            return this;
        }

        public QueryBuilder widthList(List<Integer> width){
            this.widthList = width;
            return this;
        }

        public QueryBuilder fetchWidth(){
            setFetchFields("fetchFields","width");
            return this;
        }

        public QueryBuilder excludeWidth(){
            setFetchFields("excludeFields","width");
            return this;
        }

        public QueryBuilder heightBetWeen(Integer heightSt,Integer heightEd){
            this.heightSt = heightSt;
            this.heightEd = heightEd;
            return this;
        }

        public QueryBuilder heightGreaterEqThan(Integer heightSt){
            this.heightSt = heightSt;
            return this;
        }
        public QueryBuilder heightLessEqThan(Integer heightEd){
            this.heightEd = heightEd;
            return this;
        }


        public QueryBuilder height(Integer height){
            setHeight(height);
            return this;
        }

        public QueryBuilder heightList(Integer ... height){
            this.heightList = solveNullList(height);
            return this;
        }

        public QueryBuilder heightList(List<Integer> height){
            this.heightList = height;
            return this;
        }

        public QueryBuilder fetchHeight(){
            setFetchFields("fetchFields","height");
            return this;
        }

        public QueryBuilder excludeHeight(){
            setFetchFields("excludeFields","height");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
    if (objs != null){
    List<T> list = new ArrayList<>();
        for (T item : objs){
        if (item != null){
        list.add(item);
        }
        }
        return list;
        }
        return null;
        }

        public QueryBuilder fetchAll(){
        this.fetchFields.put("AllFields",true);
        return this;
        }

        public QueryBuilder addField(String ... fields){
        List<String> list = new ArrayList<>();
            if (fields != null){
            for (String field : fields){
            list.add(field);
            }
            }
            this.fetchFields.put("otherFields",list);
            return this;
            }
            @SuppressWarnings("unchecked")
            private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
            fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
            }

            public FileImages build(){return this;}
            }


            public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> typeList;

        public List<String> getTypeList(){return this.typeList;}


        private List<String> fuzzyType;

        public List<String> getFuzzyType(){return this.fuzzyType;}

        private List<String> rightFuzzyType;

        public List<String> getRightFuzzyType(){return this.rightFuzzyType;}
        private List<String> pathList;

        public List<String> getPathList(){return this.pathList;}


        private List<String> fuzzyPath;

        public List<String> getFuzzyPath(){return this.fuzzyPath;}

        private List<String> rightFuzzyPath;

        public List<String> getRightFuzzyPath(){return this.rightFuzzyPath;}
        private List<String> filenameList;

        public List<String> getFilenameList(){return this.filenameList;}


        private List<String> fuzzyFilename;

        public List<String> getFuzzyFilename(){return this.fuzzyFilename;}

        private List<String> rightFuzzyFilename;

        public List<String> getRightFuzzyFilename(){return this.rightFuzzyFilename;}
        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<String> sourceList;

        public List<String> getSourceList(){return this.sourceList;}


        private List<String> fuzzySource;

        public List<String> getFuzzySource(){return this.fuzzySource;}

        private List<String> rightFuzzySource;

        public List<String> getRightFuzzySource(){return this.rightFuzzySource;}
        private List<String> thumbnailList;

        public List<String> getThumbnailList(){return this.thumbnailList;}


        private List<String> fuzzyThumbnail;

        public List<String> getFuzzyThumbnail(){return this.fuzzyThumbnail;}

        private List<String> rightFuzzyThumbnail;

        public List<String> getRightFuzzyThumbnail(){return this.rightFuzzyThumbnail;}
        private List<Integer> sizeList;

        public List<Integer> getSizeList(){return this.sizeList;}

        private Integer sizeSt;

        private Integer sizeEd;

        public Integer getSizeSt(){return this.sizeSt;}

        public Integer getSizeEd(){return this.sizeEd;}

        private List<Integer> widthList;

        public List<Integer> getWidthList(){return this.widthList;}

        private Integer widthSt;

        private Integer widthEd;

        public Integer getWidthSt(){return this.widthSt;}

        public Integer getWidthEd(){return this.widthEd;}

        private List<Integer> heightList;

        public List<Integer> getHeightList(){return this.heightList;}

        private Integer heightSt;

        private Integer heightEd;

        public Integer getHeightSt(){return this.heightSt;}

        public Integer getHeightEd(){return this.heightEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyType (List<String> fuzzyType){
            this.fuzzyType = fuzzyType;
            return this;
        }

        public ConditionBuilder fuzzyType (String ... fuzzyType){
            this.fuzzyType = solveNullList(fuzzyType);
            return this;
        }

        public ConditionBuilder rightFuzzyType (List<String> rightFuzzyType){
            this.rightFuzzyType = rightFuzzyType;
            return this;
        }

        public ConditionBuilder rightFuzzyType (String ... rightFuzzyType){
            this.rightFuzzyType = solveNullList(rightFuzzyType);
            return this;
        }

        public ConditionBuilder typeList(String ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<String> type){
            this.typeList = type;
            return this;
        }

        public ConditionBuilder fuzzyPath (List<String> fuzzyPath){
            this.fuzzyPath = fuzzyPath;
            return this;
        }

        public ConditionBuilder fuzzyPath (String ... fuzzyPath){
            this.fuzzyPath = solveNullList(fuzzyPath);
            return this;
        }

        public ConditionBuilder rightFuzzyPath (List<String> rightFuzzyPath){
            this.rightFuzzyPath = rightFuzzyPath;
            return this;
        }

        public ConditionBuilder rightFuzzyPath (String ... rightFuzzyPath){
            this.rightFuzzyPath = solveNullList(rightFuzzyPath);
            return this;
        }

        public ConditionBuilder pathList(String ... path){
            this.pathList = solveNullList(path);
            return this;
        }

        public ConditionBuilder pathList(List<String> path){
            this.pathList = path;
            return this;
        }

        public ConditionBuilder fuzzyFilename (List<String> fuzzyFilename){
            this.fuzzyFilename = fuzzyFilename;
            return this;
        }

        public ConditionBuilder fuzzyFilename (String ... fuzzyFilename){
            this.fuzzyFilename = solveNullList(fuzzyFilename);
            return this;
        }

        public ConditionBuilder rightFuzzyFilename (List<String> rightFuzzyFilename){
            this.rightFuzzyFilename = rightFuzzyFilename;
            return this;
        }

        public ConditionBuilder rightFuzzyFilename (String ... rightFuzzyFilename){
            this.rightFuzzyFilename = solveNullList(rightFuzzyFilename);
            return this;
        }

        public ConditionBuilder filenameList(String ... filename){
            this.filenameList = solveNullList(filename);
            return this;
        }

        public ConditionBuilder filenameList(List<String> filename){
            this.filenameList = filename;
            return this;
        }

        public ConditionBuilder fuzzyAddress (List<String> fuzzyAddress){
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public ConditionBuilder fuzzyAddress (String ... fuzzyAddress){
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyAddress (List<String> rightFuzzyAddress){
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyAddress (String ... rightFuzzyAddress){
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public ConditionBuilder addressList(String ... address){
            this.addressList = solveNullList(address);
            return this;
        }

        public ConditionBuilder addressList(List<String> address){
            this.addressList = address;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public ConditionBuilder fuzzySource (List<String> fuzzySource){
            this.fuzzySource = fuzzySource;
            return this;
        }

        public ConditionBuilder fuzzySource (String ... fuzzySource){
            this.fuzzySource = solveNullList(fuzzySource);
            return this;
        }

        public ConditionBuilder rightFuzzySource (List<String> rightFuzzySource){
            this.rightFuzzySource = rightFuzzySource;
            return this;
        }

        public ConditionBuilder rightFuzzySource (String ... rightFuzzySource){
            this.rightFuzzySource = solveNullList(rightFuzzySource);
            return this;
        }

        public ConditionBuilder sourceList(String ... source){
            this.sourceList = solveNullList(source);
            return this;
        }

        public ConditionBuilder sourceList(List<String> source){
            this.sourceList = source;
            return this;
        }

        public ConditionBuilder fuzzyThumbnail (List<String> fuzzyThumbnail){
            this.fuzzyThumbnail = fuzzyThumbnail;
            return this;
        }

        public ConditionBuilder fuzzyThumbnail (String ... fuzzyThumbnail){
            this.fuzzyThumbnail = solveNullList(fuzzyThumbnail);
            return this;
        }

        public ConditionBuilder rightFuzzyThumbnail (List<String> rightFuzzyThumbnail){
            this.rightFuzzyThumbnail = rightFuzzyThumbnail;
            return this;
        }

        public ConditionBuilder rightFuzzyThumbnail (String ... rightFuzzyThumbnail){
            this.rightFuzzyThumbnail = solveNullList(rightFuzzyThumbnail);
            return this;
        }

        public ConditionBuilder thumbnailList(String ... thumbnail){
            this.thumbnailList = solveNullList(thumbnail);
            return this;
        }

        public ConditionBuilder thumbnailList(List<String> thumbnail){
            this.thumbnailList = thumbnail;
            return this;
        }

        public ConditionBuilder sizeBetWeen(Integer sizeSt,Integer sizeEd){
            this.sizeSt = sizeSt;
            this.sizeEd = sizeEd;
            return this;
        }

        public ConditionBuilder sizeGreaterEqThan(Integer sizeSt){
            this.sizeSt = sizeSt;
            return this;
        }
        public ConditionBuilder sizeLessEqThan(Integer sizeEd){
            this.sizeEd = sizeEd;
            return this;
        }


        public ConditionBuilder sizeList(Integer ... size){
            this.sizeList = solveNullList(size);
            return this;
        }

        public ConditionBuilder sizeList(List<Integer> size){
            this.sizeList = size;
            return this;
        }

        public ConditionBuilder widthBetWeen(Integer widthSt,Integer widthEd){
            this.widthSt = widthSt;
            this.widthEd = widthEd;
            return this;
        }

        public ConditionBuilder widthGreaterEqThan(Integer widthSt){
            this.widthSt = widthSt;
            return this;
        }
        public ConditionBuilder widthLessEqThan(Integer widthEd){
            this.widthEd = widthEd;
            return this;
        }


        public ConditionBuilder widthList(Integer ... width){
            this.widthList = solveNullList(width);
            return this;
        }

        public ConditionBuilder widthList(List<Integer> width){
            this.widthList = width;
            return this;
        }

        public ConditionBuilder heightBetWeen(Integer heightSt,Integer heightEd){
            this.heightSt = heightSt;
            this.heightEd = heightEd;
            return this;
        }

        public ConditionBuilder heightGreaterEqThan(Integer heightSt){
            this.heightSt = heightSt;
            return this;
        }
        public ConditionBuilder heightLessEqThan(Integer heightEd){
            this.heightEd = heightEd;
            return this;
        }


        public ConditionBuilder heightList(Integer ... height){
            this.heightList = solveNullList(height);
            return this;
        }

        public ConditionBuilder heightList(List<Integer> height){
            this.heightList = height;
            return this;
        }

            private <T>List<T> solveNullList(T ... objs){
                if (objs != null){
                List<T> list = new ArrayList<>();
                    for (T item : objs){
                    if (item != null){
                    list.add(item);
                    }
                    }
                    return list;
                    }
                    return null;
                    }

                    public ConditionBuilder build(){return this;}
                    }

                    public static class Builder {

                    private FileImages obj;

                    public Builder(){
                    this.obj = new FileImages();
                    }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder type(String type){
            this.obj.setType(type);
            return this;
        }
        public Builder path(String path){
            this.obj.setPath(path);
            return this;
        }
        public Builder filename(String filename){
            this.obj.setFilename(filename);
            return this;
        }
        public Builder address(String address){
            this.obj.setAddress(address);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder updateTime(java.time.LocalDateTime updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public Builder source(String source){
            this.obj.setSource(source);
            return this;
        }
        public Builder thumbnail(String thumbnail){
            this.obj.setThumbnail(thumbnail);
            return this;
        }
        public Builder size(Integer size){
            this.obj.setSize(size);
            return this;
        }
        public Builder width(Integer width){
            this.obj.setWidth(width);
            return this;
        }
        public Builder height(Integer height){
            this.obj.setHeight(height);
            return this;
        }
                    public FileImages build(){return obj;}
                    }

}
