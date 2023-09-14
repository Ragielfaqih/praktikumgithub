package com.first.praktikumgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class paymentActivity2 extends AppCompatActivity {
    private EditText EdtName;
    private EditText txtemail;
    private EditText txtpass;
    private EditText txtuang;
    private Button btnpay;
    private Spinner txtgender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment2);
        EdtName = findViewById(R.id.txt_name);
        txtemail = findViewById(R.id.txt_email);
        txtpass = findViewById(R.id.txt_pass);
        btnpay = findViewById(R.id.btn_pay);
        txtuang = findViewById(R.id.edt_total);
        txtgender = findViewById(R.id.edt_gender);
        


    }

    public void acctionsubmit(View view) {
        String Name = EdtName.getText().toString();
        String Email = txtemail.getText().toString();
        String password = txtpass.getText().toString();
        String uang = txtuang.getText().toString();


        Toast.makeText(this, " nama saya "+Name+" \nEmail saya"+Email+" \njumlah :" +uang , Toast.LENGTH_LONG).show();
    }
}