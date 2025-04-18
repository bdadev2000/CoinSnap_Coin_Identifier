package com.applovin.impl;

import com.applovin.impl.l0;

/* loaded from: classes2.dex */
public class em extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final a f23735h;

    /* loaded from: classes2.dex */
    public interface a {
        void a(l0.a aVar);
    }

    public em(com.applovin.impl.sdk.j jVar, a aVar) {
        super("TaskCollectAdvertisingId", jVar, true);
        this.f23735h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f23735h.a(this.f28216a.y().f());
    }
}
