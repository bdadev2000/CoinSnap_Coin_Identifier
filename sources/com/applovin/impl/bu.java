package com.applovin.impl;

/* loaded from: classes3.dex */
public final /* synthetic */ class bu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f23181b;

    public /* synthetic */ bu(j2 j2Var, int i2) {
        this.f23180a = i2;
        this.f23181b = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f23180a;
        j2 j2Var = this.f23181b;
        switch (i2) {
            case 0:
                j2.j(j2Var);
                return;
            default:
                j2.i(j2Var);
                return;
        }
    }
}
