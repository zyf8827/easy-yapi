package com.itangcent.common.utils

import kotlin.reflect.KClass

object KitUtils {

    fun <T> fromBool(boolean: Boolean, whenTrue: T, whenFalse: T): T {
        return when (boolean) {
            true -> whenTrue
            false -> whenFalse
        }
    }

    fun <T> safe(action: () -> T): T? {
        return try {
            action()
        } catch (e: Exception) {
            null
        }
    }

    fun <T> safe(ignoreThrowable: KClass<*>, action: () -> T): T? {
        return try {
            action()
        } catch (e: Exception) {
            if (ignoreThrowable.isInstance(e)) {
                null
            } else {
                throw e
            }
        }
    }

    fun <T> safe(vararg ignoreThrowable: KClass<*>, action: () -> T): T? {
        return try {
            action()
        } catch (e: Exception) {
            for (throwable in ignoreThrowable) {
                if (throwable.isInstance(e)) {
                    return null
                }
            }
            null
        }
    }
}

fun String?.concat(any: Any?, separator: CharSequence = "\n"): String? {
    return when {
        this == null -> any?.toString()
        any == null -> this
        else -> this + separator + any
    }
}

fun String?.notEmpty(): Boolean {
    return !this.isNullOrEmpty()
}

fun String.headLine(): String? {
    if (this.isBlank()) return null

    var index = -1
    for ((i, c) in this.withIndex()) {
        if (c == '\r' || c == '\n') {
            index = i
            break
        }
    }
    if (index == -1) {
        return this
    }
    return substring(0, index)
}