package com.example.javabmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.javabmi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
    public void calculate(View view) {
        Float weight = Float.valueOf(binding.edWeight.getText().toString());
        Float height = Float.valueOf(binding.edHeight.getText().toString());
        Float bmi = weight / (height * height);
        Toast.makeText(this, bmi.toString(), Toast.LENGTH_LONG).show();
    }
}