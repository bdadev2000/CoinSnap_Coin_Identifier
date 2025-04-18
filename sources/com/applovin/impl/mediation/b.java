package com.applovin.impl.mediation;

import com.applovin.impl.bc;
import com.applovin.impl.de;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class b implements a.InterfaceC0022a, c.a {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private final a f6100b;

    /* renamed from: c */
    private final c f6101c;

    public b(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f6100b = new a(kVar);
        this.f6101c = new c(kVar, this);
    }

    public static /* synthetic */ void a(b bVar, de deVar) {
        bVar.c(deVar);
    }

    /* renamed from: d */
    public void c(de deVar) {
        if (deVar != null && deVar.v().compareAndSet(false, true)) {
            bc.e(deVar.z().c(), deVar);
        }
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0022a
    public void b(de deVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new s(2, this, deVar), deVar.f0());
    }

    public void e(de deVar) {
        long g02 = deVar.g0();
        if (g02 >= 0) {
            this.f6101c.a(deVar, g02);
        }
        boolean parseBoolean = Boolean.parseBoolean((String) a4.j.b(this.a, "should_schedule_ad_hidden_on_ad_destroy"));
        if (deVar.p0() || deVar.q0() || parseBoolean) {
            this.f6100b.a(parseBoolean);
            this.f6100b.a(deVar, this);
        }
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(de deVar) {
        c(deVar);
    }

    public void a() {
        this.f6101c.a();
        this.f6100b.a();
    }
}
