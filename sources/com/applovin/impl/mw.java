package com.applovin.impl;

import com.applovin.impl.wq;

/* loaded from: classes.dex */
public final /* synthetic */ class mw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25618a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wq.a f25619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25620c;
    public final /* synthetic */ int d;

    public /* synthetic */ mw(wq.a aVar, int i2, long j2) {
        this.f25619b = aVar;
        this.d = i2;
        this.f25620c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25618a;
        wq.a aVar = this.f25619b;
        int i3 = this.d;
        long j2 = this.f25620c;
        switch (i2) {
            case 0:
                aVar.b(i3, j2);
                return;
            default:
                aVar.a(j2, i3);
                return;
        }
    }

    public /* synthetic */ mw(wq.a aVar, long j2, int i2) {
        this.f25619b = aVar;
        this.f25620c = j2;
        this.d = i2;
    }
}
