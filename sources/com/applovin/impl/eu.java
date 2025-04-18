package com.applovin.impl;

/* loaded from: classes3.dex */
public final /* synthetic */ class eu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kb f23759b;

    public /* synthetic */ eu(kb kbVar, int i2) {
        this.f23758a = i2;
        this.f23759b = kbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f23758a;
        kb kbVar = this.f23759b;
        switch (i2) {
            case 0:
                kb.a(kbVar);
                return;
            default:
                kb.f(kbVar);
                return;
        }
    }
}
