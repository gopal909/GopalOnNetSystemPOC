package com.gopal.gopalonnetsystemtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;

import com.gopal.gopalonnetsystemtest.API.ClientApi;
import com.gopal.gopalonnetsystemtest.Activity.AssetInfoActivity;
import com.gopal.gopalonnetsystemtest.Adapter.CategoryInfoAdapter;
import com.gopal.gopalonnetsystemtest.Adapter.SliderAdapter;
import com.gopal.gopalonnetsystemtest.Model.BodyID;
import com.gopal.gopalonnetsystemtest.Model.CategoryContent.CategoryInfo;
import com.gopal.gopalonnetsystemtest.Model.CategoryContent.ContentInformation;
import com.gopal.gopalonnetsystemtest.Model.CategoryContent.ImageGallery;
import com.gopal.gopalonnetsystemtest.Model.CategoryContent.ImageGallery_;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity implements CategoryInfoAdapter.AdapterCallback {

    private RecyclerView recyclerViewCategory;
    private List<ContentInformation> contentInformationList;
    private List<ImageGallery> imageGalleryList;
    CategoryInfoAdapter adapter;
    public Toolbar mTopToolbar;
    SliderView sliderView;
    private SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTopToolbar = (Toolbar) findViewById(R.id.my_toolbar);

        mTopToolbar.setTitleMarginStart(10);

        contentInformationList = new ArrayList<>();
        imageGalleryList = new ArrayList<>();
        recyclerViewCategory = (RecyclerView) findViewById(R.id.recyclerViewCategory);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerViewCategory.setLayoutManager(mLayoutManager);
        recyclerViewCategory.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(5), true));
        recyclerViewCategory.setItemAnimator(new DefaultItemAnimator());

        sliderView = findViewById(R.id.imageSlider);


        sliderAdapter = new SliderAdapter(MainActivity.this);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_RIGHT);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();

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
                       if (response.body().getData().getContent().getAssetInformation() != null) {

                           imageGalleryList = response.body().getData().getContent().getAssetInformation().get(0).getImageGallery();

                           mTopToolbar.setTitle(response.body().getData().getContent().getCategoryName());
                           setSupportActionBar(mTopToolbar);
                       }
                   }
               }

               adapter = new CategoryInfoAdapter(MainActivity.this, contentInformationList);
               recyclerViewCategory.setAdapter(adapter);
               adapter.notifyDataSetChanged();

               sliderAdapter.renewItems(imageGalleryList);
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