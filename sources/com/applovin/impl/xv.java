package com.applovin.impl;

/* loaded from: classes4.dex */
public final /* synthetic */ class xv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sm f28007b;

    public /* synthetic */ xv(sm smVar, int i2) {
        this.f28006a = i2;
        this.f28007b = smVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28006a;
        sm smVar = this.f28007b;
        switch (i2) {
            case 0:
                sm.f(smVar);
                return;
            default:
                sm.e(smVar);
                return;
        }
    }
}
