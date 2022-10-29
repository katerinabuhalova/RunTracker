package com.awesomecompany.runtracker.di

import com.awesomecompany.runtracker.di.module.ViewModelProviderModule
import com.awesomecompany.runtracker.ui.history.HistoryFragment
import com.awesomecompany.runtracker.ui.home.HomeFragment
import com.awesomecompany.runtracker.ui.record.RecordFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ViewModelProviderModule::class
    ]
)
interface AppComponent {
    fun inject(homeFragment: HomeFragment)
    fun inject(historyFragment: HistoryFragment)
    fun inject(recordFragment: RecordFragment)
}



