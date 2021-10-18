package com.netease.taobao;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        Glide.with(context)
                .load(path)
                .into(imageView);
    }

    public String getName() {
        String tag = GlideImageLoader.class.getSimpleName();
        //这里出现一个bug，我改了。
        return tag;
    }
}
