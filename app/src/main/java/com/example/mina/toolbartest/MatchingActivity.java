package com.example.mina.toolbartest;

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
public class MatchingActivity extends BaseActivity {
    LinearLayout dynamicContent,bottonNavBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_matching);


        //dynamically include the  current activity      layout into  baseActivity layout.now all the view of baseactivity is   accessible in current activity.
        dynamicContent = (LinearLayout)  findViewById(R.id.dynamicContent);
        bottonNavBar= (LinearLayout) findViewById(R.id.bottonNavBar);
        View wizard = getLayoutInflater().inflate(R.layout.activity_matching, null);
        dynamicContent.addView(wizard);
        //get the reference of RadioGroup.
        RadioGroup rg=(RadioGroup)findViewById(R.id.radioGroup1);
        RadioButton rb=(RadioButton)findViewById(R.id.matching);
        // Change the corresponding icon and text color on nav button click.
        rb.setCompoundDrawablesWithIntrinsicBounds( 0,R.drawable.ic_home, 0,0);
        rb.setTextColor(Color.parseColor("#3F51B5"));
    }

}