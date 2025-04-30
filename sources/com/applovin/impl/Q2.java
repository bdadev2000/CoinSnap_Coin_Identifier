package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class Q2 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w4 f6467c;

    public /* synthetic */ Q2(w4 w4Var, int i9) {
        this.b = i9;
        this.f6467c = w4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                w4.g(this.f6467c);
                return;
            case 1:
                w4.f(this.f6467c);
                return;
            default:
                w4.e(this.f6467c);
                return;
        }
    }
}
