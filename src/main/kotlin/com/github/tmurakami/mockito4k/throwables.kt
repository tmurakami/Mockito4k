package com.github.tmurakami.mockito4k

import org.mockito.internal.configuration.GlobalConfiguration
import org.mockito.internal.exceptions.stacktrace.ConditionalStackTraceFilter

private val configuration = GlobalConfiguration()
private val stackTraceFilter = ConditionalStackTraceFilter()
private val packagePrefix = Init::class.java.run { name.removeSuffix(simpleName) }

internal fun <T> filterStackTrace(function: () -> T): T =
    try {
        function()
    } catch (e: Exception) {
        if (configuration.cleansStackTrace()) {
            // We do not use the `StackTraceCleaner` extension because multiple StackTraceCleaners are not allowed. If
            // we used the extension, libraries with their own StackTraceCleaner (e.g. dexmaker-mockito) might not work.
            @Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
            (e as java.lang.Throwable).run {
                stackTrace = stackTrace.filterNot { it.className.startsWith(packagePrefix) }.toTypedArray()
            }
        }
        throw e.apply { stackTraceFilter.filter(this) }
    }
