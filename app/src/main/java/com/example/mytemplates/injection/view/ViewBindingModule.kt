package com.example.mytemplates.injection.view

import com.example.mytemplates.injection.view.ActivityBindingModule
import com.example.mytemplates.injection.view.DialogBindingModule
import com.example.mytemplates.injection.view.FragmentBindingModule
import dagger.Module
import dagger.android.support.AndroidSupportInjectionModule


@Module(includes = [
    AndroidSupportInjectionModule::class,
    FragmentBindingModule::class,
    DialogBindingModule::class,
    ActivityBindingModule::class
])
abstract class ViewBindingModule