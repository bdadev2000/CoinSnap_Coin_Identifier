package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class mu implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ og f6322c;

    public /* synthetic */ mu(og ogVar, int i10) {
        this.f6321b = i10;
        this.f6322c = ogVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6321b;
        og ogVar = this.f6322c;
        switch (i10) {
            case 0:
                og.p(ogVar);
                return;
            case 1:
                og.k(ogVar);
                return;
            case 2:
                og.s(ogVar);
                return;
            case 3:
                og.o(ogVar);
                return;
            case 4:
                og.n(ogVar);
                return;
            case 5:
                og.r(ogVar);
                return;
            case 6:
                og.j(ogVar);
                return;
            case 7:
                og.m(ogVar);
                return;
            case 8:
                og.q(ogVar);
                return;
            case 9:
                og.t(ogVar);
                return;
            default:
                og.i(ogVar);
                return;
        }
    }
}
