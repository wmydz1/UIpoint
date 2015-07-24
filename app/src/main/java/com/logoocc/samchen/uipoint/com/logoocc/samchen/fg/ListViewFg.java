package com.logoocc.samchen.uipoint.com.logoocc.samchen.fg;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.logoocc.samchen.uipoint.R;

/**
 * Created by samchen on 7/24/15.
 */
public class ListViewFg extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listview_fg,null);
        return  view;
    }
}
