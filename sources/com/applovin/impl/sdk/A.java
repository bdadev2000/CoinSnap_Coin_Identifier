package com.applovin.impl.sdk;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0755g f10641c;

    public /* synthetic */ A(C0755g c0755g, int i9) {
        this.b = i9;
        this.f10641c = c0755g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0755g.h(this.f10641c);
                return;
            default:
                C0755g.i(this.f10641c);
                return;
        }
    }
}
