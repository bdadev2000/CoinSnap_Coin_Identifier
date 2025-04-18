package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p2 extends tg implements Serializable {
    final Function a;

    /* renamed from: b, reason: collision with root package name */
    final tg f6897b;

    public p2(Function function, tg tgVar) {
        this.a = (Function) Preconditions.checkNotNull(function);
        this.f6897b = (tg) Preconditions.checkNotNull(tgVar);
    }

    @Override // com.applovin.impl.tg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f6897b.compare(this.a.apply(obj), this.a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (this.a.equals(p2Var.a) && this.f6897b.equals(p2Var.f6897b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.f6897b);
    }

    public String toString() {
        return this.f6897b + ".onResultOf(" + this.a + ")";
    }
}
