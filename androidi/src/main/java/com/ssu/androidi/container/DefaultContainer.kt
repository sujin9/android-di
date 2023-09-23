package com.ssu.androidi.container

import com.ssu.di.container.DiContainer
import kotlin.reflect.KClass
import kotlin.reflect.jvm.jvmName

class DefaultContainer : DiContainer {
    private val instances = mutableMapOf<String, Any?>()

    override fun <T : Any> createInstance(clazz: KClass<*>, instance: T) {
        instances[clazz.jvmName] = instance
    }

    override fun <T : Any> createInstance(qualifier: String, instance: T) {
        instances[qualifier] = instance
    }

    override fun <T : Any> getInstance(clazz: KClass<T>): T? {
        return instances[clazz.jvmName] as? T
    }

    override fun <T : Any> getInstance(qualifier: String): T? {
        return instances[qualifier] as? T
    }
}
