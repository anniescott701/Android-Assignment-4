
package com.scott.annie.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Usernameedt,passwordedt;
    Button submit,reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usernameedt=(EditText) findViewById(R.id.Username);
        passwordedt=(EditText) findViewById(R.id.Password);

        submit= (Button) findViewById(R.id.subbtn);
        reset=(Button) findViewById(R.id.resbtn);





        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=Usernameedt.getText().toString();
                String pwd=passwordedt.getText().toString();

                if(name.equals("Annie")&&pwd.equalsIgnoreCase("Annie701")){
                    Toast.makeText(getApplicationContext(),"LOGIN IS SUCCESSFULL !",Toast.LENGTH_LONG).show();}
                else
                    Toast.makeText((getApplicationContext()),"LOGIN IS FAILED !",Toast.LENGTH_SHORT).show();
            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usernameedt.setText("");
                passwordedt.setText("");
            }
        });

            }

    }

