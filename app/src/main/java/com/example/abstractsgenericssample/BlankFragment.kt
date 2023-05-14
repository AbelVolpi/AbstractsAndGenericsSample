package com.example.abstractsgenericssample

import android.os.Bundle
import android.view.View
import com.example.abstractsgenericssample.databinding.FragmentBlankBinding

class BlankFragment : BaseFragment<FragmentBlankBinding>(FragmentBlankBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.text = "Hello Word"
    }
}