package com.brq.nubanckclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.brq.nubanckclone.fragment.login_fragment
import kotlinx.android.synthetic.main.fragment_login_fragment.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fm = supportFragmentManager
        fm.beginTransaction().add(R.id.container_fragment,login_fragment()).commit()


    }
}
