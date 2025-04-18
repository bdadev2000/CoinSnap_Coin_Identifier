package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntSize;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1771a;

    public AnimatedVisibilityScopeImpl(Transition transition) {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(new IntSize(0L), StructuralEqualityPolicy.f14078a);
        this.f1771a = f2;
    }
}
