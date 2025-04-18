package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import e0.x;
import q0.l;

/* loaded from: classes3.dex */
final class OffsetPxNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public l f4057o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4058p;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable V = measurable.V(j2);
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new OffsetPxNode$measure$1(this, measureScope, V));
    }
}
