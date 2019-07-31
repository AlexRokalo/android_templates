package com.example.mytemplates.injection.view

import com.example.mytemplates.ui.screens.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import qbt.lepta.presentation.injection.PerActivity


@Module
abstract class ActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity


}