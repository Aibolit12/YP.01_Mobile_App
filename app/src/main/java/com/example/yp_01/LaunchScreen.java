package com.example.yp_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.yp_01.databinding.ActivityLaunchScreenBinding;
import com.example.yp_01.databinding.ActivitySingUpScreenBinding;

public class LaunchScreen extends AppCompatActivity {
    private ActivityLaunchScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLaunchScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        startActivity(new Intent(LaunchScreen.this, MainScreen.class));
        finish();
    }
}