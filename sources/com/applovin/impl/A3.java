package com.applovin.impl;

import com.applovin.impl.y6;

/* loaded from: classes.dex */
public final /* synthetic */ class A3 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y6.a f6364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y6 f6365d;

    public /* synthetic */ A3(y6.a aVar, y6 y6Var, int i9) {
        this.b = i9;
        this.f6364c = aVar;
        this.f6365d = y6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                y6.a.e(this.f6364c, this.f6365d);
                return;
            case 1:
                y6.a.d(this.f6364c, this.f6365d);
                return;
            case 2:
                y6.a.c(this.f6364c, this.f6365d);
                return;
            default:
                y6.a.f(this.f6364c, this.f6365d);
                return;
        }
    }
}
