package com.app.onboardingscreen

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler().postDelayed({
            val sharedPref: Boolean? =
                activity?.getPreferences(Context.MODE_PRIVATE)?.getBoolean("finish", false)
            if (sharedPref!!)
                findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
            else
                findNavController().navigate(R.id.action_splashFragment_to_onBoardFragment)

        }, 2000)

        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

}