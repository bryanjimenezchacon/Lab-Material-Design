package com.example.android.recyclerview;

import com.example.android.common.logger.Log;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;

/**
 * Created by PHOENIXLENO on 26/05/2016.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private static final String TAG = "CustomAdapter";
    private String[] mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView textView;

        public ViewHolder(View v){
            super(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                        public void onClick(View v){
                    Log.d(TAG, "Element" + getPosition() + "clicked.");
                }
            });
            textView = (TextView) v.findViewById(R.id.textView);
        }

    }
}
