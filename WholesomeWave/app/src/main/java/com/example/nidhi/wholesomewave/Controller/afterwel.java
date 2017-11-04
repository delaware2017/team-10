package com.example.nidhi.wholesomewave.Controller;

/**
 * Created by uziminhas on 11/4/17.
 */

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class afterwel extends AppCompatActivity {
    int nowText = -1;
    Typeface tfc1;
    String myText[] = {"Make sure to register your information!","This app increases stability amongst both YOU and US!","Contact us at team10@gmail.com for any questions or comments!"};
    int textNow = myText.length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.nidhi.wholesomewave.R.layout.activity_afterwel);
        Button showNext = (Button) findViewById(com.example.nidhi.wholesomewave.R.id.mybutton);
        final TextSwitcher text = (TextSwitcher) findViewById(com.example.nidhi.wholesomewave.R.id.switchtext);

        text.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView myText = new TextView(afterwel.this);
                myText.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
                myText.setTextSize(55);
                myText.setTextColor(Color.BLACK);
                tfc1 = Typeface.createFromAsset(getAssets(), "fonts/Quikhand.ttf");
                myText.setTypeface(tfc1);
                return myText;
            }

        });
        showNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nowText++;
                if (nowText == textNow){
                    nowText = 0;
                    Intent intent = new Intent(afterwel.this, welcome.class);
                    startActivity(intent);
                }
                text.setText(myText[nowText]);
            }
        });
    }
}