package com.example.uex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ScrollView
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import com.tyme.solar.SolarTime



class MainActivity : AppCompatActivity() {

    private lateinit var myView: View
    private lateinit var saveButton: Button
    private lateinit var scrollView: ScrollView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val now = LocalDateTime.now()

        val eightChar2 = SolarTime.fromYmdHms(
            now.year, now.monthValue, now.dayOfMonth,
            now.hour, now.minute, now.second
        ).lunarHour.eightChar


        // 格式化当前时间格式化当前时间

        myView = findViewById(R.id.myView)
        saveButton = findViewById(R.id.saveButton)
        scrollView = findViewById(R.id.scrollView)

        saveButton.setOnClickListener {
            ScreenshotUtils.captureAndShowScreenshot(this, scrollView, eightChar2.toString())

        }
    }
}
