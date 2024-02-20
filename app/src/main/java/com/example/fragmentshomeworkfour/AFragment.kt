package com.example.fragmentshomeworkfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentshomeworkfour.databinding.FragmentABinding

class AFragment : Fragment() {

        private lateinit var binding: FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.gotoBPageBtn.setOnClickListener {
            val action= AFragmentDirections.actionAFragmentToBFragment()
            Navigation.findNavController(it).navigate(action)
        }

    }

}