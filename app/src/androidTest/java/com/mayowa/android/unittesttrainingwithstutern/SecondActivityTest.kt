//package com.mayowa.android.unittesttrainingwithstutern
//
//import android.widget.EditText
//import androidx.lifecycle.Lifecycle
//import androidx.test.core.app.ActivityScenario
//import androidx.test.espresso.Espresso.onView
//import androidx.test.espresso.action.TypeTextAction
//import androidx.test.espresso.assertion.ViewAssertions.matches
//import androidx.test.espresso.matcher.ViewMatchers.withId
//import androidx.test.espresso.matcher.ViewMatchers.withText
//import androidx.test.ext.junit.runners.AndroidJUnit4
//import org.junit.Assert.assertEquals
//import org.junit.Before
//import org.junit.Test
//import org.junit.runner.RunWith
//
//@RunWith(AndroidJUnit4::class)
//class SecondActivityTest {
//
//    lateinit var activityScenario: ActivityScenario<SecondActivity>
//
//    @Before
//    @Throws(Exception::class)
//    fun setUp() {
//        activityScenario = ActivityScenario.launch(SecondActivity::class.java)
//    }
//
//    @Test
//    fun editTextShouldReadWriteSomething() {
//        // WHEN
//        activityScenario.moveToState(Lifecycle.State.CREATED)
//
//        // THEN
//        activityScenario.onActivity { activity ->
//            val text = activity.findViewById<EditText>(R.id.text).toString()
//            assertEquals("Write something", text)
//        }
//    }
//
//    @Test
//    fun editTextShouldReadActivityResumed() {
//        // WHEN
//        activityScenario.moveToState(Lifecycle.State.RESUMED)
//
//        // THEN
//        activityScenario.onActivity { activity ->
//            val text = activity.findViewById<EditText>(R.id.text).toString()
//            assertEquals("Activity Resumed", text)
//        }
//    }
//
//    @Test
//    fun inputTextShouldBeRetainedAfterActivityRecreation() {
//        // GIVEN
//        val content = "Activity will be recreated"
//
//        // WHEN
//        // Enter content
//        onView(withId(R.id.text)).perform(TypeTextAction(content))
//        // Destroy and recreate Activity
//        activityScenario.recreate()
//
//        // THEN
//        // Check content was preserved.
//        onView(withId(R.id.text)).check(matches(withText(content)))
//    }
//}
