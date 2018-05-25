/*
 * *
 *  * Created by Vikas Radhakrishna Shetty on 5/21/18
 *  * Copyright (c) 2018 . All rights reserved.
 *  * Last modified 5/21/18 12:30 AM
 *
 */

package com.example.vikas.imageslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class emailAddressEntrySignupActivity extends AppCompatActivity
{
    private Button emailContinueButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_address_entry_signup);

        emailContinueButton = (Button) findViewById(R.id.emailContinueButton);

        emailContinueButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openPasswordEntryPage();
            }
        });
    }

    public void openPasswordEntryPage()
    {
        Intent intent = new Intent(this,passwordEntrySignupActivity.class);
        startActivity(intent);
    }
}
