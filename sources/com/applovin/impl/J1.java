package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class J1 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pe f6421c;

    public /* synthetic */ J1(pe peVar, int i9) {
        this.b = i9;
        this.f6421c = peVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f6421c.h();
                return;
            default:
                pe.d(this.f6421c);
                return;
        }
    }
}
