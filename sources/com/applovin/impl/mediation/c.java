package com.applovin.impl.mediation;

import com.applovin.impl.ie;
import com.applovin.impl.x1;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f25402a;

    /* renamed from: b */
    private final com.applovin.impl.sdk.n f25403b;

    /* renamed from: c */
    private final a f25404c;
    private x1 d;

    /* loaded from: classes3.dex */
    public interface a {
        void a(ie ieVar);
    }

    public c(com.applovin.impl.sdk.j jVar, a aVar) {
        this.f25402a = jVar;
        this.f25403b = jVar.J();
        this.f25404c = aVar;
    }

    public void a(ie ieVar, long j2) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25403b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j2 + "ms...");
        }
        this.d = x1.a(j2, this.f25402a, new t(3, this, ieVar));
    }

    public /* synthetic */ void a(ie ieVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25403b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f25404c.a(ieVar);
    }

    public void a() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25403b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        x1 x1Var = this.d;
        if (x1Var != null) {
            x1Var.a();
            this.d = null;
        }
    }
}
