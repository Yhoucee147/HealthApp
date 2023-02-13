package com.app.healthapp.roompckg.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.app.healthapp.roompckg.entities.Ailment;
import com.app.healthapp.roompckg.entities.WorkRoutine;

import java.util.List;

@Dao
public interface AilmentDAO {

    @Query("SELECT * FROM ailments")
    List<Ailment> getAll();

    @Query("SELECT * FROM ailments WHERE ailmentName LIKE :ailmentName LIMIT 1")
    Ailment findByName(String ailmentName);

    @Insert
    void addAilment(Ailment ailment);

}
