package com.example.a38q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText Email,Pass;
Button b1;
Databasehelper dr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email=(EditText)findViewById(R.id.editText);
        Pass=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);
        dr=new Databasehelper(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean res=dr.Insert(Email.getText().toString(),Pass.getText().toString());
                if(res==true)
                {
                    Toast.makeText(getApplicationContext(),"inserted",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"inserted",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
