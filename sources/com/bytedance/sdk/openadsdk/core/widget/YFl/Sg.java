package com.bytedance.sdk.openadsdk.core.widget.YFl;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.utils.rkt;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class Sg implements YFl {
    private com.bytedance.sdk.component.NjR.AlY Sg;
    hQ YFl;
    private AtomicInteger tN = null;
    private boolean AlY = false;

    public void Sg() {
        AtomicInteger atomicInteger = this.tN;
        if (atomicInteger != null && atomicInteger.get() <= 0) {
            return;
        }
        try {
            this.tN.get();
        } catch (Exception unused) {
        }
        String AlY = com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.AlY(null);
        if (this.AlY) {
            String AlY2 = com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.AlY("v3");
            if (AlY != null && AlY.equals(AlY2)) {
                return;
            } else {
                AlY = AlY2;
            }
        }
        if (TextUtils.isEmpty(AlY)) {
            return;
        }
        try {
            com.bytedance.sdk.component.NjR.AlY alY = new com.bytedance.sdk.component.NjR.AlY(new MutableContextWrapper(lG.YFl()));
            this.Sg = alY;
            if (alY.getWebView() == null) {
                return;
            }
            this.Sg.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.YFl.Sg.1
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }
            });
            YFl(this.Sg);
            Uri build = Uri.parse(AlY).buildUpon().appendQueryParameter("isPreLoad", "1").build();
            hQ hQVar = new hQ(this.Sg.getContext());
            this.YFl = hQVar;
            hQVar.Sg(this.Sg).YFl(this).YFl(this.Sg);
            com.bytedance.sdk.component.adexpress.wN.wN.YFl().YFl(this.Sg, this.YFl);
            this.Sg.a_(build.toString());
        } catch (Exception unused2) {
        }
    }

    public void YFl(boolean z10) {
        this.AlY = z10;
        if (z10) {
            this.tN = new AtomicInteger(lG.AlY().tQ());
        } else {
            this.tN = new AtomicInteger(lG.AlY().RX());
        }
    }

    private void YFl(com.bytedance.sdk.component.NjR.AlY alY) {
        if (alY == null || alY.getWebView() == null) {
            return;
        }
        try {
            tN.YFl(lG.YFl()).YFl(false).YFl(alY.getWebView());
            alY.setVerticalScrollBarEnabled(false);
            alY.setHorizontalScrollBarEnabled(false);
            alY.YFl(true);
            alY.nc();
            alY.setUserAgentString(rkt.YFl(alY.getWebView(), BuildConfig.VERSION_CODE));
            alY.setMixedContentMode(0);
            alY.setJavaScriptEnabled(true);
            alY.setJavaScriptCanOpenWindowsAutomatically(true);
            alY.setDomStorageEnabled(true);
            alY.setDatabaseEnabled(true);
            alY.setAppCacheEnabled(true);
            alY.setAllowFileAccess(false);
            alY.setSupportZoom(true);
            alY.setBuiltInZoomControls(true);
            alY.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            alY.setUseWideViewPort(true);
        } catch (Exception e2) {
            YoT.YFl("WebViewPool", e2.toString());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.YFl
    public void YFl() {
        if (this.AlY) {
            com.bytedance.sdk.component.adexpress.wN.wN.YFl().Sg(this.Sg);
        } else {
            com.bytedance.sdk.component.adexpress.wN.wN.YFl().tN(this.Sg);
        }
        AtomicInteger atomicInteger = this.tN;
        if (atomicInteger != null) {
            atomicInteger.get();
            this.tN.decrementAndGet();
            if (this.tN.get() > 0) {
                Sg();
            }
        }
    }
}
