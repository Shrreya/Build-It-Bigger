package com.shrreyabhatachaarya.telljokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TellJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tell_joke);

        String joke = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        ((TextView) findViewById(R.id.joke)).setText(joke);
    }
}
