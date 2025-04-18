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

/* loaded from: classes4.dex */
public final class a {
    private static volatile Boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f14127b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f14128c;

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
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("MBWebViewChecker", "destroy webview error", e2);
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
            f14128c = Boolean.valueOf(gVar.aC());
        } else {
            f14128c = Boolean.FALSE;
        }
        Boolean bool = f14128c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (a == null) {
                try {
                    a = Boolean.valueOf(c(context));
                } catch (Exception unused2) {
                    a = Boolean.FALSE;
                }
            }
            if (a == null) {
                a = new Boolean(false);
            }
            return a.booleanValue();
        }
        if (a == null && f14127b == null) {
            f14127b = new Handler(Looper.getMainLooper());
            f14127b.post(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.a == null) {
                        try {
                            Boolean unused3 = a.a = Boolean.valueOf(a.c(context));
                        } catch (Exception unused4) {
                            Boolean unused5 = a.a = Boolean.FALSE;
                        }
                    }
                }
            });
        }
        if (a == null) {
            return true;
        }
        return a.booleanValue();
    }
}
