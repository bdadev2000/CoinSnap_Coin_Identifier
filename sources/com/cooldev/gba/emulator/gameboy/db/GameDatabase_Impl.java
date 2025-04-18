package com.cooldev.gba.emulator.gameboy.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.cooldev.gba.emulator.gameboy.db.dao.GameDao;
import com.cooldev.gba.emulator.gameboy.db.dao.GameDao_Impl;
import com.facebook.appevents.UserDataStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p0.a;

/* loaded from: classes3.dex */
public final class GameDatabase_Impl extends GameDatabase {
    private volatile GameDao _gameDao;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase U = super.getOpenHelper().U();
        try {
            super.beginTransaction();
            U.g("DELETE FROM `games`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            U.W("PRAGMA wal_checkpoint(FULL)").close();
            if (!U.c0()) {
                U.g("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "games");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public SupportSQLiteOpenHelper createOpenHelper(@NonNull DatabaseConfiguration databaseConfiguration) {
        RoomOpenHelper roomOpenHelper = new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(1) { // from class: com.cooldev.gba.emulator.gameboy.db.GameDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `games` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `system` TEXT, `romName` TEXT, `developer` TEXT, `crc32` TEXT, `serial` TEXT)");
                supportSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_games_romName` ON `games` (`romName`)");
                supportSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_games_crc32` ON `games` (`crc32`)");
                supportSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_games_serial` ON `games` (`serial`)");
                supportSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9b8d240312634152da03aa0cfefc2ec1')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.g("DROP TABLE IF EXISTS `games`");
                List list = ((RoomDatabase) GameDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).getClass();
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
                List list = ((RoomDatabase) GameDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).getClass();
                        a.s(supportSQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
                ((RoomDatabase) GameDatabase_Impl.this).mDatabase = supportSQLiteDatabase;
                GameDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                List list = ((RoomDatabase) GameDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).a(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
                DBUtil.a(supportSQLiteDatabase);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            @NonNull
            public RoomOpenHelper.ValidationResult onValidateSchema(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap hashMap = new HashMap(7);
                hashMap.put("id", new TableInfo.Column(1, "id", "INTEGER", null, true, 1));
                hashMap.put("name", new TableInfo.Column(0, "name", "TEXT", null, false, 1));
                hashMap.put("system", new TableInfo.Column(0, "system", "TEXT", null, false, 1));
                hashMap.put("romName", new TableInfo.Column(0, "romName", "TEXT", null, false, 1));
                hashMap.put("developer", new TableInfo.Column(0, "developer", "TEXT", null, false, 1));
                hashMap.put("crc32", new TableInfo.Column(0, "crc32", "TEXT", null, false, 1));
                hashMap.put("serial", new TableInfo.Column(0, "serial", "TEXT", null, false, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(3);
                hashSet2.add(new TableInfo.Index("index_games_romName", false, Arrays.asList("romName"), Arrays.asList("ASC")));
                hashSet2.add(new TableInfo.Index("index_games_crc32", false, Arrays.asList("crc32"), Arrays.asList("ASC")));
                hashSet2.add(new TableInfo.Index("index_games_serial", false, Arrays.asList("serial"), Arrays.asList("ASC")));
                TableInfo tableInfo = new TableInfo("games", hashMap, hashSet, hashSet2);
                TableInfo a2 = TableInfo.a(supportSQLiteDatabase, "games");
                if (tableInfo.equals(a2)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "games(com.cooldev.gba.emulator.gameboy.db.entity.GameRom).\n Expected:\n" + tableInfo + "\n Found:\n" + a2);
            }
        }, "9b8d240312634152da03aa0cfefc2ec1", "71ca381826142a647fb05194cb2f4b91");
        SupportSQLiteOpenHelper.Configuration.Builder a2 = SupportSQLiteOpenHelper.Configuration.Companion.a(databaseConfiguration.f21249a);
        a2.f21463b = databaseConfiguration.f21250b;
        a2.f21464c = roomOpenHelper;
        return databaseConfiguration.f21251c.a(a2.a());
    }

    @Override // com.cooldev.gba.emulator.gameboy.db.GameDatabase
    public GameDao gameDao() {
        GameDao gameDao;
        if (this._gameDao != null) {
            return this._gameDao;
        }
        synchronized (this) {
            try {
                if (this._gameDao == null) {
                    this._gameDao = new GameDao_Impl(this);
                }
                gameDao = this._gameDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gameDao;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(GameDao.class, GameDao_Impl.getRequiredConverters());
        return hashMap;
    }
}
