package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

private lateinit var resultTextView: TextView
private lateinit var buttonsList: ArrayList<Button>
private lateinit var operationArray: Array<String>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultTextView = findViewById(R.id.result_tv)
        operationArray = arrayOf("", "", "")
        initiateButtons()
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
            button.setOnClickListener { entries(button.id) }
    }


    private fun entries (viewID: Int){
        val index = if (operationArray[1].isEmpty()) 0 else 2
        val currentOperation = resultTextView.text.toString()
        when (viewID) {
            R.id.number_0 -> {
                operationArray[index] += "0"
                resultTextView.text = "${currentOperation}0"
            }
            R.id.number_1 -> {
                operationArray[index] += "1"
                resultTextView.text = "${currentOperation}1"
            }
            R.id.number_2 -> {
                operationArray[index] += "2"
                resultTextView.text = "${currentOperation}2"
            }
            R.id.number_3 -> {
                operationArray[index] += "3"
                resultTextView.text = "${currentOperation}3"
            }
            R.id.number_4 -> {
                operationArray[index] += "4"
                resultTextView.text = "${currentOperation}4"
            }
            R.id.number_5 -> {
                operationArray[index] += "5"
                resultTextView.text = "${currentOperation}5"
            }
            R.id.number_6 -> {
                operationArray[index] += "6"
                resultTextView.text = "${currentOperation}6"
            }
            R.id.number_7 -> {
                operationArray[index] += "7"
                resultTextView.text = "${currentOperation}7"
            }
            R.id.number_8 -> {
                operationArray[index] += "8"
                resultTextView.text = "${currentOperation}8"
            }
            R.id.number_9 -> {
                operationArray[index] += "9"
                resultTextView.text = "${currentOperation}9"
            }
            R.id.delete_btn -> {
                operationArray[index] = operationArray[index].dropLast(1)
                resultTextView.text = currentOperation.dropLast(1)
            }
            R.id.clear_btn -> {
                operationArray = arrayOf("", "", "")
                resultTextView.text = ""
            }
            R.id.sign_btn -> {
                operationArray[index] += "-"
                resultTextView.text = "$currentOperation -"
            }
            R.id.decimal_btn -> {
                operationArray[index] += "."
                resultTextView.text = "${currentOperation}."
            }
            R.id.equal_btn -> {
                operationArray = arrayOf(compute(), "", "")
                resultTextView.text = operationArray[0]
            }
            R.id.addition_btn -> {
                operationArray[1] = "+"
                resultTextView.text = "$currentOperation + "
            }
            R.id.subtraction_btn -> {
                operationArray[1] = "-"
                resultTextView.text = "$currentOperation - "
            }
            R.id.multiply_btn -> {
                operationArray[1] = "*"
                resultTextView.text = "$currentOperation * "
            }
            R.id.divide_btn -> {
                operationArray[1] = "/"
                resultTextView.text = "$currentOperation / "
            }
        }
    }

    private fun compute(): String {
            when (operationArray[1]){
                "+" -> return (operationArray[0].toFloat() + operationArray[2].toFloat()).toString()
                "-" -> return (operationArray[0].toFloat() - operationArray[2].toFloat()).toString()
                "*" -> return (operationArray[0].toFloat() * operationArray[2].toFloat()).toString()
                "/" -> {
                    if (operationArray[2].toFloat() == 0f)
                        return "Math Error"
                    return (operationArray[0].toFloat() / operationArray[2].toFloat()).toString()
                }
                else -> return ""
            }
    }
}

