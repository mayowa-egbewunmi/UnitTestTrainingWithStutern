package com.mayowa.android.unittesttrainingwithstutern

import android.content.Context
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.*

//TODO: Update this class to include GIVEN, WHEN and THEN comments
class TextUtilText {

    private val context: Context = mock(Context::class.java)

    private val underTest = TextUtil(context)

    @Test
    fun assertStringFromContext() {
        `when`(context.getString(R.string.stutern_training)).thenReturn(STUTERN_TRAINING)

        val result: String = underTest.getString(R.string.stutern_training)

        assertEquals(result, STUTERN_TRAINING)
        verify(context, atLeastOnce()).getString(R.string.stutern_training)
    }

    @Test(expected = RuntimeException::class)
    fun verifyExceptionCaughtFromContext() {
        `when`(context.getString(R.id.top)).thenThrow(RuntimeException())

        underTest.getString(R.id.top)
    }

    @Test
    fun testLinkedListSpyWrong() {
        val list = emptyList<String>()
        val spyList = spy(list)
        // this does not work
        // real method is called so spy.get(0)
        // throws IndexOutOfBoundsException (list is still empty)
        `when`(spyList[0]).thenReturn("foo")
        assertEquals("foo", spyList[0])
    }

    @Test
    fun testLinkedListSpyCorrect() { // Lets mock a LinkedList
        val list = emptyList<String>()
        val spyList = spy(list)

        // You have to use doReturn() for stubbing
        doReturn("foo").`when`(spyList)[0]
        assertEquals("foo", spyList[0])
    }
}

private const val STUTERN_TRAINING = "Stutern Training"
