package shevtsov.daniil.screenmeasurer.core.di

import dagger.Module
import dagger.Provides
import shevtsov.daniil.screenmeasurer.core.di.api.network.NetworkModule
import shevtsov.daniil.screenmeasurer.core.di.viewmodel.ViewModelModule
import shevtsov.daniil.screenmeasurer.core.util.logging.AndroidLogger
import shevtsov.daniil.screenmeasurer.core.util.logging.Logger

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
