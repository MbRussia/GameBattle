package com.example.gamebattle;


import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gamebattle.typeWarriors.Archer;
import com.example.gamebattle.typeWarriors.Viking;
import com.example.gamebattle.typeWarriors.Warrior;

import java.util.ArrayList;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class BattleActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_battle);

        tvInfo = findViewById(R.id.tv_info);
        tvInfo.setMovementMethod(new ScrollingMovementMethod());
        btnButton = findViewById(R.id.btn_battle);
        tvInfo.setText(getString(R.string.battleView));

        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInfo.append(getString(R.string.start_game));
                startBattle();
            }
        });
    }

    private void startBattle() {

        for (int i = 0; i < (numberWarriors); i++) {
            warriorUnitRight.add(new Viking());
            warriorUnitLeft.add(new Archer());
        }
        tvInfo.append(DateHelper.getFormattedStartDate() + "\n");
        while (loop) {
            int attack = rnd.nextInt(2);
            Warrior unitRight = warriorUnitRight.get(rnd.nextInt(warriorUnitRight.size()));
            Warrior unitLeft = warriorUnitLeft.get(rnd.nextInt(warriorUnitLeft.size()));
            DateHelper.skipTime();
            if (attack == 0) {
                unitLeft.takeDamage(unitRight.attack());
                tvInfo.append(unitLeft.toString() + "\n");
                // Нужно информативно вывести ход боя
                if (!unitLeft.isAlive()) {
                    warriorUnitLeft.remove(unitLeft);
                }
            } else {
                unitRight.takeDamage(unitLeft.attack());
                tvInfo.append(unitRight.toString() + "\n");
                if (!unitRight.isAlive()) {
                    warriorUnitRight.remove(unitRight);
                }
            }

            if (warriorUnitRight.isEmpty() || warriorUnitLeft.isEmpty()) {
                tvInfo.append("Время " + DateHelper.getFormattedDiff());
                loop = false;
                if (warriorUnitLeft.isEmpty()) {
                    // правильно проверить выход и вывести победившую команду
                }
            }

        }
    }
}
