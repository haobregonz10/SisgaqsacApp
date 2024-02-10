package com.example.sisgaqsacapp;

import static android.os.Build.VERSION_CODES.R;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.sisgaqsacapp.databinding.ActivityActa01Binding;

public class Acta01Activity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityActa01Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityActa01Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }


}