package com.example.mytemplates.injection.view

import com.example.mytemplates.ui.screens.camera_x.CameraXFragment
import com.example.mytemplates.ui.screens.fragment_main.FragmentMain
import dagger.Module
import dagger.android.ContributesAndroidInjector
import qbt.lepta.presentation.injection.PerFragment

@Module
abstract class FragmentBindingModule {

    @PerFragment
    @ContributesAndroidInjector
    abstract fun fragmentMain(): FragmentMain

    @PerFragment
    @ContributesAndroidInjector
    abstract fun cameraXFragment(): CameraXFragment
}