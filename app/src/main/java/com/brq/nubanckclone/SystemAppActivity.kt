package com.brq.nubanckclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.brq.nubanckclone.fragment.ItensFragment
import com.brq.nubanckclone.fragment.login_fragment
import kotlinx.android.synthetic.main.activity_system_app.*

class SystemAppActivity : AppCompatActivity() {
    private var vetorDeImage: ArrayList<ImageView> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_system_app)

        //adicionar itens para o cliente
        var fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.container_fragment_system, ItensFragment()).commit()

        //Adiciona dots

        for( i in 0..2){
            vetorDeImage.add(ImageView(this))
            vetorDeImage[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.inactive_dots))
            var layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            layoutParams.setMargins(16,0,16,0)
            container_dots.addView(vetorDeImage[i],layoutParams)

        }
        vetorDeImage[0].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.active_dot))
    }
}
