package com.applovin.impl;

import com.applovin.impl.AbstractC0719l0;

/* loaded from: classes.dex */
public class dm extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final a f7334h;

    /* loaded from: classes.dex */
    public interface a {
        void a(AbstractC0719l0.a aVar);
    }

    public dm(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.f7334h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0719l0.a f9;
        if (this.f12278a.y() != null) {
            f9 = this.f12278a.z().d();
        } else {
            f9 = this.f12278a.x().f();
        }
        this.f7334h.a(f9);
    }
}
