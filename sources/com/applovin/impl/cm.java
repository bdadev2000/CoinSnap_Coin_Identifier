package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.bm;
import com.applovin.impl.f1;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class cm extends bm {

    /* renamed from: r, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f23335r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f23336s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f23337t;

    /* loaded from: classes.dex */
    public class a implements f1.a {
        public a() {
        }

        @Override // com.applovin.impl.f1.a
        public void a(Uri uri) {
            if (uri != null) {
                if (cm.this.f23335r.K0()) {
                    cm.this.f23335r.b(cm.this.f23335r.j1().replaceFirst(cm.this.f23335r.m1(), uri.toString()));
                    com.applovin.impl.sdk.n nVar = cm.this.f28218c;
                    if (com.applovin.impl.sdk.n.a()) {
                        cm cmVar = cm.this;
                        cmVar.f28218c.a(cmVar.f28217b, "Replaced video URL with cached video URI in HTML for web video ad");
                    }
                }
                cm.this.f23335r.q1();
                cm.this.f23335r.d(uri);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements bm.e {
        public b() {
        }

        @Override // com.applovin.impl.bm.e
        public void a(String str) {
            cm.this.f23335r.b(cm.this.d(str));
            cm.this.f23335r.b(true);
            com.applovin.impl.sdk.n nVar = cm.this.f28218c;
            if (com.applovin.impl.sdk.n.a()) {
                cm cmVar = cm.this;
                cmVar.f28218c.a(cmVar.f28217b, "Finish caching non-video resources for ad #" + cm.this.f23335r.getAdIdNumber());
            }
            cm cmVar2 = cm.this;
            cmVar2.f28218c.f(cmVar2.f28217b, "Ad updated with cachedHTML = " + cm.this.f23335r.j1());
        }
    }

    public cm(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.j jVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, jVar, appLovinAdLoadListener);
        this.f23335r = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        if (yp.h(com.applovin.impl.sdk.j.l())) {
            str = yp.b(str);
        }
        return this.f23335r.isOpenMeasurementEnabled() ? this.f28216a.W().a(str) : str;
    }

    private void m() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Caching HTML resources...");
        }
        this.f23335r.b(d(a(a(this.f23335r.j1(), this.f23335r.k1(), this.f23335r.r1(), this.f23335r.X(), this.f23335r.s1()), this.f23335r.X(), this.f23335r)));
        this.f23335r.b(true);
        a(this.f23335r);
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Finish caching non-video resources for ad #" + this.f23335r.getAdIdNumber());
        }
        this.f28218c.f(this.f28217b, "Ad updated with cachedHTML = " + this.f23335r.j1());
    }

    private void n() {
        Uri c2;
        if (l() || (c2 = c(this.f23335r.o1())) == null) {
            return;
        }
        if (this.f23335r.K0()) {
            this.f23335r.b(this.f23335r.j1().replaceFirst(this.f23335r.m1(), c2.toString()));
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Replaced video URL with cached video URI in HTML for web video ad");
            }
        }
        this.f23335r.q1();
        this.f23335r.d(c2);
    }

    private e1 o() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Caching HTML resources...");
        }
        return a(this.f23335r.j1(), this.f23335r.X(), new b());
    }

    private f1 p() {
        return b(this.f23335r.o1(), new a());
    }

    public void b(boolean z2) {
        this.f23337t = z2;
    }

    public void c(boolean z2) {
        this.f23336s = z2;
    }

    @Override // com.applovin.impl.bm, java.lang.Runnable
    public void run() {
        super.run();
        boolean I0 = this.f23335r.I0();
        boolean z2 = this.f23337t;
        if (I0 || z2) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Begin caching for streaming ad #" + this.f23335r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f28216a.a(sj.f26909c1)).booleanValue()) {
                if (!z3.f()) {
                    a(e());
                }
                ArrayList arrayList = new ArrayList();
                if (!I0) {
                    f();
                    e1 o2 = o();
                    if (o2 != null) {
                        arrayList.add(o2);
                    }
                } else if (this.f23336s) {
                    f();
                    e1 o3 = o();
                    if (o3 != null) {
                        arrayList.add(o3);
                    }
                    f1 p2 = p();
                    if (p2 != null) {
                        arrayList.add(p2);
                    }
                } else {
                    e1 o4 = o();
                    if (o4 != null) {
                        a(Arrays.asList(o4));
                    }
                    f();
                    f1 p3 = p();
                    if (p3 != null) {
                        arrayList.add(p3);
                    }
                }
                a(arrayList);
                f();
            } else {
                j();
                if (I0) {
                    if (this.f23336s) {
                        f();
                    }
                    m();
                    if (!this.f23336s) {
                        f();
                    }
                    n();
                } else {
                    f();
                    m();
                }
            }
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Begin processing for non-streaming ad #" + this.f23335r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f28216a.a(sj.f26909c1)).booleanValue()) {
                ArrayList arrayList2 = new ArrayList();
                if (!z3.f()) {
                    arrayList2.addAll(e());
                }
                e1 o5 = o();
                if (o5 != null) {
                    arrayList2.add(o5);
                }
                f1 p4 = p();
                if (p4 != null) {
                    arrayList2.add(p4);
                }
                a(arrayList2);
                f();
            } else {
                j();
                m();
                n();
                f();
            }
        }
        k();
    }
}
