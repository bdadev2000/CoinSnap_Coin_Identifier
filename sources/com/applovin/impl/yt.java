package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class yt implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ig f9296c;

    public /* synthetic */ yt(ig igVar, int i10) {
        this.f9295b = i10;
        this.f9296c = igVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9295b;
        ig igVar = this.f9296c;
        switch (i10) {
            case 0:
                ig.e(igVar);
                return;
            case 1:
                ig.a(igVar);
                return;
            default:
                ig.c(igVar);
                return;
        }
    }
}
