package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class fu implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n9 f4810c;

    public /* synthetic */ fu(n9 n9Var, int i10) {
        this.f4809b = i10;
        this.f4810c = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4809b;
        n9 n9Var = this.f4810c;
        switch (i10) {
            case 0:
                n9.i(n9Var);
                return;
            default:
                n9.f(n9Var);
                return;
        }
    }
}
