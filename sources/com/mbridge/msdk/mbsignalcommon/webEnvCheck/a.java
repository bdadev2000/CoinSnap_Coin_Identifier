package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.base.b;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f16658a;
    private static volatile Handler b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f16659c;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView != null) {
            try {
                webView.destroy();
                return true;
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("MBWebViewChecker", "destroy webview error", e4);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(final Context context) {
        g gVar;
        try {
            gVar = h.a().a(c.m().k());
        } catch (Exception unused) {
            gVar = null;
        }
        if (gVar != null) {
            f16659c = Boolean.valueOf(gVar.aC());
        } else {
            f16659c = Boolean.FALSE;
        }
        Boolean bool = f16659c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f16658a == null) {
                try {
                    f16658a = Boolean.valueOf(c(context));
                } catch (Exception unused2) {
                    f16658a = Boolean.FALSE;
                }
            }
            if (f16658a == null) {
                f16658a = new Boolean(false);
            }
            return f16658a.booleanValue();
        }
        if (f16658a == null && b == null) {
            b = new Handler(Looper.getMainLooper());
            b.post(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.f16658a == null) {
                        try {
                            Boolean unused3 = a.f16658a = Boolean.valueOf(a.c(context));
                        } catch (Exception unused4) {
                            Boolean unused5 = a.f16658a = Boolean.FALSE;
                        }
                    }
                }
            });
        }
        if (f16658a == null) {
            return true;
        }
        return f16658a.booleanValue();
    }
}
