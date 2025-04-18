package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class vf extends tg implements Serializable {
    static final vf a = new vf();

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
        return si.a;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
