package com.example.mina.toolbartest;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SuccessActivity extends AppCompatActivity {

    private TextView infoTextView;              //ToolBarSource
    private BottomNavigationView bottomNavigationView;            //ToolBarSource

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        infoTextView = (TextView) findViewById(R.id.infoTextView);        //ToolBarSource

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);        //ToolBarSource

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.inicioItem) {
                    infoTextView.setText(R.string.inicio);
                } else if (item.getItemId() == R.id.buscarItem) {
                    infoTextView.setText(R.string.buscar);
                } else if (item.getItemId() == R.id.camaraItem) {
                    infoTextView.setText(R.string.camara);
                } else if (item.getItemId() == R.id.favoritosItem) {
                    infoTextView.setText(R.string.favoritos);
                } else if (item.getItemId() == R.id.perfilItem) {
                    infoTextView.setText(R.string.perfil);
                }

                return false;
            }
        });                             //ToolBarSource

    }}