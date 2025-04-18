package com.applovin.impl;

/* loaded from: classes2.dex */
public final /* synthetic */ class ow implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x9 f25947b;

    public /* synthetic */ ow(x9 x9Var, int i2) {
        this.f25946a = i2;
        this.f25947b = x9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25946a;
        x9 x9Var = this.f25947b;
        switch (i2) {
            case 0:
                x9.C(x9Var);
                return;
            case 1:
                x9.D(x9Var);
                return;
            case 2:
                x9.A(x9Var);
                return;
            default:
                x9.B(x9Var);
                return;
        }
    }
}
