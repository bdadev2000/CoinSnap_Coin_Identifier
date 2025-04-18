package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Campaign;

/* loaded from: classes4.dex */
public class h extends a<Campaign> {
    private static final String a = "com.mbridge.msdk.foundation.db.h";

    /* renamed from: b, reason: collision with root package name */
    private static h f13132b;

    private h(f fVar) {
        super(fVar);
    }

    public static h a(f fVar) {
        if (f13132b == null) {
            synchronized (h.class) {
                if (f13132b == null) {
                    f13132b = new h(fVar);
                }
            }
        }
        return f13132b;
    }

    private synchronized boolean b(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT play_time FROM dailyplaycap WHERE unit_id= ?", new String[]{str});
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private synchronized void c(String str) {
        try {
        } catch (Throwable unused) {
            ad.c(a, "resetTimeAndTimestamp error");
        }
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("first_insert_timestamp", (Integer) 0);
        contentValues.put("play_time", (Integer) 0);
        getWritableDatabase().update("dailyplaycap", contentValues, "unit_id = ?", new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r1 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (0 == 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(java.lang.String r19) {
        /*
            r18 = this;
            r0 = r19
            monitor-enter(r18)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r18.getWritableDatabase()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            if (r2 != 0) goto Lc
            monitor-exit(r18)
            return
        Lc:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r2.<init>()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            boolean r5 = r18.b(r19)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r6 = 1
            if (r5 == 0) goto L87
            java.lang.String r5 = "SELECT * FROM dailyplaycap where unit_id = ?"
            android.database.sqlite.SQLiteDatabase r8 = r18.getReadableDatabase()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r11 = 0
            r10[r11] = r0     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            android.database.Cursor r1 = r8.rawQuery(r5, r10)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r12 = 0
            if (r1 == 0) goto L5d
            int r5 = r1.getCount()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            if (r5 <= 0) goto L5d
            r1.moveToFirst()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r5 = "first_insert_timestamp"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            long r14 = r1.getLong(r5)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r5 = "play_time"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            int r5 = r1.getInt(r5)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            long r9 = (long) r5     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            long r16 = r3 - r16
            int r5 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r5 <= 0) goto L5f
            r18.c(r19)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r9 = r12
            goto L5f
        L5d:
            r9 = r12
            r14 = r9
        L5f:
            int r5 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.lang.String r5 = "first_insert_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
        L6c:
            java.lang.String r3 = "play_time"
            long r9 = r9 + r6
            java.lang.Long r4 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r3 = "unit_id = ?"
            android.database.sqlite.SQLiteDatabase r4 = r18.getWritableDatabase()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r5 = "dailyplaycap"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r6[r11] = r0     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r4.update(r5, r2, r3, r6)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            goto La7
        L87:
            java.lang.String r5 = "first_insert_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r3 = "play_time"
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r3 = "unit_id"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            android.database.sqlite.SQLiteDatabase r0 = r18.getWritableDatabase()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r3 = "dailyplaycap"
            r0.insert(r3, r1, r2)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
        La7:
            if (r1 == 0) goto Lb6
        La9:
            r1.close()     // Catch: java.lang.Throwable -> Lb6
            goto Lb6
        Lad:
            r0 = move-exception
            goto Lb8
        Laf:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto Lb6
            goto La9
        Lb6:
            monitor-exit(r18)
            return
        Lb8:
            if (r1 == 0) goto Lbd
            r1.close()     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            throw r0     // Catch: java.lang.Throwable -> Lbe
        Lbe:
            r0 = move-exception
            r1 = r0
            monitor-exit(r18)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.h.a(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r1 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r1 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r13, int r14) {
        /*
            r12 = this;
            java.lang.String r0 = "isOverCap is error"
            r1 = 0
            r2 = 0
            java.lang.String r3 = "SELECT * FROM dailyplaycap where unit_id = ?"
            android.database.sqlite.SQLiteDatabase r4 = r12.getReadableDatabase()     // Catch: java.lang.Throwable -> L5a
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L5a
            r6[r2] = r13     // Catch: java.lang.Throwable -> L5a
            android.database.Cursor r1 = r4.rawQuery(r3, r6)     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L54
            int r3 = r1.getCount()     // Catch: java.lang.Throwable -> L5a
            if (r3 <= 0) goto L54
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L54
            java.lang.String r3 = "first_insert_timestamp"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L5a
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = "play_time"
            int r6 = r1.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L5a
            int r6 = r1.getInt(r6)     // Catch: java.lang.Throwable -> L5a
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L5a
            r8 = 0
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 == 0) goto L54
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 - r10
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto L4c
            r12.c(r13)     // Catch: java.lang.Throwable -> L5a
            goto L54
        L4c:
            if (r14 <= 0) goto L54
            long r13 = (long) r14
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 < 0) goto L54
            r2 = r5
        L54:
            if (r1 == 0) goto L6f
        L56:
            r1.close()     // Catch: java.lang.Throwable -> L6f
            goto L6f
        L5a:
            r13 = move-exception
            java.lang.String r14 = com.mbridge.msdk.foundation.db.h.a     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L70
            r3.append(r13)     // Catch: java.lang.Throwable -> L70
            java.lang.String r13 = r3.toString()     // Catch: java.lang.Throwable -> L70
            com.mbridge.msdk.foundation.tools.ad.c(r14, r13)     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L6f
            goto L56
        L6f:
            return r2
        L70:
            r13 = move-exception
            if (r1 == 0) goto L76
            r1.close()     // Catch: java.lang.Throwable -> L76
        L76:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.h.a(java.lang.String, int):boolean");
    }
}
