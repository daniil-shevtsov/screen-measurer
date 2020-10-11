package shevtsov.daniil.screenmeasurer.fragmentb

import androidx.fragment.app.Fragment
import shevtsov.daniil.screenmeasurer.R
import shevtsov.daniil.screenmeasurer.core.util.viewLifecycleLazy
import shevtsov.daniil.screenmeasurer.databinding.FragmentBBinding.bind

class FragmentB : Fragment(R.layout.fragment_b) {

    private val binding by viewLifecycleLazy { bind(requireView()) }

}
