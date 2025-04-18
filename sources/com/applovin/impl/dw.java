package com.applovin.impl;

import com.applovin.impl.p1;
import com.applovin.impl.x1;

/* loaded from: classes.dex */
public final /* synthetic */ class dw implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4391c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4392d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f4393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4394g;

    public /* synthetic */ dw(Object obj, int i10, long j3, long j10, int i11) {
        this.f4390b = i11;
        this.f4394g = obj;
        this.f4391c = i10;
        this.f4392d = j3;
        this.f4393f = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4390b;
        Object obj = this.f4394g;
        switch (i10) {
            case 0:
                x1.a.C0042a.b((x1.a.C0042a.C0043a) obj, this.f4391c, this.f4392d, this.f4393f);
                return;
            default:
                p1.a.g((p1.a) obj, this.f4391c, this.f4392d, this.f4393f);
                return;
        }
    }
}
