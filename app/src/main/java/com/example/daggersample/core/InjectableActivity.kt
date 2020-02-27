package com.example.daggersample.core

import androidx.appcompat.app.AppCompatActivity
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

open class InjectableActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector() = dispatchingAndroidInjector
}