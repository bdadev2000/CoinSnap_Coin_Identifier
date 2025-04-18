package com.applovin.impl;

/* loaded from: classes3.dex */
public final /* synthetic */ class ew implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u9 f23763b;

    public /* synthetic */ ew(u9 u9Var, int i2) {
        this.f23762a = i2;
        this.f23763b = u9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f23762a;
        u9 u9Var = this.f23763b;
        switch (i2) {
            case 0:
                u9.B(u9Var);
                return;
            case 1:
                u9.D(u9Var);
                return;
            case 2:
                u9.C(u9Var);
                return;
            case 3:
                u9.A(u9Var);
                return;
            case 4:
                u9.F(u9Var);
                return;
            case 5:
                u9Var.N();
                return;
            default:
                u9Var.L();
                return;
        }
    }
}
