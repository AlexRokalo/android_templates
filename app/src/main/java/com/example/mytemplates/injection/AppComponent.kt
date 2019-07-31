package com.example.mytemplates.injection

import com.example.mytemplates.app.MyTemplatesApp
import com.example.mytemplates.injection.usecases.UseCasesModule
import com.example.mytemplates.injection.view.ViewBindingModule
import com.example.mytemplates.injection.viewmodel.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AppModule::class,
    ViewBindingModule::class,
    ViewModelModule::class,
    UseCasesModule::class
])
interface AppComponent : AndroidInjector<MyTemplatesApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MyTemplatesApp>()
}