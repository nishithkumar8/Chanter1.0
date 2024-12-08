package com.example.chanter

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var counter = 0;
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.setBackgroundColor(Color.parseColor("#008080"))
        val count:TextView=findViewById(R.id.counter);
        val inc: Button =findViewById(R.id.increase);
        val dec: Button=findViewById(R.id.decrease);
        val reset: Button=findViewById(R.id.reset);

        fun updateCounterText() {
            count.text = String.format(getString(R.string.counter), counter)
        }

        updateCounterText();
        inc.setOnClickListener{
            if(counter<600) {
                counter++;
                updateCounterText();
            }
        }

        dec.setOnClickListener{
            if(counter>0){
                counter--;
                updateCounterText();
            }
        }

        reset.setOnClickListener{
            counter=0;
            updateCounterText();
        }




    }
}