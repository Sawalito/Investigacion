package com.example.mysaul6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String Tag = "Mi actividad";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Tag,"OnCreate");
        TextView textView = findViewById(R.id.TextView1);
        textView.setText("OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"OnStart");
        TextView textView = findViewById(R.id.TextView1);
        textView.setText("OnStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag,"OnRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"OnPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"OnDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"OnStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"onResume");
    }
}