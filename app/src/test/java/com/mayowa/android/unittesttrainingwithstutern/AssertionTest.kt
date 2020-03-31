package com.mayowa.android.unittesttrainingwithstutern

import org.junit.Assert.assertFalse
import org.junit.Test

class AssertionTest {

    @Test
    fun assertFalseTest(){
        val list = listOf(1, 2, 3)
        assertFalse(list.contains(4))
    }

    @Test
    fun assertTrueTest(){
        val list = listOf(1, 2, 3)
        //TODO: Assert that list contains 2
    }

    @Test
    fun assertNotSameTest(){
        //TODO
    }

    @Test
    fun assertSameTest(){
        //TODO
    }

    @Test
    fun assertNotNullTest(){
        //TODO
    }

    @Test
    fun assertNullTest(){
        //TODO
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun exceptionTest() {
        val list = listOf(1, 2, 3)
        println(list[3])
    }
}
