package com.mbridge.msdk.mbbanner.common.communication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.mediation.ads.e;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
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

/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Context> f13875b;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f13876c;

    /* renamed from: d, reason: collision with root package name */
    private String f13877d;

    /* renamed from: e, reason: collision with root package name */
    private String f13878e;

    /* renamed from: f, reason: collision with root package name */
    private int f13879f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.a f13880g;

    /* renamed from: h, reason: collision with root package name */
    private BannerExpandDialog f13881h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13882i = false;

    public a(Context context, String str, String str2) {
        this.f13877d = str;
        this.f13878e = str2;
        this.f13875b = new WeakReference<>(context);
    }

    public final void a(com.mbridge.msdk.mbbanner.common.b.a aVar) {
        if (aVar != null) {
            this.f13880g = aVar;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void b(Object obj, String str) {
        CampaignEx campaignEx;
        ad.b("BannerSignalCommunicationImpl", CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        try {
            List<CampaignEx> list = this.f13876c;
            if (list == null) {
                return;
            }
            if (list != null && list.size() > 0) {
                campaignEx = this.f13876c.get(0);
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
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                com.mbridge.msdk.mbbanner.common.b.a aVar = this.f13880g;
                if (aVar != null) {
                    aVar.a(campaignEx);
                }
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalCommunicationImpl", CampaignEx.JSON_NATIVE_VIDEO_CLICK, th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void c(Object obj, String str) {
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                g.a().a(obj, d.a(0));
                com.mbridge.msdk.mbbanner.common.b.a aVar = this.f13880g;
                if (aVar != null) {
                    aVar.b(optInt);
                }
            } catch (Throwable th2) {
                ad.b("BannerSignalCommunicationImpl", "readyStatus", th2);
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void close() {
        ad.b("BannerSignalCommunicationImpl", "close");
        try {
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f13880g;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalCommunicationImpl", "close", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void d(Object obj, String str) {
        ad.b("BannerSignalCommunicationImpl", "toggleCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                com.mbridge.msdk.mbbanner.common.b.a aVar = this.f13880g;
                if (aVar != null) {
                    aVar.a(optInt);
                }
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalCommunicationImpl", "toggleCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void e(Object obj, String str) {
        ad.b("BannerSignalCommunicationImpl", "triggerCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("state");
                com.mbridge.msdk.mbbanner.common.b.a aVar = this.f13880g;
                if (aVar != null) {
                    aVar.a(optString);
                }
                g.a().a(obj, d.a(0));
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalCommunicationImpl", "triggerCloseBtn", th2);
            g.a().a(obj, d.a(-1));
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void expand(String str, boolean z10) {
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
            bundle.putBoolean("shouldUseCustomClose", z10);
            WeakReference<Context> weakReference = this.f13875b;
            if (weakReference != null && (context = weakReference.get()) != null) {
                BannerExpandDialog bannerExpandDialog = this.f13881h;
                if (bannerExpandDialog != null && bannerExpandDialog.isShowing()) {
                    return;
                }
                BannerExpandDialog bannerExpandDialog2 = new BannerExpandDialog(context, bundle, this.f13880g);
                this.f13881h = bannerExpandDialog2;
                bannerExpandDialog2.setCampaignList(this.f13878e, this.f13876c);
                this.f13881h.show();
            }
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f13880g;
            if (aVar != null) {
                aVar.a(true);
            }
            String str4 = this.f13878e;
            CampaignEx mraidCampaign = getMraidCampaign();
            try {
                StringBuilder sb2 = new StringBuilder();
                if (mraidCampaign.isBidCampaign()) {
                    sb2.append("hb=1&");
                }
                sb2.append("key=");
                sb2.append(URLEncoder.encode("2000070", "utf-8"));
                sb2.append("&rid_n=");
                sb2.append(URLEncoder.encode(mraidCampaign.getRequestIdNotice(), "utf-8"));
                sb2.append("&rid=");
                sb2.append(URLEncoder.encode(mraidCampaign.getRequestId(), "utf-8"));
                sb2.append("&cid=");
                sb2.append(URLEncoder.encode(mraidCampaign.getId(), "utf-8"));
                sb2.append("&unit_id=");
                sb2.append(URLEncoder.encode(str4, "utf-8"));
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
        } catch (Throwable th2) {
            ad.b("BannerSignalCommunicationImpl", "expand", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f13876c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f13876c.get(0);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void i(Object obj, String str) {
        e.A("sendImpressions:", str, "BannerSignalCommunicationImpl");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                final ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String string = jSONArray.getString(i10);
                    for (CampaignEx campaignEx : this.f13876c) {
                        if (campaignEx.getId().equals(string)) {
                            b.a(this.f13878e, campaignEx, "banner");
                            arrayList.add(string);
                        }
                    }
                }
                com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.communication.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            j a = j.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a.a((String) it.next());
                            }
                        } catch (Exception e2) {
                            ad.b("BannerSignalCommunicationImpl", e2.getMessage());
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalCommunicationImpl", "sendImpressions", th2);
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
        } catch (Throwable th2) {
            ad.a("BannerSignalCommunicationImpl", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void k(Object obj, String str) {
        boolean z10;
        boolean z11;
        ad.a("BannerSignalCommunicationImpl", "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
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
                        List<CampaignEx> list = this.f13876c;
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
                        List<CampaignEx> list2 = this.f13876c;
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
                g.a().a(obj, d.a(0));
            } catch (Throwable th2) {
                ad.b("BannerSignalCommunicationImpl", "reportUrls", th2);
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void open(String str) {
        ad.b("BannerSignalCommunicationImpl", q.OPEN);
        try {
            ad.b("BannerSignalCommunicationImpl", str);
            if (this.f13876c.size() > 1) {
                com.mbridge.msdk.foundation.controller.c.m().c().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f13880g;
            if (aVar != null) {
                aVar.a(true, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalCommunicationImpl", q.OPEN, th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void useCustomClose(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        try {
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f13880g;
            if (aVar != null) {
                aVar.a(i10);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalCommunicationImpl", "useCustomClose", th2);
        }
    }

    public final void a(List<CampaignEx> list) {
        this.f13876c = list;
    }

    public final void a(int i10) {
        this.f13879f = i10;
    }

    public final void a() {
        if (this.f13880g != null) {
            this.f13880g = null;
        }
        if (this.f13881h != null) {
            this.f13881h = null;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void a(Object obj, String str) {
        ad.b("BannerSignalCommunicationImpl", "BANNER INIT INVOKE");
        try {
            JSONObject jSONObject = new JSONObject();
            i iVar = new i(com.mbridge.msdk.foundation.controller.c.m().c());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f13879f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", iVar.a());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f13876c));
            k d10 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f13878e);
            if (d10 == null) {
                d10 = k.d(this.f13878e);
            }
            if (!TextUtils.isEmpty(this.f13877d)) {
                d10.a(this.f13877d);
            }
            jSONObject.put("unitSetting", d10.x());
            String g10 = h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g10)) {
                jSONObject.put("appSetting", new JSONObject(g10));
            }
            jSONObject.put("sdk_info", com.mbridge.msdk.mbsignalcommon.base.d.a);
            ad.b("BannerSignalCommunicationImpl", "init" + jSONObject.toString());
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th2) {
            ad.b("BannerSignalCommunicationImpl", "init", th2);
        }
    }

    private static void a(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        boolean z10;
        String str5;
        File file;
        JSONObject jSONObject2 = new JSONObject();
        String str6 = PglCryptUtils.KEY_MESSAGE;
        String str7 = "code";
        int i11 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "params is null");
                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e2) {
                ad.a("BannerSignalCommunicationImpl", e2.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i12 = 0;
                while (i12 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i12);
                    String optString = jSONObject3.optString("ref", "");
                    int i13 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    JSONArray jSONArray3 = jSONArray;
                    if (i13 == i11 && !TextUtils.isEmpty(optString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        m a = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(optString);
                        if (a != null) {
                            i10 = length;
                            ad.a("BannerSignalCommunicationImpl", "VideoBean not null");
                            jSONObject5.put("type", 1);
                            str3 = str6;
                            try {
                                jSONObject5.put("videoDataLength", a.d());
                                String e10 = a.e();
                                str4 = str7;
                                if (TextUtils.isEmpty(e10)) {
                                    try {
                                        ad.a("BannerSignalCommunicationImpl", "VideoPath null");
                                        jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "");
                                        jSONObject5.put("path4Web", "");
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str = str3;
                                        str2 = str4;
                                        jSONObject2.put(str2, 1);
                                        jSONObject2.put(str, th.getLocalizedMessage());
                                        g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                                    }
                                } else {
                                    ad.a("BannerSignalCommunicationImpl", "VideoPath not null");
                                    jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, e10);
                                    jSONObject5.put("path4Web", e10);
                                }
                                if (a.b() == 5) {
                                    jSONObject5.put("downloaded", 1);
                                    z10 = false;
                                } else {
                                    z10 = false;
                                    jSONObject5.put("downloaded", 0);
                                }
                                jSONObject4.put(optString, jSONObject5);
                                jSONArray2.put(jSONObject4);
                            } catch (Throwable th3) {
                                th = th3;
                                str2 = str7;
                                str = str3;
                                jSONObject2.put(str2, 1);
                                jSONObject2.put(str, th.getLocalizedMessage());
                                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                            }
                        } else {
                            str3 = str6;
                            str4 = str7;
                            i10 = length;
                            z10 = false;
                            ad.a("BannerSignalCommunicationImpl", "VideoBean null");
                        }
                        i12++;
                        jSONArray = jSONArray3;
                        length = i10;
                        str6 = str3;
                        str7 = str4;
                        i11 = 1;
                    } else {
                        str3 = str6;
                        str4 = str7;
                        i10 = length;
                        z10 = false;
                        if (i13 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 2);
                            jSONObject6.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, H5DownLoadManager.getInstance().getResAddress(optString) == null ? "" : H5DownLoadManager.getInstance().getH5ResAddress(optString));
                            jSONObject4.put(optString, jSONObject6);
                            jSONArray2.put(jSONObject4);
                        } else if (i13 == 3 && !TextUtils.isEmpty(optString)) {
                            try {
                                file = new File(optString);
                            } catch (Throwable th4) {
                                if (MBridgeConstans.DEBUG) {
                                    th4.printStackTrace();
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
                        } else if (i13 == 4 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("type", 4);
                            jSONObject8.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, ah.a(optString) == null ? "" : ah.a(optString));
                            jSONObject4.put(optString, jSONObject8);
                            jSONArray2.put(jSONObject4);
                        }
                        i12++;
                        jSONArray = jSONArray3;
                        length = i10;
                        str6 = str3;
                        str7 = str4;
                        i11 = 1;
                    }
                }
                str3 = str6;
                str4 = str7;
                jSONObject2.put("resource", jSONArray2);
                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            str3 = PglCryptUtils.KEY_MESSAGE;
            str2 = "code";
            try {
                jSONObject2.put(str2, 1);
                str = str3;
            } catch (JSONException e11) {
                e = e11;
                str = str3;
            } catch (Throwable th5) {
                th = th5;
                str = str3;
                try {
                    jSONObject2.put(str2, 1);
                    jSONObject2.put(str, th.getLocalizedMessage());
                    g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                } catch (JSONException e12) {
                    ad.a("BannerSignalCommunicationImpl", e12.getMessage());
                    return;
                }
            }
            try {
                try {
                    jSONObject2.put(str, "resource is null");
                    g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                } catch (Throwable th6) {
                    th = th6;
                    jSONObject2.put(str2, 1);
                    jSONObject2.put(str, th.getLocalizedMessage());
                    g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                }
            } catch (JSONException e13) {
                e = e13;
                ad.a("BannerSignalCommunicationImpl", e.getMessage());
            }
        } catch (Throwable th7) {
            th = th7;
            str = str6;
            str2 = str7;
        }
    }
}
