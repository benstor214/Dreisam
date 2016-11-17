package com.example.benoit.dreisamapplication;

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

public class MenuActivity extends AppCompatActivity {

    Button btn_phone, btn_map, btn_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //init Views
        init();


        btn_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri phone_uri = Uri.parse("tel:");

                Intent intent = new Intent(Intent.ACTION_DIAL, phone_uri);
                startActivity(intent);
            }
        });


        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?saddr=20.344,34.34&daddr=20.5666,45.345"));
                startActivity(intent);
            }
        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(view.getContext(), LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);                
                startActivity(intent);*/
                Toast.makeText(view.getContext(), "You are now logged out!", Toast.LENGTH_LONG).show();
                finish();

            }
        });






    }

    private void init() {
        btn_phone= (Button) findViewById(R.id.btn_menu_phone);
        btn_map= (Button) findViewById(R.id.btn_menu_map);
        btn_logout= (Button) findViewById(R.id.btn_menu_logout);
    }
}
