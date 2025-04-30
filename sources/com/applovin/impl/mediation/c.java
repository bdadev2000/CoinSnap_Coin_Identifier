package com.applovin.impl.mediation;

import com.applovin.impl.C0771w1;
import com.applovin.impl.L;
import com.applovin.impl.de;
import com.applovin.impl.sdk.t;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f9056a;
    private final t b;

    /* renamed from: c */
    private final a f9057c;

    /* renamed from: d */
    private C0771w1 f9058d;

    /* loaded from: classes.dex */
    public interface a {
        void a(de deVar);
    }

    public c(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f9056a = kVar;
        this.b = kVar.L();
        this.f9057c = aVar;
    }

    public void a(de deVar, long j7) {
        if (t.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", L.j("Scheduling in ", j7, "ms..."));
        }
        this.f9058d = C0771w1.a(j7, this.f9056a, new p(3, this, deVar));
    }

    public /* synthetic */ void a(de deVar) {
        if (t.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f9057c.a(deVar);
    }

    public void a() {
        if (t.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        C0771w1 c0771w1 = this.f9058d;
        if (c0771w1 != null) {
            c0771w1.a();
            this.f9058d = null;
        }
    }
}
