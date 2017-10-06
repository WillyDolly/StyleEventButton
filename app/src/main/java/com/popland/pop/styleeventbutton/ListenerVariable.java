package com.popland.pop.styleeventbutton;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class ListenerVariable extends AppCompatActivity {
EditText edtF, edtC;
    Button btnFC, btnCF, btnClear;
    OnClickListener ocl = new OnClickListener(){
        @Override
        public void onClick(View v) {
            int f, c;
            if(v == btnFC){
                f = Integer.parseInt(edtF.getText().toString());
               c = (f-32)*(5/9);
                edtC.setText(String.valueOf(c));
            }
            else if(v == btnCF){
                c = Integer.parseInt(edtC.getText().toString());
               f = c*(9/5)+32;
                edtF.setText(String.valueOf(f));
            }
            else if(v == btnClear){
                edtF.setText("");
                edtC.setText("");
                edtF.requestFocus();
            }
        }
    };//lưu ý kết thúc = dấu ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener_variable);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ListenerVariable.this,ClassListener.class);
                startActivity(i);
            }
        });
        edtF = (EditText)findViewById(R.id.EDTf);
        edtC = (EditText)findViewById(R.id.EDTc);
        btnFC = (Button)findViewById(R.id.BTNfToc);
        btnCF = (Button)findViewById(R.id.BTNcTof);
        btnClear = (Button)findViewById(R.id.BTNclear);

        btnCF.setOnClickListener(ocl);// gọi biến ocl
        btnFC.setOnClickListener(ocl);
        btnClear.setOnClickListener(ocl);
    }


}
