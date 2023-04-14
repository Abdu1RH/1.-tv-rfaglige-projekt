package com.example.authenticationfirebase101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MembersOnly extends AppCompatActivity {

    private TextView mWelcomeMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members_only);

        mWelcomeMessage = findViewById(R.id.textView3);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        mWelcomeMessage.setText(message);
    }
}
