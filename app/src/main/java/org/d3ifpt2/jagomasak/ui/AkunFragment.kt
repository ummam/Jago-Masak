package org.d3ifpt2.jagomasak.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3ifpt2.jagomasak.databinding.FragmentAkunBinding

class AkunFragment : Fragment() {
    private lateinit var binding: FragmentAkunBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentAkunBinding.inflate(
                layoutInflater, container, false)
        return binding.root
    }
}