package com.example.mytemplates.ui.view.dialog

import android.content.Context
import android.os.Bundle


abstract class CallbackMvvmDialog<CALLBACK : Callback> : BaseMvvmDialogFragment() {

    var callback: CALLBACK? = null


    /* Lifecycle */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(androidx.fragment.app.DialogFragment.STYLE_NO_TITLE, android.R.style.Theme_Material_Light_Dialog_Alert)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val callbackTarget =
                if (parentFragment != null) parentFragment
                else context
        callback = callbackTarget as? CALLBACK ?: throw ClassCastException("$callbackTarget should be set and must implement Callbacks!")
    }
}