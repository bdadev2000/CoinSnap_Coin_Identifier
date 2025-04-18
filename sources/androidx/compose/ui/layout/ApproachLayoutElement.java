package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* loaded from: classes4.dex */
final class ApproachLayoutElement extends ModifierNodeElement<ApproachLayoutModifierNodeImpl> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.layout.ApproachLayoutModifierNodeImpl] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f15706o = null;
        node.f15707p = null;
        node.f15708q = null;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ApproachLayoutModifierNodeImpl approachLayoutModifierNodeImpl = (ApproachLayoutModifierNodeImpl) node;
        approachLayoutModifierNodeImpl.f15706o = null;
        approachLayoutModifierNodeImpl.f15707p = null;
        approachLayoutModifierNodeImpl.f15708q = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproachLayoutElement)) {
            return false;
        }
        ((ApproachLayoutElement) obj).getClass();
        return a.g(null, null) && a.g(null, null) && a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ApproachLayoutElement(approachMeasure=null, isMeasurementApproachInProgress=null, isPlacementApproachInProgress=null)";
    }
}
