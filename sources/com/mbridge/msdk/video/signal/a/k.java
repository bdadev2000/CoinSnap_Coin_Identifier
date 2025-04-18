package com.mbridge.msdk.video.signal.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.a.a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k extends l {

    /* renamed from: p, reason: collision with root package name */
    private Activity f16093p;

    /* renamed from: q, reason: collision with root package name */
    private String f16094q;

    /* renamed from: r, reason: collision with root package name */
    private String f16095r;

    /* renamed from: s, reason: collision with root package name */
    private CampaignEx f16096s;

    /* renamed from: t, reason: collision with root package name */
    private List<CampaignEx> f16097t;
    private int u;

    /* renamed from: v, reason: collision with root package name */
    private String f16098v = "";

    /* renamed from: w, reason: collision with root package name */
    private String f16099w = "";

    /* renamed from: x, reason: collision with root package name */
    private boolean f16100x = false;

    /* renamed from: y, reason: collision with root package name */
    private boolean f16101y = false;

    public k(Activity activity, CampaignEx campaignEx) {
        this.f16093p = activity;
        this.f16096s = campaignEx;
    }

    private JSONObject A() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.d.c cVar = this.f16083k;
        if (cVar != null) {
            return cVar.E();
        }
        return jSONObject;
    }

    private JSONObject B() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.d.a b3 = com.mbridge.msdk.videocommon.d.b.a().b();
        if (b3 != null) {
            return b3.k();
        }
        return jSONObject;
    }

    private String s() {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16082j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.f16098v);
            jSONObject2.put("rootViewInstanceId", this.f16099w);
            jSONObject2.put("isRootTemplateWebView", this.f16100x);
            jSONObject.put("sdk_info", "MAL_16.7.71,3.0.1");
            jSONObject2.put("playVideoMute", this.f16086n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<CampaignEx> list = this.f16097t;
            if (list != null && list.size() > 0) {
                for (CampaignEx campaignEx : this.f16097t) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(campaignEx, campaignEx.isReady(), b(campaignEx)));
                }
            } else {
                jSONArray.put(CampaignEx.campaignToJsonObject(this.f16096s));
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", A());
            String g10 = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g10)) {
                JSONObject jSONObject3 = new JSONObject(g10);
                b(jSONObject3);
                String c10 = com.mbridge.msdk.c.h.a().c(this.f16082j);
                if (!TextUtils.isEmpty(c10)) {
                    jSONObject3.put("ivreward", new JSONObject(c10));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", B());
            if (!TextUtils.isEmpty(this.f16082j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16082j);
            }
            if (this.f16101y) {
                obj = "1";
            } else {
                obj = "0";
            }
            jSONObject.put("rw_plus", obj);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return jSONObject.toString();
    }

    private JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f16086n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(CampaignEx.campaignToJsonObject(this.f16096s));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", A());
            String g10 = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g10)) {
                JSONObject jSONObject3 = new JSONObject(g10);
                b(jSONObject3);
                String c10 = com.mbridge.msdk.c.h.a().c(this.f16082j);
                if (!TextUtils.isEmpty(c10)) {
                    jSONObject3.put("ivreward", c10);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", B());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_info", "MAL_16.7.71,3.0.1");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject v() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f16082j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16082j);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            String g10 = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g10)) {
                jSONObject.put("appSetting", new JSONObject(g10));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.mbridge.msdk.videocommon.d.c cVar = this.f16083k;
            if (cVar != null) {
                jSONObject.put("unitSetting", cVar.E());
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject y() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f16086n);
            jSONObject2.put("instanceId", this.f16098v);
            jSONObject.put("sdkSetting", jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final void c(boolean z10) {
        this.f16100x = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.e
    public final void click(int i10, String str) {
        AppletsModel appletsModel;
        List<CampaignEx> list;
        int i11;
        List<CampaignEx> list2;
        super.click(i10, str);
        CampaignEx campaignEx = this.f16096s;
        if (campaignEx != null) {
            if (campaignEx.getDynamicTempCode() == 5 && this.f16096s != null && (list2 = this.f16097t) != null && list2.size() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("camp_position")) {
                        this.f16096s = this.f16097t.get(jSONObject.getInt("camp_position"));
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            CampaignEx campaignEx2 = this.f16096s;
            if (i10 == 3) {
                campaignEx2.setClickTempSource(2);
                if (campaignEx2.getTriggerClickSource() == 0) {
                    campaignEx2.setTriggerClickSource(2);
                }
            } else if (i10 == 1 && campaignEx2.getClickTempSource() != 2) {
                campaignEx2.setClickTempSource(1);
            }
        }
        try {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        this.f16085m.a(true);
                        return;
                    }
                    return;
                }
                CampaignEx campaignEx3 = this.f16096s;
                if (campaignEx3 != null && campaignEx3.getCbd() > -2) {
                    i11 = this.f16096s.getCbd();
                } else {
                    com.mbridge.msdk.videocommon.d.c cVar = this.f16083k;
                    if (cVar != null) {
                        i11 = cVar.p();
                    } else {
                        i11 = 1;
                    }
                }
                if (i11 == -1) {
                    a(new a.b(this, this.f16085m));
                }
                click(1, str);
                return;
            }
            if (this.f16096s == null && (list = this.f16097t) != null && list.size() > 0) {
                this.f16096s = this.f16097t.get(0);
            }
            CampaignEx campaignEx4 = this.f16096s;
            if (campaignEx4 == null) {
                return;
            }
            CampaignEx a = a(str, campaignEx4);
            if (a != null && (appletsModel = AppletModelManager.getInstance().get(a)) != null) {
                appletsModel.setUserClick(true);
                AppletModelManager.getInstance().replace(appletsModel, a);
            }
            a(a, this.f16093p);
        } catch (Throwable th2) {
            ad.b("DefaultJSCommon", th2.getMessage(), th2);
        }
    }

    public final void d(String str) {
        this.f16099w = str;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void f() {
        super.f();
        a.InterfaceC0212a interfaceC0212a = this.f16085m;
        if (interfaceC0212a != null) {
            interfaceC0212a.b();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final String g(int i10) {
        switch (i10) {
            case 1:
                return u().toString();
            case 2:
                return v().toString();
            case 3:
                return w().toString();
            case 4:
                return x().toString();
            case 5:
                return y().toString();
            case 6:
                return z().toString();
            default:
                return t().toString();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.e
    public final void handlerH5Exception(int i10, String str) {
        super.handlerH5Exception(i10, str);
        try {
            this.f16085m.a(i10, str);
        } catch (Throwable th2) {
            ad.b("DefaultJSCommon", th2.getMessage(), th2);
        }
    }

    public final void i(int i10) {
        this.u = i10;
    }

    public final void q() {
        this.f16094q = "";
    }

    public final int r() {
        return this.u;
    }

    private void b(JSONObject jSONObject) {
        try {
            Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
            String obj = al.a(c10, "MBridge_ConfirmTitle" + this.f16082j, "").toString();
            String obj2 = al.a(c10, "MBridge_ConfirmContent" + this.f16082j, "").toString();
            String obj3 = al.a(c10, "MBridge_CancelText" + this.f16082j, "").toString();
            String obj4 = al.a(c10, "MBridge_ConfirmText" + this.f16082j, "").toString();
            if (!TextUtils.isEmpty(obj)) {
                jSONObject.put("confirm_title", obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                jSONObject.put("confirm_description", obj2);
            }
            if (!TextUtils.isEmpty(obj3)) {
                jSONObject.put("confirm_t", obj3);
            }
            if (!TextUtils.isEmpty(obj4)) {
                jSONObject.put("confirm_c_play", obj4);
            }
            if (TextUtils.isEmpty(obj4)) {
                return;
            }
            jSONObject.put("confirm_c_rv", obj4);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(CampaignEx campaignEx) {
        this.f16096s = campaignEx;
    }

    public final void c(String str) {
        this.f16098v = str;
    }

    public final void d(boolean z10) {
        this.f16101y = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final String i() {
        ad.a("DefaultJSCommon", "getNotchArea");
        return this.f16095r;
    }

    public final void a(List<CampaignEx> list) {
        this.f16097t = list;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final String c() {
        this.f16085m.a();
        this.a = true;
        if (TextUtils.isEmpty(this.f16094q)) {
            this.f16094q = s();
        } else {
            this.f16094q = ai.b(this.f16094q, "tun", z.q() + "");
        }
        return this.f16094q;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void d() {
        super.d();
        try {
            Activity activity = this.f16093p;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th2) {
            ad.b("DefaultJSCommon", th2.getMessage(), th2);
        }
    }

    private CampaignEx a(String str, CampaignEx campaignEx) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return campaignEx;
        }
        if (TextUtils.isEmpty(str) && campaignEx == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject campaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(campaignToJsonObject);
                if (parseCampaignWithBackData == null) {
                    parseCampaignWithBackData = campaignEx;
                }
                if (!TextUtils.isEmpty(str)) {
                    a(campaignToJsonObject, parseCampaignWithBackData);
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject(com.mbridge.msdk.foundation.same.a.f13279j);
                    if (optJSONObject != null) {
                        str2 = String.valueOf(ai.a(this.f16093p, Integer.valueOf(optJSONObject.getString(com.mbridge.msdk.foundation.same.a.f13277h)).intValue()));
                        str3 = String.valueOf(ai.a(this.f16093p, Integer.valueOf(optJSONObject.getString(com.mbridge.msdk.foundation.same.a.f13278i)).intValue()));
                    } else {
                        str2 = "-999";
                        str3 = "-999";
                    }
                    parseCampaignWithBackData.setClickURL(com.mbridge.msdk.click.c.a(parseCampaignWithBackData.getClickURL(), str2, str3));
                    String noticeUrl = parseCampaignWithBackData.getNoticeUrl();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        StringBuilder sb2 = new StringBuilder();
                        while (keys.hasNext()) {
                            sb2.append("&");
                            String next = keys.next();
                            String optString = optJSONObject.optString(next);
                            if (com.mbridge.msdk.foundation.same.a.f13277h.equals(next) || com.mbridge.msdk.foundation.same.a.f13278i.equals(next)) {
                                optString = String.valueOf(ai.a(this.f16093p, Integer.valueOf(optString).intValue()));
                            }
                            sb2.append(next);
                            sb2.append("=");
                            sb2.append(optString);
                        }
                        parseCampaignWithBackData.setNoticeUrl(noticeUrl + ((Object) sb2));
                    }
                }
                return parseCampaignWithBackData;
            } catch (JSONException e2) {
                e2.printStackTrace();
                return campaignEx;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return campaignEx;
            }
        }
        try {
            JSONObject campaignToJsonObject2 = CampaignEx.campaignToJsonObject(campaignEx);
            JSONObject jSONObject = new JSONObject(str);
            try {
                if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                    campaignToJsonObject2.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                }
            } catch (Exception unused) {
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                campaignToJsonObject2.put(next2, jSONObject.getString(next2));
            }
            CampaignEx parseCampaignWithBackData2 = CampaignEx.parseCampaignWithBackData(campaignToJsonObject2);
            a(campaignToJsonObject2, parseCampaignWithBackData2);
            return parseCampaignWithBackData2;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return campaignEx;
        }
    }

    public k(Activity activity, CampaignEx campaignEx, List<CampaignEx> list) {
        this.f16093p = activity;
        this.f16096s = campaignEx;
        this.f16097t = list;
    }

    private boolean b(CampaignEx campaignEx) {
        com.mbridge.msdk.c.g b3;
        try {
            String k10 = com.mbridge.msdk.foundation.controller.c.m().k();
            long aa2 = (TextUtils.isEmpty(k10) || (b3 = com.mbridge.msdk.c.h.a().b(k10)) == null) ? 0L : b3.aa() * 1000;
            com.mbridge.msdk.videocommon.d.a b10 = com.mbridge.msdk.videocommon.d.b.a().b();
            long f10 = b10 != null ? b10.f() : 0L;
            if (campaignEx != null) {
                return campaignEx.isSpareOffer(f10, aa2);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16095r = str;
    }

    private void a(JSONObject jSONObject, CampaignEx campaignEx) {
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            campaignEx.setCampaignUnitId(optString);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void a(int i10, String str) {
        super.a(i10, str);
        if (i10 != 2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            final String optString = jSONObject.optString(NotificationCompat.CATEGORY_EVENT, NotificationCompat.CATEGORY_EVENT);
            final String optString2 = jSONObject.optString("template", "-1");
            final String optString3 = jSONObject.optString(TtmlNode.TAG_LAYOUT, "-1");
            final String optString4 = jSONObject.optString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16082j);
            final int l10 = z.l(this.f16093p.getApplication());
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.signal.a.k.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.foundation.db.o.a(com.mbridge.msdk.foundation.db.g.a(k.this.f16093p.getApplication())).a(new com.mbridge.msdk.foundation.entity.n("2000039", optString, optString2, optString3, optString4, k.this.f16096s.getId(), l10, z.a(k.this.f16093p.getApplication(), l10)));
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        } catch (Throwable th2) {
            ad.b("DefaultJSCommon", th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void a(Activity activity) {
        this.f16093p = activity;
    }
}
