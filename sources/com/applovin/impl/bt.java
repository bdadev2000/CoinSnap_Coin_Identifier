package com.applovin.impl;

import com.applovin.impl.ce;

/* loaded from: classes3.dex */
public final /* synthetic */ class bt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ce.a f23177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ce f23178c;
    public final /* synthetic */ nc d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ud f23179f;

    public /* synthetic */ bt(ce.a aVar, ce ceVar, nc ncVar, ud udVar, int i2) {
        this.f23176a = i2;
        this.f23177b = aVar;
        this.f23178c = ceVar;
        this.d = ncVar;
        this.f23179f = udVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f23176a;
        ce ceVar = this.f23178c;
        ce.a aVar = this.f23177b;
        ud udVar = this.f23179f;
        nc ncVar = this.d;
        switch (i2) {
            case 0:
                ce.a.e(aVar, ceVar, ncVar, udVar);
                return;
            case 1:
                ce.a.d(aVar, ceVar, ncVar, udVar);
                return;
            default:
                ce.a.c(aVar, ceVar, ncVar, udVar);
                return;
        }
    }
}
