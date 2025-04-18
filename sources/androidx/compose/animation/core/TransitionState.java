package androidx.compose.animation.core;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public abstract class TransitionState<S> {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f2334a;

    public TransitionState() {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f2334a = f2;
    }

    public abstract Object a();

    public abstract Object b();

    public abstract void c(Object obj);

    public abstract void d(Transition transition);

    public abstract void e();
}
