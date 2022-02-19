package com.example.javabmi;

import androidx.appcompat.app.AlertDialog;
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
        binding.bHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder help = new AlertDialog.Builder(MainActivity.this);
                help.setTitle("BMI說明");
                help.setMessage("體重(kg)/身高的平方(m)");
                help.setPositiveButton("OK", null);
                help.show();
            }
        });
        }
    public void calculate(View view) {
        if(binding.edWeight.getText().toString().equals(""))
            binding.edWeight.setText("0");
        if(binding.edHeight.getText().toString().equals(""))
            binding.edHeight.setText("0");
        Float weight = Float.valueOf(binding.edWeight.getText().toString());
        Float height = Float.valueOf(binding.edHeight.getText().toString());
        Float bmi = weight / (height * height);
        //Toast.makeText(this, bmi.toString(), Toast.LENGTH_LONG).show();
        AlertDialog.Builder bmidialog = new AlertDialog.Builder(MainActivity.this);
        bmidialog.setTitle("Your BMI");
        bmidialog.setMessage(bmi.toString());
        bmidialog.setPositiveButton("OK", null);
        bmidialog.show();
    }
}