package com.shrungamalavalli.intellibra_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button btnLogin = (Button)findViewById(R.id.btnLogin);
        final EditText etUsername = (EditText)findViewById(R.id.etUsername);
        final EditText etPassword = (EditText)findViewById(R.id.etPassword);
        final TextView registerLink = (TextView)findViewById(R.id.tvRegister);

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this,RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                validate(etUsername.getText().toString(),etPassword.getText().toString());
            }
        });
    }
    private void validate( String userName,String userPassword)
    {
        if((userName.equals("Admin")) && (userPassword.equals("12345")))
        {
            Intent intent = new Intent(LoginActivity.this, UserAreaActivity.class);
            Toast myToast = Toast.makeText(getApplicationContext(),"Login Successful!",Toast.LENGTH_LONG);
            myToast.show();
            startActivity(intent);

        }
        else
        {
            Toast myToast = Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG);
            myToast.show();
        }
    }
}
