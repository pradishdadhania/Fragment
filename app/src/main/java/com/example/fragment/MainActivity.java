package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fragment1(View v){
        FragmentManager fm = getSupportFragmentManager();
        BlankFragment1 fragment = new BlankFragment1();
        fm.beginTransaction().add(R.id.fragment,fragment).commit();

    }
    public void fragment2(View v){
        FragmentManager fm = getSupportFragmentManager();
        BlankFragment2 fragment = new BlankFragment2();
        fm.beginTransaction().add(R.id.fragment,fragment).commit();

    }
}