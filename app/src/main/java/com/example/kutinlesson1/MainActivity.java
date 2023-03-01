package com.example.kutinlesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName().toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Invoke onCreate  method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Invoke onResume method");
    }
}