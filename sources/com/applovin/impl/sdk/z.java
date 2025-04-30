package com.applovin.impl.sdk;

import com.applovin.impl.sdk.AppLovinAdServiceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11185c;

    public /* synthetic */ z(Object obj, int i9) {
        this.b = i9;
        this.f11185c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AppLovinAdServiceImpl.d.a((AppLovinAdServiceImpl.d) this.f11185c);
                return;
            case 1:
                C0750b.a((C0750b) this.f11185c);
                return;
            case 2:
                C0752d.a((C0752d) this.f11185c);
                return;
            case 3:
                C0753e.k((C0753e) this.f11185c);
                return;
            case 4:
                l.b((l) this.f11185c);
                return;
            default:
                n.i((n) this.f11185c);
                return;
        }
    }
}
