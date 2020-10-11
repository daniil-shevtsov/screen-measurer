package shevtsov.daniil.template.fragmentb

import androidx.fragment.app.Fragment
import shevtsov.daniil.template.R
import shevtsov.daniil.template.core.util.viewLifecycleLazy
import shevtsov.daniil.template.databinding.FragmentBBinding.bind

class FragmentB : Fragment(R.layout.fragment_b) {

    private val binding by viewLifecycleLazy { bind(requireView()) }

}
