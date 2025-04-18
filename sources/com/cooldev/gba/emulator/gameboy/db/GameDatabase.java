package com.cooldev.gba.emulator.gameboy.db;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.cooldev.gba.emulator.gameboy.db.dao.GameDao;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Database
/* loaded from: classes2.dex */
public abstract class GameDatabase extends RoomDatabase {
    public static final int $stable = 0;

    @NotNull
    public abstract GameDao gameDao();
}
