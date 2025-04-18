package androidx.compose.ui.input.pointer;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.TraversableNodeKt;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PointerHoverIconModifierElement extends ModifierNodeElement<PointerHoverIconModifierNode> {

    /* renamed from: a, reason: collision with root package name */
    public final PointerIcon f15575a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15576b;

    public PointerHoverIconModifierElement(AndroidPointerIconType androidPointerIconType, boolean z2) {
        this.f15575a = androidPointerIconType;
        this.f15576b = z2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new PointerHoverIconModifierNode(this.f15575a, this.f15576b);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        PointerHoverIconModifierNode pointerHoverIconModifierNode = (PointerHoverIconModifierNode) node;
        PointerIcon pointerIcon = pointerHoverIconModifierNode.f15577o;
        PointerIcon pointerIcon2 = this.f15575a;
        if (!a.g(pointerIcon, pointerIcon2)) {
            pointerHoverIconModifierNode.f15577o = pointerIcon2;
            if (pointerHoverIconModifierNode.f15579q) {
                pointerHoverIconModifierNode.f2();
            }
        }
        boolean z2 = pointerHoverIconModifierNode.f15578p;
        boolean z3 = this.f15576b;
        if (z2 != z3) {
            pointerHoverIconModifierNode.f15578p = z3;
            if (z3) {
                if (pointerHoverIconModifierNode.f15579q) {
                    pointerHoverIconModifierNode.e2();
                    return;
                }
                return;
            }
            boolean z4 = pointerHoverIconModifierNode.f15579q;
            if (z4 && z4) {
                if (!z3) {
                    ?? obj = new Object();
                    TraversableNodeKt.d(pointerHoverIconModifierNode, new PointerHoverIconModifierNode$findDescendantNodeWithCursorInBounds$1(obj));
                    PointerHoverIconModifierNode pointerHoverIconModifierNode2 = (PointerHoverIconModifierNode) obj.f30930a;
                    if (pointerHoverIconModifierNode2 != null) {
                        pointerHoverIconModifierNode = pointerHoverIconModifierNode2;
                    }
                }
                pointerHoverIconModifierNode.e2();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return a.g(this.f15575a, pointerHoverIconModifierElement.f15575a) && this.f15576b == pointerHoverIconModifierElement.f15576b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15576b) + (this.f15575a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerHoverIconModifierElement(icon=");
        sb.append(this.f15575a);
        sb.append(", overrideDescendants=");
        return d.s(sb, this.f15576b, ')');
    }
}
