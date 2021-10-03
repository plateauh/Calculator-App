package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

private lateinit var resultTextView: TextView
private lateinit var buttonsList: ArrayList<Button>

//private lateinit var btn0: Button
//private lateinit var btn1: Button
//private lateinit var btn2: Button
//private lateinit var btn3: Button
//private lateinit var btn4: Button
//private lateinit var btn5: Button
//private lateinit var btn6: Button
//private lateinit var btn7: Button
//private lateinit var btn8: Button
//private lateinit var btn9: Button

private lateinit var deleteBtn: Button
private lateinit var clearBtn: Button

private lateinit var signBtn: Button
private lateinit var decimalBtn: Button
private lateinit var equalBtn: Button

private lateinit var addBtn: Button
private lateinit var subtractBtn: Button
private lateinit var multiplyBtn: Button
private lateinit var divideBtn: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultTextView = findViewById(R.id.result_tv)
        Log.d("ID", resultTextView.id.toString())
//        initiateButtons()


    }

    private fun initiateButtons() {
        // buttons initiation
        buttonsList = arrayListOf(
            findViewById(R.id.number_0),
            findViewById(R.id.number_1),
            findViewById(R.id.number_2),
            findViewById(R.id.number_3),
            findViewById(R.id.number_4),
            findViewById(R.id.number_5),
            findViewById(R.id.number_6),
            findViewById(R.id.number_7),
            findViewById(R.id.number_8),
            findViewById(R.id.number_9),
            findViewById(R.id.delete_btn),
            findViewById(R.id.clear_btn),
            findViewById(R.id.sign_btn),
            findViewById(R.id.decimal_btn),
            findViewById(R.id.equal_btn),
            findViewById(R.id.addition_btn),
            findViewById(R.id.subtraction_btn),
            findViewById(R.id.multiply_btn),
            findViewById(R.id.divide_btn)
        )

        for (button in buttonsList)
            button.setOnClickListener { numberEntries(button.id) }
    }


    private fun numberEntries (viewID: Int){

        val currentOperation = resultTextView.text.toString()
        when (viewID) {
            R.id.number_0 -> {
                resultTextView.text = "$currentOperation 0"
            }
            R.id.number_1 -> {
                resultTextView.text = "$currentOperation 1"
            }
            R.id.number_2 -> {
                resultTextView.text = "$currentOperation 2"
            }
            R.id.number_3 -> {
                resultTextView.text = "$currentOperation 3"
            }
            R.id.number_4 -> {
                resultTextView.text = "$currentOperation 4"
            }
            R.id.number_5 -> {
                resultTextView.text = "$currentOperation 5"
            }
            R.id.number_6 -> {
                resultTextView.text = "$currentOperation 6"
            }
            R.id.number_7 -> {
                resultTextView.text = "$currentOperation 7"
            }
            R.id.number_8 -> {
                resultTextView.text = "$currentOperation 8"
            }
            R.id.number_9 -> {
                resultTextView.text = "$currentOperation 9"
            }
        }
    }
}

