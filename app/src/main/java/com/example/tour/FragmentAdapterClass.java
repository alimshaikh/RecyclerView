package com.example.tour;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tour.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentAdapterClass extends RecyclerView.Adapter<FragmentAdapterClass.MyViewHolder>
{
    ArrayList text1;
    Context context;



    public FragmentAdapterClass(Context context,ArrayList text1) {
        this.text1 = text1;
        this.context = context;

    }


    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tabfirstitem,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        /*ListItem listItem = name.get(position);
        holder.text1.setText(listItem.getText());*/
        holder.text.setText((CharSequence) text1.get(position));

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return text1.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener {

        public TextView text;
        ImageView image;
        private ItemClickListener itemClickListener;


        public MyViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            text=(TextView)itemView.findViewById(R.id.text);
            image = (ImageView) itemView.findViewById(R.id.image);

        }
        @Override
        public void onClick(View v) {
            this.itemClickListener.onItemClick(v,getLayoutPosition());
        }

        public void setItemClickListener(ItemClickListener ic)
        {
            this.itemClickListener=ic;

        }


    }
}












