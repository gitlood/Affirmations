package com.example.affirmations

import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Test

class AffirmationsAdapterTests {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("com.example.affirmations", appContext.packageName)
    }
}