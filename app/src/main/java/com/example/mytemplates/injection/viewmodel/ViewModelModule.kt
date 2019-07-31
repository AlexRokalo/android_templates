package com.example.mytemplates.injection.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mytemplates.ui.screens.MainViewModel
import com.example.mytemplates.ui.screens.camera_x.CameraXViewModel
import com.example.mytemplates.ui.screens.fragment_main.FragmentMainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun viewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(FragmentMainViewModel::class)
    internal abstract fun fragmentMainViewModel(viewModel: FragmentMainViewModel): ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun mainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CameraXViewModel::class)
    internal abstract fun cameraXViewModel(viewModel: CameraXViewModel): ViewModel


    // Add view models here
}