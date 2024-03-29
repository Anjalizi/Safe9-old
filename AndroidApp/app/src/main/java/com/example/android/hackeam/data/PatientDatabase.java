package com.example.android.hackeam.data;

import net.simonvt.schematic.annotation.Database;
import net.simonvt.schematic.annotation.Table;

/**
 * Database to store patient data
 */
@Database(version = PatientDatabase.VERSION)
public final class PatientDatabase {


    public static final int VERSION = 1;

    @Table(PatientColumns.class)
    public static final String PATIENTS = "patients";

}
