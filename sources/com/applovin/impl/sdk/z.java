package com.applovin.impl.sdk;

import com.applovin.impl.sdk.AppLovinAdServiceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8021c;

    public /* synthetic */ z(Object obj, int i10) {
        this.f8020b = i10;
        this.f8021c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8020b;
        Object obj = this.f8021c;
        switch (i10) {
            case 0:
                AppLovinAdServiceImpl.d.a((AppLovinAdServiceImpl.d) obj);
                return;
            case 1:
                b.a((b) obj);
                return;
            case 2:
                d.a((d) obj);
                return;
            case 3:
                e.k((e) obj);
                return;
            case 4:
                l.a((l) obj);
                return;
            default:
                n.i((n) obj);
                return;
        }
    }
}
