package com.mayowa.android.unittesttrainingwithstutern

import junit.framework.TestCase

class JunitTestCaseTest : TestCase() {

    private val list = mutableListOf<Int>()

    override fun setUp() {
        list.add(1)
        list.add(2)
    }

    override fun tearDown() {
        super.tearDown()
        list.clear()
    }

    fun testSize() {
        assertEquals("Checking size of list", list.size, 2)
    }

    fun testAdd() {
        list.add(3)
        assertEquals("Checking add", list.size, 3)
    }

    fun testRemove() {
        list.removeAt(0)
        assertEquals("Checking remove", list.size, 1)
    }
}
