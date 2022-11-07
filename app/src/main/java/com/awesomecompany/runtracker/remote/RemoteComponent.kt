package com.awesomecompany.runtracker.remote

import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(
    modules = [RemoteModule::class]
)
interface RemoteComponent : RemoteProvider