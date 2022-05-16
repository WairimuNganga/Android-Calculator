package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd:Button
    lateinit var btnSubtraction:Button
    lateinit var btnMultiply:Button
    lateinit var btnDivision:Button
    lateinit var etNumber1:EditText
    lateinit var etNumber2:EditText
    lateinit var tvAnswer:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtraction=findViewById(R.id.btnSubtraction)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnDivision=findViewById(R.id.btnDivision)
        etNumber1=findViewById(R.id.etNumber1)
        etNumber2=findViewById(R.id.etNumber2)
        tvAnswer=findViewById(R.id.tvAnswer)

        btnAdd.setOnClickListener{
            tvAnswer.text=""
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()
            if (number1.isBlank()){
                etNumber1.setError("Enter number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                etNumber2.setError("Enter number")
                return@setOnClickListener
            }
            addittion(number1.toDouble(),number2.toDouble())
        }

        btnSubtraction.setOnClickListener{
            tvAnswer.text=""
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()
            if (number1.isBlank()){
                etNumber1.setError("Enter number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                etNumber2.setError("Enter number")
                return@setOnClickListener
            }
            subtraction(number1.toDouble(),number2.toDouble())
        }
        btnMultiply.setOnClickListener{
            tvAnswer.text=""
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()

            if (number1.isBlank()){
                etNumber1.setError("Enter number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                etNumber2.setError("Enter number")
                return@setOnClickListener
            }
            multiplication(number1.toDouble(),number2.toDouble())
        }
        btnDivision.setOnClickListener{
            tvAnswer.text=""
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()

            if (number1.isBlank()){
                etNumber1.setError("Enter number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                etNumber2.setError("Enter number")
                return@setOnClickListener
            }
            division(number1.toDouble(),number2.toDouble())
        }
    }
    fun addittion(number1:Double,number2:Double){
        val sum = number1+number2
        tvAnswer.text=sum.toString()
    }
    fun subtraction(number1: Double,number2: Double){
        val subtract = number1-number2
        tvAnswer.text=subtract.toString()
    }
    fun multiplication(number1: Double,number2: Double){
        val multiply = number1*number2
        tvAnswer.text=multiply.toString()
    }
    fun division(number1: Double,number2: Double){
        val divide = number1/number2
        tvAnswer.text = divide.toString()
    }
}