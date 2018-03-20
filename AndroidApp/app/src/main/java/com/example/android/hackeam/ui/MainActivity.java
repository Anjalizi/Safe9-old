package com.example.android.hackeam.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.android.hackeam.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;

/**
 * Activity to display hospital and anganwadi mode
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.iv_hospital)
    ImageView mHospitalImageView;
    @BindView(R.id.iv_anganwadi)
    ImageView mAnganwadiImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timber.plant(new Timber.DebugTree());
        ButterKnife.bind(this);

        mHospitalImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SelectPatientActivity.class));
            }
        });
        mAnganwadiImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AnganwadiActivity.class));
            }
        });

    }
}
