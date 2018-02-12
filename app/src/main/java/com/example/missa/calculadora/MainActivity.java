package com.example.missa.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.widget.SeekBar.*;

public class MainActivity extends AppCompatActivity {

    private SeekBar barra;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barra = (SeekBar)findViewById(R.id.seekBar);
        resultado = (TextView)findViewById(R.id.textView);

        barra.setProgress(0);
        barra.setMax(10);

        barra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int num, boolean fromUser) {
                String cad="";
                for(int i = 1; i < 11; i++){
                    int res = i*num;
                    cad +=num+"x"+i+"= "+res+"\n";
                }
                resultado.setText(cad);
            }

            //hace un llamado  cuando se toca la perilla
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            //hace un llamado  cuando se detiene la perilla
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


    }

}
