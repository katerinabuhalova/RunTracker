package com.awesomecompany.runtracker.remote

interface RemoteProvider {
    fun provideRemote(): StravaApi
}