package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.L;
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

/* loaded from: classes3.dex */
public class a implements b {
    private WeakReference<Context> b;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f17961c;

    /* renamed from: d, reason: collision with root package name */
    private String f17962d;

    /* renamed from: e, reason: collision with root package name */
    private String f17963e;

    /* renamed from: f, reason: collision with root package name */
    private int f17964f;

    /* renamed from: g, reason: collision with root package name */
    private int f17965g;

    /* renamed from: i, reason: collision with root package name */
    private int f17967i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.splash.d.a f17968j;

    /* renamed from: k, reason: collision with root package name */
    private SplashExpandDialog f17969k;

    /* renamed from: a, reason: collision with root package name */
    protected String f17960a = "SplashSignalCommunicationImpl";

    /* renamed from: h, reason: collision with root package name */
    private int f17966h = 5;

    public a(Context context, String str, String str2) {
        this.f17963e = str;
        this.f17962d = str2;
        this.b = new WeakReference<>(context);
    }

    public final void a(Context context) {
        this.b = new WeakReference<>(context);
    }

    public final void b(int i9) {
        this.f17966h = i9;
    }

    public final void c(int i9) {
        this.f17967i = i9;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        ad.b(this.f17960a, "close");
        try {
            com.mbridge.msdk.splash.d.a aVar = this.f17968j;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable th) {
            ad.b(this.f17960a, "close", th);
        }
    }

    public final void d(Object obj, String str) {
        CampaignEx campaignEx;
        ad.b(this.f17960a, "install");
        try {
            List<CampaignEx> list = this.f17961c;
            if (list == null) {
                return;
            }
            if (list != null && list.size() > 0) {
                campaignEx = this.f17961c.get(0);
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
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
                com.mbridge.msdk.splash.d.a aVar = this.f17968j;
                if (aVar != null) {
                    aVar.a(campaignEx);
                }
            }
        } catch (Throwable th) {
            ad.b(this.f17960a, CampaignEx.JSON_NATIVE_VIDEO_CLICK, th);
        }
    }

