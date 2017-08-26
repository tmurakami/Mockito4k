package test.com.github.tmurakami.mockito4k

import com.github.tmurakami.mockito4k.filterStackTrace
import org.junit.Assert.assertTrue
import org.junit.Test
import org.mockito.configuration.MockitoConfiguration

class ThrowablesTest {

    @Test
    fun `filterStackTrace should remove stack trace elements belonging to the library package`() {
        val isStackTraceCleaned = MockitoConfiguration.isStackTraceCleaned
        MockitoConfiguration.isStackTraceCleaned = true
        try {
            filterStackTrace { throw MyException() }
        } catch (e: Exception) {
            assertTrue(e.stackTrace.none { it.className.startsWith("com.github.tmurakami.mockito4k.") })
        } finally {
            MockitoConfiguration.isStackTraceCleaned = isStackTraceCleaned
        }
    }

    @Test
    fun `filterStackTrace should not remove any stack trace elements if MockitoConfiguration#cleansStackTrace is false`() {
        val isStackTraceCleaned = MockitoConfiguration.isStackTraceCleaned
        MockitoConfiguration.isStackTraceCleaned = false
        try {
            filterStackTrace { throw MyException() }
        } catch (e: Exception) {
            assertTrue(e.stackTrace.any { it.className.startsWith("com.github.tmurakami.mockito4k.") })
        } finally {
            MockitoConfiguration.isStackTraceCleaned = isStackTraceCleaned
        }
    }

    private class MyException : Exception() {
        init {
            @Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
            (this as java.lang.Throwable).stackTrace = arrayOf(StackTraceElement("com.github.tmurakami.mockito4k.C", "foo", null, -1))
        }
    }

}
