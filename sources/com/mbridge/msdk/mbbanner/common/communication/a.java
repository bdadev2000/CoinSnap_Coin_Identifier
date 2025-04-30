package com.mbridge.msdk.mbbanner.common.communication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.same.a.b;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.i;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.communication.c;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.vungle.ads.internal.presenter.q;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a extends c {
    private WeakReference<Context> b;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f16352c;

    /* renamed from: d, reason: collision with root package name */
    private String f16353d;

    /* renamed from: e, reason: collision with root package name */
    private String f16354e;

    /* renamed from: f, reason: collision with root package name */
    private int f16355f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.a f16356g;

    /* renamed from: h, reason: collision with root package name */
    private BannerExpandDialog f16357h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16358i = false;

    public a(Context context, String str, String str2) {
        this.f16353d = str;
        this.f16354e = str2;
        this.b = new WeakReference<>(context);
    }

    public final void a(com.mbridge.msdk.mbbanner.common.b.a aVar) {
        if (aVar != null) {
            this.f16356g = aVar;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void b(Object obj, String str) {
        CampaignEx campaignEx;
        ad.b("BannerSignalCommunicationImpl", CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        try {
            List<CampaignEx> list = this.f16352c;
            if (list == null) {
                return;
            }
            if (list != null && list.size() > 0) {
                campaignEx = this.f16352c.get(0);
            } else {
                campaignEx = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject campaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                    JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
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
                com.mbridge.msdk.mbbanner.common.b.a aVar = this.f16356g;
                if (aVar != null) {
                    aVar.a(campaignEx);
                }
            }
        } catch (Throwable th) {
            ad.b("BannerSignalCommunicationImpl", CampaignEx.JSON_NATIVE_VIDEO_CLICK, th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void c(Object obj, String str) {
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                g.a().a(obj, d.a(0));
                com.mbridge.msdk.mbbanner.common.b.a aVar = this.f16356g;
                if (aVar != null) {
                    aVar.b(optInt);
                }
            } catch (Throwable th) {
                ad.b("BannerSignalCommunicationImpl", "readyStatus", th);
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void close() {
        ad.b("BannerSignalCommunicationImpl", "close");
        try {
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f16356g;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable th) {
            ad.b("BannerSignalCommunicationImpl", "close", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void d(Object obj, String str) {
        ad.b("BannerSignalCommunicationImpl", "toggleCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                com.mbridge.msdk.mbbanner.common.b.a aVar = this.f16356g;
                if (aVar != null) {
                    aVar.a(optInt);
                }
            }
        } catch (Throwable th) {
            ad.b("BannerSignalCommunicationImpl", "toggleCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void e(Object obj, String str) {
        ad.b("BannerSignalCommunicationImpl", "triggerCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("state");
                com.mbridge.msdk.mbbanner.common.b.a aVar = this.f16356g;
                if (aVar != null) {
                    aVar.a(optString);
                }
                g.a().a(obj, d.a(0));
            }
        } catch (Throwable th) {
            ad.b("BannerSignalCommunicationImpl", "triggerCloseBtn", th);
            g.a().a(obj, d.a(-1));
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void expand(String str, boolean z8) {
        Context context;
        String str2;
        try {
            String str3 = "";
            if (getMraidCampaign() != null) {
                if (TextUtils.isEmpty(getMraidCampaign().getBannerHtml())) {
                    str2 = getMraidCampaign().getBannerUrl();
                } else {
                    str2 = "file:////" + getMraidCampaign().getBannerHtml();
                }
                str3 = str2;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str3 = str;
            }
            bundle.putString("url", str3);
            bundle.putBoolean("shouldUseCustomClose", z8);
            WeakReference<Context> weakReference = this.b;
            if (weakReference != null && (context = weakReference.get()) != null) {
                BannerExpandDialog bannerExpandDialog = this.f16357h;
                if (bannerExpandDialog != null && bannerExpandDialog.isShowing()) {
                    return;
                }
                BannerExpandDialog bannerExpandDialog2 = new BannerExpandDialog(context, bundle, this.f16356g);
                this.f16357h = bannerExpandDialog2;
                bannerExpandDialog2.setCampaignList(this.f16354e, this.f16352c);
                this.f16357h.show();
            }
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f16356g;
            if (aVar != null) {
                aVar.a(true);
            }
            String str4 = this.f16354e;
            CampaignEx mraidCampaign = getMraidCampaign();
            try {
                StringBuilder sb = new StringBuilder();
                if (mraidCampaign.isBidCampaign()) {
                    sb.append("hb=1&");
                }
                sb.append("key=");
                sb.append(URLEncoder.encode("2000070", "utf-8"));
                sb.append("&rid_n=");
                sb.append(URLEncoder.encode(mraidCampaign.getRequestIdNotice(), "utf-8"));
                sb.append("&rid=");
                sb.append(URLEncoder.encode(mraidCampaign.getRequestId(), "utf-8"));
                sb.append("&cid=");
                sb.append(URLEncoder.encode(mraidCampaign.getId(), "utf-8"));
                sb.append("&unit_id=");
                sb.append(URLEncoder.encode(str4, "utf-8"));
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
        } catch (Throwable th) {
            ad.b("BannerSignalCommunicationImpl", "expand", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f16352c;
        if (list != null && list.size() > 0) {
            return this.f16352c.get(0);
        }
        return null;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void i(Object obj, String str) {
        L.C("sendImpressions:", str, "BannerSignalCommunicationImpl");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                final ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    String string = jSONArray.getString(i9);
                    for (CampaignEx campaignEx : this.f16352c) {
                        if (campaignEx.getId().equals(string)) {
                            b.a(this.f16354e, campaignEx, "banner");
                            arrayList.add(string);
                        }
                    }
                }
                com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.communication.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            j a6 = j.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a6.a((String) it.next());
                            }
                        } catch (Exception e4) {
                            ad.b("BannerSignalCommunicationImpl", e4.getMessage());
                        }
                    }
                });
            }
        } catch (Throwable th) {
            ad.b("BannerSignalCommunicationImpl", "sendImpressions", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void j(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is empty");
            return;
        }
        try {
            a(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.a("BannerSignalCommunicationImpl", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void k(Object obj, String str) {
        boolean z8;
        boolean z9;
        ad.a("BannerSignalCommunicationImpl", "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
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
                        List<CampaignEx> list = this.f16352c;
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
                        List<CampaignEx> list2 = this.f16352c;
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
                g.a().a(obj, d.a(0));
            } catch (Throwable th) {
                ad.b("BannerSignalCommunicationImpl", "reportUrls", th);
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void open(String str) {
        ad.b("BannerSignalCommunicationImpl", q.OPEN);
        try {
            ad.b("BannerSignalCommunicationImpl", str);
            if (this.f16352c.size() > 1) {
                com.mbridge.msdk.foundation.controller.c.m().c().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f16356g;
            if (aVar != null) {
                aVar.a(true, str);
            }
        } catch (Throwable th) {
            ad.b("BannerSignalCommunicationImpl", q.OPEN, th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void useCustomClose(boolean z8) {
        int i9;
        if (z8) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        try {
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f16356g;
            if (aVar != null) {
                aVar.a(i9);
            }
        } catch (Throwable th) {
            ad.b("BannerSignalCommunicationImpl", "useCustomClose", th);
        }
    }

    public final void a(List<CampaignEx> list) {
        this.f16352c = list;
    }

    public final void a(int i9) {
        this.f16355f = i9;
    }

    public final void a() {
        if (this.f16356g != null) {
            this.f16356g = null;
        }
        if (this.f16357h != null) {
            this.f16357h = null;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void a(Object obj, String str) {
        ad.b("BannerSignalCommunicationImpl", "BANNER INIT INVOKE");
        try {
            JSONObject jSONObject = new JSONObject();
            i iVar = new i(com.mbridge.msdk.foundation.controller.c.m().c());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f16355f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", iVar.a());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f16352c));
            k d2 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f16354e);
            if (d2 == null) {
                d2 = k.d(this.f16354e);
            }
            if (!TextUtils.isEmpty(this.f16353d)) {
                d2.a(this.f16353d);
            }
            jSONObject.put("unitSetting", d2.x());
            String g9 = h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g9)) {
                jSONObject.put("appSetting", new JSONObject(g9));
            }
            jSONObject.put("sdk_info", com.mbridge.msdk.mbsignalcommon.base.d.f16585a);
            ad.b("BannerSignalCommunicationImpl", "init" + jSONObject.toString());
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            ad.b("BannerSignalCommunicationImpl", "init", th);
        }
    }

    private static void a(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        int i9;
        boolean z8;
        String str5;
        File file;
        JSONObject jSONObject2 = new JSONObject();
        String str6 = "message";
        String str7 = "code";
        int i10 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "params is null");
                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e4) {
                ad.a("BannerSignalCommunicationImpl", e4.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put("message", "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray != null) {
                try {
                    if (jSONArray.length() > 0) {
                        JSONArray jSONArray2 = new JSONArray();
                        int length = jSONArray.length();
                        int i11 = 0;
                        while (i11 < length) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                            String optString = jSONObject3.optString("ref", "");
                            int i12 = jSONObject3.getInt("type");
                            JSONObject jSONObject4 = new JSONObject();
                            JSONArray jSONArray3 = jSONArray;
                            if (i12 == i10 && !TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject5 = new JSONObject();
                                m a6 = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(optString);
                                if (a6 != null) {
                                    i9 = length;
                                    ad.a("BannerSignalCommunicationImpl", "VideoBean not null");
                                    jSONObject5.put("type", 1);
                                    str3 = str6;
                                    try {
                                        jSONObject5.put("videoDataLength", a6.d());
                                        String e9 = a6.e();
                                        str4 = str7;
                                        if (TextUtils.isEmpty(e9)) {
                                            try {
                                                ad.a("BannerSignalCommunicationImpl", "VideoPath null");
                                                jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "");
                                                jSONObject5.put("path4Web", "");
                                            } catch (Throwable th) {
                                                th = th;
                                                str = str3;
                                                str2 = str4;
                                                try {
                                                    jSONObject2.put(str2, 1);
                                                    jSONObject2.put(str, th.getLocalizedMessage());
                                                    g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                                                } catch (JSONException e10) {
                                                    ad.a("BannerSignalCommunicationImpl", e10.getMessage());
                                                    return;
                                                }
                                            }
                                        } else {
                                            ad.a("BannerSignalCommunicationImpl", "VideoPath not null");
                                            jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, e9);
                                            jSONObject5.put("path4Web", e9);
                                        }
                                        if (a6.b() == 5) {
                                            jSONObject5.put("downloaded", 1);
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                            jSONObject5.put("downloaded", 0);
                                        }
                                        jSONObject4.put(optString, jSONObject5);
                                        jSONArray2.put(jSONObject4);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str4 = str7;
                                        str = str3;
                                        str2 = str4;
                                        jSONObject2.put(str2, 1);
                                        jSONObject2.put(str, th.getLocalizedMessage());
                                        g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                                    }
                                } else {
                                    str3 = str6;
                                    str4 = str7;
                                    i9 = length;
                                    z8 = false;
                                    ad.a("BannerSignalCommunicationImpl", "VideoBean null");
                                }
                                i11++;
                                jSONArray = jSONArray3;
                                length = i9;
                                str6 = str3;
                                str7 = str4;
                                i10 = 1;
                            } else {
                                str3 = str6;
                                str4 = str7;
                                i9 = length;
                                z8 = false;
                                if (i12 == 2 && !TextUtils.isEmpty(optString)) {
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.put("type", 2);
                                    jSONObject6.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, H5DownLoadManager.getInstance().getResAddress(optString) == null ? "" : H5DownLoadManager.getInstance().getH5ResAddress(optString));
                                    jSONObject4.put(optString, jSONObject6);
                                    jSONArray2.put(jSONObject4);
                                } else if (i12 == 3 && !TextUtils.isEmpty(optString)) {
                                    try {
                                        file = new File(optString);
                                    } catch (Throwable th3) {
                                        if (MBridgeConstans.DEBUG) {
                                            th3.printStackTrace();
                                        }
                                    }
                                    if (file.exists() && file.isFile() && file.canRead()) {
                                        ad.a("BannerSignalCommunicationImpl", "getFileInfo Mraid file " + optString);
                                        str5 = "file:////" + optString;
                                        JSONObject jSONObject7 = new JSONObject();
                                        jSONObject7.put("type", 3);
                                        jSONObject7.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str5);
                                        jSONObject4.put(optString, jSONObject7);
                                        jSONArray2.put(jSONObject4);
                                    }
                                    str5 = "";
                                    JSONObject jSONObject72 = new JSONObject();
                                    jSONObject72.put("type", 3);
                                    jSONObject72.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str5);
                                    jSONObject4.put(optString, jSONObject72);
                                    jSONArray2.put(jSONObject4);
                                } else if (i12 == 4 && !TextUtils.isEmpty(optString)) {
                                    JSONObject jSONObject8 = new JSONObject();
                                    jSONObject8.put("type", 4);
                                    jSONObject8.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, ah.a(optString) == null ? "" : ah.a(optString));
                                    jSONObject4.put(optString, jSONObject8);
                                    jSONArray2.put(jSONObject4);
                                }
                                i11++;
                                jSONArray = jSONArray3;
                                length = i9;
                                str6 = str3;
                                str7 = str4;
                                i10 = 1;
                            }
                        }
                        str3 = str6;
                        str4 = str7;
                        jSONObject2.put("resource", jSONArray2);
                        g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str3 = str6;
                }
            }
            str2 = "code";
            str = 1;
        } catch (Throwable th5) {
            th = th5;
            str = "message";
            str2 = "code";
        }
        try {
            try {
                jSONObject2.put(str2, 1);
                str = "message";
            } catch (JSONException e11) {
                e = e11;
                str = "message";
            } catch (Throwable th6) {
                th = th6;
                str = "message";
                jSONObject2.put(str2, 1);
                jSONObject2.put(str, th.getLocalizedMessage());
                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            }
            try {
                jSONObject2.put(str, "resource is null");
                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (JSONException e12) {
                e = e12;
                ad.a("BannerSignalCommunicationImpl", e.getMessage());
            }
        } catch (Throwable th7) {
            th = th7;
            jSONObject2.put(str2, 1);
            jSONObject2.put(str, th.getLocalizedMessage());
            g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
    }
}
