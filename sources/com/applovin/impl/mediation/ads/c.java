package com.applovin.impl.mediation.ads;

import com.applovin.impl.he;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewImpl f25369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ he f25370c;

    public /* synthetic */ c(MaxAdViewImpl maxAdViewImpl, he heVar, int i2) {
        this.f25368a = i2;
        this.f25369b = maxAdViewImpl;
        this.f25370c = heVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25368a;
        he heVar = this.f25370c;
        MaxAdViewImpl maxAdViewImpl = this.f25369b;
        switch (i2) {
            case 0:
                maxAdViewImpl.a(heVar);
                return;
            default:
                maxAdViewImpl.b(heVar);
                return;
        }
    }
}
