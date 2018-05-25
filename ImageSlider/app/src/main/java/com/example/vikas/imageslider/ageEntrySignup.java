package com.example.vikas.imageslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class ageEntrySignup extends AppCompatActivity {

    private DatePicker ageSelectionPicker;
    private Button ageContinueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_entry_signup);

        ageSelectionPicker = (DatePicker) findViewById(R.id.ageSelectionPicker);

        ageContinueButton = (Button) findViewById(R.id.ageContinueButton);


        ageContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openHobbiesEntryPage();
            }
        });


    }

    public void openHobbiesEntryPage()
    {
        Intent intent = new Intent(this,HobbiesEntrySignup.class);
        startActivity(intent);
    }
}
