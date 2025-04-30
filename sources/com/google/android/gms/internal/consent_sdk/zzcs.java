package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class zzcs {
    private static Boolean zza;

    private zzcs() {
    }

    @TargetApi(19)
    public static void zza(WebView webView, String str) {
        boolean booleanValue;
        synchronized (zzcs.class) {
            if (zza == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zza = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    zza = Boolean.FALSE;
                }
            }
            booleanValue = zza.booleanValue();
        }
        if (booleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
