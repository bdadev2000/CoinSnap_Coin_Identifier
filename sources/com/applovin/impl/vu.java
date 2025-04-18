package com.applovin.impl;

import com.applovin.impl.q1;

/* loaded from: classes2.dex */
public final /* synthetic */ class vu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.a f27645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n5 f27646c;

    public /* synthetic */ vu(q1.a aVar, n5 n5Var, int i2) {
        this.f27644a = i2;
        this.f27645b = aVar;
        this.f27646c = n5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f27644a;
        n5 n5Var = this.f27646c;
        q1.a aVar = this.f27645b;
        switch (i2) {
            case 0:
                aVar.c(n5Var);
                return;
            default:
                aVar.d(n5Var);
                return;
        }
    }
}
