package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import e0.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PaddingNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public float f4066o;

    /* renamed from: p, reason: collision with root package name */
    public float f4067p;

    /* renamed from: q, reason: collision with root package name */
    public float f4068q;

    /* renamed from: r, reason: collision with root package name */
    public float f4069r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4070s;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        int F0 = measureScope.F0(this.f4068q) + measureScope.F0(this.f4066o);
        int F02 = measureScope.F0(this.f4069r) + measureScope.F0(this.f4067p);
        Placeable V = measurable.V(ConstraintsKt.k(-F0, -F02, j2));
        return measureScope.T(ConstraintsKt.h(V.f15825a + F0, j2), ConstraintsKt.g(V.f15826b + F02, j2), x.f30219a, new PaddingNode$measure$1(this, V, measureScope));
    }
}
