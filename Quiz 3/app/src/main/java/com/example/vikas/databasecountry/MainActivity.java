package com.example.vikas.databasecountry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    SQLDBHelper countryDB;

    EditText countryEditText, cityEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryDB = new SQLDBHelper(this);
    }

    public void addDatafunction(View view)
    {
        countryEditText = (EditText) findViewById(R.id.countryText);
        cityEditText = (EditText) findViewById(R.id.cityText);


        if (countryEditText.getText().toString().length() == 0 || cityEditText.getText().toString().length()==0)
        {
            Toast.makeText(MainActivity.this, "Country or City cannot be left empty!!!", Toast.LENGTH_LONG).show();
        }
        else
        {
            boolean insertData = countryDB.insertToTable(countryEditText.getText().toString(), cityEditText.getText().toString());

            if (insertData == true)
            {
                Toast.makeText(MainActivity.this, "Successfully Added!!!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(MainActivity.this, "Data Already Exits!!!", Toast.LENGTH_LONG).show();
            }
        }

    }


    public void viewDataFunction(View view)
    {

        startActivity(new Intent(MainActivity.this, ViewData.class));
    }


}

