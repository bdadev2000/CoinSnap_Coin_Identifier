package androidx.compose.ui.graphics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import e0.x;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class BlockGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public l f14946o;

    public BlockGraphicsLayerModifier(l lVar) {
        this.f14946o = lVar;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable V = measurable.V(j2);
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new BlockGraphicsLayerModifier$measure$1(V, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f14946o + ')';
    }
}
