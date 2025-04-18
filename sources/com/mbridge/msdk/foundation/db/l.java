package com.mbridge.msdk.foundation.db;

import android.database.Cursor;

/* loaded from: classes4.dex */
public class l extends a {
    private static l a;

    private l(f fVar) {
        super(fVar);
    }

    public static l a(f fVar) {
        if (a == null) {
            synchronized (l.class) {
                if (a == null) {
                    a = new l(fVar);
                }
            }
        }
        return a;
    }

    private synchronized int b(int i10) {
        try {
        } catch (Exception unused) {
            return -1;
        }
        return getWritableDatabase().rawQuery("DELETE FROM reporterror WHERE count >= ?", new String[]{String.valueOf(i10)}).getCount();
    }

    public final synchronized int b() {
        int i10;
        Cursor cursor = null;
        try {
            try {
                cursor = getReadableDatabase().query("reporterror", new String[]{" count(*) "}, null, null, null, null, null, null);
                i10 = cursor.getCount();
                cursor.close();
            } catch (Exception e2) {
                e2.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
                i10 = 0;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
        return i10;
    }

    public final synchronized void a(String str, String str2, long j3) {
        if (str == null) {
            str = "";
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().execSQL("DELETE from reporterror where url= ? and data= ? and time_stamp= ? or count > ?", new Object[]{str2, str, String.valueOf(j3), 5});
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r9 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int a() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = " count(*) "
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3b
            r0 = 0
            r9 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            java.lang.String r2 = "reporterror"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r9 == 0) goto L24
            boolean r1 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r1 == 0) goto L24
            int r0 = r9.getInt(r0)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
        L24:
            if (r9 == 0) goto L33
        L26:
            r9.close()     // Catch: java.lang.Throwable -> L3b
            goto L33
        L2a:
            r0 = move-exception
            goto L35
        L2c:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto L33
            goto L26
        L33:
            monitor-exit(r10)
            return r0
        L35:
            if (r9 == 0) goto L3a
            r9.close()     // Catch: java.lang.Throwable -> L3b
        L3a:
            throw r0     // Catch: java.lang.Throwable -> L3b
        L3b:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.l.a():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #5 {, blocks: (B:26:0x00a1, B:7:0x0092, B:34:0x00ab, B:35:0x00ae), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.l> a(int r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 5
            r1 = 0
            r12.b(r0)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            android.database.sqlite.SQLiteDatabase r2 = r12.getReadableDatabase()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r3 = "reporterror"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            r0.<init>()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            r0.append(r13)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r13 = ""
            r0.append(r13)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            if (r13 == 0) goto L90
            int r0 = r13.getCount()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> La7
            if (r0 <= 0) goto L90
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> La7
            r0.<init>()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> La7
        L34:
            boolean r1 = r13.moveToNext()     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            if (r1 == 0) goto L87
            java.lang.String r1 = "url"
            int r1 = r13.getColumnIndex(r1)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r1 = r13.getString(r1)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r2 = "data"
            int r2 = r13.getColumnIndex(r2)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r2 = r13.getString(r2)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r3 = "method"
            int r3 = r13.getColumnIndex(r3)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r3 = r13.getString(r3)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r4 = "unitId"
            int r4 = r13.getColumnIndex(r4)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r4 = r13.getString(r4)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r5 = "count"
            int r5 = r13.getColumnIndex(r5)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            int r5 = r13.getInt(r5)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r6 = "time_stamp"
            int r6 = r13.getColumnIndex(r6)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            long r6 = r13.getLong(r6)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            com.mbridge.msdk.foundation.entity.l r8 = new com.mbridge.msdk.foundation.entity.l     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            r8.<init>(r1, r3, r2, r4)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            int r5 = r5 + 1
            r8.a(r5)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            r8.a(r6)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            r0.add(r8)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            goto L34
        L87:
            r1 = r0
            goto L90
        L89:
            r1 = move-exception
            goto L9c
        L8b:
            r0 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
            goto L9c
        L90:
            if (r13 == 0) goto La5
            r13.close()     // Catch: java.lang.Throwable -> Laf
            goto La5
        L96:
            r0 = move-exception
            goto La9
        L98:
            r13 = move-exception
            r0 = r1
            r1 = r13
            r13 = r0
        L9c:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> La7
            if (r13 == 0) goto La4
            r13.close()     // Catch: java.lang.Throwable -> Laf
        La4:
            r1 = r0
        La5:
            monitor-exit(r12)
            return r1
        La7:
            r0 = move-exception
            r1 = r13
        La9:
            if (r1 == 0) goto Lae
            r1.close()     // Catch: java.lang.Throwable -> Laf
        Lae:
            throw r0     // Catch: java.lang.Throwable -> Laf
        Laf:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.l.a(int):java.util.List");
    }

    public final synchronized int a(String str) {
        try {
            String[] strArr = {str};
            if (getWritableDatabase() == null) {
                return -1;
            }
            return getWritableDatabase().delete("reporterror", "url=?", strArr);
        } catch (Exception unused) {
            return -1;
        }
    }
}
