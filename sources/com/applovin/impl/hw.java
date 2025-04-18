package com.applovin.impl;

import com.applovin.impl.xq;

/* loaded from: classes.dex */
public final /* synthetic */ class hw implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5210b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xq.a f5211c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5212d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5213f;

    public /* synthetic */ hw(xq.a aVar, int i10, long j3) {
        this.f5211c = aVar;
        this.f5213f = i10;
        this.f5212d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5210b;
        xq.a aVar = this.f5211c;
        long j3 = this.f5212d;
        int i11 = this.f5213f;
        switch (i10) {
            case 0:
                xq.a.i(aVar, i11, j3);
                return;
            default:
                xq.a.j(aVar, i11, j3);
                return;
        }
    }

    public /* synthetic */ hw(xq.a aVar, long j3, int i10) {
        this.f5211c = aVar;
        this.f5212d = j3;
        this.f5213f = i10;
    }
}
