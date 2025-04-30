package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class Y0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n9 f6527c;

    public /* synthetic */ Y0(n9 n9Var, int i9) {
        this.b = i9;
        this.f6527c = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                n9.i(this.f6527c);
                return;
            default:
                n9.k(this.f6527c);
                return;
        }
    }
}
