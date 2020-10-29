package com.example.myapplicationrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rclName;
    private NameListAdapter nameListAdapter;
    private ArrayList<String> nameArrayList;
//    private final LinkedList<String> mWorkList = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rclName = findViewById(R.id.rcvName);
        nameArrayList = new ArrayList<>();
        nameArrayList.add("Nam");
        nameArrayList.add("Toan");
        nameArrayList.add("Dieu");
        nameArrayList.add("Hien");
        nameArrayList.add("5");
        nameArrayList.add("6");
        nameArrayList.add("7");
        nameArrayList.add("8");
        nameArrayList.add("9");


        nameListAdapter = new NameListAdapter(this, nameArrayList);
        rclName.setAdapter(nameListAdapter);

        rclName.setLayoutManager((new LinearLayoutManager(this)));

    }

}