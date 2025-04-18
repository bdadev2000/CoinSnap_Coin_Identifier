package com.mbridge.msdk.splash.signal;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {
    private static String a = "SplashSignalUtils";

    /* renamed from: b, reason: collision with root package name */
    private static int f15266b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f15267c = 1;

    public static void b(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            final CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject);
            if (parseCampaignWithBackData == null) {
                a(obj, "data camapign is empty");
                return;
            }
            new Thread(new Runnable() { // from class: com.mbridge.msdk.splash.signal.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        j a10 = j.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        if (a10 != null) {
                            if (!a10.b(CampaignEx.this.getId())) {
                                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                                gVar.a(CampaignEx.this.getId());
                                gVar.b(CampaignEx.this.getFca());
                                gVar.c(CampaignEx.this.getFcb());
                                gVar.a(0);
                                gVar.d(1);
                                gVar.a(System.currentTimeMillis());
                                a10.a(gVar);
                            } else {
                                a10.a(CampaignEx.this.getId());
                            }
                        }
                        d.a(CampaignEx.this.getCampaignUnitId(), CampaignEx.this);
                    } catch (Throwable th2) {
                        ad.b(d.a, th2.getMessage(), th2);
                    }
                }
            }).start();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", f15266b);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", "");
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject3);
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception e2) {
                a(obj, e2.getMessage());
                ad.a(a, e2.getMessage());
            }
        } catch (Throwable th2) {
            a(obj, th2.getMessage());
        }
    }

    public static void a(Object obj, JSONObject jSONObject) {
        String str;
        JSONArray jSONArray;
        String str2;
        String str3;
        JSONArray jSONArray2;
        int i10;
        boolean z10;
        String str4;
        File file;
        String str5 = "";
        JSONObject jSONObject2 = new JSONObject();
        String str6 = PglCryptUtils.KEY_MESSAGE;
        int i11 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "params is null");
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e2) {
                ad.a(a, e2.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
            jSONArray = jSONObject.getJSONArray("resource");
        } catch (Throwable th2) {
            th = th2;
            str = str6;
        }
        try {
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONArray jSONArray3 = new JSONArray();
                int length = jSONArray.length();
                int i12 = 0;
                while (i12 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i12);
                    String optString = jSONObject3.optString("ref", str5);
                    int i13 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    if (i13 == i11 && !TextUtils.isEmpty(optString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        m a10 = n.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(optString);
                        if (a10 != null) {
                            jSONArray2 = jSONArray;
                            i10 = length;
                            ad.a(a, "VideoBean not null");
                            jSONObject5.put("type", 1);
                            jSONObject5.put("videoDataLength", a10.d());
                            String e10 = a10.e();
                            str3 = str6;
                            if (TextUtils.isEmpty(e10)) {
                                ad.a(a, "VideoPath null");
                                jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str5);
                                jSONObject5.put("path4Web", str5);
                                str2 = str5;
                            } else {
                                str2 = str5;
                                ad.a(a, "VideoPath not null");
                                jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, e10);
                                jSONObject5.put("path4Web", e10);
                            }
                            if (a10.b() == 5) {
                                jSONObject5.put("downloaded", 1);
                                z10 = false;
                            } else {
                                z10 = false;
                                jSONObject5.put("downloaded", 0);
                            }
                            jSONObject4.put(optString, jSONObject5);
                            jSONArray3.put(jSONObject4);
                        } else {
                            str2 = str5;
                            str3 = str6;
                            jSONArray2 = jSONArray;
                            i10 = length;
                            z10 = false;
                            ad.a(a, "VideoBean null");
                        }
                    } else {
                        str2 = str5;
                        str3 = str6;
                        jSONArray2 = jSONArray;
                        i10 = length;
                        z10 = false;
                        if (i13 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 2);
                            jSONObject6.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, H5DownLoadManager.getInstance().getH5ResAddress(optString) == null ? str2 : H5DownLoadManager.getInstance().getH5ResAddress(optString));
                            jSONObject4.put(optString, jSONObject6);
                            jSONArray3.put(jSONObject4);
                        } else if (i13 == 3 && !TextUtils.isEmpty(optString)) {
                            try {
                                file = new File(optString);
                            } catch (Throwable th3) {
                                if (MBridgeConstans.DEBUG) {
                                    th3.printStackTrace();
                                }
                            }
                            if (file.exists() && file.isFile() && file.canRead()) {
                                ad.a(a, "getFileInfo Mraid file " + optString);
                                str4 = "file:////" + optString;
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("type", 3);
                                jSONObject7.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str4);
                                jSONObject4.put(optString, jSONObject7);
                                jSONArray3.put(jSONObject4);
                            }
                            str4 = str2;
                            JSONObject jSONObject72 = new JSONObject();
                            jSONObject72.put("type", 3);
                            jSONObject72.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str4);
                            jSONObject4.put(optString, jSONObject72);
                            jSONArray3.put(jSONObject4);
                        } else if (i13 == 4 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("type", 4);
                            jSONObject8.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, ah.a(optString) == null ? str2 : ah.a(optString));
                            jSONObject4.put(optString, jSONObject8);
                            jSONArray3.put(jSONObject4);
                        }
                    }
                    i12++;
                    jSONArray = jSONArray2;
                    length = i10;
                    str6 = str3;
                    str5 = str2;
                    i11 = 1;
                }
                jSONObject2.put("resource", jSONArray3);
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            try {
                jSONObject2.put("code", 1);
                str = PglCryptUtils.KEY_MESSAGE;
            } catch (JSONException e11) {
                e = e11;
                str = PglCryptUtils.KEY_MESSAGE;
            }
            try {
                try {
                    jSONObject2.put(str, "resource is null");
                    com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        jSONObject2.put("code", 1);
                        jSONObject2.put(str, th.getLocalizedMessage());
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    } catch (JSONException e12) {
                        ad.a(a, e12.getMessage());
                    }
                }
            } catch (JSONException e13) {
                e = e13;
                ad.a(a, e.getMessage());
            }
        } catch (Throwable th5) {
            th = th5;
            str = str3;
            jSONObject2.put("code", 1);
            jSONObject2.put(str, th.getLocalizedMessage());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
    }

    public static String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            ad.b(a, "code to string is error");
            return "";
        }
    }

    private static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f15267c);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            ad.a(a, e2.getMessage());
        }
    }

    public static void a(WebView webView, String str, String str2) {
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView, str, str2);
    }

    public static void a(WebView webView) {
        ad.b(a, "fireOnSignalCommunication");
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
    }

    public static /* synthetic */ void a(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.a.b.f13307l == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.a.b.a(str, campaignEx, "splash");
    }
}
