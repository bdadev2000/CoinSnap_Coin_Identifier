package com.vungle.ads;

/* renamed from: com.vungle.ads.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2143v implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2149y f19775c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o1 f19776d;

    public /* synthetic */ RunnableC2143v(C2149y c2149y, o1 o1Var, int i9) {
        this.b = i9;
        this.f19775c = c2149y;
        this.f19776d = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C2149y.c(this.f19775c, this.f19776d);
                return;
            default:
                C2147x.f(this.f19775c, this.f19776d);
                return;
        }
    }
}
