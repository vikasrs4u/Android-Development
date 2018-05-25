package com.example.vikas.imageslider;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class preferenceSelectionSignup extends AppCompatActivity {

    private Button preferenceContinueButton;
    private Button maleSelectionButton;
    private Button femaleSelectionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference_selection_signup);

        maleSelectionButton = (Button) findViewById(R.id.maleSelectionButton);
        femaleSelectionButton = (Button) findViewById(R.id.femaleSelectionButton);
        preferenceContinueButton = (Button) findViewById(R.id.preferenceContinueButton);

        //By default male has to be selected so below code is added

        femaleSelectionButton.setAlpha(.5f);
        femaleSelectionButton.setBackgroundColor(Color.GRAY);


        maleSelectionButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                maleButtonSelected();
            }
        });

        femaleSelectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                femaleButtonSelected();
            }
        });

        preferenceContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openAgeEntryPage();
            }
        });
    }

    public void maleButtonSelected()
    {
        maleSelectionButton.setBackgroundColor(Color.parseColor("#FF4081"));
        maleSelectionButton.setAlpha(1.0f);
        femaleSelectionButton.setAlpha(.5f);
        femaleSelectionButton.setBackgroundColor(Color.GRAY);
    }

    public void femaleButtonSelected()
    {
        femaleSelectionButton.setBackgroundColor(Color.parseColor("#FF4081"));
        femaleSelectionButton.setAlpha(1.0f);
        maleSelectionButton.setAlpha(.5f);
        maleSelectionButton.setBackgroundColor(Color.GRAY);
    }

    public void openAgeEntryPage()
    {
        Intent intent = new Intent(this,ageEntrySignup.class);
        startActivity(intent);
    }
}
