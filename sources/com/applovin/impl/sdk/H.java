package com.applovin.impl.sdk;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class H implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f10716c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.sdk.ad.b f10717d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f10718f;

    public /* synthetic */ H(p pVar, com.applovin.impl.sdk.ad.b bVar, Context context, int i9) {
        this.b = i9;
        this.f10716c = pVar;
        this.f10717d = bVar;
        this.f10718f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                p.b(this.f10716c, this.f10717d, this.f10718f);
                return;
            default:
                p.a(this.f10716c, this.f10717d, this.f10718f);
                return;
        }
    }
}
