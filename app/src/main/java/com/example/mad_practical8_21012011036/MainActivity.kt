package com.example.mad_practical8_21012011036

import android.app.AlarmManager
import android.app.PendingIntent
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addAlarm : MaterialButton = findViewById(R.id.create)

        val card : MaterialCardView = findViewById(R.id.card1)

        card.visibility = View.GONE

        addAlarm.setOnClickListener {
            TimePickerDialog(this, {tp, hour, minute -> setAlarmTime(hour, minute)}, 11,0,false).show()
        }
    }

    fun setAlarmTime(hour : Int, minute : Int){
        //card.visibility = View.VISIBLE
    }

    fun setAlarm(millisitime : Long, action : String) {
        val intentalarm = Intent(applicationContext, AlarmBroadcastReceiver::class.java)
        val pendingintent = PendingIntent.getBroadcast(
            applicationContext,
            4356,
            intentalarm,
            PendingIntent.FLAG_UPDATE_CURRENT
        )
        val alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        // if(str == "Start"){
        //AlarmManager.RTC_WAKEUP,
        //millisitime,
        //pendingintent
        //}
        //else if(str == "Stop"){
          //  alarmManager.cancel(pendingintent)
        //}
    }
}