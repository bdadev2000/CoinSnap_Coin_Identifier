package com.bytedance.sdk.openadsdk.core.qsH;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.AlY.nc;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class nc extends com.bytedance.sdk.openadsdk.core.widget.YFl.wN {
    private final com.bytedance.sdk.openadsdk.core.model.Wwa Sg;
    public ArrayList<Integer> YFl;

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.Sg.GA f10728nc;

    public nc(Context context, hQ hQVar, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, com.bytedance.sdk.openadsdk.AlY.eT eTVar, com.bytedance.sdk.component.adexpress.Sg.GA ga2) {
        super(context, hQVar, wwa.zz(), eTVar, false);
        this.YFl = new ArrayList<>();
        this.Sg = wwa;
        this.f10728nc = ga2;
    }

    private String tN() {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.Sg;
        if (wwa != null) {
            if (wwa.lu() != null) {
                return this.Sg.lu().GA();
            }
            if (this.Sg.UI() != null) {
                return "v3";
            }
            return null;
        }
        return null;
    }

    private WebResourceResponse wN(String str) {
        InputStream YFl;
        if (TextUtils.isEmpty(str) || (YFl = com.bytedance.sdk.openadsdk.core.AlY.YFl.YFl().YFl(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("audio/*", "UTF-8", YFl);
        YFl(webResourceResponse);
        return webResourceResponse;
    }

    public int YFl() {
        Iterator<Integer> it = this.YFl.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() == 3 || next.intValue() == 2 || next.intValue() == -1) {
                return next.intValue();
            }
        }
        return TextUtils.isEmpty(tN()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.DSW = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.qsH = false;
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("ExpressClient", "shouldInterceptRequest error1", th2);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.adexpress.YFl.Sg.YFl YFl = YFl(webView, str);
            YFl(currentTimeMillis, System.currentTimeMillis(), str, (YFl == null || YFl.YFl() == null) ? 2 : 1);
            if (YFl != null && YFl.Sg() != 5) {
                YFl.Sg();
                this.YFl.add(Integer.valueOf(YFl.Sg()));
            }
            if (YFl != null && YFl.YFl() != null) {
                return YFl.YFl();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("ExpressClient", "shouldInterceptRequest error2", th2);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    private com.bytedance.sdk.component.adexpress.YFl.Sg.YFl YFl(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.EH eh2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Wwa.YFl lu = this.Sg.lu();
        if (lu != null && !TextUtils.isEmpty(str) && str.equals(lu.AlY())) {
            com.bytedance.sdk.component.adexpress.YFl.Sg.YFl yFl = new com.bytedance.sdk.component.adexpress.YFl.Sg.YFl();
            yFl.YFl(5);
            WebResourceResponse wN = wN(str);
            yFl.YFl(wN);
            com.bytedance.sdk.openadsdk.core.AlY.YFl.YFl().YFl(wN != null);
            return yFl;
        }
        nc.YFl YFl = com.bytedance.sdk.component.adexpress.AlY.nc.YFl(str);
        if (YFl != nc.YFl.IMAGE) {
            Iterator<com.bytedance.sdk.openadsdk.core.model.EH> it = this.Sg.VB().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.sdk.openadsdk.core.model.EH next = it.next();
                if (!TextUtils.isEmpty(next.YFl()) && !TextUtils.isEmpty(str)) {
                    String YFl2 = next.YFl();
                    if (YFl2.startsWith(Constants.SCHEME)) {
                        YFl2 = YFl2.replaceFirst(Constants.SCHEME, "http");
                    }
                    if ((str.startsWith(Constants.SCHEME) ? str.replaceFirst(Constants.SCHEME, "http") : str).equals(YFl2)) {
                        eh2 = next;
                        break;
                    }
                }
            }
        }
        if (YFl != nc.YFl.IMAGE && eh2 == null) {
            return com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.YFl(str, YFl, "", tN());
        }
        com.bytedance.sdk.component.adexpress.YFl.Sg.YFl yFl2 = new com.bytedance.sdk.component.adexpress.YFl.Sg.YFl();
        yFl2.YFl(5);
        yFl2.YFl(YFl(str, com.bytedance.sdk.openadsdk.core.qsH.YFl.Sg.YFl(this.Sg, str)));
        return yFl2;
    }

    private WebResourceResponse YFl(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream YFl = com.bytedance.sdk.openadsdk.NjR.AlY.YFl(str, str2);
            if (YFl == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(nc.YFl.IMAGE.YFl(), "utf-8", YFl);
            try {
                YFl(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th2) {
                th = th2;
                webResourceResponse = webResourceResponse2;
                com.bytedance.sdk.component.utils.YoT.YFl("ExpressClient", "get image WebResourceResponse error", th);
                return webResourceResponse;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void YFl(long j3, long j10, String str, int i10) {
        com.bytedance.sdk.openadsdk.AlY.eT eTVar = this.f10765vc;
        if (eTVar == null || eTVar.Sg() == null) {
            return;
        }
        nc.YFl YFl = com.bytedance.sdk.component.adexpress.AlY.nc.YFl(str);
        if (YFl == nc.YFl.HTML) {
            this.f10765vc.Sg().YFl(str, j3, j10, i10);
        } else if (YFl == nc.YFl.JS) {
            this.f10765vc.Sg().Sg(str, j3, j10, i10);
        }
    }

    private void YFl(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Access-Control-Allow-Origin", "*");
        webResourceResponse.setResponseHeaders(hashMap);
    }
}
