package com.lou.instagramclient;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by loudl_000 on 2/25/2015.
 */
public class InstagramPhotosAdapter extends ArrayAdapter<InstagramPhoto> {
    public InstagramPhotosAdapter(Context context, List<InstagramPhoto> objects) {
        super(context, android.R.layout.simple_list_item_1, objects);
    }
}
