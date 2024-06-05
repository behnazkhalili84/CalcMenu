package com.example.behnaz6282669.ui.sub

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.behnaz6282669.R

class Subtraction : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_subtraction, container, false)
        val editNum1 =view.findViewById<EditText>(R.id.editNum1)
        val editNum2 =view.findViewById<EditText>(R.id.editNum2)
        val btnAdd = view.findViewById<Button>(R.id.btnSub)
        val txtResult = view.findViewById<TextView>(R.id.result)

        btnAdd.setOnClickListener{

            val num1Str = editNum1.text.toString()
            val num2Str = editNum2.text.toString()
            if(editNum1.text.toString().isEmpty() || editNum2.text.toString().isEmpty()){
                Toast.makeText(context, "Please enter both Num1 and Num2", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val num1 = num1Str.toFloatOrNull()
            val num2 = num2Str.toFloatOrNull()
            val result = num1?.minus(num2!!)

            txtResult.text = result.toString()

        }

        return view
    }
}
