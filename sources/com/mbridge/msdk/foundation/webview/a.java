package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class a implements BrowserView.a {
    private static String a = "a";

    /* renamed from: b, reason: collision with root package name */
    private int f13692b;

    /* renamed from: d, reason: collision with root package name */
    private String f13694d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13695e;

    /* renamed from: f, reason: collision with root package name */
    private BaseTrackingListener f13696f;

    /* renamed from: g, reason: collision with root package name */
    private BrowserView f13697g;

    /* renamed from: h, reason: collision with root package name */
    private CampaignEx f13698h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.click.a f13699i;

    /* renamed from: j, reason: collision with root package name */
    private Context f13700j;

    /* renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f13702l;

    /* renamed from: o, reason: collision with root package name */
    private long f13705o;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13693c = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13703m = false;

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f13704n = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.1
        @Override // java.lang.Runnable
        public final void run() {
            ad.b(a.a, "webview js！超时上限：" + a.this.f13692b + "ms");
            if (a.this.f13699i != null && a.this.f13702l != null) {
                a.this.f13702l.setSuccess(false);
                a.this.f13702l.setUrl(a.this.f13694d);
                a.this.f13702l.setType(2);
                a.this.f13702l.setExceptionMsg("linktype 8 time out");
                a.this.f13699i.a(a.this.f13702l, a.this.f13698h, 1, false);
            }
            a aVar = a.this;
            if (aVar.d(null, aVar.f13694d) && !a.this.f13703m) {
                a.this.f13703m = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.f13700j, a.this.f13694d, a.this.f13698h);
            }
            if (a.this.f13696f != null) {
                a.this.f13696f.onFinishRedirection(a.this.f13698h, a.this.f13694d);
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private Handler f13701k = new Handler(Looper.getMainLooper());

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f13692b = 10000;
        this.f13702l = null;
        this.f13700j = context;
        this.f13698h = campaignEx;
        this.f13697g = browserView;
        this.f13696f = baseTrackingListener;
        g d10 = e.d(h.a());
        if (d10 == null) {
            h.a();
            d10 = i.a();
        }
        this.f13699i = aVar;
        this.f13702l = new JumpLoaderResult();
        this.f13692b = (int) d10.ao();
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:3:0x0003, B:7:0x000a, B:10:0x001b, B:16:0x002c, B:18:0x0038, B:40:0x008b, B:42:0x0054, B:43:0x0094, B:45:0x009c, B:20:0x003c, B:22:0x0046, B:27:0x005d, B:29:0x0069, B:31:0x0077), top: B:2:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(android.webkit.WebView r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r7 = "http"
            r0 = 1
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto La
            return r0
        La:
            android.net.Uri r1 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Throwable -> La5
            boolean r2 = r2.equals(r7)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "https"
            r4 = 0
            if (r2 != 0) goto L28
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Throwable -> La5
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> La5
            if (r2 == 0) goto L26
            goto L28
        L26:
            r2 = r4
            goto L29
        L28:
            r2 = r0
        L29:
            if (r2 == 0) goto L2c
            return r0
        L2c:
            java.lang.String r1 = r1.getScheme()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "intent"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto L94
            android.content.Intent r1 = android.content.Intent.parseUri(r8, r0)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = r1.getPackage()     // Catch: java.lang.Throwable -> L53
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L5d
            android.content.Context r5 = r6.f13700j     // Catch: java.lang.Throwable -> L53
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L53
            android.content.Intent r2 = r5.getLaunchIntentForPackage(r2)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L5d
            return r4
        L53:
            r2 = move-exception
            java.lang.String r5 = com.mbridge.msdk.foundation.webview.a.a     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> La5
            com.mbridge.msdk.foundation.tools.ad.b(r5, r2)     // Catch: java.lang.Throwable -> La5
        L5d:
            java.lang.String r2 = "browser_fallback_url"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch: java.lang.Throwable -> L8a
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L94
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = r2.getScheme()     // Catch: java.lang.Throwable -> L8a
            boolean r7 = r5.equals(r7)     // Catch: java.lang.Throwable -> L8a
            if (r7 != 0) goto L84
            java.lang.String r7 = r2.getScheme()     // Catch: java.lang.Throwable -> L8a
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L82
            goto L84
        L82:
            r7 = r4
            goto L85
        L84:
            r7 = r0
        L85:
            if (r7 == 0) goto L88
            return r0
        L88:
            r8 = r1
            goto L94
        L8a:
            r7 = move-exception
            java.lang.String r1 = com.mbridge.msdk.foundation.webview.a.a     // Catch: java.lang.Throwable -> La5
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> La5
            com.mbridge.msdk.foundation.tools.ad.b(r1, r7)     // Catch: java.lang.Throwable -> La5
        L94:
            android.content.Context r7 = r6.f13700j     // Catch: java.lang.Throwable -> La5
            boolean r7 = com.mbridge.msdk.click.c.d(r7, r8)     // Catch: java.lang.Throwable -> La5
            if (r7 == 0) goto La4
            java.lang.String r7 = com.mbridge.msdk.foundation.webview.a.a     // Catch: java.lang.Throwable -> La5
            java.lang.String r8 = "openDeepLink"
            com.mbridge.msdk.foundation.tools.ad.b(r7, r8)     // Catch: java.lang.Throwable -> La5
            return r4
        La4:
            return r0
        La5:
            r7 = move-exception
            java.lang.String r8 = com.mbridge.msdk.foundation.webview.a.a
            java.lang.String r7 = r7.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.webview.a.d(android.webkit.WebView, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x0003, B:7:0x000a, B:10:0x001b, B:16:0x002c, B:18:0x0038, B:43:0x009a, B:45:0x0060, B:46:0x00a3, B:48:0x00ab, B:28:0x0069, B:30:0x0075, B:32:0x0083, B:37:0x0093, B:20:0x003c, B:22:0x0046, B:24:0x0052), top: B:2:0x0003, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #1 {all -> 0x0099, blocks: (B:28:0x0069, B:30:0x0075, B:32:0x0083, B:37:0x0093), top: B:27:0x0069, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean e(android.webkit.WebView r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "http"
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto La
            return r1
        La:
            android.net.Uri r2 = android.net.Uri.parse(r9)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r3 = r2.getScheme()     // Catch: java.lang.Throwable -> Lb6
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r4 = "https"
            r5 = 1
            if (r3 != 0) goto L28
            java.lang.String r3 = r2.getScheme()     // Catch: java.lang.Throwable -> Lb6
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> Lb6
            if (r3 == 0) goto L26
            goto L28
        L26:
            r3 = r1
            goto L29
        L28:
            r3 = r5
        L29:
            if (r3 == 0) goto L2c
            return r1
        L2c:
            java.lang.String r2 = r2.getScheme()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r3 = "intent"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto La3
            android.content.Intent r2 = android.content.Intent.parseUri(r9, r5)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r3 = r2.getPackage()     // Catch: java.lang.Throwable -> L5f
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L5f
            if (r6 != 0) goto L69
            android.content.Context r6 = r7.f13700j     // Catch: java.lang.Throwable -> L5f
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L5f
            android.content.Intent r3 = r6.getLaunchIntentForPackage(r3)     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L69
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r3)     // Catch: java.lang.Throwable -> L5f
            android.content.Context r3 = r7.f13700j     // Catch: java.lang.Throwable -> L5f
            r3.startActivity(r2)     // Catch: java.lang.Throwable -> L5f
            r7.f13703m = r5     // Catch: java.lang.Throwable -> L5f
            return r5
        L5f:
            r3 = move-exception
            java.lang.String r6 = com.mbridge.msdk.foundation.webview.a.a     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> Lb6
            com.mbridge.msdk.foundation.tools.ad.b(r6, r3)     // Catch: java.lang.Throwable -> Lb6
        L69:
            java.lang.String r3 = "browser_fallback_url"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch: java.lang.Throwable -> L99
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L99
            if (r3 != 0) goto La3
            android.net.Uri r3 = android.net.Uri.parse(r9)     // Catch: java.lang.Throwable -> L99
            java.lang.String r6 = r3.getScheme()     // Catch: java.lang.Throwable -> L99
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L90
            java.lang.String r0 = r3.getScheme()     // Catch: java.lang.Throwable -> L99
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L8e
            goto L90
        L8e:
            r0 = r1
            goto L91
        L90:
            r0 = r5
        L91:
            if (r0 == 0) goto L97
            r8.loadUrl(r2)     // Catch: java.lang.Throwable -> L99
            return r1
        L97:
            r9 = r2
            goto La3
        L99:
            r8 = move-exception
            java.lang.String r0 = com.mbridge.msdk.foundation.webview.a.a     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> Lb6
            com.mbridge.msdk.foundation.tools.ad.b(r0, r8)     // Catch: java.lang.Throwable -> Lb6
        La3:
            android.content.Context r8 = r7.f13700j     // Catch: java.lang.Throwable -> Lb6
            boolean r8 = com.mbridge.msdk.click.c.d(r8, r9)     // Catch: java.lang.Throwable -> Lb6
            if (r8 == 0) goto Lb5
            java.lang.String r8 = com.mbridge.msdk.foundation.webview.a.a     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r9 = "openDeepLink"
            com.mbridge.msdk.foundation.tools.ad.b(r8, r9)     // Catch: java.lang.Throwable -> Lb6
            r7.f13703m = r5     // Catch: java.lang.Throwable -> Lb6
            return r5
        Lb5:
            return r1
        Lb6:
            r8 = move-exception
            java.lang.String r9 = com.mbridge.msdk.foundation.webview.a.a
            java.lang.String r8 = r8.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r9, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.webview.a.e(android.webkit.WebView, java.lang.String):boolean");
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void c(WebView webView, final String str) {
        e.z("onPageFinished1  ", str, a);
        if (this.f13693c) {
            this.f13705o = 0L;
            this.f13693c = false;
            com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f13696f != null) {
                        a.this.f13696f.onFinishRedirection(a.this.f13698h, str);
                    }
                    if (a.this.f13699i != null && a.this.f13702l != null) {
                        a.this.f13702l.setSuccess(true);
                        a.this.f13702l.setUrl(str);
                        a.this.f13702l.setType(2);
                        a.this.f13699i.a(a.this.f13702l, a.this.f13698h, 1, true);
                    }
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri parse = Uri.parse(str);
            if (!(parse.getScheme().equals("http") || parse.getScheme().equals(Constants.SCHEME)) || this.f13703m) {
                return;
            }
            this.f13703m = true;
            a(this.f13700j, str, this.f13698h);
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final boolean b(WebView webView, final String str) {
        e.z("shouldOverrideUrlLoading1  ", str, a);
        this.f13693c = false;
        if (ah.a.b(str) && ah.a.a(this.f13700j, str, null)) {
            this.f13703m = true;
        }
        boolean e2 = e(webView, str);
        if (e2) {
            this.f13705o = 0L;
            this.f13693c = false;
            c();
            com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f13699i != null && a.this.f13702l != null) {
                        a.this.f13702l.setSuccess(true);
                        a.this.f13702l.setUrl(str);
                        a.this.f13702l.setType(2);
                        a.this.f13699i.a(a.this.f13702l, a.this.f13698h, 1, true);
                    }
                    if (a.this.f13696f != null) {
                        a.this.f13696f.onFinishRedirection(a.this.f13698h, str);
                    }
                }
            });
        }
        return e2;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str) {
        if (this.f13705o == 0) {
            this.f13705o = System.currentTimeMillis();
            if (!this.f13695e) {
                this.f13695e = true;
                d();
            }
        }
        this.f13694d = str;
        this.f13693c = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str, Bitmap bitmap) {
        if (this.f13705o == 0) {
            this.f13705o = System.currentTimeMillis();
            if (!this.f13695e) {
                this.f13695e = true;
                d();
            }
            this.f13703m = false;
        }
        this.f13694d = str;
        this.f13693c = true;
    }

    private void d() {
        this.f13701k.postDelayed(this.f13704n, this.f13692b);
    }

    private void c() {
        this.f13701k.removeCallbacks(this.f13704n);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, int i10, final String str, final String str2) {
        ad.d(a, str);
        c();
        com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.f13696f != null) {
                    a.this.f13696f.onFinishRedirection(a.this.f13698h, str2);
                }
                if (a.this.f13699i != null && a.this.f13702l != null) {
                    a.this.f13702l.setSuccess(false);
                    a.this.f13702l.setUrl(str2);
                    a.this.f13702l.setType(2);
                    a.this.f13702l.setExceptionMsg(str);
                    a.this.f13699i.a(a.this.f13702l, a.this.f13698h, 1, true);
                }
            }
        });
        if (!d(webView, str2) || this.f13703m) {
            return;
        }
        this.f13703m = true;
        a(this.f13700j, str2, this.f13698h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            int i10 = MBCommonActivity.f12337d;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            b.a.put(str, this.f13697g);
            if (ah.a.a(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            ad.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            ah.a(context, str, this.f13696f, campaignEx, new ArrayList());
        }
    }
}
