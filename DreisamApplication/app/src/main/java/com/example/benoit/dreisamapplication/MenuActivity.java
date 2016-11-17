package com.example.benoit.dreisamapplication;

import android.content.Intent;
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
                //Intent intent = new Intent();



            }
        });


        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LoginActivity.class);
                Toast.makeText(view.getContext(), "You are now logged out!", Toast.LENGTH_LONG).show();
                startActivity(intent);

            }
        });






    }

    private void init() {
        btn_phone= (Button) findViewById(R.id.btn_menu_phone);
        btn_map= (Button) findViewById(R.id.btn_menu_map);
        btn_logout= (Button) findViewById(R.id.btn_menu_logout);
    }
}
