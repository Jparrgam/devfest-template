package co.devfest.compose.circuit.di.modules

import co.devfest.compose.circuit.di.scopes.AppScope
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
@ContributesTo(AppScope::class)
object HelperModule {
    @Provides
    @Named("message")
    fun providerTest(): String = "Jaime"
}
