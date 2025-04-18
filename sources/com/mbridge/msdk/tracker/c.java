package com.mbridge.msdk.tracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class c {
    private final b a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15360b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f15361c = new Object();

    public c(b bVar, String str) {
        this.a = bVar;
        this.f15360b = str;
    }

    private static boolean a(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly();
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception e2) {
            if (a.a) {
                Log.e("TrackManager", "beginTransaction: ", e2);
            }
        }
    }

    public final void b(List<i> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f15361c) {
            if (y.a(this.a) || y.a((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateSuccess getWritableDatabase: " + e2.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 2);
                        sQLiteDatabase.update(this.f15360b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    c(sQLiteDatabase);
                } finally {
                    b(sQLiteDatabase);
                }
            } catch (Exception e10) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateSuccess: " + e10.getMessage());
                }
            }
        }
    }

    public final void c(List<i> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f15361c) {
            if (y.a(this.a) || y.a((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateFailed getWritableDatabase: " + e2.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", Integer.valueOf(iVar.e()));
                        contentValues.put("report_count", Integer.valueOf(iVar.d()));
                        sQLiteDatabase.update(this.f15360b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    c(sQLiteDatabase);
                } finally {
                    b(sQLiteDatabase);
                }
            } catch (Exception e10) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateFailed: " + e10.getMessage());
                }
            }
        }
    }

    public final long a(i iVar) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f15361c) {
            long j3 = -1;
            if (y.a(this.a)) {
                return -1L;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "insert getWritableDatabase: " + e2.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return -1L;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    ContentValues contentValues = new ContentValues(16);
                    e c10 = iVar.c();
                    contentValues.put("name", c10.a());
                    contentValues.put("type", Integer.valueOf(c10.b()));
                    contentValues.put("time_stamp", Long.valueOf(c10.f()));
                    contentValues.put("properties", c10.d().toString());
                    contentValues.put("priority", Integer.valueOf(c10.c()));
                    contentValues.put("state", Integer.valueOf(iVar.e()));
                    contentValues.put("report_count", Integer.valueOf(iVar.d()));
                    contentValues.put("uuid", c10.e());
                    int i10 = 0;
                    contentValues.put("ignore_max_timeout", Integer.valueOf(c10.j() ? 0 : 1));
                    if (!c10.k()) {
                        i10 = 1;
                    }
                    contentValues.put("ignore_max_retry_times", Integer.valueOf(i10));
                    contentValues.put("invalid_time", Long.valueOf(iVar.g()));
                    j3 = sQLiteDatabase.insert(this.f15360b, null, contentValues);
                    c(sQLiteDatabase);
                } finally {
                    b(sQLiteDatabase);
                }
            } catch (Exception e10) {
                if (a.a) {
                    Log.e("TrackManager", "insert: " + e10.getMessage());
                }
            }
            return j3;
        }
    }

    public final int b() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f15361c) {
            int i10 = -1;
            if (y.a(this.a)) {
                return -1;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "deleteInvalidEvents getWritableDatabase: " + e2.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return -1;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    i10 = sQLiteDatabase.delete(this.f15360b, "state = ? OR state = ?", new String[]{String.valueOf(-1), String.valueOf(2)});
                    c(sQLiteDatabase);
                } catch (Exception e10) {
                    if (a.a) {
                        Log.e("TrackManager", "deleteInvalidEvents: " + e10.getMessage());
                    }
                }
                return i10;
            } finally {
                b(sQLiteDatabase);
            }
        }
    }

    public final void c() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f15361c) {
            if (y.a(this.a)) {
                return;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateForReporting getWritableDatabase: " + e2.getMessage());
                }
                sQLiteDatabase = null;
            }
            try {
                if (a(sQLiteDatabase)) {
                    return;
                }
                try {
                    d(sQLiteDatabase);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 3);
                    sQLiteDatabase.update(this.f15360b, contentValues, "state = ?", new String[]{String.valueOf(1)});
                    c(sQLiteDatabase);
                } catch (Exception e10) {
                    if (a.a) {
                        Log.e("TrackManager", "updateReportStateForReporting: " + e10.getMessage());
                    }
                }
            } finally {
                b(sQLiteDatabase);
            }
        }
    }

    public final List<i> a(int i10) {
        SQLiteDatabase sQLiteDatabase;
        Exception exc;
        List<i> list;
        synchronized (this.f15361c) {
            Cursor cursor = null;
            List<i> list2 = null;
            cursor = null;
            if (y.a(this.a)) {
                return null;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "getAvailable getWritableDatabase: " + e2.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return null;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    Cursor query = sQLiteDatabase.query(this.f15360b, null, "state = ? OR state = ?", new String[]{String.valueOf(0), String.valueOf(3)}, null, null, "priority DESC", String.valueOf(i10));
                    try {
                        list2 = y.b(query);
                        c(sQLiteDatabase);
                        b(sQLiteDatabase);
                        y.a(query);
                    } catch (Exception e10) {
                        exc = e10;
                        list = list2;
                        cursor = query;
                        if (a.a) {
                            Log.e("TrackManager", "getAvailable: " + exc.getMessage());
                        }
                        b(sQLiteDatabase);
                        y.a(cursor);
                        list2 = list;
                        return list2;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        b(sQLiteDatabase);
                        y.a(cursor);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e11) {
                exc = e11;
                list = null;
            }
            return list2;
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        if (y.a(sQLiteDatabase) || !sQLiteDatabase.inTransaction()) {
            return;
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Exception e2) {
            if (a.a) {
                Log.e("TrackManager", "endTransaction: ", e2);
            }
        }
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e2) {
            if (a.a) {
                Log.e("TrackManager", "transactionSuccess: ", e2);
            }
        }
    }

    public final int a() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f15361c) {
            int i10 = 0;
            if (y.a(this.a)) {
                return 0;
            }
            Cursor cursor = null;
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "getAvailableCount getWritableDatabase: " + e2.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return 0;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    cursor = sQLiteDatabase.query(this.f15360b, null, "state = ? OR state = ?", new String[]{String.valueOf(3), String.valueOf(0)}, null, null, null, null);
                    if (cursor != null && cursor.moveToNext()) {
                        i10 = Math.max(cursor.getCount(), 0);
                    }
                    c(sQLiteDatabase);
                    b(sQLiteDatabase);
                } catch (Throwable th2) {
                    b(sQLiteDatabase);
                    y.a(cursor);
                    throw th2;
                }
            } catch (Exception e10) {
                if (a.a) {
                    Log.e("TrackManager", "getAvailableCount: " + e10.getMessage());
                }
                b(sQLiteDatabase);
            }
            y.a(cursor);
            return i10;
        }
    }

    public final void a(List<i> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f15361c) {
            if (y.a(this.a) || y.a((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateReporting getWritableDatabase: " + e2.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 1);
                        sQLiteDatabase.update(this.f15360b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    c(sQLiteDatabase);
                } catch (Exception e10) {
                    if (a.a) {
                        Log.e("TrackManager", "updateReportStateReporting: " + e10.getMessage());
                    }
                }
            } finally {
                b(sQLiteDatabase);
            }
        }
    }
}
