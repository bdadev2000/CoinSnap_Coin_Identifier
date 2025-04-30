package com.mbridge.msdk.a;

import J1.p;
import O5.c;
import O5.d;
import O5.f;
import O5.i;
import O5.k;
import R5.j;
import a5.C0398b;
import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.view.WindowManager;
import android.webkit.WebView;
import com.facebook.internal.C1835d;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14588a = DomainNameUtils.VERIFICATION_URL;

    public static O5.b a(Context context, boolean z8, String str, String str2, String str3, String str4, String str5, String str6) {
        p pVar;
        f fVar;
        i iVar;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        k kVar = null;
        if (!TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) && !TextUtils.isEmpty(str)) {
            try {
                c(context);
                R2.b.d("Mintegral", "Name is null or empty");
                R2.b.d(MBConfiguration.SDK_VERSION, "Version is null or empty");
                pVar = new p(1);
                fVar = z8 ? f.NATIVE_DISPLAY : f.VIDEO;
                iVar = i.NATIVE;
                if (z8) {
                    iVar = i.NONE;
                }
            } catch (IllegalArgumentException e4) {
                e = e4;
            } catch (Exception e9) {
                e = e9;
            }
            try {
                kVar = O5.b.b(c.b(fVar, iVar), d.a(pVar, MBridgeConstans.OMID_JS_SERVICE_CONTENT, a(str, context, str2, str3, str4, str6), str5, str2));
                ad.a("OMSDK", "adSession create success");
                return kVar;
            } catch (IllegalArgumentException e10) {
                e = e10;
                ad.b("OMSDK", e.getMessage());
                new h(context).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                return kVar;
            } catch (Exception e11) {
                e = e11;
                ad.b("OMSDK", e.getMessage());
                new h(context).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                return kVar;
            }
        }
        ad.a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(str) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
        new h(context).a(str2, str6, str3, str4, "failed, OMID_JS_SERVICE_CONTENT null or omid null");
        return null;
    }

    private static String b() {
        try {
            File file = new File(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
            if (!file.exists()) {
                return "";
            }
            return ab.b(file);
        } catch (Exception e4) {
            ad.a("OMSDK", e4.getMessage());
            return "";
        }
    }

    private static void c(Context context) {
        byte b = 0;
        J1.d dVar = N5.a.f2098a;
        if (dVar.f1512a) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        R2.b.c(applicationContext, "Application Context cannot be null");
        if (dVar.f1512a) {
            return;
        }
        dVar.f1512a = true;
        j b8 = j.b();
        ((R3.e) b8.f2756d).getClass();
        L4.f fVar = new L4.f(9);
        Handler handler = new Handler();
        ((C0398b) b8.f2755c).getClass();
        b8.f2757e = new Q5.a(handler, applicationContext, fVar, b8);
        R5.b bVar = R5.b.f2740g;
        boolean z8 = applicationContext instanceof Application;
        if (z8) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(bVar);
        }
        z2.i.f24529a = (UiModeManager) applicationContext.getSystemService("uimode");
        WindowManager windowManager = U5.b.f3341a;
        U5.b.f3342c = applicationContext.getResources().getDisplayMetrics().density;
        U5.b.f3341a = (WindowManager) applicationContext.getSystemService("window");
        applicationContext.registerReceiver(new U5.c(b == true ? 1 : 0), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        R5.h.b.f2750a = applicationContext.getApplicationContext();
        R5.a aVar = R5.a.f2735f;
        if (!aVar.f2737c) {
            R5.e eVar = aVar.f2738d;
            eVar.getClass();
            if (z8) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(eVar);
            }
            eVar.f2745f = aVar;
            eVar.f2743c = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z9 = runningAppProcessInfo.importance == 100 || eVar.d();
            eVar.f2744d = z9;
            eVar.a(z9);
            aVar.f2739e = eVar.f2744d;
            aVar.f2737c = true;
        }
        R5.k kVar = R5.k.f2759d;
        kVar.f2760a = new WeakReference(applicationContext);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        applicationContext.registerReceiver(new C1835d(kVar, 1), intentFilter);
    }

    public static void b(final Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_URL)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = "";
            new h(context).a("", "", "", "", "fetch OM failed, OMID_JS_H5_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_H5_URL, (com.mbridge.msdk.foundation.same.net.f.e) null, new com.mbridge.msdk.foundation.same.net.b.a() { // from class: com.mbridge.msdk.a.b.3
                    @Override // com.mbridge.msdk.foundation.same.net.b.a
                    public final void a(String str) {
                        ad.a("OMSDK", "fetch OMJSH5Content failed, errorCode = " + str);
                        new h(context).a("", "", "", "", "fetch OM H5 failed, request failed");
                    }

                    @Override // com.mbridge.msdk.foundation.same.net.b.a
                    public final void b(String str) {
                        MBridgeConstans.OMID_JS_H5_CONTENT = str;
                        b.b(str);
                    }
                }, "om_sdk", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            } catch (Exception e4) {
                ad.b("OMSDK", e4.getMessage());
            }
        }
    }

    public static void b(final String str) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.a.b.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    File file = new File(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    ab.a(str.getBytes(), file);
                } catch (Exception e4) {
                    ad.a("OMSDK", e4.getMessage());
                }
            }
        }).start();
    }

    private static String a() {
        try {
            return ab.b(new File(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt"));
        } catch (Exception e4) {
            ad.a("OMSDK", e4.getMessage());
            return "";
        }
    }

    private static List<O5.j> a(String str, Context context, String str2, String str3, String str4, String str5) {
        O5.j a6;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (str != null) {
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                    String optString = optJSONObject.optString("vkey", "");
                    URL url = new URL(optJSONObject.optString("et_url", ""));
                    String optString2 = optJSONObject.optString("verification_p", "");
                    if (TextUtils.isEmpty(optString2)) {
                        if (TextUtils.isEmpty(optString)) {
                            a6 = new O5.j(null, url, null);
                        } else {
                            a6 = new O5.j(null, url, null);
                        }
                    } else {
                        a6 = O5.j.a(optString, url, optString2);
                    }
                    arrayList.add(a6);
                }
            }
        } catch (IllegalArgumentException e4) {
            ad.b("OMSDK", e4.getMessage());
            new h(context).a(str2, str5, str3, str4, "failed, exception " + e4.getMessage());
        } catch (MalformedURLException e9) {
            ad.b("OMSDK", e9.getMessage());
            new h(context).a(str2, str5, str3, str4, "failed, exception " + e9.getMessage());
        } catch (JSONException e10) {
            ad.b("OMSDK", e10.getMessage());
            new h(context).a(str2, str5, str3, str4, "failed, exception " + e10.getMessage());
        }
        return arrayList;
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        return TextUtils.isEmpty(str) ? str : str.replace("/*OMSDK_INSERT_HERE*/", MBridgeConstans.OMID_JS_H5_CONTENT).replace("[INSERT RESOURCE URL]", f14588a);
    }

    public static O5.b a(Context context, WebView webView, String str, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        if (!TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) && !TextUtils.isEmpty(campaignEx.getOmid())) {
            c(context);
            c b = c.b(f.HTML_DISPLAY, i.NONE);
            R2.b.d("Mintegral", "Name is null or empty");
            R2.b.d(MBConfiguration.SDK_VERSION, "Version is null or empty");
            p pVar = new p(1);
            R2.b.c(webView, "WebView is null");
            k b8 = O5.b.b(b, new d(pVar, webView, null, null, null, null, O5.e.HTML));
            b8.d(webView);
            return b8;
        }
        ad.a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(campaignEx.getOmid()) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
        new h(context).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), campaignEx.getCampaignUnitId(), "failed, OMID_JS_SERVICE_CONTENT null or omid null");
        return null;
    }

    public static void a(final Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_URL)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = "";
            new h(context).a("", "", "", "", "fetch OM failed, OMID_JS_SERVICE_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_SERVICE_URL, (com.mbridge.msdk.foundation.same.net.f.e) null, new com.mbridge.msdk.foundation.same.net.b.a() { // from class: com.mbridge.msdk.a.b.1
                    @Override // com.mbridge.msdk.foundation.same.net.b.a
                    public final void a(String str) {
                        ad.a("OMSDK", "fetch OMJSContent failed, errorCode = " + str);
                        new h(context).a("", "", "", "", "fetch OM failed, request failed");
                    }

                    @Override // com.mbridge.msdk.foundation.same.net.b.a
                    public final void b(String str) {
                        MBridgeConstans.OMID_JS_SERVICE_CONTENT = str;
                        b.a(str);
                    }
                }, "om_sdk", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            } catch (Exception e4) {
                ad.b("OMSDK", e4.getMessage());
            }
        }
    }

    public static void a(final String str) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    File file = new File(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    ab.a(str.getBytes(), file);
                } catch (Exception e4) {
                    ad.a("OMSDK", e4.getMessage());
                }
            }
        }).start();
    }
}
