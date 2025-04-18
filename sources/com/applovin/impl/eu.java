package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class eu implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4526b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.adview.g f4527c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f4528d;

    public /* synthetic */ eu(com.applovin.impl.adview.g gVar, Runnable runnable, int i10) {
        this.f4526b = i10;
        this.f4527c = gVar;
        this.f4528d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4526b;
        Runnable runnable = this.f4528d;
        com.applovin.impl.adview.g gVar = this.f4527c;
        switch (i10) {
            case 0:
                n9.b(gVar, runnable);
                return;
            case 1:
                n9.a(gVar, runnable);
                return;
            default:
                n9.c(gVar, runnable);
                return;
        }
    }
}
