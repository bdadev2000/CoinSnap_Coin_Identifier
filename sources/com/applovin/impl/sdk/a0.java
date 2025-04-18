package com.applovin.impl.sdk;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f7583c;

    public /* synthetic */ a0(g gVar, int i10) {
        this.f7582b = i10;
        this.f7583c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7582b;
        g gVar = this.f7583c;
        switch (i10) {
            case 0:
                g.i(gVar);
                return;
            default:
                g.h(gVar);
                return;
        }
    }
}
