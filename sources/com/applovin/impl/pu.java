package com.applovin.impl;

import com.applovin.impl.p1;

/* loaded from: classes.dex */
public final /* synthetic */ class pu implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.a f7038c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Exception f7039d;

    public /* synthetic */ pu(p1.a aVar, Exception exc, int i10) {
        this.f7037b = i10;
        this.f7038c = aVar;
        this.f7039d = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7037b;
        Exception exc = this.f7039d;
        p1.a aVar = this.f7038c;
        switch (i10) {
            case 0:
                aVar.c(exc);
                return;
            default:
                aVar.d(exc);
                return;
        }
    }
}
