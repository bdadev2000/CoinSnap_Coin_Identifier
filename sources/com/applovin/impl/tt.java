package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class tt implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gb f8299c;

    public /* synthetic */ tt(gb gbVar, int i10) {
        this.f8298b = i10;
        this.f8299c = gbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8298b;
        gb gbVar = this.f8299c;
        switch (i10) {
            case 0:
                gbVar.c();
                return;
            default:
                gbVar.d();
                return;
        }
    }
}
