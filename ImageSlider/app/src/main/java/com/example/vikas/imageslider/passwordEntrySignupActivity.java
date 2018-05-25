/*
 * *
 *  * Created by Vikas Radhakrishna Shetty on 5/23/18
 *  * Copyright (c) 2018 . All rights reserved.
 *  * Last modified 5/23/18 10:11 PM
 *
 */

package com.example.vikas.imageslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class passwordEntrySignupActivity extends AppCompatActivity {

    private Button passwordContinueButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_entry_signup);

        passwordContinueButton = (Button) findViewById(R.id.passwordContinueButton);

        passwordContinueButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openGenderEntryPage();
            }
        });
    }

    public void openGenderEntryPage()
    {
        Intent intent = new Intent(this,genderSelectionSignup.class);
        startActivity(intent);
    }
}
