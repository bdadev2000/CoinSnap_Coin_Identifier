package com.applovin.impl.mediation;

import com.applovin.impl.gc;
import com.applovin.impl.ie;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes3.dex */
public class b implements a.InterfaceC0084a, c.a {

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f25399a;

    /* renamed from: b */
    private final a f25400b;

    /* renamed from: c */
    private final c f25401c;

    public b(com.applovin.impl.sdk.j jVar) {
        this.f25399a = jVar;
        this.f25400b = new a(jVar);
        this.f25401c = new c(jVar, this);
    }

    /* renamed from: d */
    public void c(ie ieVar) {
        g A;
        if (ieVar == null || (A = ieVar.A()) == null || !ieVar.w().compareAndSet(false, true)) {
            return;
        }
        gc.e(A.c(), ieVar);
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0084a
    public void b(ie ieVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new t(2, this, ieVar), ieVar.k0());
    }

    public void e(ie ieVar) {
        long l02 = ieVar.l0();
        if (l02 >= 0) {
            this.f25401c.a(ieVar, l02);
        }
        boolean parseBoolean = Boolean.parseBoolean(this.f25399a.g0().getExtraParameters().get("should_schedule_ad_hidden_on_ad_destroy"));
        if (ieVar.u0() || ieVar.v0() || parseBoolean) {
            this.f25400b.a(parseBoolean);
            this.f25400b.a(ieVar, this);
        }
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(ie ieVar) {
        c(ieVar);
    }

    public void a() {
        this.f25401c.a();
        this.f25400b.a();
    }
}
