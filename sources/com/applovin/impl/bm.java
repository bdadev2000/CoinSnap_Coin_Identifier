package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.C0689e1;
import com.applovin.impl.am;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class bm extends am {

    /* renamed from: r, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f6891r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6892s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f6893t;

    /* loaded from: classes.dex */
    public class a implements C0689e1.a {
        public a() {
        }

        @Override // com.applovin.impl.C0689e1.a
        public void a(Uri uri) {
            if (uri != null) {
                if (bm.this.f6891r.I0()) {
                    bm.this.f6891r.b(bm.this.f6891r.e1().replaceFirst(bm.this.f6891r.h1(), uri.toString()));
                    com.applovin.impl.sdk.t tVar = bm.this.f12279c;
                    if (com.applovin.impl.sdk.t.a()) {
                        bm bmVar = bm.this;
                        bmVar.f12279c.a(bmVar.b, "Replaced video URL with cached video URI in HTML for web video ad");
                    }
                }
                bm.this.f6891r.l1();
                bm.this.f6891r.d(uri);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements am.e {
        public b() {
        }

        @Override // com.applovin.impl.am.e
        public void a(String str) {
            bm.this.f6891r.b(bm.this.d(str));
            bm.this.f6891r.b(true);
            com.applovin.impl.sdk.t tVar = bm.this.f12279c;
            if (com.applovin.impl.sdk.t.a()) {
                bm bmVar = bm.this;
                bmVar.f12279c.a(bmVar.b, "Finish caching non-video resources for ad #" + bm.this.f6891r.getAdIdNumber());
            }
            bm bmVar2 = bm.this;
            bmVar2.f12279c.f(bmVar2.b, "Ad updated with cachedHTML = " + bm.this.f6891r.e1());
        }
    }

    public bm(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, kVar, appLovinAdLoadListener);
        this.f6891r = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        if (zp.h(com.applovin.impl.sdk.k.k())) {
            str = zp.b(str);
        }
        if (this.f6891r.isOpenMeasurementEnabled()) {
            return this.f12278a.Y().a(str);
        }
        return str;
    }

    private void m() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Caching HTML resources...");
        }
        this.f6891r.b(d(a(a(this.f6891r.e1(), this.f6891r.f1(), this.f6891r.m1(), this.f6891r.X(), this.f6891r.n1()), this.f6891r.X(), this.f6891r)));
        this.f6891r.b(true);
        a(this.f6891r);
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Finish caching non-video resources for ad #" + this.f6891r.getAdIdNumber());
        }
        this.f12279c.f(this.b, "Ad updated with cachedHTML = " + this.f6891r.e1());
    }

    private void n() {
        Uri c9;
        if (!l() && (c9 = c(this.f6891r.j1())) != null) {
            if (this.f6891r.I0()) {
                this.f6891r.b(this.f6891r.e1().replaceFirst(this.f6891r.h1(), c9.toString()));
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.a(this.b, "Replaced video URL with cached video URI in HTML for web video ad");
                }
            }
            this.f6891r.l1();
            this.f6891r.d(c9);
        }
    }

    private C0684d1 o() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Caching HTML resources...");
        }
        return a(this.f6891r.e1(), this.f6891r.X(), new b());
    }

    private C0689e1 p() {
        return b(this.f6891r.j1(), new a());
    }

    public void b(boolean z8) {
        this.f6893t = z8;
    }

    public void c(boolean z8) {
        this.f6892s = z8;
    }

    @Override // com.applovin.impl.am, java.lang.Runnable
    public void run() {
        super.run();
        boolean G02 = this.f6891r.G0();
        boolean z8 = this.f6893t;
        if (!G02 && !z8) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Begin processing for non-streaming ad #" + this.f6891r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f12278a.a(oj.f9736c1)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                if (!x3.f()) {
                    arrayList.addAll(e());
                }
                C0684d1 o3 = o();
                if (o3 != null) {
                    arrayList.add(o3);
                }
                C0689e1 p2 = p();
                if (p2 != null) {
                    arrayList.add(p2);
                }
                a(arrayList);
                f();
            } else {
                j();
                m();
                n();
                f();
            }
        } else {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Begin caching for streaming ad #" + this.f6891r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f12278a.a(oj.f9736c1)).booleanValue()) {
                if (!x3.f()) {
                    a(e());
                }
                ArrayList arrayList2 = new ArrayList();
                if (G02) {
                    if (this.f6892s) {
                        f();
                        C0684d1 o9 = o();
                        if (o9 != null) {
                            arrayList2.add(o9);
                        }
                        C0689e1 p7 = p();
                        if (p7 != null) {
                            arrayList2.add(p7);
                        }
                    } else {
                        C0684d1 o10 = o();
                        if (o10 != null) {
                            a(Arrays.asList(o10));
                        }
                        f();
                        C0689e1 p9 = p();
                        if (p9 != null) {
                            arrayList2.add(p9);
                        }
                    }
                } else {
                    f();
                    C0684d1 o11 = o();
                    if (o11 != null) {
                        arrayList2.add(o11);
                    }
                }
                a(arrayList2);
                f();
            } else {
                j();
                if (G02) {
                    if (this.f6892s) {
                        f();
                    }
                    m();
                    if (!this.f6892s) {
                        f();
                    }
                    n();
                } else {
                    f();
                    m();
                }
            }
        }
        k();
    }
}
