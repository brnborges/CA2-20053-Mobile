package com.example.ca2mfusion.modules

import com.example.ca2mfusion.ui.main.MainActivity
import com.example.ca2mfusion.ui.cart.CartActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun mainActivityProvider() : MainActivity

    @ContributesAndroidInjector
    abstract fun cartActivityProvider() : CartActivity

}
