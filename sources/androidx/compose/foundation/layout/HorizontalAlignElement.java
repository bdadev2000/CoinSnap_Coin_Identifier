package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

@StabilityInferred
/* loaded from: classes4.dex */
public final class HorizontalAlignElement extends ModifierNodeElement<HorizontalAlignNode> {

    /* renamed from: a, reason: collision with root package name */
    public final Alignment.Horizontal f4008a;

    public HorizontalAlignElement(BiasAlignment.Horizontal horizontal) {
        this.f4008a = horizontal;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.foundation.layout.HorizontalAlignNode] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4009o = this.f4008a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((HorizontalAlignNode) node).f4009o = this.f4008a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return p0.a.g(this.f4008a, horizontalAlignElement.f4008a);
    }

    public final int hashCode() {
        return this.f4008a.hashCode();
    }
}
