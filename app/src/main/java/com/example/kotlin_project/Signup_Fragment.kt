package com.example.kotlin_project

import android.os.Bundle
import android.view.FrameMetrics
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager

class Signup_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    )
            : View? {
        val view = inflater.inflate(R.layout.fragment_signup_, container, false)
        val sign_up = view.findViewById<View>(R.id.sign_up) as Button
        sign_up.setOnClickListener {
            activity?.getSupportFragmentManager()!!.beginTransaction()
                .replace(R.id.mainhost, login_Fragment())
                .commit();

        }
        return view;
    }
}