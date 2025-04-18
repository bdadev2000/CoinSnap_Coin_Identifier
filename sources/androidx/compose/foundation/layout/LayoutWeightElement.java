package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LayoutWeightElement extends ModifierNodeElement<LayoutWeightNode> {

    /* renamed from: a, reason: collision with root package name */
    public final float f4040a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4041b;

    public LayoutWeightElement(float f2, boolean z2) {
        this.f4040a = f2;
        this.f4041b = z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.LayoutWeightNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4042o = this.f4040a;
        node.f4043p = this.f4041b;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        LayoutWeightNode layoutWeightNode = (LayoutWeightNode) node;
        layoutWeightNode.f4042o = this.f4040a;
        layoutWeightNode.f4043p = this.f4041b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.f4040a == layoutWeightElement.f4040a && this.f4041b == layoutWeightElement.f4041b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4041b) + (Float.hashCode(this.f4040a) * 31);
    }
}
