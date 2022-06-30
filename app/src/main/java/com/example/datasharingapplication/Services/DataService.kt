package com.example.datasharingapplication.Services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.datasharingapplication.DataSharingFile

class DataService : Service() {


    override fun onBind(intent: Intent): IBinder {
        val binder = object : DataSharingFile.Stub() {
            override fun sendData(): String {
                return "Hey, i am returned from Data Sharing application"
            }


        }
        return binder
    }
}