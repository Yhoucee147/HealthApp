package com.app.healthapp.roompckg.utils;

import com.app.healthapp.roompckg.entities.Food;

import java.util.ArrayList;
import java.util.List;

public class FoodItems {

    private static List<Food> dailyTable = new ArrayList<>();

    public static List<Food> getDailyTable() {
        return dailyTable;
    }

    public static void setDailyTable(List<Food> dailyTable) {
        FoodItems.dailyTable = dailyTable;
    }
}
