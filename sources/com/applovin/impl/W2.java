package com.applovin.impl;

import com.applovin.impl.xd;

/* loaded from: classes.dex */
public final /* synthetic */ class W2 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xd.a f6515c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xd f6516d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic f6517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pd f6518g;

    public /* synthetic */ W2(xd.a aVar, xd xdVar, ic icVar, pd pdVar, int i9) {
        this.b = i9;
        this.f6515c = aVar;
        this.f6516d = xdVar;
        this.f6517f = icVar;
        this.f6518g = pdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                xd.a.c(this.f6515c, this.f6516d, this.f6517f, this.f6518g);
                return;
            case 1:
                xd.a.d(this.f6515c, this.f6516d, this.f6517f, this.f6518g);
                return;
            default:
                xd.a.e(this.f6515c, this.f6516d, this.f6517f, this.f6518g);
                return;
        }
    }
}
