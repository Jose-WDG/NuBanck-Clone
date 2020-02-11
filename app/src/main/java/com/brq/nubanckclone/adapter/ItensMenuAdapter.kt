package com.brq.nubanckclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.brq.nubanckclone.R
import com.brq.nubanckclone.model.CardsMenus
import kotlinx.android.synthetic.main.menu_item.view.*

class ItensMenuAdapter(
    var listOfCards: ArrayList<CardsMenus>,
    var context: Context
) : RecyclerView.Adapter<ItensMenuAdapter.ItensMenuViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItensMenuViewHolder {
        val inflate = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.menu_item, parent, false)
        return ItensMenuViewHolder(inflate)
    }

    override fun getItemCount(): Int {
        return listOfCards.size
    }

    override fun onBindViewHolder(holder: ItensMenuViewHolder, position: Int) {
        var cardsMenus = listOfCards[position]
        holder.urlImage.setImageDrawable(
            ContextCompat.getDrawable(context,cardsMenus.urlImg)
        )
        holder.texto.text = cardsMenus.texto
    }

    class ItensMenuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var urlImage: ImageView = view.img_menu
        var texto: TextView = view.txt_menu_item
    }
}