package com.applovin.impl;

/* loaded from: classes2.dex */
public final /* synthetic */ class pu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.sdk.j f26126b;

    public /* synthetic */ pu(int i2, com.applovin.impl.sdk.j jVar) {
        this.f26125a = i2;
        this.f26126b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26125a;
        com.applovin.impl.sdk.j jVar = this.f26126b;
        switch (i2) {
            case 0:
                pb.a(jVar);
                return;
            case 1:
                sr.d(jVar);
                return;
            default:
                sr.e(jVar);
                return;
        }
    }
}
