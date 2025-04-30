package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.impl.L;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.foundation.same.g.a;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.videocommon.download.d;
import com.mbridge.msdk.videocommon.download.e;

/* loaded from: classes3.dex */
public class MBridgeAlertWebview extends MBridgeH5EndCardView {

    /* renamed from: w, reason: collision with root package name */
    private String f18766w;

    public MBridgeAlertWebview(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void preLoadData(b bVar) {
        String a6 = a();
        if (this.f18771e && this.b != null && !TextUtils.isEmpty(a6)) {
            a aVar = new a(this.b);
            aVar.a(this.b.getAppName());
            this.f18845p.setDownloadListener(aVar);
            this.f18845p.setCampaignId(this.b.getId());
            setCloseVisible(8);
            this.f18845p.setApiManagerJSFactory(bVar);
            this.f18845p.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.video.module.MBridgeAlertWebview.1
                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, String str) {
                    super.a(webView, str);
                    ad.b("MBridgeAlertWebview", "finish+" + str);
                    g.a().a(webView);
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i9, String str, String str2) {
                    super.a(webView, i9, str, str2);
                    ad.b("MBridgeAlertWebview", "onReceivedError");
                    if (MBridgeAlertWebview.this.f18849t) {
                        return;
                    }
                    L.C("onReceivedError,url:", str2, MBridgeBaseView.TAG);
                    MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
                    i.a(mBridgeAlertWebview.f18768a, mBridgeAlertWebview.b, mBridgeAlertWebview.f18766w, MBridgeAlertWebview.this.unitId, 2, str, 1);
                    MBridgeAlertWebview.this.f18849t = true;
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i9) {
                    String str;
                    super.a(webView, i9);
                    ad.b("MBridgeAlertWebview", "readyState  :  " + i9);
                    MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
                    if (mBridgeAlertWebview.f18849t) {
                        return;
                    }
                    boolean z8 = i9 == 1;
                    mBridgeAlertWebview.f18848s = z8;
                    if (z8) {
                        str = o.h(i9, "readyState state is ");
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    MBridgeAlertWebview mBridgeAlertWebview2 = MBridgeAlertWebview.this;
                    i.a(mBridgeAlertWebview2.f18768a, mBridgeAlertWebview2.b, mBridgeAlertWebview2.f18766w, MBridgeAlertWebview.this.unitId, i9, str2, 1);
                }
            });
            setHtmlSource(e.a().b(a6));
            this.f18848s = false;
            if (TextUtils.isEmpty(this.f18847r)) {
                L.C("load url:", a6, MBridgeBaseView.TAG);
                this.f18845p.loadUrl(a6);
            } else {
                ad.a(MBridgeBaseView.TAG, "load html...");
                this.f18845p.loadDataWithBaseURL(a6, this.f18847r, "text/html", "UTF-8", null);
            }
            this.f18845p.setBackgroundColor(0);
            setBackgroundColor(0);
            return;
        }
        this.notifyListener.a(101, "");
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f18843n;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
        i.a(this.f18768a, this.b, this.f18766w, this.unitId, 2, 1);
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public final String a() {
        if (!TextUtils.isEmpty(this.unitId)) {
            com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.unitId, false);
            String str = com.mbridge.msdk.videocommon.d.c.f19350a;
            this.f18766w = str;
            if (!TextUtils.isEmpty(str)) {
                return d.a().a(this.f18766w);
            }
            return "";
        }
        return "";
    }
}
