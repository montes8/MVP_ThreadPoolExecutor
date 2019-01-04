package com.example.tayler_gabbi.mvp_threadpoolexecutor;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.example.tayler_gabbi.mvp_threadpoolexecutor.database.DemoDataBase;

public class DemoApplication extends Application {

    public static DemoDataBase dataBase;

    @Override
    public void onCreate() {
        super.onCreate();
        dataBase = Room.databaseBuilder(this,DemoDataBase.class,"demo_database.db")
                .build();
    }
}
