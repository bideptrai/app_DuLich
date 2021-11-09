package com.example.app_dulich;

import static androidx.navigation.Navigation.findNavController;
import static androidx.navigation.ui.NavigationUI.setupActionBarWithNavController;
import static androidx.navigation.ui.NavigationUI.setupWithNavController;

import androidx.annotation.FractionRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navigationView;
    Button button;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        navigationView = findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.body, new FisrtFragment()).commit();
        navigationView.setSelectedItemId(R.id.fisrtFragment);
        navigationView.setOnNavigationItemSelectedListener(item -> {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.fisrtFragment:
                    fragment = new FisrtFragment();
                    break;
                case R.id.secondFragment:
                    fragment = new SecondFragment();
                    break;
                case R.id.thirdFragment:
                    fragment = new ThirdFragment();
                    break;
                case R.id.fourFragment:
                    fragment = new FourFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.body, fragment).commit();

            return true;
        });



    }



}
