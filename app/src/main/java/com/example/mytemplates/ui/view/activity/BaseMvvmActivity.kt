package com.example.mytemplates.ui.view.activity

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import com.codeerow.spirit.mvvm.view.MvvmActivity
import dagger.android.AndroidInjection
import javax.inject.Inject


abstract class BaseMvvmActivity : MvvmActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory


    /* Lifecycle */
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }
}