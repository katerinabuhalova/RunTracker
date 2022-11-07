package com.awesomecompany.runtracker

import android.app.Application
import com.awesomecompany.runtracker.di.AppComponent
import com.awesomecompany.runtracker.di.DaggerAppComponent
import com.awesomecompany.runtracker.di.module.ViewModelProviderModule
import com.awesomecompany.runtracker.remote.DaggerRemoteComponent


class App : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .viewModelProviderModule(ViewModelProviderModule())
            .remoteProvider(DaggerRemoteComponent.create())
            .build()
    }
}