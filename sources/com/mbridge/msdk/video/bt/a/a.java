package com.mbridge.msdk.video.bt.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.mediation.ads.e;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ar;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.b;
import com.mbridge.msdk.video.bt.module.BTBaseView;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC;
import com.mbridge.msdk.video.bt.module.MBridgeBTVideoView;
import com.mbridge.msdk.video.bt.module.MBridgeBTWebView;
import com.mbridge.msdk.video.signal.a.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {
    private static ConcurrentHashMap<String, LinkedHashMap<String, View>> a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static LinkedHashMap<String, String> f15567b = new LinkedHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static LinkedHashMap<String, CampaignEx> f15568c = new LinkedHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static LinkedHashMap<String, com.mbridge.msdk.videocommon.d.c> f15569d = new LinkedHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static LinkedHashMap<String, String> f15570e = new LinkedHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static LinkedHashMap<String, Integer> f15571f = new LinkedHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static LinkedHashMap<String, Activity> f15572g = new LinkedHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static volatile int f15573h = 10000;

    /* renamed from: i, reason: collision with root package name */
    private static int f15574i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static int f15575j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static String f15576k = "";

    /* renamed from: l, reason: collision with root package name */
    private static int f15577l;

    /* renamed from: m, reason: collision with root package name */
    private static int f15578m;

    /* renamed from: n, reason: collision with root package name */
    private static int f15579n;

    /* renamed from: o, reason: collision with root package name */
    private static int f15580o;

    /* renamed from: p, reason: collision with root package name */
    private static int f15581p;

    private String h(String str) {
        return f15567b.containsKey(str) ? f15567b.get(str) : "";
    }

    public final void A(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).stop();
                    a(obj, optString2);
                    ad.a("OperateViews", "playerStop success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    ad.a("OperateViews", "playerStop failed instanceId is not player instanceId = " + optString2);
                    return;
                }
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerStop failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("playerStop failed: "), "OperateViews");
        }
    }

    public final void B(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
            }
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
        }
    }

    public final void C(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    if (((MBridgeBTVideoView) view).playMute()) {
                        a(obj, optString2);
                        ad.a("OperateViews", "playerMute success");
                        return;
                    } else {
                        c(obj, "set mute failed");
                        ad.a("OperateViews", "playerMute failed set mute failed");
                        return;
                    }
                }
                c(obj, "instanceId is not player");
                ad.a("OperateViews", "playerMute failed: instanceId is not player");
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "playerMute failed: instanceId is not exist");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("playerMute failed: "), "OperateViews");
        }
    }

    public final void D(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    if (((MBridgeBTVideoView) view).playUnMute()) {
                        a(obj, optString2);
                        a(obj, "onUnmute", optString2);
                        ad.a("OperateViews", "playerUnmute successed");
                        return;
                    } else {
                        a(obj, "set unmute failed");
                        ad.a("OperateViews", "playerUnmute failed: set unmute failed");
                        return;
                    }
                }
                c(obj, "instanceId is not player");
                ad.a("OperateViews", "playerUnmute failed: instanceId is not player");
                return;
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerUnmute failed: instanceId not exit");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("playerUnmute failed: "), "OperateViews");
        }
    }

    public final void E(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    int mute = ((MBridgeBTVideoView) view).getMute();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", f15574i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", optString2);
                    jSONObject3.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, mute);
                    jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject3);
                    g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    ad.a("OperateViews", "playerGetMuteState successed mute = " + mute);
                    return;
                }
                c(obj, "instanceId is not player");
                ad.a("OperateViews", "playerGetMuteState failed instanceId is not player");
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "playerGetMuteState failed instanceId not exist");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("playerGetMuteState failed: "), "OperateViews");
        }
    }

    public final void F(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
            }
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
        }
    }

    public final void G(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            jSONObject.optString("id");
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
            } else {
                c(obj, "android mediaPlayer not support setScaleType");
            }
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
        }
    }

    public final void H(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).preload();
                    a(obj, optString2);
                    return;
                } else {
                    c(obj, "view not exist");
                    return;
                }
            }
            c(obj, "instanceId not exist");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("preloadSubPlayTemplateView failed: "), "OperateViews");
        }
    }

    public final void I(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        b unused;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.size() > 0) {
                MBridgeBTContainer mBridgeBTContainer = null;
                for (View view : b3.values()) {
                    if (view instanceof MBridgeBTContainer) {
                        mBridgeBTContainer = (MBridgeBTContainer) view;
                    } else if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onDestory();
                    } else if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).getInstanceId();
                        unused = b.a.a;
                        ((MBridgeBTVideoView) view).onDestory();
                    } else if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onDestroy();
                    }
                }
                if (mBridgeBTContainer != null) {
                    mBridgeBTContainer.onAdClose();
                    a.remove(b3);
                    b3.clear();
                    a.remove(optString + "_" + h10);
                    a(obj, optString2);
                    return;
                }
                c(obj, "not found MBridgeBTContainer");
                ad.a("OperateViews", "closeAd successed");
                return;
            }
            c(obj, "unitId or instanceId not exist");
            ad.a("OperateViews", "closeAd failed: unitId or instanceId not exist unitId = " + optString);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("closeAd failed: "), "OperateViews");
        }
    }

    public final void J(Object obj, JSONObject jSONObject) {
        String str;
        try {
            WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b;
            if (windVaneWebView == null) {
                str = "";
            } else {
                str = windVaneWebView.getRid();
            }
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            LinkedHashMap<String, View> b3 = b(optString, str);
            if (b3 != null && b3.size() > 0) {
                for (View view : b3.values()) {
                    if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).broadcast(optString2, optJSONObject);
                    }
                    if (view instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) view).broadcast(optString2, optJSONObject);
                    }
                }
                a(obj, "");
                return;
            }
            c(obj, "unitId not exist");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("broadcast failed: "), "OperateViews");
        }
    }

    public final void K(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        com.mbridge.msdk.videocommon.b.c cVar;
        String str3;
        try {
            WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b;
            if (windVaneWebView == null) {
                str = "";
            } else {
                str = windVaneWebView.getRid();
            }
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            String optString3 = optJSONObject.optString("userId");
            boolean optBoolean = optJSONObject.optBoolean("expired");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("reward");
            String optString4 = optJSONObject.optString("extra");
            if (optJSONObject2 != null) {
                str2 = "setSubPlayTemplateInfo failed: unitId not exist instanceId = ";
                cVar = new com.mbridge.msdk.videocommon.b.c(optJSONObject2.optString("name"), optJSONObject2.optInt("amount"));
                str3 = optJSONObject2.optString("id");
            } else {
                str2 = "setSubPlayTemplateInfo failed: unitId not exist instanceId = ";
                cVar = null;
                str3 = "";
            }
            LinkedHashMap<String, View> b3 = b(optString, str);
            if (b3.size() > 0 && f15570e.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view instanceof MBTempContainer) {
                    MBTempContainer mBTempContainer = (MBTempContainer) view;
                    mBTempContainer.setReward(cVar);
                    mBTempContainer.setUserId(optString3);
                    mBTempContainer.setRewardId(str3);
                    mBTempContainer.setCampaignExpired(optBoolean);
                    if (!TextUtils.isEmpty(optString4)) {
                        mBTempContainer.setDeveloperExtraData(optString4);
                    }
                    a(obj, optString2);
                    ad.a("OperateViews", "setSubPlayTemplateInfo success instanceId = " + optString2);
                    return;
                }
                c(obj, "instanceId not exist");
                ad.a("OperateViews", "setSubPlayTemplateInfo failed: instanceId not exist instanceId = " + optString2);
                return;
            }
            c(obj, "unitId not exist");
            ad.a("OperateViews", str2 + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("setSubPlayTemplateInfo failed: "), "OperateViews");
        }
    }

    public final void L(Object obj, JSONObject jSONObject) {
        try {
            String str = "";
            WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b;
            if (windVaneWebView != null) {
                str = windVaneWebView.getRid();
            }
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            String optString3 = optJSONObject.optString("eventName");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("eventData");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            LinkedHashMap<String, View> b3 = b(optString, str);
            if (b3.size() > 0) {
                View view = b3.get(optString2);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof WindVaneWebView) {
                            g.a().a((WebView) childAt, optString3, Base64.encodeToString(optJSONObject2.toString().getBytes(), 2));
                            a(obj, optString2);
                            ad.a("OperateViews", "webviewFireEvent instanceId = " + optString2);
                            return;
                        }
                    }
                }
                c(obj, "instanceId not exist");
                ad.a("OperateViews", "webviewFireEvent failed: instanceId not exist instanceId = " + optString2);
                return;
            }
            c(obj, "unitId not exist");
            ad.a("OperateViews", "webviewFireEvent failed: unitId not exist");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("webviewFireEvent failed: "), "OperateViews");
        }
    }

    public final void M(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            final CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject);
            if (parseCampaignWithBackData == null) {
                c(obj, "data camapign is empty");
            } else {
                new Thread(new Runnable() { // from class: com.mbridge.msdk.video.bt.a.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            j a10 = j.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                            if (a10 != null) {
                                if (!a10.b(parseCampaignWithBackData.getId())) {
                                    com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                                    gVar.a(parseCampaignWithBackData.getId());
                                    gVar.b(parseCampaignWithBackData.getFca());
                                    gVar.c(parseCampaignWithBackData.getFcb());
                                    gVar.a(0);
                                    gVar.d(1);
                                    gVar.a(System.currentTimeMillis());
                                    a10.a(gVar);
                                } else {
                                    a10.a(parseCampaignWithBackData.getId());
                                }
                            }
                            a.a(a.this, parseCampaignWithBackData.getCampaignUnitId(), parseCampaignWithBackData);
                        } catch (Throwable th2) {
                            ad.b("OperateViews", th2.getMessage(), th2);
                        }
                    }
                }).start();
                a(obj, "");
            }
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
        }
    }

    public final void N(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        boolean z10;
        String a10;
        String str5;
        File file;
        String h5ResAddress;
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
                ad.a("OperateViews", e2.getMessage());
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
                        m a11 = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(optString);
                        if (a11 != null) {
                            i10 = length;
                            ad.a("OperateViews", "VideoBean not null");
                            jSONObject5.put("type", 1);
                            str3 = str6;
                            try {
                                jSONObject5.put("videoDataLength", a11.d());
                                String e10 = a11.e();
                                str4 = str7;
                                if (TextUtils.isEmpty(e10)) {
                                    try {
                                        ad.a("OperateViews", "VideoPath null");
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
                                    ad.a("OperateViews", "VideoPath not null");
                                    jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, e10);
                                    jSONObject5.put("path4Web", e10);
                                }
                                if (a11.b() == 5) {
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
                            ad.a("OperateViews", "VideoBean null");
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
                            if (H5DownLoadManager.getInstance().getH5ResAddress(optString) == null) {
                                h5ResAddress = "";
                            } else {
                                h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(optString);
                            }
                            jSONObject6.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, h5ResAddress);
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
                                ad.a("OperateViews", "getFileInfo Mraid file " + optString);
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
                            if (ah.a(optString) == null) {
                                a10 = "";
                            } else {
                                a10 = ah.a(optString);
                            }
                            jSONObject8.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, a10);
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
                    ad.a("OperateViews", e12.getMessage());
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
                ad.a("OperateViews", e.getMessage());
            }
        } catch (Throwable th7) {
            th = th7;
            str = str6;
            str2 = str7;
        }
    }

    public final void O(Object obj, JSONObject jSONObject) {
        ad.a("OperateViews", "createNativeEC:" + jSONObject);
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String str = "";
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                if (parseCampaignWithBackData != null && !TextUtils.isEmpty(optString)) {
                    parseCampaignWithBackData.setCampaignUnitId(optString);
                    str = parseCampaignWithBackData.getRequestId();
                }
                com.mbridge.msdk.videocommon.d.c a10 = com.mbridge.msdk.videocommon.d.c.a(optJSONObject.optJSONObject("unitSetting"));
                if (a10 != null) {
                    a10.a(optString);
                }
                MBridgeBTNativeEC mBridgeBTNativeEC = new MBridgeBTNativeEC(com.mbridge.msdk.foundation.controller.c.m().c());
                mBridgeBTNativeEC.setCampaign(parseCampaignWithBackData);
                k kVar = new k(null, parseCampaignWithBackData);
                kVar.a(optString);
                mBridgeBTNativeEC.setJSCommon(kVar);
                mBridgeBTNativeEC.setUnitId(optString);
                mBridgeBTNativeEC.setRewardUnitSetting(a10);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b;
                if (windVaneWebView != null) {
                    str = windVaneWebView.getRid();
                    mBridgeBTNativeEC.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> b3 = b(optString, str);
                String a11 = a();
                f15567b.put(a11, str);
                mBridgeBTNativeEC.setInstanceId(a11);
                b3.put(a11, mBridgeBTNativeEC);
                mBridgeBTNativeEC.preLoadData();
                if (parseCampaignWithBackData == null) {
                    c(obj, "campaign is null");
                    ad.a("OperateViews", "createNativeEC failed");
                    return;
                } else {
                    a(obj, a11);
                    ad.a("OperateViews", "createNativeEC instanceId = " + a11);
                    return;
                }
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("createNativeEC failed："), "OperateViews");
        }
    }

    public final String a() {
        f15573h++;
        return String.valueOf(f15573h);
    }

    public final String c(String str) {
        return f15570e.containsKey(str) ? f15570e.get(str) : "";
    }

    public final void d(String str) {
        f15572g.remove(str);
    }

    public final int e(String str) {
        if (f15571f.containsKey(str)) {
            return f15571f.get(str).intValue();
        }
        return 2;
    }

    public final void f(String str) {
        if (f15570e.containsKey(str)) {
            f15570e.remove(str);
        }
        if (f15569d.containsKey(str)) {
            f15569d.remove(str);
        }
        if (f15568c.containsKey(str)) {
            f15568c.remove(str);
        }
        if (f15567b.containsKey(str)) {
            f15567b.remove(str);
        }
    }

    public final void g(String str) {
        if (f15571f.containsKey(str)) {
            f15571f.remove(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d9, code lost:
    
        com.mbridge.msdk.foundation.tools.ar.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dc, code lost:
    
        r0 = (com.mbridge.msdk.video.bt.module.MBTempContainer) r9;
        r6 = (com.mbridge.msdk.video.signal.a.k) ((com.mbridge.msdk.mbsignalcommon.windvane.a) r19).f14146b.getObject();
        r0.setAdEvents(r6.l());
        r0.setAdSession(r6.j());
        r0.setVideoEvents(r6.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0101, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b("OperateViews", r0.getMessage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r19, org.json.JSONObject r20) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.a.a.i(java.lang.Object, org.json.JSONObject):void");
    }

    public final void j(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String optString3 = optJSONObject.optString("id");
                LinkedHashMap<String, View> b3 = b(optString, h10);
                if (b3.containsKey(optString2) && b3.containsKey(optString3)) {
                    ViewGroup viewGroup = (ViewGroup) b3.get(optString3);
                    View view = b3.get(optString2);
                    ar.a(view);
                    if (viewGroup != null && view != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                        if (view instanceof MBTempContainer) {
                            Iterator<View> it = b3.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                View next = it.next();
                                if (next instanceof MBridgeBTContainer) {
                                    ar.a(view);
                                    ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, optJSONObject2);
                                    break;
                                }
                            }
                        } else {
                            if (optJSONObject2 == null) {
                                if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    optInt = ((BTBaseView) view).getViewWidth();
                                    optInt2 = ((BTBaseView) view).getViewHeight();
                                } else {
                                    optInt = 0;
                                    rect = null;
                                    optInt2 = 0;
                                }
                            } else {
                                Rect rect2 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                                optInt = optJSONObject2.optInt("width");
                                optInt2 = optJSONObject2.optInt("height");
                                rect = rect2;
                            }
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            if (viewGroup instanceof FrameLayout) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            }
                            ViewGroup.LayoutParams a10 = a(layoutParams, rect, optInt, optInt2);
                            ar.a(view);
                            viewGroup.addView(view, a10);
                        }
                        a(obj, optString2);
                        a(obj, "onAppendViewTo", optString2);
                        ad.a("OperateViews", "appendViewTo parentId = " + optString3 + " childId = " + optString2);
                        return;
                    }
                    c(obj, "view is not exist");
                    return;
                }
                c(obj, "instanceId is not exist");
                ad.a("OperateViews", "appendViewTo failed: instanceId is not exist");
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("appendViewTo failed: "), "OperateViews");
        }
    }

    public final void k(Object obj, JSONObject jSONObject) {
        int optInt;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("id");
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString3) && b3.containsKey(optString2)) {
                ViewGroup viewGroup = (ViewGroup) b3.get(optString2);
                View view = b3.get(optString3);
                if (viewGroup != null && view != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                    int i10 = 0;
                    if (view instanceof MBTempContainer) {
                        ad.b("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f15577l), Integer.valueOf(f15578m), Integer.valueOf(f15579n), Integer.valueOf(f15580o), Integer.valueOf(f15581p)));
                        ((MBTempContainer) view).setNotchPadding(f15577l, f15578m, f15579n, f15580o, f15581p);
                        Iterator<View> it = b3.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof MBridgeBTContainer) {
                                ar.a(view);
                                ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, optJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (optJSONObject2 == null) {
                            if (view instanceof BTBaseView) {
                                rect = ((BTBaseView) view).getRect();
                                int viewWidth = ((BTBaseView) view).getViewWidth();
                                i10 = ((BTBaseView) view).getViewHeight();
                                optInt = viewWidth;
                            } else {
                                rect = null;
                                optInt = 0;
                            }
                        } else {
                            Rect rect2 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                            optInt = optJSONObject2.optInt("width");
                            i10 = optJSONObject2.optInt("height");
                            rect = rect2;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        viewGroup.addView(view, a(layoutParams, rect, optInt, i10));
                    }
                    a(obj, optString2);
                    a(obj, "onAppendView", optString2);
                    ad.a("OperateViews", "appendSubView parentId = " + optString2 + " childId = " + optString3);
                    return;
                }
                c(obj, "view is not exist");
                return;
            }
            c(obj, "instanceId is not exist");
            ad.a("OperateViews", "appendSubView failed: instanceId is not exist");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("appendSubView failed: "), "OperateViews");
        }
    }

    public final void l(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String optString3 = optJSONObject.optString("id");
                LinkedHashMap<String, View> b3 = b(optString, h10);
                if (b3.containsKey(optString2) && b3.containsKey(optString3)) {
                    ViewGroup viewGroup = (ViewGroup) b3.get(optString3);
                    View view = b3.get(optString2);
                    if (viewGroup != null && view != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                        if (view instanceof MBTempContainer) {
                            Iterator<View> it = b3.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                View next = it.next();
                                if (next instanceof MBridgeBTContainer) {
                                    ar.a(view);
                                    ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, optJSONObject2);
                                    break;
                                }
                            }
                        } else {
                            if (optJSONObject2 == null) {
                                if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    optInt = ((BTBaseView) view).getViewWidth();
                                    optInt2 = ((BTBaseView) view).getViewHeight();
                                } else {
                                    optInt = 0;
                                    rect = null;
                                    optInt2 = 0;
                                }
                            } else {
                                Rect rect2 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                                optInt = optJSONObject2.optInt("width");
                                optInt2 = optJSONObject2.optInt("height");
                                rect = rect2;
                            }
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            if (viewGroup instanceof FrameLayout) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            }
                            viewGroup.addView(view, a(layoutParams, rect, optInt, optInt2));
                        }
                        a(obj, optString2);
                        a(obj, "onAppendViewTo", optString2);
                        ad.a("OperateViews", "appendViewTo parentId = " + optString3 + " childId = " + optString2);
                        return;
                    }
                    c(obj, "view is not exist");
                    return;
                }
                c(obj, "instanceId is not exist");
                ad.a("OperateViews", "appendViewTo failed: instanceId is not exist");
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("appendViewTo failed: "), "OperateViews");
        }
    }

    public final void m(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.bringChildToFront(view);
                        a(obj, optString2);
                        a(obj, "onBringViewToFront", optString2);
                        ad.a("OperateViews", "bringViewToFront instanceId = " + optString2);
                        return;
                    }
                    c(obj, "parent is null");
                    ad.a("OperateViews", "bringViewToFront failed: parent is null");
                    return;
                }
                c(obj, "view is null");
                ad.a("OperateViews", "bringViewToFront failed: view is null");
                return;
            }
            c(obj, "instanceId is not exist");
            ad.a("OperateViews", "bringViewToFront failed: instanceId is not exist");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("bringViewToFront failed: "), "OperateViews");
        }
    }

    public final void n(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view != null) {
                    view.setVisibility(8);
                    a(obj, optString2);
                    a(obj, "onHideView", optString2);
                    ad.a("OperateViews", "hideView instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "hideView failed: view not exist");
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "hideView failed: instanceId not exist");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("hideView failed: + "), "OperateViews");
        }
    }

    public final void o(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view != null) {
                    view.setVisibility(0);
                    a(obj, optString2);
                    a(obj, "onShowView", optString2);
                    ad.a("OperateViews", "showView instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "showView failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "showView failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("showView failed: "), "OperateViews");
        }
    }

    public final void p(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString(TtmlNode.ATTR_TTS_COLOR);
            if (TextUtils.isEmpty(optString3)) {
                c(obj, "color is not exist");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view != null) {
                    a(obj, optString2);
                    view.setBackgroundColor(Color.parseColor(optString3));
                    a(obj, "onViewBgColorChanged", optString2);
                    ad.a("OperateViews", "setViewBgColor instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "setViewBgColor failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "setViewBgColor failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("setViewBgColor failed: "), "OperateViews");
        }
    }

    public final void q(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("alpha", 1.0d);
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view != null) {
                    view.setAlpha((float) optDouble);
                    a(obj, optString2);
                    a(obj, "onViewAlphaChanged", optString2);
                    ad.a("OperateViews", "setViewAlpha instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "setViewAlpha failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "setViewAlpha failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("setViewAlpha failed: "), "OperateViews");
        }
    }

    public final void r(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("vertical", 1.0d);
            double optDouble2 = optJSONObject.optDouble("horizon", 1.0d);
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view != null) {
                    view.setScaleX((float) optDouble2);
                    view.setScaleY((float) optDouble);
                    a(obj, optString2);
                    a(obj, "onViewScaleChanged", optString2);
                    ad.a("OperateViews", "setViewScale instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "setViewScale failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "setViewScale failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("setViewScale failed: "), "OperateViews");
        }
    }

    public final void s(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2) && b3.containsKey(optString3)) {
                View view = b3.get(optString2);
                View view2 = b3.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                            rect = null;
                            optInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                        optInt = optJSONObject2.optInt("width");
                        optInt2 = optJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    viewGroup.addView(view, indexOfChild + 1, a(layoutParams, rect, optInt, optInt2));
                    a(obj, optString2);
                    a(obj, "onInsertViewAbove", optString2);
                    ad.a("OperateViews", "insertViewAbove instanceId = " + optString2 + " brotherId = " + optString3);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "insertViewAbove failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "insertViewAbove failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("insertViewAbove failed: "), "OperateViews");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.mbridge.msdk.video.bt.a.a] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.mbridge.msdk.video.bt.module.MBridgeBTWebView, com.mbridge.msdk.video.bt.module.BTBaseView] */
    public final void t(Object obj, JSONObject jSONObject) {
        ?? r32;
        String str;
        int optInt;
        WindVaneWebView windVaneWebView;
        ?? r22 = obj;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) r22).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(r22, "data is empty");
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(AppLovinEventTypes.USER_VIEWED_CONTENT);
            if (optJSONObject2 == null) {
                c(r22, "content is empty");
                return;
            }
            String optString3 = optJSONObject2.optString("fileURL");
            String optString4 = optJSONObject2.optString("filePath");
            String optString5 = optJSONObject2.optString("html");
            if (TextUtils.isEmpty(optString3) && TextUtils.isEmpty(optString4) && TextUtils.isEmpty(optString5)) {
                c(r22, "url is empty");
                return;
            }
            JSONArray optJSONArray = optJSONObject2.optJSONArray("campaigns");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                int i10 = 0;
                while (i10 < length) {
                    JSONArray jSONArray = optJSONArray;
                    CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONArray.getJSONObject(i10));
                    if (parseCampaignWithBackData != null) {
                        parseCampaignWithBackData.setCampaignUnitId(optString);
                        arrayList.add(parseCampaignWithBackData);
                    }
                    i10++;
                    optJSONArray = jSONArray;
                }
            }
            String optString6 = optJSONObject2.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            com.mbridge.msdk.videocommon.d.c a10 = com.mbridge.msdk.videocommon.d.c.a(optJSONObject2.optJSONObject("unitSetting"));
            if (a10 != null) {
                a10.a(optString6);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("rect");
            Rect rect = new Rect(-999, -999, -999, -999);
            if (optJSONObject3 != null) {
                try {
                    str = "OperateViews";
                } catch (Throwable th2) {
                    th = th2;
                    str = "OperateViews";
                    r22 = obj;
                    r32 = str;
                    c(r22, th.getMessage());
                    e.v(th, new StringBuilder("webviewLoad failed: "), r32);
                }
                try {
                    Rect rect2 = new Rect(optJSONObject3.optInt(TtmlNode.LEFT, -999), optJSONObject3.optInt("top", -999), optJSONObject3.optInt(TtmlNode.RIGHT, -999), optJSONObject3.optInt("bottom", -999));
                    int optInt2 = optJSONObject3.optInt("width");
                    optInt = optJSONObject3.optInt("height");
                    r32 = rect2;
                    r22 = optInt2;
                } catch (Throwable th3) {
                    th = th3;
                    r22 = obj;
                    r32 = str;
                    c(r22, th.getMessage());
                    e.v(th, new StringBuilder("webviewLoad failed: "), r32);
                }
            } else {
                str = "OperateViews";
                optInt = 0;
                r22 = 0;
                r32 = rect;
            }
            int optInt3 = optJSONObject2.optInt("refreshCache", 0);
            LinkedHashMap<String, View> b3 = b(optString, h10);
            try {
                if (b3.containsKey(optString2)) {
                    View view = b3.get(optString2);
                    if (view instanceof MBridgeBTWebView) {
                        ?? r52 = (MBridgeBTWebView) view;
                        r52.setHtml(optString5);
                        r52.setFilePath(optString4);
                        r52.setFileURL(optString3);
                        r52.setRect(r32);
                        r52.setLayout(r22, optInt);
                        r52.setCampaigns(arrayList);
                        r52.setRewardUnitSetting(a10);
                        r52.webviewLoad(optInt3);
                        r22 = obj;
                        try {
                            a(r22, optString2);
                            String str2 = str;
                            ad.a(str2, "webviewLoad instanceId = " + optString2);
                            r22 = r22;
                            r32 = str2;
                        } catch (Throwable th4) {
                            th = th4;
                            r32 = str;
                            c(r22, th.getMessage());
                            e.v(th, new StringBuilder("webviewLoad failed: "), r32);
                        }
                    } else {
                        Object obj2 = obj;
                        String str3 = str;
                        c(obj2, "view not exist");
                        ad.a(str3, "webviewLoad failed: view not exist instanceId = " + optString2);
                        r22 = obj2;
                        r32 = str3;
                    }
                } else {
                    Object obj3 = obj;
                    String str4 = str;
                    c(obj3, "instanceId not exist");
                    ad.a(str4, "webviewLoad failed: instanceId not exist instanceId = " + optString2);
                    r22 = obj3;
                    r32 = str4;
                }
            } catch (Throwable th5) {
                th = th5;
                c(r22, th.getMessage());
                e.v(th, new StringBuilder("webviewLoad failed: "), r32);
            }
        } catch (Throwable th6) {
            th = th6;
            r32 = "OperateViews";
        }
    }

    public final void u(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view instanceof MBridgeBTWebView) {
                    if (((MBridgeBTWebView) view).webviewReload()) {
                        a(obj, optString2);
                        ad.a("OperateViews", "webviewReload instanceId = " + optString2);
                        return;
                    }
                    c(obj, "reload failed");
                    ad.a("OperateViews", "webviewReload failed reload failed instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "webviewReload failed view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "webviewReload failed instanceId not exist instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("webviewReload failed: "), "OperateViews");
        }
    }

    public final void v(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view instanceof MBridgeBTWebView) {
                    if (((MBridgeBTWebView) view).webviewGoBack()) {
                        a(obj, optString2);
                        ad.a("OperateViews", "webviewGoBack instanceId = " + optString2);
                        return;
                    }
                    c(obj, "webviewGoBack failed");
                    ad.a("OperateViews", "webviewGoBack failed instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "webviewGoBack failed view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "webviewGoBack failed instanceId not exist instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("webviewGoBack failed: "), "OperateViews");
        }
    }

    public final void w(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view instanceof MBridgeBTWebView) {
                    if (((MBridgeBTWebView) view).webviewGoForward()) {
                        a(obj, optString2);
                        ad.a("OperateViews", "webviewGoForward instanceId = " + optString2);
                        return;
                    }
                    c(obj, "webviewGoForward failed");
                    ad.a("OperateViews", "webviewGoForward failed instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "webviewGoForward failed view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "webviewGoForward failed instanceId not exist instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("webviewGoForward failed: "), "OperateViews");
        }
    }

    public final void x(Object obj, JSONObject jSONObject) {
        MBridgeBTContainer mBridgeBTContainer;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    MBridgeBTVideoView mBridgeBTVideoView = (MBridgeBTVideoView) view;
                    LinkedHashMap<String, View> b10 = b(optString, h10);
                    if (b10.size() > 0) {
                        for (View view2 : b10.values()) {
                            if (view2 instanceof MBridgeBTContainer) {
                                mBridgeBTContainer = (MBridgeBTContainer) view2;
                                break;
                            }
                        }
                    }
                    mBridgeBTContainer = null;
                    if (mBridgeBTContainer != null) {
                        mBridgeBTVideoView.setAdEvents(mBridgeBTContainer.getAdEvents());
                        mBridgeBTVideoView.setAdSession(mBridgeBTContainer.getAdSession());
                        mBridgeBTVideoView.setVideoEvents(mBridgeBTContainer.getVideoEvents());
                    }
                    mBridgeBTVideoView.play();
                    a(obj, optString2);
                    ad.a("OperateViews", "playerPlay success");
                    return;
                }
                c(obj, "instanceId is not player");
                ad.a("OperateViews", "playerPlay failed instanceId is not player instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerPlay failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("playerPlay failed: "), "OperateViews");
        }
    }

    public final void y(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).pause();
                    a(obj, optString2);
                    ad.a("OperateViews", "playerPause success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    ad.a("OperateViews", "playerPause failed instanceId is not player instanceId = " + optString2);
                    return;
                }
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerPause failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("playerPause failed: "), "OperateViews");
        }
    }

    public final void z(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).resume();
                    a(obj, optString2);
                    ad.a("OperateViews", "playerResume success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    ad.a("OperateViews", "playerResume failed instanceId is not player instanceId = " + optString2);
                    return;
                }
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerResume failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("playerResume failed: "), "OperateViews");
        }
    }

    public final com.mbridge.msdk.videocommon.d.c b(String str) {
        if (f15569d.containsKey(str)) {
            return f15569d.get(str);
        }
        return null;
    }

    public final void d(Object obj, JSONObject jSONObject) {
        String str;
        WindVaneWebView windVaneWebView;
        String str2 = "OperateViews";
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                int optInt = optJSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                String str3 = "";
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                if (parseCampaignWithBackData != null && !TextUtils.isEmpty(optString)) {
                    parseCampaignWithBackData.setCampaignUnitId(optString);
                    str3 = parseCampaignWithBackData.getRequestId();
                }
                com.mbridge.msdk.videocommon.d.c a10 = com.mbridge.msdk.videocommon.d.c.a(optJSONObject.optJSONObject("unitSetting"));
                if (a10 != null) {
                    a10.a(optString);
                }
                String optString2 = optJSONObject.optString("userId");
                if (TextUtils.isEmpty(str3) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                    str3 = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> b3 = b(optString, str3);
                String a11 = a();
                f15567b.put(a11, str3);
                MBTempContainer mBTempContainer = new MBTempContainer(com.mbridge.msdk.foundation.controller.c.m().c());
                try {
                    k kVar = (k) ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b.getObject();
                    mBTempContainer.setAdEvents(kVar.l());
                    mBTempContainer.setAdSession(kVar.j());
                    mBTempContainer.setVideoEvents(kVar.k());
                } catch (Exception e2) {
                    ad.b("OperateViews", e2.getMessage());
                }
                mBTempContainer.setInstanceId(a11);
                mBTempContainer.setUnitId(optString);
                mBTempContainer.setCampaign(parseCampaignWithBackData);
                mBTempContainer.setRewardUnitSetting(a10);
                mBTempContainer.setBigOffer(true);
                if (!TextUtils.isEmpty(optString2)) {
                    mBTempContainer.setUserId(optString2);
                }
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("reward");
                if (optJSONObject2 != null) {
                    String optString3 = optJSONObject2.optString("id");
                    str = "OperateViews";
                    try {
                        com.mbridge.msdk.videocommon.b.c cVar = new com.mbridge.msdk.videocommon.b.c(optJSONObject2.optString("name"), optJSONObject2.optInt("amount"));
                        if (!TextUtils.isEmpty(optString3)) {
                            mBTempContainer.setRewardId(optString3);
                        }
                        if (!TextUtils.isEmpty(cVar.a())) {
                            mBTempContainer.setReward(cVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = str;
                        c(obj, th.getMessage());
                        e.v(th, new StringBuilder("createSubPlayTemplateView failed："), str2);
                        return;
                    }
                } else {
                    str = "OperateViews";
                }
                String optString4 = optJSONObject.optString("extra");
                if (!TextUtils.isEmpty(optString4)) {
                    mBTempContainer.setDeveloperExtraData(optString4);
                }
                mBTempContainer.setMute(optInt);
                b3.put(a11, mBTempContainer);
                f15570e.put(a11, optString);
                f15568c.put(a11, parseCampaignWithBackData);
                f15569d.put(a11, a10);
                a(obj, a11);
                ad.a(str, "createSubPlayTemplateView instanceId = " + a11);
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void c(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f15575j);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            ad.a("OperateViews", e2.getMessage());
        }
    }

    public final CampaignEx a(String str) {
        if (f15568c.containsKey(str)) {
            return f15568c.get(str);
        }
        return null;
    }

    public final void e(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) != null && !TextUtils.isEmpty(optString)) {
                String h10 = h(optString2);
                if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                    h10 = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> b3 = b(optString, h10);
                if (b3 != null && b3.containsKey(optString2)) {
                    View view = b3.get(optString2);
                    b3.remove(optString2);
                    if (view != null && view.getParent() != null) {
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) view;
                            if (viewGroup2.getChildCount() > 0) {
                                int childCount = viewGroup2.getChildCount();
                                for (int i10 = 0; i10 < childCount; i10++) {
                                    View childAt = viewGroup2.getChildAt(i10);
                                    if (childAt instanceof MBridgeBTWebView) {
                                        b3.remove(((MBridgeBTWebView) childAt).getInstanceId());
                                        ((MBridgeBTWebView) childAt).onDestory();
                                    } else if (childAt instanceof MBridgeBTVideoView) {
                                        b3.remove(((MBridgeBTVideoView) childAt).getInstanceId());
                                        ((MBridgeBTVideoView) childAt).onDestory();
                                    } else if (childAt instanceof MBTempContainer) {
                                        b3.remove(((MBTempContainer) childAt).getInstanceId());
                                        ((MBTempContainer) childAt).onDestroy();
                                    }
                                }
                            }
                        }
                    }
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onDestroy();
                    }
                    if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onDestory();
                    }
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onDestory();
                    }
                    a(obj, optString2);
                    a(obj, "onComponentDestroy", optString2);
                    ad.a("OperateViews", "destroyComponent instanceId = " + optString2);
                    return;
                }
                c(obj, "unitId or instanceId not exist");
                ad.a("OperateViews", "destroyComponent failed");
                return;
            }
            c(obj, "unidId or data is empty");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            ad.a("OperateViews", "destroyComponent failed");
        }
    }

    public final void g(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            if (optJSONObject2 == null) {
                c(obj, "rect not exist");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            Rect rect = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
            int optInt = optJSONObject2.optInt("width");
            int optInt2 = optJSONObject2.optInt("height");
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view != null) {
                    if (view.getParent() != null) {
                        view.setLayoutParams(a(view.getLayoutParams(), rect, optInt, optInt2));
                        view.requestLayout();
                    } else {
                        if (view instanceof MBridgeBTWebView) {
                            ((MBridgeBTWebView) view).setRect(rect);
                            ((MBridgeBTWebView) view).setLayout(optInt, optInt2);
                        }
                        if (view instanceof MBridgeBTVideoView) {
                            ((MBridgeBTVideoView) view).setRect(rect);
                            ((MBridgeBTVideoView) view).setLayout(optInt, optInt2);
                        }
                    }
                    a(obj, optString2);
                    a(obj, "onViewRectChanged", optString2);
                    ad.a("OperateViews", "setViewRect instanceId = " + optString2);
                    return;
                }
                c(obj, "view is null");
                ad.a("OperateViews", "setViewRect failed: view is null");
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "setViewRect failed: instanceId not exist");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("setViewRect failed: "), "OperateViews");
        }
    }

    public final void h(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2)) {
                View view = b3.get(optString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                        a(obj, optString2);
                        a(obj, "onRemoveFromView", optString2);
                        ad.a("OperateViews", "removeFromSuperView instanceId = " + optString2);
                        return;
                    }
                    c(obj, "parent is null");
                    ad.a("OperateViews", "removeFromSuperView failed: parent is null instanceId = " + optString2);
                    return;
                }
                c(obj, "view is null");
                ad.a("OperateViews", "removeFromSuperView failed: view is null instanceId = " + optString2);
                return;
            }
            c(obj, "params not enough");
            ad.a("OperateViews", "removeFromSuperView failed: params not enough instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("removeFromSuperView failed: "), "OperateViews");
        }
    }

    public final synchronized LinkedHashMap<String, View> b(String str, String str2) {
        if (a.containsKey(str + "_" + str2)) {
            return a.get(str + "_" + str2);
        }
        LinkedHashMap<String, View> linkedHashMap = new LinkedHashMap<>();
        a.put(str + "_" + str2, linkedHashMap);
        return linkedHashMap;
    }

    public final void a(String str, String str2) {
        f15567b.put(str, str2);
    }

    public final void a(String str, Activity activity) {
        f15572g.put(str, activity);
    }

    public final void a(String str, int i10) {
        f15571f.put(str, Integer.valueOf(i10));
    }

    public final void a(WebView webView, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f15575j);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            g.a().a(webView, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            ad.a("OperateViews", e2.getMessage());
        }
    }

    public final void b(final Object obj, JSONObject jSONObject) {
        final int i10;
        final int i11;
        final Rect rect;
        try {
            final String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (TextUtils.isEmpty(optString)) {
                c(obj, "unitId is empty");
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            int optInt = optJSONObject.optInt("delay", 0);
            final String optString2 = optJSONObject.optString("fileURL");
            final String optString3 = optJSONObject.optString("filePath");
            final String optString4 = optJSONObject.optString("html");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (optJSONObject2 != null) {
                Rect rect3 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                int optInt2 = optJSONObject2.optInt("width");
                i11 = optJSONObject2.optInt("height");
                rect = rect3;
                i10 = optInt2;
            } else {
                i10 = 0;
                i11 = 0;
                rect = rect2;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.a.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b;
                    if (windVaneWebView != null) {
                        str = windVaneWebView.getRid();
                    } else {
                        str = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> b3 = a.this.b(optString, str);
                    String a10 = a.this.a();
                    a.f15567b.put(a10, str);
                    MBridgeBTWebView mBridgeBTWebView = new MBridgeBTWebView(com.mbridge.msdk.foundation.controller.c.m().c());
                    b3.put(a10, mBridgeBTWebView);
                    mBridgeBTWebView.setInstanceId(a10);
                    mBridgeBTWebView.setUnitId(optString);
                    mBridgeBTWebView.setFileURL(optString2);
                    mBridgeBTWebView.setFilePath(optString3);
                    mBridgeBTWebView.setHtml(optString4);
                    mBridgeBTWebView.setRect(rect);
                    mBridgeBTWebView.setWebViewRid(str);
                    mBridgeBTWebView.setCreateWebView(windVaneWebView);
                    int i12 = i10;
                    if (i12 > 0 || i11 > 0) {
                        mBridgeBTWebView.setLayout(i12, i11);
                    }
                    mBridgeBTWebView.preload();
                    a.this.a(obj, a10);
                    ad.a("OperateViews", "createWebview instanceId = " + a10);
                }
            }, optInt);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("createWebview failed："), "OperateViews");
        }
    }

    public final void c(Object obj, JSONObject jSONObject) {
        b unused;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String str = "";
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                if (parseCampaignWithBackData != null && !TextUtils.isEmpty(optString)) {
                    parseCampaignWithBackData.setCampaignUnitId(optString);
                    str = parseCampaignWithBackData.getRequestId();
                }
                int optInt = optJSONObject.optInt("show_time", 0);
                int optInt2 = optJSONObject.optInt("show_mute", 0);
                int optInt3 = optJSONObject.optInt("show_close", 0);
                int optInt4 = optJSONObject.optInt("orientation", 1);
                int optInt5 = optJSONObject.optInt("show_pgb", 0);
                MBridgeBTVideoView mBridgeBTVideoView = new MBridgeBTVideoView(com.mbridge.msdk.foundation.controller.c.m().c());
                try {
                    k kVar = (k) ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b.getObject();
                    mBridgeBTVideoView.setAdEvents(kVar.l());
                    mBridgeBTVideoView.setAdSession(kVar.j());
                    mBridgeBTVideoView.setVideoEvents(kVar.k());
                } catch (Exception e2) {
                    ad.b("OperateViews", e2.getMessage());
                }
                mBridgeBTVideoView.setCampaign(parseCampaignWithBackData);
                mBridgeBTVideoView.setUnitId(optString);
                mBridgeBTVideoView.setShowMute(optInt2);
                mBridgeBTVideoView.setShowTime(optInt);
                mBridgeBTVideoView.setShowClose(optInt3);
                mBridgeBTVideoView.setOrientation(optInt4);
                mBridgeBTVideoView.setProgressBarState(optInt5);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b;
                if (windVaneWebView != null) {
                    str = windVaneWebView.getRid();
                    mBridgeBTVideoView.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> b3 = b(optString, str);
                String a10 = a();
                f15567b.put(a10, str);
                mBridgeBTVideoView.setInstanceId(a10);
                b3.put(a10, mBridgeBTVideoView);
                mBridgeBTVideoView.preLoadData();
                if (parseCampaignWithBackData == null) {
                    c(obj, "campaign is null");
                    ad.a("OperateViews", "createPlayerView failed");
                } else {
                    a(obj, a10);
                    ad.a("OperateViews", "createPlayerView instanceId = " + a10);
                }
                unused = b.a.a;
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("createPlayerView failed："), "OperateViews");
        }
    }

    public final void f(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString = jSONObject.optString("id");
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
            } else {
                a(obj, optString);
            }
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
        }
    }

    public final void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f15574i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            c(obj, e2.getMessage());
            ad.a("OperateViews", e2.getMessage());
        }
    }

    private void a(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f15574i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            g.a().a(obj, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            c(obj, e2.getMessage());
            ad.a("OperateViews", e2.getMessage());
        }
    }

    public final void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f15574i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            g.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            a(webView, e2.getMessage());
            ad.a("OperateViews", e2.getMessage());
        }
    }

    public final void b(Object obj, JSONObject jSONObject, boolean z10) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2) && b3.containsKey(optString3)) {
                View view = b3.get(optString2);
                View view2 = b3.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            rect = null;
                            optInt = 0;
                            optInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                        optInt = optJSONObject2.optInt("width");
                        optInt2 = optJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams a10 = a(layoutParams, rect, optInt, optInt2);
                    if (z10) {
                        ar.a(view);
                    }
                    int i10 = indexOfChild - 1;
                    viewGroup.addView(view, i10 > -1 ? i10 : 0, a10);
                    a(obj, optString2);
                    a(obj, "onInsertViewBelow", optString2);
                    ad.a("OperateViews", "insertViewBelow instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "insertViewBelow failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "insertViewBelow failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("insertViewBelow failed: "), "OperateViews");
        }
    }

    public final void a(final Object obj, JSONObject jSONObject) {
        final int i10;
        final int i11;
        final Rect rect;
        try {
            final String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (TextUtils.isEmpty(optString)) {
                c(obj, "unitId is empty");
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            int optInt = optJSONObject.optInt("delay", 0);
            optJSONObject.optString("fileURL");
            optJSONObject.optString("filePath");
            optJSONObject.optString("html");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (optJSONObject2 != null) {
                Rect rect3 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                int optInt2 = optJSONObject2.optInt("width");
                i11 = optJSONObject2.optInt("height");
                rect = rect3;
                i10 = optInt2;
            } else {
                i10 = 0;
                i11 = 0;
                rect = rect2;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b;
                    if (windVaneWebView != null) {
                        str = windVaneWebView.getRid();
                    } else {
                        str = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> b3 = a.this.b(optString, str);
                    String a10 = a.this.a();
                    a.f15567b.put(a10, str);
                    MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(com.mbridge.msdk.foundation.controller.c.m().c());
                    b3.put(a10, mBridgeBTLayout);
                    mBridgeBTLayout.setInstanceId(a10);
                    mBridgeBTLayout.setUnitId(optString);
                    mBridgeBTLayout.setWebView(windVaneWebView);
                    mBridgeBTLayout.setRect(rect);
                    int i12 = i10;
                    if (i12 > 0 || i11 > 0) {
                        mBridgeBTLayout.setLayout(i12, i11);
                    }
                    a.this.a(obj, a10);
                    ad.a("OperateViews", "create view instanceId = " + a10);
                }
            }, optInt);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("create view failed："), "OperateViews");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.widget.LinearLayout$LayoutParams] */
    private ViewGroup.LayoutParams a(ViewGroup.LayoutParams layoutParams, Rect rect, int i10, int i11) {
        if (rect == null) {
            rect = new Rect(-999, -999, -999, -999);
        }
        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (c10 == null) {
            return layoutParams;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            int i12 = rect.left;
            if (i12 != -999) {
                layoutParams2.leftMargin = ai.a(c10, i12);
            }
            int i13 = rect.top;
            if (i13 != -999) {
                layoutParams2.topMargin = ai.a(c10, i13);
            }
            int i14 = rect.right;
            if (i14 != -999) {
                layoutParams2.rightMargin = ai.a(c10, i14);
            }
            int i15 = rect.bottom;
            if (i15 != -999) {
                layoutParams2.bottomMargin = ai.a(c10, i15);
            }
            if (i10 > 0) {
                layoutParams2.width = ai.a(c10, i10);
            }
            if (i11 > 0) {
                layoutParams2.height = ai.a(c10, i11);
            }
            return layoutParams2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            int i16 = rect.left;
            if (i16 != -999) {
                layoutParams3.leftMargin = ai.a(c10, i16);
            }
            int i17 = rect.top;
            if (i17 != -999) {
                layoutParams3.topMargin = ai.a(c10, i17);
            }
            int i18 = rect.right;
            if (i18 != -999) {
                layoutParams3.rightMargin = ai.a(c10, i18);
            }
            int i19 = rect.bottom;
            if (i19 != -999) {
                layoutParams3.bottomMargin = ai.a(c10, i19);
            }
            if (i10 > 0) {
                layoutParams3.width = ai.a(c10, i10);
            }
            if (i11 > 0) {
                layoutParams3.height = ai.a(c10, i11);
            }
            return layoutParams3;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams = new LinearLayout.LayoutParams(-1, -1);
            int i20 = rect.left;
            if (i20 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = ai.a(c10, i20);
            }
            int i21 = rect.top;
            if (i21 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).topMargin = ai.a(c10, i21);
            }
            int i22 = rect.right;
            if (i22 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = ai.a(c10, i22);
            }
            int i23 = rect.bottom;
            if (i23 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).bottomMargin = ai.a(c10, i23);
            }
            if (i10 > 0) {
                ((LinearLayout.LayoutParams) layoutParams).width = ai.a(c10, i10);
            }
            if (i11 > 0) {
                ((LinearLayout.LayoutParams) layoutParams).height = ai.a(c10, i11);
            }
        }
        return layoutParams;
    }

    public final void b(Object obj, String str) {
        ad.a("OperateViews", "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                int optInt = jSONObject.optInt("type");
                String a10 = ai.a(jSONObject.optString("url"), "&tun=", z.q() + "");
                int optInt2 = jSONObject.optInt("report");
                if (optInt2 == 0) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), (CampaignEx) null, "", a10, false, optInt != 0);
                } else {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), (CampaignEx) null, "", a10, false, optInt != 0, optInt2);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            a(obj, "");
        } catch (Throwable th3) {
            th = th3;
            ad.b("OperateViews", "reportUrls", th);
        }
    }

    public final void a(Object obj, JSONObject jSONObject, boolean z10) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b3 = b(optString, h10);
            if (b3.containsKey(optString2) && b3.containsKey(optString3)) {
                View view = b3.get(optString2);
                View view2 = b3.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                            rect = null;
                            optInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                        optInt = optJSONObject2.optInt("width");
                        optInt2 = optJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams a10 = a(layoutParams, rect, optInt, optInt2);
                    if (z10) {
                        ar.a(view);
                    }
                    viewGroup.addView(view, indexOfChild + 1, a10);
                    a(obj, optString2);
                    a(obj, "onInsertViewAbove", optString2);
                    ad.a("OperateViews", "insertViewAbove instanceId = " + optString2 + " brotherId = " + optString3);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "insertViewAbove failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "insertViewAbove failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th2) {
            c(obj, th2.getMessage());
            e.v(th2, new StringBuilder("insertViewAbove failed: "), "OperateViews");
        }
    }

    public final void a(int i10, int i11, int i12, int i13, int i14) {
        ad.a("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)));
        f15576k = r.a(i10, i11, i12, i13, i14);
        f15577l = i10;
        f15578m = i11;
        f15579n = i12;
        f15580o = i13;
        f15581p = i14;
    }

    public static /* synthetic */ void a(a aVar, String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.a.b.f13305j == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.a.b.a(str, campaignEx, "reward");
    }
}
