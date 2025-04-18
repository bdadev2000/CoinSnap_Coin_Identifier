package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.g.a;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.videocommon.download.d;
import eb.j;

/* loaded from: classes4.dex */
public class MBridgeAlertWebview extends MBridgeH5EndCardView {

    /* renamed from: w, reason: collision with root package name */
    private String f15894w;

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
        String a = a();
        if (this.f15898e && this.f15895b != null && !TextUtils.isEmpty(a)) {
            a aVar = new a(this.f15895b);
            aVar.a(this.f15895b.getAppName());
            this.f15934p.setDownloadListener(aVar);
            this.f15934p.setCampaignId(this.f15895b.getId());
            setCloseVisible(8);
            this.f15934p.setApiManagerJSFactory(bVar);
            this.f15934p.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.video.module.MBridgeAlertWebview.1
                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, String str) {
                    super.a(webView, str);
                    ad.b("MBridgeAlertWebview", "finish+" + str);
                    g.a().a(webView);
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i10, String str, String str2) {
                    super.a(webView, i10, str, str2);
                    ad.b("MBridgeAlertWebview", "onReceivedError");
                    if (MBridgeAlertWebview.this.f15938t) {
                        return;
                    }
                    e.A("onReceivedError,url:", str2, MBridgeBaseView.TAG);
                    MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
                    i.a(mBridgeAlertWebview.a, mBridgeAlertWebview.f15895b, mBridgeAlertWebview.f15894w, MBridgeAlertWebview.this.unitId, 2, str, 1);
                    MBridgeAlertWebview.this.f15938t = true;
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i10) {
                    super.a(webView, i10);
                    ad.b("MBridgeAlertWebview", "readyState  :  " + i10);
                    MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
                    if (mBridgeAlertWebview.f15938t) {
                        return;
                    }
                    boolean z10 = i10 == 1;
                    mBridgeAlertWebview.f15937s = z10;
                    String i11 = z10 ? j.i("readyState state is ", i10) : "";
                    MBridgeAlertWebview mBridgeAlertWebview2 = MBridgeAlertWebview.this;
                    i.a(mBridgeAlertWebview2.a, mBridgeAlertWebview2.f15895b, mBridgeAlertWebview2.f15894w, MBridgeAlertWebview.this.unitId, i10, i11, 1);
                }
            });
            setHtmlSource(com.mbridge.msdk.videocommon.download.e.a().b(a));
            this.f15937s = false;
            if (TextUtils.isEmpty(this.f15936r)) {
                e.A("load url:", a, MBridgeBaseView.TAG);
                this.f15934p.loadUrl(a);
            } else {
                ad.a(MBridgeBaseView.TAG, "load html...");
                this.f15934p.loadDataWithBaseURL(a, this.f15936r, "text/html", "UTF-8", null);
            }
            this.f15934p.setBackgroundColor(0);
            setBackgroundColor(0);
            return;
        }
        this.notifyListener.a(101, "");
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f15932n;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
        i.a(this.a, this.f15895b, this.f15894w, this.unitId, 2, 1);
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public final String a() {
        if (TextUtils.isEmpty(this.unitId)) {
            return "";
        }
        com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.unitId, false);
        String str = com.mbridge.msdk.videocommon.d.c.a;
        this.f15894w = str;
        return !TextUtils.isEmpty(str) ? d.a().a(this.f15894w) : "";
    }
}
