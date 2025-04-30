package com.mbridge.msdk.tracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f18100a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f18101c = new Object();

    public c(b bVar, String str) {
        this.f18100a = bVar;
        this.b = str;
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
        } catch (Exception e4) {
            if (a.f18098a) {
                Log.e("TrackManager", "beginTransaction: ", e4);
            }
        }
    }

    public final void b(List<i> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f18101c) {
            if (y.a(this.f18100a) || y.a((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.f18100a.getWritableDatabase();
            } catch (Exception e4) {
                if (a.f18098a) {
                    Log.e("TrackManager", "updateReportStateSuccess getWritableDatabase: " + e4.getMessage());
                }
                sQLiteDatabase = null;
            }
            try {
                if (a(sQLiteDatabase)) {
                    return;
                }
                try {
                    d(sQLiteDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 2);
                        sQLiteDatabase.update(this.b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    c(sQLiteDatabase);
                } catch (Exception e9) {
                    if (a.f18098a) {
                        Log.e("TrackManager", "updateReportStateSuccess: " + e9.getMessage());
                    }
                }
                b(sQLiteDatabase);
            } catch (Throwable th) {
                b(sQLiteDatabase);
                throw th;
            }
        }
    }

    public final void c(List<i> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f18101c) {
            if (y.a(this.f18100a) || y.a((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.f18100a.getWritableDatabase();
            } catch (Exception e4) {
                if (a.f18098a) {
                    Log.e("TrackManager", "updateReportStateFailed getWritableDatabase: " + e4.getMessage());
                }
                sQLiteDatabase = null;
            }
            try {
                if (a(sQLiteDatabase)) {
                    return;
                }
                try {
                    d(sQLiteDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", Integer.valueOf(iVar.e()));
                        contentValues.put("report_count", Integer.valueOf(iVar.d()));
                        sQLiteDatabase.update(this.b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    c(sQLiteDatabase);
                } catch (Exception e9) {
                    if (a.f18098a) {
                        Log.e("TrackManager", "updateReportStateFailed: " + e9.getMessage());
                    }
                }
                b(sQLiteDatabase);
            } catch (Throwable th) {
                b(sQLiteDatabase);
                throw th;
            }
        }
    }

    public final long a(i iVar) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f18101c) {
            long j7 = -1;
            if (y.a(this.f18100a)) {
                return -1L;
            }
            try {
                sQLiteDatabase = this.f18100a.getWritableDatabase();
            } catch (Exception e4) {
                if (a.f18098a) {
                    Log.e("TrackManager", "insert getWritableDatabase: " + e4.getMessage());
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
                    e c9 = iVar.c();
                    contentValues.put("name", c9.a());
                    contentValues.put("type", Integer.valueOf(c9.b()));
                    contentValues.put("time_stamp", Long.valueOf(c9.f()));
                    contentValues.put("properties", c9.d().toString());
                    contentValues.put("priority", Integer.valueOf(c9.c()));
                    contentValues.put("state", Integer.valueOf(iVar.e()));
                    contentValues.put("report_count", Integer.valueOf(iVar.d()));
                    contentValues.put("uuid", c9.e());
                    contentValues.put("ignore_max_timeout", Integer.valueOf(!c9.j() ? 1 : 0));
                    contentValues.put("ignore_max_retry_times", Integer.valueOf(!c9.k() ? 1 : 0));
                    contentValues.put("invalid_time", Long.valueOf(iVar.g()));
                    j7 = sQLiteDatabase.insert(this.b, null, contentValues);
                    c(sQLiteDatabase);
                } catch (Exception e9) {
                    if (a.f18098a) {
                        Log.e("TrackManager", "insert: " + e9.getMessage());
                    }
                }
                return j7;
            } finally {
                b(sQLiteDatabase);
            }
        }
    }

    public final int b() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f18101c) {
            int i9 = -1;
            if (y.a(this.f18100a)) {
                return -1;
            }
            try {
                sQLiteDatabase = this.f18100a.getWritableDatabase();
            } catch (Exception e4) {
                if (a.f18098a) {
                    Log.e("TrackManager", "deleteInvalidEvents getWritableDatabase: " + e4.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return -1;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    i9 = sQLiteDatabase.delete(this.b, "state = ? OR state = ?", new String[]{String.valueOf(-1), String.valueOf(2)});
                    c(sQLiteDatabase);
                } finally {
                    b(sQLiteDatabase);
                }
            } catch (Exception e9) {
                if (a.f18098a) {
                    Log.e("TrackManager", "deleteInvalidEvents: " + e9.getMessage());
                }
            }
            return i9;
        }
    }

    public final void c() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f18101c) {
            if (y.a(this.f18100a)) {
                return;
            }
            try {
                sQLiteDatabase = this.f18100a.getWritableDatabase();
            } catch (Exception e4) {
                if (a.f18098a) {
                    Log.e("TrackManager", "updateReportStateForReporting getWritableDatabase: " + e4.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 3);
                    sQLiteDatabase.update(this.b, contentValues, "state = ?", new String[]{String.valueOf(1)});
                    c(sQLiteDatabase);
                } catch (Exception e9) {
                    if (a.f18098a) {
                        Log.e("TrackManager", "updateReportStateForReporting: " + e9.getMessage());
                    }
                }
            } finally {
                b(sQLiteDatabase);
            }
        }
    }

    public final List<i> a(int i9) {
        SQLiteDatabase sQLiteDatabase;
        Exception exc;
        List<i> list;
        synchronized (this.f18101c) {
            Cursor cursor = null;
            List<i> list2 = null;
            cursor = null;
            if (y.a(this.f18100a)) {
                return null;
            }
            try {
                sQLiteDatabase = this.f18100a.getWritableDatabase();
            } catch (Exception e4) {
                if (a.f18098a) {
                    Log.e("TrackManager", "getAvailable getWritableDatabase: " + e4.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return null;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    Cursor query = sQLiteDatabase.query(this.b, null, "state = ? OR state = ?", new String[]{String.valueOf(0), String.valueOf(3)}, null, null, "priority DESC", String.valueOf(i9));
                    try {
                        list2 = y.b(query);
                        c(sQLiteDatabase);
                        b(sQLiteDatabase);
                        y.a(query);
                    } catch (Exception e9) {
                        exc = e9;
                        list = list2;
                        cursor = query;
                        if (a.f18098a) {
                            Log.e("TrackManager", "getAvailable: " + exc.getMessage());
                        }
                        b(sQLiteDatabase);
                        y.a(cursor);
                        list2 = list;
                        return list2;
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        b(sQLiteDatabase);
                        y.a(cursor);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e10) {
                exc = e10;
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
        } catch (Exception e4) {
            if (a.f18098a) {
                Log.e("TrackManager", "endTransaction: ", e4);
            }
        }
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e4) {
            if (a.f18098a) {
                Log.e("TrackManager", "transactionSuccess: ", e4);
            }
        }
    }

    public final int a() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f18101c) {
            int i9 = 0;
            if (y.a(this.f18100a)) {
                return 0;
            }
            Cursor cursor = null;
            try {
                sQLiteDatabase = this.f18100a.getWritableDatabase();
            } catch (Exception e4) {
                if (a.f18098a) {
                    Log.e("TrackManager", "getAvailableCount getWritableDatabase: " + e4.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return 0;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    cursor = sQLiteDatabase.query(this.b, null, "state = ? OR state = ?", new String[]{String.valueOf(3), String.valueOf(0)}, null, null, null, null);
                    if (cursor != null && cursor.moveToNext()) {
                        i9 = Math.max(cursor.getCount(), 0);
                    }
                    c(sQLiteDatabase);
                    b(sQLiteDatabase);
                } catch (Throwable th) {
                    b(sQLiteDatabase);
                    y.a(cursor);
                    throw th;
                }
            } catch (Exception e9) {
                if (a.f18098a) {
                    Log.e("TrackManager", "getAvailableCount: " + e9.getMessage());
                }
                b(sQLiteDatabase);
            }
            y.a(cursor);
            return i9;
        }
    }

    public final void a(List<i> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f18101c) {
            if (y.a(this.f18100a) || y.a((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.f18100a.getWritableDatabase();
            } catch (Exception e4) {
                if (a.f18098a) {
                    Log.e("TrackManager", "updateReportStateReporting getWritableDatabase: " + e4.getMessage());
                }
                sQLiteDatabase = null;
            }
            try {
                if (a(sQLiteDatabase)) {
                    return;
                }
                try {
                    d(sQLiteDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 1);
                        sQLiteDatabase.update(this.b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    c(sQLiteDatabase);
                } catch (Exception e9) {
                    if (a.f18098a) {
                        Log.e("TrackManager", "updateReportStateReporting: " + e9.getMessage());
                    }
                }
                b(sQLiteDatabase);
            } catch (Throwable th) {
                b(sQLiteDatabase);
                throw th;
            }
        }
    }
}
