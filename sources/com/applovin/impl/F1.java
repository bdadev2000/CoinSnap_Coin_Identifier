package com.applovin.impl;

import com.applovin.impl.InterfaceC0736p1;

/* loaded from: classes.dex */
public final /* synthetic */ class F1 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0736p1.a f6390c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5 f6391d;

    public /* synthetic */ F1(InterfaceC0736p1.a aVar, l5 l5Var, int i9) {
        this.b = i9;
        this.f6390c = aVar;
        this.f6391d = l5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f6390c.c(this.f6391d);
                return;
            default:
                this.f6390c.d(this.f6391d);
                return;
        }
    }
}
