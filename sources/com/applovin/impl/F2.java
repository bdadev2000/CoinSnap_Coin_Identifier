package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class F2 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rm f6392c;

    public /* synthetic */ F2(rm rmVar, int i9) {
        this.b = i9;
        this.f6392c = rmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                rm.e(this.f6392c);
                return;
            default:
                rm.f(this.f6392c);
                return;
        }
    }
}
