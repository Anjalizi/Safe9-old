package com.example.android.hackeam.model;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Model class to store data of patients locally
 */
public class Patient implements Parcelable {

    public static final String PATIENT_CONSTANT="patient";
    private String mName;
    private int mId;
    private String mDoctor;

    public Patient(String mName, int mId) {
        this.mName = mName;
        this.mId = mId;
    }

    public Patient(String mName, int mId, String mDoctor) {
        this.mName = mName;
        this.mId = mId;
        this.mDoctor = mDoctor;
    }

    public String getmDoctor() {
        return mDoctor;
    }

    public void setmDoctor(String mDoctor) {
        this.mDoctor = mDoctor;
    }

    public int getmId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mName);
        dest.writeInt(this.mId);
        dest.writeString(this.mDoctor);
    }

    protected Patient(Parcel in) {
        this.mName = in.readString();
        this.mId = in.readInt();
        this.mDoctor = in.readString();
    }

    public static final Creator<Patient> CREATOR = new Creator<Patient>() {
        @Override
        public Patient createFromParcel(Parcel source) {
            return new Patient(source);
        }

        @Override
        public Patient[] newArray(int size) {
            return new Patient[size];
        }
    };
}
