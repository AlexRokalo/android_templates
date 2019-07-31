package com.example.mytemplates.ui.view.dialog

import android.content.Context
import androidx.fragment.app.DialogFragment
import dagger.android.support.AndroidSupportInjection


abstract class BaseDialogFragment : androidx.fragment.app.DialogFragment() {


    /* Lifecycle methods */
    override fun onAttach(context: Context) {
        // This is called even for API levels below 23.
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}