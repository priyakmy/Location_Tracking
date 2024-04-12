package com.example.location_tracking

import android.app.Service
import android.content.Intent
import android.os.IBinder


class LocationTrackingService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Start location updates here
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        // Stop location updates here
        super.onDestroy()
    }
}
