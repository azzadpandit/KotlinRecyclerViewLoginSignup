package com.example.kotlin_project

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class login_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login_, container, false)
        val btndashbord = view.findViewById<View>(R.id.login) as Button
        // button init
        btndashbord.setOnClickListener {
            val intent=Intent(activity,dashbord::class.java)
            startActivity(intent)
        }

        return view;
    }
}
