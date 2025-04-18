package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import d0.p;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LazyValueHolder<T> implements ValueHolder<T> {

    /* renamed from: a, reason: collision with root package name */
    public final p f13829a;

    public LazyValueHolder(q0.a aVar) {
        this.f13829a = f0.t(aVar);
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final Object a(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.f13829a.getValue();
    }
}
