package com.app.onboardingscreen.onboardering

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.app.onboardingscreen.R
import kotlinx.android.synthetic.main.fragment_a.view.*
import kotlinx.android.synthetic.main.fragment_c.view.*


class CFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_c, container, false)
        val viewPager2 = activity?.findViewById<ViewPager2>(R.id.viewpager)
        view.btnFinish.setOnClickListener {
            onBoardFinish()
            findNavController().navigate(R.id.action_onBoardFragment_to_homeFragment)
        }
        return view
    }
    private fun onBoardFinish(){
        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putBoolean("finish",true)
            apply()
        }
    }
}