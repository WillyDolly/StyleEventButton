package com.popland.pop.styleeventbutton;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityListener extends AppCompatActivity implements View.OnClickListener{
EditText edtX, edtY;
    TextView txtv;
    Button btnNew, btnCal, btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_listener);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        edtX = (EditText)findViewById(R.id.EDTx);
        edtY = (EditText)findViewById(R.id.EDTy);
        txtv = (TextView)findViewById(R.id.TV);
        btnNew =(Button)findViewById(R.id.BTNnew);
        btnCal =(Button)findViewById(R.id.BTNcal);
        btnExit =(Button)findViewById(R.id.BTNexit);
        btnNew.setOnClickListener(this);
        btnCal.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btnNew){//so sánh theo đối tượng
            edtX.setText("");
            edtY.setText("");
            txtv.setText("");
            edtX.requestFocus();
        }
        else if(v.getId()== R.id.BTNcal){//so sánh theo Id
            int x = Integer.parseInt(edtX.getText().toString());
            int y = Integer.parseInt(edtY.getText().toString());
            int kq = 4*x + 5*y;
            txtv.setText(String.valueOf(kq));
        }
        else if(v.getId()== R.id.BTNexit)
            finish();// đóng Activity hiện tại, quay về Activity trước nó
    }
}
