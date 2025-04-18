package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ag extends wg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final ag f22848a = new ag();

    private ag() {
    }

    @Override // com.applovin.impl.wg, java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    @Override // com.applovin.impl.wg
    public wg c() {
        return xi.f27920a;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
