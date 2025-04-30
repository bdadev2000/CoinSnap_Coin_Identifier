package com.bytedance.sdk.openadsdk.core.widget.zp;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.RCv;
import com.bytedance.sdk.openadsdk.utils.dQp;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class lMd implements zp {
    private AtomicInteger KS = null;
    private boolean jU = false;
    private SSWebView lMd;
    RCv zp;

    public void lMd() {
        AtomicInteger atomicInteger = this.KS;
        if (atomicInteger != null && atomicInteger.get() <= 0) {
            return;
        }
        try {
            this.KS.get();
        } catch (Exception unused) {
        }
        String jU = com.bytedance.sdk.component.adexpress.zp.lMd.lMd.jU(null);
        if (this.jU) {
            String jU2 = com.bytedance.sdk.component.adexpress.zp.lMd.lMd.jU("v3");
            if (jU != null && jU.equals(jU2)) {
                return;
            } else {
                jU = jU2;
            }
        }
        if (TextUtils.isEmpty(jU)) {
            return;
        }
        try {
            SSWebView sSWebView = new SSWebView(new MutableContextWrapper(KVG.zp()));
            this.lMd = sSWebView;
            if (sSWebView.getWebView() == null) {
                return;
            }
            this.lMd.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.zp.lMd.1
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }
            });
            zp(this.lMd);
            Uri build = Uri.parse(jU).buildUpon().appendQueryParameter("isPreLoad", "1").build();
            RCv rCv = new RCv(this.lMd.getContext());
            this.zp = rCv;
            rCv.lMd(this.lMd).zp(this).zp(this.lMd);
            com.bytedance.sdk.component.adexpress.COT.COT.zp().zp(this.lMd, this.zp);
            this.lMd.a_(build.toString());
        } catch (Exception unused2) {
        }
    }

    public void zp(boolean z8) {
        this.jU = z8;
        if (z8) {
            this.KS = new AtomicInteger(KVG.jU().GP());
        } else {
            this.KS = new AtomicInteger(KVG.jU().fs());
        }
    }

    private void zp(SSWebView sSWebView) {
        if (sSWebView == null || sSWebView.getWebView() == null) {
            return;
        }
        try {
            KS.zp(KVG.zp()).zp(false).zp(sSWebView.getWebView());
            sSWebView.setVerticalScrollBarEnabled(false);
            sSWebView.setHorizontalScrollBarEnabled(false);
            sSWebView.zp(true);
            sSWebView.dT();
            sSWebView.setUserAgentString(dQp.zp(sSWebView.getWebView(), 6003));
            sSWebView.setMixedContentMode(0);
            sSWebView.setJavaScriptEnabled(true);
            sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
            sSWebView.setDomStorageEnabled(true);
            sSWebView.setDatabaseEnabled(true);
            sSWebView.setAppCacheEnabled(true);
            sSWebView.setAllowFileAccess(false);
            sSWebView.setSupportZoom(true);
            sSWebView.setBuiltInZoomControls(true);
            sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            sSWebView.setUseWideViewPort(true);
        } catch (Exception e4) {
            tG.zp("WebViewPool", e4.toString());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.zp.zp
    public void zp() {
        if (this.jU) {
            com.bytedance.sdk.component.adexpress.COT.COT.zp().lMd(this.lMd);
        } else {
            com.bytedance.sdk.component.adexpress.COT.COT.zp().KS(this.lMd);
        }
        AtomicInteger atomicInteger = this.KS;
        if (atomicInteger != null) {
            atomicInteger.get();
            this.KS.decrementAndGet();
            if (this.KS.get() > 0) {
                lMd();
            }
        }
    }
}
