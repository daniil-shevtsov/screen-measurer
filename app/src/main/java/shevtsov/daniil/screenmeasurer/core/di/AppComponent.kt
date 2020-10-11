package shevtsov.daniil.screenmeasurer.core.di

import dagger.Component
import shevtsov.daniil.screenmeasurer.fragmenta.FragmentA
import shevtsov.daniil.screenmeasurer.fragmentb.FragmentB

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(fragmentA: FragmentA)

    fun inject(fragmentB: FragmentB)

}
