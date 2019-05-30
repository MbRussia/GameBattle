package com.example.gamebattle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private void startBattle(){

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("привет андроид");

        final TextView tvInfo = findViewById(R.id.tv_info);
        Button btnButton = findViewById(R.id.btn_battle);
        tvInfo.setText(getString(R.string.dima));

        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInfo.setText(getString(R.string.pasha));
                startBattle();

            }
        });

    }
}