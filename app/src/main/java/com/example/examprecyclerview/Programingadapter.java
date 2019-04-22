package com.example.examprecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Programingadapter extends RecyclerView.Adapter<Programingadapter.Programingviewholder>{

   private ArrayList<String> datalist;

    public Programingadapter(ArrayList<String> datalist){
        this.datalist=datalist;
    }

    @NonNull
    @Override
    public Programingviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater =LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.list,viewGroup,false);
        return new Programingviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Programingviewholder programingviewholder, int i) {
        String title=(String) datalist.get(i);
       // programingviewholder.texttitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }


    public class Programingviewholder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView texttitle;
        public Programingviewholder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            texttitle=itemView.findViewById(R.id.texttitle);
        }
    }
}
