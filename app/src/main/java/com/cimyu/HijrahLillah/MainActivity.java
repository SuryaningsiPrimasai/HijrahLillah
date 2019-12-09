package com.cimyu.HijrahLillah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cimyu.HijrahLillah.presentation.listsurah.ListSurahActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnMove , btnMove1, btnMove2, btnMove3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.Alquran);
        btnMove.setOnClickListener(this);

        btnMove1 = findViewById(R.id.video);
        btnMove1.setOnClickListener(this);

        btnMove2 = findViewById(R.id.doa);
        btnMove2.setOnClickListener(this);

        btnMove3 = findViewById(R.id.tasbih);
        btnMove3.setOnClickListener(this);

        TextView openYoutube = findViewById(R.id.video);
        openYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=lEN-CpMv4GI&t=13s"));
                try {
                    MainActivity.this.startActivity(webIntent);
                } catch (ActivityNotFoundException ex) {
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Alquran:
                startActivity(new Intent(this, ListSurahActivity.class));
                break;

            case R.id.video:
                startActivity(new Intent(this, MainActivity.class));
                break;

            case R.id.doa:
                startActivity(new Intent(this, doa.class));
                break;

            case R.id.tasbih:
                startActivity(new Intent(this, tasbih.class));
                break;

        }
    }
}
