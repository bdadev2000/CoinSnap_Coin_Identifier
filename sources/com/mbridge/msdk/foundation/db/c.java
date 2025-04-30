package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15477a = "com.mbridge.msdk.foundation.db.c";
    private static volatile c b;

    private c(f fVar) {
        super(fVar);
    }

    public static c a(f fVar) {
        if (b == null) {
            synchronized (c.class) {
                try {
                    if (b == null) {
                        b = new c(fVar);
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final void b(String str, String str2, String str3) {
        if (a(str, str3)) {
            try {
                getWritableDatabase().execSQL("UPDATE CacheCampaign SET show_count = show_count + 1, show_time = ? WHERE rid = ? AND unitid = ? AND state = ?", new Object[]{Long.valueOf(System.currentTimeMillis()), str, str3, "1"});
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public final long a(String str, String str2, String str3, int i9) {
        if (!a(str, str3)) {
            return -1L;
        }
        new ContentValues().put("state", Integer.valueOf(i9));
        return getWritableDatabase().update("CacheCampaign", r3, "rid= ? AND unitid = ? AND state = 0", new String[]{str, str3});
    }

    private synchronized boolean a(String str, String str2) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT rid FROM CacheCampaign WHERE rid= ? AND unitid = ? ", new String[]{str, str2});
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

    public final synchronized void a(String str, int i9) {
        String str2;
        SQLiteDatabase writableDatabase;
        if (i9 <= 0) {
            i9 = 1;
        }
        try {
            str2 = "unitid = ? AND ( (ts + interval_ts) < " + System.currentTimeMillis() + " OR show_count >= ?)";
            writableDatabase = getWritableDatabase();
        } catch (Exception e4) {
            ad.b("CacheCampaignDao", e4.getLocalizedMessage());
        }
        if (writableDatabase == null) {
            return;
        }
        try {
            writableDatabase.delete("CacheCampaign", str2, new String[]{str, String.valueOf(i9)});
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final synchronized void a(String str, String str2, String str3) {
        try {
            if (a(str2, str)) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (writableDatabase == null) {
                    return;
                }
                try {
                    writableDatabase.delete("CacheCampaign", "unitid = ? AND rid = ? ", new String[]{str, str2});
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        } catch (Exception e9) {
            ad.b("CampaignDao", e9.getLocalizedMessage());
        }
    }

    public final long a(List<CampaignEx> list, String str) {
        CampaignEx campaignEx;
        if (list != null) {
            try {
                if (list.size() == 0 || TextUtils.isEmpty(str) || (campaignEx = list.get(0)) == null) {
                    return 0L;
                }
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("rid", campaignEx.getRequestId());
                contentValues.put("lrid", campaignEx.getLocalRequestId());
                contentValues.put("unitid", str);
                JSONArray jSONArray = new JSONArray();
                Iterator<CampaignEx> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(it.next()));
                }
                contentValues.put("campaigns", jSONArray.toString());
                contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(campaignEx.getTimestamp()));
                long candidateCacheTime = campaignEx.getCandidateCacheTime();
                if (candidateCacheTime == 0) {
                    candidateCacheTime = campaignEx.getPlctb();
                    if (candidateCacheTime == 0) {
                        com.mbridge.msdk.c.g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                        if (b8 == null) {
                            com.mbridge.msdk.c.h.a();
                            b8 = com.mbridge.msdk.c.i.a();
                        }
                        candidateCacheTime = b8.aa();
                    }
                }
                try {
                    if (af.a().a("c_e_t", false)) {
                        candidateCacheTime *= 24;
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                contentValues.put("interval_ts", Long.valueOf(candidateCacheTime * 1000));
                contentValues.put("ecppv", campaignEx.getEcppv());
                contentValues.put("show_count", Integer.valueOf(campaignEx.getShowCount()));
                contentValues.put("state", (Integer) 0);
                if (a(campaignEx.getRequestId(), str)) {
                    return getWritableDatabase().update("CacheCampaign", contentValues, "rid= ? AND lrid= ? AND unitid = ? AND state = 1", new String[]{campaignEx.getRequestId(), campaignEx.getLocalRequestId(), str});
                }
                return getWritableDatabase().insert("CacheCampaign", null, contentValues);
            } catch (Exception e9) {
                e9.printStackTrace();
                return -1L;
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
    
        if (r5 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00ee, code lost:
    
        if (r5 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00fc, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00f0, code lost:
    
        r5.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.mbridge.msdk.foundation.b.b> a(java.lang.String r5, int r6, long r7) {
        /*
            r4 = this;
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}
            java.lang.String r6 = "SELECT * FROM CacheCampaign WHERE unitid = ? AND state > ? and (show_time is null or show_time < ? )"
            r7 = 0
            android.database.sqlite.SQLiteDatabase r8 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> Lf4
            android.database.Cursor r5 = r8.rawQuery(r6, r5)     // Catch: java.lang.Throwable -> Lf4
            if (r5 == 0) goto Lee
            int r6 = r5.getCount()     // Catch: java.lang.Throwable -> L6a
            if (r6 <= 0) goto Lee
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6a
            r6.<init>()     // Catch: java.lang.Throwable -> L6a
        L24:
            boolean r8 = r5.moveToNext()     // Catch: java.lang.Throwable -> L6a
            if (r8 == 0) goto Lea
            com.mbridge.msdk.foundation.b.b r8 = new com.mbridge.msdk.foundation.b.b     // Catch: java.lang.Throwable -> L6a
            r8.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "campaigns"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L6a
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L48
            r5.close()     // Catch: java.lang.Exception -> L47
        L47:
            return r7
        L48:
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L6a
            if (r0 <= 0) goto L70
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList     // Catch: java.lang.Throwable -> L6a
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            r2 = 0
        L54:
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L6a
            if (r2 >= r3) goto L6d
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L6a
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch: java.lang.Throwable -> L6a
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaignWithBackData(r3)     // Catch: java.lang.Throwable -> L6a
            r0.add(r3)     // Catch: java.lang.Throwable -> L6a
            int r2 = r2 + 1
            goto L54
        L6a:
            r6 = move-exception
            goto Lf6
        L6d:
            r8.a(r0)     // Catch: java.lang.Throwable -> L6a
        L70:
            java.lang.String r0 = "lrid"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L6a
            r8.b(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "rid"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L6a
            r8.c(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "unitid"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L6a
            r8.d(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "ecppv"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L6a
            r8.a(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "ts"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            long r0 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L6a
            r8.b(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "state"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            int r0 = r5.getInt(r0)     // Catch: java.lang.Throwable -> L6a
            r8.b(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "show_count"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            int r0 = r5.getInt(r0)     // Catch: java.lang.Throwable -> L6a
            r8.a(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "show_time"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            long r0 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L6a
            r8.c(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "interval_ts"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            long r0 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L6a
            r8.a(r0)     // Catch: java.lang.Throwable -> L6a
            r6.add(r8)     // Catch: java.lang.Throwable -> L6a
            goto L24
        Lea:
            r5.close()     // Catch: java.lang.Exception -> Led
        Led:
            return r6
        Lee:
            if (r5 == 0) goto Lfc
        Lf0:
            r5.close()     // Catch: java.lang.Exception -> Lfc
            goto Lfc
        Lf4:
            r6 = move-exception
            r5 = r7
        Lf6:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> Lfd
            if (r5 == 0) goto Lfc
            goto Lf0
        Lfc:
            return r7
        Lfd:
            r6 = move-exception
            if (r5 == 0) goto L103
            r5.close()     // Catch: java.lang.Exception -> L103
        L103:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.c.a(java.lang.String, int, long):java.util.List");
    }
}
