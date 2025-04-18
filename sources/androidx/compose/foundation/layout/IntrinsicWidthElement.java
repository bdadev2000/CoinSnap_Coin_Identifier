package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

/* loaded from: classes2.dex */
final class IntrinsicWidthElement extends ModifierNodeElement<IntrinsicWidthNode> {

    /* renamed from: a, reason: collision with root package name */
    public final IntrinsicSize f4033a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4034b = true;

    public IntrinsicWidthElement(IntrinsicSize intrinsicSize) {
        this.f4033a = intrinsicSize;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.IntrinsicWidthNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4035o = this.f4033a;
        node.f4036p = this.f4034b;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        IntrinsicWidthNode intrinsicWidthNode = (IntrinsicWidthNode) node;
        intrinsicWidthNode.f4035o = this.f4033a;
        intrinsicWidthNode.f4036p = this.f4034b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        if (intrinsicWidthElement == null) {
            return false;
        }
        return this.f4033a == intrinsicWidthElement.f4033a && this.f4034b == intrinsicWidthElement.f4034b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4034b) + (this.f4033a.hashCode() * 31);
    }
}
