package com.applovin.impl;

import com.applovin.impl.xq;

/* loaded from: classes.dex */
public final /* synthetic */ class Z2 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xq.a f6539c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5 f6540d;

    public /* synthetic */ Z2(xq.a aVar, l5 l5Var, int i9) {
        this.b = i9;
        this.f6539c = aVar;
        this.f6540d = l5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f6539c.c(this.f6540d);
                return;
            default:
                this.f6539c.d(this.f6540d);
                return;
        }
    }
}
