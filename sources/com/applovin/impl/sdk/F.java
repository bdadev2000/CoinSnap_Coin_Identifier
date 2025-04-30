package com.applovin.impl.sdk;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f10713c;

    public /* synthetic */ F(int i9, k kVar) {
        this.b = i9;
        this.f10713c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                k.h(this.f10713c);
                return;
            case 1:
                k.r(this.f10713c);
                return;
            case 2:
                k.l(this.f10713c);
                return;
            case 3:
                k.g(this.f10713c);
                return;
            case 4:
                k.q(this.f10713c);
                return;
            case 5:
                k.j(this.f10713c);
                return;
            case 6:
                k.m(this.f10713c);
                return;
            case 7:
                k.p(this.f10713c);
                return;
            default:
                r.c(this.f10713c);
                return;
        }
    }
}
