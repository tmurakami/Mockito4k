# Mockito4k

[![CircleCI](https://circleci.com/gh/tmurakami/mockito4k.svg?style=shield)](https://circleci.com/gh/tmurakami/mockito4k)
[![Release](https://jitpack.io/v/tmurakami/mockito4k.svg)](https://jitpack.io/#tmurakami/mockito4k)
[![KDoc](https://img.shields.io/badge/KDoc-0.6.3-brightgreen.svg)](https://jitpack.io/com/github/tmurakami/mockito4k/0.6.3/javadoc/mockito4k/com.github.tmurakami.mockito4k/)  
![Kotlin](https://img.shields.io/badge/Kotlin-1.0.6%2B-blue.svg)
![Mockito](https://img.shields.io/badge/Mockito-2.6%2B-blue.svg)

A Kotlin wrapper around [Mockito 2](http://site.mockito.org/).

## Mock creation

Use `mock` function.
```kotlin
val mock = mock<Foo>()
```

To create a mock with additional settings, use `mock(MockSettings.() -> Unit)` function.
```kotlin
val mock = mock<Foo> { name("foo") }
```

## Stubbing

Use `given` function.
```kotlin
given(mock) {
    running { doSomething("foo") }
            .willReturn("bar")
            .willThrow(IllegalStateException::class)
}
```

This function can also be used for properties, `Unit` (`void`) functions, and spied objects.
```kotlin
given(mock) {
    running { someProperty = "foo" }
            .willReturn(Unit) // Same as Mockito#doNothing()
            .willThrow(IllegalStateException::class)
}
```

## Verification

Currently we do not provide any functions for verification, so use `BDDMockito#then(T)`.
```kotlin
import org.mockito.BDDMockito.then

then(mock).should().doSomething("foo")
then(mock).should().someProperty = "bar"
```

## Comparing arguments

These matchers are defined as top-level functions.
- anyNullable
- any(KClass)
- eq
- refEq
- same
- isA
- isNull
- isNotNull
- nullable
- matches(Regex)
- argThat
- and
- or
- not
- geq
- gt
- leq
- lt
- cmpEq
- find
- aryEq

When using matchers written in Java for functions that only accept non-null parameters, NullPointerException may be thrown.
To avoid NullPointerException, use `by` function with these matchers.
```kotlin
mock.doSomething(by(MatchersWrittenByJava.matchesSomething()))
```

## Capturing arguments

Use `argumentCaptor` function.
```kotlin
val captor = argumentCaptor<String>()
```

To avoid NullPointerException, use `capture` function.
```kotlin
mock.doSomething(capture(captor))
```

## Installation

First, add the [JitPack](https://jitpack.io/) repository and the [JCenter](https://bintray.com/bintray/jcenter) repository to your build.gradle.
```groovy
repositories {
    maven { url 'https://jitpack.io' }
    jcenter()
}
```

And then, add this library and mockito-core as `testCompile` dependency.
```groovy
dependencies {
    testCompile 'com.github.tmurakami:mockito4k:x.y.z'
    testCompile 'org.mockito:mockito-core:latest.release'
}
```

To use this library with mockito-android, add these libraries as `androidTestCompile` dependency.
```groovy
dependencies {
    androidTestCompile 'com.github.tmurakami:mockito4k:x.y.z'
    androidTestCompile 'org.mockito:mockito-android:latest.release'
}
```
