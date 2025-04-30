package com.mbridge.msdk.mbsignalcommon.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16646a = "d";
    public static int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f16647c = 1;

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
                        j a6 = j.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        if (a6 != null) {
                            if (!a6.b(CampaignEx.this.getId())) {
                                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                                gVar.a(CampaignEx.this.getId());
                                gVar.b(CampaignEx.this.getFca());
                                gVar.c(CampaignEx.this.getFcb());
                                gVar.a(0);
                                gVar.d(1);
                                gVar.a(System.currentTimeMillis());
                                a6.a(gVar);
                            } else {
                                a6.a(CampaignEx.this.getId());
                            }
                        }
                        d.a(CampaignEx.this.getCampaignUnitId(), CampaignEx.this);
                    } catch (Throwable th) {
                        ad.b(d.f16646a, th.getMessage(), th);
                    }
                }
            }).start();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", b);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", "");
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject3);
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception e4) {
                a(obj, e4.getMessage());
                ad.a(f16646a, e4.getMessage());
            }
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    public static String a(float f9, float f10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15682h, ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), f9));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15683i, ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), f10));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.m, 0);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15685k, com.mbridge.msdk.foundation.controller.c.m().c().getResources().getConfiguration().orientation);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.l, ai.d(com.mbridge.msdk.foundation.controller.c.m().c()));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f15684j, jSONObject2);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static String a(int i9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i9);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return "";
            }
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
        } catch (Throwable unused) {
            ad.b(f16646a, "code to string is error");
            return "";
        }
    }

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f16647c);
            jSONObject.put("message", str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e4) {
            ad.a(f16646a, e4.getMessage());
        }
    }

    public static /* synthetic */ void a(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.a.b.b == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.a.b.a(str, campaignEx, "banner");
    }
}
