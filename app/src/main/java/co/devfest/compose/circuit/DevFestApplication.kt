package co.devfest.compose.circuit

import android.app.Application
import android.content.Context
import co.devfest.compose.circuit.di.component.AppComponent

class DevFestApplication: Application() {
    private val appComponent by lazy { AppComponent.create(this) }

    fun appComponent() = appComponent

    companion object {

        fun from(context: Context): DevFestApplication =
            context.applicationContext as DevFestApplication
    }
}