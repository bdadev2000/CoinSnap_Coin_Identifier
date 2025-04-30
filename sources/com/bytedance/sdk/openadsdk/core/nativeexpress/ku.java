package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.jU.ku;
import com.bytedance.sdk.openadsdk.core.RCv;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ku extends com.bytedance.sdk.openadsdk.core.widget.zp.COT {
    private final com.bytedance.sdk.openadsdk.core.model.woN lMd;
    public ArrayList<Integer> zp;

    public ku(Context context, RCv rCv, com.bytedance.sdk.openadsdk.core.model.woN won, com.bytedance.sdk.openadsdk.lMd.dT dTVar) {
        super(context, rCv, won.fgJ(), dTVar, false);
        this.zp = new ArrayList<>();
        this.lMd = won;
    }

    private String KS() {
        com.bytedance.sdk.openadsdk.core.model.woN won = this.lMd;
        if (won != null && won.fRl() != null) {
            return this.lMd.fRl().vDp();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.QR = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.ku = false;
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    public int zp() {
        Iterator<Integer> it = this.zp.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() == 3 || next.intValue() == 2 || next.intValue() == -1) {
                return next.intValue();
            }
        }
        return TextUtils.isEmpty(KS()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.adexpress.zp.lMd.zp zp = zp(webView, str);
            zp(currentTimeMillis, System.currentTimeMillis(), str, (zp == null || zp.zp() == null) ? 2 : 1);
            if (zp != null && zp.lMd() != 5) {
                zp.lMd();
                this.zp.add(Integer.valueOf(zp.lMd()));
            }
            if (zp != null && zp.zp() != null) {
                return zp.zp();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("ExpressClient", "shouldInterceptRequest error2", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    private com.bytedance.sdk.component.adexpress.zp.lMd.zp zp(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.rV rVVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ku.zp zp = com.bytedance.sdk.component.adexpress.jU.ku.zp(str);
        if (zp != ku.zp.IMAGE) {
            Iterator<com.bytedance.sdk.openadsdk.core.model.rV> it = this.lMd.Rg().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.sdk.openadsdk.core.model.rV next = it.next();
                if (!TextUtils.isEmpty(next.zp()) && !TextUtils.isEmpty(str)) {
                    String zp2 = next.zp();
                    if (zp2.startsWith(Constants.SCHEME)) {
                        zp2 = zp2.replaceFirst(Constants.SCHEME, "http");
                    }
                    if ((str.startsWith(Constants.SCHEME) ? str.replaceFirst(Constants.SCHEME, "http") : str).equals(zp2)) {
                        rVVar = next;
                        break;
                    }
                }
            }
        }
        if (zp != ku.zp.IMAGE && rVVar == null) {
            return com.bytedance.sdk.component.adexpress.zp.lMd.lMd.zp(str, zp, "", KS());
        }
        com.bytedance.sdk.component.adexpress.zp.lMd.zp zpVar = new com.bytedance.sdk.component.adexpress.zp.lMd.zp();
        zpVar.zp(5);
        zpVar.zp(zp(str, com.bytedance.sdk.openadsdk.core.nativeexpress.zp.lMd.zp(this.lMd, str)));
        return zpVar;
    }

    private WebResourceResponse zp(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream zp = com.bytedance.sdk.openadsdk.HWF.jU.zp(str, str2);
            if (zp != null) {
                return new WebResourceResponse(ku.zp.IMAGE.zp(), "utf-8", zp);
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("ExpressClient", "get image WebResourceResponse error", th);
            return null;
        }
    }

    private void zp(long j7, long j9, String str, int i9) {
        com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.HWF;
        if (dTVar == null || dTVar.lMd() == null) {
            return;
        }
        ku.zp zp = com.bytedance.sdk.component.adexpress.jU.ku.zp(str);
        if (zp == ku.zp.HTML) {
            this.HWF.lMd().zp(str, j7, j9, i9);
        } else if (zp == ku.zp.JS) {
            this.HWF.lMd().lMd(str, j7, j9, i9);
        }
    }
}
