package com.app.onboardingscreen.onboardering

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.app.onboardingscreen.R
import kotlinx.android.synthetic.main.fragment_a.view.*

class AFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        val viewPager2 = activity?.findViewById<ViewPager2>(R.id.viewpager)
        view.btnNextA.setOnClickListener {
            viewPager2?.currentItem=1
        }

        return view
    }


}