package com.mbridge.msdk.splash.c;

import Q7.n0;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f17882a;
    private boolean b;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f17888a = new g();

        public static /* synthetic */ g a() {
            return f17888a;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void a(int i9);

        void a(String str);
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private String f17889a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f17890c;

        /* renamed from: d, reason: collision with root package name */
        private String f17891d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17892e;

        /* renamed from: f, reason: collision with root package name */
        private int f17893f;

        public final String a() {
            return this.f17891d;
        }

        public final String b() {
            return this.f17889a;
        }

        public final String c() {
            return this.b;
        }

        public final CampaignEx d() {
            return this.f17890c;
        }

        public final boolean e() {
            return this.f17892e;
        }

        public final int f() {
            return this.f17893f;
        }

        public final void a(String str) {
            this.f17891d = str;
        }

        public final void b(String str) {
            this.f17889a = str;
        }

        public final void c(String str) {
            this.b = str;
        }

        public final void a(CampaignEx campaignEx) {
            this.f17890c = campaignEx;
        }

        public final void a(boolean z8) {
            this.f17892e = z8;
        }

        public final void a(int i9) {
            this.f17893f = i9;
        }
    }

    private g() {
        this.f17882a = false;
        this.b = false;
    }

    public final void a() {
        this.f17882a = false;
        this.b = false;
    }

    public final void a(final MBSplashView mBSplashView, c cVar, final b bVar) {
        String requestId;
        if (mBSplashView == null || cVar == null) {
            return;
        }
        final String c9 = cVar.c();
        String b8 = cVar.b();
        final CampaignEx d2 = cVar.d();
        String a6 = cVar.a();
        boolean e4 = cVar.e();
        int f9 = cVar.f();
        MBSplashWebview splashWebview = mBSplashView.getSplashWebview();
        if (splashWebview == null) {
            return;
        }
        com.mbridge.msdk.splash.signal.c cVar2 = new com.mbridge.msdk.splash.signal.c(mBSplashView.getContext(), b8, c9);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d2);
        cVar2.a(arrayList);
        cVar2.a(e4 ? 1 : 0);
        cVar2.b(f9);
        mBSplashView.setSplashSignalCommunicationImpl(cVar2);
        if (TextUtils.isEmpty(d2.getRequestId())) {
            requestId = d2.getRequestIdNotice();
        } else {
            requestId = d2.getRequestId();
        }
        String requestId2 = splashWebview.getRequestId();
        ad.b("WebViewRenderManager", "CampaignEx RequestId = " + requestId + " WebView RequestId = " + requestId2);
        if (!TextUtils.isEmpty(requestId2) && requestId2.equals(requestId) && (this.f17882a || this.b)) {
            mBSplashView.setH5Ready(true);
            if (bVar != null) {
                bVar.a(1);
                return;
            }
            return;
        }
        a();
        splashWebview.setRequestId(requestId);
        com.mbridge.msdk.splash.a.c a9 = com.mbridge.msdk.splash.a.c.a().c(d2.getId()).d(d2.getRequestId()).g(d2.getRequestIdNotice()).b(c9).a(d2.isBidCampaign());
        if (a9 != null) {
            a9.a("2000067");
            com.mbridge.msdk.foundation.same.report.g.a(a9.b(), com.mbridge.msdk.foundation.controller.c.m().c(), c9);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        splashWebview.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.splash.c.g.1
            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i9) {
                super.a(webView, i9);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(i9);
                }
                if (i9 == 1) {
                    g.this.f17882a = true;
                    mBSplashView.setH5Ready(true);
                    com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), d2, c9, "", currentTimeMillis, 1);
                    com.mbridge.msdk.splash.e.a.a(d2, c9);
                    return;
                }
                g.this.f17882a = false;
                mBSplashView.setH5Ready(false);
                com.mbridge.msdk.splash.e.a.a(d2, "readyState 2", c9);
                com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), d2, c9, "readyState 2", currentTimeMillis, 3);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i9, String str, String str2) {
                super.a(webView, i9, str, str2);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(str);
                }
                g.this.a();
                mBSplashView.setH5Ready(false);
                com.mbridge.msdk.splash.e.a.a(d2, n0.f(i9, "error code:", str), c9);
                com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), d2, c9, n0.f(i9, "error code:", str), currentTimeMillis, 3);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.a(webView, sslErrorHandler, sslError);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(sslError.toString());
                }
                g.this.a();
                mBSplashView.setH5Ready(false);
                com.mbridge.msdk.splash.e.a.a(d2, "error url:" + sslError.getUrl(), c9);
                com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), d2, c9, "error url:" + sslError.getUrl(), currentTimeMillis, 3);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, String str) {
                super.a(webView, str);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a();
                }
                g.this.b = true;
                if (!d2.isHasMBTplMark()) {
                    mBSplashView.setH5Ready(true);
                    com.mbridge.msdk.splash.e.a.a(d2, c9);
                    com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), d2, c9, "", currentTimeMillis, 1);
                }
                com.mbridge.msdk.splash.signal.d.a(webView);
            }
        });
        if (!splashWebview.isDestoryed()) {
            splashWebview.loadUrl(a6);
        } else {
            mBSplashView.setH5Ready(false);
            com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), d2, c9, "webview had destory", currentTimeMillis, 3);
        }
    }
}
