package com.example.viewpagerlivedata

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.MutableLiveData
import com.example.viewpagerlivedata.adapter.ViewPagerAdapter
import com.example.viewpagerlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var myViewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        myViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        binding.viewPager.adapter = myViewPagerAdapter
    }
}

object MyData {
    var liveData = MutableLiveData<String>()
}