package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class i extends a<com.mbridge.msdk.foundation.entity.f> {
    private static i a;

    private i(f fVar) {
        super(fVar);
    }

    public static synchronized i a(f fVar) {
        i iVar;
        synchronized (i.class) {
            if (a == null) {
                a = new i(fVar);
            }
            iVar = a;
        }
        return iVar;
    }

    public final synchronized void a(String str) {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS), str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("fq_info", "time< ? and unitId=?", strArr);
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized void a(com.mbridge.msdk.foundation.entity.f fVar) {
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (getWritableDatabase() == null) {
            return;
        }
        if (fVar != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", fVar.a());
            contentValues.put("time", Long.valueOf(fVar.b()));
            contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, fVar.d());
            contentValues.put("type", Integer.valueOf(fVar.c()));
            if (a(fVar.d(), fVar.a())) {
                getWritableDatabase().update("fq_info", contentValues, "id = ? AND unitId = ? ", new String[]{fVar.a(), fVar.d()});
            } else {
                getWritableDatabase().insert("fq_info", null, contentValues);
            }
        }
    }

    private synchronized boolean a(String str, String str2) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("select id from fq_info where unitId= ?  and id= ? ", new String[]{str, str2});
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
