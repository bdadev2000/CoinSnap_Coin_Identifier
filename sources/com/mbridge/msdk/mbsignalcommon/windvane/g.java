package com.mbridge.msdk.mbsignalcommon.windvane;

import Q7.n0;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static g f16696a = new g();

    private g() {
    }

    public static g a() {
        return f16696a;
    }

    public final void b(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                String str2 = aVar.f16682g;
            } else {
                str = j.c(str);
            }
            String j7 = n0.j("javascript:window.WindVane.onFailure(", aVar.f16682g, ",'", str, "');");
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView != null && !windVaneWebView.isDestoryed()) {
                try {
                    aVar.b.loadUrl(j7);
                } catch (Exception e4) {
                    e4.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public final void a(Object obj, String str, String str2) {
        String j7;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str2)) {
                j7 = AbstractC2914a.e("javascript:window.WindVane.fireEvent('", str, "', '');");
            } else {
                j7 = n0.j("javascript:window.WindVane.fireEvent('", str, "','", j.c(str2), "');");
            }
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.b.loadUrl(j7);
            } catch (Exception e4) {
                e4.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void a(WebView webView, String str, String str2) {
        String j7;
        if (TextUtils.isEmpty(str2)) {
            j7 = AbstractC2914a.e("javascript:window.WindVane.fireEvent('", str, "', '');");
        } else {
            j7 = n0.j("javascript:window.WindVane.fireEvent('", str, "','", j.c(str2), "');");
        }
        if (webView != null) {
            if ((webView instanceof WindVaneWebView) && ((WindVaneWebView) webView).isDestoryed()) {
                return;
            }
            try {
                webView.loadUrl(j7);
            } catch (Exception e4) {
                e4.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void a(Object obj, String str) {
        String j7;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                j7 = AbstractC2914a.e("javascript:window.WindVane.onSuccess(", aVar.f16682g, ",'');");
            } else {
                j7 = n0.j("javascript:window.WindVane.onSuccess(", aVar.f16682g, ",'", j.c(str), "');");
            }
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.b.loadUrl(j7);
            } catch (Exception e4) {
                e4.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            f16696a.a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f16594j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            f16696a.a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f16594j, "");
        } catch (Throwable unused2) {
            f16696a.a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f16594j, "");
        }
    }
}
