package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class IndicationModifierElement extends ModifierNodeElement<IndicationModifierNode> {

    /* renamed from: a, reason: collision with root package name */
    public final InteractionSource f2757a;

    /* renamed from: b, reason: collision with root package name */
    public final IndicationNodeFactory f2758b;

    public IndicationModifierElement(InteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory) {
        this.f2757a = interactionSource;
        this.f2758b = indicationNodeFactory;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.node.DelegatingNode, androidx.compose.ui.Modifier$Node, androidx.compose.foundation.IndicationModifierNode] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        DelegatableNode b2 = this.f2758b.b(this.f2757a);
        ?? delegatingNode = new DelegatingNode();
        delegatingNode.f2759q = b2;
        delegatingNode.e2(b2);
        return delegatingNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        IndicationModifierNode indicationModifierNode = (IndicationModifierNode) node;
        DelegatableNode b2 = this.f2758b.b(this.f2757a);
        indicationModifierNode.f2(indicationModifierNode.f2759q);
        indicationModifierNode.f2759q = b2;
        indicationModifierNode.e2(b2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return a.g(this.f2757a, indicationModifierElement.f2757a) && a.g(this.f2758b, indicationModifierElement.f2758b);
    }

    public final int hashCode() {
        return this.f2758b.hashCode() + (this.f2757a.hashCode() * 31);
    }
}
