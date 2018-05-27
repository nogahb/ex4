package com.example.nogahblum.ex4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class MyImagesAdapter extends RecyclerView.Adapter<MyImagesAdapter.ImageViewHolder> {

    class ImageViewHolder extends RecyclerView.ViewHolder {

        public ImageViewHolder(View imageView) {
            super(imageView);
        }
    }

    @NonNull
    @Override
    public MyImagesAdapter.ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyImagesAdapter.ImageViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
