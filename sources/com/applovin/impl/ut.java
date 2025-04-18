package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class ut implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f27436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27437c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ut(x1 x1Var, boolean z2, Runnable runnable) {
        this.f27435a = 2;
        this.f27437c = x1Var;
        this.f27436b = z2;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f27435a;
        boolean z2 = this.f27436b;
        Object obj = this.d;
        Object obj2 = this.f27437c;
        switch (i2) {
            case 0:
                gc.a(z2, (MaxAdRevenueListener) obj2, (MaxAd) obj);
                return;
            case 1:
                gc.a(z2, (MaxAdRequestListener) obj2, (String) obj);
                return;
            default:
                x1.a((x1) obj2, z2, (Runnable) obj);
                return;
        }
    }

    public /* synthetic */ ut(Object obj, int i2, Object obj2, boolean z2) {
        this.f27435a = i2;
        this.f27436b = z2;
        this.f27437c = obj;
        this.d = obj2;
    }
}
