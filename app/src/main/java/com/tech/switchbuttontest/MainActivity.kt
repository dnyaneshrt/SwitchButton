package com.tech.switchbuttontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
            {
                textView.visibility= View.VISIBLE
                //it will excecute only when the switch button is checked
              textView.setText("it's on")
            }else
            {
                textView.visibility= View.VISIBLE
                textView.setText("it's off")
            }
        }
    }
}