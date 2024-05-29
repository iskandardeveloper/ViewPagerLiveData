package com.example.viewpagerlivedata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagerlivedata.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private val binding by lazy { FragmentSecondBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        MyData.liveData.observe(viewLifecycleOwner) {
            binding.textView.text = it
        }
        return binding.root
    }
}