package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class pv implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rm f7041c;

    public /* synthetic */ pv(rm rmVar, int i10) {
        this.f7040b = i10;
        this.f7041c = rmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7040b;
        rm rmVar = this.f7041c;
        switch (i10) {
            case 0:
                rm.f(rmVar);
                return;
            default:
                rm.e(rmVar);
                return;
        }
    }
}
