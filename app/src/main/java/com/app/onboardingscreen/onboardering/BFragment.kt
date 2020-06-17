package com.app.onboardingscreen.onboardering

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.app.onboardingscreen.R
import kotlinx.android.synthetic.main.fragment_a.view.*
import kotlinx.android.synthetic.main.fragment_b.view.*


class BFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view=inflater.inflate(R.layout.fragment_b, container, false)
        val viewPager2 = activity?.findViewById<ViewPager2>(R.id.viewpager)
        view.btnNextB.setOnClickListener {
            viewPager2?.currentItem=2
        }

        return view
    }

}