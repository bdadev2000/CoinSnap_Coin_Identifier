package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class DynamicValueHolder<T> implements ValueHolder<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableState f13796a;

    public DynamicValueHolder(MutableState mutableState) {
        this.f13796a = mutableState;
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final Object a(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.f13796a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicValueHolder) && p0.a.g(this.f13796a, ((DynamicValueHolder) obj).f13796a);
    }

    public final int hashCode() {
        return this.f13796a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f13796a + ')';
    }
}
