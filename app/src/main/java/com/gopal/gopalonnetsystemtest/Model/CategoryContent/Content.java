
package com.gopal.gopalonnetsystemtest.Model.CategoryContent;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("customerId")
    @Expose
    private Object customerId;
    @SerializedName("categoryName")
    @Expose
    private String categoryName;
    @SerializedName("categoryType")
    @Expose
    private Integer categoryType;
    @SerializedName("categoryDescription")
    @Expose
    private String categoryDescription;
    @SerializedName("categorySearchTags")
    @Expose
    private List<String> categorySearchTags = null;
    @SerializedName("categoryDisplayTags")
    @Expose
    private List<String> categoryDisplayTags = null;
    @SerializedName("parentId")
    @Expose
    private List<Object> parentId = null;
    @SerializedName("topCategorySequenceNumber")
    @Expose
    private Integer topCategorySequenceNumber;
    @SerializedName("displayOrientation")
    @Expose
    private Integer displayOrientation;
    @SerializedName("contentInformation")
    @Expose
    private List<ContentInformation> contentInformation = null;
    @SerializedName("otherInformation")
    @Expose
    private List<Object> otherInformation = null;
    @SerializedName("assetInformation")
    @Expose
    private List<AssetInformation> assetInformation = null;
    @SerializedName("subCategoryInformation")
    @Expose
    private List<Object> subCategoryInformation = null;
    @SerializedName("seriesInformation")
    @Expose
    private List<Object> seriesInformation = null;
    @SerializedName("channelInformation")
    @Expose
    private List<Object> channelInformation = null;
    @SerializedName("thumbnailInformation")
    @Expose
    private List<ThumbnailInformation__> thumbnailInformation = null;
    @SerializedName("bannerUrl")
    @Expose
    private List<BannerUrl_> bannerUrl = null;
    @SerializedName("imageGallery")
    @Expose
    private List<ImageGallery_> imageGallery = null;
    @SerializedName("videoGallery")
    @Expose
    private List<Object> videoGallery = null;
    @SerializedName("categoryStatus")
    @Expose
    private Integer categoryStatus;
    @SerializedName("scheduleStartDate")
    @Expose
    private String scheduleStartDate;
    @SerializedName("scheduleEndDate")
    @Expose
    private Object scheduleEndDate;
    @SerializedName("createdDate")
    @Expose
    private String createdDate;
    @SerializedName("updatedDate")
    @Expose
    private String updatedDate;
    @SerializedName("deleteCategories")
    @Expose
    private Object deleteCategories;
    @SerializedName("contentType")
    @Expose
    private Integer contentType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Object customerId) {
        this.customerId = customerId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public List<String> getCategorySearchTags() {
        return categorySearchTags;
    }

    public void setCategorySearchTags(List<String> categorySearchTags) {
        this.categorySearchTags = categorySearchTags;
    }

    public List<String> getCategoryDisplayTags() {
        return categoryDisplayTags;
    }

    public void setCategoryDisplayTags(List<String> categoryDisplayTags) {
        this.categoryDisplayTags = categoryDisplayTags;
    }

    public List<Object> getParentId() {
        return parentId;
    }

    public void setParentId(List<Object> parentId) {
        this.parentId = parentId;
    }

    public Integer getTopCategorySequenceNumber() {
        return topCategorySequenceNumber;
    }

    public void setTopCategorySequenceNumber(Integer topCategorySequenceNumber) {
        this.topCategorySequenceNumber = topCategorySequenceNumber;
    }

    public Integer getDisplayOrientation() {
        return displayOrientation;
    }

    public void setDisplayOrientation(Integer displayOrientation) {
        this.displayOrientation = displayOrientation;
    }

    public List<ContentInformation> getContentInformation() {
        return contentInformation;
    }

    public void setContentInformation(List<ContentInformation> contentInformation) {
        this.contentInformation = contentInformation;
    }

    public List<Object> getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(List<Object> otherInformation) {
        this.otherInformation = otherInformation;
    }

    public List<AssetInformation> getAssetInformation() {
        return assetInformation;
    }

    public void setAssetInformation(List<AssetInformation> assetInformation) {
        this.assetInformation = assetInformation;
    }

    public List<Object> getSubCategoryInformation() {
        return subCategoryInformation;
    }

    public void setSubCategoryInformation(List<Object> subCategoryInformation) {
        this.subCategoryInformation = subCategoryInformation;
    }

    public List<Object> getSeriesInformation() {
        return seriesInformation;
    }

    public void setSeriesInformation(List<Object> seriesInformation) {
        this.seriesInformation = seriesInformation;
    }

    public List<Object> getChannelInformation() {
        return channelInformation;
    }

    public void setChannelInformation(List<Object> channelInformation) {
        this.channelInformation = channelInformation;
    }

    public List<ThumbnailInformation__> getThumbnailInformation() {
        return thumbnailInformation;
    }

    public void setThumbnailInformation(List<ThumbnailInformation__> thumbnailInformation) {
        this.thumbnailInformation = thumbnailInformation;
    }

    public List<BannerUrl_> getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(List<BannerUrl_> bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public List<ImageGallery_> getImageGallery() {
        return imageGallery;
    }

    public void setImageGallery(List<ImageGallery_> imageGallery) {
        this.imageGallery = imageGallery;
    }

    public List<Object> getVideoGallery() {
        return videoGallery;
    }

    public void setVideoGallery(List<Object> videoGallery) {
        this.videoGallery = videoGallery;
    }

    public Integer getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Integer categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public String getScheduleStartDate() {
        return scheduleStartDate;
    }

    public void setScheduleStartDate(String scheduleStartDate) {
        this.scheduleStartDate = scheduleStartDate;
    }

    public Object getScheduleEndDate() {
        return scheduleEndDate;
    }

    public void setScheduleEndDate(Object scheduleEndDate) {
        this.scheduleEndDate = scheduleEndDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Object getDeleteCategories() {
        return deleteCategories;
    }

    public void setDeleteCategories(Object deleteCategories) {
        this.deleteCategories = deleteCategories;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

}
