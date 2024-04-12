package com.example.location_tracking

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Handle button clicks
        startButton.setOnClickListener {
            startLocationService()
        }

        stopButton.setOnClickListener {
            stopLocationService()
        }
    }

    private fun startLocationService() {
        val serviceIntent = Intent(this, LocationTrackingService::class.java)
        ContextCompat.startForegroundService(this, serviceIntent)
    }

    private fun stopLocationService() {
        val serviceIntent = Intent(this, LocationTrackingService::class.java)
        stopService(serviceIntent)
    }
}
