package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class tu implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pe f8301c;

    public /* synthetic */ tu(pe peVar, int i10) {
        this.f8300b = i10;
        this.f8301c = peVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8300b;
        pe peVar = this.f8301c;
        switch (i10) {
            case 0:
                peVar.h();
                return;
            default:
                peVar.d();
                return;
        }
    }
}
