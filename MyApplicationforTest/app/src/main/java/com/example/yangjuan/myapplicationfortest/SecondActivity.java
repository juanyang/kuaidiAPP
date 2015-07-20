package com.example.yangjuan.myapplicationfortest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by yangjuan on 2015/7/19.
 */
public class SecondActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.edsec);
        textView.setText(intent.getStringExtra("the second"));
    }
}
