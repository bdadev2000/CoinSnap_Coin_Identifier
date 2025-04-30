package com.mbridge.msdk.video.signal.a;

import android.app.Activity;
import com.applovin.impl.L;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.a;

/* loaded from: classes3.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* renamed from: j, reason: collision with root package name */
    protected String f19067j;

    /* renamed from: k, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.d.c f19068k;
    protected com.mbridge.msdk.click.a l;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f19059a = false;
    protected boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    protected int f19060c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected int f19061d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected int f19062e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected int f19063f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected int f19064g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected int f19065h = 1;

    /* renamed from: i, reason: collision with root package name */
    protected int f19066i = -1;
    public a.InterfaceC0200a m = new C0201a();

    /* renamed from: n, reason: collision with root package name */
    protected int f19069n = 2;

    /* renamed from: o, reason: collision with root package name */
    private O5.b f19070o = null;

    /* renamed from: p, reason: collision with root package name */
    private P5.b f19071p = null;

    /* renamed from: q, reason: collision with root package name */
    private O5.a f19072q = null;

    /* renamed from: com.mbridge.msdk.video.signal.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0201a implements a.InterfaceC0200a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public void a() {
            ad.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public void b() {
            ad.a("DefaultJSCommon", "videoLocationReady");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i9) {
            com.mbridge.msdk.foundation.entity.o.s(i9, "onDownloadProgress,progress:", "DefaultJSCommon");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            ad.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            ad.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public void a(boolean z8) {
            ad.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public void a(int i9, String str) {
            ad.a("DefaultJSCommon", "onH5Error,code:" + i9 + "，msg:" + str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(O5.b bVar) {
        this.f19070o = bVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void b(int i9) {
        this.f19061d = i9;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void c(int i9) {
        this.f19060c = i9;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i9, String str) {
        ad.a("DefaultJSCommon", "click:type" + i9 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void d(int i9) {
        this.f19062e = i9;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void e(int i9) {
        this.f19064g = i9;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int g() {
        return this.f19066i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void h(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "setAlertDialogRole ", "DefaultJSCommon");
        this.f19065h = i9;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i9, String str) {
        ad.a("DefaultJSCommon", "handlerH5Exception,code=" + i9 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String i() {
        ad.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    public final O5.b j() {
        return this.f19070o;
    }

    public final P5.b k() {
        return this.f19071p;
    }

    public final O5.a l() {
        return this.f19072q;
    }

    public final int m() {
        if (this.f19060c == 0 && this.b) {
            this.f19060c = 1;
        }
        return this.f19060c;
    }

    public final int n() {
        if (this.f19061d == 0 && this.b) {
            this.f19061d = 1;
        }
        return this.f19061d;
    }

    public final int o() {
        if (this.f19062e == 0 && this.b) {
            this.f19062e = 1;
        }
        return this.f19062e;
    }

    public final boolean p() {
        return this.b;
    }

    /* loaded from: classes3.dex */
    public static class b implements a.InterfaceC0200a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f19073a;
        private a.InterfaceC0200a b;

        public b(com.mbridge.msdk.video.signal.d dVar, a.InterfaceC0200a interfaceC0200a) {
            this.f19073a = dVar;
            this.b = interfaceC0200a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public final void a() {
            a.InterfaceC0200a interfaceC0200a = this.b;
            if (interfaceC0200a != null) {
                interfaceC0200a.a();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public final void b() {
            a.InterfaceC0200a interfaceC0200a = this.b;
            if (interfaceC0200a != null) {
                interfaceC0200a.b();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDismissLoading(Campaign campaign) {
            a.InterfaceC0200a interfaceC0200a = this.b;
            if (interfaceC0200a != null) {
                interfaceC0200a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadFinish(Campaign campaign) {
            a.InterfaceC0200a interfaceC0200a = this.b;
            if (interfaceC0200a != null) {
                interfaceC0200a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadProgress(int i9) {
            a.InterfaceC0200a interfaceC0200a = this.b;
            if (interfaceC0200a != null) {
                interfaceC0200a.onDownloadProgress(i9);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadStart(Campaign campaign) {
            a.InterfaceC0200a interfaceC0200a = this.b;
            if (interfaceC0200a != null) {
                interfaceC0200a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            a.InterfaceC0200a interfaceC0200a = this.b;
            if (interfaceC0200a != null) {
                interfaceC0200a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f19073a;
            if (dVar != null) {
                dVar.d();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final boolean onInterceptDefaultLoadingDialog() {
            a.InterfaceC0200a interfaceC0200a = this.b;
            if (interfaceC0200a != null && interfaceC0200a.onInterceptDefaultLoadingDialog()) {
                return true;
            }
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            a.InterfaceC0200a interfaceC0200a = this.b;
            if (interfaceC0200a != null) {
                interfaceC0200a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f19073a;
            if (dVar != null) {
                dVar.d();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onShowLoading(Campaign campaign) {
            a.InterfaceC0200a interfaceC0200a = this.b;
            if (interfaceC0200a != null) {
                interfaceC0200a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            a.InterfaceC0200a interfaceC0200a = this.b;
            if (interfaceC0200a != null) {
                interfaceC0200a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public final void a(boolean z8) {
            a.InterfaceC0200a interfaceC0200a = this.b;
            if (interfaceC0200a != null) {
                interfaceC0200a.a(z8);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public final void a(int i9, String str) {
            a.InterfaceC0200a interfaceC0200a = this.b;
            if (interfaceC0200a != null) {
                interfaceC0200a.a(i9, str);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(P5.b bVar) {
        this.f19071p = bVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final boolean b() {
        return this.f19059a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        ad.a("DefaultJSCommon", "init");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d() {
        ad.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void e() {
        ad.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.l;
        if (aVar != null) {
            aVar.a(false);
            this.l.a((NativeListener.NativeTrackingListener) null);
            this.l.a();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void f(int i9) {
        this.f19066i = i9;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g(int i9) {
        ad.a("DefaultJSCommon", "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(O5.a aVar) {
        this.f19072q = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void b(boolean z8) {
        this.f19059a = z8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(int i9) {
        this.f19069n = i9;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(String str) {
        ad.a("DefaultJSCommon", "setNotchArea");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int a() {
        return this.f19064g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(boolean z8) {
        ad.a("DefaultJSCommon", "setIsShowingTransparent:" + z8);
        this.b = z8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(String str) {
        L.C("setUnitId:", str, "DefaultJSCommon");
        this.f19067j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int h() {
        ad.a("DefaultJSCommon", "getAlertDialogRole " + this.f19065h);
        return this.f19065h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(a.InterfaceC0200a interfaceC0200a) {
        ad.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0200a);
        this.m = interfaceC0200a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(com.mbridge.msdk.videocommon.d.c cVar) {
        ad.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f19068k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i9, String str) {
        ad.a("DefaultJSCommon", "statistics,type:" + i9 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(Activity activity) {
        ad.a("DefaultJSCommon", "setActivity ");
    }
}
