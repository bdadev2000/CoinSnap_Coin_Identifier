package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class BaseAbsFeedBackForH5 extends h {

    /* renamed from: e, reason: collision with root package name */
    private static int f16661e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f16662f = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f16663a = "AbsFeedBackForH5";

    public void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f16662f);
            jSONObject.put("message", str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e4) {
            ad.a(this.f16663a, e4.getMessage());
        }
    }

    public void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f16661e);
            jSONObject.put("message", "");
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e4) {
            callbackExcep(obj, e4.getMessage());
            ad.a(this.f16663a, e4.getMessage());
        }
    }

    public void callbackSuccessWithData(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f16661e);
            jSONObject2.put("message", "");
            jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
            g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e4) {
            callbackExcep(obj, e4.getMessage());
            ad.a(this.f16663a, e4.getMessage());
        }
    }

    public void feedbackLayoutOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("width", -1);
                int optInt2 = jSONObject.optInt("height", -1);
                int optInt3 = jSONObject.optInt(TtmlNode.LEFT, -1);
                int optInt4 = jSONObject.optInt("top", -1);
                double optDouble = jSONObject.optDouble("opacity", 1.0d);
                int optInt5 = jSONObject.optInt("radius", 20);
                String optString = jSONObject.optString("fontColor", "");
                String optString2 = jSONObject.optString("bgColor", "");
                com.mbridge.msdk.foundation.d.b.a().a(jSONObject.optString("key", ""), optInt, optInt2, optInt5, optInt3, optInt4, (float) optDouble, optString, optString2, (float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE, -1.0d), jSONObject.optJSONArray("padding"));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackOperate(Object obj, String str) {
        int i9;
        try {
            if (!TextUtils.isEmpty(str)) {
                a aVar = (a) obj;
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("view_visible", 1);
                String optString = jSONObject.optString("key", "");
                com.mbridge.msdk.foundation.d.b a6 = com.mbridge.msdk.foundation.d.b.a();
                if (optInt == 1) {
                    i9 = 8;
                } else {
                    i9 = 0;
                }
                a6.a(optString, i9, aVar.b);
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackPopupOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("view_visible", 1);
                String optString = jSONObject.optString("key", "");
                final WindVaneWebView windVaneWebView = ((a) obj).b;
                com.mbridge.msdk.foundation.d.b.a().a(optString, optInt, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.mbsignalcommon.windvane.BaseAbsFeedBackForH5.1
                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a() {
                        String str2;
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, 1);
                            }
                            str2 = jSONObject2.toString();
                        } catch (Throwable th) {
                            ad.b(BaseAbsFeedBackForH5.this.f16663a, th.getMessage(), th);
                            str2 = "";
                        }
                        g.a().a((WebView) windVaneWebView, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void b() {
                        String str2;
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, 2);
                            }
                            str2 = jSONObject2.toString();
                        } catch (Throwable th) {
                            ad.b(BaseAbsFeedBackForH5.this.f16663a, th.getMessage(), th);
                            str2 = "";
                        }
                        g.a().a((WebView) windVaneWebView, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a(String str2) {
                        String str3;
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, 2);
                            }
                            str3 = jSONObject2.toString();
                        } catch (Throwable th) {
                            ad.b(BaseAbsFeedBackForH5.this.f16663a, th.getMessage(), th);
                            str3 = "";
                        }
                        g.a().a((WebView) windVaneWebView, "onFeedbackAlertStatusNotify", Base64.encodeToString(str3.getBytes(), 2));
                    }
                });
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }
}
