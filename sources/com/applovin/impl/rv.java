package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class rv implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7410c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f7411d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7412f;

    public /* synthetic */ rv(Object obj, boolean z10, long j3, int i10) {
        this.f7409b = i10;
        this.f7412f = obj;
        this.f7410c = z10;
        this.f7411d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7409b;
        long j3 = this.f7411d;
        boolean z10 = this.f7410c;
        Object obj = this.f7412f;
        switch (i10) {
            case 0:
                ((s9) obj).b(z10, j3);
                return;
            case 1:
                com.applovin.impl.sdk.w.b((com.applovin.impl.sdk.w) obj, z10, j3);
                return;
            default:
                t9.E((t9) obj, z10, j3);
                return;
        }
    }
}
