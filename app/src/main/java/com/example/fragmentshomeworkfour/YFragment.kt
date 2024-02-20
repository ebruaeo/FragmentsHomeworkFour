package com.example.fragmentshomeworkfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentshomeworkfour.databinding.FragmentYBinding

class YFragment : Fragment() {

    private lateinit var binding: FragmentYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentYBinding.inflate(inflater,container,false)
        return binding.root
    }

}