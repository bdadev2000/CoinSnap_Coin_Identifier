package com.mbridge.msdk.mbsignalcommon.mraid;

import android.webkit.WebView;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0170a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f16650a = new a();
    }

    public static a a() {
        return C0170a.f16650a;
    }

    public final void b(WebView webView, float f9, float f10) {
        c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f9), Float.valueOf(f10)));
    }

    public final void c(WebView webView, float f9, float f10) {
        c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f9), Float.valueOf(f10)));
    }

    public final void a(WebView webView) {
        c(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    private void c(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void b(WebView webView, float f9, float f10, float f11, float f12) {
        c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f9), Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12)));
    }

    public final void a(WebView webView, Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        c(webView, AbstractC2914a.e("javascript:window.mraidbridge.fireChangeEvent(", jSONObject.toString(), ");"));
    }

    public final void b(WebView webView, String str) {
        c(webView, AbstractC2914a.e("javascript:window.mraidbridge.setIsViewable(", str, ");"));
    }

    public final void a(WebView webView, String str, String str2) {
        c(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    public final void a(WebView webView, float f9, float f10) {
        c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f9), Float.valueOf(f10)));
    }

    public final void a(WebView webView, double d2) {
        Locale locale = Locale.CHINA;
        c(webView, "javascript:window.mraidbridge.audioVolumeChange(" + d2 + ");");
    }

    public final void a(WebView webView, float f9, float f10, float f11, float f12) {
        c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f9), Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12)));
    }

    public final void a(WebView webView, String str) {
        c(webView, AbstractC2914a.e("javascript:window.mraidbridge.nativeCallComplete('", str, "');"));
    }
}
