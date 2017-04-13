package com.example.mina.toolbartest;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class LiveActivity extends BaseActivity {
    LinearLayout dynamicContent,bottonNavBar;
    private TextView infoTextView;              //ToolBarSource
    private BottomNavigationView bottomNavigationView;            //ToolBarSource

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dynamicContent = (LinearLayout) findViewById(R.id.dynamicContent);
        bottonNavBar= (LinearLayout) findViewById(R.id.bottonNavBar);
        View wizard = getLayoutInflater().inflate(R.layout.activity_live, null);
        dynamicContent.addView(wizard);

        RadioGroup rg=(RadioGroup)findViewById(R.id.radioGroup1);
        RadioButton rb=(RadioButton)findViewById(R.id.watchList);
        rb.setCompoundDrawablesWithIntrinsicBounds( 0,R.drawable.ic_search, 0,0);
        rb.setTextColor(Color.parseColor("#3F51B5"));

        infoTextView = (TextView) findViewById(R.id.infoTextView);        //ToolBarSource

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);        //ToolBarSource

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.buscarItem) {
                    infoTextView.setText("Slot");
                    Intent intent = new Intent();
                    intent.setClass(LiveActivity.this,SlotActivity.class);
                    startActivity(intent);
                } else if (item.getItemId() == R.id.inicioItem) {
                    infoTextView.setText("Games");
                    Intent intent = new Intent();
                    intent.setClass(LiveActivity.this,GamesActivity.class);
                    startActivity(intent);
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