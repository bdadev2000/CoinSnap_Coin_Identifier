package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public class j extends a<com.mbridge.msdk.foundation.entity.g> {
    private static j a;

    private j(f fVar) {
        super(fVar);
    }

    public static j a(f fVar) {
        if (a == null) {
            synchronized (j.class) {
                if (a == null) {
                    a = new j(fVar);
                }
            }
        }
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0035, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        r0.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long[] b() {
        /*
            r7 = this;
            java.lang.String r0 = "SELECT id FROM frequence WHERE fc_a<impression_count"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.getReadableDatabase()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L42
            android.database.Cursor r0 = r2.rawQuery(r0, r1)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L42
            if (r0 == 0) goto L35
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L43
            if (r2 <= 0) goto L35
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L43
            long[] r2 = new long[r2]     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L43
            r3 = 0
        L1a:
            boolean r4 = r0.moveToNext()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L43
            if (r4 == 0) goto L2f
            java.lang.String r4 = "id"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L43
            long r4 = r0.getLong(r4)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L43
            r2[r3] = r4     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L43
            int r3 = r3 + 1
            goto L1a
        L2f:
            r0.close()
            return r2
        L33:
            r1 = move-exception
            goto L3c
        L35:
            if (r0 == 0) goto L48
            goto L45
        L38:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L3c:
            if (r0 == 0) goto L41
            r0.close()
        L41:
            throw r1
        L42:
            r0 = r1
        L43:
            if (r0 == 0) goto L48
        L45:
            r0.close()
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.j.b():long[]");
    }

    public final synchronized void a() {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS)};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("frequence", "ts< ? ", strArr);
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized boolean b(String str) {
        Cursor cursor = null;
        try {
            try {
                try {
                    synchronized (str) {
                        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT id FROM frequence WHERE id= ?", new String[]{str});
                        if (rawQuery != null && rawQuery.getCount() > 0) {
                            rawQuery.close();
                            return true;
                        }
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        return false;
                    }
                } finally {
                    if (0 != 0) {
                        cursor.close();
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(String str) {
        if (b(str) && getReadableDatabase() != null) {
            getReadableDatabase().execSQL("UPDATE frequence Set impression_count=impression_count+1 WHERE id= ?", new Object[]{str});
        }
    }

    public final synchronized void a(com.mbridge.msdk.foundation.entity.g gVar) {
        if (!b(gVar.a())) {
            b(gVar);
        }
    }

    private synchronized long b(com.mbridge.msdk.foundation.entity.g gVar) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", gVar.a());
            contentValues.put("fc_a", Integer.valueOf(gVar.c()));
            contentValues.put("fc_b", Integer.valueOf(gVar.d()));
            contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(gVar.f()));
            contentValues.put("impression_count", Integer.valueOf(gVar.e()));
            contentValues.put("click_count", Integer.valueOf(gVar.b()));
            contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(gVar.f()));
            if (getWritableDatabase() == null) {
                return -1L;
            }
            return getWritableDatabase().insert("frequence", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }
}
