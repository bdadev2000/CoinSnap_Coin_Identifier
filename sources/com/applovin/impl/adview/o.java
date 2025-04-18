package com.applovin.impl.adview;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f3724c;

    public /* synthetic */ o(a aVar, int i10) {
        this.f3723b = i10;
        this.f3724c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3723b;
        a aVar = this.f3724c;
        switch (i10) {
            case 0:
                a.p(aVar);
                return;
            case 1:
                a.s(aVar);
                return;
            case 2:
                a.r(aVar);
                return;
            case 3:
                a.o(aVar);
                return;
            case 4:
                a.l(aVar);
                return;
            default:
                a.k(aVar);
                return;
        }
    }
}
