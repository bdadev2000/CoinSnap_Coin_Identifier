package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mg f6502c;

    public /* synthetic */ V0(mg mgVar, int i9) {
        this.b = i9;
        this.f6502c = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                mg.b(this.f6502c);
                return;
            default:
                mg.a(this.f6502c);
                return;
        }
    }
}
