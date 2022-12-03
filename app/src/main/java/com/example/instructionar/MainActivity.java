package com.example.instructionar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wheelOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, WheelActivity.class);
        startActivity(intent);
    }

    public void radiatorOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, radiatorActivity.class);
        startActivity(intent);
    }

    public void lightOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, LightActivity.class);
        startActivity(intent);
    }

    public void engineOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, EngineActivity.class);
        startActivity(intent);
    }

    public void fuelOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, FuelActivity.class);
        startActivity(intent);
    }
}