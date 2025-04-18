package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BoxChildDataElement extends ModifierNodeElement<BoxChildDataNode> {

    /* renamed from: a, reason: collision with root package name */
    public final Alignment f3792a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3793b;

    public BoxChildDataElement(BiasAlignment biasAlignment, boolean z2) {
        this.f3792a = biasAlignment;
        this.f3793b = z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.BoxChildDataNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f3794o = this.f3792a;
        node.f3795p = this.f3793b;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        BoxChildDataNode boxChildDataNode = (BoxChildDataNode) node;
        boxChildDataNode.f3794o = this.f3792a;
        boxChildDataNode.f3795p = this.f3793b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return p0.a.g(this.f3792a, boxChildDataElement.f3792a) && this.f3793b == boxChildDataElement.f3793b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3793b) + (this.f3792a.hashCode() * 31);
    }
}
