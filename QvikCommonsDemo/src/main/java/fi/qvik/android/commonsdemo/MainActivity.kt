package fi.qvik.android.commonsdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import fi.qvik.android.commons.utils.underline

class MainActivity : AppCompatActivity() {

    private lateinit var binding: fi.qvik.android.commonsdemo.databinding.ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.hello.underline(true)
    }
}
