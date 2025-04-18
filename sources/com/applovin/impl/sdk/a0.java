package com.applovin.impl.sdk;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f26540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.sdk.ad.b f26541c;
    public final /* synthetic */ Context d;

    public /* synthetic */ a0(l lVar, com.applovin.impl.sdk.ad.b bVar, Context context, int i2) {
        this.f26539a = i2;
        this.f26540b = lVar;
        this.f26541c = bVar;
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26539a;
        l lVar = this.f26540b;
        Context context = this.d;
        com.applovin.impl.sdk.ad.b bVar = this.f26541c;
        switch (i2) {
            case 0:
                l.b(lVar, bVar, context);
                return;
            default:
                l.a(lVar, bVar, context);
                return;
        }
    }
}
