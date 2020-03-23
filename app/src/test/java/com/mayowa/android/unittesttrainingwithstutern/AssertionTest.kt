package com.mayowa.android.unittesttrainingwithstutern

import org.junit.Assert.*
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
        assertTrue(list.contains(2))
    }

    @Test
    fun assertSameTest(){
        val list = listOf(1, 2, 3)
        val actual = list[0]
        assertSame(1, actual)
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
