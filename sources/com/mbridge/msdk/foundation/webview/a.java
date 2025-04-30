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
import com.applovin.impl.L;
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

/* loaded from: classes3.dex */
public class a implements BrowserView.a {

    /* renamed from: a, reason: collision with root package name */
    private static String f16147a = "a";
    private int b;

    /* renamed from: d, reason: collision with root package name */
    private String f16149d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16150e;

    /* renamed from: f, reason: collision with root package name */
    private BaseTrackingListener f16151f;

    /* renamed from: g, reason: collision with root package name */
    private BrowserView f16152g;

    /* renamed from: h, reason: collision with root package name */
    private CampaignEx f16153h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.click.a f16154i;

    /* renamed from: j, reason: collision with root package name */
    private Context f16155j;
    private JumpLoaderResult l;

    /* renamed from: o, reason: collision with root package name */
    private long f16158o;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16148c = true;
    private boolean m = false;

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f16157n = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.1
        @Override // java.lang.Runnable
        public final void run() {
            ad.b(a.f16147a, "webview js！超时上限：" + a.this.b + "ms");
            if (a.this.f16154i != null && a.this.l != null) {
                a.this.l.setSuccess(false);
                a.this.l.setUrl(a.this.f16149d);
                a.this.l.setType(2);
                a.this.l.setExceptionMsg("linktype 8 time out");
                a.this.f16154i.a(a.this.l, a.this.f16153h, 1, false);
            }
            a aVar = a.this;
            if (aVar.d(null, aVar.f16149d) && !a.this.m) {
                a.this.m = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.f16155j, a.this.f16149d, a.this.f16153h);
            }
            if (a.this.f16151f != null) {
                a.this.f16151f.onFinishRedirection(a.this.f16153h, a.this.f16149d);
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private Handler f16156k = new Handler(Looper.getMainLooper());

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.b = 10000;
        this.l = null;
        this.f16155j = context;
        this.f16153h = campaignEx;
        this.f16152g = browserView;
        this.f16151f = baseTrackingListener;
        g f9 = L.f(h.a());
        if (f9 == null) {
            h.a();
            f9 = i.a();
        }
        this.f16154i = aVar;
        this.l = new JumpLoaderResult();
        this.b = (int) f9.ao();
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            if (!parse.getScheme().equals("http") && !parse.getScheme().equals(Constants.SCHEME)) {
                if (parse.getScheme().equals("intent")) {
                    Intent parseUri = Intent.parseUri(str, 1);
                    try {
                        String str2 = parseUri.getPackage();
                        if (!TextUtils.isEmpty(str2)) {
                            if (this.f16155j.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                                return false;
                            }
                        }
                    } catch (Throwable th) {
                        ad.b(f16147a, th.getMessage());
                    }
                    try {
                        String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri parse2 = Uri.parse(str);
                            if (!parse2.getScheme().equals("http")) {
                                if (!parse2.getScheme().equals(Constants.SCHEME)) {
                                    str = stringExtra;
                                }
                            }
                            return true;
                        }
                    } catch (Throwable th2) {
                        ad.b(f16147a, th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f16155j, str)) {
                    ad.b(f16147a, "openDeepLink");
                    return false;
                }
            }
            return true;
        } catch (Throwable th3) {
            ad.b(f16147a, th3.getMessage());
            return true;
        }
    }

    private boolean e(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            if (!parse.getScheme().equals("http") && !parse.getScheme().equals(Constants.SCHEME)) {
                if (parse.getScheme().equals("intent")) {
                    Intent parseUri = Intent.parseUri(str, 1);
                    try {
                        String str2 = parseUri.getPackage();
                        if (!TextUtils.isEmpty(str2) && this.f16155j.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            parseUri.setFlags(268435456);
                            this.f16155j.startActivity(parseUri);
                            this.m = true;
                            return true;
                        }
                    } catch (Throwable th) {
                        ad.b(f16147a, th.getMessage());
                    }
                    try {
                        String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri parse2 = Uri.parse(str);
                            if (!parse2.getScheme().equals("http") && !parse2.getScheme().equals(Constants.SCHEME)) {
                                str = stringExtra;
                            }
                            webView.loadUrl(stringExtra);
                            return false;
                        }
                    } catch (Throwable th2) {
                        ad.b(f16147a, th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f16155j, str)) {
                    ad.b(f16147a, "openDeepLink");
                    this.m = true;
                    return true;
                }
            }
            return false;
        } catch (Throwable th3) {
            ad.b(f16147a, th3.getMessage());
            return false;
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void c(WebView webView, final String str) {
        L.B("onPageFinished1  ", str, f16147a);
        if (this.f16148c) {
            this.f16158o = 0L;
            this.f16148c = false;
            com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f16151f != null) {
                        a.this.f16151f.onFinishRedirection(a.this.f16153h, str);
                    }
                    if (a.this.f16154i != null && a.this.l != null) {
                        a.this.l.setSuccess(true);
                        a.this.l.setUrl(str);
                        a.this.l.setType(2);
                        a.this.f16154i.a(a.this.l, a.this.f16153h, 1, true);
                    }
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri parse = Uri.parse(str);
            if ((parse.getScheme().equals("http") || parse.getScheme().equals(Constants.SCHEME)) && !this.m) {
                this.m = true;
                a(this.f16155j, str, this.f16153h);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final boolean b(WebView webView, final String str) {
        L.B("shouldOverrideUrlLoading1  ", str, f16147a);
        this.f16148c = false;
        if (ah.a.b(str) && ah.a.a(this.f16155j, str, null)) {
            this.m = true;
        }
        boolean e4 = e(webView, str);
        if (e4) {
            this.f16158o = 0L;
            this.f16148c = false;
            c();
            com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f16154i != null && a.this.l != null) {
                        a.this.l.setSuccess(true);
                        a.this.l.setUrl(str);
                        a.this.l.setType(2);
                        a.this.f16154i.a(a.this.l, a.this.f16153h, 1, true);
                    }
                    if (a.this.f16151f != null) {
                        a.this.f16151f.onFinishRedirection(a.this.f16153h, str);
                    }
                }
            });
        }
        return e4;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str) {
        if (this.f16158o == 0) {
            this.f16158o = System.currentTimeMillis();
            if (!this.f16150e) {
                this.f16150e = true;
                d();
            }
        }
        this.f16149d = str;
        this.f16148c = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str, Bitmap bitmap) {
        if (this.f16158o == 0) {
            this.f16158o = System.currentTimeMillis();
            if (!this.f16150e) {
                this.f16150e = true;
                d();
            }
            this.m = false;
        }
        this.f16149d = str;
        this.f16148c = true;
    }

    private void d() {
        this.f16156k.postDelayed(this.f16157n, this.b);
    }

    private void c() {
        this.f16156k.removeCallbacks(this.f16157n);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, int i9, final String str, final String str2) {
        ad.d(f16147a, str);
        c();
        com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.f16151f != null) {
                    a.this.f16151f.onFinishRedirection(a.this.f16153h, str2);
                }
                if (a.this.f16154i != null && a.this.l != null) {
                    a.this.l.setSuccess(false);
                    a.this.l.setUrl(str2);
                    a.this.l.setType(2);
                    a.this.l.setExceptionMsg(str);
                    a.this.f16154i.a(a.this.l, a.this.f16153h, 1, true);
                }
            }
        });
        if (!d(webView, str2) || this.m) {
            return;
        }
        this.m = true;
        a(this.f16155j, str2, this.f16153h);
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
            int i9 = MBCommonActivity.f14600d;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            b.f16164a.put(str, this.f16152g);
            if (ah.a.a(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            ad.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            ah.a(context, str, this.f16151f, campaignEx, new ArrayList());
        }
    }
}
