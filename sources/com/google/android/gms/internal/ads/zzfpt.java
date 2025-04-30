package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class zzfpt extends zzfps {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfpt(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzm(webView);
    }
}
