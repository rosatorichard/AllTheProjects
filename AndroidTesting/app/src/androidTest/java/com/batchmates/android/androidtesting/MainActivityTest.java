package com.batchmates.android.androidtesting;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.w3c.dom.Text;

import static android.provider.ContactsContract.Directory.PACKAGE_NAME;
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.ComponentNameMatchers.hasShortClassName;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

/**
 * Created by Android on 7/19/2017.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    private static final String PACKAGENAME = "com.batchmates.android.androidtesting";
    String stringToBeTyped;



//    @Rule
//    public ActivityTestRule<MainActivity> activityActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);

    @Rule
    public IntentsTestRule<MainActivity> mainActivityIntentTestRule= new IntentsTestRule<MainActivity>(MainActivity.class);

    @Before
    public void SetUp()
    {
        stringToBeTyped="Hello World";
    }

    @Test
    public void testText_mainActivity()
    {
        onView(withId(R.id.etEditText))
                .perform(typeText(stringToBeTyped), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.btnButton)).perform(click());

        onView(withId(R.id.tvTextView)).check(matches(withText(stringToBeTyped)));

    }


    @Test
    public void testIntent_mainActivity()
    {
        onView(withId(R.id.etEditText)).perform(typeText(stringToBeTyped),ViewActions.closeSoftKeyboard());

        onView(withId(R.id.btnIntentButton)).perform(click());

        intended(allOf(hasComponent(hasShortClassName(".Main2Activity")),toPackage(PACKAGENAME),hasExtra(MainActivity.EXTRA_KEY,stringToBeTyped)));

    }

}
