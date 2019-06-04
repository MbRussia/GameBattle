package com.example.gamebattle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gamebattle.typeWarriors.Archer;
import com.example.gamebattle.typeWarriors.Viking;
import com.example.gamebattle.typeWarriors.Warrior;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int numberWarriors = 10;
    private boolean loop = true;
    private ArrayList<Warrior> warriorUnitRight = new ArrayList<>(numberWarriors);
    private ArrayList<Warrior> warriorUnitLeft = new ArrayList<>(numberWarriors);
    private Random rnd = new Random();
    private TextView tvInfo;
    private Button btnButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = findViewById(R.id.tv_info);
        btnButton = findViewById(R.id.btn_battle);
        tvInfo.setText(getString(R.string.battleView));

        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInfo.setText(getString(R.string.startGame));
                startBattle();


            }
        });

    }

    private void startBattle() {

        for (int i = 0; i < (numberWarriors); i++) {
            warriorUnitRight.add(new Viking());
            warriorUnitLeft.add(new Archer());
        }

        while (loop) {
            int attack = rnd.nextInt(2);
            Warrior unitRight = warriorUnitRight.get(rnd.nextInt(warriorUnitRight.size()));
            Warrior unitLeft = warriorUnitLeft.get(rnd.nextInt(warriorUnitLeft.size()));

            if (attack == 0) {
                unitLeft.takeDamage(unitRight.attack());
                if (!unitLeft.isAlive()) {
                    warriorUnitLeft.remove(unitLeft);
                    tvInfo.append(unitLeft.toString());
                }
            } else {
                unitRight.takeDamage(unitLeft.attack());
                if (!unitRight.isAlive()) {
                    warriorUnitRight.remove(unitRight);
                    tvInfo.append(unitRight.toString());
                }
            }

            if (warriorUnitRight.isEmpty() || warriorUnitLeft.isEmpty()) {
                loop = false;
            }

        }
    }


}