package com.example.fenidistrict;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
    }

    public void fenian(View view) {
        Intent f=new Intent(restaurant.this,fenian.class);
        startActivity(f);
    }
}
