package com.applovin.impl;

import com.applovin.impl.xd;

/* loaded from: classes.dex */
public final /* synthetic */ class ew implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xd.a f4532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xd f4533d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic f4534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pd f4535g;

    public /* synthetic */ ew(xd.a aVar, xd xdVar, ic icVar, pd pdVar, int i10) {
        this.f4531b = i10;
        this.f4532c = aVar;
        this.f4533d = xdVar;
        this.f4534f = icVar;
        this.f4535g = pdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4531b;
        xd xdVar = this.f4533d;
        xd.a aVar = this.f4532c;
        pd pdVar = this.f4535g;
        ic icVar = this.f4534f;
        switch (i10) {
            case 0:
                xd.a.b(aVar, xdVar, icVar, pdVar);
                return;
            case 1:
                xd.a.a(aVar, xdVar, icVar, pdVar);
                return;
            default:
                xd.a.d(aVar, xdVar, icVar, pdVar);
                return;
        }
    }
}
