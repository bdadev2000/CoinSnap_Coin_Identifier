package com.mbridge.msdk.mbbanner.a;

import android.text.TextUtils;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.aq;
import com.mbridge.msdk.mbbanner.common.a.b;
import com.mbridge.msdk.mbbanner.common.c.c;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f16213a = "BannerController";
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f16214c;

    /* renamed from: d, reason: collision with root package name */
    private MBridgeIds f16215d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16216e;

    /* renamed from: f, reason: collision with root package name */
    private int f16217f;

    /* renamed from: g, reason: collision with root package name */
    private MBBannerView f16218g;

    /* renamed from: h, reason: collision with root package name */
    private int f16219h;

    /* renamed from: i, reason: collision with root package name */
    private int f16220i;

    /* renamed from: j, reason: collision with root package name */
    private int f16221j;
    private BannerAdListener l;
    private CampaignUnit m;

    /* renamed from: n, reason: collision with root package name */
    private c f16223n;

    /* renamed from: o, reason: collision with root package name */
    private k f16224o;

    /* renamed from: p, reason: collision with root package name */
    private j f16225p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f16226q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f16227r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f16228s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f16229t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f16230u;

    /* renamed from: k, reason: collision with root package name */
    private int f16222k = -1;

    /* renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.c f16231v = new com.mbridge.msdk.mbbanner.common.b.c() { // from class: com.mbridge.msdk.mbbanner.a.a.1
        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(List<CampaignEx> list) {
            if (a.this.l != null) {
                a.this.l.onLoadSuccessed(a.this.f16215d);
            }
            ad.b(a.f16213a, "onShowSuccessed:");
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void b() {
            if (a.this.l != null) {
                a.this.l.onLeaveApp(a.this.f16215d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void c() {
            if (a.this.l != null) {
                a.this.l.showFullScreen(a.this.f16215d);
                a.this.f16230u = true;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, a.this.f16214c, a.this.b, null, null);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void d() {
            if (a.this.l != null) {
                a.this.l.closeFullScreen(a.this.f16215d);
                a.this.f16230u = false;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, a.this.f16214c, a.this.b, new b(a.this.f16220i + "x" + a.this.f16219h, a.this.f16221j * 1000), a.this.f16232w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void e() {
            if (a.this.l != null) {
                a.this.l.onCloseBanner(a.this.f16215d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(CampaignEx campaignEx) {
            a.this.d();
            if (a.this.l != null) {
                a.this.l.onLogImpression(a.this.f16215d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(String str) {
            a.this.b(str);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a() {
            if (a.this.l != null) {
                a.this.l.onClick(a.this.f16215d);
            }
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.b f16232w = new com.mbridge.msdk.mbbanner.common.b.b() { // from class: com.mbridge.msdk.mbbanner.a.a.2
        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, CampaignUnit campaignUnit, boolean z8) {
            a.this.m = campaignUnit;
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void b(com.mbridge.msdk.foundation.c.b bVar) {
            boolean z8;
            CampaignEx campaignEx;
            if (a.this.l != null) {
                a.this.l.onLoadFailed(a.this.f16215d, "banner res load failed");
            }
            a.this.d();
            String str = "";
            if (bVar != null) {
                String b = bVar.b();
                if (!TextUtils.isEmpty(b)) {
                    str = b;
                }
                z8 = bVar.e();
                campaignEx = bVar.c();
            } else {
                z8 = false;
                campaignEx = null;
            }
            i.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.b, z8, campaignEx);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            String str;
            CampaignEx campaignEx;
            boolean z8;
            str = "";
            if (bVar != null) {
                String b = bVar.b();
                str = TextUtils.isEmpty(b) ? "" : b;
                campaignEx = bVar.c();
                z8 = bVar.e();
            } else {
                campaignEx = null;
                z8 = false;
            }
            if (a.this.l != null) {
                a.this.l.onLoadFailed(a.this.f16215d, str);
            }
            a.this.d();
            try {
                i.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.b, z8, campaignEx);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, boolean z8) {
            if (a.this.m != null) {
                try {
                    i.a(com.mbridge.msdk.foundation.controller.c.m().c(), a.this.m.getAds(), a.this.b, z8);
                } catch (Exception unused) {
                }
            }
            if (a.this.f16218g != null) {
                a.this.f16229t = true;
                a.this.i();
            }
        }
    };

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f16218g = mBBannerView;
        if (bannerSize != null) {
            this.f16219h = bannerSize.getHeight();
            this.f16220i = bannerSize.getWidth();
        }
        this.b = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f16214c = str;
        this.f16215d = new MBridgeIds(str, this.b);
        String k6 = com.mbridge.msdk.foundation.controller.c.m().k();
        String b = com.mbridge.msdk.foundation.controller.c.m().b();
        if (this.f16225p == null) {
            this.f16225p = new j();
        }
        this.f16225p.a(com.mbridge.msdk.foundation.controller.c.m().c(), k6, b, this.b);
        h();
    }

    private int b(int i9) {
        if (i9 <= 0) {
            return i9;
        }
        int i10 = 10;
        if (i9 >= 10) {
            i10 = 180;
            if (i9 <= 180) {
                return i9;
            }
        }
        return i10;
    }

    private void h() {
        k d2 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.b);
        this.f16224o = d2;
        if (d2 == null) {
            this.f16224o = k.d(this.b);
        }
        if (this.f16222k == -1) {
            this.f16221j = b(this.f16224o.q());
        }
        if (this.f16217f == 0) {
            boolean z8 = this.f16224o.f() == 1;
            this.f16216e = z8;
            c cVar = this.f16223n;
            if (cVar != null) {
                cVar.a(z8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f16228s || !this.f16229t) {
            return;
        }
        MBBannerView mBBannerView = this.f16218g;
        if (this.m != null) {
            if (this.f16223n == null) {
                this.f16223n = new c(mBBannerView, this.f16231v, this.f16214c, this.b, this.f16216e, this.f16224o);
            }
            this.f16223n.b(this.f16226q);
            this.f16223n.c(this.f16227r);
            this.f16223n.a(this.f16216e, this.f16217f);
            this.f16223n.a(this.m);
        } else {
            b("banner show failed because campain is exception");
        }
        this.f16229t = false;
    }

    private void j() {
        MBBannerView mBBannerView = this.f16218g;
        if (mBBannerView != null) {
            if (this.f16226q && this.f16227r && !this.f16230u && !aq.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.f16214c, this.b, new b(this.f16220i + "x" + this.f16219h, this.f16221j * 1000), this.f16232w);
            } else {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, this.f16214c, this.b, null, null);
            }
            if (this.f16226q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f16214c, this.b, null, null);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(this.b);
        }
    }

    private void k() {
        j();
        c cVar = this.f16223n;
        if (cVar != null) {
            cVar.b(this.f16226q);
            this.f16223n.c(this.f16227r);
        }
    }

    public final void c() {
        this.f16228s = true;
        if (this.l != null) {
            this.l = null;
        }
        if (this.f16232w != null) {
            this.f16232w = null;
        }
        if (this.f16231v != null) {
            this.f16231v = null;
        }
        if (this.f16218g != null) {
            this.f16218g = null;
        }
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f16214c, this.b, null, null);
        com.mbridge.msdk.mbbanner.common.c.a.a().a(this.b);
        com.mbridge.msdk.mbbanner.common.c.a.a().b();
        c cVar = this.f16223n;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        if (this.f16228s) {
            return;
        }
        j();
        h();
        b bVar = new b(this.f16220i + "x" + this.f16219h, this.f16221j * 1000);
        bVar.b(this.f16214c);
        bVar.a(true);
        com.mbridge.msdk.mbbanner.common.c.a.a().b(this.f16214c, this.b, bVar, this.f16232w);
    }

    public final void e() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f16214c, this.b, new b(this.f16220i + "x" + this.f16219h, this.f16221j * 1000), this.f16232w);
    }

    public final void f() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.f16214c, this.b, new b(this.f16220i + "x" + this.f16219h, this.f16221j * 1000), this.f16232w);
    }

    public final String b() {
        CampaignUnit campaignUnit = this.m;
        if (campaignUnit != null) {
            return com.mbridge.msdk.foundation.same.c.a(campaignUnit.getAds());
        }
        return "";
    }

    public final String a() {
        CampaignUnit campaignUnit = this.m;
        if (campaignUnit != null && campaignUnit.getRequestId() != null) {
            return this.m.getRequestId();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        BannerAdListener bannerAdListener = this.l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f16215d, str);
        }
        ad.b(f16213a, "showFailed:" + str);
        d();
    }

    public final void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f16219h = bannerSize.getHeight();
            this.f16220i = bannerSize.getWidth();
        }
    }

    public final void a(int i9) {
        int b = b(i9);
        this.f16222k = b;
        this.f16221j = b;
    }

    public final void b(boolean z8) {
        this.f16226q = z8;
        k();
        i();
    }

    public final void a(boolean z8) {
        this.f16216e = z8;
        this.f16217f = z8 ? 1 : 2;
    }

    public final void a(String str) {
        boolean z8;
        if (this.f16219h >= 1 && this.f16220i >= 1) {
            try {
                z8 = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(com.mbridge.msdk.foundation.controller.c.m().c());
            } catch (Exception unused) {
                z8 = false;
            }
            if (!z8) {
                BannerAdListener bannerAdListener = this.l;
                if (bannerAdListener != null) {
                    bannerAdListener.onLoadFailed(this.f16215d, "banner load failed because WebView is not available");
                    return;
                }
                return;
            }
            b bVar = new b(this.f16220i + "x" + this.f16219h, this.f16221j * 1000);
            bVar.a(str);
            bVar.b(this.f16214c);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f16214c, this.b, bVar, this.f16232w);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(1, this.f16214c, this.b, bVar, this.f16232w);
            return;
        }
        BannerAdListener bannerAdListener2 = this.l;
        if (bannerAdListener2 != null) {
            bannerAdListener2.onLoadFailed(this.f16215d, "banner load failed because params are exception");
        }
    }

    public final void c(boolean z8) {
        this.f16227r = z8;
        k();
    }

    public final void a(BannerAdListener bannerAdListener) {
        this.l = bannerAdListener;
    }

    public final void a(int i9, int i10, int i11, int i12) {
        c cVar = this.f16223n;
        if (cVar != null) {
            cVar.a(i9, i10, i11, i12);
        }
    }
}
