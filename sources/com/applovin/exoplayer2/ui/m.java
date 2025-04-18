package com.applovin.exoplayer2.ui;

import com.applovin.exoplayer2.common.base.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Predicate {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3562b;

    public /* synthetic */ m(int i10) {
        this.f3562b = i10;
    }

    @Override // com.applovin.exoplayer2.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.f3562b) {
            case 0:
                return h.d(obj);
            default:
                return h.c(obj);
        }
    }
}
