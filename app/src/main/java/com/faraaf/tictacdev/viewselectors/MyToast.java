package com.faraaf.tictacdev.viewselectors;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MyToast extends AppCompatActivity {

    private Context con;

    public MyToast(Context con) {
        this.con = con;
    }

    public void customToastMessage(String message) {
        Toast warningMessage = Toast.makeText(con, message, Toast.LENGTH_LONG);
        warningMessage.show();
    }

}


