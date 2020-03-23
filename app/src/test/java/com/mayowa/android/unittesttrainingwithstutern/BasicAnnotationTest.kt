package com.mayowa.android.unittesttrainingwithstutern

import org.junit.*

/**
 * This class was copied from: https://mkyong.com/unittest/junit-4-tutorial-1-basic-usage/
 */
class BasicAnnotationTest {

    companion object {
        // Run once, e.g. Database connection, connection pool
        @BeforeClass
        @JvmStatic
        fun runOnceBeforeClass() {
            println("@BeforeClass - runOnceBeforeClass")
        }

        // Run once, e.g close connection, cleanup
        @AfterClass
        @JvmStatic
        fun runOnceAfterClass() {
            println("@AfterClass - runOnceAfterClass")
        }
    }

    // e.g. Creating an similar object and share for all @Test
    @Before
    fun runBeforeTestMethod() {
        println("@Before - runBeforeTestMethod")
    }

    @After
    fun runAfterTestMethod() {
        println("@After - runAfterTestMethod")
    }

    @Test
    fun method_1() {
        println("@Test - test_method_1")
    }

    @Test
    fun method_2() {
        println("@Test - test_method_2")
    }

    @Test
    @Ignore("Testing @ignore annotation")
    fun method_3(){
        println("@Test - will not be executed")
    }
}
