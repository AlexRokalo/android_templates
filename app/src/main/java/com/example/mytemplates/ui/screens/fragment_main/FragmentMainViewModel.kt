package com.example.mytemplates.ui.screens.fragment_main

import com.codeerow.spirit.aac_navigation.command.AacGoForward
import com.codeerow.spirit.mvvm.viewmodel.MvvmViewModel
import com.codeerow.spirit.navigation.command.GoForward
import com.codeerow.spirit.navigation.extensions.navigate
import com.example.mytemplates.R
import javax.inject.Inject

class FragmentMainViewModel @Inject constructor() : MvvmViewModel() {


    fun goForward() {
        navigate(AacGoForward(actionID = R.id.action_fragmentMain_to_cameraXFragment))
    }
}