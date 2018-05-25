/*
 * *
 *  * Created by Vikas Radhakrishna Shetty on 5/20/18
 *  * Copyright (c) 2018 . All rights reserved.
 *  * Last modified 5/25/18 2:40 PM
 *
 */

package com.example.vikas.imageslider;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signupButton = (Button) findViewById(R.id.signup_button);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openEmailAddressEntryPage();
            }
        });

    }

    public void openEmailAddressEntryPage()
    {
        Intent intent = new Intent(this,emailAddressEntrySignupActivity.class);
        startActivity(intent);
    }
}
