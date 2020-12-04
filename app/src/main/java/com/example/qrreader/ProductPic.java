package com.example.qrreader;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductPic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productpic);

        GridView gridView = findViewById(R.id.gridView);
        GridListAdapter adapter = new GridListAdapter();

        adapter.addItem(new ListItem("항목1", "1"));
        adapter.addItem(new ListItem("항목2", "2"));
        adapter.addItem(new ListItem("항목3", "3"));
        adapter.addItem(new ListItem("항목4", "4"));
        adapter.addItem(new ListItem("항목5", "5"));
        adapter.addItem(new ListItem("항목6", "6"));
        gridView.setAdapter(adapter);
    }

}
