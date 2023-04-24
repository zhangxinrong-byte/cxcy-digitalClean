package com.example.map_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.CameraUpdateFactory;
import com.amap.api.maps2d.MapView;
import com.amap.api.maps2d.model.LatLng;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.gotomap);
        btn1.setOnClickListener(new mclick());

    }

    class mclick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent i=new Intent(MainActivity.this, MapActivity.class);
            startActivity(i);
        }
    }
}