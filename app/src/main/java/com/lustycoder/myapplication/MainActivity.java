package com.lustycoder.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<String> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        populateData();
        initAdapter();

    }

    private void populateData() {

        arrayList.add("cust 1");
        arrayList.add("cust 2");
        arrayList.add("cust 3");
        arrayList.add("cust 4");
        arrayList.add("cust 5");
        arrayList.add("cust 6");
        arrayList.add("cust 7");
        arrayList.add("cust 8");
        arrayList.add("cust 9");
        arrayList.add("cust 10");
        arrayList.add("cust 11");
        arrayList.add("cust 12");
        arrayList.add("cust 13");
        arrayList.add("cust 14");
        arrayList.add("cust 15");
        arrayList.add("cust 16");
        arrayList.add("cust 17");
    }

    private void initAdapter() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerViewAdapter = new RecyclerViewAdapter(arrayList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
        runAnimationAgain();
    }

    private void runAnimationAgain() {

        final LayoutAnimationController controller = AnimationUtils.loadLayoutAnimation(this, R.anim.layout_animation_down_to_up);

        recyclerView.setLayoutAnimation(controller);
        recyclerViewAdapter.notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();

    }
}