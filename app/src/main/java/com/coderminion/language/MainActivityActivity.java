package com.coderminion.language;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivityActivity extends AppCompatActivity {

    TextView textview,youtube_link;
    String YOUTUBE_URL = "https://youtu.be/z_RST7lTG_k";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);

        //Init Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textview = (TextView)findViewById(R.id.textview);
        youtube_link = (TextView)findViewById(R.id.youtube_link);
        //Floating ActionButton
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, getResources().getString(R.string.replace_action), Snackbar.LENGTH_LONG).show();
            }
        });

        youtube_link.setText(getResources().getString(R.string.youtube_text));
        youtube_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(YOUTUBE_URL)));
            }
        });

        String hello,greet,intro,carrageReturn;
        hello= getString(R.string.hello);
        greet= getString(R.string.greet);
        intro= getString(R.string.intro);
        carrageReturn = "\n\n";

        textview.setText(hello+carrageReturn+greet+carrageReturn+intro);
    }

}
