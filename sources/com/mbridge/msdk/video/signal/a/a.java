package com.mbridge.msdk.video.signal.a;

import android.app.Activity;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.a;

/* loaded from: classes4.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* renamed from: j, reason: collision with root package name */
    protected String f16082j;

    /* renamed from: k, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.d.c f16083k;

    /* renamed from: l, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f16084l;
    protected boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f16074b = false;

    /* renamed from: c, reason: collision with root package name */
    protected int f16075c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected int f16076d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected int f16077e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected int f16078f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected int f16079g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected int f16080h = 1;

    /* renamed from: i, reason: collision with root package name */
    protected int f16081i = -1;

    /* renamed from: m, reason: collision with root package name */
    public a.InterfaceC0212a f16085m = new C0213a();

    /* renamed from: n, reason: collision with root package name */
    protected int f16086n = 2;

    /* renamed from: o, reason: collision with root package name */
    private kd.b f16087o = null;

    /* renamed from: p, reason: collision with root package name */
    private ld.b f16088p = null;

    /* renamed from: q, reason: collision with root package name */
    private kd.a f16089q = null;

    /* renamed from: com.mbridge.msdk.video.signal.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0213a implements a.InterfaceC0212a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public void a() {
            ad.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0212a
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
        public void onDownloadProgress(int i10) {
            com.applovin.impl.mediation.ads.e.y("onDownloadProgress,progress:", i10, "DefaultJSCommon");
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

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public void a(boolean z10) {
            ad.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public void a(int i10, String str) {
            ad.a("DefaultJSCommon", "onH5Error,code:" + i10 + "，msg:" + str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(String str) {
        com.applovin.impl.mediation.ads.e.A("setUnitId:", str, "DefaultJSCommon");
        this.f16082j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void b(int i10) {
        this.f16076d = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void c(int i10) {
        this.f16075c = i10;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
        ad.a("DefaultJSCommon", "click:type" + i10 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void d(int i10) {
        this.f16077e = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void e(int i10) {
        this.f16079g = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int g() {
        return this.f16081i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void h(int i10) {
        com.applovin.impl.mediation.ads.e.y("setAlertDialogRole ", i10, "DefaultJSCommon");
        this.f16080h = i10;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
        ad.a("DefaultJSCommon", "handlerH5Exception,code=" + i10 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String i() {
        ad.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    public final kd.b j() {
        return this.f16087o;
    }

    public final ld.b k() {
        return this.f16088p;
    }

    public final kd.a l() {
        return this.f16089q;
    }

    public final int m() {
        if (this.f16075c == 0 && this.f16074b) {
            this.f16075c = 1;
        }
        return this.f16075c;
    }

    public final int n() {
        if (this.f16076d == 0 && this.f16074b) {
            this.f16076d = 1;
        }
        return this.f16076d;
    }

    public final int o() {
        if (this.f16077e == 0 && this.f16074b) {
            this.f16077e = 1;
        }
        return this.f16077e;
    }

    public final boolean p() {
        return this.f16074b;
    }

    /* loaded from: classes4.dex */
    public static class b implements a.InterfaceC0212a {
        private com.mbridge.msdk.video.signal.d a;

        /* renamed from: b, reason: collision with root package name */
        private a.InterfaceC0212a f16090b;

        public b(com.mbridge.msdk.video.signal.d dVar, a.InterfaceC0212a interfaceC0212a) {
            this.a = dVar;
            this.f16090b = interfaceC0212a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public final void a() {
            a.InterfaceC0212a interfaceC0212a = this.f16090b;
            if (interfaceC0212a != null) {
                interfaceC0212a.a();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public final void b() {
            a.InterfaceC0212a interfaceC0212a = this.f16090b;
            if (interfaceC0212a != null) {
                interfaceC0212a.b();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDismissLoading(Campaign campaign) {
            a.InterfaceC0212a interfaceC0212a = this.f16090b;
            if (interfaceC0212a != null) {
                interfaceC0212a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadFinish(Campaign campaign) {
            a.InterfaceC0212a interfaceC0212a = this.f16090b;
            if (interfaceC0212a != null) {
                interfaceC0212a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadProgress(int i10) {
            a.InterfaceC0212a interfaceC0212a = this.f16090b;
            if (interfaceC0212a != null) {
                interfaceC0212a.onDownloadProgress(i10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadStart(Campaign campaign) {
            a.InterfaceC0212a interfaceC0212a = this.f16090b;
            if (interfaceC0212a != null) {
                interfaceC0212a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            a.InterfaceC0212a interfaceC0212a = this.f16090b;
            if (interfaceC0212a != null) {
                interfaceC0212a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.a;
            if (dVar != null) {
                dVar.d();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final boolean onInterceptDefaultLoadingDialog() {
            a.InterfaceC0212a interfaceC0212a = this.f16090b;
            return interfaceC0212a != null && interfaceC0212a.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            a.InterfaceC0212a interfaceC0212a = this.f16090b;
            if (interfaceC0212a != null) {
                interfaceC0212a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.a;
            if (dVar != null) {
                dVar.d();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onShowLoading(Campaign campaign) {
            a.InterfaceC0212a interfaceC0212a = this.f16090b;
            if (interfaceC0212a != null) {
                interfaceC0212a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            a.InterfaceC0212a interfaceC0212a = this.f16090b;
            if (interfaceC0212a != null) {
                interfaceC0212a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public final void a(boolean z10) {
            a.InterfaceC0212a interfaceC0212a = this.f16090b;
            if (interfaceC0212a != null) {
                interfaceC0212a.a(z10);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public final void a(int i10, String str) {
            a.InterfaceC0212a interfaceC0212a = this.f16090b;
            if (interfaceC0212a != null) {
                interfaceC0212a.a(i10, str);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final boolean b() {
        return this.a;
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
        com.mbridge.msdk.click.a aVar = this.f16084l;
        if (aVar != null) {
            aVar.a(false);
            this.f16084l.a((NativeListener.NativeTrackingListener) null);
            this.f16084l.a();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void f(int i10) {
        this.f16081i = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g(int i10) {
        ad.a("DefaultJSCommon", "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void b(boolean z10) {
        this.a = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(String str) {
        ad.a("DefaultJSCommon", "setNotchArea");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(kd.b bVar) {
        this.f16087o = bVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int h() {
        ad.a("DefaultJSCommon", "getAlertDialogRole " + this.f16080h);
        return this.f16080h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(ld.b bVar) {
        this.f16088p = bVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(kd.a aVar) {
        this.f16089q = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(int i10) {
        this.f16086n = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int a() {
        return this.f16079g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(boolean z10) {
        ad.a("DefaultJSCommon", "setIsShowingTransparent:" + z10);
        this.f16074b = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(a.InterfaceC0212a interfaceC0212a) {
        ad.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0212a);
        this.f16085m = interfaceC0212a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(com.mbridge.msdk.videocommon.d.c cVar) {
        ad.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f16083k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10, String str) {
        ad.a("DefaultJSCommon", "statistics,type:" + i10 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(Activity activity) {
        ad.a("DefaultJSCommon", "setActivity ");
    }
}