    public final void e(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        ad.b(this.f17960a, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (!TextUtils.isEmpty(str)) {
            if (c9 == null) {
                try {
                    if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b) != null) {
                        c9 = windVaneWebView.getContext();
                    }
                } catch (Exception e4) {
                    ad.b(this.f17960a, e4.getMessage());
                }
            }
            if (c9 == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    com.mbridge.msdk.click.c.c(c9, optString);
                } else if (optInt == 2) {
                    com.mbridge.msdk.click.c.e(c9, optString);
                }
            } catch (JSONException e9) {
                ad.b(this.f17960a, e9.getMessage());
            } catch (Throwable th) {
                ad.b(this.f17960a, th.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z8) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z8);
            WeakReference<Context> weakReference = this.b;
            if (weakReference != null && weakReference.get() != null) {
                SplashExpandDialog splashExpandDialog = this.f17969k;
                if (splashExpandDialog != null && splashExpandDialog.isShowing()) {
                    return;
                }
                SplashExpandDialog splashExpandDialog2 = new SplashExpandDialog(this.b.get(), bundle, this.f17968j);
                this.f17969k = splashExpandDialog2;
                splashExpandDialog2.setCampaignList(this.f17962d, this.f17961c);
                this.f17969k.show();
                com.mbridge.msdk.splash.d.a aVar = this.f17968j;
                if (aVar != null) {
                    aVar.a(true);
                }
                String str2 = this.f17962d;
                CampaignEx mraidCampaign = getMraidCampaign();
                try {
                    StringBuilder sb = new StringBuilder();
                    if (mraidCampaign.isBidCampaign()) {
                        sb.append("hb=1&");
                    }
                    sb.append("key=");
                    sb.append(URLEncoder.encode("2000070", "utf-8"));
                    sb.append("&rid=");
                    sb.append(URLEncoder.encode(mraidCampaign.getRequestId(), "utf-8"));
                    sb.append("&rid_n=");
                    sb.append(URLEncoder.encode(mraidCampaign.getRequestIdNotice(), "utf-8"));
                    sb.append("&cid=");
                    sb.append(URLEncoder.encode(mraidCampaign.getId(), "utf-8"));
                    sb.append("&unit_id=");
                    sb.append(URLEncoder.encode(str2, "utf-8"));
                    sb.append("&click_url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    sb.append("&network_type=");
                    sb.append(URLEncoder.encode(String.valueOf(z.l(com.mbridge.msdk.foundation.controller.c.m().c())), "utf-8"));
                    com.mbridge.msdk.foundation.same.report.d.c.a().d(sb.toString());
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        e4.printStackTrace();
                    }
                }
            }
        } catch (Throwable th) {
            ad.b(this.f17960a, "expand", th);
        }
    }

    public final void f(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                int i9 = new JSONObject(str).getInt("countdown");
                com.mbridge.msdk.splash.d.a aVar = this.f17968j;
                if (aVar != null) {
                    aVar.b(i9);
                }
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    public final void g(Object obj, String str) {
        L.C("sendImpressions:", str, this.f17960a);
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                final ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    String string = jSONArray.getString(i9);
                    for (CampaignEx campaignEx : this.f17961c) {
                        if (campaignEx.getId().equals(string)) {
                            com.mbridge.msdk.foundation.same.a.b.a(this.f17962d, campaignEx, "splash");
                            arrayList.add(string);
                        }
                    }
                }
                new Thread(new Runnable() { // from class: com.mbridge.msdk.splash.signal.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            j a6 = j.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a6.a((String) it.next());
                            }
                        } catch (Exception unused) {
                            ad.b(a.this.f17960a, "campain can't insert db");
                        }
                    }
                }).start();
            }
        } catch (Throwable th) {
            ad.b(this.f17960a, "sendImpressions", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f17961c;
        if (list != null && list.size() > 0) {
            return this.f17961c.get(0);
        }
        return null;
    }

    public final void h(Object obj, String str) {
        boolean z8;
        boolean z9;
        ad.a(this.f17960a, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i9);
                    int optInt = jSONObject.optInt("type");
                    String a6 = ai.a(jSONObject.optString("url"), "&tun=", z.q() + "");
                    int optInt2 = jSONObject.optInt("report");
                    CampaignEx campaignEx = null;
                    if (optInt2 == 0) {
                        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                        List<CampaignEx> list = this.f17961c;
                        if (list != null) {
                            campaignEx = list.get(0);
                        }
                        CampaignEx campaignEx2 = campaignEx;
                        if (optInt != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        com.mbridge.msdk.click.a.a(c9, campaignEx2, "", a6, false, z9);
                    } else {
                        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                        List<CampaignEx> list2 = this.f17961c;
                        if (list2 != null) {
                            campaignEx = list2.get(0);
                        }
                        CampaignEx campaignEx3 = campaignEx;
                        if (optInt != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        com.mbridge.msdk.click.a.a(c10, campaignEx3, "", a6, false, z8, optInt2);
                    }
                }
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, d.a(0));
            } catch (Throwable th) {
                ad.b(this.f17960a, "reportUrls", th);
            }
        }
    }

    public final void i(Object obj, String str) {
        try {
            if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b);
            }
        } catch (Throwable th) {
            ad.b(this.f17960a, "onJSBridgeConnect", th);
        }
    }

    public final void j(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            jSONObject.put("message", "Call pause count down success.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("countdown", this.f17967i);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e4) {
            ad.b(this.f17960a, e4.getMessage());
        }
        com.mbridge.msdk.splash.d.a aVar = this.f17968j;
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
            java.lang.String r4 = r2.f17960a
            java.lang.String r3 = r3.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r4, r3)
        L2c:
            com.mbridge.msdk.splash.d.a r3 = r2.f17968j
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
        com.mbridge.msdk.splash.d.a aVar = this.f17968j;
        if (aVar != null) {
            aVar.a(true, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z8) {
        int i9;
        if (z8) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        try {
            com.mbridge.msdk.splash.d.a aVar = this.f17968j;
            if (aVar != null) {
                aVar.a(i9);
            }
        } catch (Throwable th) {
            ad.b(this.f17960a, "useCustomClose", th);
        }
    }

    public final void a(int i9) {
        this.f17965g = i9;
    }

    public final List<CampaignEx> b() {
        return this.f17961c;
    }

    public final void c(Object obj, String str) {
        com.mbridge.msdk.splash.d.a aVar = this.f17968j;
        if (aVar != null) {
            aVar.a(obj, str);
        }
    }

    public final void a(com.mbridge.msdk.splash.d.a aVar) {
        if (aVar != null) {
            this.f17968j = aVar;
        }
    }

    public final void b(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt("state");
            com.mbridge.msdk.splash.d.a aVar = this.f17968j;
            if (aVar != null) {
                aVar.a(optInt);
            }
        } catch (Throwable th) {
            ad.b(this.f17960a, "toggleCloseBtn", th);
        }
    }

    public final com.mbridge.msdk.splash.d.a a() {
        return this.f17968j;
    }

    public final void a(List<CampaignEx> list) {
        this.f17961c = list;
    }

    public final void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.mbridge.msdk.splash.a.b bVar = new com.mbridge.msdk.splash.a.b(com.mbridge.msdk.foundation.controller.c.m().c());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f17964f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", bVar.a());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f17961c));
            k d2 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f17962d);
            if (d2 == null) {
                d2 = k.d(this.f17962d);
            }
            if (!TextUtils.isEmpty(this.f17963e)) {
                d2.a(this.f17963e);
            }
            d2.b(this.f17962d);
            d2.g(this.f17966h);
            d2.b(this.f17965g);
            jSONObject.put("unitSetting", d2.x());
            String g9 = h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g9)) {
                jSONObject.put("appSetting", new JSONObject(g9));
            }
            jSONObject.put("sdk_info", com.mbridge.msdk.mbsignalcommon.base.d.f16585a);
            ad.b(this.f17960a, "init" + jSONObject.toString());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            ad.b(this.f17960a, "init", th);
        }
    }
}
