package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class L0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gb f6427c;

    public /* synthetic */ L0(gb gbVar, int i9) {
        this.b = i9;
        this.f6427c = gbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f6427c.c();
                return;
            default:
                this.f6427c.d();
                return;
        }
    }
}
