package com.plantcare.ai.identifier.plantid.data.database.daos;

import android.database.Cursor;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import com.facebook.appevents.o;
import com.facebook.internal.i;
import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import v1.f0;
import v1.j0;
import v1.k;
import v1.l;
import v1.n0;
import xg.a;
import z1.j;

/* loaded from: classes4.dex */
public final class AlarmDao_Impl implements AlarmDao {
    private final a __converters = new a();
    private final f0 __db;
    private final k __deletionAdapterOfAlarmEntity;
    private final l __insertionAdapterOfAlarmEntity;
    private final n0 __preparedStmtOfDeleteAlarmTypeNotifyDaily;
    private final n0 __preparedStmtOfDeleteAlarmTypeNotifyFullScreen;
    private final k __updateAdapterOfAlarmEntity;

    public AlarmDao_Impl(@NonNull f0 f0Var) {
        this.__db = f0Var;
        this.__insertionAdapterOfAlarmEntity = new l(f0Var) { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao_Impl.1
            @Override // v1.n0
            @NonNull
            public String createQuery() {
                return "INSERT OR REPLACE INTO `Record_Alarm` (`id`,`time`,`label`,`description`,`allDays`,`soundRes`,`isEnabled`,`isVibration`,`type`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            }

            @Override // v1.l
            public void bind(@NonNull j jVar, AlarmEntity alarmEntity) {
                jVar.m(1, alarmEntity.getId());
                jVar.m(2, alarmEntity.getTime());
                if (alarmEntity.getLabel() == null) {
                    jVar.o(3);
                } else {
                    jVar.i(3, alarmEntity.getLabel());
                }
                if (alarmEntity.getDescription() == null) {
                    jVar.o(4);
                } else {
                    jVar.i(4, alarmEntity.getDescription());
                }
                a aVar = AlarmDao_Impl.this.__converters;
                SparseBooleanArray allDays = alarmEntity.getAllDays();
                aVar.getClass();
                String a = a.a(allDays);
                if (a == null) {
                    jVar.o(5);
                } else {
                    jVar.i(5, a);
                }
                jVar.m(6, alarmEntity.getSoundRes());
                jVar.m(7, alarmEntity.isEnabled() ? 1L : 0L);
                jVar.m(8, alarmEntity.isVibration() ? 1L : 0L);
                jVar.m(9, alarmEntity.getType());
            }
        };
        this.__deletionAdapterOfAlarmEntity = new k(f0Var) { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao_Impl.2
            @Override // v1.n0
            @NonNull
            public String createQuery() {
                return "DELETE FROM `Record_Alarm` WHERE `id` = ?";
            }

            @Override // v1.k
            public void bind(@NonNull j jVar, AlarmEntity alarmEntity) {
                jVar.m(1, alarmEntity.getId());
            }
        };
        this.__updateAdapterOfAlarmEntity = new k(f0Var) { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao_Impl.3
            @Override // v1.n0
            @NonNull
            public String createQuery() {
                return "UPDATE OR ABORT `Record_Alarm` SET `id` = ?,`time` = ?,`label` = ?,`description` = ?,`allDays` = ?,`soundRes` = ?,`isEnabled` = ?,`isVibration` = ?,`type` = ? WHERE `id` = ?";
            }

            @Override // v1.k
            public void bind(@NonNull j jVar, AlarmEntity alarmEntity) {
                jVar.m(1, alarmEntity.getId());
                jVar.m(2, alarmEntity.getTime());
                if (alarmEntity.getLabel() == null) {
                    jVar.o(3);
                } else {
                    jVar.i(3, alarmEntity.getLabel());
                }
                if (alarmEntity.getDescription() == null) {
                    jVar.o(4);
                } else {
                    jVar.i(4, alarmEntity.getDescription());
                }
                a aVar = AlarmDao_Impl.this.__converters;
                SparseBooleanArray allDays = alarmEntity.getAllDays();
                aVar.getClass();
                String a = a.a(allDays);
                if (a == null) {
                    jVar.o(5);
                } else {
                    jVar.i(5, a);
                }
                jVar.m(6, alarmEntity.getSoundRes());
                jVar.m(7, alarmEntity.isEnabled() ? 1L : 0L);
                jVar.m(8, alarmEntity.isVibration() ? 1L : 0L);
                jVar.m(9, alarmEntity.getType());
                jVar.m(10, alarmEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteAlarmTypeNotifyDaily = new n0(f0Var) { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao_Impl.4
            @Override // v1.n0
            @NonNull
            public String createQuery() {
                return "DELETE FROM Record_Alarm WHERE label == 'LABEL_NOTIFY_DAILY'";
            }
        };
        this.__preparedStmtOfDeleteAlarmTypeNotifyFullScreen = new n0(f0Var) { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao_Impl.5
            @Override // v1.n0
            @NonNull
            public String createQuery() {
                return "DELETE FROM Record_Alarm WHERE label == 'LABEL_NOTIFY_FULL_SCREEN'";
            }
        };
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao
    public void deleteAlarmTypeNotifyDaily() {
        this.__db.assertNotSuspendingTransaction();
        j acquire = this.__preparedStmtOfDeleteAlarmTypeNotifyDaily.acquire();
        try {
            this.__db.beginTransaction();
            try {
                acquire.D();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeleteAlarmTypeNotifyDaily.release(acquire);
        }
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao
    public void deleteAlarmTypeNotifyFullScreen() {
        this.__db.assertNotSuspendingTransaction();
        j acquire = this.__preparedStmtOfDeleteAlarmTypeNotifyFullScreen.acquire();
        try {
            this.__db.beginTransaction();
            try {
                acquire.D();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeleteAlarmTypeNotifyFullScreen.release(acquire);
        }
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao
    public void deleteListRecordRemind(List<AlarmEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfAlarmEntity.handleMultiple(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao
    public AlarmEntity getAlarmNotifyTypeDaily() {
        AlarmEntity alarmEntity;
        String string;
        String string2;
        String string3;
        boolean z10;
        boolean z11 = false;
        j0 j3 = j0.j(0, "SELECT * FROM Record_Alarm WHERE label = 'LABEL_NOTIFY_DAILY'");
        this.__db.assertNotSuspendingTransaction();
        Cursor G = i.G(this.__db, j3);
        try {
            int j10 = o.j(G, "id");
            int j11 = o.j(G, "time");
            int j12 = o.j(G, "label");
            int j13 = o.j(G, "description");
            int j14 = o.j(G, "allDays");
            int j15 = o.j(G, "soundRes");
            int j16 = o.j(G, "isEnabled");
            int j17 = o.j(G, "isVibration");
            int j18 = o.j(G, "type");
            if (G.moveToFirst()) {
                AlarmEntity alarmEntity2 = new AlarmEntity();
                alarmEntity2.setId(G.getLong(j10));
                alarmEntity2.setTime(G.getLong(j11));
                if (G.isNull(j12)) {
                    string = null;
                } else {
                    string = G.getString(j12);
                }
                alarmEntity2.setLabel(string);
                if (G.isNull(j13)) {
                    string2 = null;
                } else {
                    string2 = G.getString(j13);
                }
                alarmEntity2.setDescription(string2);
                if (G.isNull(j14)) {
                    string3 = null;
                } else {
                    string3 = G.getString(j14);
                }
                this.__converters.getClass();
                alarmEntity2.setAllDays(a.c(string3));
                alarmEntity2.setSoundRes(G.getInt(j15));
                if (G.getInt(j16) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                alarmEntity2.setIsEnabled(z10);
                if (G.getInt(j17) != 0) {
                    z11 = true;
                }
                alarmEntity2.setIsVibration(z11);
                alarmEntity2.setType(G.getInt(j18));
                alarmEntity = alarmEntity2;
            } else {
                alarmEntity = null;
            }
            return alarmEntity;
        } finally {
            G.close();
            j3.release();
        }
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao
    public AlarmEntity getAlarmNotifyTypeFullScreen() {
        AlarmEntity alarmEntity;
        String string;
        String string2;
        String string3;
        boolean z10;
        boolean z11 = false;
        j0 j3 = j0.j(0, "SELECT * FROM Record_Alarm WHERE label = 'LABEL_NOTIFY_FULL_SCREEN'");
        this.__db.assertNotSuspendingTransaction();
        Cursor G = i.G(this.__db, j3);
        try {
            int j10 = o.j(G, "id");
            int j11 = o.j(G, "time");
            int j12 = o.j(G, "label");
            int j13 = o.j(G, "description");
            int j14 = o.j(G, "allDays");
            int j15 = o.j(G, "soundRes");
            int j16 = o.j(G, "isEnabled");
            int j17 = o.j(G, "isVibration");
            int j18 = o.j(G, "type");
            if (G.moveToFirst()) {
                AlarmEntity alarmEntity2 = new AlarmEntity();
                alarmEntity2.setId(G.getLong(j10));
                alarmEntity2.setTime(G.getLong(j11));
                if (G.isNull(j12)) {
                    string = null;
                } else {
                    string = G.getString(j12);
                }
                alarmEntity2.setLabel(string);
                if (G.isNull(j13)) {
                    string2 = null;
                } else {
                    string2 = G.getString(j13);
                }
                alarmEntity2.setDescription(string2);
                if (G.isNull(j14)) {
                    string3 = null;
                } else {
                    string3 = G.getString(j14);
                }
                this.__converters.getClass();
                alarmEntity2.setAllDays(a.c(string3));
                alarmEntity2.setSoundRes(G.getInt(j15));
                if (G.getInt(j16) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                alarmEntity2.setIsEnabled(z10);
                if (G.getInt(j17) != 0) {
                    z11 = true;
                }
                alarmEntity2.setIsVibration(z11);
                alarmEntity2.setType(G.getInt(j18));
                alarmEntity = alarmEntity2;
            } else {
                alarmEntity = null;
            }
            return alarmEntity;
        } finally {
            G.close();
            j3.release();
        }
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao
    public LiveData<List<AlarmEntity>> getAllRecordAlarm() {
        final j0 j3 = j0.j(0, "SELECT * FROM Record_Alarm WHERE type == 0 AND label != 'LABEL_NOTIFY_FULL_SCREEN' AND label != 'LABEL_NOTIFY_DAILY' ORDER BY id ASC");
        return this.__db.getInvalidationTracker().b(new String[]{"Record_Alarm"}, new Callable<List<AlarmEntity>>() { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao_Impl.6
            public void finalize() {
                j3.release();
            }

            @Override // java.util.concurrent.Callable
            @Nullable
            public List<AlarmEntity> call() throws Exception {
                Cursor G = i.G(AlarmDao_Impl.this.__db, j3);
                try {
                    int j10 = o.j(G, "id");
                    int j11 = o.j(G, "time");
                    int j12 = o.j(G, "label");
                    int j13 = o.j(G, "description");
                    int j14 = o.j(G, "allDays");
                    int j15 = o.j(G, "soundRes");
                    int j16 = o.j(G, "isEnabled");
                    int j17 = o.j(G, "isVibration");
                    int j18 = o.j(G, "type");
                    ArrayList arrayList = new ArrayList(G.getCount());
                    while (G.moveToNext()) {
                        AlarmEntity alarmEntity = new AlarmEntity();
                        alarmEntity.setId(G.getLong(j10));
                        alarmEntity.setTime(G.getLong(j11));
                        String str = null;
                        alarmEntity.setLabel(G.isNull(j12) ? null : G.getString(j12));
                        alarmEntity.setDescription(G.isNull(j13) ? null : G.getString(j13));
                        if (!G.isNull(j14)) {
                            str = G.getString(j14);
                        }
                        AlarmDao_Impl.this.__converters.getClass();
                        alarmEntity.setAllDays(a.c(str));
                        alarmEntity.setSoundRes(G.getInt(j15));
                        boolean z10 = false;
                        alarmEntity.setIsEnabled(G.getInt(j16) != 0);
                        if (G.getInt(j17) != 0) {
                            z10 = true;
                        }
                        alarmEntity.setIsVibration(z10);
                        alarmEntity.setType(G.getInt(j18));
                        arrayList.add(alarmEntity);
                    }
                    return arrayList;
                } finally {
                    G.close();
                }
            }
        });
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao
    public List<AlarmEntity> getAllRecordAlarmTypeList() {
        j0 j0Var;
        String string;
        String string2;
        boolean z10;
        j0 j3 = j0.j(0, "SELECT * FROM Record_Alarm WHERE isEnabled == 1 AND type == 0 ORDER BY id ASC");
        this.__db.assertNotSuspendingTransaction();
        Cursor G = i.G(this.__db, j3);
        try {
            int j10 = o.j(G, "id");
            int j11 = o.j(G, "time");
            int j12 = o.j(G, "label");
            int j13 = o.j(G, "description");
            int j14 = o.j(G, "allDays");
            int j15 = o.j(G, "soundRes");
            int j16 = o.j(G, "isEnabled");
            int j17 = o.j(G, "isVibration");
            int j18 = o.j(G, "type");
            ArrayList arrayList = new ArrayList(G.getCount());
            while (G.moveToNext()) {
                AlarmEntity alarmEntity = new AlarmEntity();
                j0Var = j3;
                try {
                    alarmEntity.setId(G.getLong(j10));
                    alarmEntity.setTime(G.getLong(j11));
                    String str = null;
                    if (G.isNull(j12)) {
                        string = null;
                    } else {
                        string = G.getString(j12);
                    }
                    alarmEntity.setLabel(string);
                    if (G.isNull(j13)) {
                        string2 = null;
                    } else {
                        string2 = G.getString(j13);
                    }
                    alarmEntity.setDescription(string2);
                    if (!G.isNull(j14)) {
                        str = G.getString(j14);
                    }
                    this.__converters.getClass();
                    alarmEntity.setAllDays(a.c(str));
                    alarmEntity.setSoundRes(G.getInt(j15));
                    boolean z11 = true;
                    if (G.getInt(j16) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    alarmEntity.setIsEnabled(z10);
                    if (G.getInt(j17) == 0) {
                        z11 = false;
                    }
                    alarmEntity.setIsVibration(z11);
                    alarmEntity.setType(G.getInt(j18));
                    arrayList.add(alarmEntity);
                    j3 = j0Var;
                } catch (Throwable th2) {
                    th = th2;
                    G.close();
                    j0Var.release();
                    throw th;
                }
            }
            G.close();
            j3.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            j0Var = j3;
        }
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao
    public List<AlarmEntity> getAllRecordLabelIsNotifyDailyType() {
        j0 j0Var;
        String string;
        String string2;
        boolean z10;
        j0 j3 = j0.j(0, "SELECT * FROM record_alarm WHERE label == 'LABEL_NOTIFY_DAILY'");
        this.__db.assertNotSuspendingTransaction();
        Cursor G = i.G(this.__db, j3);
        try {
            int j10 = o.j(G, "id");
            int j11 = o.j(G, "time");
            int j12 = o.j(G, "label");
            int j13 = o.j(G, "description");
            int j14 = o.j(G, "allDays");
            int j15 = o.j(G, "soundRes");
            int j16 = o.j(G, "isEnabled");
            int j17 = o.j(G, "isVibration");
            int j18 = o.j(G, "type");
            ArrayList arrayList = new ArrayList(G.getCount());
            while (G.moveToNext()) {
                AlarmEntity alarmEntity = new AlarmEntity();
                j0Var = j3;
                try {
                    alarmEntity.setId(G.getLong(j10));
                    alarmEntity.setTime(G.getLong(j11));
                    String str = null;
                    if (G.isNull(j12)) {
                        string = null;
                    } else {
                        string = G.getString(j12);
                    }
                    alarmEntity.setLabel(string);
                    if (G.isNull(j13)) {
                        string2 = null;
                    } else {
                        string2 = G.getString(j13);
                    }
                    alarmEntity.setDescription(string2);
                    if (!G.isNull(j14)) {
                        str = G.getString(j14);
                    }
                    this.__converters.getClass();
                    alarmEntity.setAllDays(a.c(str));
                    alarmEntity.setSoundRes(G.getInt(j15));
                    boolean z11 = true;
                    if (G.getInt(j16) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    alarmEntity.setIsEnabled(z10);
                    if (G.getInt(j17) == 0) {
                        z11 = false;
                    }
                    alarmEntity.setIsVibration(z11);
                    alarmEntity.setType(G.getInt(j18));
                    arrayList.add(alarmEntity);
                    j3 = j0Var;
                } catch (Throwable th2) {
                    th = th2;
                    G.close();
                    j0Var.release();
                    throw th;
                }
            }
            G.close();
            j3.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            j0Var = j3;
        }
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao
    public void saveRecordAlarm(AlarmEntity alarmEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfAlarmEntity.insert(alarmEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao
    public AlarmEntity searchAlarmById(long j3) {
        AlarmEntity alarmEntity;
        String string;
        String string2;
        String string3;
        boolean z10;
        boolean z11 = true;
        j0 j10 = j0.j(1, "SELECT * FROM Record_Alarm WHERE id == ?");
        j10.m(1, j3);
        this.__db.assertNotSuspendingTransaction();
        Cursor G = i.G(this.__db, j10);
        try {
            int j11 = o.j(G, "id");
            int j12 = o.j(G, "time");
            int j13 = o.j(G, "label");
            int j14 = o.j(G, "description");
            int j15 = o.j(G, "allDays");
            int j16 = o.j(G, "soundRes");
            int j17 = o.j(G, "isEnabled");
            int j18 = o.j(G, "isVibration");
            int j19 = o.j(G, "type");
            if (G.moveToFirst()) {
                AlarmEntity alarmEntity2 = new AlarmEntity();
                alarmEntity2.setId(G.getLong(j11));
                alarmEntity2.setTime(G.getLong(j12));
                if (G.isNull(j13)) {
                    string = null;
                } else {
                    string = G.getString(j13);
                }
                alarmEntity2.setLabel(string);
                if (G.isNull(j14)) {
                    string2 = null;
                } else {
                    string2 = G.getString(j14);
                }
                alarmEntity2.setDescription(string2);
                if (G.isNull(j15)) {
                    string3 = null;
                } else {
                    string3 = G.getString(j15);
                }
                this.__converters.getClass();
                alarmEntity2.setAllDays(a.c(string3));
                alarmEntity2.setSoundRes(G.getInt(j16));
                if (G.getInt(j17) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                alarmEntity2.setIsEnabled(z10);
                if (G.getInt(j18) == 0) {
                    z11 = false;
                }
                alarmEntity2.setIsVibration(z11);
                alarmEntity2.setType(G.getInt(j19));
                alarmEntity = alarmEntity2;
            } else {
                alarmEntity = null;
            }
            return alarmEntity;
        } finally {
            G.close();
            j10.release();
        }
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao
    public void updateRecord(AlarmEntity alarmEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfAlarmEntity.handle(alarmEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
