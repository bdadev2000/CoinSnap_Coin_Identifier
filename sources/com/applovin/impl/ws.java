package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* loaded from: classes.dex */
public final /* synthetic */ class ws implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8868c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f8869d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaxAd f8870f;

    public /* synthetic */ ws(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd, int i10) {
        this.f8867b = i10;
        this.f8868c = z10;
        this.f8869d = maxAdListener;
        this.f8870f = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8867b;
        boolean z10 = this.f8868c;
        MaxAd maxAd = this.f8870f;
        MaxAdListener maxAdListener = this.f8869d;
        switch (i10) {
            case 0:
                bc.h(z10, maxAdListener, maxAd);
                return;
            case 1:
                bc.g(z10, maxAdListener, maxAd);
                return;
            case 2:
                bc.e(z10, maxAdListener, maxAd);
                return;
            case 3:
                bc.a(z10, maxAdListener, maxAd);
                return;
            case 4:
                bc.b(z10, maxAdListener, maxAd);
                return;
            case 5:
                bc.c(z10, maxAdListener, maxAd);
                return;
            case 6:
                bc.f(z10, maxAdListener, maxAd);
                return;
            default:
                bc.d(z10, maxAdListener, maxAd);
                return;
        }
    }
}
