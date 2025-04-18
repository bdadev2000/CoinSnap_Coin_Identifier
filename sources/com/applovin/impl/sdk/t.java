package com.applovin.impl.sdk;

import com.applovin.impl.sdk.h;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f26853b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f26854c;
    public final /* synthetic */ h.a d;

    public /* synthetic */ t(h hVar, j jVar, h.a aVar, int i2) {
        this.f26852a = i2;
        this.f26853b = hVar;
        this.f26854c = jVar;
        this.d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26852a;
        h hVar = this.f26853b;
        h.a aVar = this.d;
        j jVar = this.f26854c;
        switch (i2) {
            case 0:
                h.e(aVar, hVar, jVar);
                return;
            default:
                h.d(aVar, hVar, jVar);
                return;
        }
    }
}
