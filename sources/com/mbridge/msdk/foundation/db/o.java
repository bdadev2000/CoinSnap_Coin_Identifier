package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import com.vungle.ads.internal.presenter.q;
import java.net.URLEncoder;

/* loaded from: classes4.dex */
public class o extends a<com.mbridge.msdk.foundation.entity.n> {
    private static final String a = "com.mbridge.msdk.foundation.db.o";

    /* renamed from: b, reason: collision with root package name */
    private static o f13134b;

    private o(f fVar) {
        super(fVar);
    }

    public static o a(f fVar) {
        if (f13134b == null) {
            synchronized (o.class) {
                if (f13134b == null) {
                    f13134b = new o(fVar);
                }
            }
        }
        return f13134b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r1 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int a() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "select count(*) from reward_report"
            android.database.sqlite.SQLiteDatabase r3 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            android.database.Cursor r1 = r3.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            if (r1 == 0) goto L19
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            if (r2 == 0) goto L19
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
        L19:
            if (r1 == 0) goto L28
        L1b:
            r1.close()     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L30
            goto L28
        L1f:
            r0 = move-exception
            goto L2a
        L21:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L28
            goto L1b
        L28:
            monitor-exit(r4)
            return r0
        L2a:
            if (r1 == 0) goto L2f
            r1.close()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L30
        L2f:
            throw r0     // Catch: java.lang.Throwable -> L30
        L30:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.o.a():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0344 A[Catch: Exception -> 0x0350, all -> 0x0353, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0350, blocks: (B:40:0x0344, B:15:0x032d), top: B:5:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x034c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.n> a(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.o.a(java.lang.String):java.util.List");
    }

    public final synchronized long a(com.mbridge.msdk.foundation.entity.n nVar) {
        if (nVar != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("key", nVar.a());
                contentValues.put("networkType", Integer.valueOf(nVar.k()));
                contentValues.put("network_str", nVar.l());
                contentValues.put("isCompleteView", Integer.valueOf(nVar.w()));
                contentValues.put("watchedMillis", Integer.valueOf(nVar.x()));
                contentValues.put(q.VIDEO_LENGTH, Integer.valueOf(nVar.p()));
                if (!TextUtils.isEmpty(nVar.r())) {
                    contentValues.put("offerUrl", nVar.r());
                }
                if (!TextUtils.isEmpty(nVar.h())) {
                    contentValues.put("reason", URLEncoder.encode(nVar.h(), "utf-8"));
                }
                contentValues.put("result", Integer.valueOf(nVar.m()));
                contentValues.put("duration", nVar.n());
                contentValues.put("videoSize", Long.valueOf(nVar.o()));
                contentValues.put("type", nVar.t());
                String s5 = nVar.s();
                if (!TextUtils.isEmpty(s5)) {
                    contentValues.put(CampaignEx.ENDCARD_URL, s5);
                }
                String q10 = nVar.q();
                if (!TextUtils.isEmpty(q10)) {
                    contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, q10);
                }
                String f10 = nVar.f();
                if (!TextUtils.isEmpty(f10)) {
                    contentValues.put("rid", f10);
                }
                String g10 = nVar.g();
                if (!TextUtils.isEmpty(g10)) {
                    contentValues.put("rid_n", g10);
                }
                String z10 = nVar.z();
                if (!TextUtils.isEmpty(z10)) {
                    contentValues.put("template_url", z10);
                }
                String v10 = nVar.v();
                if (!TextUtils.isEmpty(v10)) {
                    contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, v10);
                }
                String d10 = nVar.d();
                if (!TextUtils.isEmpty(d10)) {
                    contentValues.put("ad_type", URLEncoder.encode(d10, "utf-8"));
                }
                contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, nVar.c());
                contentValues.put("campaignId", nVar.e());
                if ("2000039".equals(nVar.a())) {
                    String a10 = com.mbridge.msdk.foundation.entity.n.a(nVar);
                    if (an.b(a10)) {
                        contentValues.put("h5_click_data", a10);
                    }
                }
                String b3 = nVar.b();
                if (!TextUtils.isEmpty(b3)) {
                    contentValues.put("resource_type", URLEncoder.encode(b3, "utf-8"));
                }
                String j3 = nVar.j();
                if (!TextUtils.isEmpty(j3)) {
                    contentValues.put("device_id", URLEncoder.encode(j3, "utf-8"));
                }
                String i10 = nVar.i();
                if (!TextUtils.isEmpty(i10)) {
                    contentValues.put("creative", URLEncoder.encode(i10, "utf-8"));
                }
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(nVar.u()));
                return getWritableDatabase().insert("reward_report", null, contentValues);
            } catch (Exception e2) {
                e2.printStackTrace();
                ad.b(a, e2.getMessage());
            }
        }
        return -1L;
    }
}
