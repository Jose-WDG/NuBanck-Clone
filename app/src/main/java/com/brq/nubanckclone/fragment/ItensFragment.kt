package com.brq.nubanckclone.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.brq.nubanckclone.R
import kotlinx.android.synthetic.main.activity_system_app.view.*

/**
 * A simple [Fragment] subclass.
 */
class ItensFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_itens, container, false)
        return view
    }


}
