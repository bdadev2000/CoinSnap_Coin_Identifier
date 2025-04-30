package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* loaded from: classes.dex */
public final /* synthetic */ class Q implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6459c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f6460d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaxAd f6461f;

    public /* synthetic */ Q(boolean z8, MaxAdListener maxAdListener, MaxAd maxAd, int i9) {
        this.b = i9;
        this.f6459c = z8;
        this.f6460d = maxAdListener;
        this.f6461f = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                bc.a(this.f6459c, this.f6460d, this.f6461f);
                return;
            case 1:
                bc.c(this.f6459c, this.f6460d, this.f6461f);
                return;
            case 2:
                bc.h(this.f6459c, this.f6460d, this.f6461f);
                return;
            case 3:
                bc.b(this.f6459c, this.f6460d, this.f6461f);
                return;
            case 4:
                bc.g(this.f6459c, this.f6460d, this.f6461f);
                return;
            case 5:
                bc.e(this.f6459c, this.f6460d, this.f6461f);
                return;
            case 6:
                bc.f(this.f6459c, this.f6460d, this.f6461f);
                return;
            default:
                bc.d(this.f6459c, this.f6460d, this.f6461f);
                return;
        }
    }
}
