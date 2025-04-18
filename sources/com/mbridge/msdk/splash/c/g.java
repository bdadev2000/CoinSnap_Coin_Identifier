package com.mbridge.msdk.splash.c;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class g {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15190b;

    /* loaded from: classes4.dex */
    public static class a {
        private static final g a = new g();

        public static /* synthetic */ g a() {
            return a;
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a();

        void a(int i10);

        void a(String str);
    }

    /* loaded from: classes4.dex */
    public static class c {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f15196b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f15197c;

        /* renamed from: d, reason: collision with root package name */
        private String f15198d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f15199e;

        /* renamed from: f, reason: collision with root package name */
        private int f15200f;

        public final String a() {
            return this.f15198d;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.f15196b;
        }

        public final CampaignEx d() {
            return this.f15197c;
        }

        public final boolean e() {
            return this.f15199e;
        }

        public final int f() {
            return this.f15200f;
        }

        public final void a(String str) {
            this.f15198d = str;
        }

        public final void b(String str) {
            this.a = str;
        }

        public final void c(String str) {
            this.f15196b = str;
        }

        public final void a(CampaignEx campaignEx) {
            this.f15197c = campaignEx;
        }

        public final void a(boolean z10) {
            this.f15199e = z10;
        }

        public final void a(int i10) {
            this.f15200f = i10;
        }
    }

    private g() {
        this.a = false;
        this.f15190b = false;
    }

    public final void a() {
        this.a = false;
        this.f15190b = false;
    }

    public final void a(final MBSplashView mBSplashView, c cVar, final b bVar) {
        String requestId;
        if (mBSplashView == null || cVar == null) {
            return;
        }
        final String c10 = cVar.c();
        String b3 = cVar.b();
        final CampaignEx d10 = cVar.d();
        String a10 = cVar.a();
        boolean e2 = cVar.e();
        int f10 = cVar.f();
        MBSplashWebview splashWebview = mBSplashView.getSplashWebview();
        if (splashWebview == null) {
            return;
        }
        com.mbridge.msdk.splash.signal.c cVar2 = new com.mbridge.msdk.splash.signal.c(mBSplashView.getContext(), b3, c10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d10);
        cVar2.a(arrayList);
        cVar2.a(e2 ? 1 : 0);
        cVar2.b(f10);
        mBSplashView.setSplashSignalCommunicationImpl(cVar2);
        if (TextUtils.isEmpty(d10.getRequestId())) {
            requestId = d10.getRequestIdNotice();
        } else {
            requestId = d10.getRequestId();
        }
        String requestId2 = splashWebview.getRequestId();
        ad.b("WebViewRenderManager", "CampaignEx RequestId = " + requestId + " WebView RequestId = " + requestId2);
        if (!TextUtils.isEmpty(requestId2) && requestId2.equals(requestId) && (this.a || this.f15190b)) {
            mBSplashView.setH5Ready(true);
            if (bVar != null) {
                bVar.a(1);
                return;
            }
            return;
        }
        a();
        splashWebview.setRequestId(requestId);
        com.mbridge.msdk.splash.a.c a11 = com.mbridge.msdk.splash.a.c.a().c(d10.getId()).d(d10.getRequestId()).g(d10.getRequestIdNotice()).b(c10).a(d10.isBidCampaign());
        if (a11 != null) {
            a11.a("2000067");
            com.mbridge.msdk.foundation.same.report.g.a(a11.b(), com.mbridge.msdk.foundation.controller.c.m().c(), c10);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        splashWebview.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.splash.c.g.1
            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i10) {
                super.a(webView, i10);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(i10);
                }
                if (i10 == 1) {
                    g.this.a = true;
                    mBSplashView.setH5Ready(true);
                    com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), d10, c10, "", currentTimeMillis, 1);
                    com.mbridge.msdk.splash.e.a.a(d10, c10);
                    return;
                }
                g.this.a = false;
                mBSplashView.setH5Ready(false);
                com.mbridge.msdk.splash.e.a.a(d10, "readyState 2", c10);
                com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), d10, c10, "readyState 2", currentTimeMillis, 3);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i10, String str, String str2) {
                super.a(webView, i10, str, str2);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(str);
                }
                g.this.a();
                mBSplashView.setH5Ready(false);
                com.mbridge.msdk.splash.e.a.a(d10, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("error code:", i10, str), c10);
                com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), d10, c10, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("error code:", i10, str), currentTimeMillis, 3);
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
                com.mbridge.msdk.splash.e.a.a(d10, "error url:" + sslError.getUrl(), c10);
                com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), d10, c10, "error url:" + sslError.getUrl(), currentTimeMillis, 3);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, String str) {
                super.a(webView, str);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a();
                }
                g.this.f15190b = true;
                if (!d10.isHasMBTplMark()) {
                    mBSplashView.setH5Ready(true);
                    com.mbridge.msdk.splash.e.a.a(d10, c10);
                    com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), d10, c10, "", currentTimeMillis, 1);
                }
                com.mbridge.msdk.splash.signal.d.a(webView);
            }
        });
        if (!splashWebview.isDestoryed()) {
            splashWebview.loadUrl(a10);
        } else {
            mBSplashView.setH5Ready(false);
            com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), d10, c10, "webview had destory", currentTimeMillis, 3);
        }
    }
}
