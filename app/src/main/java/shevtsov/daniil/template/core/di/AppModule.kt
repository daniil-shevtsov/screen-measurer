package shevtsov.daniil.template.core.di

import dagger.Module
import dagger.Provides
import shevtsov.daniil.template.core.di.api.network.NetworkModule
import shevtsov.daniil.template.core.di.viewmodel.ViewModelModule
import shevtsov.daniil.template.core.util.logging.AndroidLogger
import shevtsov.daniil.template.core.util.logging.Logger

@Module(
    includes = [
        ViewModelModule::class,
        NetworkModule::class
    ]
)
class AppModule {

    @Provides
    fun provideLogger(): Logger = AndroidLogger()

}
