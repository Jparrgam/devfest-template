package co.devfest.compose.circuit.di.component

import android.content.Context
import co.devfest.compose.circuit.di.modules.CircuitModule
import co.devfest.compose.circuit.di.modules.HelperModule
import co.devfest.compose.circuit.di.scopes.AppScope
import co.devfest.compose.circuit.di.scopes.ApplicationContext
import com.squareup.anvil.annotations.MergeComponent
import dagger.BindsInstance
import dagger.Component

@MergeComponent(
    scope = AppScope::class,
    modules = [
        HelperModule::class,
        CircuitModule::class
    ]
)
interface AppComponent : ComponentInterface {

    @Component.Factory
    interface Factory {
        fun create(@ApplicationContext @BindsInstance context: Context): AppComponent
    }

    companion object {
        fun create(context: Context): AppComponent =
            DaggerAppComponent.factory().create(context)
    }
}