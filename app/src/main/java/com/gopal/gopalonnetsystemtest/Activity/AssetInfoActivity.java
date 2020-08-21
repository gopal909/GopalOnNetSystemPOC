package com.gopal.gopalonnetsystemtest.Activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.gopal.gopalonnetsystemtest.API.ClientApi;
import com.gopal.gopalonnetsystemtest.Model.AssetInfo.AssetInfo;
import com.gopal.gopalonnetsystemtest.Model.AssetInfo.Content;
import com.gopal.gopalonnetsystemtest.Model.BodyID;
import com.gopal.gopalonnetsystemtest.R;
import com.jarvanmo.exoplayerview.extension.MultiQualitySelectorAdapter;
import com.jarvanmo.exoplayerview.media.ExoMediaSource;
import com.jarvanmo.exoplayerview.media.SimpleMediaSource;
import com.jarvanmo.exoplayerview.media.SimpleQuality;
import com.jarvanmo.exoplayerview.ui.ExoVideoView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.jarvanmo.exoplayerview.orientation.OnOrientationChangedListener.SENSOR_LANDSCAPE;
import static com.jarvanmo.exoplayerview.orientation.OnOrientationChangedListener.SENSOR_PORTRAIT;

public class AssetInfoActivity extends AppCompatActivity {


    private ExoVideoView videoView;
    private String strID = "";
    private List<Content> contentList;
    public Toolbar mTopToolbar;
    private String strURL = "", strName = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assetinfo);


        mTopToolbar = (Toolbar) findViewById(R.id.my_toolbar);

        mTopToolbar.setTitleMarginStart(10);
        videoView = findViewById(R.id.videoView);
        contentList = new ArrayList<>();
        Intent i = getIntent();
        strID = i.getStringExtra("ID");
        getASSET_INFO_CALL();

    }


    public void getASSET_INFO_CALL() {

        final BodyID bodyID = new BodyID(strID);
        ClientApi.getService().ASSET_INFO_CALL(bodyID).enqueue(new Callback<AssetInfo>() {
            @Override
            public void onResponse(Call<AssetInfo> call, Response<AssetInfo> response) {

                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        strURL = response.body().getData().getContent().getPreviewUrl();
                        strName =  response.body().getData().getContent().getAssetTitle();
                        mTopToolbar.setTitle(strName);
                        setSupportActionBar(mTopToolbar);

                        initVideoView();
                       // loadVideo();
                    }
                }
            }

            @Override
            public void onFailure(Call<AssetInfo> call, Throwable t) {

            }
        });
    }

    private void initVideoView() {
        videoView.setPortrait(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT);
        videoView.setBackListener((view, isPortrait) -> {
            if (isPortrait) {
                finish();
            }
            return false;
        });

        videoView.setOrientationListener(orientation -> {
            if (orientation == SENSOR_PORTRAIT) {
                changeToPortrait();
            } else if (orientation == SENSOR_LANDSCAPE) {
                changeToLandscape();
            }
        });


        SimpleMediaSource mediaSource = new SimpleMediaSource(strURL);
        mediaSource.setDisplayName(strName);

        //demo only,not real multi quality, urls are the same actually
        List<ExoMediaSource.Quality> qualities = new ArrayList<>();
        ExoMediaSource.Quality quality;
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.YELLOW);
        SpannableString spannableString = new SpannableString("1080p");
        spannableString.setSpan(colorSpan, 0, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        quality = new SimpleQuality(spannableString, mediaSource.uri());
        qualities.add(quality);

        spannableString = new SpannableString("720p");
        colorSpan = new ForegroundColorSpan(Color.LTGRAY);
        spannableString.setSpan(colorSpan, 0, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        quality = new SimpleQuality(spannableString, mediaSource.uri());
        qualities.add(quality);

        mediaSource.setQualities(qualities);
        videoView.play(mediaSource, false);

    }

    private void changeToPortrait() {

        // WindowManager operation is not necessary
        WindowManager.LayoutParams attr = getWindow().getAttributes();
//        attr.flags &= (~WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Window window = getWindow();
        window.setAttributes(attr);
        window.clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        //wrapper.setVisibility(View.VISIBLE);
    }


    private void changeToLandscape() {

        // WindowManager operation is not necessary

        WindowManager.LayoutParams lp = getWindow().getAttributes();
//        lp.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        Window window = getWindow();
        window.setAttributes(lp);
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        // wrapper.setVisibility(View.GONE);
    }


    @Override
    protected void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT > 23) {
            videoView.resume();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if ((Build.VERSION.SDK_INT <= 23)) {
            videoView.resume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (Build.VERSION.SDK_INT <= 23) {
            videoView.pause();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT > 23) {
            videoView.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        videoView.releasePlayer();
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return videoView.onKeyDown(keyCode, event);
        }
        return super.onKeyDown(keyCode, event);
    }


}
