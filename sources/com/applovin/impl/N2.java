package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class N2 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v9 f6443c;

    public /* synthetic */ N2(v9 v9Var, int i9) {
        this.b = i9;
        this.f6443c = v9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                v9.E(this.f6443c);
                return;
            case 1:
                v9.G(this.f6443c);
                return;
            case 2:
                v9.F(this.f6443c);
                return;
            default:
                v9.H(this.f6443c);
                return;
        }
    }
}
