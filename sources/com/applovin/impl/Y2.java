package com.applovin.impl;

import com.applovin.impl.xq;

/* loaded from: classes.dex */
public final /* synthetic */ class Y2 implements Runnable {
    public final /* synthetic */ int b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xq.a f6531c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6532d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6533f;

    public /* synthetic */ Y2(xq.a aVar, int i9, long j7) {
        this.f6531c = aVar;
        this.f6532d = i9;
        this.f6533f = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f6531c.a(this.f6533f, this.f6532d);
                return;
            default:
                this.f6531c.b(this.f6532d, this.f6533f);
                return;
        }
    }

    public /* synthetic */ Y2(xq.a aVar, long j7, int i9) {
        this.f6531c = aVar;
        this.f6533f = j7;
        this.f6532d = i9;
    }
}
