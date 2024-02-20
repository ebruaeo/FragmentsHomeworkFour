package com.example.fragmentshomeworkfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentshomeworkfour.databinding.FragmentABinding
import com.example.fragmentshomeworkfour.databinding.FragmentBBinding

class BFragment : Fragment() {

    private lateinit var binding:FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.goToYPageBtn.setOnClickListener {
            val action = BFragmentDirections.actionBFragmentToYFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }


}