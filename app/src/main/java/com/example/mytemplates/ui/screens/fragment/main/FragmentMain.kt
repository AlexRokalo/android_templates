package com.example.mytemplates.ui.screens.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.codeerow.spirit.mvvm.view.extensions.provideViewModel
import com.example.mytemplates.R
import com.example.mytemplates.ui.view.fragment.BaseMvvmFragment
import kotlinx.android.synthetic.main.fragment_main.*

class FragmentMain : BaseMvvmFragment() {

    override val viewModel by lazy { provideViewModel<FragmentMainViewModel>(viewModelFactory) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnCameraX.setOnClickListener {
            viewModel.goForward()
        }
    }
}