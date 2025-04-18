package com.applovin.impl.sdk.network;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f7948c;

    public /* synthetic */ f(b bVar, int i10) {
        this.f7947b = i10;
        this.f7948c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7947b;
        b bVar = this.f7948c;
        switch (i10) {
            case 0:
                b.d(bVar);
                return;
            default:
                b.f(bVar);
                return;
        }
    }
}
