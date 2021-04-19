package com.hobbido.app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hobbido.app.R;

public class CreateNewQueryActivity extends AppCompatActivity {
    ImageView back_img , menu_img;
    TextView tv_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_query);
        toolbarSetup();
    }

    public void toolbarSetup(){
        back_img = findViewById(R.id.back_img);
        menu_img = findViewById(R.id.menu_img);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("Create New Query");

    }
}