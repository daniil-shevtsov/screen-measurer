package shevtsov.daniil.template.core.di

import dagger.Component
import shevtsov.daniil.template.fragmenta.FragmentA
import shevtsov.daniil.template.fragmentb.FragmentB

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(fragmentA: FragmentA)

    fun inject(fragmentB: FragmentB)

}
