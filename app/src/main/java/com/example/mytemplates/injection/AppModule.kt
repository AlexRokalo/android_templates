package com.example.mytemplates.injection

import android.app.Application
import android.content.Context
import com.example.mytemplates.app.MyTemplatesApp
import dagger.Binds
import dagger.Module


@Module
abstract class AppModule() {

    @Binds
    abstract fun application(app: MyTemplatesApp): Application

    @Binds
    abstract fun context(app: MyTemplatesApp): Context
}