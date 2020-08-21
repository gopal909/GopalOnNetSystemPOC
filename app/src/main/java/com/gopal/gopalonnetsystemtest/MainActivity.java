package com.gopal.gopalonnetsystemtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

import com.gopal.gopalonnetsystemtest.API.Api;
import com.gopal.gopalonnetsystemtest.API.ClientApi;
import com.gopal.gopalonnetsystemtest.Activity.AssetInfoActivity;
import com.gopal.gopalonnetsystemtest.Adapter.CategoryInfoAdapter;
import com.gopal.gopalonnetsystemtest.Model.BodyID;
import com.gopal.gopalonnetsystemtest.Model.CategoryContent.CategoryInfo;
import com.gopal.gopalonnetsystemtest.Model.CategoryContent.ContentInformation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements CategoryInfoAdapter.AdapterCallback {

    private RecyclerView recyclerViewCategory;
    private List<ContentInformation> contentInformationList;
    CategoryInfoAdapter adapter;
    public Toolbar mTopToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTopToolbar = (Toolbar) findViewById(R.id.my_toolbar);

        mTopToolbar.setTitleMarginStart(10);

        contentInformationList = new ArrayList<>();
        recyclerViewCategory = (RecyclerView) findViewById(R.id.recyclerViewCategory);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerViewCategory.setLayoutManager(mLayoutManager);
        recyclerViewCategory.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(5), true));
        recyclerViewCategory.setItemAnimator(new DefaultItemAnimator());

        getCATEGORY_INFO_CALL();
    }


    public void getCATEGORY_INFO_CALL() {
        BodyID bodyID = new BodyID("5dcb8fb00f17b256086c7edc");
       ClientApi.getService().CATEGORY_INFO_CALL(bodyID).enqueue(new Callback<CategoryInfo>() {
           @Override
           public void onResponse(Call<CategoryInfo> call, retrofit2.Response<CategoryInfo> response) {
               if (response.isSuccessful()){
                   if (response.body() !=null){
                       contentInformationList = response.body().getData().getContent().getContentInformation();

                       mTopToolbar.setTitle(response.body().getData().getContent().getCategoryName());
                       setSupportActionBar(mTopToolbar);

                   }
               }

               adapter = new CategoryInfoAdapter(MainActivity.this, contentInformationList);
               recyclerViewCategory.setAdapter(adapter);
               adapter.notifyDataSetChanged();
               Log.e("contentInformationList", contentInformationList.size() + "");

           }

           @Override
            public void onFailure(Call<CategoryInfo> call, Throwable t) {

            }
        });
    }


    @Override
    public void respond(String strID) {
        Intent i = new Intent(MainActivity.this, AssetInfoActivity.class);
        i.putExtra("ID", strID);
        startActivity(i);
    }


    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

}