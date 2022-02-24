package com.example.mapcheckinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mapcheckinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingMainActivity: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainActivity = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMainActivity.root)

        bindingMainActivity.activityMainBtnGoMap.setOnClickListener {
            startActivity(Intent(this@MainActivity, MapsActivity::class.java))
        }

        bindingMainActivity.activityMainTvLatitude.text = intent.getDoubleExtra("Latitude", 0.0).toString()
        bindingMainActivity.activityMainTvLongitude.text = intent.getDoubleExtra("Longitude", 0.0).toString()
    }
}