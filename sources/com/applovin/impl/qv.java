package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class qv implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s9 f7290c;

    public /* synthetic */ qv(s9 s9Var, int i10) {
        this.f7289b = i10;
        this.f7290c = s9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7289b;
        s9 s9Var = this.f7290c;
        switch (i10) {
            case 0:
                s9.G(s9Var);
                return;
            case 1:
                s9.H(s9Var);
                return;
            case 2:
                s9Var.P();
                return;
            case 3:
                s9.J(s9Var);
                return;
            case 4:
                s9.E(s9Var);
                return;
            case 5:
                s9.I(s9Var);
                return;
            default:
                s9Var.R();
                return;
        }
    }
}
