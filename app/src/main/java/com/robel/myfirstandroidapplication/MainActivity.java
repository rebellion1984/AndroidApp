package com.robel.myfirstandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtCounter;
    private Button btnPlus, btnMinus, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCounter = findViewById(R.id.txt_counter);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnReset = findViewById(R.id.btn_reset);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        // solutioin #one

        /*btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int counter = Integer.parseInt(txtCounter.getText().toString());
                counter++;
                txtCounter.setText(String.valueOf(counter));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int counter = Integer.parseInt(txtCounter.getText().toString());
                if (counter != 0) {
                    counter--;
                    txtCounter.setText(String.valueOf(counter));
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCounter.setText("0");
            }
        });*/

    }

    // solutioin #two
//    public void plusFunction(View view){
//        int counter = Integer.parseInt(txtCounter.getText().toString());
//        counter++;
//        txtCounter.setText(String.valueOf(counter));
//    }
//
//    public void minusFunction(View view) {
//        int counter = Integer.parseInt(txtCounter.getText().toString());
//        if (counter != 0) {
//            counter--;
//            txtCounter.setText(String.valueOf(counter));
//        }
//    }
//
//    public void resetFunction(View view) {
//        txtCounter.setText("0");
//    }

    // solutioin #three
//    public void operation(View view) {
//        int id = view.getId();
//        int counter=0;
//        switch (id){
//            case R.id.btn_plus:
//                counter = Integer.parseInt(txtCounter.getText().toString());
//                counter++;
//                txtCounter.setText(String.valueOf(counter));
//                break;
//
//            case R.id.btn_minus:
//                counter = Integer.parseInt(txtCounter.getText().toString());
//                    if (counter != 0) {
//                        counter--;
//                        txtCounter.setText(String.valueOf(counter));
//                    }
//                break;
//
//            case R.id.btn_reset:
//                    txtCounter.setText("0");
//                break;
//
//        }
//    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        int counter=0;
        switch (id){
            case R.id.btn_plus:
                counter = Integer.parseInt(txtCounter.getText().toString());
                counter++;
                txtCounter.setText(String.valueOf(counter));
                break;

            case R.id.btn_minus:
                counter = Integer.parseInt(txtCounter.getText().toString());
                if (counter != 0) {
                    counter--;
                    txtCounter.setText(String.valueOf(counter));
                }
                break;

            case R.id.btn_reset:
                txtCounter.setText("0");
                break;

        }
    }
}