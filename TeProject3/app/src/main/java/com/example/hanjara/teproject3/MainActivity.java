/***********************************************************************************
 * Copyright (c) Hanjara Cahya Adhyatama 2015. Kode sumber ini tidak untuk         *
 * diperjualbelikan serta disebarluaskan tanpa menyertakan copyright yang ada.     *
 * Menggunakan kode sumber ini berarti menyadari setiap kemungkinan kerusakan      *
 * yang mungkin disebabkan oleh kode ini pada perangkat anda.                      *
 * Gunakanlah kode sumber ini dengan bijak dengan menghargai kerja keras developer.*
 * Terimakasih.                                                                    *
 ***********************************************************************************/

package com.example.hanjara.teproject3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private EditText usernameField,passwordField;
    private TextView status,role,method;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameField = (EditText)findViewById(R.id.editText);
        passwordField = (EditText)findViewById(R.id.editText2);

        status = (TextView)findViewById(R.id.textView4);
        role = (TextView)findViewById(R.id.textView6);
        method = (TextView)findViewById(R.id.textView5);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void loginGet(View view){
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();
        method.setText("Get Method");
        new SigninActivity(this,status,role,0).execute(username, password);

    }

    public void loginPost(View view){
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();
        method.setText("Post Method");
        new SigninActivity(this,status,role,1).execute(username,password);
    }
}
