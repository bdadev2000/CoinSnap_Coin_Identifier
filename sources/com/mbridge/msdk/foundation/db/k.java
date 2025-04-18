package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k extends a {
    private static String a = "ReplaceTempDao";

    /* renamed from: b, reason: collision with root package name */
    private static k f13133b;

    private k(f fVar) {
        super(fVar);
    }

    public static k a(f fVar) {
        if (f13133b == null) {
            synchronized (e.class) {
                if (f13133b == null) {
                    f13133b = new k(fVar);
                }
            }
        }
        return f13133b;
    }

    private boolean b(String str) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT d_value FROM c_replace_temp WHERE d_key= ? ", new String[]{str});
        if (rawQuery != null && rawQuery.getCount() > 0) {
            try {
                rawQuery.close();
            } catch (Exception unused) {
            }
            return true;
        }
        if (rawQuery != null) {
            try {
                rawQuery.close();
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public final void a(String str, JSONObject jSONObject) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("d_key", str);
            contentValues.put("d_value", jSONObject.toString());
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            if (!b(str)) {
                getWritableDatabase().insert("c_replace_temp", null, contentValues);
            } else {
                getWritableDatabase().update("c_replace_temp", contentValues, "d_key = ? ", new String[]{str});
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r4 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005b, code lost:
    
        if (r4 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject a(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r2 = 0
            r0[r2] = r4
            android.database.sqlite.SQLiteDatabase r4 = r3.getReadableDatabase()
            java.lang.String r2 = "SELECT * FROM c_replace_temp WHERE d_key = ? "
            android.database.Cursor r4 = r4.rawQuery(r2, r0)
            if (r4 == 0) goto L3f
            int r0 = r4.getCount()     // Catch: java.lang.Throwable -> L3d
            if (r0 <= 0) goto L3f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            r1 = r0
        L26:
            boolean r0 = r4.moveToNext()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L5b
            java.lang.String r0 = "d_value"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Throwable -> L3d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3d
            r1 = r2
            goto L26
        L3d:
            r0 = move-exception
            goto L45
        L3f:
            if (r4 == 0) goto L5b
            r4.close()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L5b
            goto L5b
        L45:
            java.lang.String r2 = com.mbridge.msdk.foundation.db.k.a     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L54
            com.mbridge.msdk.foundation.tools.ad.b(r2, r0)     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L5e
        L50:
            r4.close()     // Catch: java.lang.Exception -> L5e
            goto L5e
        L54:
            r0 = move-exception
            if (r4 == 0) goto L5a
            r4.close()     // Catch: java.lang.Exception -> L5a
        L5a:
            throw r0
        L5b:
            if (r4 == 0) goto L5e
            goto L50
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.k.a(java.lang.String):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject a() {
        /*
            r7 = this;
            r0 = 604800000(0x240c8400, float:3.046947E-17)
            long r0 = (long) r0
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            android.database.sqlite.SQLiteDatabase r0 = r7.getWritableDatabase()     // Catch: java.lang.Exception -> L26
            if (r0 != 0) goto L10
            goto L2a
        L10:
            android.database.sqlite.SQLiteDatabase r0 = r7.getWritableDatabase()     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = "c_replace_temp"
            java.lang.String r4 = "time<?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Exception -> L26
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L26
            r3 = 0
            r5[r3] = r2     // Catch: java.lang.Exception -> L26
            r0.delete(r1, r4, r5)     // Catch: java.lang.Exception -> L26
            goto L2a
        L26:
            r0 = move-exception
            r0.printStackTrace()
        L2a:
            java.lang.String r0 = "SELECT * FROM c_replace_temp"
            android.database.sqlite.SQLiteDatabase r1 = r7.getReadableDatabase()
            r2 = 0
            android.database.Cursor r0 = r1.rawQuery(r0, r2)
            if (r0 == 0) goto L6e
            int r1 = r0.getCount()     // Catch: java.lang.Throwable -> L69
            if (r1 <= 0) goto L6e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            r1.<init>()     // Catch: java.lang.Throwable -> L69
        L42:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L65
            java.lang.String r2 = "d_key"
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = "d_value"
            int r3 = r0.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> L67
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L67
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L67
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L67
            goto L42
        L65:
            r2 = r1
            goto L8a
        L67:
            r2 = move-exception
            goto L74
        L69:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L74
        L6e:
            if (r0 == 0) goto L8a
            r0.close()     // Catch: java.lang.Throwable -> L69
            goto L8a
        L74:
            java.lang.String r3 = com.mbridge.msdk.foundation.db.k.a     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L83
            com.mbridge.msdk.foundation.tools.ad.b(r3, r2)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L90
            r0.close()     // Catch: java.lang.Exception -> L90
            goto L90
        L83:
            r1 = move-exception
            if (r0 == 0) goto L89
            r0.close()     // Catch: java.lang.Exception -> L89
        L89:
            throw r1
        L8a:
            if (r0 == 0) goto L8f
            r0.close()     // Catch: java.lang.Exception -> L8f
        L8f:
            r1 = r2
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.k.a():org.json.JSONObject");
    }
}
