package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ti extends tg implements Serializable {
    final tg a;

    public ti(tg tgVar) {
        this.a = (tg) Preconditions.checkNotNull(tgVar);
    }

    @Override // com.applovin.impl.tg
    public tg c() {
        return this.a;
    }

    @Override // com.applovin.impl.tg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ti) {
            return this.a.equals(((ti) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return -this.a.hashCode();
    }

    public String toString() {
        return this.a + ".reverse()";
    }
}
