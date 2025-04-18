package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class vu implements cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f8634c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Exception f8635d;

    public /* synthetic */ vu(s0.a aVar, Exception exc, int i10) {
        this.f8633b = i10;
        this.f8634c = aVar;
        this.f8635d = exc;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        int i10 = this.f8633b;
        s0.a aVar = this.f8634c;
        Exception exc = this.f8635d;
        switch (i10) {
            case 0:
                ((s0) obj).a(aVar, exc);
                return;
            case 1:
                ((s0) obj).c(aVar, exc);
                return;
            case 2:
                ((s0) obj).d(aVar, exc);
                return;
            default:
                ((s0) obj).b(aVar, exc);
                return;
        }
    }
}
