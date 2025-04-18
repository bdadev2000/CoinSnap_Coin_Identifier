package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class xv implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v9 f9089c;

    public /* synthetic */ xv(v9 v9Var, int i10) {
        this.f9088b = i10;
        this.f9089c = v9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9088b;
        v9 v9Var = this.f9089c;
        switch (i10) {
            case 0:
                v9.F(v9Var);
                return;
            case 1:
                v9.H(v9Var);
                return;
            case 2:
                v9.E(v9Var);
                return;
            default:
                v9.G(v9Var);
                return;
        }
    }
}
