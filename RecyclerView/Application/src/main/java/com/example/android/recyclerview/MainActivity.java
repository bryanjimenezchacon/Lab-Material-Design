package com.example.android.recyclerview;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.example.android.common.activities.SampleActivityBase;

/**
 * Created by PHOENIXLENO on 26/05/2016.
 */
public class MainActivity extends SampleActivityBase {

    public static final String TAG = "MainActivity";

    private boolean mLogShown;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            RecyclerViewFragment fragment = new RecyclerViewFragment();
            transaction.replace(R.id.sample_content_fragment, fragment);
            transaction.commit();
        }
    }
}
