package com.applovin.impl.sdk;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f26867b;

    public /* synthetic */ w(int i2, j jVar) {
        this.f26866a = i2;
        this.f26867b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26866a;
        j jVar = this.f26867b;
        switch (i2) {
            case 0:
                j.h(jVar);
                return;
            case 1:
                j.g(jVar);
                return;
            case 2:
                j.t(jVar);
                return;
            case 3:
                j.j(jVar);
                return;
            case 4:
                j.q(jVar);
                return;
            case 5:
                j.s(jVar);
                return;
            case 6:
                j.n(jVar);
                return;
            default:
                j.m(jVar);
                return;
        }
    }
}
