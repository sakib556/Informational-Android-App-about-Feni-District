package com.example.fenidistrict;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void photo(View view) {
        Intent p=new Intent(MainActivity.this,photo.class);
        startActivity(p);
    }
    public void spot(View view){
     Intent s=new Intent(MainActivity.this,spot.class);
   startActivity(s);
    }
   public void restaurant(View view){
        Intent r=new Intent(MainActivity.this,restaurant.class);
       startActivity(r);

    }


    public void map(View view) {
        Intent m=new Intent(MainActivity.this,map.class);
        startActivity(m);
    }

    public void aboutme(View view) {
        Intent m=new Intent (MainActivity.this,meac.class);
        startActivity(m);
    }
}
