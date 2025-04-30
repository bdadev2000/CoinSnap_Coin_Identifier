package com.applovin.impl;

import com.applovin.impl.InterfaceC0736p1;

/* loaded from: classes.dex */
public final /* synthetic */ class H1 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0736p1.a f6404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Exception f6405d;

    public /* synthetic */ H1(InterfaceC0736p1.a aVar, Exception exc, int i9) {
        this.b = i9;
        this.f6404c = aVar;
        this.f6405d = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                InterfaceC0736p1.a.g(this.f6404c, this.f6405d);
                return;
            default:
                InterfaceC0736p1.a.i(this.f6404c, this.f6405d);
                return;
        }
    }
}
