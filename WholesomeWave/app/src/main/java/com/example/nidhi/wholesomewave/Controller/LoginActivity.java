package com.example.nidhi.wholesomewave.Controller;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.app.ProgressDialog;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nidhi.wholesomewave.Model.User;

import com.example.nidhi.wholesomewave.R;

/**
 * Created by nidhi on 11/3/17.
 */

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private ProgressDialog progressDialog;
    private Button loginDoctor;
    private Button loginParticipant;

    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        //initialize views
        username = (EditText) findViewById(R.id.userNameText);
        password = (EditText) findViewById(R.id.passwordText);
        progressDialog = new ProgressDialog(this);
        //SharedPreferences mPrefs = getSharedPreferences("WaterCrowdSource", MODE_PRIVATE);

        loginDoctor = (Button) findViewById(R.id.loginDoctor);
        loginDoctor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                changeActivity();
            }
        });
    }



<<<<<<< Updated upstream
    public void changeActivity(){
        Intent intent = new Intent(this, DoctorQRreader.class);
        startActivity(intent);
=======

            Intent intent = new Intent(this, MainScreenActivity.class);
            //intent.putExtra("Username", username.getText().toString());
            startActivity(intent);
        }

    public void onCancelPressed(View v) {
        finish();
>>>>>>> Stashed changes
    }

    protected void onStop() {
        super.onStop();

        finish();
    }

    public void onStart() {
        super.onStart();
    }


}










