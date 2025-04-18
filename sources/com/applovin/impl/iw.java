package com.applovin.impl;

import com.applovin.impl.xq;

/* loaded from: classes.dex */
public final /* synthetic */ class iw implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xq.a f5390c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5 f5391d;

    public /* synthetic */ iw(xq.a aVar, l5 l5Var, int i10) {
        this.f5389b = i10;
        this.f5390c = aVar;
        this.f5391d = l5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5389b;
        l5 l5Var = this.f5391d;
        xq.a aVar = this.f5390c;
        switch (i10) {
            case 0:
                aVar.d(l5Var);
                return;
            default:
                aVar.c(l5Var);
                return;
        }
    }
}
