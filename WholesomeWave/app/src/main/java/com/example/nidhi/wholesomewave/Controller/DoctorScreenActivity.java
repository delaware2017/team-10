package com.example.nidhi.wholesomewave.Controller;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.nidhi.wholesomewave.Controller.QRActivity;

import com.example.nidhi.wholesomewave.R;

/**
 * Created by uzi on 11/3/17.
 */

public class DoctorScreenActivity extends AppCompatActivity{


    //private EditText amount;
    //private EditText password;
    private ProgressDialog progressDialog;
    private static final String TAG = "AmountActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        //initialize views
        amount = (EditText) findViewById(R.id.amount);

        progressDialog = new ProgressDialog(this);
        //SharedPreferences mPrefs = getSharedPreferences("WaterCrowdSource", MODE_PRIVATE);

        Button submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                changeActivity();
            }
        });
    }

    public void changeActivity(){
        Intent intent = new Intent(this, GenerateCoupon.class);
        startActivity(intent);
    }

    public void onQR(View v) {

        //String password2 = password.getText().toString();

        Intent intent = new Intent(this, QRActivity.class);
        //intent.putExtra("Username", username.getText().toString());
        startActivity(intent);
    }





    public void onCancelPressed(View v) {
        finish();
    }

    protected void onStop() {
        super.onStop();

        finish();
    }
    public void onStart() {
        super.onStart();
    }

}
