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

/* loaded from: classes4.dex */
public final class a {
    private static String a = "BannerController";

    /* renamed from: b, reason: collision with root package name */
    private String f13762b;

    /* renamed from: c, reason: collision with root package name */
    private String f13763c;

    /* renamed from: d, reason: collision with root package name */
    private MBridgeIds f13764d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13765e;

    /* renamed from: f, reason: collision with root package name */
    private int f13766f;

    /* renamed from: g, reason: collision with root package name */
    private MBBannerView f13767g;

    /* renamed from: h, reason: collision with root package name */
    private int f13768h;

    /* renamed from: i, reason: collision with root package name */
    private int f13769i;

    /* renamed from: j, reason: collision with root package name */
    private int f13770j;

    /* renamed from: l, reason: collision with root package name */
    private BannerAdListener f13772l;

    /* renamed from: m, reason: collision with root package name */
    private CampaignUnit f13773m;

    /* renamed from: n, reason: collision with root package name */
    private c f13774n;

    /* renamed from: o, reason: collision with root package name */
    private k f13775o;

    /* renamed from: p, reason: collision with root package name */
    private j f13776p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13777q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13778r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13779s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f13780t;
    private boolean u;

    /* renamed from: k, reason: collision with root package name */
    private int f13771k = -1;

    /* renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.c f13781v = new com.mbridge.msdk.mbbanner.common.b.c() { // from class: com.mbridge.msdk.mbbanner.a.a.1
        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(List<CampaignEx> list) {
            if (a.this.f13772l != null) {
                a.this.f13772l.onLoadSuccessed(a.this.f13764d);
            }
            ad.b(a.a, "onShowSuccessed:");
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void b() {
            if (a.this.f13772l != null) {
                a.this.f13772l.onLeaveApp(a.this.f13764d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void c() {
            if (a.this.f13772l != null) {
                a.this.f13772l.showFullScreen(a.this.f13764d);
                a.this.u = true;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, a.this.f13763c, a.this.f13762b, null, null);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void d() {
            if (a.this.f13772l != null) {
                a.this.f13772l.closeFullScreen(a.this.f13764d);
                a.this.u = false;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, a.this.f13763c, a.this.f13762b, new b(a.this.f13769i + "x" + a.this.f13768h, a.this.f13770j * 1000), a.this.f13782w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void e() {
            if (a.this.f13772l != null) {
                a.this.f13772l.onCloseBanner(a.this.f13764d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(CampaignEx campaignEx) {
            a.this.d();
            if (a.this.f13772l != null) {
                a.this.f13772l.onLogImpression(a.this.f13764d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(String str) {
            a.this.b(str);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a() {
            if (a.this.f13772l != null) {
                a.this.f13772l.onClick(a.this.f13764d);
            }
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.b f13782w = new com.mbridge.msdk.mbbanner.common.b.b() { // from class: com.mbridge.msdk.mbbanner.a.a.2
        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, CampaignUnit campaignUnit, boolean z10) {
            a.this.f13773m = campaignUnit;
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void b(com.mbridge.msdk.foundation.c.b bVar) {
            boolean z10;
            CampaignEx campaignEx;
            if (a.this.f13772l != null) {
                a.this.f13772l.onLoadFailed(a.this.f13764d, "banner res load failed");
            }
            a.this.d();
            String str = "";
            if (bVar != null) {
                String b3 = bVar.b();
                if (!TextUtils.isEmpty(b3)) {
                    str = b3;
                }
                z10 = bVar.e();
                campaignEx = bVar.c();
            } else {
                z10 = false;
                campaignEx = null;
            }
            i.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.f13762b, z10, campaignEx);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            String str;
            CampaignEx campaignEx;
            boolean z10;
            str = "";
            if (bVar != null) {
                String b3 = bVar.b();
                str = TextUtils.isEmpty(b3) ? "" : b3;
                campaignEx = bVar.c();
                z10 = bVar.e();
            } else {
                campaignEx = null;
                z10 = false;
            }
            if (a.this.f13772l != null) {
                a.this.f13772l.onLoadFailed(a.this.f13764d, str);
            }
            a.this.d();
            try {
                i.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.f13762b, z10, campaignEx);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, boolean z10) {
            if (a.this.f13773m != null) {
                try {
                    i.a(com.mbridge.msdk.foundation.controller.c.m().c(), a.this.f13773m.getAds(), a.this.f13762b, z10);
                } catch (Exception unused) {
                }
            }
            if (a.this.f13767g != null) {
                a.this.f13780t = true;
                a.this.i();
            }
        }
    };

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f13767g = mBBannerView;
        if (bannerSize != null) {
            this.f13768h = bannerSize.getHeight();
            this.f13769i = bannerSize.getWidth();
        }
        this.f13762b = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f13763c = str;
        this.f13764d = new MBridgeIds(str, this.f13762b);
        String k10 = com.mbridge.msdk.foundation.controller.c.m().k();
        String b3 = com.mbridge.msdk.foundation.controller.c.m().b();
        if (this.f13776p == null) {
            this.f13776p = new j();
        }
        this.f13776p.a(com.mbridge.msdk.foundation.controller.c.m().c(), k10, b3, this.f13762b);
        h();
    }

    private int b(int i10) {
        if (i10 <= 0) {
            return i10;
        }
        int i11 = 10;
        if (i10 >= 10) {
            i11 = 180;
            if (i10 <= 180) {
                return i10;
            }
        }
        return i11;
    }

    private void h() {
        k d10 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f13762b);
        this.f13775o = d10;
        if (d10 == null) {
            this.f13775o = k.d(this.f13762b);
        }
        if (this.f13771k == -1) {
            this.f13770j = b(this.f13775o.q());
        }
        if (this.f13766f == 0) {
            boolean z10 = this.f13775o.f() == 1;
            this.f13765e = z10;
            c cVar = this.f13774n;
            if (cVar != null) {
                cVar.a(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f13779s || !this.f13780t) {
            return;
        }
        MBBannerView mBBannerView = this.f13767g;
        if (this.f13773m != null) {
            if (this.f13774n == null) {
                this.f13774n = new c(mBBannerView, this.f13781v, this.f13763c, this.f13762b, this.f13765e, this.f13775o);
            }
            this.f13774n.b(this.f13777q);
            this.f13774n.c(this.f13778r);
            this.f13774n.a(this.f13765e, this.f13766f);
            this.f13774n.a(this.f13773m);
        } else {
            b("banner show failed because campain is exception");
        }
        this.f13780t = false;
    }

    private void j() {
        MBBannerView mBBannerView = this.f13767g;
        if (mBBannerView != null) {
            if (this.f13777q && this.f13778r && !this.u && !aq.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.f13763c, this.f13762b, new b(this.f13769i + "x" + this.f13768h, this.f13770j * 1000), this.f13782w);
            } else {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, this.f13763c, this.f13762b, null, null);
            }
            if (this.f13777q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f13763c, this.f13762b, null, null);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f13762b);
        }
    }

    private void k() {
        j();
        c cVar = this.f13774n;
        if (cVar != null) {
            cVar.b(this.f13777q);
            this.f13774n.c(this.f13778r);
        }
    }

    public final void c() {
        this.f13779s = true;
        if (this.f13772l != null) {
            this.f13772l = null;
        }
        if (this.f13782w != null) {
            this.f13782w = null;
        }
        if (this.f13781v != null) {
            this.f13781v = null;
        }
        if (this.f13767g != null) {
            this.f13767g = null;
        }
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f13763c, this.f13762b, null, null);
        com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f13762b);
        com.mbridge.msdk.mbbanner.common.c.a.a().b();
        c cVar = this.f13774n;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        if (this.f13779s) {
            return;
        }
        j();
        h();
        b bVar = new b(this.f13769i + "x" + this.f13768h, this.f13770j * 1000);
        bVar.b(this.f13763c);
        bVar.a(true);
        com.mbridge.msdk.mbbanner.common.c.a.a().b(this.f13763c, this.f13762b, bVar, this.f13782w);
    }

    public final void e() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f13763c, this.f13762b, new b(this.f13769i + "x" + this.f13768h, this.f13770j * 1000), this.f13782w);
    }

    public final void f() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.f13763c, this.f13762b, new b(this.f13769i + "x" + this.f13768h, this.f13770j * 1000), this.f13782w);
    }

    public final String b() {
        CampaignUnit campaignUnit = this.f13773m;
        return campaignUnit != null ? com.mbridge.msdk.foundation.same.c.a(campaignUnit.getAds()) : "";
    }

    public final String a() {
        CampaignUnit campaignUnit = this.f13773m;
        return (campaignUnit == null || campaignUnit.getRequestId() == null) ? "" : this.f13773m.getRequestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        BannerAdListener bannerAdListener = this.f13772l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f13764d, str);
        }
        ad.b(a, "showFailed:" + str);
        d();
    }

    public final void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f13768h = bannerSize.getHeight();
            this.f13769i = bannerSize.getWidth();
        }
    }

    public final void a(int i10) {
        int b3 = b(i10);
        this.f13771k = b3;
        this.f13770j = b3;
    }

    public final void b(boolean z10) {
        this.f13777q = z10;
        k();
        i();
    }

    public final void a(boolean z10) {
        this.f13765e = z10;
        this.f13766f = z10 ? 1 : 2;
    }

    public final void a(String str) {
        boolean z10;
        if (this.f13768h >= 1 && this.f13769i >= 1) {
            try {
                z10 = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(com.mbridge.msdk.foundation.controller.c.m().c());
            } catch (Exception unused) {
                z10 = false;
            }
            if (!z10) {
                BannerAdListener bannerAdListener = this.f13772l;
                if (bannerAdListener != null) {
                    bannerAdListener.onLoadFailed(this.f13764d, "banner load failed because WebView is not available");
                    return;
                }
                return;
            }
            b bVar = new b(this.f13769i + "x" + this.f13768h, this.f13770j * 1000);
            bVar.a(str);
            bVar.b(this.f13763c);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f13763c, this.f13762b, bVar, this.f13782w);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(1, this.f13763c, this.f13762b, bVar, this.f13782w);
            return;
        }
        BannerAdListener bannerAdListener2 = this.f13772l;
        if (bannerAdListener2 != null) {
            bannerAdListener2.onLoadFailed(this.f13764d, "banner load failed because params are exception");
        }
    }

    public final void c(boolean z10) {
        this.f13778r = z10;
        k();
    }

    public final void a(BannerAdListener bannerAdListener) {
        this.f13772l = bannerAdListener;
    }

    public final void a(int i10, int i11, int i12, int i13) {
        c cVar = this.f13774n;
        if (cVar != null) {
            cVar.a(i10, i11, i12, i13);
        }
    }
}
