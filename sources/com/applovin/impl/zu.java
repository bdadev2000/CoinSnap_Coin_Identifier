package com.applovin.impl;

/* loaded from: classes4.dex */
public final /* synthetic */ class zu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qr f28395b;

    public /* synthetic */ zu(qr qrVar, int i2) {
        this.f28394a = i2;
        this.f28395b = qrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28394a;
        qr qrVar = this.f28395b;
        switch (i2) {
            case 0:
                qr.e(qrVar);
                return;
            default:
                qr.b(qrVar);
                return;
        }
    }
}
