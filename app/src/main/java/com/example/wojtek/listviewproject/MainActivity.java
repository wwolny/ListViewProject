package com.example.wojtek.listviewproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataItem> lstData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstData =new ArrayList<>();

        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));
        lstData.add(new DataItem(R.drawable.picasso,"Picasso was a great artist", "Pablo Picasso"));



        ListView listView =(ListView)findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.itemrow, lstData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
