package com.example.android.hackeam.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.android.hackeam.R;
import com.example.android.hackeam.model.Patient;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Activity to show options for the patient including sonography
 */
public class PatientActivity extends AppCompatActivity {

    @BindView(R.id.iv_checkup)
    ImageView mGeneralCheckupImageView;
    @BindView(R.id.iv_test)
    ImageView mMedicalTestsImageView;
    @BindView(R.id.iv_sono)
    ImageView mSonoImageView;
    @BindView(R.id.iv_vaccine)
    ImageView mVaccineImageView;

    private Patient mPatient;
    public static final String TARGET_ACTIVITY = "target";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);

        ButterKnife.bind(this);

        mPatient = getIntent().getParcelableExtra(Patient.PATIENT_CONSTANT);

        mSonoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PatientActivity.this, SonographyActivity.class);
                intent.putExtra(Patient.PATIENT_CONSTANT, mPatient);
                startActivity(intent);
            }
        });
        mGeneralCheckupImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PatientActivity.this, PlaceholderActivity.class);
                intent.putExtra(Patient.PATIENT_CONSTANT, mPatient);
                intent.putExtra(TARGET_ACTIVITY, "General Checkup");
                startActivity(intent);
            }
        });
        mMedicalTestsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PatientActivity.this, PlaceholderActivity.class);
                intent.putExtra(Patient.PATIENT_CONSTANT, mPatient);
                intent.putExtra(TARGET_ACTIVITY, "Medical Test");
                startActivity(intent);
            }
        });
        mVaccineImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PatientActivity.this, PlaceholderActivity.class);
                intent.putExtra(Patient.PATIENT_CONSTANT, mPatient);
                intent.putExtra(TARGET_ACTIVITY, "Vaccination");
                startActivity(intent);
            }
        });


    }
}
