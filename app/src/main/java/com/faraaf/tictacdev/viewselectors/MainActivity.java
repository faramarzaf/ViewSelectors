package com.faraaf.tictacdev.viewselectors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnToast;
    MyToast myToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToast = findViewById(R.id.btnToast);
        btnToast.setOnClickListener(this);
        myToast = new MyToast(this);
    }

    @Override
    public void onClick(View v) {
        myToast.customToastMessage("sad");
    }

}
