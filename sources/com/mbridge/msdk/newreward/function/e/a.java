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

/* loaded from: classes4.dex */
public final class a {
    private SQLiteDatabase a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f14645b = new Object();

    public a(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    private static String a() {
        return "ad_type=? and app_id=? and placement_id=? and unit_id=? and (state in (6,402,406,403,8,7) or invalid_time<? )";
    }

    public final void b(int i10, String str, String str2, String str3, boolean z10, String str4, long j3) {
        SQLiteDatabase sQLiteDatabase;
        Cursor query;
        if (!DatabaseUtils.isDatabaseAvailable(this.a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "insert: database is not available");
                return;
            }
            return;
        }
        double d10 = com.mbridge.msdk.newreward.function.h.a.d(str4);
        synchronized (this.f14645b) {
            try {
                try {
                    query = this.a.query("campaign", null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(i10), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, str3}, null, null, null);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CampaignTable", "insert: ", e2);
                    }
                    sQLiteDatabase = this.a;
                }
                if (query != null && query.getCount() > 0) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "insert:  already exist");
                    }
                    DatabaseUtils.closeCursor(query);
                    return;
                }
                DatabaseUtils.beginTransaction(this.a);
                ContentValues contentValues = new ContentValues();
                contentValues.put("ad_type", Integer.valueOf(i10));
                contentValues.put(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
                contentValues.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, str);
                contentValues.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                contentValues.put("local_id", str3);
                contentValues.put("state", (Integer) 0);
                contentValues.put("bid_token", str4);
                contentValues.put("invalid_time", Long.valueOf(j3));
                contentValues.put("header_bidding", Integer.valueOf(z10 ? 1 : 0));
                contentValues.put("load_start_time", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("ecppv", Double.valueOf(d10));
                long insert = this.a.insert("campaign", null, contentValues);
                if (MBridgeConstans.DEBUG) {
                    ad.a("CampaignTable", "insert result:  " + insert);
                }
                DatabaseUtils.setTransactionSuccessful(this.a);
                sQLiteDatabase = this.a;
                DatabaseUtils.endTransaction(sQLiteDatabase);
            } finally {
                DatabaseUtils.endTransaction(this.a);
            }
        }
    }

    public final void c(int i10, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "clearLoadCheckCampaigns: database is not available");
                return;
            }
            return;
        }
        synchronized (this.f14645b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.a);
                    int delete = this.a.delete("campaign", "ad_type=? and app_id=? and placement_id=? and unit_id=? and state in (0,405,401,404);", new String[]{String.valueOf(i10), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2});
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "clearLoadCheckCampaigns result:  " + delete);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.a);
                    sQLiteDatabase = this.a;
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CampaignTable", "clearLoadCheckCampaigns: ", e2);
                    }
                    sQLiteDatabase = this.a;
                }
                DatabaseUtils.endTransaction(sQLiteDatabase);
            } catch (Throwable th2) {
                DatabaseUtils.endTransaction(this.a);
                throw th2;
            }
        }
    }

    public final void d(int i10, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "clearUnInvalidCampaign: database is not available");
                return;
            }
            return;
        }
        synchronized (this.f14645b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.a);
                    int delete = this.a.delete("campaign", a(), new String[]{String.valueOf(i10), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(System.currentTimeMillis())});
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "clearUnInvalidCampaign result:  " + delete);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.a);
                    sQLiteDatabase = this.a;
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CampaignTable", "clearUnInvalidCampaign: ", e2);
                    }
                    sQLiteDatabase = this.a;
                }
                DatabaseUtils.endTransaction(sQLiteDatabase);
            } catch (Throwable th2) {
                DatabaseUtils.endTransaction(this.a);
                throw th2;
            }
        }
    }

    public final List<String> e(int i10, String str, String str2) {
        Cursor query;
        Cursor cursor = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "database is not available");
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.f14645b) {
            try {
                try {
                    query = this.a.query("campaign", null, a(), new String[]{String.valueOf(i10), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(System.currentTimeMillis())}, null, null, null, null);
                } catch (Exception e2) {
                    e = e2;
                }
                if (query != null) {
                    try {
                    } catch (Exception e10) {
                        e = e10;
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
                th = th3;
            }
        }
    }

    public final void a(final com.mbridge.msdk.newreward.function.d.a.b bVar) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(bVar);
            }
        });
    }

    public final void a(final int i10, final String str, final String str2, final boolean z10, final b bVar) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.3
            @Override // java.lang.Runnable
            public final void run() {
                List<com.mbridge.msdk.newreward.function.d.a.b> a = a.this.a(i10, str, str2, z10);
                if (a != null && !a.isEmpty()) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(a);
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

    public final List<com.mbridge.msdk.newreward.function.d.a.b> a(int i10, String str, String str2, boolean z10) {
        Cursor cursor;
        Cursor cursor2 = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "find: database is not available");
            }
            return null;
        }
        synchronized (this.f14645b) {
            try {
                cursor = this.a.query("campaign", null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state in (401,404,405)", new String[]{String.valueOf(i10), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(z10 ? 1 : 0)}, null, null, "load_start_time desc");
            } catch (Exception e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                try {
                    List<com.mbridge.msdk.newreward.function.d.a.b> a = a(cursor);
                    if ((a == null || a.size() == 0) && MBridgeConstans.DEBUG) {
                        ad.b("CampaignTable", "find: mBridgeCampaigns is null or empty");
                    }
                    DatabaseUtils.closeCursor(cursor);
                    return a;
                } catch (Exception e10) {
                    e = e10;
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CampaignTable", "find: ", e);
                    }
                    DatabaseUtils.closeCursor(cursor);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                DatabaseUtils.closeCursor(cursor2);
                throw th;
            }
        }
    }

    public final List<com.mbridge.msdk.newreward.function.d.a.b> a(int i10, String str, String str2, boolean z10, int i11) {
        Cursor cursor;
        Cursor cursor2 = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "find: database is not available");
            }
            return null;
        }
        synchronized (this.f14645b) {
            try {
                try {
                    cursor = this.a.query("campaign", null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state=? and invalid_time>?", new String[]{String.valueOf(i10), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(z10 ? 1 : 0), String.valueOf(3), String.valueOf(System.currentTimeMillis())}, null, null, "load_start_time desc", String.valueOf(i11 <= 0 ? Integer.MAX_VALUE : i11));
                } catch (Exception e2) {
                    e = e2;
                    cursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    DatabaseUtils.closeCursor(cursor2);
                    throw th;
                }
                try {
                    List<com.mbridge.msdk.newreward.function.d.a.b> a = a(cursor);
                    if ((a == null || a.size() == 0) && MBridgeConstans.DEBUG) {
                        ad.b("CampaignTable", "find: mBridgeCampaigns is null or empty");
                    }
                    DatabaseUtils.closeCursor(cursor);
                    return a;
                } catch (Exception e10) {
                    e = e10;
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CampaignTable", "find: ", e);
                    }
                    DatabaseUtils.closeCursor(cursor);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = null;
                DatabaseUtils.closeCursor(cursor2);
                throw th;
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
            if (!DatabaseUtils.isDatabaseAvailable(this.a)) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignTable", "insert: database is not available");
                    return;
                }
                return;
            }
            synchronized (this.f14645b) {
                try {
                    try {
                        DatabaseUtils.beginTransaction(this.a);
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
                        long update = this.a.update("campaign", contentValues, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(bVar.a()), com.mbridge.msdk.foundation.controller.c.m().k(), bVar.b(), bVar.c(), bVar.e()});
                        if (MBridgeConstans.DEBUG) {
                            ad.a("CampaignTable", "updateCampaign result:  " + update);
                        }
                        DatabaseUtils.setTransactionSuccessful(this.a);
                        sQLiteDatabase = this.a;
                    } catch (Throwable th2) {
                        DatabaseUtils.endTransaction(this.a);
                        throw th2;
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CampaignTable", "updateCampaign: ", e2);
                    }
                    sQLiteDatabase = this.a;
                }
                DatabaseUtils.endTransaction(sQLiteDatabase);
            }
            return;
        }
        if (MBridgeConstans.DEBUG) {
            ad.b("CampaignTable", "insert: campaignList is null or empty");
        }
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
            int i10 = columnIndex14;
            int columnIndex18 = cursor2.getColumnIndex("system_id");
            int i11 = columnIndex13;
            int columnIndex19 = cursor2.getColumnIndex("show_count");
            int columnIndex20 = cursor2.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_PARENT_SESSION_ID);
            int columnIndex21 = cursor2.getColumnIndex(DataSchemeDataSource.SCHEME_DATA);
            int columnIndex22 = cursor2.getColumnIndex("token_rule");
            while (cursor.moveToNext()) {
                int i12 = columnIndex22;
                int i13 = columnIndex;
                int i14 = columnIndex2;
                int i15 = columnIndex3;
                int i16 = columnIndex4;
                com.mbridge.msdk.newreward.function.d.a.b bVar = new com.mbridge.msdk.newreward.function.d.a.b(cursor2.getInt(columnIndex), cursor2.getString(columnIndex2), cursor2.getString(columnIndex3), cursor2.getString(columnIndex4));
                bVar.a(cursor2.getString(columnIndex5));
                bVar.b(cursor2.getString(columnIndex6));
                String string = cursor2.getString(columnIndex7);
                bVar.c(string);
                boolean z10 = true;
                if (cursor2.getInt(columnIndex8) != 1) {
                    z10 = false;
                }
                bVar.a(z10);
                bVar.e(cursor2.getLong(columnIndex9));
                bVar.d(cursor2.getString(columnIndex17));
                bVar.e(cursor2.getString(columnIndex18));
                bVar.f(cursor2.getString(columnIndex10));
                bVar.a(cursor2.getInt(columnIndex11));
                bVar.b(cursor2.getInt(columnIndex12));
                int i17 = columnIndex18;
                int i18 = columnIndex17;
                int i19 = i11;
                bVar.b(cursor2.getLong(i19));
                i11 = i19;
                int i20 = i10;
                bVar.c(cursor2.getLong(i20));
                i10 = i20;
                int i21 = columnIndex15;
                bVar.d(cursor2.getLong(i21));
                columnIndex15 = i21;
                int i22 = columnIndex16;
                bVar.a(cursor2.getDouble(i22));
                int i23 = columnIndex19;
                bVar.c(cursor2.getInt(i23));
                columnIndex16 = i22;
                int i24 = columnIndex20;
                bVar.g(cursor2.getString(i24));
                bVar.i(cursor2.getInt(i12));
                int i25 = columnIndex21;
                JSONObject parse = JSONUtils.parse(cursor2.getString(i25));
                bVar.a(parse);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(bVar);
                CampaignUnit parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(parse, string);
                if (parseCampaignUnit != null) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList<CampaignEx> ads = parseCampaignUnit.getAds();
                    if (ads != null) {
                        columnIndex21 = i25;
                        MBridgeGlobalCommon.handlerCampaigns(bVar.e(), bVar, ads, arrayList4);
                        bVar.b(ads);
                        bVar.a(arrayList4);
                        cursor2 = cursor;
                        arrayList2 = arrayList3;
                        columnIndex20 = i24;
                        columnIndex18 = i17;
                        columnIndex17 = i18;
                        columnIndex22 = i12;
                        columnIndex = i13;
                        columnIndex3 = i15;
                        columnIndex4 = i16;
                        columnIndex19 = i23;
                        columnIndex2 = i14;
                    }
                }
                cursor2 = cursor;
                arrayList2 = arrayList3;
                columnIndex21 = i25;
                columnIndex20 = i24;
                columnIndex18 = i17;
                columnIndex17 = i18;
                columnIndex22 = i12;
                columnIndex = i13;
                columnIndex3 = i15;
                columnIndex4 = i16;
                columnIndex19 = i23;
                columnIndex2 = i14;
            }
            return arrayList2;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.b("CampaignTable", "parseCampaignTable: ", e2);
            return null;
        }
    }

    public final void b(int i10, String str, String str2, String str3, int i11) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "updateState: database is not available");
                return;
            }
            return;
        }
        synchronized (this.f14645b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.a);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", Integer.valueOf(i11));
                    int update = this.a.update("campaign", contentValues, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(i10), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, str3});
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "updateState result:  " + update);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.a);
                    sQLiteDatabase = this.a;
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CampaignTable", "updateState: ", e2);
                    }
                    sQLiteDatabase = this.a;
                }
                DatabaseUtils.endTransaction(sQLiteDatabase);
            } catch (Throwable th2) {
                DatabaseUtils.endTransaction(this.a);
                throw th2;
            }
        }
    }

    public final void b(final int i10, final String str, final String str2) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.7
            @Override // java.lang.Runnable
            public final void run() {
                a.this.c(i10, str, str2);
            }
        });
    }

    public final void a(final int i10, final String str, final String str2, final String str3, final boolean z10, final String str4, final long j3) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(i10, str, str2, str3, z10, str4, j3);
            }
        });
    }

    public final void a(final int i10, final String str, final String str2, final boolean z10, final int i11, final b bVar) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.4
            @Override // java.lang.Runnable
            public final void run() {
                List<com.mbridge.msdk.newreward.function.d.a.b> a = a.this.a(i10, str, str2, z10, i11);
                if (a != null && a.size() != 0) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(a);
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

    public final void a(final int i10, final String str, final String str2, final String str3, final int i11) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.5
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(i10, str, str2, str3, i11);
            }
        });
    }

    public final void a(final int i10, final String str, final String str2) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.6
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d(i10, str, str2);
            }
        });
    }
}
