package com.brq.nubanckclone

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat.animate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.brq.nubanckclone.adapter.ItensMenuAdapter
import com.brq.nubanckclone.fragment.ItensFragment
import com.brq.nubanckclone.model.CardsMenus
import kotlinx.android.synthetic.main.activity_system_app.*

class SystemAppActivity : AppCompatActivity() {
    private var vetorDeImage: ArrayList<ImageView> = ArrayList()
    private var listaDeCategoria: ArrayList<CardsMenus> = ArrayList()
    private var y: Float = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_system_app)
        configuraFragments()
        configuraDots()
        configuraItensMenu()

        container_fragment_system.setOnTouchListener(View.OnTouchListener { view, motionEvent ->

            when (motionEvent.action) {
                MotionEvent.ACTION_UP -> {

                }

                MotionEvent.ACTION_DOWN -> {
                    y = view.y - motionEvent.rawY
                }

                MotionEvent.ACTION_MOVE -> {
                    animate(view)
                        .y(motionEvent.rawY + y)
                        .setDuration(0)
                        .start()
                }
            }
            true
        })
    }

    private fun configuraItensMenu() {
        listaDeCategoria.add(CardsMenus(R.drawable.adicionar_med, "Indica amigo"))
        listaDeCategoria.add(CardsMenus(R.drawable.adicionar_med, "Ajusta limite"))
        listaDeCategoria.add(CardsMenus(R.drawable.adicionar_med, "Bloquear cartão"))
        listaDeCategoria.add(CardsMenus(R.drawable.adicionar_med, "Cartão virtual"))
        listaDeCategoria.add(CardsMenus(R.drawable.adicionar_med, "Pagar"))
        listaDeCategoria.add(CardsMenus(R.drawable.adicionar_med, "Me ajuda"))
        listaDeCategoria.add(CardsMenus(R.drawable.adicionar_med, "Organizar atalhos"))
        val linearLayout = LinearLayoutManager(this)
        linearLayout.orientation = RecyclerView.HORIZONTAL
        itens_list_System.layoutManager = linearLayout
        itens_list_System.adapter = ItensMenuAdapter(listaDeCategoria, applicationContext)
    }


    private fun configuraFragments() {
        val fragmentManager = supportFragmentManager
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
            val layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            layoutParams.setMargins(16, 0, 16, 0)
            container_dots.addView(vetorDeImage[i], layoutParams)

        }
        vetorDeImage[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.active_dot))
    }
}
