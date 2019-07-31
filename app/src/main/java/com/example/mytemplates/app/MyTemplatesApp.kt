package com.example.mytemplates.app

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import com.example.mytemplates.injection.DaggerAppComponent
import com.google.firebase.FirebaseApp
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MyTemplatesApp : Application(),
    HasSupportFragmentInjector,
    HasActivityInjector {


    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>


    /* Lifecycle methods */
    override fun onCreate() {
        super.onCreate()
        instance = this
        setUpDagger()
        FirebaseApp.initializeApp(this);
    }


    /* Dagger */
    override fun supportFragmentInjector() = fragmentInjector

    override fun activityInjector() = activityInjector

    private fun setUpDagger() {
        DaggerAppComponent.builder().create(this).inject(this)
    }


    /* Companion*/
    companion object {
        lateinit var instance: MyTemplatesApp
    }
}