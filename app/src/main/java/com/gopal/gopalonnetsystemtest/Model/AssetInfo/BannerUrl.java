package com.gopal.gopalonnetsystemtest.Model.AssetInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BannerUrl {
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("bannerId")
    @Expose
    private String bannerId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("sequenceNumber")
    @Expose
    private Integer sequenceNumber;
    @SerializedName("contentType")
    @Expose
    private Integer contentType;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

}
