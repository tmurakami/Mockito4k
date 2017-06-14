package com.github.tmurakami.mockito4k

import org.mockito.ArgumentMatcher
import org.mockito.ArgumentMatchers
import org.mockito.internal.util.Primitives
import java.util.regex.Pattern

/**
 * Prevents causing NullPointerException when using a [matcher] for method that only accepts non-null parameter.
 *
 * @param T the type of the given argument [matcher]
 * @param matcher the argument matcher
 * @return the given argument [matcher]
 */
fun <T> by(matcher: T?): T = matcher as T

/**
 * The delegation to [ArgumentMatchers#any()](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#any&#40;&#41;).
 *
 * @param T the type of the argument matcher
 * @return the result for executing [ArgumentMatchers#any()](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#any&#40;&#41;)
 */
inline fun <reified T> anyNullable(): T? = ArgumentMatchers.any()

/**
 * The delegation to [ArgumentMatchers#any(Class)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#any&#40;java.lang.Class&#41;).
 *
 * @param T the type of acceptable values
 * @return the result for executing [ArgumentMatchers#any(Class)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#any&#40;java.lang.Class&#41;)
 */
inline fun <reified T : Any> any(): T = by(ArgumentMatchers.any(T::class.java))

/**
 * The delegation to [ArgumentMatchers#eq(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#eq&#40;T&#41;).
 *
 * @param T the type of the given [value]
 * @param value the value to be compared
 * @return the result for executing [ArgumentMatchers#eq(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#eq&#40;T&#41;)
 */
inline fun <reified T> eq(value: T): T = ArgumentMatchers.eq(value)

/**
 * The delegation to [ArgumentMatchers#refEq(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#refEq&#40;T,&#32;java.lang.String...&#41;).
 *
 * @param T the type of the given [value]
 * @param value the value to be compared
 * @return the result for executing [ArgumentMatchers#refEq(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#refEq&#40;T,&#32;java.lang.String...&#41;)
 */
inline fun <reified T> refEq(value: T, vararg excludeFields: String): T = ArgumentMatchers.refEq(value, *excludeFields)

/**
 * The delegation to [ArgumentMatchers#same(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#same&#40;T&#41;).
 *
 * @param T the type of the given [value]
 * @param value the value to be compared
 * @return the result for executing [ArgumentMatchers#same(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#same&#40;T&#41;)
 */
inline fun <reified T> same(value: T): T = ArgumentMatchers.same(value)

/**
 * The delegation to [ArgumentMatchers#isA(Class)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#isA&#40;java.lang.Class&#41;).
 *
 * @param T the type of acceptable values
 * @return the result for executing [ArgumentMatchers#isA(Class)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#isA&#40;java.lang.Class&#41;)
 */
inline fun <reified T : Any> isA(): T = by(ArgumentMatchers.isA(T::class.java))

/**
 * The delegation to [ArgumentMatchers#isNull()](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#isNull&#40;&#41;).
 *
 * @param T the type of the argument matcher
 * @return the result for executing [ArgumentMatchers#isNull()](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#isNull&#40;&#41;)
 */
inline fun <reified T> isNull(): T? = ArgumentMatchers.isNull()

/**
 * The delegation to [ArgumentMatchers#isNotNull(Class)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#isNotNull&#40;&#41;).
 *
 * @param T the type of the argument matcher
 * @return the result for executing [ArgumentMatchers#isNotNull(Class)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#isNotNull&#40;&#41;)
 */
inline fun <reified T> isNotNull(): T? = ArgumentMatchers.isNotNull()

/**
 * The delegation to [ArgumentMatchers#nullable(Class)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#nullable&#40;java.lang.Class&#41;).
 *
 * @param T the type of the argument matcher
 * @return the result for executing [ArgumentMatchers#nullable(Class)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#nullable&#40;java.lang.Class&#41;)
 */
inline fun <reified T : Any> nullable(): T? = ArgumentMatchers.nullable(T::class.java)

/**
 * The delegation to [ArgumentMatchers#matches(String)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#matches&#40;java.lang.String&#41;).
 *
 * @param regex the regular expression
 * @return the result for executing [ArgumentMatchers#matches(String)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#matches&#40;java.lang.String&#41;)
 */
fun matches(regex: String): String = ArgumentMatchers.matches(regex)

/**
 * The delegation to [ArgumentMatchers#matches(Pattern)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#matches&#40;java.util.regex.Pattern&#41;).
 *
 * @param regex the regular expression
 * @return the result for executing [ArgumentMatchers#matches(Pattern)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#matches&#40;java.util.regex.Pattern&#41;)
 */
fun matches(regex: Regex): String = matches(regex.toPattern())

/**
 * The delegation to [ArgumentMatchers#matches(Pattern)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#matches&#40;java.util.pattern.Pattern&#41;).
 *
 * @param pattern the regular expression
 * @return the result for executing [ArgumentMatchers#matches(Pattern)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#matches&#40;java.util.pattern.Pattern&#41;)
 */
fun matches(pattern: Pattern): String = ArgumentMatchers.matches(pattern)

/**
 * The delegation to [ArgumentMatchers#argThat(ArgumentMatcher)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#argThat&#40;org.mockito.ArgumentMatcher&#41;).
 *
 * @param T the type of the argument [matcher]
 * @param matcher the argument matcher
 * @return the result for executing [ArgumentMatchers#argThat(ArgumentMatcher)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#argThat&#40;org.mockito.ArgumentMatcher&#41;)
 */
inline fun <reified T : Any> argThat(matcher: ArgumentMatcher<T>): T = by(ArgumentMatchers.argThat(matcher) ?: Primitives.defaultValue(T::class.java))

/**
 * The delegation to [ArgumentMatchers#argThat(ArgumentMatcher)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#argThat&#40;org.mockito.ArgumentMatcher&#41;).
 *
 * @param T the type of the argument [matcher]
 * @param matcher the argument matcher
 * @return the result for executing [ArgumentMatchers#argThat(ArgumentMatcher)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/ArgumentMatchers.html#argThat&#40;org.mockito.ArgumentMatcher&#41;)
 */
inline fun <reified T : Any> argThat(noinline matcher: (T) -> Boolean): T = by(ArgumentMatchers.argThat(matcher) ?: Primitives.defaultValue(T::class.java))
