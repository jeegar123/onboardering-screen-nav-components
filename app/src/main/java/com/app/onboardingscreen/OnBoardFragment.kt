package com.app.onboardingscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.app.onboardingscreen.adapter.ViewPagerAdapter
import com.app.onboardingscreen.onboardering.AFragment
import com.app.onboardingscreen.onboardering.BFragment
import com.app.onboardingscreen.onboardering.CFragment
import kotlinx.android.synthetic.main.fragment_on_board.*


class OnBoardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_on_board, container, false)

        val list = mutableListOf<Fragment>(
            AFragment(),
            BFragment(),
            CFragment()
        )

        val adapter=ViewPagerAdapter(list,requireActivity().supportFragmentManager,lifecycle)
        val viewpager:ViewPager2=view.findViewById<ViewPager2>(R.id.viewpager)
        viewpager.adapter=adapter
        return view
    }


}