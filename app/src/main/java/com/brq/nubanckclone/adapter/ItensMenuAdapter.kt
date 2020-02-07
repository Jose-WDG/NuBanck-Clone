package com.brq.nubanckclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.brq.nubanckclone.R

class ItensMenuAdapter : RecyclerView.Adapter<ItensMenuAdapter.ItensMenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItensMenuViewHolder {
        val inflate = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.menu_item, parent, false)
        return ItensMenuViewHolder(inflate)
    }

    override fun getItemCount(): Int {
       return 3
    }

    override fun onBindViewHolder(holder: ItensMenuViewHolder, position: Int) {

    }

    class ItensMenuViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}