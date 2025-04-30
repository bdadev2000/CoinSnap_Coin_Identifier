package com.mbridge.msdk.video.signal.communication;

import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.foundation.same.a.b;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.video.signal.a.j;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class BaseVideoCommunication extends AbsFeedBackForH5 implements IVideoCommunication {

    /* renamed from: a, reason: collision with root package name */
    protected IJSFactory f19099a;

    /* renamed from: e, reason: collision with root package name */
    private FastKV f19100e = null;

    private String a(int i9) {
        switch (i9) {
            case 1:
                return "sdk_info";
            case 2:
                return MBridgeConstans.PROPERTIES_UNIT_ID;
            case 3:
                return "appSetting";
            case 4:
                return "unitSetting";
            case 5:
                return "device";
            case 6:
                return "sdkSetting";
            default:
                return "";
        }
    }

    private String b(int i9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i9);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return "";
            }
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
        } catch (Throwable unused) {
            ad.b("JS-Video-Brigde", "code to string is error");
            return "";
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendSubView(Object obj, String str) {
        a(obj, str);
        try {
            d.c().i(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("appendSubView error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendViewTo(Object obj, String str) {
        a(obj, str);
        try {
            d.c().j(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("appendViewTo error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void bringViewToFront(Object obj, String str) {
        a(obj, str);
        try {
            d.c().m(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("bringViewToFront error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void broadcast(Object obj, String str) {
        a(obj, str);
        try {
            d.c().J(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("broadcast error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void cai(Object obj, String str) {
        int i9;
        ad.a("JS-Video-Brigde", "cai:" + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String optString = new JSONObject(str).optString("packageName");
                    if (TextUtils.isEmpty(optString)) {
                        com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "packageName is empty");
                    }
                    if (ai.c(c.m().c(), optString)) {
                        i9 = 1;
                    } else {
                        i9 = 2;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", com.mbridge.msdk.mbsignalcommon.communication.d.b);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", i9);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e4) {
                        com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, e4.getMessage());
                        ad.a("JS-Video-Brigde", e4.getMessage());
                    }
                } catch (JSONException e9) {
                    com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + e9.getLocalizedMessage());
                    ad.b("JS-Video-Brigde", "cai", e9);
                }
            } catch (Throwable th) {
                com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + th.getLocalizedMessage());
                ad.b("JS-Video-Brigde", "cai", th);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void clearAllCache(Object obj, String str) {
        com.mbridge.msdk.foundation.controller.d.a();
        if (this.f19100e == null) {
            try {
                this.f19100e = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "MBridgeH5CacheSP").build();
            } catch (Exception unused) {
                this.f19100e = null;
            }
        }
        FastKV fastKV = this.f19100e;
        if (fastKV != null) {
            try {
                try {
                    fastKV.clear();
                } catch (Exception unused2) {
                }
                if (obj != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", 0);
                    jSONObject.put("message", "Success");
                    g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    return;
                }
                return;
            } catch (Throwable th) {
                o.w("getAllCache error ", "JS-Video-Brigde", th);
                return;
            }
        }
        try {
            c.m().c().getSharedPreferences("MBridgeH5CacheSP", 0).edit().clear().apply();
            if (obj != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 0);
                jSONObject2.put("message", "Success");
                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            }
        } catch (Throwable th2) {
            o.w("getAllCache error ", "JS-Video-Brigde", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void click(Object obj, String str) {
        String str2;
        int i9;
        k kVar;
        ad.c("JS-Video-Brigde", CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    i9 = jSONObject.optInt("type");
                    str2 = jSONObject.optString("pt");
                } catch (JSONException e4) {
                    str2 = "";
                    e4.printStackTrace();
                    i9 = 1;
                }
                IJSFactory iJSFactory = this.f19099a;
                if (iJSFactory != null) {
                    iJSFactory.getJSCommon().click(i9, str2);
                    return;
                }
                if (obj != null) {
                    com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                    if ((aVar.b.getObject() instanceof k) && (kVar = (k) aVar.b.getObject()) != null) {
                        kVar.click(i9, str2);
                    }
                }
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "click error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeAd(Object obj, String str) {
        a(obj, str);
        try {
            d.c().I(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("closeAd error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeVideoOperte(Object obj, String str) {
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("close");
                int optInt2 = jSONObject.optInt("view_visible");
                ad.c("JS-Video-Brigde", "closeVideoOperte,close:" + optInt + ",viewVisible:" + optInt2);
                this.f19099a.getJSVideoModule().closeVideoOperate(optInt, optInt2);
                g.a().a(obj, b(0));
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "closeOperte error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeWeb(Object obj, String str) {
        L.B("type", str, "JS-Video-Brigde");
        try {
            if (!TextUtils.isEmpty(str) && this.f19099a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt(NotificationCompat.CATEGORY_STATUS);
                this.f19099a.getJSContainerModule().hideAlertWebview();
                this.f19099a.getJSVideoModule().hideAlertView(optInt);
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "closeWeb", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createNativeEC(Object obj, String str) {
        a(obj, str);
        try {
            d.c().O(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("createNativeEC error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createPlayerView(Object obj, String str) {
        a(obj, str);
        try {
            d.c().c(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("createPlayerView error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createSubPlayTemplateView(Object obj, String str) {
        a(obj, str);
        try {
            d.c().d(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("createSubPlayTemplateView error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createView(Object obj, String str) {
        a(obj, str);
        try {
            d.c().a(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("createView error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createWebview(Object obj, String str) {
        a(obj, str);
        try {
            d.c().b(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("createWebview error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void destroyComponent(Object obj, String str) {
        a(obj, str);
        try {
            d.c().e(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("destroyComponent error ", "JS-Video-Brigde", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0 A[Catch: all -> 0x00f4, TRY_ENTER, TryCatch #0 {all -> 0x00f4, blocks: (B:15:0x00dd, B:18:0x00f0, B:20:0x00fd, B:25:0x00f6), top: B:14:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fd A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {all -> 0x00f4, blocks: (B:15:0x00dd, B:18:0x00f0, B:20:0x00fd, B:25:0x00f6), top: B:14:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f6 A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:15:0x00dd, B:18:0x00f0, B:20:0x00fd, B:25:0x00f6), top: B:14:0x00dd }] */
    /* JADX WARN: Type inference failed for: r0v15, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v8, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getAllCache(java.lang.Object r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.communication.BaseVideoCommunication.getAllCache(java.lang.Object, java.lang.String):void");
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAppSetting(Object obj, String str) {
        JSONObject jSONObject;
        try {
            String optString = new JSONObject(str).optString("appid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(optString)) {
                String g9 = h.a().g(optString);
                if (TextUtils.isEmpty(g9)) {
                    h.a();
                    jSONObject = new JSONObject(i.a().aJ());
                } else {
                    jSONObject = new JSONObject(g9);
                    jSONObject.put("isDefault", 0);
                }
                if (obj != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("message", "Success");
                    jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
                } else {
                    jSONObject2.put("code", 1);
                    jSONObject2.put("message", "Get App Setting error, plz try again later.");
                }
            } else {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "Get App Setting error, because must give a appId.");
            }
            g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getAppSetting error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getComponentOptions(Object obj, String str) {
        a(obj, str);
        try {
            d.c().f(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("getComponentOptions error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCurrentProgress(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.f19099a;
            if (iJSFactory != null) {
                String currentProgress = iJSFactory.getJSVideoModule().getCurrentProgress();
                ad.c("JS-Video-Brigde", "getCurrentProgress:" + currentProgress);
                if (!TextUtils.isEmpty(currentProgress)) {
                    currentProgress = Base64.encodeToString(currentProgress.getBytes(), 2);
                }
                g.a().a(obj, currentProgress);
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getCurrentProgress error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCutout(Object obj, String str) {
        try {
            String i9 = this.f19099a.getJSCommon().i();
            ad.b("JS-Video-Brigde", i9);
            if (obj != null && !TextUtils.isEmpty(i9)) {
                g.a().a(obj, Base64.encodeToString(i9.getBytes(), 2));
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("message", "No notch data, plz try again later.");
                g.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getCutout error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getEncryptPrice(Object obj, String str) {
        String str2;
        try {
            String str3 = "not replaced";
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            int i9 = 1;
            if (TextUtils.isEmpty(str)) {
                str2 = "params is null";
            } else {
                JSONObject jSONObject3 = new JSONObject(str);
                String optString = jSONObject3.optString("unitid", "");
                String optString2 = jSONObject3.optString("requestId", "");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                    com.mbridge.msdk.foundation.entity.d b = b.b(optString, optString2);
                    if (b != null && b.c() == 1) {
                        str3 = "success";
                        jSONObject2.put("encrypt_p", b.b());
                        jSONObject2.put(com.mbridge.msdk.foundation.entity.b.KEY_IRLFA, 1);
                        i9 = 0;
                    }
                    str2 = str3;
                } else {
                    str2 = "params parsing exception";
                }
            }
            jSONObject.put("code", i9);
            jSONObject.put("message", str2);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getEncryptPrice error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getFileInfo(Object obj, String str) {
        a(obj, str);
        try {
            d.c().N(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getFileInfo error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardSetting(Object obj, String str) {
        try {
            JSONObject k6 = com.mbridge.msdk.videocommon.d.b.a().b().k();
            JSONObject jSONObject = new JSONObject();
            if (obj != null && k6 != null) {
                jSONObject.put("code", 0);
                jSONObject.put("message", "Success");
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, k6);
            } else {
                jSONObject.put("code", 1);
                jSONObject.put("message", "Get Reward Setting error, plz try again later.");
            }
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getRewardSetting error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("appid", "");
            String optString2 = jSONObject.optString("unitid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                JSONObject E8 = com.mbridge.msdk.videocommon.d.b.a().a(optString, optString2).E();
                if (obj != null && E8 != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("message", "Success");
                    jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, E8);
                } else {
                    jSONObject2.put("code", 1);
                    jSONObject2.put("message", "Get Reward Unit Setting error, plz try again later.");
                }
            } else {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "Get reward unit Setting error, because must give appId and unitId.");
            }
            g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getRewardUnitSetting error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getSDKInfo(Object obj, String str) {
        ad.c("JS-Video-Brigde", "getSDKInfo");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("type");
                JSONObject jSONObject = new JSONObject();
                int i9 = 0;
                if (this.f19099a != null) {
                    while (i9 < jSONArray.length()) {
                        int i10 = jSONArray.getInt(i9);
                        jSONObject.put(a(i10), this.f19099a.getJSCommon().g(i10));
                        i9++;
                    }
                } else if (obj != null) {
                    while (i9 < jSONArray.length()) {
                        int i11 = jSONArray.getInt(i9);
                        com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                        if (aVar.b.getObject() instanceof k) {
                            jSONObject.put(a(i11), ((k) aVar.b.getObject()).g(i11));
                        }
                        i9++;
                    }
                }
                g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                return;
            }
            g.a().b(obj, "params is null");
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getSDKInfo error", th);
            g.a().b(obj, "exception");
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("message", "Get Unit Setting error, RV/IV can not support this method.");
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getUnitSetting error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handleNativeObject(Object obj, String str) {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.c.a().a(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("handleNativeObject error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handlerH5Exception(Object obj, String str) {
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                ad.c("JS-Video-Brigde", "handlerH5Exception,params:" + str);
                this.f19099a.getJSCommon().handlerH5Exception(jSONObject.optInt("code", -999), jSONObject.optString("message", "h5 error"));
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "handlerH5Exception", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void hideView(Object obj, String str) {
        a(obj, str);
        try {
            d.c().n(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("hideView error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void increaseOfferFrequence(Object obj, String str) {
        a(obj, str);
        try {
            d.c().M(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("increaseOfferFrequence error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void init(Object obj, String str) {
        boolean z8;
        boolean z9;
        ad.c("JS-Video-Brigde", "init");
        try {
            IJSFactory iJSFactory = this.f19099a;
            int i9 = 1;
            if (iJSFactory != null) {
                String c9 = iJSFactory.getJSCommon().c();
                if (!TextUtils.isEmpty(c9)) {
                    c9 = Base64.encodeToString(c9.getBytes(), 2);
                }
                g.a().a(obj, c9);
                this.f19099a.getJSCommon().b(true);
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt("showTransparent");
                    int optInt2 = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                    int optInt3 = jSONObject.optInt("closeType");
                    int optInt4 = jSONObject.optInt("orientationType");
                    int optInt5 = jSONObject.optInt("webfront");
                    int optInt6 = jSONObject.optInt("showAlertRole");
                    com.mbridge.msdk.video.signal.d jSCommon = this.f19099a.getJSCommon();
                    if (optInt == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    jSCommon.a(z9);
                    this.f19099a.getJSCommon().b(optInt2);
                    this.f19099a.getJSCommon().c(optInt3);
                    this.f19099a.getJSCommon().d(optInt4);
                    this.f19099a.getJSCommon().e(optInt5);
                    com.mbridge.msdk.video.signal.d jSCommon2 = this.f19099a.getJSCommon();
                    if (optInt6 != 0) {
                        i9 = optInt6;
                    }
                    jSCommon2.h(i9);
                    return;
                }
                return;
            }
            if (obj != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b.getObject() instanceof k) {
                    k kVar = (k) aVar.b.getObject();
                    String c10 = kVar.c();
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject2 = new JSONObject(str);
                        int optInt7 = jSONObject2.optInt("showTransparent");
                        int optInt8 = jSONObject2.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                        int optInt9 = jSONObject2.optInt("closeType");
                        int optInt10 = jSONObject2.optInt("orientationType");
                        int optInt11 = jSONObject2.optInt("webfront");
                        int optInt12 = jSONObject2.optInt("showAlertRole");
                        if (optInt7 == 1) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        kVar.a(z8);
                        kVar.b(optInt8);
                        kVar.c(optInt9);
                        kVar.d(optInt10);
                        kVar.e(optInt11);
                        if (optInt12 != 0) {
                            i9 = optInt12;
                        }
                        kVar.h(i9);
                        ad.c("JS-Video-Brigde", "init jsCommon.setIsShowingTransparent = " + optInt7);
                    }
                    g.a().a(obj, Base64.encodeToString(c10.getBytes(), 2));
                }
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "init error", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.h
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        super.initialize(obj, windVaneWebView);
        if (obj instanceof IJSFactory) {
            this.f19099a = (IJSFactory) obj;
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewAbove(Object obj, String str) {
        a(obj, str);
        try {
            d.c().a(obj, new JSONObject(str), true);
        } catch (Throwable th) {
            o.w("insertViewAbove error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewBelow(Object obj, String str) {
        a(obj, str);
        try {
            d.c().b(obj, new JSONObject(str), true);
        } catch (Throwable th) {
            o.w("insertViewBelow error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void isSystemResume(Object obj, String str) {
        try {
            if (this.f19099a != null) {
                ad.c("JS-Video-Brigde", "isSystemResume,params:" + str);
                g.a().a(obj, b(this.f19099a.getActivityProxy().h()));
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "isSystemResume", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        L.B("ivRewardAdsWithoutVideo ： params", str, "JS-Video-Brigde");
        try {
            if (!TextUtils.isEmpty(str) && this.f19099a != null && !TextUtils.isEmpty(str)) {
                this.f19099a.getJSContainerModule().ivRewardAdsWithoutVideo(str);
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "ivRewardAdsWithoutVideo", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadads(Object obj, String str) {
        String str2;
        String str3;
        int i9;
        int i10;
        ad.c("JS-Video-Brigde", "loadads");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString(MBridgeConstans.PLACEMENT_ID);
                String optString2 = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                int optInt = jSONObject.optInt("type", 1);
                if (optInt > 2) {
                    optInt = 1;
                }
                i10 = jSONObject.optInt("adtype", 1);
                str3 = optString2;
                i9 = optInt;
                str2 = optString;
            } else {
                str2 = "";
                str3 = str2;
                i9 = 1;
                i10 = 1;
            }
            if (TextUtils.isEmpty(str3)) {
                g.a().a(obj, b(1));
                return;
            }
            if (obj != null) {
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b;
                if ((windVaneWebView instanceof WindVaneWebView) && windVaneWebView.getWebViewListener() != null) {
                    ((com.mbridge.msdk.mbsignalcommon.b.a) windVaneWebView.getWebViewListener()).a(windVaneWebView, str2, str3, i9, i10);
                }
            }
            g.a().a(obj, b(0));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "loadads error", th);
            g.a().a(obj, b(1));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadingResourceStatus(Object obj, String str) {
        a(obj, str);
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b;
                if (windVaneWebView != null && windVaneWebView.getWebViewListener() != null) {
                    windVaneWebView.getWebViewListener().c(windVaneWebView, optInt);
                }
            } catch (Throwable th) {
                o.w("loadingResourceStatus error ", "JS-Video-Brigde", th);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                ad.c("JS-Video-Brigde", "notifyCloseBtn,result:" + optInt);
                this.f19099a.getJSVideoModule().notifyCloseBtn(optInt);
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "notifyCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendSubView(Object obj, String str) {
        a(obj, str);
        try {
            d.c().k(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("appendSubView error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendViewTo(Object obj, String str) {
        a(obj, str);
        try {
            d.c().l(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("appendViewTo error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewAbove(Object obj, String str) {
        a(obj, str);
        try {
            d.c().s(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("insertViewAbove error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewBelow(Object obj, String str) {
        a(obj, str);
        try {
            d.c().b(obj, new JSONObject(str), false);
        } catch (Throwable th) {
            o.w("insertViewBelow error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void openURL(Object obj, String str) {
        ad.b("JS-Video-Brigde", "openURL:" + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    com.mbridge.msdk.click.c.c(this.b, optString);
                } else if (optInt == 2) {
                    com.mbridge.msdk.click.c.e(this.b, optString);
                }
            } catch (JSONException e4) {
                ad.b("JS-Video-Brigde", e4.getMessage());
            } catch (Throwable th) {
                ad.b("JS-Video-Brigde", th.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playVideoFinishOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str) && this.f19099a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("type");
                ad.c("JS-Video-Brigde", "playVideoFinishOperate,type: " + optInt);
                this.f19099a.getJSCommon().f(optInt);
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "playVideoFinishOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerGetMuteState(Object obj, String str) {
        a(obj, str);
        try {
            d.c().E(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("playerGetMuteState error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerMute(Object obj, String str) {
        a(obj, str);
        try {
            d.c().C(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("playerMute error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPause(Object obj, String str) {
        a(obj, str);
        try {
            d.c().y(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("playerPause error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPlay(Object obj, String str) {
        a(obj, str);
        try {
            d.c().x(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("playerPlay error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerResume(Object obj, String str) {
        a(obj, str);
        try {
            d.c().z(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("playerResume error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetRenderType(Object obj, String str) {
        a(obj, str);
        try {
            d.c().G(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("playerSetRenderType error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetSource(Object obj, String str) {
        a(obj, str);
        try {
            d.c().F(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("playerSetSource error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerStop(Object obj, String str) {
        a(obj, str);
        try {
            d.c().A(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("playerStop error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUnmute(Object obj, String str) {
        a(obj, str);
        try {
            d.c().D(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("playerUnmute error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUpdateFrame(Object obj, String str) {
        a(obj, str);
        try {
            d.c().B(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("playerUpdateFrame error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void preloadSubPlayTemplateView(Object obj, String str) {
        a(obj, str);
        try {
            if (this.f19099a != null) {
                d.c().H(obj, new JSONObject(str));
            } else {
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b;
                if (windVaneWebView instanceof WindVaneWebView) {
                    if (windVaneWebView.getWebViewListener() != null) {
                        ((com.mbridge.msdk.mbsignalcommon.b.a) windVaneWebView.getWebViewListener()).a(obj, str);
                        ad.a("JS-Video-Brigde", "preloadSubPlayTemplateView: RVWebViewListener");
                    } else {
                        ad.a("JS-Video-Brigde", "preloadSubPlayTemplateView: failed");
                    }
                }
            }
        } catch (Throwable th) {
            o.w("preloadSubPlayTemplateView error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressBarOperate(Object obj, String str) {
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                this.f19099a.getJSVideoModule().progressBarOperate(new JSONObject(str).optInt("view_visible"));
                g.a().a(obj, b(0));
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "progressOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressOperate(Object obj, String str) {
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_PROGRESS);
                int optInt2 = jSONObject.optInt("view_visible");
                ad.c("JS-Video-Brigde", "progressOperate,progress:" + optInt + ",viewVisible:" + optInt2);
                this.f19099a.getJSVideoModule().progressOperate(optInt, optInt2);
                g.a().a(obj, b(0));
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "progressOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reactDeveloper(Object obj, String str) {
        ad.a("JS-Video-Brigde", "reactDeveloper");
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                this.f19099a.getJSBTModule().reactDeveloper(obj, str);
            } else {
                g.a().b(obj, b(1));
            }
        } catch (Throwable th) {
            o.w("reactDeveloper error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                int optInt = new JSONObject(str).optInt("isReady", 1);
                if (aVar.b.getObject() instanceof k) {
                    ((k) aVar.b.getObject()).i(optInt);
                }
                WindVaneWebView windVaneWebView = aVar.b;
                if (windVaneWebView != null && windVaneWebView.getWebViewListener() != null) {
                    windVaneWebView.getWebViewListener().a(windVaneWebView, optInt);
                }
            } catch (Throwable th) {
                ad.b("JS-Video-Brigde", "readyStatus", th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d2 A[ADDED_TO_REGION] */
    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void removeCacheItem(java.lang.Object r11, java.lang.String r12) {
        /*
            r10 = this;
            com.mbridge.msdk.foundation.controller.d.a()
            com.mbridge.msdk.foundation.tools.FastKV r0 = r10.f19100e
            java.lang.String r1 = "MBridgeH5CacheSP"
            if (r0 != 0) goto L1e
            com.mbridge.msdk.foundation.tools.FastKV$Builder r0 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch: java.lang.Exception -> L1b
            com.mbridge.msdk.foundation.same.b.c r2 = com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = com.mbridge.msdk.foundation.same.b.e.a(r2)     // Catch: java.lang.Exception -> L1b
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L1b
            com.mbridge.msdk.foundation.tools.FastKV r0 = r0.build()     // Catch: java.lang.Exception -> L1b
            r10.f19100e = r0     // Catch: java.lang.Exception -> L1b
            goto L1e
        L1b:
            r0 = 0
            r10.f19100e = r0
        L1e:
            com.mbridge.msdk.foundation.tools.FastKV r0 = r10.f19100e
            java.lang.String r2 = "Delete Error, reason is : "
            java.lang.String r3 = "Delete Success"
            java.lang.String r4 = "key"
            java.lang.String r5 = "removeCacheItem error "
            java.lang.String r6 = "JS-Video-Brigde"
            r7 = 1
            r8 = 0
            java.lang.String r9 = ""
            if (r0 == 0) goto L71
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L4f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r12 = r0.getString(r4)     // Catch: java.lang.Throwable -> L4b
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L4d
            com.mbridge.msdk.foundation.tools.FastKV r0 = r10.f19100e     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r0.remove(r12)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            goto L4d
        L4b:
            r12 = move-exception
            goto L51
        L4d:
            r8 = r7
            goto Lbe
        L4f:
            r3 = r9
            goto Lbe
        L51:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.mbridge.msdk.foundation.tools.ad.b(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r3 = r0.toString()
            goto Lbe
        L71:
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Throwable -> L9e
            android.content.Context r0 = r0.c()     // Catch: java.lang.Throwable -> L9e
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r8)     // Catch: java.lang.Throwable -> L9e
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L4f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9e
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r12 = r1.getString(r4)     // Catch: java.lang.Throwable -> L9e
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L4d
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L9e
            android.content.SharedPreferences$Editor r12 = r0.remove(r12)     // Catch: java.lang.Throwable -> L9e
            r12.apply()     // Catch: java.lang.Throwable -> L9e
            goto L4d
        L9e:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.mbridge.msdk.foundation.tools.ad.b(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r3 = r0.toString()
        Lbe:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lfc
            r12.<init>()     // Catch: java.lang.Throwable -> Lfc
            java.lang.String r0 = "code"
            r1 = r8 ^ 1
            r12.put(r0, r1)     // Catch: java.lang.Throwable -> Lfc
            java.lang.String r0 = "message"
            r12.put(r0, r3)     // Catch: java.lang.Throwable -> Lfc
            r0 = 2
            if (r11 == 0) goto Le8
            if (r8 == 0) goto Le8
            com.mbridge.msdk.mbsignalcommon.windvane.g r1 = com.mbridge.msdk.mbsignalcommon.windvane.g.a()     // Catch: java.lang.Throwable -> Lfc
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Lfc
            byte[] r12 = r12.getBytes()     // Catch: java.lang.Throwable -> Lfc
            java.lang.String r12 = android.util.Base64.encodeToString(r12, r0)     // Catch: java.lang.Throwable -> Lfc
            r1.a(r11, r12)     // Catch: java.lang.Throwable -> Lfc
            goto Lff
        Le8:
            com.mbridge.msdk.mbsignalcommon.windvane.g r1 = com.mbridge.msdk.mbsignalcommon.windvane.g.a()     // Catch: java.lang.Throwable -> Lfc
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Lfc
            byte[] r12 = r12.getBytes()     // Catch: java.lang.Throwable -> Lfc
            java.lang.String r12 = android.util.Base64.encodeToString(r12, r0)     // Catch: java.lang.Throwable -> Lfc
            r1.b(r11, r12)     // Catch: java.lang.Throwable -> Lfc
            goto Lff
        Lfc:
            com.mbridge.msdk.foundation.tools.ad.b(r6, r5)
        Lff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.communication.BaseVideoCommunication.removeCacheItem(java.lang.Object, java.lang.String):void");
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeFromSuperView(Object obj, String str) {
        a(obj, str);
        try {
            d.c().h(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("removeFromSuperView error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportData(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportUrls(Object obj, String str) {
        ad.a("JS-Video-Brigde", "reportUrls");
        try {
            if (!TextUtils.isEmpty(str)) {
                IJSFactory iJSFactory = this.f19099a;
                if (iJSFactory != null && iJSFactory.getJSBTModule() != null) {
                    if (this.f19099a.getJSBTModule() instanceof j) {
                        this.f19099a.getJSBTModule().reportUrls(obj, str);
                    } else {
                        d.c().b(obj, str);
                    }
                } else {
                    d.c().b(obj, str);
                }
            } else {
                g.a().b(obj, b(1));
            }
        } catch (Throwable th) {
            o.w("reportUrls error ", "JS-Video-Brigde", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ea A[ADDED_TO_REGION] */
    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCacheItem(java.lang.Object r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.communication.BaseVideoCommunication.setCacheItem(java.lang.Object, java.lang.String):void");
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setScaleFitXY(Object obj, String str) {
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("fitxy");
                ad.c("JS-Video-Brigde", "setScaleFitXY,type:" + optInt);
                this.f19099a.getJSVideoModule().setScaleFitXY(optInt);
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "showVideoClickView error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setSubPlayTemplateInfo(Object obj, String str) {
        L.B("setSubPlayTemplateInfo : ", str, "JS-Video-Brigde");
        a(obj, str);
        try {
            d.c().K(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("setSubPlayTemplateInfo error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewAlpha(Object obj, String str) {
        a(obj, str);
        try {
            d.c().q(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("setViewAlpha error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewBgColor(Object obj, String str) {
        a(obj, str);
        try {
            d.c().p(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("setViewBgColor error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewRect(Object obj, String str) {
        a(obj, str);
        try {
            d.c().g(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("setViewRect error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewScale(Object obj, String str) {
        a(obj, str);
        try {
            d.c().r(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("setViewScale error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showAlertView(Object obj, String str) {
        ad.c("JS-Video-Brigde", "showAlertView");
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                this.f19099a.getJSVideoModule().showIVRewardAlertView(str);
                g.a().a(obj, "showAlertView", "");
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "showAlertView", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoClickView(Object obj, String str) {
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("type");
                ad.c("JS-Video-Brigde", "showVideoClickView,type:" + optInt);
                this.f19099a.getJSContainerModule().showVideoClickView(optInt);
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "showVideoClickView error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoLocation(Object obj, String str) {
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("margin_top", 0);
                int optInt2 = jSONObject.optInt("margin_left", 0);
                int optInt3 = jSONObject.optInt("view_width", 0);
                int optInt4 = jSONObject.optInt("view_height", 0);
                int optInt5 = jSONObject.optInt("radius", 0);
                int optInt6 = jSONObject.optInt("border_top", 0);
                int optInt7 = jSONObject.optInt("border_left", 0);
                int optInt8 = jSONObject.optInt("border_width", 0);
                int optInt9 = jSONObject.optInt("border_height", 0);
                ad.c("JS-Video-Brigde", "showVideoLocation,margin_top:" + optInt + ",marginLeft:" + optInt2 + ",viewWidth:" + optInt3 + ",viewHeight:" + optInt4 + ",radius:" + optInt5 + ",borderTop: " + optInt6 + ",borderLeft: " + optInt7 + ",borderWidth: " + optInt8 + ",borderHeight: " + optInt9);
                this.f19099a.getJSVideoModule().showVideoLocation(optInt, optInt2, optInt3, optInt4, optInt5, optInt6, optInt7, optInt8, optInt9);
                this.f19099a.getJSCommon().f();
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "showVideoLocation error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showView(Object obj, String str) {
        a(obj, str);
        try {
            d.c().o(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("showView error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void soundOperate(Object obj, String str) {
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                int optInt2 = jSONObject.optInt("view_visible");
                String optString = jSONObject.optString("pt", "");
                ad.c("JS-Video-Brigde", "soundOperate,mute:" + optInt + ",viewVisible:" + optInt2 + ",pt:" + optString);
                if (TextUtils.isEmpty(optString)) {
                    this.f19099a.getJSVideoModule().soundOperate(optInt, optInt2);
                } else {
                    this.f19099a.getJSVideoModule().soundOperate(optInt, optInt2, optString);
                }
                g.a().a(obj, b(0));
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "soundOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void statistics(Object obj, String str) {
        ad.c("JS-Video-Brigde", "statistics,params:" + str);
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                this.f19099a.getJSCommon().a(jSONObject.optInt("type"), jSONObject.optString(DataSchemeDataSource.SCHEME_DATA));
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "statistics error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                ad.c("JS-Video-Brigde", "toggleCloseBtn,result:" + optInt);
                int i9 = 2;
                if (optInt != 1) {
                    if (optInt == 2) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                }
                this.f19099a.getJSVideoModule().closeVideoOperate(0, i9);
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "toggleCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void triggerCloseBtn(Object obj, String str) {
        ad.c("JS-Video-Brigde", "triggerCloseBtn");
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str) && new JSONObject(str).optString("state").equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                this.f19099a.getJSVideoModule().closeVideoOperate(1, -1);
                g.a().a(obj, b(0));
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "triggerCloseBtn error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void videoOperate(Object obj, String str) {
        try {
            if (this.f19099a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("pause_or_resume");
                ad.c("JS-Video-Brigde", "videoOperate,pauseOrResume:" + optInt);
                this.f19099a.getJSVideoModule().videoOperate(optInt);
                g.a().a(obj, b(0));
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "videoOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewFireEvent(Object obj, String str) {
        a(obj, str);
        try {
            d.c().L(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("setSubPlayTemplateInfo error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoBack(Object obj, String str) {
        a(obj, str);
        try {
            d.c().v(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("webviewGoBack error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoForward(Object obj, String str) {
        a(obj, str);
        try {
            d.c().w(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("webviewGoForward error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewLoad(Object obj, String str) {
        a(obj, str);
        try {
            d.c().t(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("webviewLoad error ", "JS-Video-Brigde", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewReload(Object obj, String str) {
        a(obj, str);
        try {
            d.c().u(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.w("webviewReload error ", "JS-Video-Brigde", th);
        }
    }

    private void a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("message", "params is null");
                g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Exception e4) {
            ad.a("JS-Video-Brigde", e4.getMessage());
        }
    }
}
