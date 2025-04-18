package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* loaded from: classes4.dex */
final class xi extends wg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final xi f27920a = new xi();

    private xi() {
    }

    @Override // com.applovin.impl.wg, java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.applovin.impl.wg
    public wg c() {
        return wg.a();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
