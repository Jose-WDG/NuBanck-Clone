package com.brq.nubanckclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brq.nubanckclone.fragment.ItensFragment
import com.brq.nubanckclone.fragment.login_fragment

class SystemAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_system_app)

        var fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.container_fragment_system, ItensFragment()).commit()
    }
}
