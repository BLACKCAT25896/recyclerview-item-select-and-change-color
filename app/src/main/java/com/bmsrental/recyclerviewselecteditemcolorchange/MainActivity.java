package com.bmsrental.recyclerviewselecteditemcolorchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CustomAdapter adapter;
    private RecyclerView recyclerView;
    private List<Item> itemList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        getItem();

    }

    private void getItem() {
        itemList.add(new Item("jaman","1"));
        itemList.add(new Item("joy","2"));
        itemList.add(new Item("sathi","3"));
        itemList.add(new Item("ahare","4"));
        itemList.add(new Item("jay jay din","5"));
        itemList.add(new Item("kalllaaa","6"));
        itemList.add(new Item("jaman","1"));
        itemList.add(new Item("joy","2"));
        itemList.add(new Item("sathi","3"));
        itemList.add(new Item("ahare","4"));
        itemList.add(new Item("jay jay din","5"));
        itemList.add(new Item("kalllaaa","6"));
        itemList.add(new Item("jaman","1"));
        itemList.add(new Item("joy","2"));
        itemList.add(new Item("sathi","3"));
        itemList.add(new Item("ahare","4"));
        itemList.add(new Item("jay jay din","5"));
        itemList.add(new Item("kalllaaa","6"));
        itemList.add(new Item("jaman","1"));
        itemList.add(new Item("joy","2"));
        itemList.add(new Item("sathi","3"));
        itemList.add(new Item("ahare","4"));
        itemList.add(new Item("jay jay din","5"));
        itemList.add(new Item("kalllaaa","6"));
        itemList.add(new Item("jaman","1"));
        itemList.add(new Item("joy","2"));
        itemList.add(new Item("sathi","3"));
        itemList.add(new Item("ahare","4"));
        itemList.add(new Item("jay jay din","5"));
        itemList.add(new Item("kalllaaa","6"));
        itemList.add(new Item("jaman","1"));
        itemList.add(new Item("joy","2"));
        itemList.add(new Item("sathi","3"));
        itemList.add(new Item("ahare","4"));
        itemList.add(new Item("jay jay din","5"));
        itemList.add(new Item("kalllaaa","6"));
        itemList.add(new Item("jaman","1"));
        itemList.add(new Item("joy","2"));
        itemList.add(new Item("sathi","3"));
        itemList.add(new Item("ahare","4"));
        itemList.add(new Item("jay jay din","5"));
        itemList.add(new Item("kalllaaa","6"));
        itemList.add(new Item("jaman","1"));
        itemList.add(new Item("joy","2"));
        itemList.add(new Item("sathi","3"));
        itemList.add(new Item("ahare","4"));
        itemList.add(new Item("jay jay din","5"));
        itemList.add(new Item("kalllaaa","6"));

    }

    private void init() {
        itemList = new ArrayList<>();
        adapter = new CustomAdapter(itemList,this);
        recyclerView = findViewById(R.id.rV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1,RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);

    }
}
