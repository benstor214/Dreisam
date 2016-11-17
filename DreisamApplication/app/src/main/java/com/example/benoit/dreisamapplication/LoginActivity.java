package com.example.benoit.dreisamapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class LoginActivity extends AppCompatActivity {

    private EditText loginEditText, passwordEditText;
    private RelativeLayout mainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mainView = (RelativeLayout) findViewById(R.id.activity_login);

        loginEditText = (EditText) findViewById(R.id.etxt_login);
        passwordEditText = (EditText) findViewById(R.id.etxt_pswd);

        findViewById(R.id.btn_signin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MenuActivity.class);

                startActivity(intent);
            }
        });
    }
}
