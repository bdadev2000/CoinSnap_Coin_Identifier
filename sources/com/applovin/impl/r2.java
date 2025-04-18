package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r2 extends wg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Function f26253a;

    /* renamed from: b, reason: collision with root package name */
    final wg f26254b;

    public r2(Function function, wg wgVar) {
        this.f26253a = (Function) Preconditions.checkNotNull(function);
        this.f26254b = (wg) Preconditions.checkNotNull(wgVar);
    }

    @Override // com.applovin.impl.wg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f26254b.compare(this.f26253a.apply(obj), this.f26253a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return this.f26253a.equals(r2Var.f26253a) && this.f26254b.equals(r2Var.f26254b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f26253a, this.f26254b);
    }

    public String toString() {
        return this.f26254b + ".onResultOf(" + this.f26253a + ")";
    }
}
