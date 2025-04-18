package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import p0.a;

/* loaded from: classes4.dex */
final class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new MarqueeModifierNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        MarqueeModifierNode marqueeModifierNode = (MarqueeModifierNode) node;
        marqueeModifierNode.w.setValue(null);
        marqueeModifierNode.x.setValue(new MarqueeAnimationMode());
        if (marqueeModifierNode.f2787o == 0 && marqueeModifierNode.f2788p == 0 && marqueeModifierNode.f2789q == 0 && Dp.a(marqueeModifierNode.f2790r, 0.0f)) {
            return;
        }
        marqueeModifierNode.f2787o = 0;
        marqueeModifierNode.f2788p = 0;
        marqueeModifierNode.f2789q = 0;
        marqueeModifierNode.f2790r = 0.0f;
        marqueeModifierNode.g2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        ((MarqueeModifierElement) obj).getClass();
        return a.g(null, null) && Dp.a(0.0f, 0.0f);
    }

    public final int hashCode() {
        Integer.hashCode(0);
        Integer.hashCode(0);
        Integer.hashCode(0);
        Integer.hashCode(0);
        throw null;
    }

    public final String toString() {
        return "MarqueeModifierElement(iterations=0, animationMode=" + ((Object) MarqueeAnimationMode.a(0)) + ", delayMillis=0, initialDelayMillis=0, spacing=null, velocity=" + ((Object) Dp.b(0.0f)) + ')';
    }
}
