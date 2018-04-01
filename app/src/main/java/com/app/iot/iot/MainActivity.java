package com.app.iot.iot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public String a = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText text = (EditText) findViewById(R.id.editText) ;
        Button up= (Button)findViewById(R.id.up);
        Button down= (Button)findViewById(R.id.down);
        Button left= (Button)findViewById(R.id.left);
        Button right= (Button)findViewById(R.id.right);
        Button set= (Button)findViewById(R.id.set);
        Button clr= (Button)findViewById(R.id.button7);

        final TextView text2 = (TextView)findViewById(R.id.textView);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a+"Up";
                String b = text.getText().toString();
                a = a+b;
                Toast.makeText(MainActivity.this, "Up"+b+" added to string", Toast.LENGTH_LONG).show();
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a+"Down";
                String b = text.getText().toString();
                a = a+b;
                Toast.makeText(MainActivity.this, "Down"+b+" added to string", Toast.LENGTH_LONG).show();

            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a+"Left";
                String b = text.getText().toString();
                a = a+b;
                Toast.makeText(MainActivity.this, "Left"+b+" added to string", Toast.LENGTH_LONG).show();

            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a+"Right";
                String b = text.getText().toString();
                a = a+b;
                Toast.makeText(MainActivity.this, "Right"+b+" added to string", Toast.LENGTH_LONG).show();

            }
        });
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(a);
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="";
                text2.setText(a);
            }
        });

    }
}
