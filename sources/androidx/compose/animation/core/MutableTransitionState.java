package androidx.compose.animation.core;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class MutableTransitionState<S> extends TransitionState<S> {

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f2134b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f2135c;

    public MutableTransitionState(Object obj) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        f2 = SnapshotStateKt.f(obj, StructuralEqualityPolicy.f14078a);
        this.f2134b = f2;
        f3 = SnapshotStateKt.f(obj, StructuralEqualityPolicy.f14078a);
        this.f2135c = f3;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Object a() {
        return this.f2134b.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Object b() {
        return this.f2135c.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void c(Object obj) {
        this.f2134b.setValue(obj);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void d(Transition transition) {
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void e() {
    }
}
