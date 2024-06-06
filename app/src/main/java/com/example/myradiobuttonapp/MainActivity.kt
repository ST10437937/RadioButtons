package com.example.myradiobuttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val group = findViewById<RadioGroup>(R.id.markdRbGroup)
        val btnShow = findViewById<Button>(R.id.btnShow)
        val txtResults = findViewById<TextView>(R.id.txtResults)

        btnShow.setOnClickListener {
            val selectedRadioButton = group.checkedRadioButtonId
            var markRange = ""
            if (selectedRadioButton == R.id.radioA)
            {
                markRange = "100-91"
            }
            else if (selectedRadioButton == R.id.RadioB)
            {
                markRange = "91-81"
            }
            else if (selectedRadioButton == R.id.RadioC)
            {
                markRange = "81-71"
            }
            else
            {
                markRange="Invalid"
            }
            txtResults.text = "Mark range : $markRange"
        }

    }
}







                /*when(selectedRadioButton)
                {
                   R.id.radioA ->"100-90"
                    R.id.RadioB ->"90-81"
                    R.id.RadioC ->"80-71"
                    else -> "Invalid"
                }
            txtResults.text = "Marks range: $marksRange"

            if statement
            val markRange = ""
            if(selectedRadioBtn == R.id.radioA)
            {
                 marksRange"100-91"
            }



        }

    }
*/