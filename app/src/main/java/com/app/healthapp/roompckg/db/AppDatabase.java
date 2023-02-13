package com.app.healthapp.roompckg.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.app.healthapp.roompckg.dao.AilmentDAO;
import com.app.healthapp.roompckg.dao.FoodDAO;
import com.app.healthapp.roompckg.dao.MotivationalQuoteDAO;
import com.app.healthapp.roompckg.dao.PersonDAO;
import com.app.healthapp.roompckg.dao.WorkoutRoutineDAO;
import com.app.healthapp.roompckg.entities.Ailment;
import com.app.healthapp.roompckg.entities.Food;
import com.app.healthapp.roompckg.entities.MotivationalQuote;
import com.app.healthapp.roompckg.entities.Person;
import com.app.healthapp.roompckg.entities.WorkRoutine;

@Database(entities = {Ailment.class, Food.class, MotivationalQuote.class, Person.class, WorkRoutine.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AilmentDAO ailmentDAO();
    public abstract FoodDAO foodDAO();
    public abstract MotivationalQuoteDAO motivationalQuoteDAO();
    public abstract PersonDAO personDAO();
    public abstract WorkoutRoutineDAO workoutRoutineDAO();

}
