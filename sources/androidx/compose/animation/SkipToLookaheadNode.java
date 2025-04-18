package androidx.compose.animation;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import e0.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SkipToLookaheadNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public Constraints f1962o;

    /* renamed from: p, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1963p;

    /* renamed from: q, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1964q;

    public SkipToLookaheadNode(ScaleToBoundsImpl scaleToBoundsImpl, q0.a aVar) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        f2 = SnapshotStateKt.f(scaleToBoundsImpl, StructuralEqualityPolicy.f14078a);
        this.f1963p = f2;
        f3 = SnapshotStateKt.f(aVar, StructuralEqualityPolicy.f14078a);
        this.f1964q = f3;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        if (measureScope.t0()) {
            this.f1962o = new Constraints(j2);
        }
        Constraints constraints = this.f1962o;
        p0.a.p(constraints);
        Placeable V = measurable.V(constraints.f17480a);
        long a2 = IntSizeKt.a(V.f15825a, V.f15826b);
        long e = ConstraintsKt.e(j2, a2);
        return measureScope.T((int) (e >> 32), (int) (4294967295L & e), x.f30219a, new SkipToLookaheadNode$measure$1(this, V, a2, e, measureScope));
    }
}
