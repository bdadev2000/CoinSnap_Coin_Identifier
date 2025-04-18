package com.mbridge.msdk.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ar;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;

/* loaded from: classes4.dex */
public class DomainMBCommonActivity extends Activity {
    String a = "";

    /* renamed from: b, reason: collision with root package name */
    private final BrowserView.a f12333b = new BrowserView.a() { // from class: com.mbridge.msdk.activity.DomainMBCommonActivity.1
        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a(WebView webView, int i10, String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final boolean b(WebView webView, String str) {
            ad.b("MBCommonActivity", "shouldOverrideUrlLoading  " + str);
            if (ah.a.b(str) && ah.a.a(DomainMBCommonActivity.this, str, null)) {
                DomainMBCommonActivity.this.finish();
            }
            return DomainMBCommonActivity.this.a(webView, str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void c(WebView webView, String str) {
            e.z("onPageFinished  ", str, "MBCommonActivity");
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a(WebView webView, String str) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a(WebView webView, String str, Bitmap bitmap) {
            e.z("onPageStarted  ", str, "MBCommonActivity");
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a() {
            DomainMBCommonActivity.this.finish();
        }
    };
    protected BrowserView browserView;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f12334c;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th2) {
            ad.b("MBCommonActivity", th2.getMessage());
        }
        if (c.m().c() == null) {
            c.m().b(getApplicationContext());
        }
        c.m().a(this);
        String stringExtra = getIntent().getStringExtra("url");
        this.a = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f12334c = (CampaignEx) getIntent().getSerializableExtra("mvcommon");
            if (b.a.containsKey(this.a)) {
                BrowserView browserView = b.a.get(this.a);
                this.browserView = browserView;
                if (browserView != null) {
                    browserView.setListener(this.f12333b);
                }
            } else {
                BrowserView browserView2 = new BrowserView(this, this.f12334c);
                this.browserView = browserView2;
                browserView2.setListener(this.f12333b);
                this.browserView.loadUrl(this.a);
            }
            BrowserView browserView3 = this.browserView;
            if (browserView3 != null) {
                ar.a(browserView3);
                setContentView(this.browserView);
                return;
            }
            return;
        }
        Toast.makeText(this, "Error: no data", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #2 {all -> 0x00ff, blocks: (B:3:0x0007, B:7:0x000e, B:10:0x001f, B:16:0x0030, B:19:0x003c, B:21:0x00d9, B:23:0x00df, B:25:0x00e8, B:27:0x00ee, B:29:0x00f4, B:35:0x0046, B:37:0x0051, B:39:0x0073, B:64:0x00d2, B:66:0x009a, B:67:0x0056, B:69:0x0060, B:71:0x006a, B:49:0x00a1, B:51:0x00ad, B:53:0x00bb, B:58:0x00cb, B:41:0x0079, B:43:0x0083, B:45:0x008d), top: B:2:0x0007, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:49:0x00a1, B:51:0x00ad, B:53:0x00bb, B:58:0x00cb), top: B:48:0x00a1, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.webkit.WebView r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.activity.DomainMBCommonActivity.a(android.webkit.WebView, java.lang.String):boolean");
    }
}
