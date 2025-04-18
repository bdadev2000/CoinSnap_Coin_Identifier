package com.mbridge.msdk.mbsignalcommon.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d {
    public static final String a = "d";

    /* renamed from: b, reason: collision with root package name */
    public static int f14119b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f14120c = 1;

    public static void a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            final CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject);
            if (parseCampaignWithBackData == null) {
                a(obj, "data camapign is empty");
                return;
            }
            new Thread(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.communication.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        j a10 = j.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        if (a10 != null) {
                            if (!a10.b(CampaignEx.this.getId())) {
                                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                                gVar.a(CampaignEx.this.getId());
                                gVar.b(CampaignEx.this.getFca());
                                gVar.c(CampaignEx.this.getFcb());
                                gVar.a(0);
                                gVar.d(1);
                                gVar.a(System.currentTimeMillis());
                                a10.a(gVar);
                            } else {
                                a10.a(CampaignEx.this.getId());
                            }
                        }
                        d.a(CampaignEx.this.getCampaignUnitId(), CampaignEx.this);
                    } catch (Throwable th2) {
                        ad.b(d.a, th2.getMessage(), th2);
                    }
                }
            }).start();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", f14119b);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", "");
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject3);
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception e2) {
                a(obj, e2.getMessage());
                ad.a(a, e2.getMessage());
            }
        } catch (Throwable th2) {
            a(obj, th2.getMessage());
        }
    }

    public static String a(float f10, float f11) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13277h, ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), f10));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13278i, ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), f11));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13282m, 0);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13280k, com.mbridge.msdk.foundation.controller.c.m().c().getResources().getConfiguration().orientation);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13281l, ai.d(com.mbridge.msdk.foundation.controller.c.m().c()));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f13279j, jSONObject2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            ad.b(a, "code to string is error");
            return "";
        }
    }

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f14120c);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            ad.a(a, e2.getMessage());
        }
    }

    public static /* synthetic */ void a(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.a.b.f13297b == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.a.b.a(str, campaignEx, "banner");
    }
}
