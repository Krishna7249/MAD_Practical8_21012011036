package com.example.mad_practical8_21012011036

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextClock
import android.widget.TimePicker
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val card = findViewById<MaterialCardView>(R.id.card1)
        val createAlarm = findViewById<MaterialButton>(R.id.create)
        createAlarm.setOnClickListener{
            TimePickerDialog(this,{tp,hour,minute -> setAlarmTime(hour,minute)},11,0,false).show()
        }
    }
    fun setAlarmTime(hour:Int,minute:Int){
        //card.visibility= View.GONE
    }
}