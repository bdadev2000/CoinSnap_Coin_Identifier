package com.applovin.impl;

import com.applovin.impl.p1;

/* loaded from: classes.dex */
public final /* synthetic */ class qu implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7288d;

    public /* synthetic */ qu(Object obj, long j3, int i10) {
        this.f7286b = i10;
        this.f7288d = obj;
        this.f7287c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7286b;
        long j3 = this.f7287c;
        Object obj = this.f7288d;
        switch (i10) {
            case 0:
                ((p1.a) obj).a(j3);
                return;
            case 1:
                ((com.applovin.impl.sdk.j) obj).a(j3);
                return;
            case 2:
                s7.f0 f0Var = (s7.f0) ((r4.c) obj).f24000d;
                int i11 = n9.h0.a;
                t7.p pVar = (t7.p) f0Var.f24350b.f24417r;
                t7.b P = pVar.P();
                pVar.Q(P, 1010, new av(P, j3, 3));
                return;
            default:
                com.vungle.ads.internal.presenter.q.m49processCommand$lambda11((com.vungle.ads.internal.presenter.q) obj, j3);
                return;
        }
    }
}
