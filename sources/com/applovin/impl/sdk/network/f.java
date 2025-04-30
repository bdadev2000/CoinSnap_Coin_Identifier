package com.applovin.impl.sdk.network;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f11112c;

    public /* synthetic */ f(b bVar, int i9) {
        this.b = i9;
        this.f11112c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                b.e(this.f11112c);
                return;
            default:
                b.d(this.f11112c);
                return;
        }
    }
}
