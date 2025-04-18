package com.applovin.impl.sdk.network;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f26828b;

    public /* synthetic */ f(b bVar, int i2) {
        this.f26827a = i2;
        this.f26828b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26827a;
        b bVar = this.f26828b;
        switch (i2) {
            case 0:
                b.d(bVar);
                return;
            default:
                b.f(bVar);
                return;
        }
    }
}
