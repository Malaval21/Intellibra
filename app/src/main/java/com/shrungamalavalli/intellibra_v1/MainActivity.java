package com.shrungamalavalli.intellibra_v1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity
{
    //private EditText userName;
    //private EditText password;
    //private Button login;
    private static int SPLASH_TIME_OUT = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);

        //userName = (EditText)findViewById(R.id.etName);
        //password = (EditText)findViewById(R.id.etPassword);
        //login = (Button)findViewById(R.id.btnLogin);

        /*login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                validate(userName.getText().toString(),password.getText().toString());
            }
        });*/

    }

    /*private void validate( String userName,String userPassword)
    {
        if((userName.equals("Admin")) && (userPassword.equals("12345")))
        {
            Intent intent = new Intent(MainActivity.this, UserAreaActivity.class);
            Toast myToast = Toast.makeText(getApplicationContext(),"Login Successful!",Toast.LENGTH_LONG);
            myToast.show();
            startActivity(intent);

        }
        else
        {
            Toast myToast = Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG);
            myToast.show();
        }
    }*/
}
