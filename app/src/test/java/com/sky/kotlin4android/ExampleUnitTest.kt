package com.sky.kotlin4android

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        var result = try {
            1 / 0
        } catch (e: Exception) {
            -1
        } finally {
            println("finally")
        }
        println(result)
    }
}
