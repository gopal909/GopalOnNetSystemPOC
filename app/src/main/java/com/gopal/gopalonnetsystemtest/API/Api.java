package com.gopal.gopalonnetsystemtest.API;

import com.gopal.gopalonnetsystemtest.Model.AssetInfo.AssetInfo;
import com.gopal.gopalonnetsystemtest.Model.BodyID;
import com.gopal.gopalonnetsystemtest.Model.CategoryContent.CategoryInfo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface Api {

    @POST("api/category/getCategoryInfoById.on")
    Call<CategoryInfo> CATEGORY_INFO_CALL(@Body BodyID bodyID);

    @POST("api/asset/getAssetInfoById.on")
    Call<AssetInfo> ASSET_INFO_CALL(@Body BodyID bodyID);


}
