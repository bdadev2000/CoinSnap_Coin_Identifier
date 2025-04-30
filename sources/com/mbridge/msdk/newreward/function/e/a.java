package com.mbridge.msdk.newreward.function.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.DatabaseUtils;
import com.mbridge.msdk.newreward.function.common.JSONUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f17270a;
    private final Object b = new Object();

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f17270a = sQLiteDatabase;
    }

    public final void a(final com.mbridge.msdk.newreward.function.d.a.b bVar) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(bVar);
            }
        });
    }

    public final void b(int i9, String str, String str2, String str3, boolean z8, String str4, long j7) {
        SQLiteDatabase sQLiteDatabase;
        Cursor query;
        if (!DatabaseUtils.isDatabaseAvailable(this.f17270a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "insert: database is not available");
                return;
            }
            return;
        }
        double d2 = com.mbridge.msdk.newreward.function.h.a.d(str4);
        synchronized (this.b) {
            try {
                try {
                    query = this.f17270a.query("campaign", null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(i9), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, str3}, null, null, null);
                } catch (Throwable th) {
                    DatabaseUtils.endTransaction(this.f17270a);
                    throw th;
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignTable", "insert: ", e4);
                }
                sQLiteDatabase = this.f17270a;
            }
            if (query != null && query.getCount() > 0) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CampaignTable", "insert:  already exist");
                }
                DatabaseUtils.closeCursor(query);
                DatabaseUtils.endTransaction(this.f17270a);
                return;
            }
            DatabaseUtils.beginTransaction(this.f17270a);
            ContentValues contentValues = new ContentValues();
            contentValues.put("ad_type", Integer.valueOf(i9));
            contentValues.put(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
            contentValues.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, str);
            contentValues.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            contentValues.put("local_id", str3);
            contentValues.put("state", (Integer) 0);
            contentValues.put("bid_token", str4);
            contentValues.put("invalid_time", Long.valueOf(j7));
            contentValues.put("header_bidding", Integer.valueOf(z8 ? 1 : 0));
            contentValues.put("load_start_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("ecppv", Double.valueOf(d2));
            long insert = this.f17270a.insert("campaign", null, contentValues);
            if (MBridgeConstans.DEBUG) {
                ad.a("CampaignTable", "insert result:  " + insert);
            }
            DatabaseUtils.setTransactionSuccessful(this.f17270a);
            sQLiteDatabase = this.f17270a;
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    public final void c(int i9, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f17270a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "clearLoadCheckCampaigns: database is not available");
                return;
            }
            return;
        }
        synchronized (this.b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f17270a);
                    int delete = this.f17270a.delete("campaign", "ad_type=? and app_id=? and placement_id=? and unit_id=? and state in (0,405,401,404);", new String[]{String.valueOf(i9), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2});
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "clearLoadCheckCampaigns result:  " + delete);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f17270a);
                    sQLiteDatabase = this.f17270a;
                } catch (Throwable th) {
                    DatabaseUtils.endTransaction(this.f17270a);
                    throw th;
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignTable", "clearLoadCheckCampaigns: ", e4);
                }
                sQLiteDatabase = this.f17270a;
            }
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    public final void d(int i9, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f17270a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "clearUnInvalidCampaign: database is not available");
                return;
            }
            return;
        }
        synchronized (this.b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f17270a);
                    int delete = this.f17270a.delete("campaign", a(), new String[]{String.valueOf(i9), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(System.currentTimeMillis())});
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "clearUnInvalidCampaign result:  " + delete);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f17270a);
                    sQLiteDatabase = this.f17270a;
                } catch (Throwable th) {
                    DatabaseUtils.endTransaction(this.f17270a);
                    throw th;
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignTable", "clearUnInvalidCampaign: ", e4);
                }
                sQLiteDatabase = this.f17270a;
            }
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    public final List<String> e(int i9, String str, String str2) {
        Cursor query;
        Cursor cursor = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f17270a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "database is not available");
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            try {
                try {
                    try {
                        query = this.f17270a.query("campaign", null, a(), new String[]{String.valueOf(i9), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(System.currentTimeMillis())}, null, null, null, null);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                if (query != null) {
                    try {
                    } catch (Exception e9) {
                        e = e9;
                        cursor = query;
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CampaignTable", "find: ", e);
                        }
                        DatabaseUtils.closeCursor(cursor);
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        DatabaseUtils.closeCursor(cursor);
                        throw th;
                    }
                    if (query.getCount() > 0) {
                        int columnIndex = query.getColumnIndex("local_id");
                        while (query.moveToNext()) {
                            String string = query.getString(columnIndex);
                            if (!TextUtils.isEmpty(string)) {
                                arrayList.add(string);
                            }
                        }
                        DatabaseUtils.closeCursor(query);
                        return arrayList;
                    }
                }
                DatabaseUtils.closeCursor(query);
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void a(final int i9, final String str, final String str2, final boolean z8, final b bVar) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.3
            @Override // java.lang.Runnable
            public final void run() {
                List<com.mbridge.msdk.newreward.function.d.a.b> a6 = a.this.a(i9, str, str2, z8);
                if (a6 != null && !a6.isEmpty()) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(a6);
                        return;
                    }
                    return;
                }
                b bVar3 = bVar;
                if (bVar3 != null) {
                    bVar3.a();
                }
            }
        });
    }

    public final List<com.mbridge.msdk.newreward.function.d.a.b> a(int i9, String str, String str2, boolean z8) {
        Cursor cursor;
        Cursor cursor2 = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f17270a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "find: database is not available");
            }
            return null;
        }
        synchronized (this.b) {
            try {
                cursor = this.f17270a.query("campaign", null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state in (401,404,405)", new String[]{String.valueOf(i9), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(z8 ? 1 : 0)}, null, null, "load_start_time desc");
            } catch (Exception e4) {
                e = e4;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                DatabaseUtils.closeCursor(cursor2);
                throw th;
            }
            try {
                try {
                    List<com.mbridge.msdk.newreward.function.d.a.b> a6 = a(cursor);
                    if (a6 != null) {
                        if (a6.size() == 0) {
                        }
                        DatabaseUtils.closeCursor(cursor);
                        return a6;
                    }
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CampaignTable", "find: mBridgeCampaigns is null or empty");
                    }
                    DatabaseUtils.closeCursor(cursor);
                    return a6;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    DatabaseUtils.closeCursor(cursor2);
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignTable", "find: ", e);
                }
                DatabaseUtils.closeCursor(cursor);
                return null;
            }
        }
    }

    public final List<com.mbridge.msdk.newreward.function.d.a.b> a(int i9, String str, String str2, boolean z8, int i10) {
        Cursor cursor;
        Cursor cursor2 = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f17270a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "find: database is not available");
            }
            return null;
        }
        synchronized (this.b) {
            try {
                cursor = this.f17270a.query("campaign", null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state=? and invalid_time>?", new String[]{String.valueOf(i9), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(z8 ? 1 : 0), String.valueOf(3), String.valueOf(System.currentTimeMillis())}, null, null, "load_start_time desc", String.valueOf(i10 <= 0 ? Integer.MAX_VALUE : i10));
            } catch (Exception e4) {
                e = e4;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                DatabaseUtils.closeCursor(cursor2);
                throw th;
            }
            try {
                try {
                    List<com.mbridge.msdk.newreward.function.d.a.b> a6 = a(cursor);
                    if (a6 != null) {
                        if (a6.size() == 0) {
                        }
                        DatabaseUtils.closeCursor(cursor);
                        return a6;
                    }
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CampaignTable", "find: mBridgeCampaigns is null or empty");
                    }
                    DatabaseUtils.closeCursor(cursor);
                    return a6;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    DatabaseUtils.closeCursor(cursor2);
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignTable", "find: ", e);
                }
                DatabaseUtils.closeCursor(cursor);
                return null;
            }
        }
    }

    public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        SQLiteDatabase sQLiteDatabase;
        if (bVar == null) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "insert: mBridgeCampaigns is null");
                return;
            }
            return;
        }
        List<com.mbridge.msdk.newreward.function.d.a.a> s5 = bVar.s();
        if (s5 != null && !s5.isEmpty()) {
            if (!DatabaseUtils.isDatabaseAvailable(this.f17270a)) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignTable", "insert: database is not available");
                    return;
                }
                return;
            }
            synchronized (this.b) {
                try {
                    try {
                        DatabaseUtils.beginTransaction(this.f17270a);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("request_id", bVar.d());
                        contentValues.put("session_id", bVar.i());
                        contentValues.put("system_id", bVar.j());
                        contentValues.put("backup_id", bVar.k());
                        contentValues.put("state", Integer.valueOf(bVar.h()));
                        contentValues.put("template", Integer.valueOf(bVar.m()));
                        contentValues.put("invalid_time", Long.valueOf(bVar.n()));
                        contentValues.put("invalid_time_2", Long.valueOf(bVar.o()));
                        contentValues.put("invalid_time_backup", Long.valueOf(bVar.p()));
                        contentValues.put("show_count", Integer.valueOf(bVar.r()));
                        contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_PARENT_SESSION_ID, bVar.l());
                        contentValues.put("token_rule", Integer.valueOf(bVar.E()));
                        contentValues.put(DataSchemeDataSource.SCHEME_DATA, bVar.t().toString());
                        long update = this.f17270a.update("campaign", contentValues, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(bVar.a()), com.mbridge.msdk.foundation.controller.c.m().k(), bVar.b(), bVar.c(), bVar.e()});
                        if (MBridgeConstans.DEBUG) {
                            ad.a("CampaignTable", "updateCampaign result:  " + update);
                        }
                        DatabaseUtils.setTransactionSuccessful(this.f17270a);
                        sQLiteDatabase = this.f17270a;
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CampaignTable", "updateCampaign: ", e4);
                        }
                        sQLiteDatabase = this.f17270a;
                    }
                    DatabaseUtils.endTransaction(sQLiteDatabase);
                } catch (Throwable th) {
                    DatabaseUtils.endTransaction(this.f17270a);
                    throw th;
                }
            }
            return;
        }
        if (MBridgeConstans.DEBUG) {
            ad.b("CampaignTable", "insert: campaignList is null or empty");
        }
    }

    private static String a() {
        return "ad_type=? and app_id=? and placement_id=? and unit_id=? and (state in (6,402,406,403,8,7) or invalid_time<? )";
    }

    private static List<com.mbridge.msdk.newreward.function.d.a.b> a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 == null || cursor.getCount() <= 0) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int columnIndex = cursor2.getColumnIndex("ad_type");
            int columnIndex2 = cursor2.getColumnIndex(MBridgeConstans.APP_ID);
            int columnIndex3 = cursor2.getColumnIndex(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
            int columnIndex4 = cursor2.getColumnIndex(MBridgeConstans.PROPERTIES_UNIT_ID);
            int columnIndex5 = cursor2.getColumnIndex("request_id");
            int columnIndex6 = cursor2.getColumnIndex("local_id");
            int columnIndex7 = cursor2.getColumnIndex("bid_token");
            int columnIndex8 = cursor2.getColumnIndex("header_bidding");
            int columnIndex9 = cursor2.getColumnIndex("load_start_time");
            int columnIndex10 = cursor2.getColumnIndex("backup_id");
            int columnIndex11 = cursor2.getColumnIndex("state");
            int columnIndex12 = cursor2.getColumnIndex("template");
            int columnIndex13 = cursor2.getColumnIndex("invalid_time");
            int columnIndex14 = cursor2.getColumnIndex("invalid_time_2");
            ArrayList arrayList2 = arrayList;
            int columnIndex15 = cursor2.getColumnIndex("invalid_time_backup");
            int columnIndex16 = cursor2.getColumnIndex("ecppv");
            int columnIndex17 = cursor2.getColumnIndex("session_id");
            int i9 = columnIndex14;
            int columnIndex18 = cursor2.getColumnIndex("system_id");
            int i10 = columnIndex13;
            int columnIndex19 = cursor2.getColumnIndex("show_count");
            int columnIndex20 = cursor2.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_PARENT_SESSION_ID);
            int columnIndex21 = cursor2.getColumnIndex(DataSchemeDataSource.SCHEME_DATA);
            int columnIndex22 = cursor2.getColumnIndex("token_rule");
            while (cursor.moveToNext()) {
                int i11 = columnIndex22;
                int i12 = columnIndex;
                int i13 = columnIndex2;
                int i14 = columnIndex3;
                int i15 = columnIndex4;
                com.mbridge.msdk.newreward.function.d.a.b bVar = new com.mbridge.msdk.newreward.function.d.a.b(cursor2.getInt(columnIndex), cursor2.getString(columnIndex2), cursor2.getString(columnIndex3), cursor2.getString(columnIndex4));
                bVar.a(cursor2.getString(columnIndex5));
                bVar.b(cursor2.getString(columnIndex6));
                String string = cursor2.getString(columnIndex7);
                bVar.c(string);
                boolean z8 = true;
                if (cursor2.getInt(columnIndex8) != 1) {
                    z8 = false;
                }
                bVar.a(z8);
                bVar.e(cursor2.getLong(columnIndex9));
                bVar.d(cursor2.getString(columnIndex17));
                bVar.e(cursor2.getString(columnIndex18));
                bVar.f(cursor2.getString(columnIndex10));
                bVar.a(cursor2.getInt(columnIndex11));
                bVar.b(cursor2.getInt(columnIndex12));
                int i16 = columnIndex18;
                int i17 = columnIndex17;
                int i18 = i10;
                bVar.b(cursor2.getLong(i18));
                i10 = i18;
                int i19 = i9;
                bVar.c(cursor2.getLong(i19));
                i9 = i19;
                int i20 = columnIndex15;
                bVar.d(cursor2.getLong(i20));
                columnIndex15 = i20;
                int i21 = columnIndex16;
                bVar.a(cursor2.getDouble(i21));
                int i22 = columnIndex19;
                bVar.c(cursor2.getInt(i22));
                columnIndex16 = i21;
                int i23 = columnIndex20;
                bVar.g(cursor2.getString(i23));
                bVar.i(cursor2.getInt(i11));
                int i24 = columnIndex21;
                JSONObject parse = JSONUtils.parse(cursor2.getString(i24));
                bVar.a(parse);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(bVar);
                CampaignUnit parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(parse, string);
                if (parseCampaignUnit != null) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList<CampaignEx> ads = parseCampaignUnit.getAds();
                    if (ads != null) {
                        columnIndex21 = i24;
                        MBridgeGlobalCommon.handlerCampaigns(bVar.e(), bVar, ads, arrayList4);
                        bVar.b(ads);
                        bVar.a(arrayList4);
                        cursor2 = cursor;
                        arrayList2 = arrayList3;
                        columnIndex20 = i23;
                        columnIndex18 = i16;
                        columnIndex17 = i17;
                        columnIndex22 = i11;
                        columnIndex = i12;
                        columnIndex3 = i14;
                        columnIndex4 = i15;
                        columnIndex19 = i22;
                        columnIndex2 = i13;
                    }
                }
                cursor2 = cursor;
                arrayList2 = arrayList3;
                columnIndex21 = i24;
                columnIndex20 = i23;
                columnIndex18 = i16;
                columnIndex17 = i17;
                columnIndex22 = i11;
                columnIndex = i12;
                columnIndex3 = i14;
                columnIndex4 = i15;
                columnIndex19 = i22;
                columnIndex2 = i13;
            }
            return arrayList2;
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "parseCampaignTable: ", e4);
            }
            return null;
        }
    }

    public final void b(int i9, String str, String str2, String str3, int i10) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f17270a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "updateState: database is not available");
                return;
            }
            return;
        }
        synchronized (this.b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f17270a);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", Integer.valueOf(i10));
                    int update = this.f17270a.update("campaign", contentValues, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(i9), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, str3});
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "updateState result:  " + update);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f17270a);
                    sQLiteDatabase = this.f17270a;
                } catch (Throwable th) {
                    DatabaseUtils.endTransaction(this.f17270a);
                    throw th;
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignTable", "updateState: ", e4);
                }
                sQLiteDatabase = this.f17270a;
            }
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    public final void b(final int i9, final String str, final String str2) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.7
            @Override // java.lang.Runnable
            public final void run() {
                a.this.c(i9, str, str2);
            }
        });
    }

    public final void a(final int i9, final String str, final String str2, final String str3, final boolean z8, final String str4, final long j7) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(i9, str, str2, str3, z8, str4, j7);
            }
        });
    }

    public final void a(final int i9, final String str, final String str2, final boolean z8, final int i10, final b bVar) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.4
            @Override // java.lang.Runnable
            public final void run() {
                List<com.mbridge.msdk.newreward.function.d.a.b> a6 = a.this.a(i9, str, str2, z8, i10);
                if (a6 != null && a6.size() != 0) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(a6);
                        return;
                    }
                    return;
                }
                b bVar3 = bVar;
                if (bVar3 != null) {
                    bVar3.a();
                }
            }
        });
    }

    public final void a(final int i9, final String str, final String str2, final String str3, final int i10) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.5
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(i9, str, str2, str3, i10);
            }
        });
    }

    public final void a(final int i9, final String str, final String str2) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.6
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d(i9, str, str2);
            }
        });
    }
}
