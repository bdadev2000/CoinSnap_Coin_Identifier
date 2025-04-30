package com.mbridge.msdk.mbbanner.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.base.b;
import java.util.List;

/* loaded from: classes3.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    String f16376a;
    List<CampaignEx> b;

    /* renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.mbbanner.common.b.a f16377c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16378d = "BannerWebViewClient";

    public a(String str, List<CampaignEx> list, com.mbridge.msdk.mbbanner.common.b.a aVar) {
        this.f16376a = str;
        this.b = list;
        this.f16377c = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.c.b.a.a().b(), new ValueCallback<String>() { // from class: com.mbridge.msdk.mbbanner.view.a.1
                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable th) {
            ad.b("BannerWebViewClient", "onPageStarted", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            ad.b("BannerWebViewClient", "Use html to open url.");
            BaseWebView baseWebView = (BaseWebView) webView;
            if (System.currentTimeMillis() - baseWebView.lastTouchTime > com.mbridge.msdk.click.b.a.f14796c && com.mbridge.msdk.click.b.a.a(this.b.get(0), baseWebView.getUrl(), com.mbridge.msdk.click.b.a.b)) {
                return false;
            }
            if (this.b.size() > 1) {
                c.m().c().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f16377c;
            if (aVar != null) {
                aVar.a(false, str);
            }
            return true;
        } catch (Throwable th) {
            ad.b("BannerWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }
}
