package com.mayowa.android.unittesttrainingwithstutern

import android.os.Build.VERSION_CODES.M
import android.widget.Button
import org.hamcrest.CoreMatchers
import org.hamcrest.Matchers.equalTo
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows.shadowOf
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowActivity
import org.robolectric.shadows.ShadowToast

@RunWith(RobolectricTestRunner::class)
@Config( sdk = [M])
class MainActivityTest {

    lateinit var activity: MainActivity

    @Before
    @Throws(Exception::class)
    fun setUp() {
        activity = Robolectric.buildActivity(MainActivity::class.java)
            .setup()
            .get()
    }

    @Test
    fun checkActivityNotNull() {
        Assert.assertNotNull(activity)
    }

    @Test
    fun assertLayoutProperties() {
        val button = activity.findViewById<Button>(R.id.hello_button)
        assertEquals(5, button.paddingBottom)
        assertEquals(10, button.paddingLeft)
        //TODO: assert the top padding
        //TODO: assert the right padding
        //TODO: assert the text on the button
    }

    @Test
    fun shouldHaveCorrectAppName() {
        val hello: String = activity.resources.getString(R.string.app_name)
        assertEquals("Unit Test Training With Stutern", hello)
    }

    @Test
    fun shouldLaunchSecondActivity() {
        val view = activity.findViewById<Button>(R.id.hello_button)
        view.performClick()

        val shadowActivity: ShadowActivity = shadowOf(activity)
        val startedIntent = shadowActivity.nextStartedActivity
        val shadowIntent = shadowOf(startedIntent)

        assertThat(shadowIntent.intentClass.simpleName, equalTo(SecondActivity::class.java.simpleName))
    }

    @Test
    fun shouldLaunchThirdActivity() {
        /**
         * TODO: Create a new activity called ThirdActivity, add a new button to MainActivity
         * to launch ThirdActivity. Write a test to validate thirdActivity intent was launched
         * when button is tapped
         */

    }

    @Test fun shouldShowToastWhenActivityIsPaused() {
        // GIVEN
        val controller = Robolectric.buildActivity(MainActivity::class.java).setup()

        // WHEN
        controller.pause()

        // THEN
        assertThat(
            ShadowToast.getTextOfLatestToast(),
            CoreMatchers.equalTo("Activity paused")
        )
    }
}
