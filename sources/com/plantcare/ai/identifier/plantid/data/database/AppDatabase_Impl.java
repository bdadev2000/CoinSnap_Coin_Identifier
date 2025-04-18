package com.plantcare.ai.identifier.plantid.data.database;

import android.content.Context;
import androidx.annotation.NonNull;
import com.facebook.internal.i;
import com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao;
import com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao_Impl;
import com.plantcare.ai.identifier.plantid.data.database.daos.HistoryPlantDao;
import com.plantcare.ai.identifier.plantid.data.database.daos.HistoryPlantDao_Impl;
import com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao;
import com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import m2.f;
import v1.f0;
import v1.g0;
import v1.h0;
import v1.i0;
import v1.j;
import v1.u;
import x1.b;
import z1.a;
import z1.c;
import z1.g;

/* loaded from: classes4.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile AlarmDao _alarmDao;
    private volatile HistoryPlantDao _historyPlantDao;
    private volatile PlantDao _plantDao;

    @Override // com.plantcare.ai.identifier.plantid.data.database.AppDatabase
    public AlarmDao alarmDao() {
        AlarmDao alarmDao;
        if (this._alarmDao != null) {
            return this._alarmDao;
        }
        synchronized (this) {
            if (this._alarmDao == null) {
                this._alarmDao = new AlarmDao_Impl(this);
            }
            alarmDao = this._alarmDao;
        }
        return alarmDao;
    }

    @Override // v1.f0
    @NonNull
    public u createInvalidationTracker() {
        return new u(this, new HashMap(0), new HashMap(0), "HISTORY_SEARCH", "Plant", "Record_Alarm", "Diseases");
    }

    @Override // v1.f0
    @NonNull
    public g createOpenHelper(@NonNull j jVar) {
        i0 callback = new i0(jVar, new g0(1) { // from class: com.plantcare.ai.identifier.plantid.data.database.AppDatabase_Impl.1
            @Override // v1.g0
            public void createAllTables(@NonNull a aVar) {
                aVar.C("CREATE TABLE IF NOT EXISTS `HISTORY_SEARCH` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `scientificName` TEXT NOT NULL, `genus` TEXT NOT NULL, `family` TEXT NOT NULL, `commonNames` TEXT NOT NULL, `images` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `treatment` TEXT NOT NULL, `diseaseName` TEXT NOT NULL, `diseaseDes` TEXT NOT NULL, `type` INTEGER NOT NULL, `commonDiseases` TEXT NOT NULL)");
                aVar.C("CREATE TABLE IF NOT EXISTS `Plant` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `scientificName` TEXT NOT NULL, `genus` TEXT NOT NULL, `family` TEXT NOT NULL, `commonNames` TEXT NOT NULL, `images` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `treatment` TEXT NOT NULL, `commonDiseases` TEXT NOT NULL)");
                aVar.C("CREATE TABLE IF NOT EXISTS `Record_Alarm` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `label` TEXT, `description` TEXT, `allDays` TEXT, `soundRes` INTEGER NOT NULL, `isEnabled` INTEGER NOT NULL, `isVibration` INTEGER NOT NULL, `type` INTEGER NOT NULL)");
                aVar.C("CREATE TABLE IF NOT EXISTS `Diseases` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL)");
                aVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                aVar.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c7e2fb8f04e40486a37a6cf6f31b8c58')");
            }

            @Override // v1.g0
            public void dropAllTables(@NonNull a db2) {
                db2.C("DROP TABLE IF EXISTS `HISTORY_SEARCH`");
                db2.C("DROP TABLE IF EXISTS `Plant`");
                db2.C("DROP TABLE IF EXISTS `Record_Alarm`");
                db2.C("DROP TABLE IF EXISTS `Diseases`");
                List list = ((f0) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
            }

            @Override // v1.g0
            public void onCreate(@NonNull a db2) {
                List list = ((f0) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
            }

            @Override // v1.g0
            public void onOpen(@NonNull a aVar) {
                ((f0) AppDatabase_Impl.this).mDatabase = aVar;
                AppDatabase_Impl.this.internalInitInvalidationTracker(aVar);
                List list = ((f0) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).getClass();
                        f.a(aVar);
                    }
                }
            }

            @Override // v1.g0
            public void onPostMigrate(@NonNull a aVar) {
            }

            @Override // v1.g0
            public void onPreMigrate(@NonNull a aVar) {
                i.n(aVar);
            }

            @Override // v1.g0
            @NonNull
            public h0 onValidateSchema(@NonNull a aVar) {
                HashMap hashMap = new HashMap(12);
                hashMap.put("id", new b(1, "id", "INTEGER", null, true, 1));
                hashMap.put("scientificName", new b(0, "scientificName", "TEXT", null, true, 1));
                hashMap.put("genus", new b(0, "genus", "TEXT", null, true, 1));
                hashMap.put("family", new b(0, "family", "TEXT", null, true, 1));
                hashMap.put("commonNames", new b(0, "commonNames", "TEXT", null, true, 1));
                hashMap.put("images", new b(0, "images", "TEXT", null, true, 1));
                hashMap.put("createdAt", new b(0, "createdAt", "INTEGER", null, true, 1));
                hashMap.put("treatment", new b(0, "treatment", "TEXT", null, true, 1));
                hashMap.put("diseaseName", new b(0, "diseaseName", "TEXT", null, true, 1));
                hashMap.put("diseaseDes", new b(0, "diseaseDes", "TEXT", null, true, 1));
                hashMap.put("type", new b(0, "type", "INTEGER", null, true, 1));
                hashMap.put("commonDiseases", new b(0, "commonDiseases", "TEXT", null, true, 1));
                x1.f fVar = new x1.f("HISTORY_SEARCH", hashMap, new HashSet(0), new HashSet(0));
                x1.f a = x1.f.a(aVar, "HISTORY_SEARCH");
                if (!fVar.equals(a)) {
                    return new h0(false, "HISTORY_SEARCH(com.plantcare.ai.identifier.plantid.data.database.entities.HistoryEntity).\n Expected:\n" + fVar + "\n Found:\n" + a);
                }
                HashMap hashMap2 = new HashMap(9);
                hashMap2.put("id", new b(1, "id", "INTEGER", null, true, 1));
                hashMap2.put("scientificName", new b(0, "scientificName", "TEXT", null, true, 1));
                hashMap2.put("genus", new b(0, "genus", "TEXT", null, true, 1));
                hashMap2.put("family", new b(0, "family", "TEXT", null, true, 1));
                hashMap2.put("commonNames", new b(0, "commonNames", "TEXT", null, true, 1));
                hashMap2.put("images", new b(0, "images", "TEXT", null, true, 1));
                hashMap2.put("createdAt", new b(0, "createdAt", "INTEGER", null, true, 1));
                hashMap2.put("treatment", new b(0, "treatment", "TEXT", null, true, 1));
                hashMap2.put("commonDiseases", new b(0, "commonDiseases", "TEXT", null, true, 1));
                x1.f fVar2 = new x1.f("Plant", hashMap2, new HashSet(0), new HashSet(0));
                x1.f a10 = x1.f.a(aVar, "Plant");
                if (!fVar2.equals(a10)) {
                    return new h0(false, "Plant(com.plantcare.ai.identifier.plantid.data.database.entities.PlantEntity).\n Expected:\n" + fVar2 + "\n Found:\n" + a10);
                }
                HashMap hashMap3 = new HashMap(9);
                hashMap3.put("id", new b(1, "id", "INTEGER", null, true, 1));
                hashMap3.put("time", new b(0, "time", "INTEGER", null, true, 1));
                hashMap3.put("label", new b(0, "label", "TEXT", null, false, 1));
                hashMap3.put("description", new b(0, "description", "TEXT", null, false, 1));
                hashMap3.put("allDays", new b(0, "allDays", "TEXT", null, false, 1));
                hashMap3.put("soundRes", new b(0, "soundRes", "INTEGER", null, true, 1));
                hashMap3.put("isEnabled", new b(0, "isEnabled", "INTEGER", null, true, 1));
                hashMap3.put("isVibration", new b(0, "isVibration", "INTEGER", null, true, 1));
                hashMap3.put("type", new b(0, "type", "INTEGER", null, true, 1));
                x1.f fVar3 = new x1.f("Record_Alarm", hashMap3, new HashSet(0), new HashSet(0));
                x1.f a11 = x1.f.a(aVar, "Record_Alarm");
                if (!fVar3.equals(a11)) {
                    return new h0(false, "Record_Alarm(com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity).\n Expected:\n" + fVar3 + "\n Found:\n" + a11);
                }
                HashMap hashMap4 = new HashMap(3);
                hashMap4.put("id", new b(1, "id", "INTEGER", null, true, 1));
                hashMap4.put("name", new b(0, "name", "TEXT", null, true, 1));
                hashMap4.put("description", new b(0, "description", "TEXT", null, true, 1));
                x1.f fVar4 = new x1.f("Diseases", hashMap4, new HashSet(0), new HashSet(0));
                x1.f a12 = x1.f.a(aVar, "Diseases");
                if (!fVar4.equals(a12)) {
                    return new h0(false, "Diseases(com.plantcare.ai.identifier.plantid.data.database.entities.DiseaseEntity).\n Expected:\n" + fVar4 + "\n Found:\n" + a12);
                }
                return new h0(true, null);
            }
        }, "c7e2fb8f04e40486a37a6cf6f31b8c58", "812625715616d1784ef557727511abe3");
        Context context = jVar.a;
        Intrinsics.checkNotNullParameter(context, "context");
        c cVar = new c(context);
        cVar.f28457b = jVar.f25891b;
        Intrinsics.checkNotNullParameter(callback, "callback");
        cVar.f28458c = callback;
        return jVar.f25892c.d(cVar.a());
    }

    @Override // v1.f0
    @NonNull
    public List<w1.a> getAutoMigrations(@NonNull Map<Class<Object>, Object> map) {
        return new ArrayList();
    }

    @Override // v1.f0
    @NonNull
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // v1.f0
    @NonNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(HistoryPlantDao.class, HistoryPlantDao_Impl.getRequiredConverters());
        hashMap.put(PlantDao.class, PlantDao_Impl.getRequiredConverters());
        hashMap.put(AlarmDao.class, AlarmDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.AppDatabase
    public HistoryPlantDao historyDao() {
        HistoryPlantDao historyPlantDao;
        if (this._historyPlantDao != null) {
            return this._historyPlantDao;
        }
        synchronized (this) {
            if (this._historyPlantDao == null) {
                this._historyPlantDao = new HistoryPlantDao_Impl(this);
            }
            historyPlantDao = this._historyPlantDao;
        }
        return historyPlantDao;
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.AppDatabase
    public PlantDao plantDao() {
        PlantDao plantDao;
        if (this._plantDao != null) {
            return this._plantDao;
        }
        synchronized (this) {
            if (this._plantDao == null) {
                this._plantDao = new PlantDao_Impl(this);
            }
            plantDao = this._plantDao;
        }
        return plantDao;
    }
}
