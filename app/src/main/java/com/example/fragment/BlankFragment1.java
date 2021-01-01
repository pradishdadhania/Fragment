package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BlankFragment1 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("onCreate", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("onCreateView", "onCreateView");
        return inflater.inflate(R.layout.fragment_blank1, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("onStart", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("onResume", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("onResume", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("onResume", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("onResume", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("onResume", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("onResume", "onDetach");
    }
}