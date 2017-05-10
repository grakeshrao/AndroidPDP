package com.example.i861571.scrollimageapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/**
 * Created by i861571 on 5/8/17.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    // array of integers for images IDs
    private Integer[] mImageIds = {R.drawable.glasses1,
            R.drawable.glasses2, R.drawable.glasses3,R.drawable.glasses4,R.drawable.glasses5

    };

    // constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);

        imageView.setImageResource(mImageIds[i]);
        imageView.setLayoutParams(new Gallery.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.FILL_PARENT));
        return imageView;
    }

}



