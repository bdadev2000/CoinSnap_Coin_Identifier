package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737p2 extends tg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Function f9967a;
    final tg b;

    public C0737p2(Function function, tg tgVar) {
        this.f9967a = (Function) Preconditions.checkNotNull(function);
        this.b = (tg) Preconditions.checkNotNull(tgVar);
    }

    @Override // com.applovin.impl.tg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.b.compare(this.f9967a.apply(obj), this.f9967a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0737p2)) {
            return false;
        }
        C0737p2 c0737p2 = (C0737p2) obj;
        if (this.f9967a.equals(c0737p2.f9967a) && this.b.equals(c0737p2.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f9967a, this.b);
    }

    public String toString() {
        return this.b + ".onResultOf(" + this.f9967a + ")";
    }
}
