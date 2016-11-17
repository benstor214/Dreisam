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
                //String phone = ((TextView) findViewById(R.id.phone_textview)).getText().toString();
                // Création de l'URI s'appel à partir du numéro de téléphone
                Uri phone_uri = Uri.parse("tel:");
                // Génération de l'Intent avec l'action appel
                Intent intent = new Intent(Intent.ACTION_CALL, phone_uri);
                // Appel de l'application la plus adaptée pour répondre à la demande

                if (ActivityCompat.checkSelfPermission(view.getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(intent);


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
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
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
