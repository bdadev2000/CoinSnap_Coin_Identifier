package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class tv implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9 f8303c;

    public /* synthetic */ tv(t9 t9Var, int i10) {
        this.f8302b = i10;
        this.f8303c = t9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8302b;
        t9 t9Var = this.f8303c;
        switch (i10) {
            case 0:
                t9Var.L();
                return;
            case 1:
                t9Var.M();
                return;
            case 2:
                t9Var.S();
                return;
            case 3:
                t9Var.N();
                return;
            case 4:
                t9Var.O();
                return;
            case 5:
                t9Var.Q();
                return;
            case 6:
                t9Var.K();
                return;
            default:
                t9Var.J();
                return;
        }
    }
}
