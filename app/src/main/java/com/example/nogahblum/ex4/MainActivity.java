package com.example.nogahblum.ex4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyImagesAdapter myAdapter = new MyImagesAdapter();

        // RecyclerView
        final RecyclerView myRecyclerView = findViewById(R.id.recyclerView);
        myRecyclerView.setAdapter(myAdapter);

        // Button
        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });
    }

}
