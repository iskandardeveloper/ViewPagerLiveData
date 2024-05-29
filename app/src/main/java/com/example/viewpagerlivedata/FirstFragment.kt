package com.example.viewpagerlivedata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.example.viewpagerlivedata.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private val binding by lazy { FragmentFirstBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.editText.addTextChangedListener {
            MyData.liveData.postValue(binding.editText.text.toString())
        }
        return binding.root


    }
}