
package com.gopal.gopalonnetsystemtest.Model.CategoryContent;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ThumbnailInformation_ {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("orient")
    @Expose
    private Integer orient;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getOrient() {
        return orient;
    }

    public void setOrient(Integer orient) {
        this.orient = orient;
    }

}
