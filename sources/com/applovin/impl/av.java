package com.applovin.impl;

import android.webkit.WebView;

/* loaded from: classes3.dex */
public final /* synthetic */ class av implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f22964b;

    public /* synthetic */ av(WebView webView, int i2) {
        this.f22963a = i2;
        this.f22964b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f22963a;
        WebView webView = this.f22964b;
        switch (i2) {
            case 0:
                webView.destroy();
                return;
            case 1:
                tr.f(webView);
                return;
            default:
                tr.e(webView);
                return;
        }
    }
}
