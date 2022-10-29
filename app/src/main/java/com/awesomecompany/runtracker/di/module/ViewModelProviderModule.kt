package com.awesomecompany.runtracker.di.module

import com.awesomecompany.runtracker.ui.history.HistoryViewModel
import com.awesomecompany.runtracker.ui.home.HomeViewModel
import com.awesomecompany.runtracker.ui.record.RecordViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ViewModelProviderModule {

    @Singleton
    @Provides
    fun provideViewModel1(): HomeViewModel = HomeViewModel()

    @Singleton
    @Provides
    fun provideViewModel2(): HistoryViewModel = HistoryViewModel()

    @Singleton
    @Provides
    fun provideViewModel3():RecordViewModel = RecordViewModel()
}