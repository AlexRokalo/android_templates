package com.example.mytemplates.ui.view.dialog

import androidx.lifecycle.ViewModelProvider
import android.content.Context
import com.codeerow.spirit.mvvm.view.MvvmActivity
import com.codeerow.spirit.mvvm.view.MvvmDialogFragment
import com.codeerow.spirit.state.State
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject


abstract class BaseMvvmDialogFragment : MvvmDialogFragment() {


//    @Inject
//    override lateinit var viewModelFactory: ViewModelProvider.Factory


    /* Lifecycle methods */
    override fun onAttach(context: Context) {
        // This is called even for API levels below 23.
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    /**
     * Dispatching rendering ViewState on activity in case of
     * common ViewState.
     * */
}