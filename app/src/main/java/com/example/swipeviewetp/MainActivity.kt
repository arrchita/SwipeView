package com.example.swipeviewetp

import ViewPagerAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.swipeviewetp.R

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2 // Declare at the class level

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)

        val images = listOf(
            R.drawable.flowers,
            R.drawable.dum
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter

    }
}
