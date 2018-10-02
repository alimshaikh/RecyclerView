package com.example.tour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




import java.util.ArrayList;
import java.util.Arrays;

public class TabActivity_1 extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_tab_activity_1, container, false);

        ArrayList text = new ArrayList<>(Arrays.asList("Gateway Of India","Haji Ali","Juhu Beach","Marine Drive","Elephanta Caves","Banganga Tank","Prince of Wales Museum","Essel World","Siddhivinayaka Temple"));

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        FragmentAdapterClass customAdapter = new FragmentAdapterClass(getActivity(), text);
        recyclerView.setAdapter(customAdapter);

        return view;

    }
}