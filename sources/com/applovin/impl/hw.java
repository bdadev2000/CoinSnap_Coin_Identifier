package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class hw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v9 f24367b;

    public /* synthetic */ hw(v9 v9Var, int i2) {
        this.f24366a = i2;
        this.f24367b = v9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24366a;
        v9 v9Var = this.f24367b;
        switch (i2) {
            case 0:
                v9.H(v9Var);
                return;
            case 1:
                v9.B(v9Var);
                return;
            case 2:
                v9.A(v9Var);
                return;
            case 3:
                v9.C(v9Var);
                return;
            case 4:
                v9.J(v9Var);
                return;
            case 5:
                v9.G(v9Var);
                return;
            case 6:
                v9.D(v9Var);
                return;
            default:
                v9.E(v9Var);
                return;
        }
    }
}
