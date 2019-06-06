package com.example.gamebattle;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_info)
    TextView tvInfo;
    @BindView(R.id.btn_select_battle)
    Button btnSelectBattle;
    @BindView(R.id.btn_select_terminal)
    Button btnSelectTerminal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick({R.id.btn_select_battle, R.id.btn_select_terminal, R.id.tv_info})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_select_battle:
                startActivity(new Intent(MainActivity.this, BattleActivity.class));
                break;
            case R.id.btn_select_terminal:
                startActivity(new Intent(MainActivity.this, TerminalActivity.class));
                break;
            case R.id.tv_info:
                Toast.makeText(this, "new word", Toast.LENGTH_SHORT).show();
                Snackbar.make(btnSelectBattle, "привет", Snackbar.LENGTH_SHORT ).show();
                break;
        }
    }
}