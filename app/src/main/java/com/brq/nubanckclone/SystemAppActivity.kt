package com.brq.nubanckclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.brq.nubanckclone.adapter.ItensMenuAdapter
import com.brq.nubanckclone.fragment.ItensFragment
import com.brq.nubanckclone.fragment.login_fragment
import kotlinx.android.synthetic.main.activity_system_app.*

class SystemAppActivity : AppCompatActivity() {
    private var vetorDeImage: ArrayList<ImageView> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_system_app)
        configuraFragments()
        configuraDots()
        var linearLayout =  LinearLayoutManager(this)
        linearLayout.orientation = RecyclerView.HORIZONTAL
        itens_list_System.layoutManager = linearLayout
        itens_list_System.adapter = ItensMenuAdapter()

    }

    private fun configuraFragments() {
        var fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.container_fragment_system, ItensFragment())
            .commit()
    }

    private fun configuraDots() {
        for (i in 0..2) {
            vetorDeImage.add(ImageView(this))
            vetorDeImage[i].setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.inactive_dots
                )
            )
            var layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            layoutParams.setMargins(16, 0, 16, 0)
            container_dots.addView(vetorDeImage[i], layoutParams)

        }
        vetorDeImage[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.active_dot))
    }
}
