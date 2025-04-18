package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class kv implements cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5789b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f5790c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5791d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5792f;

    public /* synthetic */ kv(s0.a aVar, int i10, long j3) {
        this.f5790c = aVar;
        this.f5792f = i10;
        this.f5791d = j3;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        int i10 = this.f5789b;
        int i11 = this.f5792f;
        s0.a aVar = this.f5790c;
        long j3 = this.f5791d;
        switch (i10) {
            case 0:
                ((s0) obj).a(aVar, i11, j3);
                return;
            default:
                ((s0) obj).a(aVar, j3, i11);
                return;
        }
    }

    public /* synthetic */ kv(s0.a aVar, long j3, int i10) {
        this.f5790c = aVar;
        this.f5791d = j3;
        this.f5792f = i10;
    }
}
