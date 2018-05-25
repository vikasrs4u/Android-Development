/*
 * *
 *  * Created by Vikas Radhakrishna Shetty on 5/24/18
 *  * Copyright (c) 2018 . All rights reserved.
 *  * Last modified 5/24/18 5:07 PM
 *
 */

package com.example.vikas.imageslider;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HobbiesEntrySignup extends AppCompatActivity {

    private Button hobbiesContinueButton;
    private Button sportsSelectionButton;
    private Button travelSelectionButton;
    private Button musicSelectionButton;
    private Button fishingSelectionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies_entry_signup);

        sportsSelectionButton = (Button) findViewById(R.id.sportsSelectionButton);
        travelSelectionButton = (Button) findViewById(R.id.travelSelectionButton);
        musicSelectionButton = (Button) findViewById(R.id.musicSelectionButton);
        fishingSelectionButton = (Button) findViewById(R.id.fishingSelectionButton);
        hobbiesContinueButton = (Button) findViewById(R.id.hobbiesContinueButton);

        // Initially all the buttons needs to be grayed out so this code is added, on selection we will enable it later
        sportsSelectionButton.setAlpha(.5f);
        sportsSelectionButton.setBackgroundColor(Color.GRAY);

        travelSelectionButton.setAlpha(.5f);
        travelSelectionButton.setBackgroundColor(Color.GRAY);

        musicSelectionButton.setAlpha(.5f);
        musicSelectionButton.setBackgroundColor(Color.GRAY);

        fishingSelectionButton.setAlpha(.5f);
        fishingSelectionButton.setBackgroundColor(Color.GRAY);


        sportsSelectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sportsButtonClicked();
            }
        });

        travelSelectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                travelButtonClicked();
            }
        });

        musicSelectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicButtonClicked();
            }
        });

        fishingSelectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fishingButtonClicked();
            }
        });

        hobbiesContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginEntryPage();
            }
        });

    }

    public void sportsButtonClicked()
    {
        // this is to toggle between selection and non selection of button
        if (sportsSelectionButton.getAlpha() == 1.0f)
        {
            sportsSelectionButton.setAlpha(.5f);
            sportsSelectionButton.setBackgroundColor(Color.GRAY);
        }
        else
        {
            sportsSelectionButton.setBackgroundColor(Color.parseColor("#FF4081"));
            sportsSelectionButton.setAlpha(1.0f);
        }

    }

    public void travelButtonClicked()
    {
        // this is to toggle between selection and non selection of button
        if (travelSelectionButton.getAlpha() == 1.0f)
        {
            travelSelectionButton.setAlpha(.5f);
            travelSelectionButton.setBackgroundColor(Color.GRAY);
        }
        else
        {
            travelSelectionButton.setBackgroundColor(Color.parseColor("#FF4081"));
            travelSelectionButton.setAlpha(1.0f);
        }

    }

    public void musicButtonClicked()
    {
        // this is to toggle between selection and non selection of button
        if (musicSelectionButton.getAlpha() == 1.0f)
        {
            musicSelectionButton.setAlpha(.5f);
            musicSelectionButton.setBackgroundColor(Color.GRAY);
        }
        else
        {
            musicSelectionButton.setBackgroundColor(Color.parseColor("#FF4081"));
            musicSelectionButton.setAlpha(1.0f);
        }

    }

    public void fishingButtonClicked()
    {
        // this is to toggle between selection and non selection of button
        if (fishingSelectionButton.getAlpha() == 1.0f)
        {
            fishingSelectionButton.setAlpha(.5f);
            fishingSelectionButton.setBackgroundColor(Color.GRAY);
        }
        else
        {
            fishingSelectionButton.setBackgroundColor(Color.parseColor("#FF4081"));
            fishingSelectionButton.setAlpha(1.0f);
        }

    }


    public void openLoginEntryPage()
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


}
