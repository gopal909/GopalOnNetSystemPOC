package com.gopal.gopalonnetsystemtest.Model.AssetInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Content {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("customerId")
    @Expose
    private Object customerId;
    @SerializedName("providerId")
    @Expose
    private Object providerId;
    @SerializedName("assetTitle")
    @Expose
    private String assetTitle;
    @SerializedName("assetSearchTags")
    @Expose
    private List<String> assetSearchTags = null;
    @SerializedName("assetDisplayTags")
    @Expose
    private List<String> assetDisplayTags = null;
    @SerializedName("shortDescription")
    @Expose
    private String shortDescription;
    @SerializedName("longDescription")
    @Expose
    private Object longDescription;
    @SerializedName("contentDuration")
    @Expose
    private Integer contentDuration;
    @SerializedName("categoryInformation")
    @Expose
    private List<Object> categoryInformation = null;
    @SerializedName("thumbnailInformation")
    @Expose
    private List<ThumbnailInformation_> thumbnailInformation = null;
    @SerializedName("contentSizeInBytes")
    @Expose
    private Integer contentSizeInBytes;
    @SerializedName("assetStatus")
    @Expose
    private Integer assetStatus;
    @SerializedName("subtitleInformation")
    @Expose
    private List<Object> subtitleInformation = null;
    @SerializedName("uploadProgressStatus")
    @Expose
    private Integer uploadProgressStatus;
    @SerializedName("transcodeProgressStatus")
    @Expose
    private Integer transcodeProgressStatus;
    @SerializedName("uploadStatus")
    @Expose
    private Integer uploadStatus;
    @SerializedName("uploadStatusMessage")
    @Expose
    private Object uploadStatusMessage;
    @SerializedName("transcodeStatus")
    @Expose
    private Integer transcodeStatus;
    @SerializedName("transcodeStatusMessage")
    @Expose
    private Object transcodeStatusMessage;
    @SerializedName("uploadedBy")
    @Expose
    private Object uploadedBy;
    @SerializedName("scheduleStartDate")
    @Expose
    private String scheduleStartDate;
    @SerializedName("scheduleEndDate")
    @Expose
    private Object scheduleEndDate;
    @SerializedName("bannerUrl")
    @Expose
    private List<BannerUrl_> bannerUrl = null;
    @SerializedName("imageGallery")
    @Expose
    private List<ImageGallery_> imageGallery = null;
    @SerializedName("videoGallery")
    @Expose
    private List<Object> videoGallery = null;
    @SerializedName("transcodingProfile")
    @Expose
    private Object transcodingProfile;
    @SerializedName("transcodingDetails")
    @Expose
    private List<Object> transcodingDetails = null;
    @SerializedName("previewUrl")
    @Expose
    private String previewUrl;
    @SerializedName("assetType")
    @Expose
    private String assetType;
    @SerializedName("createdDate")
    @Expose
    private String createdDate;
    @SerializedName("updatedDate")
    @Expose
    private String updatedDate;
    @SerializedName("deleteAssets")
    @Expose
    private Object deleteAssets;
    @SerializedName("categoryList")
    @Expose
    private Object categoryList;
    @SerializedName("contentType")
    @Expose
    private Integer contentType;
    @SerializedName("favourite")
    @Expose
    private Boolean favourite;

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

    public Object getProviderId() {
        return providerId;
    }

    public void setProviderId(Object providerId) {
        this.providerId = providerId;
    }

    public String getAssetTitle() {
        return assetTitle;
    }

    public void setAssetTitle(String assetTitle) {
        this.assetTitle = assetTitle;
    }

    public List<String> getAssetSearchTags() {
        return assetSearchTags;
    }

    public void setAssetSearchTags(List<String> assetSearchTags) {
        this.assetSearchTags = assetSearchTags;
    }

    public List<String> getAssetDisplayTags() {
        return assetDisplayTags;
    }

    public void setAssetDisplayTags(List<String> assetDisplayTags) {
        this.assetDisplayTags = assetDisplayTags;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Object getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(Object longDescription) {
        this.longDescription = longDescription;
    }

    public Integer getContentDuration() {
        return contentDuration;
    }

    public void setContentDuration(Integer contentDuration) {
        this.contentDuration = contentDuration;
    }

    public List<Object> getCategoryInformation() {
        return categoryInformation;
    }

    public void setCategoryInformation(List<Object> categoryInformation) {
        this.categoryInformation = categoryInformation;
    }

    public List<ThumbnailInformation_> getThumbnailInformation() {
        return thumbnailInformation;
    }

    public void setThumbnailInformation(List<ThumbnailInformation_> thumbnailInformation) {
        this.thumbnailInformation = thumbnailInformation;
    }

    public Integer getContentSizeInBytes() {
        return contentSizeInBytes;
    }

    public void setContentSizeInBytes(Integer contentSizeInBytes) {
        this.contentSizeInBytes = contentSizeInBytes;
    }

    public Integer getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(Integer assetStatus) {
        this.assetStatus = assetStatus;
    }

    public List<Object> getSubtitleInformation() {
        return subtitleInformation;
    }

    public void setSubtitleInformation(List<Object> subtitleInformation) {
        this.subtitleInformation = subtitleInformation;
    }

    public Integer getUploadProgressStatus() {
        return uploadProgressStatus;
    }

    public void setUploadProgressStatus(Integer uploadProgressStatus) {
        this.uploadProgressStatus = uploadProgressStatus;
    }

    public Integer getTranscodeProgressStatus() {
        return transcodeProgressStatus;
    }

    public void setTranscodeProgressStatus(Integer transcodeProgressStatus) {
        this.transcodeProgressStatus = transcodeProgressStatus;
    }

    public Integer getUploadStatus() {
        return uploadStatus;
    }

    public void setUploadStatus(Integer uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    public Object getUploadStatusMessage() {
        return uploadStatusMessage;
    }

    public void setUploadStatusMessage(Object uploadStatusMessage) {
        this.uploadStatusMessage = uploadStatusMessage;
    }

    public Integer getTranscodeStatus() {
        return transcodeStatus;
    }

    public void setTranscodeStatus(Integer transcodeStatus) {
        this.transcodeStatus = transcodeStatus;
    }

    public Object getTranscodeStatusMessage() {
        return transcodeStatusMessage;
    }

    public void setTranscodeStatusMessage(Object transcodeStatusMessage) {
        this.transcodeStatusMessage = transcodeStatusMessage;
    }

    public Object getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(Object uploadedBy) {
        this.uploadedBy = uploadedBy;
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

    public Object getTranscodingProfile() {
        return transcodingProfile;
    }

    public void setTranscodingProfile(Object transcodingProfile) {
        this.transcodingProfile = transcodingProfile;
    }

    public List<Object> getTranscodingDetails() {
        return transcodingDetails;
    }

    public void setTranscodingDetails(List<Object> transcodingDetails) {
        this.transcodingDetails = transcodingDetails;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
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

    public Object getDeleteAssets() {
        return deleteAssets;
    }

    public void setDeleteAssets(Object deleteAssets) {
        this.deleteAssets = deleteAssets;
    }

    public Object getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(Object categoryList) {
        this.categoryList = categoryList;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

}
