package com.mbridge.msdk.a;

import a4.y;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.emoji2.text.t;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.b.c;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kd.d;
import kd.g;
import kd.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {
    public static final String a = DomainNameUtils.VERIFICATION_URL;

    public static kd.b a(Context context, boolean z10, String str, String str2, String str3, String str4, String str5, String str6) {
        y yVar;
        d dVar;
        g gVar;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        i iVar = null;
        if (!TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) && !TextUtils.isEmpty(str)) {
            try {
                c(context);
                com.facebook.internal.i.c("Mintegral", "Name is null or empty");
                String str7 = MBConfiguration.SDK_VERSION;
                com.facebook.internal.i.c(MBConfiguration.SDK_VERSION, "Version is null or empty");
                yVar = new y("Mintegral", str7, 5);
                dVar = z10 ? d.NATIVE_DISPLAY : d.VIDEO;
                gVar = g.NATIVE;
                if (z10) {
                    gVar = g.NONE;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
            } catch (Exception e10) {
                e = e10;
            }
            try {
                iVar = kd.b.b(t.a(dVar, gVar), android.support.v4.media.d.a(yVar, MBridgeConstans.OMID_JS_SERVICE_CONTENT, a(str, context, str2, str3, str4, str6), str5, str2));
                ad.a("OMSDK", "adSession create success");
                return iVar;
            } catch (IllegalArgumentException e11) {
                e = e11;
                ad.b("OMSDK", e.getMessage());
                new h(context).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                return iVar;
            } catch (Exception e12) {
                e = e12;
                ad.b("OMSDK", e.getMessage());
                new h(context).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                return iVar;
            }
        }
        ad.a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(str) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
        new h(context).a(str2, str6, str3, str4, "failed, OMID_JS_SERVICE_CONTENT null or omid null");
        return null;
    }

    private static String b() {
        try {
            File file = new File(e.a(c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
            return file.exists() ? ab.b(file) : "";
        } catch (Exception e2) {
            ad.a("OMSDK", e2.getMessage());
            return "";
        }
    }

    private static void c(Context context) {
        jd.b bVar = com.facebook.appevents.i.f10946b;
        if (bVar.b()) {
            return;
        }
        bVar.a(context.getApplicationContext());
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        return TextUtils.isEmpty(str) ? str : str.replace("/*OMSDK_INSERT_HERE*/", MBridgeConstans.OMID_JS_H5_CONTENT).replace("[INSERT RESOURCE URL]", a);
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
            } catch (Exception e2) {
                ad.b("OMSDK", e2.getMessage());
            }
        }
    }

    public static void b(final String str) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.a.b.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    File file = new File(e.a(c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    ab.a(str.getBytes(), file);
                } catch (Exception e2) {
                    ad.a("OMSDK", e2.getMessage());
                }
            }
        }).start();
    }

    private static String a() {
        try {
            return ab.b(new File(e.a(c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt"));
        } catch (Exception e2) {
            ad.a("OMSDK", e2.getMessage());
            return "";
        }
    }

    private static List<kd.h> a(String str, Context context, String str2, String str3, String str4, String str5) {
        kd.h a10;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (str != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    String optString = optJSONObject.optString("vkey", "");
                    URL url = new URL(optJSONObject.optString("et_url", ""));
                    String optString2 = optJSONObject.optString("verification_p", "");
                    if (TextUtils.isEmpty(optString2)) {
                        if (TextUtils.isEmpty(optString)) {
                            a10 = new kd.h(null, url, null);
                        } else {
                            a10 = new kd.h(null, url, null);
                        }
                    } else {
                        a10 = kd.h.a(optString, url, optString2);
                    }
                    arrayList.add(a10);
                }
            }
        } catch (IllegalArgumentException e2) {
            ad.b("OMSDK", e2.getMessage());
            new h(context).a(str2, str5, str3, str4, "failed, exception " + e2.getMessage());
        } catch (MalformedURLException e10) {
            ad.b("OMSDK", e10.getMessage());
            new h(context).a(str2, str5, str3, str4, "failed, exception " + e10.getMessage());
        } catch (JSONException e11) {
            ad.b("OMSDK", e11.getMessage());
            new h(context).a(str2, str5, str3, str4, "failed, exception " + e11.getMessage());
        }
        return arrayList;
    }

    public static kd.b a(Context context, WebView webView, String str, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        if (!TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) && !TextUtils.isEmpty(campaignEx.getOmid())) {
            c(context);
            t a10 = t.a(d.HTML_DISPLAY, g.NONE);
            com.facebook.internal.i.c("Mintegral", "Name is null or empty");
            String str2 = MBConfiguration.SDK_VERSION;
            com.facebook.internal.i.c(MBConfiguration.SDK_VERSION, "Version is null or empty");
            y yVar = new y("Mintegral", str2, 5);
            com.facebook.internal.i.a(webView, "WebView is null");
            i b3 = kd.b.b(a10, new android.support.v4.media.d(yVar, webView, null, null, null, null, kd.c.HTML));
            b3.d(webView);
            return b3;
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
            } catch (Exception e2) {
                ad.b("OMSDK", e2.getMessage());
            }
        }
    }

    public static void a(final String str) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    File file = new File(e.a(c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    ab.a(str.getBytes(), file);
                } catch (Exception e2) {
                    ad.a("OMSDK", e2.getMessage());
                }
            }
        }).start();
    }
}
