package com.example.mytemplates.ui.screens.fragment.camera_x

import com.codeerow.spirit.aac_navigation.command.AacGoBackward
import com.codeerow.spirit.mvvm.viewmodel.MvvmViewModel
import com.codeerow.spirit.navigation.extensions.navigate
import javax.inject.Inject

class CameraXViewModel @Inject constructor() : MvvmViewModel() {

    fun goBackward() {
        navigate(AacGoBackward())
    }
}