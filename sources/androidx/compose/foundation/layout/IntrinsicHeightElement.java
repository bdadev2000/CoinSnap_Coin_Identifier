package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

/* loaded from: classes3.dex */
final class IntrinsicHeightElement extends ModifierNodeElement<IntrinsicHeightNode> {

    /* renamed from: a, reason: collision with root package name */
    public final IntrinsicSize f4025a = IntrinsicSize.f4029a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4026b = true;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.IntrinsicHeightNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4027o = this.f4025a;
        node.f4028p = this.f4026b;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        IntrinsicHeightNode intrinsicHeightNode = (IntrinsicHeightNode) node;
        intrinsicHeightNode.f4027o = this.f4025a;
        intrinsicHeightNode.f4028p = this.f4026b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        if (intrinsicHeightElement == null) {
            return false;
        }
        return this.f4025a == intrinsicHeightElement.f4025a && this.f4026b == intrinsicHeightElement.f4026b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4026b) + (this.f4025a.hashCode() * 31);
    }
}
