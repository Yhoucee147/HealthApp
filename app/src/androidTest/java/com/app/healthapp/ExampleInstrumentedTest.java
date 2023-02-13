package com.app.healthapp;

import android.content.Context;

import androidx.room.Room;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.app.healthapp.roompckg.dao.MotivationalQuoteDAO;
import com.app.healthapp.roompckg.dao.PersonDAO;
import com.app.healthapp.roompckg.db.AppDatabase;
import com.app.healthapp.roompckg.entities.MotivationalQuote;
import com.app.healthapp.roompckg.entities.Person;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        MotivationalQuote m = new MotivationalQuote();
        m.setQuote("test");
        AppDatabase db = Room.databaseBuilder(appContext,
                AppDatabase.class, "health").allowMainThreadQueries().build();
        MotivationalQuoteDAO md = db.motivationalQuoteDAO();
        md.addMotivationalQuote(m);
        assertEquals("test",md.findByQuote("test").getQuote());
    }
}