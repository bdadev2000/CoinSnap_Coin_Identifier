package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class ku implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mg f24948b;

    public /* synthetic */ ku(mg mgVar, int i2) {
        this.f24947a = i2;
        this.f24948b = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24947a;
        mg mgVar = this.f24948b;
        switch (i2) {
            case 0:
                mg.f(mgVar);
                return;
            case 1:
                mg.b(mgVar);
                return;
            default:
                mg.c(mgVar);
                return;
        }
    }
}
