package com.example.examprecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView programinglist=findViewById(R.id.programinglist);

        programinglist.setLayoutManager(new LinearLayoutManager(this));
       // String[] attributes={"color","name","age","height"};
        //  programinglist.setAdapter(new Programingadapter(attributes));

        ArrayList<String> datalist=new ArrayList<String>();
        for(int i=0;i<100;i++){
            datalist.add("java");
        }

        programinglist.setAdapter(new Programingadapter(datalist));

    }
}
