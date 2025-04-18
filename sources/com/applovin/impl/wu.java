package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class wu implements cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f8872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8873d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f8874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8875g;

    public /* synthetic */ wu(s0.a aVar, int i10, long j3, long j10, int i11) {
        this.f8871b = i11;
        this.f8872c = aVar;
        this.f8873d = i10;
        this.f8874f = j3;
        this.f8875g = j10;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.f8871b) {
            case 0:
                ((s0) obj).a(this.f8872c, this.f8873d, this.f8874f, this.f8875g);
                return;
            default:
                ((s0) obj).b(this.f8872c, this.f8873d, this.f8874f, this.f8875g);
                return;
        }
    }
}
