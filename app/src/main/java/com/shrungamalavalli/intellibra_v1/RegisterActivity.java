package com.shrungamalavalli.intellibra_v1;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etName = (EditText)findViewById(R.id.etName);
        final EditText etUsername = (EditText)findViewById(R.id.etUsername);
        final EditText etPassword = (EditText)findViewById(R.id.etPassword);
        final EditText etRetypePassword = (EditText)findViewById(R.id.etRetypePassword);
        final EditText etEmail =(EditText)findViewById(R.id.etEmail);
        final Button btnRegister = (Button)findViewById(R.id.btnRegister);

        //Placeholder - REMOVE ********************************************************************************
        btnRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(RegisterActivity.this, CalibrateActivity.class);
                Toast myToast = Toast.makeText(getApplicationContext(),"Login Successful!",Toast.LENGTH_LONG);
                myToast.show();
                startActivity(intent);
            }
        });

        //Placeholder - REMOVE *********************************************************************************
    }
}
