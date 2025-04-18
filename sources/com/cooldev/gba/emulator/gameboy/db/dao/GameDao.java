package com.cooldev.gba.emulator.gameboy.db.dao;

import androidx.room.Dao;
import androidx.room.Query;
import h0.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Dao
/* loaded from: classes3.dex */
public interface GameDao {
    @Query
    @Nullable
    Object findByCRC(@NotNull String str, @NotNull g gVar);

    @Query
    @Nullable
    Object findByFileName(@NotNull String str, @NotNull g gVar);

    @Query
    @Nullable
    Object findByName(@NotNull String str, @NotNull g gVar);

    @Query
    @Nullable
    Object findBySerial(@NotNull String str, @NotNull g gVar);
}
