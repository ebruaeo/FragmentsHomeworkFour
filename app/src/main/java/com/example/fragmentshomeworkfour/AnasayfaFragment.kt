package com.example.fragmentshomeworkfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentshomeworkfour.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.goToAPageBtn.setOnClickListener {
            val action = AnasayfaFragmentDirections.actionAnasayfaFragmentToAFragment()
            Navigation.findNavController(it).navigate(action)
        }
        binding.goToXPageBtn.setOnClickListener {
            val action = AnasayfaFragmentDirections.actionAnasayfaFragmentToXFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}