package com.applovin.impl;

import com.applovin.impl.y6;

/* loaded from: classes.dex */
public final /* synthetic */ class jw implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y6.a f5550c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y6 f5551d;

    public /* synthetic */ jw(y6.a aVar, y6 y6Var, int i10) {
        this.f5549b = i10;
        this.f5550c = aVar;
        this.f5551d = y6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5549b;
        y6 y6Var = this.f5551d;
        y6.a aVar = this.f5550c;
        switch (i10) {
            case 0:
                y6.a.e(aVar, y6Var);
                return;
            case 1:
                y6.a.c(aVar, y6Var);
                return;
            case 2:
                y6.a.d(aVar, y6Var);
                return;
            default:
                y6.a.b(aVar, y6Var);
                return;
        }
    }
}
