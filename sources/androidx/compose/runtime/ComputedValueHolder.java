package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ComputedValueHolder<T> implements ValueHolder<T> {

    /* renamed from: a, reason: collision with root package name */
    public final l f13777a;

    public ComputedValueHolder(l lVar) {
        this.f13777a = lVar;
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final Object a(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.f13777a.invoke(persistentCompositionLocalMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComputedValueHolder) && p0.a.g(this.f13777a, ((ComputedValueHolder) obj).f13777a);
    }

    public final int hashCode() {
        return this.f13777a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f13777a + ')';
    }
}
