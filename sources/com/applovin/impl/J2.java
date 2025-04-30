package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class J2 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9 f6422c;

    public /* synthetic */ J2(t9 t9Var, int i9) {
        this.b = i9;
        this.f6422c = t9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                t9.N(this.f6422c);
                return;
            case 1:
                t9.L(this.f6422c);
                return;
            case 2:
                t9.K(this.f6422c);
                return;
            case 3:
                t9.H(this.f6422c);
                return;
            case 4:
                t9.F(this.f6422c);
                return;
            case 5:
                t9.M(this.f6422c);
                return;
            case 6:
                t9.E(this.f6422c);
                return;
            default:
                t9.G(this.f6422c);
                return;
        }
    }
}
