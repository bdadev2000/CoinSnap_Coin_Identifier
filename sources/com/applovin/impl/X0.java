package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class X0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.adview.g f6519c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f6520d;

    public /* synthetic */ X0(com.applovin.impl.adview.g gVar, Runnable runnable, int i9) {
        this.b = i9;
        this.f6519c = gVar;
        this.f6520d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                n9.a(this.f6519c, this.f6520d);
                return;
            case 1:
                n9.c(this.f6519c, this.f6520d);
                return;
            default:
                n9.b(this.f6519c, this.f6520d);
                return;
        }
    }
}
