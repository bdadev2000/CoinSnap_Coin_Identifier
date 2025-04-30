package com.applovin.exoplayer2.ui;

import com.applovin.exoplayer2.common.base.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Predicate {
    public final /* synthetic */ int b;

    public /* synthetic */ m(int i9) {
        this.b = i9;
    }

    @Override // com.applovin.exoplayer2.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.b) {
            case 0:
                return h.d(obj);
            default:
                return h.c(obj);
        }
    }
}
