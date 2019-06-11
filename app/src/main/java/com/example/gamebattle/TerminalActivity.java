package com.example.gamebattle;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class TerminalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminal);
        EditText etPin = findViewById(R.id.et_pin);
        etPin.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                System.out.println("beforeTextChanged"+s.toString()+" START "+start+" COUNT "+count+" AFTER "+after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                System.out.println("onTextChanged"+s.toString()+" START "+start+" COUNT "+count+" BEFORE "+before);
            }

            @Override
            public void afterTextChanged(Editable s) {
                System.out.println("afterTextChanged"+s.toString());

            }
        });
    }
}
