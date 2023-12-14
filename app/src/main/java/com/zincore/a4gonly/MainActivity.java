package com.zincore.a4gonly;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent(Intent.ACTION_MAIN);
        i.setClassName("com.android.settings", "com.android.settings.RadioInfo");
        startActivity(i);
        finishAfterTransition();
    }
}