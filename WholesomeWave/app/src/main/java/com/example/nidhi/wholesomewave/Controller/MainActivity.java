package com.example.nidhi.wholesomewave.Controller;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int TIME_OUT = 4000;

    TextView txt;
    Button btn;
    EditText mEdit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.nidhi.wholesomewave.R.layout.activity_main);

        btn = (Button) findViewById(com.example.nidhi.wholesomewave.R.id.mybutton);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Button btn = (Button) view;
                btn.setVisibility(View.GONE);
                mEdit = (EditText) findViewById(com.example.nidhi.wholesomewave.R.id.editText1);
                txt = (TextView) findViewById(com.example.nidhi.wholesomewave.R.id.mytext);
                txt.setText("Nice to meet you, " + mEdit.getText().toString() + "!");

                final View myLayout = findViewById(com.example.nidhi.wholesomewave.R.id.mytext);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(MainActivity.this, afterwel.class);
                        startActivity(i);
                        finish();
                    }
                }, TIME_OUT);

            }
        });
    }
}

