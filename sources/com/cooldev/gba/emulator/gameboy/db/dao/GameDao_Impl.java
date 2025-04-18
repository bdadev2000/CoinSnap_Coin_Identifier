package com.cooldev.gba.emulator.gameboy.db.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.cooldev.gba.emulator.gameboy.db.entity.GameRom;
import h0.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class GameDao_Impl implements GameDao {
    private final RoomDatabase __db;

    public GameDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.cooldev.gba.emulator.gameboy.db.dao.GameDao
    public Object findByCRC(String str, g gVar) {
        final RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT * FROM games WHERE crc32 = ? LIMIT 1");
        e.L(1, str);
        return CoroutinesRoom.a(this.__db, new CancellationSignal(), new Callable<GameRom>() { // from class: com.cooldev.gba.emulator.gameboy.db.dao.GameDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            @Nullable
            public GameRom call() throws Exception {
                Cursor b2 = DBUtil.b(GameDao_Impl.this.__db, e, false);
                try {
                    int b3 = CursorUtil.b(b2, "id");
                    int b4 = CursorUtil.b(b2, "name");
                    int b5 = CursorUtil.b(b2, "system");
                    int b6 = CursorUtil.b(b2, "romName");
                    int b7 = CursorUtil.b(b2, "developer");
                    int b8 = CursorUtil.b(b2, "crc32");
                    int b9 = CursorUtil.b(b2, "serial");
                    GameRom gameRom = null;
                    if (b2.moveToFirst()) {
                        gameRom = new GameRom(b2.getInt(b3), b2.isNull(b4) ? null : b2.getString(b4), b2.isNull(b5) ? null : b2.getString(b5), b2.isNull(b6) ? null : b2.getString(b6), b2.isNull(b7) ? null : b2.getString(b7), b2.isNull(b8) ? null : b2.getString(b8), b2.isNull(b9) ? null : b2.getString(b9));
                    }
                    return gameRom;
                } finally {
                    b2.close();
                    e.release();
                }
            }
        }, gVar);
    }

    @Override // com.cooldev.gba.emulator.gameboy.db.dao.GameDao
    public Object findByFileName(String str, g gVar) {
        final RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT * FROM games WHERE romName = ? LIMIT 1");
        e.L(1, str);
        return CoroutinesRoom.a(this.__db, new CancellationSignal(), new Callable<GameRom>() { // from class: com.cooldev.gba.emulator.gameboy.db.dao.GameDao_Impl.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            @Nullable
            public GameRom call() throws Exception {
                Cursor b2 = DBUtil.b(GameDao_Impl.this.__db, e, false);
                try {
                    int b3 = CursorUtil.b(b2, "id");
                    int b4 = CursorUtil.b(b2, "name");
                    int b5 = CursorUtil.b(b2, "system");
                    int b6 = CursorUtil.b(b2, "romName");
                    int b7 = CursorUtil.b(b2, "developer");
                    int b8 = CursorUtil.b(b2, "crc32");
                    int b9 = CursorUtil.b(b2, "serial");
                    GameRom gameRom = null;
                    if (b2.moveToFirst()) {
                        gameRom = new GameRom(b2.getInt(b3), b2.isNull(b4) ? null : b2.getString(b4), b2.isNull(b5) ? null : b2.getString(b5), b2.isNull(b6) ? null : b2.getString(b6), b2.isNull(b7) ? null : b2.getString(b7), b2.isNull(b8) ? null : b2.getString(b8), b2.isNull(b9) ? null : b2.getString(b9));
                    }
                    return gameRom;
                } finally {
                    b2.close();
                    e.release();
                }
            }
        }, gVar);
    }

    @Override // com.cooldev.gba.emulator.gameboy.db.dao.GameDao
    public Object findByName(String str, g gVar) {
        final RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT * FROM games WHERE romName LIKE ?");
        e.L(1, str);
        return CoroutinesRoom.a(this.__db, new CancellationSignal(), new Callable<List<GameRom>>() { // from class: com.cooldev.gba.emulator.gameboy.db.dao.GameDao_Impl.1
            @Override // java.util.concurrent.Callable
            @Nullable
            public List<GameRom> call() throws Exception {
                Cursor b2 = DBUtil.b(GameDao_Impl.this.__db, e, false);
                try {
                    int b3 = CursorUtil.b(b2, "id");
                    int b4 = CursorUtil.b(b2, "name");
                    int b5 = CursorUtil.b(b2, "system");
                    int b6 = CursorUtil.b(b2, "romName");
                    int b7 = CursorUtil.b(b2, "developer");
                    int b8 = CursorUtil.b(b2, "crc32");
                    int b9 = CursorUtil.b(b2, "serial");
                    ArrayList arrayList = new ArrayList(b2.getCount());
                    while (b2.moveToNext()) {
                        arrayList.add(new GameRom(b2.getInt(b3), b2.isNull(b4) ? null : b2.getString(b4), b2.isNull(b5) ? null : b2.getString(b5), b2.isNull(b6) ? null : b2.getString(b6), b2.isNull(b7) ? null : b2.getString(b7), b2.isNull(b8) ? null : b2.getString(b8), b2.isNull(b9) ? null : b2.getString(b9)));
                    }
                    return arrayList;
                } finally {
                    b2.close();
                    e.release();
                }
            }
        }, gVar);
    }

    @Override // com.cooldev.gba.emulator.gameboy.db.dao.GameDao
    public Object findBySerial(String str, g gVar) {
        final RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT * FROM games WHERE serial = ? LIMIT 1");
        e.L(1, str);
        return CoroutinesRoom.a(this.__db, new CancellationSignal(), new Callable<GameRom>() { // from class: com.cooldev.gba.emulator.gameboy.db.dao.GameDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            @Nullable
            public GameRom call() throws Exception {
                Cursor b2 = DBUtil.b(GameDao_Impl.this.__db, e, false);
                try {
                    int b3 = CursorUtil.b(b2, "id");
                    int b4 = CursorUtil.b(b2, "name");
                    int b5 = CursorUtil.b(b2, "system");
                    int b6 = CursorUtil.b(b2, "romName");
                    int b7 = CursorUtil.b(b2, "developer");
                    int b8 = CursorUtil.b(b2, "crc32");
                    int b9 = CursorUtil.b(b2, "serial");
                    GameRom gameRom = null;
                    if (b2.moveToFirst()) {
                        gameRom = new GameRom(b2.getInt(b3), b2.isNull(b4) ? null : b2.getString(b4), b2.isNull(b5) ? null : b2.getString(b5), b2.isNull(b6) ? null : b2.getString(b6), b2.isNull(b7) ? null : b2.getString(b7), b2.isNull(b8) ? null : b2.getString(b8), b2.isNull(b9) ? null : b2.getString(b9));
                    }
                    return gameRom;
                } finally {
                    b2.close();
                    e.release();
                }
            }
        }, gVar);
    }
}
