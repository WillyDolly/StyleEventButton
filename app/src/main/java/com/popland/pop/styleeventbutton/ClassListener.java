package com.popland.pop.styleeventbutton;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ClassListener extends AppCompatActivity {
    public EditText edt;
    TextView txtv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_listener);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClassListener.this, ActivityListener.class);
                startActivity(i);
            }
        });
        edt = (EditText)findViewById(R.id.EDT);
        txtv = (TextView)findViewById(R.id.TV);
        btn = (Button) findViewById(R.id.BTN);
        btn.setOnClickListener(new myEvent());
    }

    class myEvent implements OnClickListener {// class này nằm trong public class ClassListener

        @Override
        public void onClick(View v) {
            int mu = Integer.parseInt(edt.getText().toString());
            double kq = Math.pow(5, mu);//Math.pow(cơ số, mũ) phải là double
            DecimalFormat dcf = new DecimalFormat("#");// định dạng số lẻ sau dấu phẩy
            txtv.setText(dcf.format(kq));//dcf.format() trả về String
        }
    }
}