package com.example.mytemplates.ui.screens

import android.os.Bundle
import com.codeerow.spirit.aac_navigation.view.AacNavSettings
import com.codeerow.spirit.mvvm.view.extensions.provideViewModel
import com.example.mytemplates.R
import com.example.mytemplates.ui.view.activity.BaseNavMvvmActivity
import com.google.firebase.FirebaseApp

class MainActivity : BaseNavMvvmActivity() {

    /* Navigation */
    override val settings by lazy {
        AacNavSettings(
            provideNavHostFragment = { R.id.navFragment },
            provideNavGraph = { R.navigation.navigaton },
            provideStartDestination = { R.id.fragmentMain },
            configureStartArgs = {})
    }

    /* ViewModels */
    override val viewModel
            by lazy { provideViewModel<MainViewModel>(viewModelFactory) }

    override fun inflateLayout() {
        setContentView(R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(applicationContext)
    }
}


