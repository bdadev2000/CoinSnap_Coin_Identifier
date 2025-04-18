package com.applovin.impl;

import com.applovin.impl.l0;

/* loaded from: classes.dex */
public class dm extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final a f4344h;

    /* loaded from: classes.dex */
    public interface a {
        void a(l0.a aVar);
    }

    public dm(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.f4344h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l0.a f10;
        if (this.a.y() != null) {
            f10 = this.a.z().d();
        } else {
            f10 = this.a.x().f();
        }
        this.f4344h.a(f10);
    }
}
