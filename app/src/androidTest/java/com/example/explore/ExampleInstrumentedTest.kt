package com.example.explore

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class counterTest {

    var text = "Clicks: 0"

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun counterInitiallyZero() {
        val text = composeTestRule.activity.getString(R.string.clicks, 0)
        composeTestRule.onNodeWithText(text).assertExists()
    }

    @Test
    fun counterButton_incrementCounter() {
        val textIncrement = composeTestRule.activity.getString(R.string.increment_counter)
        composeTestRule.onNodeWithText(textIncrement).performClick()

        var textClicks = composeTestRule.activity.getString(R.string.clicks, 1)
        composeTestRule.onNodeWithText(textClicks).assertExists()
    }
}