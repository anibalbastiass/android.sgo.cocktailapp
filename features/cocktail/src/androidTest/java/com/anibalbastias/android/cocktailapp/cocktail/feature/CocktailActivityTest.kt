package com.anibalbastias.android.cocktailapp.cocktail.feature

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.anibalbastias.android.cocktailapp.cocktail.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CocktailActivityTest {

    @get:Rule
    val rule = ActivityScenarioRule<CocktailActivity>(CocktailActivity::class.java)

    @Test
    fun launchKotlinSampleActivity() {
        onView(withText(R.string.content_text)).check(matches(isDisplayed()))
    }
}
