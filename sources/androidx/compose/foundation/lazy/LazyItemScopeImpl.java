package androidx.compose.foundation.lazy;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LazyItemScopeImpl implements LazyItemScope {

    /* renamed from: a, reason: collision with root package name */
    public ParcelableSnapshotMutableIntState f4279a;

    /* renamed from: b, reason: collision with root package name */
    public ParcelableSnapshotMutableIntState f4280b;

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public final Modifier a(float f2) {
        return new ParentSizeElement(f2, this.f4279a);
    }
}
