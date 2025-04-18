package com.applovin.impl;

/* loaded from: classes4.dex */
public final /* synthetic */ class yu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qg f28245b;

    public /* synthetic */ yu(qg qgVar, int i2) {
        this.f28244a = i2;
        this.f28245b = qgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28244a;
        qg qgVar = this.f28245b;
        switch (i2) {
            case 0:
                qg.a(qgVar);
                return;
            default:
                qg.b(qgVar);
                return;
        }
    }
}
