package com.applovin.impl.sdk;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f7695c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.sdk.ad.b f7696d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f7697f;

    public /* synthetic */ i0(p pVar, com.applovin.impl.sdk.ad.b bVar, Context context, int i10) {
        this.f7694b = i10;
        this.f7695c = pVar;
        this.f7696d = bVar;
        this.f7697f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7694b;
        p pVar = this.f7695c;
        Context context = this.f7697f;
        com.applovin.impl.sdk.ad.b bVar = this.f7696d;
        switch (i10) {
            case 0:
                p.b(pVar, bVar, context);
                return;
            default:
                p.a(pVar, bVar, context);
                return;
        }
    }
}
