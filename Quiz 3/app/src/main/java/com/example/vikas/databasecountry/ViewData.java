package com.example.vikas.databasecountry;


import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class ViewData extends AppCompatActivity {

    private SQLDBHelper dbhelper;
    private ListView listView;
    private ArrayList<String> usersData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewdatadisplay);

        dbhelper = new SQLDBHelper(ViewData.this);
        Cursor res = dbhelper.showData();

        if(res.getCount()==0){
            Toast.makeText(ViewData.this, "Sorry, We currently have no records available !!!", Toast.LENGTH_LONG).show();
            return;
        }

        while (res.moveToNext()) {
            StringBuffer buffer = new StringBuffer();
            buffer.append("Country: " + res.getString(0) + "\n");
            buffer.append("City: " + res.getString(1) + "\n");
            usersData.add(buffer.toString());
        }

        listView = (ListView) findViewById(R.id.list1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(ViewData.this, android.R.layout.simple_list_item_1, usersData);
        listView.setBackgroundColor(Color.WHITE);
        listView.setAdapter(arrayAdapter);
    }
}


