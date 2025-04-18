package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class zzfoi extends zzfoh {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfoi(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzn(webView);
    }
}
