package com.mbridge.msdk.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.applovin.impl.L;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ar;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;

/* loaded from: classes3.dex */
public class DomainMBCommonActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    String f14593a = "";
    private final BrowserView.a b = new BrowserView.a() { // from class: com.mbridge.msdk.activity.DomainMBCommonActivity.1
        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a(WebView webView, int i9, String str, String str2) {
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
            L.B("onPageFinished  ", str, "MBCommonActivity");
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a(WebView webView, String str) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a() {
            DomainMBCommonActivity.this.finish();
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a(WebView webView, String str, Bitmap bitmap) {
            L.B("onPageStarted  ", str, "MBCommonActivity");
        }
    };
    protected BrowserView browserView;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f14594c;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            ad.b("MBCommonActivity", th.getMessage());
        }
        if (c.m().c() == null) {
            c.m().b(getApplicationContext());
        }
        c.m().a(this);
        String stringExtra = getIntent().getStringExtra("url");
        this.f14593a = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f14594c = (CampaignEx) getIntent().getSerializableExtra("mvcommon");
            if (b.f16164a.containsKey(this.f14593a)) {
                BrowserView browserView = b.f16164a.get(this.f14593a);
                this.browserView = browserView;
                if (browserView != null) {
                    browserView.setListener(this.b);
                }
            } else {
                BrowserView browserView2 = new BrowserView(this, this.f14594c);
                this.browserView = browserView2;
                browserView2.setListener(this.b);
                this.browserView.loadUrl(this.f14593a);
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
    /* JADX WARN: Can't wrap try/catch for region: R(14:12|13|(4:15|(1:17)|18|(2:20|21)(2:22|(4:24|(1:30)|28|29)))|31|(1:33)(2:61|(1:66)(1:65))|(1:35)|36|37|(2:41|42)|44|45|(4:47|(1:52)|53|54)|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c7, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cd, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b("MBCommonActivity", r10.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0098, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b("MBCommonActivity", r5.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0009, B:7:0x0010, B:9:0x001e, B:12:0x002a, B:15:0x0037, B:18:0x00d4, B:20:0x00da, B:22:0x00e3, B:24:0x00e9, B:26:0x00ef, B:31:0x0045, B:33:0x0050, B:35:0x0072, B:58:0x00cd, B:60:0x0099, B:61:0x0055, B:63:0x005f, B:65:0x0069, B:45:0x00a0, B:47:0x00ac, B:49:0x00ba, B:53:0x00c9, B:37:0x0078, B:39:0x0082, B:41:0x008c), top: B:2:0x0009, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0009, B:7:0x0010, B:9:0x001e, B:12:0x002a, B:15:0x0037, B:18:0x00d4, B:20:0x00da, B:22:0x00e3, B:24:0x00e9, B:26:0x00ef, B:31:0x0045, B:33:0x0050, B:35:0x0072, B:58:0x00cd, B:60:0x0099, B:61:0x0055, B:63:0x005f, B:65:0x0069, B:45:0x00a0, B:47:0x00ac, B:49:0x00ba, B:53:0x00c9, B:37:0x0078, B:39:0x0082, B:41:0x008c), top: B:2:0x0009, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.webkit.WebView r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "intent"
            java.lang.String r1 = "https"
            java.lang.String r2 = "http"
            java.lang.String r3 = "MBCommonActivity"
            r4 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L10
            return r4
        L10:
            android.net.Uri r5 = android.net.Uri.parse(r11)     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = r5.getScheme()     // Catch: java.lang.Throwable -> L42
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto Lf9
            java.lang.String r6 = r5.getScheme()     // Catch: java.lang.Throwable -> L42
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto L2a
            goto Lf9
        L2a:
            java.lang.String r6 = r5.getScheme()     // Catch: java.lang.Throwable -> L42
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r7 = "android-app"
            r8 = 1
            if (r6 != 0) goto L45
            java.lang.String r6 = r5.getScheme()     // Catch: java.lang.Throwable -> L42
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto Ld4
            goto L45
        L42:
            r10 = move-exception
            goto Lfa
        L45:
            java.lang.String r6 = r5.getScheme()     // Catch: java.lang.Throwable -> L42
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L42
            r6 = 0
            if (r0 == 0) goto L55
            android.content.Intent r0 = android.content.Intent.parseUri(r11, r8)     // Catch: java.lang.Throwable -> L42
            goto L70
        L55:
            java.lang.String r0 = r5.getScheme()     // Catch: java.lang.Throwable -> L42
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6f
            java.lang.String r0 = r5.getScheme()     // Catch: java.lang.Throwable -> L42
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6f
            r0 = 2
            android.content.Intent r0 = android.content.Intent.parseUri(r11, r0)     // Catch: java.lang.Throwable -> L42
            goto L70
        L6f:
            r0 = r6
        L70:
            if (r0 == 0) goto L78
            r0.setComponent(r6)     // Catch: java.lang.Throwable -> L42
            r0.setSelector(r6)     // Catch: java.lang.Throwable -> L42
        L78:
            java.lang.String r5 = r0.getPackage()     // Catch: java.lang.Throwable -> L98
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L98
            if (r6 != 0) goto La0
            android.content.pm.PackageManager r6 = r9.getPackageManager()     // Catch: java.lang.Throwable -> L98
            android.content.Intent r5 = r6.getLaunchIntentForPackage(r5)     // Catch: java.lang.Throwable -> L98
            if (r5 == 0) goto La0
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r5)     // Catch: java.lang.Throwable -> L98
            r9.startActivityForResult(r0, r4)     // Catch: java.lang.Throwable -> L98
            r9.finish()     // Catch: java.lang.Throwable -> L98
            return r8
        L98:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L42
            com.mbridge.msdk.foundation.tools.ad.b(r3, r5)     // Catch: java.lang.Throwable -> L42
        La0:
            java.lang.String r5 = "browser_fallback_url"
            java.lang.String r0 = r0.getStringExtra(r5)     // Catch: java.lang.Throwable -> Lc7
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lc7
            if (r5 != 0) goto Ld4
            android.net.Uri r5 = android.net.Uri.parse(r11)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r6 = r5.getScheme()     // Catch: java.lang.Throwable -> Lc7
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> Lc7
            if (r6 != 0) goto Lc9
            java.lang.String r5 = r5.getScheme()     // Catch: java.lang.Throwable -> Lc7
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Throwable -> Lc7
            if (r5 == 0) goto Lc5
            goto Lc9
        Lc5:
            r11 = r0
            goto Ld4
        Lc7:
            r10 = move-exception
            goto Lcd
        Lc9:
            r10.loadUrl(r0)     // Catch: java.lang.Throwable -> Lc7
            return r4
        Lcd:
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L42
            com.mbridge.msdk.foundation.tools.ad.b(r3, r10)     // Catch: java.lang.Throwable -> L42
        Ld4:
            boolean r10 = com.mbridge.msdk.click.c.d(r9, r11)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Le3
            java.lang.String r10 = "openDeepLink"
            com.mbridge.msdk.foundation.tools.ad.b(r3, r10)     // Catch: java.lang.Throwable -> L42
            r9.finish()     // Catch: java.lang.Throwable -> L42
            return r8
        Le3:
            boolean r10 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L42
            if (r10 != 0) goto Lf9
            boolean r10 = r11.startsWith(r2)     // Catch: java.lang.Throwable -> L42
            if (r10 != 0) goto Lf5
            boolean r10 = r11.startsWith(r1)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lf6
        Lf5:
            r4 = r8
        Lf6:
            r10 = r4 ^ 1
            return r10
        Lf9:
            return r4
        Lfa:
            java.lang.String r10 = r10.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r3, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.activity.DomainMBCommonActivity.a(android.webkit.WebView, java.lang.String):boolean");
    }
}
