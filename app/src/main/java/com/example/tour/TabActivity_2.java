package com.example.tour;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tour.FragmentAdapterClass;
import com.example.tour.R;

import java.util.ArrayList;
import java.util.Arrays;

public class TabActivity_2 extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_tab_activity_1, container, false);

        ArrayList text = new ArrayList<>(Arrays.asList("Red Fort","India Gate","Qutub Minar","Humayun Tomb","Akshardham Temple","Jama Masjid","Nehru Park"));

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        FragmentAdapterClass customAdapter = new FragmentAdapterClass(getActivity(), text);
        recyclerView.setAdapter(customAdapter);

        return view;

    }
}