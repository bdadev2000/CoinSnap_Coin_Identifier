package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class rt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f26384c;
    public final /* synthetic */ MaxAd d;

    public /* synthetic */ rt(boolean z2, MaxAdListener maxAdListener, MaxAd maxAd, int i2) {
        this.f26382a = i2;
        this.f26383b = z2;
        this.f26384c = maxAdListener;
        this.d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26382a;
        boolean z2 = this.f26383b;
        MaxAd maxAd = this.d;
        MaxAdListener maxAdListener = this.f26384c;
        switch (i2) {
            case 0:
                gc.f(z2, maxAdListener, maxAd);
                return;
            case 1:
                gc.d(z2, maxAdListener, maxAd);
                return;
            case 2:
                gc.b(z2, maxAdListener, maxAd);
                return;
            case 3:
                gc.c(z2, maxAdListener, maxAd);
                return;
            case 4:
                gc.e(z2, maxAdListener, maxAd);
                return;
            default:
                gc.a(z2, maxAdListener, maxAd);
                return;
        }
    }
}
