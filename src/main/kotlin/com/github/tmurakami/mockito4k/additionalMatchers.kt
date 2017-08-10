package com.github.tmurakami.mockito4k

import org.mockito.AdditionalMatchers

/**
 * The delegation to [AdditionalMatchers#and(T, T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#and&#40;T,&#32;T&#41;).
 *
 * @param T the type of the given argument matchers
 * @param first the first argument matcher
 * @param second the second argument matcher
 * @return the result for executing [AdditionalMatchers#and(T, T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#and&#40;T,&#32;T&#41;)
 */
inline fun <reified T> and(first: T?, second: T?): T = AdditionalMatchers.and(first, second) ?: first ?: by(second)

/**
 * The delegation to [AdditionalMatchers#or(T, T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#or&#40;T,&#32;T&#41;).
 *
 * @param T the type of the given argument matchers
 * @param first the first argument matcher
 * @param second the second argument matcher
 * @return the result for executing [AdditionalMatchers#or(T, T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#or&#40;T,&#32;T&#41;)
 */
inline fun <reified T> or(first: T?, second: T?): T = AdditionalMatchers.or(first, second) ?: first ?: by(second)

/**
 * The delegation to [AdditionalMatchers#not(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#not&#40;T&#41;).
 *
 * @param T the type of the given argument [matcher]
 * @param matcher the argument matcher
 * @return the result for executing [AdditionalMatchers#not(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#not&#40;T&#41;)
 */
inline fun <reified T> not(matcher: T?): T = AdditionalMatchers.not(matcher) ?: by(matcher)

/**
 * The delegation to [AdditionalMatchers#geq(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#geq&#40;T&#41;).
 *
 * @param T the type of the given [value]
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#geq(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#geq&#40;T&#41;)
 */
inline fun <reified T : Comparable<T>> geq(value: T): T = AdditionalMatchers.geq(value) ?: value

/**
 * The delegation to [AdditionalMatchers#gt(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#gt&#40;T&#41;).
 *
 * @param T the type of the given [value]
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#gt(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#gt&#40;T&#41;)
 */
inline fun <reified T : Comparable<T>> gt(value: T): T = AdditionalMatchers.gt(value) ?: value

/**
 * The delegation to [AdditionalMatchers#leq(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#leq&#40;T&#41;).
 *
 * @param T the type of the given [value]
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#leq(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#leq&#40;T&#41;)
 */
inline fun <reified T : Comparable<T>> leq(value: T): T = AdditionalMatchers.leq(value) ?: value

/**
 * The delegation to [AdditionalMatchers#lt(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#lt&#40;T&#41;).
 *
 * @param T the type of the given [value]
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#lt(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#lt&#40;T&#41;)
 */
inline fun <reified T : Comparable<T>> lt(value: T): T = AdditionalMatchers.lt(value) ?: value

/**
 * The delegation to [AdditionalMatchers#cmpEq(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#cmpEq&#40;T&#41;).
 *
 * @param T the type of the given [value]
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#cmpEq(T)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#cmpEq&#40;T&#41;)
 */
inline fun <reified T : Comparable<T>> cmpEq(value: T): T = AdditionalMatchers.cmpEq(value) ?: value

/**
 * The delegation to [AdditionalMatchers#regex(String)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#find&#40;java.lang.String&#41;).
 *
 * @param regex the regular expression
 * @return the result for executing [AdditionalMatchers#regex(String)](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#find&#40;java.lang.String&#41;)
 */
fun find(regex: String): String = AdditionalMatchers.find(regex) ?: regex

/**
 * The delegation to [AdditionalMatchers#aryEq(boolean[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;boolean[]&#41;).
 *
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#aryEq(boolean[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;boolean[]&#41;)
 */
fun aryEq(value: BooleanArray): BooleanArray = AdditionalMatchers.aryEq(value) ?: value

/**
 * The delegation to [AdditionalMatchers#aryEq(byte[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;byte[]&#41;).
 *
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#aryEq(byte[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;byte[]&#41;)
 */
fun aryEq(value: ByteArray): ByteArray = AdditionalMatchers.aryEq(value) ?: value

/**
 * The delegation to [AdditionalMatchers#aryEq(char[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;char[]&#41;).
 *
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#aryEq(char[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;char[]&#41;)
 */
fun aryEq(value: CharArray): CharArray = AdditionalMatchers.aryEq(value) ?: value

/**
 * The delegation to [AdditionalMatchers#aryEq(double[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;double[]&#41;).
 *
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#aryEq(double[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;double[]&#41;)
 */
fun aryEq(value: DoubleArray): DoubleArray = AdditionalMatchers.aryEq(value) ?: value

/**
 * The delegation to [AdditionalMatchers#aryEq(float[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;float[]&#41;).
 *
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#aryEq(float[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;float[]&#41;)
 */
fun aryEq(value: FloatArray): FloatArray = AdditionalMatchers.aryEq(value) ?: value

/**
 * The delegation to [AdditionalMatchers#aryEq(int[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;int[]&#41;).
 *
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#aryEq(int[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;int[]&#41;)
 */
fun aryEq(value: IntArray): IntArray = AdditionalMatchers.aryEq(value) ?: value

/**
 * The delegation to [AdditionalMatchers#aryEq(long[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;long[]&#41;).
 *
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#aryEq(long[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;long[]&#41;)
 */
fun aryEq(value: LongArray): LongArray = AdditionalMatchers.aryEq(value) ?: value

/**
 * The delegation to [AdditionalMatchers#aryEq(short[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;short[]&#41;).
 *
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#aryEq(short[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;short[]&#41;)
 */
fun aryEq(value: ShortArray): ShortArray = AdditionalMatchers.aryEq(value) ?: value

/**
 * The delegation to [AdditionalMatchers#aryEq(T[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;T[]&#41;).
 *
 * @param T the type of the given [value]
 * @param value the value to be compared
 * @return the result for executing [AdditionalMatchers#aryEq(T[])](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/AdditionalMatchers.html#aryEq&#40;T[]&#41;)
 */
inline fun <reified T> aryEq(value: Array<T>): Array<T> = AdditionalMatchers.aryEq(value) ?: value
