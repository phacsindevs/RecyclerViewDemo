package com.phacsin.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    List<ListItem> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new RecyclerViewAdapter(list);
        recyclerView = findViewById(R.id.recyclerView);
        // LayoutManager used to specify orientation
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        // Optional Method used to specify animation when adding/removing an item
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        prepareListData();

        // Set the adapter to the recyclerview
        recyclerView.setAdapter(adapter);
    }

    // Method used to set dummy values to the list
    private void prepareListData() {
        for(int i=0;i<10;i++)
        {
            ListItem listItem = new ListItem("Title " + i , "Subtitle" + i);
            list.add(listItem);
        }
    }
}
