package com.realtomjoney.intrototesting

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
@Config(sdk = [29])

class ExampleUnitTest {
    @Test
    fun first_test() {
        ActivityScenario.launch(MainActivity::class.java).onActivity { activity ->
            assert(activity.readValue() == null)
        }
    }
}