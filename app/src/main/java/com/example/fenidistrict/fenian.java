package com.example.fenidistrict;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class fenian extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenian);

        View callbutton = findViewById(R.id.callfenian);
        View webbutton = findViewById(R.id.webf);



        callbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel: +8801772718106"));
                if (ActivityCompat.checkSelfPermission(fenian.this, Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(call);
            }
        });

        webbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("www.facebook.com/fenian");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    


}




