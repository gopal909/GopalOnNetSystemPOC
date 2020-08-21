package com.gopal.gopalonnetsystemtest.Model.AssetInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageGallery_ {
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
