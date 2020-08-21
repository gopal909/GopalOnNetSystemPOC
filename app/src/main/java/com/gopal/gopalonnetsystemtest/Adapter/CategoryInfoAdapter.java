package com.gopal.gopalonnetsystemtest.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.gopal.gopalonnetsystemtest.Model.CategoryContent.ContentInformation;
import com.gopal.gopalonnetsystemtest.Model.CategoryContent.ThumbnailInformation;
import com.gopal.gopalonnetsystemtest.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryInfoAdapter extends RecyclerView.Adapter<CategoryInfoAdapter.MyViewHolder> {
    private Context mContext;
    private List<ContentInformation> contentInformationList;
    private AdapterCallback mAdapterCallback;
    private List<ThumbnailInformation> thumbnailInformationList;
    ImageView imageView;
    public CategoryInfoAdapter(Context mContext, List<ContentInformation> contentInformations) {
        this.mContext = mContext;
        this.contentInformationList = contentInformations;
        this.mAdapterCallback = ((AdapterCallback) mContext);

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            imageView = (ImageView) view.findViewById(R.id.thumbnail);

            thumbnailInformationList = new ArrayList<>();
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mAdapterCallback.respond(contentInformationList.get(getAdapterPosition()).getSubCategoryId());

                }
            });

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mAdapterCallback.respond(contentInformationList.get(getAdapterPosition()).getSubCategoryId());
                }
            });
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ContentInformation contentInformation = contentInformationList.get(position);
        holder.title.setText(contentInformation.getName());
        thumbnailInformationList.addAll(contentInformationList.get(position).getThumbnailInformation());

       int vi =  mContext.getResources().getConfiguration().orientation;
       if (vi == 2){
           Glide.with(mContext).load(thumbnailInformationList.get(0).getUrl()).into(imageView);
       }else {
           Glide.with(mContext).load(thumbnailInformationList.get(1).getUrl()).into(imageView);

       }

    }

    @Override
    public int getItemCount() {
        return contentInformationList.size();
    }

    public static interface AdapterCallback {
        void respond(String strID);
    }

}
