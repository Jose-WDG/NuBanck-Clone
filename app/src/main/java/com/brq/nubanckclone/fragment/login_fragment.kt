package com.brq.nubanckclone.fragment
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.brq.nubanckclone.R
import com.brq.nubanckclone.SystemAppActivity
import kotlinx.android.synthetic.main.fragment_login_fragment.view.*
/**
 * A simple [Fragment] subclass.
 */
class login_fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_login_fragment, container, false)
        view.submit_login.setOnClickListener({
            var intent = Intent(context, SystemAppActivity::class.java)
            startActivity(intent)
        })
        return view

    }


}
