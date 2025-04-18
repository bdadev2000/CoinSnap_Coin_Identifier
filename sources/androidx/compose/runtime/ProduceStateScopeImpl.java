package androidx.compose.runtime;

import h0.l;

/* loaded from: classes4.dex */
final class ProduceStateScopeImpl<T> implements ProduceStateScope<T>, MutableState<T> {

    /* renamed from: a, reason: collision with root package name */
    public final l f13857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f13858b;

    public ProduceStateScopeImpl(MutableState mutableState, l lVar) {
        this.f13857a = lVar;
        this.f13858b = mutableState;
    }

    @Override // b1.d0
    public final l getCoroutineContext() {
        return this.f13857a;
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        return this.f13858b.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public final void setValue(Object obj) {
        this.f13858b.setValue(obj);
    }
}
