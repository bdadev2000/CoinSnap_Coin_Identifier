package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.mediation.ads.e;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a implements b {

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Context> f15255b;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f15256c;

    /* renamed from: d, reason: collision with root package name */
    private String f15257d;

    /* renamed from: e, reason: collision with root package name */
    private String f15258e;

    /* renamed from: f, reason: collision with root package name */
    private int f15259f;

    /* renamed from: g, reason: collision with root package name */
    private int f15260g;

    /* renamed from: i, reason: collision with root package name */
    private int f15262i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.splash.d.a f15263j;

    /* renamed from: k, reason: collision with root package name */
    private SplashExpandDialog f15264k;
    protected String a = "SplashSignalCommunicationImpl";

    /* renamed from: h, reason: collision with root package name */
    private int f15261h = 5;

    public a(Context context, String str, String str2) {
        this.f15258e = str;
        this.f15257d = str2;
        this.f15255b = new WeakReference<>(context);
    }

    public final void a(Context context) {
        this.f15255b = new WeakReference<>(context);
    }

    public final void b(int i10) {
        this.f15261h = i10;
    }

    public final void c(int i10) {
        this.f15262i = i10;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        ad.b(this.a, "close");
        try {
            com.mbridge.msdk.splash.d.a aVar = this.f15263j;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable th2) {
            ad.b(this.a, "close", th2);
        }
    }

    public final void d(Object obj, String str) {
        CampaignEx campaignEx;
        ad.b(this.a, "install");
        try {
            List<CampaignEx> list = this.f15256c;
            if (list == null) {
                return;
            }
            if (list != null && list.size() > 0) {
                campaignEx = this.f15256c.get(0);
            } else {
                campaignEx = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject campaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        campaignToJsonObject.put(next, jSONObject.getString(next));
                    }
                    CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(campaignToJsonObject);
                    String optString = campaignToJsonObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                    if (!TextUtils.isEmpty(optString)) {
                        parseCampaignWithBackData.setCampaignUnitId(optString);
                    }
                    campaignEx = parseCampaignWithBackData;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                com.mbridge.msdk.splash.d.a aVar = this.f15263j;
                if (aVar != null) {
                    aVar.a(campaignEx);
                }
            }
        } catch (Throwable th2) {
            ad.b(this.a, CampaignEx.JSON_NATIVE_VIDEO_CLICK, th2);
        }
    }

    public final void e(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        ad.b(this.a, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (!TextUtils.isEmpty(str)) {
            if (c10 == null) {
                try {
                    if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                        c10 = windVaneWebView.getContext();
                    }
                } catch (Exception e2) {
                    ad.b(this.a, e2.getMessage());
                }
            }
            if (c10 == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    com.mbridge.msdk.click.c.c(c10, optString);
                } else if (optInt == 2) {
                    com.mbridge.msdk.click.c.e(c10, optString);
                }
            } catch (JSONException e10) {
                ad.b(this.a, e10.getMessage());
            } catch (Throwable th2) {
                ad.b(this.a, th2.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z10);
            WeakReference<Context> weakReference = this.f15255b;
            if (weakReference != null && weakReference.get() != null) {
                SplashExpandDialog splashExpandDialog = this.f15264k;
                if (splashExpandDialog != null && splashExpandDialog.isShowing()) {
                    return;
                }
                SplashExpandDialog splashExpandDialog2 = new SplashExpandDialog(this.f15255b.get(), bundle, this.f15263j);
                this.f15264k = splashExpandDialog2;
                splashExpandDialog2.setCampaignList(this.f15257d, this.f15256c);
                this.f15264k.show();
                com.mbridge.msdk.splash.d.a aVar = this.f15263j;
                if (aVar != null) {
                    aVar.a(true);
                }
                String str2 = this.f15257d;
                CampaignEx mraidCampaign = getMraidCampaign();
                try {
                    StringBuilder sb2 = new StringBuilder();
                    if (mraidCampaign.isBidCampaign()) {
                        sb2.append("hb=1&");
                    }
                    sb2.append("key=");
                    sb2.append(URLEncoder.encode("2000070", "utf-8"));
                    sb2.append("&rid=");
                    sb2.append(URLEncoder.encode(mraidCampaign.getRequestId(), "utf-8"));
                    sb2.append("&rid_n=");
                    sb2.append(URLEncoder.encode(mraidCampaign.getRequestIdNotice(), "utf-8"));
                    sb2.append("&cid=");
                    sb2.append(URLEncoder.encode(mraidCampaign.getId(), "utf-8"));
                    sb2.append("&unit_id=");
                    sb2.append(URLEncoder.encode(str2, "utf-8"));
                    sb2.append("&click_url=");
                    sb2.append(URLEncoder.encode(str, "utf-8"));
                    sb2.append("&network_type=");
                    sb2.append(URLEncoder.encode(String.valueOf(z.l(com.mbridge.msdk.foundation.controller.c.m().c())), "utf-8"));
                    com.mbridge.msdk.foundation.same.report.d.c.a().d(sb2.toString());
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                    }
                }
            }
        } catch (Throwable th2) {
            ad.b(this.a, "expand", th2);
        }
    }

    public final void f(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                int i10 = new JSONObject(str).getInt("countdown");
                com.mbridge.msdk.splash.d.a aVar = this.f15263j;
                if (aVar != null) {
                    aVar.b(i10);
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final void g(Object obj, String str) {
        e.A("sendImpressions:", str, this.a);
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                final ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String string = jSONArray.getString(i10);
                    for (CampaignEx campaignEx : this.f15256c) {
                        if (campaignEx.getId().equals(string)) {
                            com.mbridge.msdk.foundation.same.a.b.a(this.f15257d, campaignEx, "splash");
                            arrayList.add(string);
                        }
                    }
                }
                new Thread(new Runnable() { // from class: com.mbridge.msdk.splash.signal.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            j a = j.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a.a((String) it.next());
                            }
                        } catch (Exception unused) {
                            ad.b(a.this.a, "campain can't insert db");
                        }
                    }
                }).start();
            }
        } catch (Throwable th2) {
            ad.b(this.a, "sendImpressions", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f15256c;
        if (list != null && list.size() > 0) {
            return this.f15256c.get(0);
        }
        return null;
    }

    public final void h(Object obj, String str) {
        boolean z10;
        boolean z11;
        ad.a(this.a, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    int optInt = jSONObject.optInt("type");
                    String a = ai.a(jSONObject.optString("url"), "&tun=", z.q() + "");
                    int optInt2 = jSONObject.optInt("report");
                    CampaignEx campaignEx = null;
                    if (optInt2 == 0) {
                        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                        List<CampaignEx> list = this.f15256c;
                        if (list != null) {
                            campaignEx = list.get(0);
                        }
                        CampaignEx campaignEx2 = campaignEx;
                        if (optInt != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        com.mbridge.msdk.click.a.a(c10, campaignEx2, "", a, false, z11);
                    } else {
                        Context c11 = com.mbridge.msdk.foundation.controller.c.m().c();
                        List<CampaignEx> list2 = this.f15256c;
                        if (list2 != null) {
                            campaignEx = list2.get(0);
                        }
                        CampaignEx campaignEx3 = campaignEx;
                        if (optInt != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        com.mbridge.msdk.click.a.a(c11, campaignEx3, "", a, false, z10, optInt2);
                    }
                }
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, d.a(0));
            } catch (Throwable th2) {
                ad.b(this.a, "reportUrls", th2);
            }
        }
    }

    public final void i(Object obj, String str) {
        try {
            if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b);
            }
        } catch (Throwable th2) {
            ad.b(this.a, "onJSBridgeConnect", th2);
        }
    }

    public final void j(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "Call pause count down success.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("countdown", this.f15262i);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            ad.b(this.a, e2.getMessage());
        }
        com.mbridge.msdk.splash.d.a aVar = this.f15263j;
        if (aVar != null) {
            aVar.a(1, -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.Object r3, java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L2c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L22
            r0.<init>(r4)     // Catch: java.lang.Exception -> L22
            java.lang.String r4 = "countdown"
            int r4 = r0.optInt(r4)     // Catch: java.lang.Exception -> L22
            com.mbridge.msdk.mbsignalcommon.windvane.g r0 = com.mbridge.msdk.mbsignalcommon.windvane.g.a()     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = com.mbridge.msdk.splash.signal.d.a(r1)     // Catch: java.lang.Exception -> L1f
            r0.a(r3, r1)     // Catch: java.lang.Exception -> L1f
            r1 = r4
            goto L2c
        L1f:
            r3 = move-exception
            r1 = r4
            goto L23
        L22:
            r3 = move-exception
        L23:
            java.lang.String r4 = r2.a
            java.lang.String r3 = r3.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r4, r3)
        L2c:
            com.mbridge.msdk.splash.d.a r3 = r2.f15263j
            if (r3 == 0) goto L34
            r4 = 2
            r3.a(r4, r1)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.signal.a.k(java.lang.Object, java.lang.String):void");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        com.mbridge.msdk.splash.d.a aVar = this.f15263j;
        if (aVar != null) {
            aVar.a(true, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        try {
            com.mbridge.msdk.splash.d.a aVar = this.f15263j;
            if (aVar != null) {
                aVar.a(i10);
            }
        } catch (Throwable th2) {
            ad.b(this.a, "useCustomClose", th2);
        }
    }

    public final void a(int i10) {
        this.f15260g = i10;
    }

    public final List<CampaignEx> b() {
        return this.f15256c;
    }

    public final void c(Object obj, String str) {
        com.mbridge.msdk.splash.d.a aVar = this.f15263j;
        if (aVar != null) {
            aVar.a(obj, str);
        }
    }

    public final void a(com.mbridge.msdk.splash.d.a aVar) {
        if (aVar != null) {
            this.f15263j = aVar;
        }
    }

    public final void b(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt("state");
            com.mbridge.msdk.splash.d.a aVar = this.f15263j;
            if (aVar != null) {
                aVar.a(optInt);
            }
        } catch (Throwable th2) {
            ad.b(this.a, "toggleCloseBtn", th2);
        }
    }

    public final com.mbridge.msdk.splash.d.a a() {
        return this.f15263j;
    }

    public final void a(List<CampaignEx> list) {
        this.f15256c = list;
    }

    public final void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.mbridge.msdk.splash.a.b bVar = new com.mbridge.msdk.splash.a.b(com.mbridge.msdk.foundation.controller.c.m().c());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f15259f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", bVar.a());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f15256c));
            k d10 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f15257d);
            if (d10 == null) {
                d10 = k.d(this.f15257d);
            }
            if (!TextUtils.isEmpty(this.f15258e)) {
                d10.a(this.f15258e);
            }
            d10.b(this.f15257d);
            d10.g(this.f15261h);
            d10.b(this.f15260g);
            jSONObject.put("unitSetting", d10.x());
            String g10 = h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g10)) {
                jSONObject.put("appSetting", new JSONObject(g10));
            }
            jSONObject.put("sdk_info", com.mbridge.msdk.mbsignalcommon.base.d.a);
            ad.b(this.a, "init" + jSONObject.toString());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th2) {
            ad.b(this.a, "init", th2);
        }
    }
}
