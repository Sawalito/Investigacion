package com.example.mysaul6;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private static final String Tag = "Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Tag,"onCreate");
        TextView textView = findViewById(R.id.TextView1);
        textView.setText("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"onStart");
        TextView textView = findViewById(R.id.TextView1);
        textView.setText("onStart");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag,"onRestart");
        TextView textView = findViewById(R.id.TextView1);
        textView.setText("onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"onPause");
        TextView textView = findViewById(R.id.TextView1);
        textView.setText("onPause");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"onDestroy");
        TextView textView = findViewById(R.id.TextView1);
        textView.setText("onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"onStop");
        TextView textView = findViewById(R.id.TextView1);
        textView.setText("onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"onResume");
        TextView textView = findViewById(R.id.TextView1);
        textView.setText("onResume");
    }
}