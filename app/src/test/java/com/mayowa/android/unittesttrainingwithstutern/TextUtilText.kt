package com.mayowa.android.unittesttrainingwithstutern

import android.content.Context
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.*
import java.util.*

class TextUtilText {

    private val context: Context = mock(Context::class.java)

    private val underTest = TextUtil(context)

    @Test
    fun assertStringFromContext() {
        //Returns the STUTERN_TRAINING when getString(R.string.stutern_training) is called
        `when`(context.getString(R.string.stutern_training)).thenReturn(STUTERN_TRAINING)

        //Stores the return value of getStuternTrainingString() in result
        val result: String = underTest.getString(R.string.stutern_training)

        //Asserts that result is the value of STUTERN_TRAINING
        assertEquals(result, STUTERN_TRAINING)
        verify(context, atLeastOnce()).getString(R.string.stutern_training)
    }

    @Test(expected = RuntimeException::class)
    fun verifyExceptionCaughtFromContext() {
        //Returns the STUTERN_TRAINING when getString(R.string.stutern_training) is called
        `when`(context.getString(R.id.top)).thenThrow(RuntimeException())

        //When getString is called with R.id.hello_world
        underTest.getString(R.id.top)
    }

    @Test
    fun testLinkedListSpyWrong() { // Lets mock a LinkedList
        val list: List<String> = LinkedList()
        val spy = spy(list)
        // this does not work
        // real method is called so spy.get(0)
        // throws IndexOutOfBoundsException (list is still empty)
        `when`(spy[0]).thenReturn("foo")
        assertEquals("foo", spy[0])
    }

    @Test
    fun testLinkedListSpyCorrect() { // Lets mock a LinkedList
        val list: List<String> = LinkedList()
        val spy = spy(list)
        // You have to use doReturn() for stubbing
        doReturn("foo").`when`(spy)[0]
        assertEquals("foo", spy[0])
    }
}

private const val STUTERN_TRAINING = "Stutern Training"
