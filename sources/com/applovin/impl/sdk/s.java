package com.applovin.impl.sdk;

import com.applovin.impl.sdk.AppLovinAdServiceImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26851b;

    public /* synthetic */ s(Object obj, int i2) {
        this.f26850a = i2;
        this.f26851b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26850a;
        Object obj = this.f26851b;
        switch (i2) {
            case 0:
                AppLovinAdServiceImpl.c.a((AppLovinAdServiceImpl.c) obj);
                return;
            case 1:
                b.a((b) obj);
                return;
            case 2:
                d.a((d) obj);
                return;
            default:
                k.a((k) obj);
                return;
        }
    }
}
