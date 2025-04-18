package com.mbridge.msdk.mbsignalcommon.mraid;

import android.webkit.WebView;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0182a {
        private static final a a = new a();
    }

    public static a a() {
        return C0182a.a;
    }

    public final void b(WebView webView, float f10, float f11) {
        c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public final void c(WebView webView, float f10, float f11) {
        c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public final void a(WebView webView) {
        c(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    private void c(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public final void a(WebView webView, Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        c(webView, String.format("javascript:window.mraidbridge.fireChangeEvent(%s);", jSONObject.toString()));
    }

    public final void b(WebView webView, float f10, float f11, float f12, float f13) {
        c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
    }

    public final void b(WebView webView, String str) {
        c(webView, String.format("javascript:window.mraidbridge.setIsViewable(%s);", str));
    }

    public final void a(WebView webView, String str, String str2) {
        c(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    public final void a(WebView webView, float f10, float f11) {
        c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public final void a(WebView webView, double d10) {
        c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.audioVolumeChange(%s);", Double.valueOf(d10)));
    }

    public final void a(WebView webView, float f10, float f11, float f12, float f13) {
        c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
    }

    public final void a(WebView webView, String str) {
        c(webView, String.format("javascript:window.mraidbridge.nativeCallComplete('%s');", str));
    }
}
