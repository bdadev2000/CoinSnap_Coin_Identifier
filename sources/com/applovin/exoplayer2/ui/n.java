package com.applovin.exoplayer2.ui;

import com.applovin.exoplayer2.common.base.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22658a;

    public /* synthetic */ n(int i2) {
        this.f22658a = i2;
    }

    @Override // com.applovin.exoplayer2.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.f22658a) {
            case 0:
                return h.c(obj);
            default:
                return h.d(obj);
        }
    }
}
