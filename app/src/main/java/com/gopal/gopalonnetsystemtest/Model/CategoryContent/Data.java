
package com.gopal.gopalonnetsystemtest.Model.CategoryContent;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("isFavourite")
    @Expose
    private Boolean isFavourite;
    @SerializedName("content")
    @Expose
    private Content content;

    public Boolean getIsFavourite() {
        return isFavourite;
    }

    public void setIsFavourite(Boolean isFavourite) {
        this.isFavourite = isFavourite;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

}
