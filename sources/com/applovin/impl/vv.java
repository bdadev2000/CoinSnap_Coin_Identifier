package com.applovin.impl;

/* loaded from: classes2.dex */
public final /* synthetic */ class vv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sg f27648b;

    public /* synthetic */ vv(sg sgVar, int i2) {
        this.f27647a = i2;
        this.f27648b = sgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f27647a;
        sg sgVar = this.f27648b;
        switch (i2) {
            case 0:
                sg.u(sgVar);
                return;
            case 1:
                sg.p(sgVar);
                return;
            case 2:
                sg.q(sgVar);
                return;
            case 3:
                sg.s(sgVar);
                return;
            case 4:
                sg.j(sgVar);
                return;
            case 5:
                sg.t(sgVar);
                return;
            case 6:
                sg.m(sgVar);
                return;
            case 7:
                sg.o(sgVar);
                return;
            case 8:
                sg.l(sgVar);
                return;
            case 9:
                sg.k(sgVar);
                return;
            default:
                sg.n(sgVar);
                return;
        }
    }
}
