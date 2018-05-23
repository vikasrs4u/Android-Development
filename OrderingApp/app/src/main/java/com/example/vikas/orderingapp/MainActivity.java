package com.example.vikas.orderingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int numberOfCoffees = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view)
    {
       displayPrice(numberOfCoffees*5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("Total: "+NumberFormat.getCurrencyInstance().format(number)+"\n Thank You!!!");
    }

    public void increment(View view)
    {
        numberOfCoffees++;
        display(numberOfCoffees);
    }

    public void decrement(View view)
    {
        //If number of coffee is more than 0 then only we decrement, else let it be zero
        if (numberOfCoffees>0)
        {
            numberOfCoffees--;
        }

        display(numberOfCoffees);
    }
}
