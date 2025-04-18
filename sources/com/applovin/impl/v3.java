package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v3 extends tg implements Serializable {
    final Comparator a;

    public v3(Comparator comparator) {
        this.a = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.applovin.impl.tg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v3) {
            return this.a.equals(((v3) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
