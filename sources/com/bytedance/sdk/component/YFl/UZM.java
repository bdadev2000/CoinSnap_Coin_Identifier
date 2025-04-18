package com.bytedance.sdk.component.YFl;

import a4.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class UZM extends YFl {

    /* renamed from: nc, reason: collision with root package name */
    static final /* synthetic */ boolean f10341nc = true;
    protected WebView NjR;
    protected String qsH;

    public void AlY() {
        this.NjR.removeJavascriptInterface(this.qsH);
    }

    @Override // com.bytedance.sdk.component.YFl.YFl
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public void Sg(nc ncVar) {
        this.NjR = ncVar.YFl;
        this.qsH = ncVar.tN;
        if (ncVar.pDU) {
            return;
        }
        tN();
    }

    @Override // com.bytedance.sdk.component.YFl.YFl
    public Context YFl(nc ncVar) {
        Context context = ncVar.wN;
        if (context != null) {
            return context;
        }
        WebView webView = ncVar.YFl;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.YFl.YFl
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void tN() {
        if (!f10341nc && this.NjR == null) {
            throw new AssertionError();
        }
        this.NjR.addJavascriptInterface(this, this.qsH);
    }

    @Override // com.bytedance.sdk.component.YFl.YFl
    public void Sg() {
        super.Sg();
        AlY();
    }

    @Override // com.bytedance.sdk.component.YFl.YFl
    public String YFl() {
        return this.NjR.getUrl();
    }

    @Override // com.bytedance.sdk.component.YFl.YFl
    public void YFl(String str, rkt rktVar) {
        if (rktVar != null && !TextUtils.isEmpty(rktVar.qsH)) {
            String str2 = rktVar.qsH;
            YFl(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.YFl(str, rktVar);
    }

    @Override // com.bytedance.sdk.component.YFl.YFl
    public void YFl(String str) {
        YFl(str, j.k(new StringBuilder("javascript:"), this.qsH, "._handleMessageFromToutiao(", str, ")"));
    }

    private void YFl(String str, final String str2) {
        if (this.f10342vc || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.YFl.UZM.1
            @Override // java.lang.Runnable
            public void run() {
                if (UZM.this.f10342vc) {
                    return;
                }
                try {
                    UZM.this.NjR.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.AlY.post(runnable);
        } else {
            runnable.run();
        }
    }
}
