package com.chushaowei.tpad.testtpad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        //
        Toast.makeText(this, "Hello Git", Toast.LENGTH_LONG).show();

        System.out.println("Hello Git 2");

    }

}
