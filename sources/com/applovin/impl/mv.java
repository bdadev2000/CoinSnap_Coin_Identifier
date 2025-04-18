package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class mv implements cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f6324c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6325d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f6327g;

    public /* synthetic */ mv(s0.a aVar, String str, long j3, long j10, int i10) {
        this.f6323b = i10;
        this.f6324c = aVar;
        this.f6325d = str;
        this.f6326f = j3;
        this.f6327g = j10;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.f6323b) {
            case 0:
                r0.b(this.f6324c, this.f6325d, this.f6326f, this.f6327g, (s0) obj);
                return;
            default:
                r0.a(this.f6324c, this.f6325d, this.f6326f, this.f6327g, (s0) obj);
                return;
        }
    }
}
