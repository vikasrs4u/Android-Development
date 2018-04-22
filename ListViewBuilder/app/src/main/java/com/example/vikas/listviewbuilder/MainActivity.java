//
//  MainActivity
//  Advanced Calculator
//
//  Created by Vikas Radhakrishna Shetty on 4/22/18.
//  Copyright © 2018 Vikas Radhakrishna Shetty All rights reserved.
//

package com.example.vikas.listviewbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    EditText editTextFieldData;
    Button addButton;
    ListView listData;
    List<String> list = new ArrayList<>();
    //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = (Button) findViewById(R.id.addButton);

        editTextFieldData = (EditText) findViewById(R.id.textEntered);

        listData = (ListView) findViewById(R.id.listViewData);

        //Here have created a new list style called "List Blue Text" which is allowing me to chnage the color of the list data to blue
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_blue_text,list);
        listData.setAdapter(adapter);

        
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //After we press equals we need to start fresh transaction so have added this.
                if (editTextFieldData.getText().length() > 1)
                {

                    list.add(editTextFieldData.getText().toString());

                    // next thing you have to do is check if your adapter has changed
                    adapter.notifyDataSetChanged();
                    editTextFieldData.setText("");
                }

            }
        });
    }
}
