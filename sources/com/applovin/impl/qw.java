package com.applovin.impl;

import com.applovin.impl.q1;
import com.applovin.impl.y1;

/* loaded from: classes2.dex */
public final /* synthetic */ class qw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26227c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26228f;

    public /* synthetic */ qw(Object obj, int i2, long j2, long j3, int i3) {
        this.f26225a = i3;
        this.f26228f = obj;
        this.f26226b = i2;
        this.f26227c = j2;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26225a;
        Object obj = this.f26228f;
        switch (i2) {
            case 0:
                y1.a.C0102a.b((y1.a.C0102a.C0103a) obj, this.f26226b, this.f26227c, this.d);
                return;
            default:
                q1.a.a((q1.a) obj, this.f26226b, this.f26227c, this.d);
                return;
        }
    }
}
