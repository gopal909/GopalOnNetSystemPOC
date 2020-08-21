
package com.gopal.gopalonnetsystemtest.Model.CategoryContent;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContentInformation {

    @SerializedName("subCategoryId")
    @Expose
    private String subCategoryId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("thumbnailInformation")
    @Expose
    private List<ThumbnailInformation> thumbnailInformation = null;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("numberOfChildren")
    @Expose
    private Integer numberOfChildren;
    @SerializedName("sequenceNumber")
    @Expose
    private Integer sequenceNumber;
    @SerializedName("childrenInfo")
    @Expose
    private Object childrenInfo;
    @SerializedName("contentType")
    @Expose
    private Integer contentType;
    @SerializedName("displayOrientation")
    @Expose
    private Integer displayOrientation;
    @SerializedName("subCategoryDisplayTags")
    @Expose
    private List<String> subCategoryDisplayTags = null;
    @SerializedName("contentDuration")
    @Expose
    private Integer contentDuration;
    @SerializedName("favourite")
    @Expose
    private Boolean favourite;

    public String getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(String subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ThumbnailInformation> getThumbnailInformation() {
        return thumbnailInformation;
    }

    public void setThumbnailInformation(List<ThumbnailInformation> thumbnailInformation) {
        this.thumbnailInformation = thumbnailInformation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Object getChildrenInfo() {
        return childrenInfo;
    }

    public void setChildrenInfo(Object childrenInfo) {
        this.childrenInfo = childrenInfo;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public Integer getDisplayOrientation() {
        return displayOrientation;
    }

    public void setDisplayOrientation(Integer displayOrientation) {
        this.displayOrientation = displayOrientation;
    }

    public List<String> getSubCategoryDisplayTags() {
        return subCategoryDisplayTags;
    }

    public void setSubCategoryDisplayTags(List<String> subCategoryDisplayTags) {
        this.subCategoryDisplayTags = subCategoryDisplayTags;
    }

    public Integer getContentDuration() {
        return contentDuration;
    }

    public void setContentDuration(Integer contentDuration) {
        this.contentDuration = contentDuration;
    }

    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

}
