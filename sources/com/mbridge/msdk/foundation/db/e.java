package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.AabEntity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class e extends a<Campaign> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15479a = "com.mbridge.msdk.foundation.db.e";
    private static e b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15480c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15481d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15482e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15483f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15484g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15485h;

    /* renamed from: i, reason: collision with root package name */
    private final String f15486i;

    /* renamed from: j, reason: collision with root package name */
    private final String f15487j;

    /* renamed from: k, reason: collision with root package name */
    private final String f15488k;
    private final String l;
    private final String m;

    /* renamed from: n, reason: collision with root package name */
    private final String f15489n;

    /* renamed from: o, reason: collision with root package name */
    private final String f15490o;

    /* renamed from: p, reason: collision with root package name */
    private final String f15491p;

    /* renamed from: q, reason: collision with root package name */
    private final String f15492q;

    /* renamed from: r, reason: collision with root package name */
    private final String f15493r;

    /* renamed from: s, reason: collision with root package name */
    private final String f15494s;

    private e(f fVar) {
        super(fVar);
        this.f15480c = "rid";
        this.f15481d = "lrid";
        this.f15482e = BidResponsedEx.KEY_CID;
        this.f15483f = CampaignEx.JSON_KEY_PLCT;
        this.f15484g = CampaignEx.JSON_KEY_PLCTB;
        this.f15485h = CampaignEx.JSON_KEY_TIMESTAMP;
        this.f15486i = "ridCount";
        this.f15487j = " WHERE ";
        this.f15488k = " AND ";
        this.l = "SELECT ";
        this.m = "*";
        this.f15489n = " FROM ";
        this.f15490o = " AND readyState = '0'";
        this.f15491p = " AND is_bid_campaign = 1";
        this.f15492q = " order by ts ASC";
        this.f15493r = " group by request_id";
        this.f15494s = " group by bid_token";
    }

    public static synchronized e a(f fVar) {
        e eVar;
        synchronized (e.class) {
            try {
                if (b == null) {
                    b = new e(fVar);
                }
                eVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final synchronized void b(String str, List<CampaignEx> list) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 0);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, "unitid = ? AND id = ? AND request_id = ? ", new String[]{str, campaignEx.getId(), campaignEx.getRequestId()});
                        }
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CampaignDao", e4.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public final synchronized void c(String str) {
        String[] strArr;
        try {
            strArr = new String[]{str};
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e4.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", "unitid = ? ", strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        if (0 != 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.mbridge.msdk.foundation.entity.c> d(java.lang.String r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto Lc
            return r0
        Lc:
            java.lang.String r1 = " WHERE unitid = ? AND level = 0 AND adSource = 1 AND is_bid_campaign = 1 AND readyState = '0' group by request_id"
            java.lang.String r2 = " order by ts ASC"
            java.lang.String r1 = com.mbridge.msdk.foundation.entity.o.j(r1, r2)
            java.lang.String r2 = "SELECT request_id as rid ,count(*) as ridCount ,vcn,token_r,bid_token,local_request_id,ts as timestamp FROM campaign"
            java.lang.String r1 = x0.AbstractC2914a.d(r2, r1)
            java.lang.String[] r11 = new java.lang.String[]{r11}
            r2 = 0
            java.lang.Object r3 = new java.lang.Object     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r3.<init>()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            android.database.sqlite.SQLiteDatabase r4 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> Lb8
            android.database.Cursor r2 = r4.rawQuery(r1, r11)     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto Lb2
            int r11 = r2.getCount()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            if (r11 <= 0) goto Lb2
        L36:
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            if (r11 == 0) goto Lb2
            com.mbridge.msdk.foundation.entity.c r11 = new com.mbridge.msdk.foundation.entity.c     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r11.<init>()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r1 = "rid"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            if (r3 == 0) goto L52
            goto L36
        L52:
            java.lang.String r3 = "local_request_id"
            int r3 = r2.getColumnIndex(r3)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r4 = "bid_token"
            int r4 = r2.getColumnIndex(r4)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r5 = "ridCount"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            int r5 = r2.getInt(r5)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r6 = "token_r"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            int r6 = r2.getInt(r6)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r7 = "timestamp"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            long r7 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r9 = "vcn"
            int r9 = r2.getColumnIndex(r9)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            int r9 = r2.getInt(r9)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r11.a(r1)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r11.a(r5)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r11.c(r7)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r11.b(r6)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r11.c(r9)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r11.c(r3)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            if (r1 != 0) goto Lae
            r11.b(r4)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            goto Lae
        Laa:
            r11 = move-exception
            goto Lcc
        Lac:
            r11 = move-exception
            goto Lbb
        Lae:
            r0.add(r11)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            goto L36
        Lb2:
            if (r2 == 0) goto Lcb
        Lb4:
            r2.close()
            goto Lcb
        Lb8:
            r11 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb8
            throw r11     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
        Lbb:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto Lc8
            java.lang.String r1 = "CampaignDao"
            java.lang.String r11 = r11.getLocalizedMessage()     // Catch: java.lang.Throwable -> Laa
            com.mbridge.msdk.foundation.tools.ad.b(r1, r11)     // Catch: java.lang.Throwable -> Laa
        Lc8:
            if (r2 == 0) goto Lcb
            goto Lb4
        Lcb:
            return r0
        Lcc:
            if (r2 == 0) goto Ld1
            r2.close()
        Ld1:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.d(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        if (0 == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> e(java.lang.String r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto Lc
            return r0
        Lc:
            r1 = 0
            java.lang.Object r2 = new java.lang.Object     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            android.database.sqlite.SQLiteDatabase r3 = r6.getReadableDatabase()     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "SELECT local_request_id as lrid FROM campaign WHERE unitid = ? AND readyState = ?"
            r5 = 2
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L54
            java.lang.String[] r7 = new java.lang.String[]{r7, r5}     // Catch: java.lang.Throwable -> L54
            android.database.Cursor r1 = r3.rawQuery(r4, r7)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L4e
            int r7 = r1.getCount()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            if (r7 <= 0) goto L4e
        L2f:
            boolean r7 = r1.moveToNext()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            if (r7 == 0) goto L4e
            java.lang.String r7 = "lrid"
            int r7 = r1.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r7 = r1.getString(r7)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            if (r2 == 0) goto L46
            goto L2f
        L46:
            r0.add(r7)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            goto L2f
        L4a:
            r7 = move-exception
            goto L64
        L4c:
            r7 = move-exception
            goto L57
        L4e:
            if (r1 == 0) goto L63
        L50:
            r1.close()
            goto L63
        L54:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            throw r7     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
        L57:
            java.lang.String r2 = "CampaignDao"
            java.lang.String r7 = r7.getLocalizedMessage()     // Catch: java.lang.Throwable -> L4a
            com.mbridge.msdk.foundation.tools.ad.b(r2, r7)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L63
            goto L50
        L63:
            return r0
        L64:
            if (r1 == 0) goto L69
            r1.close()
        L69:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.e(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (r2 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        if (0 != 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.entity.c> f(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String[] r11 = new java.lang.String[]{r11}
            java.lang.String r0 = "SELECT request_id as rid, id as cid, plct as plct, plctb as plctb, ts as timestamp FROM campaign WHERE unitid = ? AND level = 0 AND adSource = 1 AND is_bid_campaign = 1 AND readyState = '0'"
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r2 = 0
            java.lang.Object r3 = new java.lang.Object     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r3.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            android.database.sqlite.SQLiteDatabase r4 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> Lae
            android.database.Cursor r2 = r4.rawQuery(r0, r11)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto La8
            int r11 = r2.getCount()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            if (r11 <= 0) goto La8
        L23:
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            if (r11 == 0) goto La8
            java.lang.String r11 = "rid"
            int r11 = r2.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r11 = r2.getString(r11)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r0 = "cid"
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r3 = "plct"
            int r3 = r2.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            long r3 = r2.getLong(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r5 = "plctb"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            long r5 = r2.getLong(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r7 = "timestamp"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            long r7 = r2.getLong(r7)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            boolean r9 = r1.containsKey(r11)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            if (r9 == 0) goto L87
            java.lang.Object r9 = r1.get(r11)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            com.mbridge.msdk.foundation.entity.c r9 = (com.mbridge.msdk.foundation.entity.c) r9     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            if (r9 == 0) goto L23
            r9.a(r11)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r9.a(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r9.b(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r9.c(r7)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.util.List r11 = r9.c()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            if (r11 == 0) goto L23
            java.util.List r11 = r9.c()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r11.add(r0)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            goto L23
        L83:
            r11 = move-exception
            goto Lc2
        L85:
            r11 = move-exception
            goto Lb1
        L87:
            com.mbridge.msdk.foundation.entity.c r9 = new com.mbridge.msdk.foundation.entity.c     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r9.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r9.a(r11)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r9.a(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r9.b(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r9.c(r7)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r3.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r3.add(r0)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r9.a(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r1.put(r11, r9)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            goto L23
        La8:
            if (r2 == 0) goto Lc1
        Laa:
            r2.close()
            goto Lc1
        Lae:
            r11 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            throw r11     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
        Lb1:
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto Lbe
            java.lang.String r0 = "CampaignDao"
            java.lang.String r11 = r11.getLocalizedMessage()     // Catch: java.lang.Throwable -> L83
            com.mbridge.msdk.foundation.tools.ad.b(r0, r11)     // Catch: java.lang.Throwable -> L83
        Lbe:
            if (r2 == 0) goto Lc1
            goto Laa
        Lc1:
            return r1
        Lc2:
            if (r2 == 0) goto Lc7
            r2.close()
        Lc7:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.f(java.lang.String):java.util.concurrent.ConcurrentHashMap");
    }

    public final synchronized void a(String str, int i9, int i10) {
        String[] strArr;
        try {
            strArr = new String[]{str, String.valueOf(i9), String.valueOf(i10)};
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e4.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", "unitid = ? AND level = ? AND adSource = ? ", strArr);
    }

    public final int c(String str, String str2) {
        String[] strArr;
        String str3;
        if (!TextUtils.isEmpty(str)) {
            strArr = new String[]{str2, str};
            str3 = "unitid = ?  AND request_id = ?  AND is_bid_campaign = 1";
        } else {
            strArr = new String[]{str2};
            str3 = "unitid = ?  AND is_bid_campaign = 1";
        }
        String concat = str3.concat(" AND readyState = '0'");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            return getWritableDatabase().update("campaign", contentValues, concat, strArr);
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return 0;
            }
            ad.b("CampaignDao", e4.getLocalizedMessage());
            return 0;
        }
    }

    public final synchronized void a(String str, int i9, int i10, boolean z8) {
        String[] strArr;
        try {
            strArr = new String[]{str, String.valueOf(i9), String.valueOf(i10), String.valueOf(z8 ? 1 : 0)};
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e4.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", "unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = ? ", strArr);
    }

    public final synchronized List<CampaignEx> b(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM campaign WHERE unitid = ? AND readyState = 2", new String[]{str});
            if (rawQuery == null || rawQuery.getCount() <= 0) {
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                arrayList.add(a(rawQuery));
            }
            rawQuery.close();
            return arrayList;
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e4.getLocalizedMessage());
            }
            return null;
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", th.getLocalizedMessage());
            }
            return null;
        }
    }

    public final synchronized void e(String str, String str2) {
        try {
            try {
            } catch (Exception e4) {
                ad.b("CampaignDao", e4.getLocalizedMessage());
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String str3 = "";
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                str3 = "unitid = ? AND ";
                arrayList.add(str);
            }
            String concat = str3.concat("n_local_request_id = ? AND bid_token IS NOT NULL AND n_local_request_id IS NOT NULL");
            arrayList.add(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update("campaign", contentValues, concat, (String[]) arrayList.toArray(new String[0]));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(String str, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (CampaignEx campaignEx : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 2);
                        String str2 = "id = ? AND unitid = ? AND request_id = ?  AND is_bid_campaign = ? ";
                        String[] strArr = {campaignEx.getId(), str, campaignEx.getRequestId(), campaignEx.isBidCampaign() ? "1" : "0"};
                        try {
                            SQLiteDatabase writableDatabase = getWritableDatabase();
                            if (writableDatabase != null) {
                                writableDatabase.update("campaign", contentValues, str2, strArr);
                            }
                        } catch (SQLException e4) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("CampaignDao", e4.getLocalizedMessage());
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void b(String str, String str2) {
        try {
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e4.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        String[] strArr = {str, str2};
        ContentValues contentValues = new ContentValues();
        contentValues.put("readyState", (Integer) 2);
        getWritableDatabase().update("campaign", contentValues, "id = ? AND request_id = ? ", strArr);
    }

    public final synchronized void a(String str, CampaignEx campaignEx, boolean z8, String str2) {
        try {
            try {
                StringBuilder sb = new StringBuilder();
                if (campaignEx == null && !TextUtils.isEmpty(str2)) {
                    sb.append("unitid");
                    sb.append(" = ? AND ");
                    sb.append("request_id");
                    sb.append(" = ?");
                } else if (campaignEx != null && campaignEx.getLoadTimeoutState() == 0) {
                    sb.append("unitid");
                    sb.append(" = ? AND ");
                    sb.append("id");
                    sb.append(" = ? AND ");
                    sb.append("request_id");
                    sb.append(" = ?");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                if (campaignEx != null && campaignEx.getLoadTimeoutState() == 0) {
                    arrayList.add(String.valueOf(campaignEx.getId()));
                    arrayList.add(campaignEx.getRequestId());
                } else {
                    arrayList.add(str2);
                }
                if (!TextUtils.isEmpty(sb)) {
                    if (af.a().a("c_n_c_s", true)) {
                        sb.append(" AND readyState");
                        sb.append(" != 0");
                    }
                    if (z8) {
                        sb.append(" AND is_bid_campaign = 1");
                    } else {
                        sb.append(" AND is_bid_campaign = 0");
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("readyState", (Integer) 2);
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    if (writableDatabase != null) {
                        writableDatabase.update("campaign", contentValues, sb.toString(), strArr);
                    }
                }
            } catch (SQLException e4) {
                ad.b("CampaignDao", e4.getLocalizedMessage());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(String str, String str2) {
        try {
        } catch (Exception e4) {
            ad.b("CampaignDao", e4.getLocalizedMessage());
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            String[] strArr = {str, str2};
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update("campaign", contentValues, "unitid = ? AND bid_token = ? AND bid_token IS NOT NULL", strArr);
        }
    }

    public final synchronized void b(long j7, String str) {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - j7), str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("campaign", "ts< ? and unitid= ? ", strArr);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e4.getLocalizedMessage());
            }
        }
    }

    public final synchronized void b(final List<CampaignEx> list, final String str) {
        if (list != null) {
            if (list.size() != 0) {
                new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.db.e.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            e.this.a((CampaignEx) it.next(), str, 0);
                        }
                    }
                }).start();
            }
        }
    }

    public final synchronized void d(String str, String str2) {
        try {
            try {
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e4.getLocalizedMessage());
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String str3 = "unitid = ?";
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            if (!TextUtils.isEmpty(str2)) {
                str3 = "unitid = ? AND bid_token != ?";
                arrayList.add(str2);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update("campaign", contentValues, (str3 + " AND is_bid_campaign = 1") + " AND bid_token IS NOT NULL", (String[]) arrayList.toArray(new String[0]));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized List<CampaignEx> b(String str, int i9, int i10, int i11) {
        ArrayList arrayList;
        String str2;
        try {
            arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(String.valueOf(i10));
            arrayList.add(String.valueOf(i11));
            str2 = "";
            if (i9 > 0) {
                str2 = " LIMIT ?";
                arrayList.add(String.valueOf(i9));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a("SELECT * FROM campaign WHERE unitid = ? AND level = ? AND adSource = ?".concat(str2), (String[]) arrayList.toArray(new String[0]));
    }

    public final synchronized void a(String str, List<CampaignEx> list, boolean z8) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    a(str, campaignEx, z8, campaignEx.getRequestId());
                }
            }
        }
    }

    public final synchronized void a(String str, List<CampaignEx> list, String str2, int i9) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && !TextUtils.isEmpty(str2)) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            try {
                for (CampaignEx campaignEx : list) {
                    if (campaignEx != null) {
                        String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(str2, Integer.valueOf(i9));
                        writableDatabase.update("campaign", contentValues, "unitid = ? AND id = ? AND request_id = ? ", strArr);
                    }
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e4.getLocalizedMessage());
                }
            }
        }
    }

    public final List<CampaignEx> b(String str, int i9, boolean z8) {
        ArrayList arrayList;
        String str2;
        String[] strArr;
        Cursor cursor = null;
        r1 = null;
        ArrayList arrayList2 = null;
        Cursor cursor2 = null;
        try {
            try {
                if (z8) {
                    str2 = "placement_id = ? AND ad_type = ? ";
                    strArr = new String[]{str, String.valueOf(i9)};
                } else {
                    str2 = "ad_type = ? ";
                    strArr = new String[]{String.valueOf(i9)};
                }
                Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM campaign WHERE ".concat(str2), strArr);
                if (rawQuery != null) {
                    try {
                        try {
                            if (rawQuery.getCount() > 0) {
                                arrayList = new ArrayList();
                                while (rawQuery.moveToNext()) {
                                    try {
                                        arrayList.add(a(rawQuery));
                                    } catch (Exception e4) {
                                        cursor = rawQuery;
                                        e = e4;
                                        ad.b("CampaignDao", e.getLocalizedMessage());
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        return arrayList;
                                    }
                                }
                                arrayList2 = arrayList;
                            }
                        } catch (Exception e9) {
                            cursor = rawQuery;
                            e = e9;
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        cursor2 = rawQuery;
                        th = th;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
                if (rawQuery == null) {
                    return arrayList2;
                }
                rawQuery.close();
                return arrayList2;
            } catch (Exception e10) {
                e = e10;
                arrayList = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void a(String str, List<CampaignEx> list, List<CampaignEx> list2, boolean z8) {
        if (getWritableDatabase() == null) {
            return;
        }
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (CampaignEx campaignEx : list) {
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("readyState", (Integer) 0);
                            String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                            getWritableDatabase().update("campaign", contentValues, z8 ? "unitid = ? AND id = ? AND request_id = ?  AND is_bid_campaign = 1" : "unitid = ? AND id = ? AND request_id = ?  AND is_bid_campaign = 0", strArr);
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("CampaignDao", e4.getLocalizedMessage());
                            }
                        }
                    }
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e9.getLocalizedMessage());
                }
            } finally {
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx2 : list2) {
                try {
                    if (campaignEx2.getLoadTimeoutState() == 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unitid");
                        sb.append(" = ? AND ");
                        sb.append("id");
                        sb.append(" = ? AND ");
                        sb.append("request_id");
                        sb.append(" = ? ");
                        String[] strArr2 = {str, campaignEx2.getId(), campaignEx2.getRequestId()};
                        if (z8) {
                            sb.append(" AND is_bid_campaign = 1");
                        } else {
                            sb.append(" AND is_bid_campaign = 0");
                        }
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("readyState", (Integer) 2);
                        getWritableDatabase().update("campaign", contentValues2, sb.toString(), strArr2);
                    }
                } catch (SQLException e10) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CampaignDao", e10.getLocalizedMessage());
                    }
                }
            }
        }
    }

    public final synchronized void a(String str, List<CampaignEx> list, String str2) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("local_request_id", str2);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, "unitid = ? AND id = ? AND request_id = ? ", new String[]{str, campaignEx.getId(), campaignEx.getRequestId()});
                        }
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CampaignDao", e4.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public final synchronized void a(String str, String str2) {
        String[] strArr;
        try {
            strArr = new String[]{str, str2};
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e4.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", "id = ? AND unitid = ? ", strArr);
    }

    public final synchronized void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] strArr = {str};
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("campaign", "unitid = ? AND readyState = 2", strArr);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e4.getLocalizedMessage());
            }
        }
    }

    public final synchronized void a(List<CampaignEx> list, String str) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 2);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, "unitid = ? AND id = ? AND request_id = ? ", strArr);
                        }
                    } catch (SQLException e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CampaignDao", e4.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public final synchronized void a(String str, String str2, boolean z8, String str3) {
        String[] strArr;
        try {
            try {
                strArr = new String[]{str, str2, z8 ? "1" : "0", str3};
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e4.getLocalizedMessage());
                }
            }
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update("campaign", contentValues, "id = ? AND unitid = ? AND is_bid_campaign = ? AND request_id = ? ", strArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(String str, String str2, int i9, int i10, boolean z8) {
        String[] strArr;
        String str3;
        try {
            try {
                strArr = new String[]{str, str2, String.valueOf(i9), String.valueOf(i10)};
                if (z8) {
                    str3 = "id = ? AND unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = 1";
                } else {
                    str3 = "id = ? AND unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = 0";
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e4.getLocalizedMessage());
                }
            }
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete("campaign", str3, strArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(String str, int i9, boolean z8) {
        String str2;
        String[] strArr;
        try {
            try {
                if (z8) {
                    str2 = "placement_id = ? AND ad_type = ? ";
                    strArr = new String[]{str, String.valueOf(i9)};
                } else {
                    str2 = "ad_type = " + i9;
                    strArr = new String[]{String.valueOf(i9)};
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e4.getLocalizedMessage());
                }
            }
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete("campaign", str2, strArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - 3600000)};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("campaign", "ts< ? AND ts>0", strArr);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e4.getLocalizedMessage());
            }
        }
    }

    public final synchronized void a(long j7, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = "(plctb>0 and (plctb* 1000+ts)< " + currentTimeMillis + " ) or (plctb<=0 and ts< " + (currentTimeMillis - j7) + " ) and unitid=?";
            String[] strArr = {str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("campaign", str2, strArr);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e4.getLocalizedMessage());
            }
        }
    }

    public final synchronized void a(List<CampaignEx> list, String str, String str2, int i9) {
        if (list != null) {
            if (list.size() != 0) {
                if (getWritableDatabase() == null) {
                    return;
                }
                Iterator<CampaignEx> it = list.iterator();
                while (it.hasNext()) {
                    a(it.next(), str, str2, i9);
                }
            }
        }
    }

    private synchronized long a(CampaignEx campaignEx, String str, String str2, int i9) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                if (campaignEx.getPv_urls() != null && campaignEx.getPv_urls().size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = campaignEx.getPv_urls().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    contentValues.put("pv_urls", jSONArray.toString());
                }
                contentValues.put("id", campaignEx.getId());
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                contentValues.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, str);
                contentValues.put("unitid", str2);
                contentValues.put("tab", Integer.valueOf(campaignEx.getTab()));
                contentValues.put(CampaignEx.JSON_KEY_PACKAGE_NAME, campaignEx.getPackageName());
                contentValues.put("app_name", campaignEx.getAppName());
                contentValues.put("app_desc", campaignEx.getAppDesc());
                contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
                contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
                contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
                contentValues.put(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
                contentValues.put("deeplink_url", campaignEx.getDeepLinkURL());
                contentValues.put(CampaignEx.JSON_KEY_USER_ACTIVATION, Boolean.toString(campaignEx.getUserActivation()));
                contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(campaignEx.getTimestamp()));
                contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
                contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
                contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
                contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
                contentValues.put("star", Double.valueOf(campaignEx.getRating()));
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
                contentValues.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(campaignEx.getCacheLevel()));
                contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
                contentValues.put("ad_call", campaignEx.getAdCall());
                contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
                contentValues.put("fc_b", Integer.valueOf(campaignEx.getFcb()));
                contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, campaignEx.getVideoUrlEncode());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Integer.valueOf(campaignEx.getVideoSize()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_LENGTHL, Integer.valueOf(campaignEx.getVideoLength()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, campaignEx.getVideoResolution());
                contentValues.put(CampaignEx.JSON_KEY_ENDCARD_CLICK, Integer.valueOf(campaignEx.getEndcard_click_result()));
                contentValues.put(CampaignEx.JSON_KEY_WATCH_MILE, Integer.valueOf(campaignEx.getWatchMile()));
                contentValues.put("advImp", campaignEx.getAdvImp());
                contentValues.put("bty", Integer.valueOf(campaignEx.getBty()));
                contentValues.put(CampaignEx.JSON_KEY_T_IMP, Integer.valueOf(campaignEx.getTImp()));
                contentValues.put(CampaignEx.JSON_KEY_GUIDELINES, campaignEx.getGuidelines());
                contentValues.put(CampaignEx.JSON_KEY_OFFER_TYPE, Integer.valueOf(campaignEx.getOfferType()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL, campaignEx.getHtmlUrl());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL, campaignEx.getEndScreenUrl());
                contentValues.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, Integer.valueOf(campaignEx.getRewardAmount()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_NAME, campaignEx.getRewardName());
                contentValues.put("reward_play_status", Integer.valueOf(campaignEx.getRewardPlayStatus()));
                contentValues.put("retarget", Integer.valueOf(campaignEx.getRetarget_offer()));
                contentValues.put("native_ad_tracking", campaignEx.getNativeVideoTrackingString());
                contentValues.put(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO, Integer.valueOf(campaignEx.getPlayable_ads_without_video()));
                contentValues.put(CampaignEx.ENDCARD_URL, campaignEx.getendcard_url());
                contentValues.put(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5, campaignEx.getVideoMD5Value());
                contentValues.put(CampaignEx.JSON_KEY_NV_T2, Integer.valueOf(campaignEx.getNvT2()));
                contentValues.put(CampaignEx.JSON_KEY_GIF_URL, campaignEx.getGifUrl());
                if (campaignEx.getRewardTemplateMode() != null) {
                    contentValues.put("reward_teamplate", campaignEx.getRewardTemplateMode().d());
                }
                contentValues.put("c_coi", Integer.valueOf(campaignEx.getClickTimeOutInterval()));
                contentValues.put(CampaignEx.JSON_KEY_C_UA, Integer.valueOf(campaignEx.getcUA()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_UA, Integer.valueOf(campaignEx.getImpUA()));
                contentValues.put(CampaignEx.JSON_KEY_JM_PD, Integer.valueOf(campaignEx.getJmPd()));
                contentValues.put("is_deleted", Integer.valueOf(campaignEx.getIsDeleted()));
                contentValues.put("is_click", Integer.valueOf(campaignEx.getIsClick()));
                contentValues.put("is_add_sucesful", Integer.valueOf(campaignEx.getIsAddSuccesful()));
                contentValues.put("short_ctime", String.valueOf(System.currentTimeMillis()));
                contentValues.put("ia_icon", campaignEx.getKeyIaIcon());
                contentValues.put("ia_url", campaignEx.getKeyIaUrl());
                contentValues.put("ia_rst", Integer.valueOf(campaignEx.getKeyIaRst()));
                contentValues.put("ia_ori", Integer.valueOf(campaignEx.getKeyIaOri()));
                contentValues.put("ad_type", Integer.valueOf(campaignEx.getAdType()));
                contentValues.put(CampaignEx.KEY_IA_EXT1, campaignEx.getIa_ext1());
                contentValues.put(CampaignEx.KEY_IA_EXT2, campaignEx.getIa_ext2());
                contentValues.put(CampaignEx.KEY_IS_DOWNLOAD, Integer.valueOf(campaignEx.getIsDownLoadZip()));
                contentValues.put(CampaignEx.KEY_IA_CACHE, campaignEx.getInteractiveCache());
                contentValues.put(CampaignEx.KEY_OC_TIME, Integer.valueOf(campaignEx.getOc_time()));
                contentValues.put(CampaignEx.KEY_OC_TYPE, Integer.valueOf(campaignEx.getOc_type()));
                contentValues.put(CampaignEx.KEY_T_LIST, campaignEx.getT_list());
                CampaignEx.a adchoice = campaignEx.getAdchoice();
                if (adchoice != null) {
                    contentValues.put(CampaignEx.KEY_ADCHOICE, adchoice.a());
                    contentValues.put("adchoice_size_height", Integer.valueOf(adchoice.e()));
                    contentValues.put("adchoice_size_width", Integer.valueOf(adchoice.f()));
                }
                contentValues.put(CampaignEx.JSON_KEY_PLCT, Long.valueOf(campaignEx.getPlct()));
                contentValues.put(CampaignEx.JSON_KEY_PLCTB, Long.valueOf(campaignEx.getPlctb()));
                contentValues.put(CampaignEx.JSON_KEY_C_C_TIME, Long.valueOf(campaignEx.getCandidateCacheTime()));
                contentValues.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getAdHtml());
                contentValues.put("ad_zip", campaignEx.getAdZip());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_URL, campaignEx.getBannerUrl());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_HTML, campaignEx.getBannerHtml());
                contentValues.put(CampaignEx.JSON_KEY_CREATIVE_ID, Long.valueOf(campaignEx.getCreativeId()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID, Long.valueOf(campaignEx.getVidCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_CREATIVE_ID, Long.valueOf(campaignEx.getEcCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_TEMP_ID, Long.valueOf(campaignEx.getEcTemplateId()));
                contentValues.put("is_bid_campaign", Boolean.valueOf(campaignEx.isBidCampaign()));
                contentValues.put("bid_token", campaignEx.getBidToken());
                contentValues.put(CampaignEx.JSON_KEY_MRAID, campaignEx.getMraid());
                contentValues.put("is_mraid_campaign", Boolean.valueOf(campaignEx.isMraid()));
                contentValues.put(CampaignEx.KEY_OMID, campaignEx.getOmid());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID, Integer.valueOf(campaignEx.getMof_tplid()));
                contentValues.put(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(campaignEx.getReady_rate()));
                contentValues.put(CampaignEx.JSON_KEY_EXT_DATA, campaignEx.getExt_data());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT, Integer.valueOf(campaignEx.getNscpt()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL, campaignEx.getMof_template_url());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA, campaignEx.getReq_ext_data());
                contentValues.put("readyState", Integer.valueOf(campaignEx.getReadyState()));
                contentValues.put("request_id", campaignEx.getRequestId());
                contentValues.put("n_request_id", campaignEx.getNRid());
                contentValues.put("local_request_id", campaignEx.getLocalRequestId());
                contentValues.put("n_local_request_id", campaignEx.getNLRid());
                contentValues.put("err_type_default_ad", Integer.valueOf(campaignEx.getTyped()));
                contentValues.put("err_reason_default_ad", campaignEx.getReasond());
                contentValues.put("load_timeout", Integer.valueOf(campaignEx.getLoadTimeoutState()));
                contentValues.put(CampaignEx.JSON_KEY_MAITVE, Integer.valueOf(campaignEx.getMaitve()));
                contentValues.put(CampaignEx.JSON_KEY_MAITVESRC, campaignEx.getMaitve_src());
                contentValues.put(CampaignEx.JSON_KEY_FLB, Integer.valueOf(campaignEx.getFlb()));
                contentValues.put(CampaignEx.JSON_KEY_FLB_SKIP_TIME, Integer.valueOf(campaignEx.getFlbSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD, Integer.valueOf(campaignEx.getCbd()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, Integer.valueOf(campaignEx.getVst()));
                contentValues.put(CampaignEx.JSON_KEY_USE_SKIP_TIME, Integer.valueOf(campaignEx.getUseSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_PROG_BAR, Integer.valueOf(campaignEx.getProgressBarShow()));
                contentValues.put("vcn", Integer.valueOf(campaignEx.getVcn()));
                contentValues.put("token_r", Integer.valueOf(campaignEx.getTokenRule()));
                contentValues.put("encrypt_p", campaignEx.getEncryptPrice());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE, Integer.valueOf(campaignEx.getVideoCheckType()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE, Integer.valueOf(campaignEx.getVideoCtnType()));
                contentValues.put(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE, campaignEx.getRsIgnoreCheckRuleString());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME, Integer.valueOf(campaignEx.getVideoCompleteTime()));
                contentValues.put(CampaignEx.JSON_KEY_TP_OFFER, Integer.valueOf(campaignEx.getTpOffer()));
                contentValues.put(CampaignEx.JSON_KEY_FAC, Integer.valueOf(campaignEx.getFac()));
                if (campaignEx.getAabEntity() != null) {
                    contentValues.put(CampaignEx.JSON_KEY_AAB, campaignEx.getAabEntity().toJson().toString());
                }
                contentValues.put(CampaignEx.JSON_KEY_PRIVACY_URL, campaignEx.getPrivacyUrl());
                contentValues.put("privacy_button_video", Integer.valueOf(campaignEx.getPrivacyButtonTemplateVisibility()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_REPORT_TYPE, Integer.valueOf(campaignEx.getImpReportType()));
                contentValues.put("auto_minicard", Integer.valueOf(campaignEx.getAutoShowStoreMiniCard()));
                contentValues.put("mincard_trigger_time", Integer.valueOf(campaignEx.getShowStoreMiniCardDelayTime()));
                return getWritableDatabase().insert("campaign", null, contentValues);
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e4.getLocalizedMessage());
                }
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long a(CampaignEx campaignEx, String str, int i9) {
        String[] strArr;
        String str2;
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", campaignEx.getId());
                if (campaignEx.getPv_urls() != null && campaignEx.getPv_urls().size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = campaignEx.getPv_urls().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    contentValues.put("pv_urls", jSONArray.toString());
                }
                contentValues.put("unitid", str);
                contentValues.put("request_id", campaignEx.getRequestId());
                contentValues.put("n_request_id", campaignEx.getNRid());
                contentValues.put("local_request_id", campaignEx.getLocalRequestId());
                contentValues.put("n_local_request_id", campaignEx.getNLRid());
                contentValues.put("err_type_default_ad", Integer.valueOf(campaignEx.getTyped()));
                contentValues.put("err_reason_default_ad", campaignEx.getReasond());
                contentValues.put("tab", Integer.valueOf(campaignEx.getTab()));
                contentValues.put(CampaignEx.JSON_KEY_PACKAGE_NAME, campaignEx.getPackageName());
                contentValues.put("app_name", campaignEx.getAppName());
                contentValues.put("app_desc", campaignEx.getAppDesc());
                contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
                contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
                contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
                contentValues.put(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
                contentValues.put("deeplink_url", campaignEx.getDeepLinkURL());
                contentValues.put(CampaignEx.JSON_KEY_USER_ACTIVATION, Boolean.toString(campaignEx.getUserActivation()));
                contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(campaignEx.getTimestamp()));
                contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
                contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
                contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
                contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
                contentValues.put("star", Double.valueOf(campaignEx.getRating()));
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
                contentValues.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(campaignEx.getCacheLevel()));
                contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
                contentValues.put("ad_call", campaignEx.getAdCall());
                contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
                contentValues.put("fc_b", Integer.valueOf(campaignEx.getFcb()));
                contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, campaignEx.getVideoUrlEncode());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Integer.valueOf(campaignEx.getVideoSize()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_LENGTHL, Integer.valueOf(campaignEx.getVideoLength()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, campaignEx.getVideoResolution());
                contentValues.put(CampaignEx.JSON_KEY_ENDCARD_CLICK, Integer.valueOf(campaignEx.getEndcard_click_result()));
                contentValues.put(CampaignEx.JSON_KEY_WATCH_MILE, Integer.valueOf(campaignEx.getWatchMile()));
                contentValues.put("advImp", campaignEx.getAdvImp());
                contentValues.put("bty", Integer.valueOf(campaignEx.getBty()));
                contentValues.put(CampaignEx.JSON_KEY_T_IMP, Integer.valueOf(campaignEx.getTImp()));
                contentValues.put(CampaignEx.JSON_KEY_GUIDELINES, campaignEx.getGuidelines());
                contentValues.put(CampaignEx.JSON_KEY_OFFER_TYPE, Integer.valueOf(campaignEx.getOfferType()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL, campaignEx.getHtmlUrl());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL, campaignEx.getEndScreenUrl());
                contentValues.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, Integer.valueOf(campaignEx.getRewardAmount()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_NAME, campaignEx.getRewardName());
                contentValues.put("reward_play_status", Integer.valueOf(campaignEx.getRewardPlayStatus()));
                contentValues.put("retarget", Integer.valueOf(campaignEx.getRetarget_offer()));
                contentValues.put("native_ad_tracking", campaignEx.getNativeVideoTrackingString());
                contentValues.put(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO, Integer.valueOf(campaignEx.getPlayable_ads_without_video()));
                contentValues.put(CampaignEx.ENDCARD_URL, campaignEx.getendcard_url());
                contentValues.put(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5, campaignEx.getVideoMD5Value());
                contentValues.put(CampaignEx.JSON_KEY_NV_T2, Integer.valueOf(campaignEx.getNvT2()));
                contentValues.put(CampaignEx.JSON_KEY_GIF_URL, campaignEx.getGifUrl());
                if (campaignEx.getRewardTemplateMode() != null) {
                    contentValues.put("reward_teamplate", campaignEx.getRewardTemplateMode().d());
                }
                contentValues.put("c_coi", Integer.valueOf(campaignEx.getClickTimeOutInterval()));
                contentValues.put(CampaignEx.JSON_KEY_C_UA, Integer.valueOf(campaignEx.getcUA()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_UA, Integer.valueOf(campaignEx.getImpUA()));
                contentValues.put(CampaignEx.JSON_KEY_JM_PD, Integer.valueOf(campaignEx.getJmPd()));
                contentValues.put("is_deleted", Integer.valueOf(campaignEx.getIsDeleted()));
                contentValues.put("is_click", Integer.valueOf(campaignEx.getIsClick()));
                contentValues.put("is_add_sucesful", Integer.valueOf(campaignEx.getIsAddSuccesful()));
                contentValues.put("short_ctime", String.valueOf(System.currentTimeMillis()));
                contentValues.put("ia_icon", campaignEx.getKeyIaIcon());
                contentValues.put("ia_url", campaignEx.getKeyIaUrl());
                contentValues.put("ia_rst", Integer.valueOf(campaignEx.getKeyIaRst()));
                contentValues.put("ia_ori", Integer.valueOf(campaignEx.getKeyIaOri()));
                contentValues.put("ad_type", Integer.valueOf(campaignEx.getAdType()));
                contentValues.put(CampaignEx.KEY_IA_EXT1, campaignEx.getIa_ext1());
                contentValues.put(CampaignEx.KEY_IA_EXT2, campaignEx.getIa_ext2());
                contentValues.put(CampaignEx.KEY_IS_DOWNLOAD, Integer.valueOf(campaignEx.getIsDownLoadZip()));
                contentValues.put(CampaignEx.KEY_IA_CACHE, campaignEx.getInteractiveCache());
                contentValues.put(CampaignEx.KEY_OC_TIME, Integer.valueOf(campaignEx.getOc_time()));
                contentValues.put(CampaignEx.KEY_OC_TYPE, Integer.valueOf(campaignEx.getOc_type()));
                contentValues.put(CampaignEx.KEY_T_LIST, campaignEx.getT_list());
                CampaignEx.a adchoice = campaignEx.getAdchoice();
                if (adchoice != null) {
                    contentValues.put(CampaignEx.KEY_ADCHOICE, adchoice.a());
                    contentValues.put("adchoice_size_height", Integer.valueOf(adchoice.e()));
                    contentValues.put("adchoice_size_width", Integer.valueOf(adchoice.f()));
                }
                contentValues.put(CampaignEx.JSON_KEY_PLCT, Long.valueOf(campaignEx.getPlct()));
                contentValues.put(CampaignEx.JSON_KEY_PLCTB, Long.valueOf(campaignEx.getPlctb()));
                contentValues.put(CampaignEx.JSON_KEY_C_C_TIME, Long.valueOf(campaignEx.getCandidateCacheTime()));
                contentValues.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getAdHtml());
                contentValues.put("ad_zip", campaignEx.getAdZip());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_URL, campaignEx.getBannerUrl());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_HTML, campaignEx.getBannerHtml());
                contentValues.put(CampaignEx.JSON_KEY_CREATIVE_ID, Long.valueOf(campaignEx.getCreativeId()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID, Long.valueOf(campaignEx.getVidCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_CREATIVE_ID, Long.valueOf(campaignEx.getEcCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_TEMP_ID, Long.valueOf(campaignEx.getEcTemplateId()));
                contentValues.put("is_bid_campaign", Boolean.valueOf(campaignEx.isBidCampaign()));
                contentValues.put("bid_token", campaignEx.getBidToken());
                contentValues.put(CampaignEx.JSON_KEY_MRAID, campaignEx.getMraid());
                contentValues.put("is_mraid_campaign", Boolean.valueOf(campaignEx.isMraid()));
                contentValues.put(CampaignEx.KEY_OMID, campaignEx.getOmid());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID, Integer.valueOf(campaignEx.getMof_tplid()));
                contentValues.put(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(campaignEx.getReady_rate()));
                contentValues.put(CampaignEx.JSON_KEY_EXT_DATA, campaignEx.getExt_data());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT, Integer.valueOf(campaignEx.getNscpt()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL, campaignEx.getMof_template_url());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA, campaignEx.getReq_ext_data());
                contentValues.put("readyState", Integer.valueOf(campaignEx.getReadyState()));
                contentValues.put("load_timeout", Integer.valueOf(campaignEx.getLoadTimeoutState()));
                contentValues.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, campaignEx.getPlacementId());
                contentValues.put(CampaignEx.JSON_KEY_MAITVE, Integer.valueOf(campaignEx.getMaitve()));
                contentValues.put(CampaignEx.JSON_KEY_MAITVESRC, campaignEx.getMaitve_src());
                contentValues.put(CampaignEx.JSON_KEY_FLB, Integer.valueOf(campaignEx.getFlb()));
                contentValues.put(CampaignEx.JSON_KEY_FLB_SKIP_TIME, Integer.valueOf(campaignEx.getFlbSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD, Integer.valueOf(campaignEx.getCbd()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, Integer.valueOf(campaignEx.getVst()));
                contentValues.put(CampaignEx.JSON_KEY_USE_SKIP_TIME, Integer.valueOf(campaignEx.getUseSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_PROG_BAR, Integer.valueOf(campaignEx.getProgressBarShow()));
                contentValues.put("vcn", Integer.valueOf(campaignEx.getVcn()));
                contentValues.put("token_r", Integer.valueOf(campaignEx.getTokenRule()));
                contentValues.put("encrypt_p", campaignEx.getEncryptPrice());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE, Integer.valueOf(campaignEx.getVideoCheckType()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE, Integer.valueOf(campaignEx.getVideoCtnType()));
                contentValues.put(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE, campaignEx.getRsIgnoreCheckRuleString());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME, Integer.valueOf(campaignEx.getVideoCompleteTime()));
                contentValues.put(CampaignEx.JSON_KEY_TP_OFFER, Integer.valueOf(campaignEx.getTpOffer()));
                contentValues.put(CampaignEx.JSON_KEY_FAC, Integer.valueOf(campaignEx.getFac()));
                contentValues.put(CampaignEx.JSON_KEY_PRIVACY_URL, campaignEx.getPrivacyUrl());
                contentValues.put("privacy_button_video", Integer.valueOf(campaignEx.getPrivacyButtonTemplateVisibility()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_REPORT_TYPE, Integer.valueOf(campaignEx.getImpReportType()));
                if (campaignEx.getAabEntity() != null) {
                    contentValues.put(CampaignEx.JSON_KEY_AAB, campaignEx.getAabEntity().toJson().toString());
                }
                contentValues.put("auto_minicard", Integer.valueOf(campaignEx.getAutoShowStoreMiniCard()));
                contentValues.put("mincard_trigger_time", Integer.valueOf(campaignEx.getShowStoreMiniCardDelayTime()));
                if (a(campaignEx.getId(), campaignEx.getTab(), str, i9, campaignEx.getType(), campaignEx.isBidCampaign())) {
                    if (campaignEx.isBidCampaign()) {
                        str2 = "unitid = ? AND is_bid_campaign = 1";
                        strArr = new String[]{str};
                    } else {
                        strArr = new String[]{campaignEx.getId(), str};
                        str2 = "id = ? AND unitid = ? AND is_bid_campaign = 0";
                    }
                    return getWritableDatabase().update("campaign", contentValues, str2, strArr);
                }
                return getWritableDatabase().insert("campaign", null, contentValues);
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e4.getLocalizedMessage());
                }
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int a(String str, long j7) {
        try {
            try {
                com.mbridge.msdk.c.g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                if (b8 == null) {
                    com.mbridge.msdk.c.h.a();
                    b8 = com.mbridge.msdk.c.i.a();
                }
                long aa = b8.aa() * 1000;
                a(aa, str);
                List<CampaignEx> a6 = a(str, 0, 0, 1, false);
                if (a6 != null && !a6.isEmpty()) {
                    Iterator<CampaignEx> it = a6.iterator();
                    while (it.hasNext()) {
                        if (!it.next().isSpareOffer(j7, aa)) {
                            return 0;
                        }
                    }
                    return 1;
                }
                return -1;
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e4.getLocalizedMessage());
                }
                return 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean a(String str, int i9, String str2, int i10, int i11, boolean z8) {
        String[] strArr;
        String str3;
        try {
            if (z8) {
                str3 = "SELECT id FROM campaign WHERE unitid = ? AND is_bid_campaign = 1";
                strArr = new String[]{str2};
            } else {
                strArr = new String[]{str, String.valueOf(i9), str2, String.valueOf(i10), String.valueOf(i11)};
                str3 = "SELECT id FROM campaign WHERE id= ? AND tab= ? AND unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 0";
            }
            Cursor rawQuery = getReadableDatabase().rawQuery(str3, strArr);
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final List<CampaignEx> a(String str, int i9, int i10, int i11) {
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(i10));
        arrayList.add(String.valueOf(i11));
        if (i9 > 0) {
            arrayList.add(String.valueOf(i9));
            str2 = " LIMIT ?";
        } else {
            str2 = "";
        }
        return a("SELECT * FROM campaign WHERE unitid = ? AND level = ? AND adSource = ?".concat(str2), (String[]) arrayList.toArray(new String[0]));
    }

    public final synchronized List<CampaignEx> a(String str, int i9, int i10, int i11, boolean z8) {
        ArrayList arrayList;
        String str2;
        String str3;
        try {
            arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(String.valueOf(i10));
            arrayList.add(String.valueOf(i11));
            if (z8) {
                str2 = " WHERE unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 1";
            } else {
                str2 = " WHERE unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 0";
            }
            str3 = "";
            if (i9 > 0) {
                str3 = " LIMIT ?";
                arrayList.add(String.valueOf(i9));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a("SELECT * FROM campaign" + str2 + str3, (String[]) arrayList.toArray(new String[0]));
    }

    public final synchronized List<CampaignEx> a(String str, int i9, int i10, int i11, String str2) {
        String str3;
        ArrayList arrayList;
        String str4;
        try {
            str3 = " WHERE unitid = ?  AND level = ?  AND adSource = ?  AND is_bid_campaign = 1 AND readyState = '0'";
            arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(String.valueOf(i10));
            arrayList.add(String.valueOf(i11));
            if (!TextUtils.isEmpty(str2)) {
                str3 = " WHERE unitid = ?  AND level = ?  AND adSource = ?  AND is_bid_campaign = 1 AND readyState = '0' AND request_id = ? ";
                arrayList.add(str2);
            }
            str4 = "";
            if (i9 > 0) {
                str4 = " LIMIT ?";
                arrayList.add(String.valueOf(i9));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a("SELECT * FROM campaign" + (str3 + " order by ts ASC") + str4, (String[]) arrayList.toArray(new String[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x06e6, code lost:
    
        if (r8 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x06cf, code lost:
    
        if (r8 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x06d1, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x06ea, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x06ed A[Catch: all -> 0x06cd, TRY_ENTER, TryCatch #2 {, blocks: (B:39:0x06c8, B:7:0x06d1, B:53:0x06ed, B:54:0x06f0), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> a(java.lang.String r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instructions count: 1779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.a(java.lang.String, java.lang.String[]):java.util.List");
    }

    private CampaignEx a(Cursor cursor) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        CampaignEx campaignEx = new CampaignEx();
        try {
            String string = cursor.getString(cursor.getColumnIndex("pv_urls"));
            if (!TextUtils.isEmpty(string)) {
                JSONArray jSONArray = new JSONArray(string);
                ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    arrayList.add(jSONArray.getString(i9));
                }
                campaignEx.setPv_urls(arrayList);
            }
        } catch (JSONException e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e4.getLocalizedMessage());
            }
        }
        campaignEx.setId(cursor.getString(cursor.getColumnIndex("id")));
        campaignEx.setTab(cursor.getInt(cursor.getColumnIndex("tab")));
        campaignEx.setPackageName(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_PACKAGE_NAME)));
        campaignEx.setAppName(cursor.getString(cursor.getColumnIndex("app_name")));
        campaignEx.setAppDesc(cursor.getString(cursor.getColumnIndex("app_desc")));
        campaignEx.setSize(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_APP_SIZE)));
        campaignEx.setImageSize(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_SIZE)));
        campaignEx.setIconUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_ICON_URL)));
        campaignEx.setImageUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_URL)));
        campaignEx.setImpressionURL(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMPRESSION_URL)));
        campaignEx.setNoticeUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_NOTICE_URL)));
        campaignEx.setClickURL(cursor.getString(cursor.getColumnIndex(DownloadModel.DOWNLOAD_URL)));
        campaignEx.setWtick(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK)));
        campaignEx.setDeepLinkUrl(cursor.getString(cursor.getColumnIndex("deeplink_url")));
        campaignEx.setUserActivation(Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_USER_ACTIVATION))));
        campaignEx.setOnlyImpressionURL(cursor.getString(cursor.getColumnIndex("only_impression")));
        campaignEx.setTemplate(cursor.getInt(cursor.getColumnIndex("template")));
        campaignEx.setLandingType(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_LANDING_TYPE)));
        campaignEx.setLinkType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_LINK_TYPE)));
        campaignEx.setClick_mode(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_CLICK_MODE)));
        campaignEx.setRating(Double.parseDouble(cursor.getString(cursor.getColumnIndex("star"))));
        campaignEx.setNumberRating(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NUMBER_RATING)));
        campaignEx.setClickInterval(cursor.getInt(cursor.getColumnIndex("cti")));
        campaignEx.setTimestamp(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_ST_TS)));
        campaignEx.setCacheLevel(cursor.getInt(cursor.getColumnIndex(AppLovinEventTypes.USER_COMPLETED_LEVEL)));
        campaignEx.setAdCall(cursor.getString(cursor.getColumnIndex("ad_call")));
        campaignEx.setFcb(cursor.getInt(cursor.getColumnIndex("fc_b")));
        campaignEx.setAd_url_list(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AD_URL_LIST)));
        campaignEx.setVideoLength(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_LENGTHL)));
        campaignEx.setVideoSize(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_SIZE)));
        campaignEx.setVideoResolution(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_RESOLUTION)));
        campaignEx.setEndcard_click_result(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_ENDCARD_CLICK)));
        campaignEx.setVideoUrlEncode(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_URL)));
        campaignEx.setWatchMile(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_WATCH_MILE)));
        campaignEx.setTImp(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_T_IMP)));
        campaignEx.setBty(cursor.getInt(cursor.getColumnIndex("bty")));
        campaignEx.setAdvImp(cursor.getString(cursor.getColumnIndex("advImp")));
        campaignEx.setLocalRequestId(cursor.getString(cursor.getColumnIndex("local_request_id")));
        campaignEx.setNRid(cursor.getString(cursor.getColumnIndex("n_request_id")));
        campaignEx.setNLRid(cursor.getString(cursor.getColumnIndex("n_local_request_id")));
        campaignEx.setTyped(cursor.getInt(cursor.getColumnIndex("err_type_default_ad")));
        campaignEx.setReasond(cursor.getString(cursor.getColumnIndex("err_reason_default_ad")));
        campaignEx.setGuidelines(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GUIDELINES)));
        campaignEx.setOfferType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_OFFER_TYPE)));
        campaignEx.setHtmlUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL)));
        campaignEx.setGuidelines(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GUIDELINES)));
        campaignEx.setHtmlUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL)));
        campaignEx.setEndScreenUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL)));
        campaignEx.setRewardName(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_NAME)));
        campaignEx.setRewardAmount(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_AMOUNT)));
        campaignEx.setRewardPlayStatus(cursor.getInt(cursor.getColumnIndex("reward_play_status")));
        campaignEx.setRetarget_offer(cursor.getInt(cursor.getColumnIndex("retarget")));
        campaignEx.setCampaignUnitId(cursor.getString(cursor.getColumnIndex("unitid")));
        campaignEx.setNativeVideoTracking(CampaignEx.TrackingStr2Object(cursor.getString(cursor.getColumnIndex("native_ad_tracking"))));
        campaignEx.setNativeVideoTrackingString(cursor.getString(cursor.getColumnIndex("native_ad_tracking")));
        campaignEx.setVideo_end_type(cursor.getInt(cursor.getColumnIndex(CampaignEx.VIDEO_END_TYPE)));
        campaignEx.setendcard_url(cursor.getString(cursor.getColumnIndex(CampaignEx.ENDCARD_URL)));
        campaignEx.setPlayable_ads_without_video(cursor.getInt(cursor.getColumnIndex(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO)));
        campaignEx.setMof_template_url(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL)));
        campaignEx.setMof_tplid(cursor.getInt(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID)));
        campaignEx.setRewardTemplateMode(CampaignEx.c.a(cursor.getString(cursor.getColumnIndex("reward_teamplate"))));
        campaignEx.setVideoMD5Value(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5)));
        campaignEx.setGifUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GIF_URL)));
        campaignEx.setNvT2(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NV_T2)));
        campaignEx.setClickTimeOutInterval(cursor.getInt(cursor.getColumnIndex("c_coi")));
        campaignEx.setcUA(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_C_UA)));
        campaignEx.setImpUA(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMP_UA)));
        campaignEx.setJmPd(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_JM_PD)));
        campaignEx.setIsDeleted(cursor.getInt(cursor.getColumnIndex("is_deleted")));
        campaignEx.setIsClick(cursor.getInt(cursor.getColumnIndex("is_click")));
        campaignEx.setIsAddSuccesful(cursor.getInt(cursor.getColumnIndex("is_add_sucesful")));
        campaignEx.setIsDownLoadZip(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_IS_DOWNLOAD)));
        campaignEx.setInteractiveCache(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_CACHE)));
        campaignEx.setKeyIaOri(cursor.getInt(cursor.getColumnIndex("ia_ori")));
        campaignEx.setAdType(cursor.getInt(cursor.getColumnIndex("ad_type")));
        campaignEx.setFac(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FAC)));
        campaignEx.setTpOffer(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_TP_OFFER)));
        campaignEx.setIa_ext1(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_EXT1)));
        campaignEx.setIa_ext2(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_EXT2)));
        campaignEx.setKeyIaRst(cursor.getInt(cursor.getColumnIndex("ia_rst")));
        campaignEx.setKeyIaUrl(cursor.getString(cursor.getColumnIndex("ia_url")));
        campaignEx.setKeyIaIcon(cursor.getString(cursor.getColumnIndex("ia_icon")));
        campaignEx.setOc_time(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_OC_TIME)));
        campaignEx.setOc_type(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_OC_TYPE)));
        campaignEx.setT_list(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_T_LIST)));
        campaignEx.setGhId(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_GH_ID)));
        campaignEx.setGhPath(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_GH_PATH)));
        campaignEx.setBindId(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_BIND_ID)));
        String string2 = cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_ADCHOICE));
        if (!TextUtils.isEmpty(string2)) {
            campaignEx.setAdchoice(CampaignEx.a.a(string2));
        }
        campaignEx.setAdchoiceSizeHeight(cursor.getInt(cursor.getColumnIndex("adchoice_size_height")));
        campaignEx.setAdchoiceSizeWidth(cursor.getInt(cursor.getColumnIndex("adchoice_size_width")));
        campaignEx.setPlct(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCT)));
        campaignEx.setPlctb(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCTB)));
        campaignEx.setCandidateCacheTime(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_C_C_TIME)));
        campaignEx.setAdZip(cursor.getString(cursor.getColumnIndex("ad_zip")));
        campaignEx.setAdHtml(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AD_HTML)));
        campaignEx.setBannerUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_BANNER_URL)));
        campaignEx.setBannerHtml(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_BANNER_HTML)));
        campaignEx.setCreativeId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_CREATIVE_ID)));
        campaignEx.setVidCrtvId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID)));
        campaignEx.setEcCrtvId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_EC_CREATIVE_ID)));
        campaignEx.setEcTemplateId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_EC_TEMP_ID)));
        campaignEx.setIsBidCampaign(cursor.getInt(cursor.getColumnIndex("is_bid_campaign")) == 1);
        campaignEx.setBidToken(cursor.getString(cursor.getColumnIndex("bid_token")));
        campaignEx.setMraid(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_MRAID)));
        campaignEx.setIsMraid(cursor.getInt(cursor.getColumnIndex("is_mraid_campaign")) == 1);
        campaignEx.setOmid(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_OMID)));
        campaignEx.setReady_rate(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_READY_RATE)));
        campaignEx.setExt_data(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_EXT_DATA)));
        campaignEx.setNscpt(cursor.getInt(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT)));
        campaignEx.setReq_ext_data(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA)));
        campaignEx.setReadyState(cursor.getInt(cursor.getColumnIndex("readyState")));
        campaignEx.setLoadTimeoutState(cursor.getInt(cursor.getColumnIndex("load_timeout")));
        campaignEx.setPlacementId(cursor.getString(cursor.getColumnIndex(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER)));
        campaignEx.setMaitve(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_MAITVE)));
        campaignEx.setMaitve_src(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_MAITVESRC)));
        campaignEx.setFlb(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FLB)));
        campaignEx.setFlbSkipTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FLB_SKIP_TIME)));
        campaignEx.setCbd(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD)));
        campaignEx.setVst(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST)));
        campaignEx.setUseSkipTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_USE_SKIP_TIME)));
        campaignEx.setProgressBarShow(cursor.getColumnIndex(CampaignEx.JSON_KEY_PROG_BAR));
        campaignEx.setAdSpaceT(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T)));
        campaignEx.setVcn(cursor.getInt(cursor.getColumnIndex("vcn")));
        campaignEx.setTokenRule(cursor.getInt(cursor.getColumnIndex("token_r")));
        campaignEx.setEncryptPrice(cursor.getString(cursor.getColumnIndex("encrypt_p")));
        campaignEx.setVideoCheckType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE)));
        campaignEx.setVideoCtnType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE)));
        campaignEx.setRsIgnoreCheckRuleByString(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE)));
        campaignEx.setVideoCompleteTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME)));
        campaignEx.setAabEntity(AabEntity.parser(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AAB))));
        campaignEx.setPrivacyUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_PRIVACY_URL)));
        campaignEx.setPrivacyButtonTemplateVisibility(cursor.getInt(cursor.getColumnIndex("privacy_button_video")));
        campaignEx.setImpReportType(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMP_REPORT_TYPE));
        campaignEx.setAutoShowStoreMiniCard(cursor.getInt(cursor.getColumnIndex("auto_minicard")));
        campaignEx.setShowStoreMiniCardDelayTime(cursor.getInt(cursor.getColumnIndex("mincard_trigger_time")));
        return campaignEx;
    }
}
