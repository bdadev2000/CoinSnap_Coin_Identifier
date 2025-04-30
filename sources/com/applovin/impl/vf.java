package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class vf extends tg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final vf f11729a = new vf();

    private vf() {
    }

    @Override // com.applovin.impl.tg, java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    @Override // com.applovin.impl.tg
    public tg c() {
        return si.f11193a;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
