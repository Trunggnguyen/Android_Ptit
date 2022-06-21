package com.nvtr.internalstorage.ui;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nvtr.internalstorage.R;
import com.nvtr.internalstorage.model.Class_B18DCCN672;
import com.nvtr.internalstorage.model.Student_B18DCCN672;

import java.util.ArrayList;


public class PhongAdapter extends RecyclerView.Adapter<PhongAdapter.ViewHolder> {

    private ArrayList<Class_B18DCCN672> listitems;
    private Context context;

    public PhongAdapter(ArrayList<Class_B18DCCN672> items, Context context) {
        this.listitems = items;
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.item_phong,parent,false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Class_B18DCCN672 item = listitems.get(position);
        holder.tv_name.setText(item.getNameClass());
        holder.tv_dc.setText(item.getTypeClass());
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name, tv_dc, tv_ns, tv_cate;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.name);
            tv_dc = itemView.findViewById(R.id.dc);

        }
    }
}