package com.applovin.impl;

import com.applovin.impl.q1;

/* loaded from: classes2.dex */
public final /* synthetic */ class tu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.a f27212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Exception f27213c;

    public /* synthetic */ tu(q1.a aVar, Exception exc, int i2) {
        this.f27211a = i2;
        this.f27212b = aVar;
        this.f27213c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f27211a;
        Exception exc = this.f27213c;
        q1.a aVar = this.f27212b;
        switch (i2) {
            case 0:
                aVar.c(exc);
                return;
            default:
                aVar.d(exc);
                return;
        }
    }
}
