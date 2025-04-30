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

/* loaded from: classes3.dex */
public final class k extends l {

    /* renamed from: p, reason: collision with root package name */
    private Activity f19077p;

    /* renamed from: q, reason: collision with root package name */
    private String f19078q;

    /* renamed from: r, reason: collision with root package name */
    private String f19079r;

    /* renamed from: s, reason: collision with root package name */
    private CampaignEx f19080s;

    /* renamed from: t, reason: collision with root package name */
    private List<CampaignEx> f19081t;

    /* renamed from: u, reason: collision with root package name */
    private int f19082u;

    /* renamed from: v, reason: collision with root package name */
    private String f19083v = "";

    /* renamed from: w, reason: collision with root package name */
    private String f19084w = "";

    /* renamed from: x, reason: collision with root package name */
    private boolean f19085x = false;

    /* renamed from: y, reason: collision with root package name */
    private boolean f19086y = false;

    public k(Activity activity, CampaignEx campaignEx) {
        this.f19077p = activity;
        this.f19080s = campaignEx;
    }

    private JSONObject A() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.d.c cVar = this.f19068k;
        if (cVar != null) {
            return cVar.E();
        }
        return jSONObject;
    }

    private JSONObject B() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.d.a b = com.mbridge.msdk.videocommon.d.b.a().b();
        if (b != null) {
            return b.k();
        }
        return jSONObject;
    }

    private String s() {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f19067j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.f19083v);
            jSONObject2.put("rootViewInstanceId", this.f19084w);
            jSONObject2.put("isRootTemplateWebView", this.f19085x);
            jSONObject.put("sdk_info", "MAL_16.7.71,3.0.1");
            jSONObject2.put("playVideoMute", this.f19069n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<CampaignEx> list = this.f19081t;
            if (list != null && list.size() > 0) {
                for (CampaignEx campaignEx : this.f19081t) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(campaignEx, campaignEx.isReady(), b(campaignEx)));
                }
            } else {
                jSONArray.put(CampaignEx.campaignToJsonObject(this.f19080s));
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", A());
            String g9 = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g9)) {
                JSONObject jSONObject3 = new JSONObject(g9);
                b(jSONObject3);
                String c9 = com.mbridge.msdk.c.h.a().c(this.f19067j);
                if (!TextUtils.isEmpty(c9)) {
                    jSONObject3.put("ivreward", new JSONObject(c9));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", B());
            if (!TextUtils.isEmpty(this.f19067j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f19067j);
            }
            if (this.f19086y) {
                obj = "1";
            } else {
                obj = "0";
            }
            jSONObject.put("rw_plus", obj);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    private JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f19069n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(CampaignEx.campaignToJsonObject(this.f19080s));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", A());
            String g9 = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g9)) {
                JSONObject jSONObject3 = new JSONObject(g9);
                b(jSONObject3);
                String c9 = com.mbridge.msdk.c.h.a().c(this.f19067j);
                if (!TextUtils.isEmpty(c9)) {
                    jSONObject3.put("ivreward", c9);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", B());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_info", "MAL_16.7.71,3.0.1");
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject v() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f19067j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f19067j);
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            String g9 = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g9)) {
                jSONObject.put("appSetting", new JSONObject(g9));
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.mbridge.msdk.videocommon.d.c cVar = this.f19068k;
            if (cVar != null) {
                jSONObject.put("unitSetting", cVar.E());
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject y() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f19069n);
            jSONObject2.put("instanceId", this.f19083v);
            jSONObject.put("sdkSetting", jSONObject2);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return jSONObject;
    }

    public final void c(boolean z8) {
        this.f19085x = z8;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.e
    public final void click(int i9, String str) {
        AppletsModel appletsModel;
        List<CampaignEx> list;
        int i10;
        List<CampaignEx> list2;
        super.click(i9, str);
        CampaignEx campaignEx = this.f19080s;
        if (campaignEx != null) {
            if (campaignEx.getDynamicTempCode() == 5 && this.f19080s != null && (list2 = this.f19081t) != null && list2.size() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("camp_position")) {
                        this.f19080s = this.f19081t.get(jSONObject.getInt("camp_position"));
                    }
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
            CampaignEx campaignEx2 = this.f19080s;
            if (i9 == 3) {
                campaignEx2.setClickTempSource(2);
                if (campaignEx2.getTriggerClickSource() == 0) {
                    campaignEx2.setTriggerClickSource(2);
                }
            } else if (i9 == 1 && campaignEx2.getClickTempSource() != 2) {
                campaignEx2.setClickTempSource(1);
            }
        }
        try {
            if (i9 != 1) {
                if (i9 != 3) {
                    if (i9 == 4) {
                        this.m.a(true);
                        return;
                    }
                    return;
                }
                CampaignEx campaignEx3 = this.f19080s;
                if (campaignEx3 != null && campaignEx3.getCbd() > -2) {
                    i10 = this.f19080s.getCbd();
                } else {
                    com.mbridge.msdk.videocommon.d.c cVar = this.f19068k;
                    if (cVar != null) {
                        i10 = cVar.p();
                    } else {
                        i10 = 1;
                    }
                }
                if (i10 == -1) {
                    a(new a.b(this, this.m));
                }
                click(1, str);
                return;
            }
            if (this.f19080s == null && (list = this.f19081t) != null && list.size() > 0) {
                this.f19080s = this.f19081t.get(0);
            }
            CampaignEx campaignEx4 = this.f19080s;
            if (campaignEx4 == null) {
                return;
            }
            CampaignEx a6 = a(str, campaignEx4);
            if (a6 != null && (appletsModel = AppletModelManager.getInstance().get(a6)) != null) {
                appletsModel.setUserClick(true);
                AppletModelManager.getInstance().replace(appletsModel, a6);
            }
            a(a6, this.f19077p);
        } catch (Throwable th) {
            ad.b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    public final void d(String str) {
        this.f19084w = str;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void f() {
        super.f();
        a.InterfaceC0200a interfaceC0200a = this.m;
        if (interfaceC0200a != null) {
            interfaceC0200a.b();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final String g(int i9) {
        switch (i9) {
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
    public final void handlerH5Exception(int i9, String str) {
        super.handlerH5Exception(i9, str);
        try {
            this.m.a(i9, str);
        } catch (Throwable th) {
            ad.b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    public final void i(int i9) {
        this.f19082u = i9;
    }

    public final void q() {
        this.f19078q = "";
    }

    public final int r() {
        return this.f19082u;
    }

    private void b(JSONObject jSONObject) {
        try {
            Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
            String obj = al.a(c9, "MBridge_ConfirmTitle" + this.f19067j, "").toString();
            String obj2 = al.a(c9, "MBridge_ConfirmContent" + this.f19067j, "").toString();
            String obj3 = al.a(c9, "MBridge_CancelText" + this.f19067j, "").toString();
            String obj4 = al.a(c9, "MBridge_ConfirmText" + this.f19067j, "").toString();
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
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void a(CampaignEx campaignEx) {
        this.f19080s = campaignEx;
    }

    public final void c(String str) {
        this.f19083v = str;
    }

    public final void d(boolean z8) {
        this.f19086y = z8;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final String i() {
        ad.a("DefaultJSCommon", "getNotchArea");
        return this.f19079r;
    }

    public final void a(List<CampaignEx> list) {
        this.f19081t = list;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final String c() {
        this.m.a();
        this.f19059a = true;
        if (TextUtils.isEmpty(this.f19078q)) {
            this.f19078q = s();
        } else {
            this.f19078q = ai.b(this.f19078q, "tun", z.q() + "");
        }
        return this.f19078q;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void d() {
        super.d();
        try {
            Activity activity = this.f19077p;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            ad.b("DefaultJSCommon", th.getMessage(), th);
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
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject(com.mbridge.msdk.foundation.same.a.f15684j);
                    if (optJSONObject != null) {
                        str2 = String.valueOf(ai.a(this.f19077p, Integer.valueOf(optJSONObject.getString(com.mbridge.msdk.foundation.same.a.f15682h)).intValue()));
                        str3 = String.valueOf(ai.a(this.f19077p, Integer.valueOf(optJSONObject.getString(com.mbridge.msdk.foundation.same.a.f15683i)).intValue()));
                    } else {
                        str2 = "-999";
                        str3 = "-999";
                    }
                    parseCampaignWithBackData.setClickURL(com.mbridge.msdk.click.c.a(parseCampaignWithBackData.getClickURL(), str2, str3));
                    String noticeUrl = parseCampaignWithBackData.getNoticeUrl();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (keys.hasNext()) {
                            sb.append("&");
                            String next = keys.next();
                            String optString = optJSONObject.optString(next);
                            if (com.mbridge.msdk.foundation.same.a.f15682h.equals(next) || com.mbridge.msdk.foundation.same.a.f15683i.equals(next)) {
                                optString = String.valueOf(ai.a(this.f19077p, Integer.valueOf(optString).intValue()));
                            }
                            sb.append(next);
                            sb.append("=");
                            sb.append(optString);
                        }
                        parseCampaignWithBackData.setNoticeUrl(noticeUrl + ((Object) sb));
                    }
                }
                return parseCampaignWithBackData;
            } catch (JSONException e4) {
                e4.printStackTrace();
                return campaignEx;
            } catch (Throwable th) {
                th.printStackTrace();
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
        } catch (JSONException e9) {
            e9.printStackTrace();
            return campaignEx;
        }
    }

    public k(Activity activity, CampaignEx campaignEx, List<CampaignEx> list) {
        this.f19077p = activity;
        this.f19080s = campaignEx;
        this.f19081t = list;
    }

    private boolean b(CampaignEx campaignEx) {
        com.mbridge.msdk.c.g b;
        try {
            String k6 = com.mbridge.msdk.foundation.controller.c.m().k();
            long aa = (TextUtils.isEmpty(k6) || (b = com.mbridge.msdk.c.h.a().b(k6)) == null) ? 0L : b.aa() * 1000;
            com.mbridge.msdk.videocommon.d.a b8 = com.mbridge.msdk.videocommon.d.b.a().b();
            long f9 = b8 != null ? b8.f() : 0L;
            if (campaignEx != null) {
                return campaignEx.isSpareOffer(f9, aa);
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
        this.f19079r = str;
    }

    private void a(JSONObject jSONObject, CampaignEx campaignEx) {
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            campaignEx.setCampaignUnitId(optString);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void a(int i9, String str) {
        super.a(i9, str);
        if (i9 != 2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            final String optString = jSONObject.optString(NotificationCompat.CATEGORY_EVENT, NotificationCompat.CATEGORY_EVENT);
            final String optString2 = jSONObject.optString("template", "-1");
            final String optString3 = jSONObject.optString(TtmlNode.TAG_LAYOUT, "-1");
            final String optString4 = jSONObject.optString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f19067j);
            final int l = z.l(this.f19077p.getApplication());
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.signal.a.k.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.foundation.db.o.a(com.mbridge.msdk.foundation.db.g.a(k.this.f19077p.getApplication())).a(new com.mbridge.msdk.foundation.entity.n("2000039", optString, optString2, optString3, optString4, k.this.f19080s.getId(), l, z.a(k.this.f19077p.getApplication(), l)));
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        } catch (Throwable th) {
            ad.b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void a(Activity activity) {
        this.f19077p = activity;
    }
}
