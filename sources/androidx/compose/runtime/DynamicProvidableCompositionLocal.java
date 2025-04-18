package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class DynamicProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {

    /* renamed from: b, reason: collision with root package name */
    public final SnapshotMutationPolicy f13795b;

    public DynamicProvidableCompositionLocal(SnapshotMutationPolicy snapshotMutationPolicy, q0.a aVar) {
        super(aVar);
        this.f13795b = snapshotMutationPolicy;
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public final ProvidedValue c(Object obj) {
        return new ProvidedValue(this, obj, obj == null, this.f13795b, null, null, true);
    }
}
