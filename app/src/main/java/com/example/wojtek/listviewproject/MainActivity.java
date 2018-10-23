package com.example.wojtek.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataItem> lstData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstData =new ArrayList<>();

        lstData.add(new DataItem(R.drawable.picasso,"Picasso", "Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso", "Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso", "Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso", "Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso", "Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso", "Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso", "Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso", "Picasso"));

        ListView listView =(ListView)findViewById(R.id.listView);
    }
}
