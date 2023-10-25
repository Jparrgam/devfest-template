package co.devfest.compose.circuit.di.component

import co.devfest.compose.circuit.activity.MainActivity
import co.devfest.compose.circuit.di.scopes.AppScope
import com.squareup.anvil.annotations.ContributesTo

@ContributesTo(AppScope::class)
interface ComponentInterface {
    fun injectActivity(activity: MainActivity)
}