package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
final class d extends Optional {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6172a;

    public d(Object obj) {
        this.f6172a = obj;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Set asSet() {
        return Collections.singleton(this.f6172a);
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f6172a.equals(((d) obj).f6172a);
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object get() {
        return this.f6172a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public int hashCode() {
        return this.f6172a.hashCode() + 1502476572;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object or(Object obj) {
        Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.f6172a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object orNull() {
        return this.f6172a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public String toString() {
        return "Optional.of(" + this.f6172a + ")";
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Optional transform(Function function) {
        return new d(Preconditions.checkNotNull(function.apply(this.f6172a), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Optional or(Optional optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object or(Supplier supplier) {
        Preconditions.checkNotNull(supplier);
        return this.f6172a;
    }
}
