package com.example.androidbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidbinding.databinding.FragmentFirstBinding


class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bind = FragmentFirstBinding.bind(view)
        bind.txtFragment.text = "Hello Fragment 1"
    }
}