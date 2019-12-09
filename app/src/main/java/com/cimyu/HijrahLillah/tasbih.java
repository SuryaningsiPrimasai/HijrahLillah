package com.cimyu.HijrahLillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class tasbih extends AppCompatActivity implements View.OnClickListener{

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tambah:
                finish();
                break;

            case R.id.reset:
                finish();
                break;
        }
    }

    public void Increment(View view) {
        if (quantity == 99) {
            Toast.makeText(this, "MAXIMUM", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    public void Decrement(View view) {
        if (quantity == 0) {
            Toast.makeText(this, "MINIMUM", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - quantity;
        displayQuantity(quantity);
    }


    private void displayQuantity (int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}
