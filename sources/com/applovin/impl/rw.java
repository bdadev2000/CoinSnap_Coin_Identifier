package com.applovin.impl;

/* loaded from: classes2.dex */
public final /* synthetic */ class rw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y4 f26389b;

    public /* synthetic */ rw(y4 y4Var, int i2) {
        this.f26388a = i2;
        this.f26389b = y4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26388a;
        y4 y4Var = this.f26389b;
        switch (i2) {
            case 0:
                y4.f(y4Var);
                return;
            case 1:
                y4.d(y4Var);
                return;
            default:
                y4.g(y4Var);
                return;
        }
    }
}
