package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class nu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.adview.g f25793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f25794c;

    public /* synthetic */ nu(com.applovin.impl.adview.g gVar, Runnable runnable, int i2) {
        this.f25792a = i2;
        this.f25793b = gVar;
        this.f25794c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25792a;
        Runnable runnable = this.f25794c;
        com.applovin.impl.adview.g gVar = this.f25793b;
        switch (i2) {
            case 0:
                p9.c(gVar, runnable);
                return;
            case 1:
                p9.b(gVar, runnable);
                return;
            default:
                p9.a(gVar, runnable);
                return;
        }
    }
}
