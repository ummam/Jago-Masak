package org.d3ifpt2.jagomasak.ui

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.d3ifpt2.jagomasak.R
import org.d3ifpt2.jagomasak.databinding.FragmentAkunBinding

class AkunFragment : Fragment() {
    private lateinit var binding: FragmentAkunBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentAkunBinding.inflate(
                layoutInflater, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_about) {
            findNavController().navigate(
                    R.id.action_akunFragment_to_profile)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }
}