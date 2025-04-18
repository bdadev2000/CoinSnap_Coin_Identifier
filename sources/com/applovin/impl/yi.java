package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class yi extends wg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final wg f28206a;

    public yi(wg wgVar) {
        this.f28206a = (wg) Preconditions.checkNotNull(wgVar);
    }

    @Override // com.applovin.impl.wg
    public wg c() {
        return this.f28206a;
    }

    @Override // com.applovin.impl.wg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f28206a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yi) {
            return this.f28206a.equals(((yi) obj).f28206a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f28206a.hashCode();
    }

    public String toString() {
        return this.f28206a + ".reverse()";
    }
}
