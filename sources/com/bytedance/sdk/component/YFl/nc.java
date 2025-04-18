package com.bytedance.sdk.component.YFl;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.YFl.eT;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class nc {
    qsH AlY;
    boolean DSW;
    boolean EH;
    GA NjR;
    YFl Sg;
    WebView YFl;

    /* renamed from: nc, reason: collision with root package name */
    pDU f10344nc;
    boolean pDU;
    boolean qsH;
    eT.YFl rkt;

    /* renamed from: vc, reason: collision with root package name */
    boolean f10345vc;
    Context wN;
    String tN = "IESJSBridge";
    String eT = "host";
    final Set<String> YoT = new LinkedHashSet();
    final Set<String> GA = new LinkedHashSet();

    public nc(WebView webView) {
        this.YFl = webView;
    }

    private void tN() {
        if ((this.YFl != null || this.pDU || this.Sg != null) && ((!TextUtils.isEmpty(this.tN) || this.YFl == null) && this.AlY != null)) {
        } else {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public nc Sg(boolean z10) {
        this.DSW = z10;
        return this;
    }

    public nc YFl(YFl yFl) {
        this.Sg = yFl;
        return this;
    }

    public lG Sg() {
        tN();
        return new lG(this);
    }

    public nc YFl(String str) {
        this.tN = str;
        return this;
    }

    public nc YFl(YoT yoT) {
        this.AlY = qsH.YFl(yoT);
        return this;
    }

    public nc YFl(boolean z10) {
        this.f10345vc = z10;
        return this;
    }

    public nc YFl() {
        this.EH = true;
        return this;
    }

    public nc() {
    }
}
