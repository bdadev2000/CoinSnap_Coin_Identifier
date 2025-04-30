package com.mbridge.msdk.splash.signal;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
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

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f17971a = "SplashSignalUtils";
    private static int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f17972c = 1;

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
                        j a6 = j.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        if (a6 != null) {
                            if (!a6.b(CampaignEx.this.getId())) {
                                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                                gVar.a(CampaignEx.this.getId());
                                gVar.b(CampaignEx.this.getFca());
                                gVar.c(CampaignEx.this.getFcb());
                                gVar.a(0);
                                gVar.d(1);
                                gVar.a(System.currentTimeMillis());
                                a6.a(gVar);
                            } else {
                                a6.a(CampaignEx.this.getId());
                            }
                        }
                        d.a(CampaignEx.this.getCampaignUnitId(), CampaignEx.this);
                    } catch (Throwable th) {
                        ad.b(d.f17971a, th.getMessage(), th);
                    }
                }
            }).start();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", b);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", "");
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject3);
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception e4) {
                a(obj, e4.getMessage());
                ad.a(f17971a, e4.getMessage());
            }
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    public static void a(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        JSONArray jSONArray;
        int i9;
        boolean z8;
        String str4;
        File file;
        String str5 = "";
        JSONObject jSONObject2 = new JSONObject();
        String str6 = "message";
        int i10 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "params is null");
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e4) {
                ad.a(f17971a, e4.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put("message", "");
            JSONArray jSONArray2 = jSONObject.getJSONArray("resource");
            try {
                if (jSONArray2 != null) {
                    try {
                        if (jSONArray2.length() > 0) {
                            JSONArray jSONArray3 = new JSONArray();
                            int length = jSONArray2.length();
                            int i11 = 0;
                            while (i11 < length) {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                                String optString = jSONObject3.optString("ref", str5);
                                int i12 = jSONObject3.getInt("type");
                                JSONObject jSONObject4 = new JSONObject();
                                if (i12 == i10 && !TextUtils.isEmpty(optString)) {
                                    JSONObject jSONObject5 = new JSONObject();
                                    m a6 = n.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(optString);
                                    if (a6 != null) {
                                        jSONArray = jSONArray2;
                                        i9 = length;
                                        ad.a(f17971a, "VideoBean not null");
                                        jSONObject5.put("type", 1);
                                        jSONObject5.put("videoDataLength", a6.d());
                                        String e9 = a6.e();
                                        str2 = str6;
                                        if (TextUtils.isEmpty(e9)) {
                                            ad.a(f17971a, "VideoPath null");
                                            jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str5);
                                            jSONObject5.put("path4Web", str5);
                                            str3 = str5;
                                        } else {
                                            str3 = str5;
                                            ad.a(f17971a, "VideoPath not null");
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
                                        jSONArray3.put(jSONObject4);
                                    } else {
                                        str3 = str5;
                                        str2 = str6;
                                        jSONArray = jSONArray2;
                                        i9 = length;
                                        z8 = false;
                                        ad.a(f17971a, "VideoBean null");
                                    }
                                } else {
                                    str3 = str5;
                                    str2 = str6;
                                    jSONArray = jSONArray2;
                                    i9 = length;
                                    z8 = false;
                                    if (i12 == 2 && !TextUtils.isEmpty(optString)) {
                                        JSONObject jSONObject6 = new JSONObject();
                                        jSONObject6.put("type", 2);
                                        jSONObject6.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, H5DownLoadManager.getInstance().getH5ResAddress(optString) == null ? str3 : H5DownLoadManager.getInstance().getH5ResAddress(optString));
                                        jSONObject4.put(optString, jSONObject6);
                                        jSONArray3.put(jSONObject4);
                                    } else if (i12 == 3 && !TextUtils.isEmpty(optString)) {
                                        try {
                                            file = new File(optString);
                                        } catch (Throwable th) {
                                            if (MBridgeConstans.DEBUG) {
                                                th.printStackTrace();
                                            }
                                        }
                                        if (file.exists() && file.isFile() && file.canRead()) {
                                            ad.a(f17971a, "getFileInfo Mraid file " + optString);
                                            str4 = "file:////" + optString;
                                            JSONObject jSONObject7 = new JSONObject();
                                            jSONObject7.put("type", 3);
                                            jSONObject7.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str4);
                                            jSONObject4.put(optString, jSONObject7);
                                            jSONArray3.put(jSONObject4);
                                        }
                                        str4 = str3;
                                        JSONObject jSONObject72 = new JSONObject();
                                        jSONObject72.put("type", 3);
                                        jSONObject72.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str4);
                                        jSONObject4.put(optString, jSONObject72);
                                        jSONArray3.put(jSONObject4);
                                    } else if (i12 == 4 && !TextUtils.isEmpty(optString)) {
                                        JSONObject jSONObject8 = new JSONObject();
                                        jSONObject8.put("type", 4);
                                        jSONObject8.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, ah.a(optString) == null ? str3 : ah.a(optString));
                                        jSONObject4.put(optString, jSONObject8);
                                        jSONArray3.put(jSONObject4);
                                    }
                                }
                                i11++;
                                jSONArray2 = jSONArray;
                                length = i9;
                                str6 = str2;
                                str5 = str3;
                                i10 = 1;
                            }
                            jSONObject2.put("resource", jSONArray3);
                            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = str6;
                        str = str2;
                        try {
                            jSONObject2.put("code", 1);
                            jSONObject2.put(str, th.getLocalizedMessage());
                            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        } catch (JSONException e10) {
                            ad.a(f17971a, e10.getMessage());
                            return;
                        }
                    }
                }
                str = 1;
            } catch (Throwable th3) {
                th = th3;
                str = str2;
                jSONObject2.put("code", 1);
                jSONObject2.put(str, th.getLocalizedMessage());
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            }
        } catch (Throwable th4) {
            th = th4;
            str = "message";
        }
        try {
            try {
                jSONObject2.put("code", 1);
                str = "message";
            } catch (JSONException e11) {
                e = e11;
                str = "message";
            }
            try {
                jSONObject2.put(str, "resource is null");
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (JSONException e12) {
                e = e12;
                ad.a(f17971a, e.getMessage());
            }
        } catch (Throwable th5) {
            th = th5;
            jSONObject2.put("code", 1);
            jSONObject2.put(str, th.getLocalizedMessage());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
    }

    public static String a(int i9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i9);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return "";
            }
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
        } catch (Throwable unused) {
            ad.b(f17971a, "code to string is error");
            return "";
        }
    }

    private static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f17972c);
            jSONObject.put("message", str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e4) {
            ad.a(f17971a, e4.getMessage());
        }
    }

    public static void a(WebView webView, String str, String str2) {
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView, str, str2);
    }

    public static void a(WebView webView) {
        ad.b(f17971a, "fireOnSignalCommunication");
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
    }

    public static /* synthetic */ void a(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.a.b.l == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.a.b.a(str, campaignEx, "splash");
    }
}
