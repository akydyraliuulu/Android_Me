package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by appaz on 12/19/17.
 */

public class MasterListFragment extends Fragment {
    public MasterListFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_master_list, container, false);

        GridView gridView = (GridView) rootview.findViewById(R.id.list_image_grid_view);
        gridView.setAdapter(new MasterListAdapter(getActivity().getApplicationContext(), AndroidImageAssets.getAll()));

        return rootview;
    }
}
