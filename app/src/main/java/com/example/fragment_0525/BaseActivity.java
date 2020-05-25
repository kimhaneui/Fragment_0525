package com.example.fragment_0525;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {

    Context mcontext;

    public abstract void setUp();
    public abstract void setValues();

}
