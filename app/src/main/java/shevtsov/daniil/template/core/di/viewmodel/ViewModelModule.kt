package shevtsov.daniil.template.core.di.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import shevtsov.daniil.template.core.di.AppScope
import shevtsov.daniil.template.fragmenta.FragmentAViewModel
import shevtsov.daniil.template.fragmentb.FragmentBViewModel

@Module
interface ViewModelModule {

    @Binds
    @AppScope
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(FragmentAViewModel::class)
    fun bindFragmentAViewModel(viewModel: FragmentAViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FragmentBViewModel::class)
    fun bindFragmentBViewModel(viewModel: FragmentBViewModel): ViewModel

}
