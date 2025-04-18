package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class aw implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w4 f3799c;

    public /* synthetic */ aw(w4 w4Var, int i10) {
        this.f3798b = i10;
        this.f3799c = w4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3798b;
        w4 w4Var = this.f3799c;
        switch (i10) {
            case 0:
                w4.j(w4Var);
                return;
            case 1:
                w4.i(w4Var);
                return;
            default:
                w4.d(w4Var);
                return;
        }
    }
}
