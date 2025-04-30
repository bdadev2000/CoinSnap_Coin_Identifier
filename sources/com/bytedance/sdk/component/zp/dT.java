package com.bytedance.sdk.component.zp;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.zp.Bj;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class dT {
    Context COT;
    boolean HWF;
    Bj.zp KVG;
    boolean QR;
    tG YW;
    boolean dQp;
    rV dT;
    ku jU;
    boolean ku;
    zp lMd;
    boolean rV;
    WebView zp;
    String KS = "IESJSBridge";
    String Bj = "host";
    final Set<String> vDp = new LinkedHashSet();
    final Set<String> tG = new LinkedHashSet();

    public dT(WebView webView) {
        this.zp = webView;
    }

    private void KS() {
        if ((this.zp != null || this.rV || this.lMd != null) && ((!TextUtils.isEmpty(this.KS) || this.zp == null) && this.jU != null)) {
        } else {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public dT lMd(boolean z8) {
        this.QR = z8;
        return this;
    }

    public dT zp(zp zpVar) {
        this.lMd = zpVar;
        return this;
    }

    public woN lMd() {
        KS();
        return new woN(this);
    }

    public dT zp(String str) {
        this.KS = str;
        return this;
    }

    public dT zp(vDp vdp) {
        this.jU = ku.zp(vdp);
        return this;
    }

    public dT zp(boolean z8) {
        this.HWF = z8;
        return this;
    }

    public dT zp() {
        this.dQp = true;
        return this;
    }

    public dT() {
    }
}
