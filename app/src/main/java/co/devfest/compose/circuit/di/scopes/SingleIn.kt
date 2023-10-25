package co.devfest.compose.circuit.di.scopes

import javax.inject.Scope
import kotlin.reflect.KClass

@Scope
annotation class SingleIn(val scope: KClass<*>)