package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Campaign;

/* loaded from: classes3.dex */
public class h extends a<Campaign> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15500a = "com.mbridge.msdk.foundation.db.h";
    private static h b;

    private h(f fVar) {
        super(fVar);
    }

    public static h a(f fVar) {
        if (b == null) {
            synchronized (h.class) {
                try {
                    if (b == null) {
                        b = new h(fVar);
                    }
                } finally {
                }
            }
        }
        return b;
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
            ad.c(f15500a, "resetTimeAndTimestamp error");
        }
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("first_insert_timestamp", (Integer) 0);
        contentValues.put("play_time", (Integer) 0);
        getWritableDatabase().update("dailyplaycap", contentValues, "unit_id = ?", new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (0 == 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(java.lang.String r16) {
        /*
            r15 = this;
            monitor-enter(r15)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r0 = r15.getWritableDatabase()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            if (r0 != 0) goto La
            monitor-exit(r15)
            return
        La:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r0.<init>()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            boolean r4 = r15.b(r16)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r5 = 1
            if (r4 == 0) goto L86
            java.lang.String r4 = "SELECT * FROM dailyplaycap where unit_id = ?"
            android.database.sqlite.SQLiteDatabase r7 = r15.getReadableDatabase()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.String[] r8 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            android.database.Cursor r1 = r7.rawQuery(r4, r8)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r7 = 0
            if (r1 == 0) goto L5d
            int r4 = r1.getCount()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            if (r4 <= 0) goto L5d
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.String r4 = "first_insert_timestamp"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            long r9 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.String r4 = "play_time"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            int r4 = r1.getInt(r4)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            long r11 = (long) r4     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            long r13 = r2 - r13
            int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r4 <= 0) goto L5f
            r15.c(r16)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r11 = r7
            goto L5f
        L59:
            r0 = move-exception
            goto Lb6
        L5b:
            r0 = move-exception
            goto Lae
        L5d:
            r9 = r7
            r11 = r9
        L5f:
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L6c
            java.lang.String r4 = "first_insert_timestamp"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
        L6c:
            java.lang.String r2 = "play_time"
            long r11 = r11 + r5
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.String r2 = "unit_id = ?"
            android.database.sqlite.SQLiteDatabase r3 = r15.getWritableDatabase()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.String r4 = "dailyplaycap"
            java.lang.String[] r5 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r3.update(r4, r0, r2, r5)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            goto La8
        L86:
            java.lang.String r4 = "first_insert_timestamp"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.String r2 = "play_time"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.String r2 = "unit_id"
            r3 = r16
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            android.database.sqlite.SQLiteDatabase r2 = r15.getWritableDatabase()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.String r3 = "dailyplaycap"
            r2.insert(r3, r1, r0)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
        La8:
            if (r1 == 0) goto Lb4
        Laa:
            r1.close()     // Catch: java.lang.Throwable -> Lb4
            goto Lb4
        Lae:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto Lb4
            goto Laa
        Lb4:
            monitor-exit(r15)
            return
        Lb6:
            if (r1 == 0) goto Lbb
            r1.close()     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            throw r0     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r0 = move-exception
            r1 = r0
            monitor-exit(r15)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.h.a(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r1 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r12, int r13) {
        /*
            r11 = this;
            java.lang.String r0 = "isOverCap is error"
            r1 = 0
            r2 = 0
            java.lang.String r3 = "SELECT * FROM dailyplaycap where unit_id = ?"
            android.database.sqlite.SQLiteDatabase r4 = r11.getReadableDatabase()     // Catch: java.lang.Throwable -> L4b
            java.lang.String[] r5 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L4b
            android.database.Cursor r1 = r4.rawQuery(r3, r5)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L55
            int r3 = r1.getCount()     // Catch: java.lang.Throwable -> L4b
            if (r3 <= 0) goto L55
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L55
            java.lang.String r3 = "first_insert_timestamp"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L4b
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = "play_time"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L4b
            int r5 = r1.getInt(r5)     // Catch: java.lang.Throwable -> L4b
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L4b
            r7 = 0
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L55
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4b
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r7 - r9
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 <= 0) goto L4d
            r11.c(r12)     // Catch: java.lang.Throwable -> L4b
            goto L55
        L4b:
            r12 = move-exception
            goto L5b
        L4d:
            if (r13 <= 0) goto L55
            long r12 = (long) r13
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 < 0) goto L55
            r2 = 1
        L55:
            if (r1 == 0) goto L6f
        L57:
            r1.close()     // Catch: java.lang.Throwable -> L6f
            goto L6f
        L5b:
            java.lang.String r13 = com.mbridge.msdk.foundation.db.h.f15500a     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L70
            r3.append(r12)     // Catch: java.lang.Throwable -> L70
            java.lang.String r12 = r3.toString()     // Catch: java.lang.Throwable -> L70
            com.mbridge.msdk.foundation.tools.ad.c(r13, r12)     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L6f
            goto L57
        L6f:
            return r2
        L70:
            r12 = move-exception
            if (r1 == 0) goto L76
            r1.close()     // Catch: java.lang.Throwable -> L76
        L76:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.h.a(java.lang.String, int):boolean");
    }
}
