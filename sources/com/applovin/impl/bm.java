package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.am;
import com.applovin.impl.e1;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class bm extends am {

    /* renamed from: r, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f3911r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f3912s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f3913t;

    /* loaded from: classes.dex */
    public class a implements e1.a {
        public a() {
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            if (uri != null) {
                if (bm.this.f3911r.I0()) {
                    bm.this.f3911r.b(bm.this.f3911r.e1().replaceFirst(bm.this.f3911r.h1(), uri.toString()));
                    com.applovin.impl.sdk.t tVar = bm.this.f9061c;
                    if (com.applovin.impl.sdk.t.a()) {
                        bm bmVar = bm.this;
                        bmVar.f9061c.a(bmVar.f9060b, "Replaced video URL with cached video URI in HTML for web video ad");
                    }
                }
                bm.this.f3911r.l1();
                bm.this.f3911r.d(uri);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements am.e {
        public b() {
        }

        @Override // com.applovin.impl.am.e
        public void a(String str) {
            bm.this.f3911r.b(bm.this.d(str));
            bm.this.f3911r.b(true);
            com.applovin.impl.sdk.t tVar = bm.this.f9061c;
            if (com.applovin.impl.sdk.t.a()) {
                bm bmVar = bm.this;
                bmVar.f9061c.a(bmVar.f9060b, "Finish caching non-video resources for ad #" + bm.this.f3911r.getAdIdNumber());
            }
            bm bmVar2 = bm.this;
            bmVar2.f9061c.f(bmVar2.f9060b, "Ad updated with cachedHTML = " + bm.this.f3911r.e1());
        }
    }

    public bm(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, kVar, appLovinAdLoadListener);
        this.f3911r = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        if (zp.h(com.applovin.impl.sdk.k.k())) {
            str = zp.b(str);
        }
        if (this.f3911r.isOpenMeasurementEnabled()) {
            return this.a.Y().a(str);
        }
        return str;
    }

    private void m() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Caching HTML resources...");
        }
        this.f3911r.b(d(a(a(this.f3911r.e1(), this.f3911r.f1(), this.f3911r.m1(), this.f3911r.X(), this.f3911r.n1()), this.f3911r.X(), this.f3911r)));
        this.f3911r.b(true);
        a(this.f3911r);
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Finish caching non-video resources for ad #" + this.f3911r.getAdIdNumber());
        }
        this.f9061c.f(this.f9060b, "Ad updated with cachedHTML = " + this.f3911r.e1());
    }

    private void n() {
        Uri c10;
        if (!l() && (c10 = c(this.f3911r.j1())) != null) {
            if (this.f3911r.I0()) {
                this.f3911r.b(this.f3911r.e1().replaceFirst(this.f3911r.h1(), c10.toString()));
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.a(this.f9060b, "Replaced video URL with cached video URI in HTML for web video ad");
                }
            }
            this.f3911r.l1();
            this.f3911r.d(c10);
        }
    }

    private d1 o() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Caching HTML resources...");
        }
        return a(this.f3911r.e1(), this.f3911r.X(), new b());
    }

    private e1 p() {
        return b(this.f3911r.j1(), new a());
    }

    public void b(boolean z10) {
        this.f3913t = z10;
    }

    public void c(boolean z10) {
        this.f3912s = z10;
    }

    @Override // com.applovin.impl.am, java.lang.Runnable
    public void run() {
        super.run();
        boolean G0 = this.f3911r.G0();
        boolean z10 = this.f3913t;
        if (!G0 && !z10) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Begin processing for non-streaming ad #" + this.f3911r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.a.a(oj.f6628c1)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                if (!x3.f()) {
                    arrayList.addAll(e());
                }
                d1 o10 = o();
                if (o10 != null) {
                    arrayList.add(o10);
                }
                e1 p10 = p();
                if (p10 != null) {
                    arrayList.add(p10);
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
                this.f9061c.a(this.f9060b, "Begin caching for streaming ad #" + this.f3911r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.a.a(oj.f6628c1)).booleanValue()) {
                if (!x3.f()) {
                    a(e());
                }
                ArrayList arrayList2 = new ArrayList();
                if (G0) {
                    if (this.f3912s) {
                        f();
                        d1 o11 = o();
                        if (o11 != null) {
                            arrayList2.add(o11);
                        }
                        e1 p11 = p();
                        if (p11 != null) {
                            arrayList2.add(p11);
                        }
                    } else {
                        d1 o12 = o();
                        if (o12 != null) {
                            a(Arrays.asList(o12));
                        }
                        f();
                        e1 p12 = p();
                        if (p12 != null) {
                            arrayList2.add(p12);
                        }
                    }
                } else {
                    f();
                    d1 o13 = o();
                    if (o13 != null) {
                        arrayList2.add(o13);
                    }
                }
                a(arrayList2);
                f();
            } else {
                j();
                if (G0) {
                    if (this.f3912s) {
                        f();
                    }
                    m();
                    if (!this.f3912s) {
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
