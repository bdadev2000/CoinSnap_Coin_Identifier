package com.bytedance.sdk.component.zp;

import Q7.n0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.o;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class RCv extends zp {
    static final /* synthetic */ boolean dT = true;
    protected WebView YW;
    protected String ku;

    @SuppressLint({"AddJavascriptInterface"})
    public void KS() {
        if (!dT && this.YW == null) {
            throw new AssertionError();
        }
        this.YW.addJavascriptInterface(this, this.ku);
    }

    @Override // com.bytedance.sdk.component.zp.zp
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    public void jU() {
        this.YW.removeJavascriptInterface(this.ku);
    }

    @Override // com.bytedance.sdk.component.zp.zp
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public void lMd(dT dTVar) {
        this.YW = dTVar.zp;
        this.ku = dTVar.KS;
        if (dTVar.rV) {
            return;
        }
        KS();
    }

    @Override // com.bytedance.sdk.component.zp.zp
    public Context zp(dT dTVar) {
        Context context = dTVar.COT;
        if (context != null) {
            return context;
        }
        WebView webView = dTVar.zp;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.zp.zp
    public void lMd() {
        super.lMd();
        jU();
    }

    @Override // com.bytedance.sdk.component.zp.zp
    public String zp() {
        return this.YW.getUrl();
    }

    @Override // com.bytedance.sdk.component.zp.zp
    public void zp(String str, KVG kvg) {
        if (kvg != null && !TextUtils.isEmpty(kvg.ku)) {
            String str2 = kvg.ku;
            zp(str, AbstractC2914a.h(o.o("javascript:(function(){   const iframe = document.querySelector(atob('", Base64.encodeToString(("iframe[src=\"" + str2 + "\"").getBytes(), 2), "'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(", str, ", atob('"), Base64.encodeToString(str2.getBytes(), 2), "'));   }})()"));
            return;
        }
        super.zp(str, kvg);
    }

    @Override // com.bytedance.sdk.component.zp.zp
    public void zp(String str) {
        zp(str, n0.m(new StringBuilder("javascript:"), this.ku, "._handleMessageFromToutiao(", str, ")"));
    }

    private void zp(String str, final String str2) {
        if (this.HWF || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.zp.RCv.1
            @Override // java.lang.Runnable
            public void run() {
                if (RCv.this.HWF) {
                    return;
                }
                try {
                    RCv.this.YW.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.jU.post(runnable);
        } else {
            runnable.run();
        }
    }
}
