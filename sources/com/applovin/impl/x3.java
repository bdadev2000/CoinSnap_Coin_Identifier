package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x3 extends wg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator f27830a;

    public x3(Comparator comparator) {
        this.f27830a = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.applovin.impl.wg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f27830a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x3) {
            return this.f27830a.equals(((x3) obj).f27830a);
        }
        return false;
    }

    public int hashCode() {
        return this.f27830a.hashCode();
    }

    public String toString() {
        return this.f27830a.toString();
    }
}
