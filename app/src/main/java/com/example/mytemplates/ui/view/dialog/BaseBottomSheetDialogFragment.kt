package com.example.mytemplates.ui.view.dialog

import android.content.Context
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.android.support.AndroidSupportInjection

abstract class BaseBottomSheetDialogFragment : BottomSheetDialogFragment() {


    /* Lifecycle methods */
    override fun onAttach(context: Context) {
        // This is called even for API levels below 23.
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }


}