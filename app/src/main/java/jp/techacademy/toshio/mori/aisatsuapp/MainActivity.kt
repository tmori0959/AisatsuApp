package jp.techacademy.toshio.mori.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import androidx.appcompat.app.AlertDialog
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.text = "挨拶ボタンですよ！"
        button1.setOnClickListener(this)

    }

    // 時間の表示
    override fun onClick(v: View) {
        showTimePickerDialog()
    }

// 時刻による挨拶の振り分け
    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(

        this,
        TimePickerDialog.OnTimeSetListener { view, hour, minute ->
            Log.d("AisatsuApp", "$hour:$minute")
            if ( hour >= 2 && hour < 10) {
            textView.text = "おはよう"
        } else if ( hour >=10 && hour < 18) {
            textView.text = "こんにちは"
        } else {
            textView.text = "こんばんは"
        }
        },
            13, 0, true)
    timePickerDialog.show()



        }

}