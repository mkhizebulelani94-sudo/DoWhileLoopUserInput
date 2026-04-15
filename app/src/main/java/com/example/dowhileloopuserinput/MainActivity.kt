package com.example.dowhileloopuserinput

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dowhileloopuserinput.ui.theme.DoWhileLoopUserInputTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editNumber)
        val button = findViewById<Button>(R.id.btnReset)
        val textView = findViewById<TextView>(R.id.txtOutput)

        button.setOnClickListener {

            val input = editText.text.toString()

            if (input.isEmpty()){
                textView.text = "Please enter a number"
                return@setOnClickListener
            }
            val number = input.toInt()

            var i = 1
            var result = ""

            //Do while loop
            do {
                result+= "$i\n"
            } while (i <= number)

            textView.text = result
        }

    }
}
