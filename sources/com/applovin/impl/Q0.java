package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class Q0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ig f6462c;

    public /* synthetic */ Q0(ig igVar, int i9) {
        this.b = i9;
        this.f6462c = igVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ig.g(this.f6462c);
                return;
            case 1:
                ig.a(this.f6462c);
                return;
            default:
                ig.f(this.f6462c);
                return;
        }
    }
}
