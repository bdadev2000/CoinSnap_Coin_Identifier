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

/* loaded from: classes4.dex */
public class c extends a {
    private static final String a = "com.mbridge.msdk.foundation.db.c";

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f13110b;

    private c(f fVar) {
        super(fVar);
    }

    public static c a(f fVar) {
        if (f13110b == null) {
            synchronized (c.class) {
                if (f13110b == null) {
                    f13110b = new c(fVar);
                }
            }
        }
        return f13110b;
    }

    public final void b(String str, String str2, String str3) {
        if (a(str, str3)) {
            try {
                getWritableDatabase().execSQL("UPDATE CacheCampaign SET show_count = show_count + 1, show_time = ? WHERE rid = ? AND unitid = ? AND state = ?", new Object[]{Long.valueOf(System.currentTimeMillis()), str, str3, "1"});
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final long a(String str, String str2, String str3, int i10) {
        if (!a(str, str3)) {
            return -1L;
        }
        new ContentValues().put("state", Integer.valueOf(i10));
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

    public final synchronized void a(String str, int i10) {
        String str2;
        SQLiteDatabase writableDatabase;
        if (i10 <= 0) {
            i10 = 1;
        }
        try {
            str2 = "unitid = ? AND ( (ts + interval_ts) < " + System.currentTimeMillis() + " OR show_count >= ?)";
            writableDatabase = getWritableDatabase();
        } catch (Exception e2) {
            ad.b("CacheCampaignDao", e2.getLocalizedMessage());
        }
        if (writableDatabase == null) {
            return;
        }
        try {
            writableDatabase.delete("CacheCampaign", str2, new String[]{str, String.valueOf(i10)});
        } catch (Exception e10) {
            e10.printStackTrace();
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
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e10) {
            ad.b("CampaignDao", e10.getLocalizedMessage());
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
                        com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                        if (b3 == null) {
                            com.mbridge.msdk.c.h.a();
                            b3 = com.mbridge.msdk.c.i.a();
                        }
                        candidateCacheTime = b3.aa();
                    }
                }
                try {
                    if (af.a().a("c_e_t", false)) {
                        candidateCacheTime *= 24;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                contentValues.put("interval_ts", Long.valueOf(candidateCacheTime * 1000));
                contentValues.put("ecppv", campaignEx.getEcppv());
                contentValues.put("show_count", Integer.valueOf(campaignEx.getShowCount()));
                contentValues.put("state", (Integer) 0);
                if (a(campaignEx.getRequestId(), str)) {
                    return getWritableDatabase().update("CacheCampaign", contentValues, "rid= ? AND lrid= ? AND unitid = ? AND state = 1", new String[]{campaignEx.getRequestId(), campaignEx.getLocalRequestId(), str});
                }
                return getWritableDatabase().insert("CacheCampaign", null, contentValues);
            } catch (Exception e10) {
                e10.printStackTrace();
                return -1L;
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
    
        if (r6 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00f5, code lost:
    
        if (r6 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0103, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00f7, code lost:
    
        r6.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.mbridge.msdk.foundation.b.b> a(java.lang.String r6, int r7, long r8) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.c.a(java.lang.String, int, long):java.util.List");
    }
}
