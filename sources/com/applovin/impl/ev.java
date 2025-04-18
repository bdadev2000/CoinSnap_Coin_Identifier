package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class ev implements cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f4530c;

    public /* synthetic */ ev(s0.a aVar, int i10) {
        this.f4529b = i10;
        this.f4530c = aVar;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        int i10 = this.f4529b;
        s0.a aVar = this.f4530c;
        switch (i10) {
            case 0:
                ((s0) obj).h(aVar);
                return;
            case 1:
                ((s0) obj).b(aVar);
                return;
            case 2:
                ((s0) obj).c(aVar);
                return;
            case 3:
                ((s0) obj).d(aVar);
                return;
            case 4:
                ((s0) obj).e(aVar);
                return;
            case 5:
                ((s0) obj).a(aVar);
                return;
            default:
                ((s0) obj).g(aVar);
                return;
        }
    }
}
