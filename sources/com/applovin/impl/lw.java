package com.applovin.impl;

import com.applovin.impl.wq;

/* loaded from: classes.dex */
public final /* synthetic */ class lw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wq.a f25159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n5 f25160c;

    public /* synthetic */ lw(wq.a aVar, n5 n5Var, int i2) {
        this.f25158a = i2;
        this.f25159b = aVar;
        this.f25160c = n5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25158a;
        n5 n5Var = this.f25160c;
        wq.a aVar = this.f25159b;
        switch (i2) {
            case 0:
                aVar.d(n5Var);
                return;
            default:
                aVar.c(n5Var);
                return;
        }
    }
}
