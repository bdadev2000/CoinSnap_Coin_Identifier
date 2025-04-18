package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class du implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mg f4385c;

    public /* synthetic */ du(mg mgVar, int i10) {
        this.f4384b = i10;
        this.f4385c = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4384b;
        mg mgVar = this.f4385c;
        switch (i10) {
            case 0:
                mg.b(mgVar);
                return;
            default:
                mg.a(mgVar);
                return;
        }
    }
}
