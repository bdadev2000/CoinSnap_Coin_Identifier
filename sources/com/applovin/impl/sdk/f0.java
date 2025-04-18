package com.applovin.impl.sdk;

/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f7668c;

    public /* synthetic */ f0(int i10, k kVar) {
        this.f7667b = i10;
        this.f7668c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7667b;
        k kVar = this.f7668c;
        switch (i10) {
            case 0:
                k.q(kVar);
                return;
            case 1:
                k.g(kVar);
                return;
            case 2:
                k.j(kVar);
                return;
            case 3:
                k.n(kVar);
                return;
            case 4:
                k.h(kVar);
                return;
            case 5:
                k.p(kVar);
                return;
            case 6:
                k.s(kVar);
                return;
            case 7:
                k.o(kVar);
                return;
            default:
                r.c(kVar);
                return;
        }
    }
}
