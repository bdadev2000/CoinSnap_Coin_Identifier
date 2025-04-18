package androidx.compose.ui.node;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasurePolicy;

@StabilityInferred
/* loaded from: classes4.dex */
public final class IntrinsicsPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f15928a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f15929b;

    public IntrinsicsPolicy(LayoutNode layoutNode, MeasurePolicy measurePolicy) {
        ParcelableSnapshotMutableState f2;
        this.f15928a = layoutNode;
        f2 = SnapshotStateKt.f(measurePolicy, StructuralEqualityPolicy.f14078a);
        this.f15929b = f2;
    }

    public final MeasurePolicy a() {
        return (MeasurePolicy) this.f15929b.getValue();
    }
}
