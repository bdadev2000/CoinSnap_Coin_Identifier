package com.applovin.impl.mediation;

import com.applovin.impl.de;
import com.applovin.impl.sdk.t;
import com.applovin.impl.w1;

/* loaded from: classes.dex */
public class c {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private final t f6102b;

    /* renamed from: c */
    private final a f6103c;

    /* renamed from: d */
    private w1 f6104d;

    /* loaded from: classes.dex */
    public interface a {
        void a(de deVar);
    }

    public c(com.applovin.impl.sdk.k kVar, a aVar) {
        this.a = kVar;
        this.f6102b = kVar.L();
        this.f6103c = aVar;
    }

    public static /* synthetic */ void a(c cVar, de deVar) {
        cVar.a(deVar);
    }

    public void a(de deVar, long j3) {
        if (t.a()) {
            this.f6102b.a("AdHiddenCallbackTimeoutManager", a4.j.f("Scheduling in ", j3, "ms..."));
        }
        this.f6104d = w1.a(j3, this.a, new s(3, this, deVar));
    }

    public /* synthetic */ void a(de deVar) {
        if (t.a()) {
            this.f6102b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f6103c.a(deVar);
    }

    public void a() {
        if (t.a()) {
            this.f6102b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        w1 w1Var = this.f6104d;
        if (w1Var != null) {
            w1Var.a();
            this.f6104d = null;
        }
    }
}
