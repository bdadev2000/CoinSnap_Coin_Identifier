package com.applovin.impl;

import com.applovin.impl.q1;

/* loaded from: classes2.dex */
public final /* synthetic */ class uu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f27439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27440c;

    public /* synthetic */ uu(Object obj, long j2, int i2) {
        this.f27438a = i2;
        this.f27440c = obj;
        this.f27439b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f27438a;
        long j2 = this.f27439b;
        Object obj = this.f27440c;
        switch (i2) {
            case 0:
                ((q1.a) obj).a(j2);
                return;
            default:
                com.applovin.impl.sdk.i.c((com.applovin.impl.sdk.i) obj, j2);
                return;
        }
    }
}
