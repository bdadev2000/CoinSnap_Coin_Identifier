package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
final class d extends Optional {
    private final Object a;

    public d(Object obj) {
        this.a = obj;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Set asSet() {
        return Collections.singleton(this.a);
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.a.equals(((d) obj).a);
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object get() {
        return this.a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object or(Object obj) {
        Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object orNull() {
        return this.a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public String toString() {
        return "Optional.of(" + this.a + ")";
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Optional transform(Function function) {
        return new d(Preconditions.checkNotNull(function.apply(this.a), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Optional or(Optional optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object or(Supplier supplier) {
        Preconditions.checkNotNull(supplier);
        return this.a;
    }
}
