package com.gopal.gopalonnetsystemtest.Model.AssetInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("pageNumber")
    @Expose
    private String pageNumber;
    @SerializedName("pageSize")
    @Expose
    private String pageSize;
    @SerializedName("relatedContents")
    @Expose
    private List<RelatedContent> relatedContents = null;
    @SerializedName("searchKeyword")
    @Expose
    private String searchKeyword;
    @SerializedName("isFavourite")
    @Expose
    private Boolean isFavourite;
    @SerializedName("content")
    @Expose
    private Content content;

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public List<RelatedContent> getRelatedContents() {
        return relatedContents;
    }

    public void setRelatedContents(List<RelatedContent> relatedContents) {
        this.relatedContents = relatedContents;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

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
