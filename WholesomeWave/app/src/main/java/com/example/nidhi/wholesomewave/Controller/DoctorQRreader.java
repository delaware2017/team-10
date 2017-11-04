package com.example.nidhi.wholesomewave.Controller;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.nidhi.wholesomewave.Controller.barcode.BarcodeCaptureActivity;
import com.example.nidhi.wholesomewave.R;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.vision.barcode.Barcode;

/**
 * Created by joeson34 on 11/4/2017.
 */

public class DoctorQRreader extends AppCompatActivity {
    private static final String LOG_TAG = DoctorQRreader.class.getSimpleName();
    private static final int BARCODE_READER_REQUEST_CODE = 1;

    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_qrreader);

        mResultTextView = (TextView) findViewById(R.id.result_textview);

        Button scanBarcodeButton = (Button) findViewById(R.id.scan_barcode_button);
        scanBarcodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BarcodeCaptureActivity.class);
                startActivityForResult(intent, BARCODE_READER_REQUEST_CODE);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == BARCODE_READER_REQUEST_CODE) {
            if (resultCode == CommonStatusCodes.SUCCESS) {
                if (data != null) {
                    Barcode barcode = data.getParcelableExtra(BarcodeCaptureActivity.BarcodeObject);
                    Point[] p = barcode.cornerPoints;
                    mResultTextView.setText(barcode.displayValue);
                } else mResultTextView.setText("No barcode captured");
            } else Log.e(LOG_TAG, String.format("Something is wrong"));
                    //CommonStatusCodes.getStatusCodeString(resultCode)));
        } else super.onActivityResult(requestCode, resultCode, data);
    }
}
