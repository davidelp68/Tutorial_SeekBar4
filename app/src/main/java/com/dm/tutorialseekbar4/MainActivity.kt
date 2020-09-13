package com.dm.tutorialseekbar4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar                           //Importazione della Classe: SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //variabile di appoggio per memorizzare il valore di progress
    private var value: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                //inserire qui il codice che deve essere eseguito quando si sposta il cursore
                value = progress-10
                //visualizzare il risultato nella TextView
                textView.text = value.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                //inserire qui il codice che deve essere eseguito quando si inizia a
                //spostare il cursore
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                //inserire qui il codice che deve essere eseguito quando si finisce di
                //spostare il cursore
            }
        })
        }
    }
