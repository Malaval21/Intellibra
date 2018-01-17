package com.shrungamalavalli.intellibra_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalibrateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calibrate);

        final Button btnCalib = (Button)findViewById(R.id.btnCalib);
        final TextView tvGoBack =(TextView)findViewById(R.id.tvGoBack);

        tvGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoDashIntent = new Intent(CalibrateActivity.this,UserAreaActivity.class);
                CalibrateActivity.this.startActivity(GoDashIntent);
            }
        });

        btnCalib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent CalibrateIntent = new Intent(CalibrateActivity.this,PairActivity.class);
                CalibrateActivity.this.startActivity(CalibrateIntent);
            }
        });
    }
}
