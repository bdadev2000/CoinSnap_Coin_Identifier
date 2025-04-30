package com.applovin.impl.mediation;

import Q7.n0;
import com.applovin.impl.bc;
import com.applovin.impl.de;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class b implements a.InterfaceC0022a, c.a {

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f9054a;
    private final a b;

    /* renamed from: c */
    private final c f9055c;

    public b(com.applovin.impl.sdk.k kVar) {
        this.f9054a = kVar;
        this.b = new a(kVar);
        this.f9055c = new c(kVar, this);
    }

    /* renamed from: d */
    public void c(de deVar) {
        if (deVar != null && deVar.v().compareAndSet(false, true)) {
            bc.e(deVar.z().c(), deVar);
        }
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0022a
    public void b(de deVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new p(2, this, deVar), deVar.f0());
    }

    public void e(de deVar) {
        long g02 = deVar.g0();
        if (g02 >= 0) {
            this.f9055c.a(deVar, g02);
        }
        boolean parseBoolean = Boolean.parseBoolean((String) n0.d(this.f9054a, "should_schedule_ad_hidden_on_ad_destroy"));
        if (deVar.p0() || deVar.q0() || parseBoolean) {
            this.b.a(parseBoolean);
            this.b.a(deVar, this);
        }
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(de deVar) {
        c(deVar);
    }

    public void a() {
        this.f9055c.a();
        this.b.a();
    }
}
