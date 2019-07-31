package com.example.mytemplates.ui.view.fragment

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.codeerow.spirit.mvvm.view.MvvmFragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject


abstract class BaseMvvmFragment : MvvmFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    /* Lifecycle methods */
    override fun onAttach(context: Context) {
        // This is called even for API levels below 23.
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}
