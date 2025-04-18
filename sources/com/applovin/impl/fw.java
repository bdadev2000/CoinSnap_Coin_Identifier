package com.applovin.impl;

/* loaded from: classes2.dex */
public final /* synthetic */ class fw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ue f24040b;

    public /* synthetic */ fw(ue ueVar, int i2) {
        this.f24039a = i2;
        this.f24040b = ueVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24039a;
        ue ueVar = this.f24040b;
        switch (i2) {
            case 0:
                ue.d(ueVar);
                return;
            default:
                ueVar.h();
                return;
        }
    }
}
