package com.applovin.impl;

import android.webkit.WebView;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;

/* loaded from: classes3.dex */
public final /* synthetic */ class dw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f23547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23548c;

    public /* synthetic */ dw(WebView webView, String str, int i2) {
        this.f23546a = i2;
        this.f23547b = webView;
        this.f23548c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f23546a;
        String str = this.f23548c;
        WebView webView = this.f23547b;
        switch (i2) {
            case 0:
                AppLovinNetworkBridge.webviewLoadUrl(webView, str);
                return;
            default:
                tr.b(webView, str);
                return;
        }
    }
}
