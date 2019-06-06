package com.example.gamebattle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gamebattle.typeWarriors.Archer;
import com.example.gamebattle.typeWarriors.Viking;
import com.example.gamebattle.typeWarriors.Warrior;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

private Button btnSelectBattle;
private Button btnSelectTerminal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSelectBattle = findViewById(R.id.btn_select_battle);
        btnSelectTerminal = findViewById(R.id.btn_select_terminal);

        btnSelectBattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, new BattleActivity()));
            }
        });

        btnSelectTerminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }




}