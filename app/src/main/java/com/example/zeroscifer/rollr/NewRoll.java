package com.example.zeroscifer.rollr;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class NewRoll extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_roll);
    }

    public void onClickMain(View view) {

    }


    public void back(View view) {
        startActivity(new Intent(getApplicationContext(), RollList.class));
        finish();
    }
}
