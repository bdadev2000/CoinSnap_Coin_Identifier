package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UnspecifiedConstraintsElement extends ModifierNodeElement<UnspecifiedConstraintsNode> {

    /* renamed from: a, reason: collision with root package name */
    public final float f4124a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4125b;

    public UnspecifiedConstraintsElement(float f2, float f3) {
        this.f4124a = f2;
        this.f4125b = f3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.foundation.layout.UnspecifiedConstraintsNode] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4126o = this.f4124a;
        node.f4127p = this.f4125b;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        UnspecifiedConstraintsNode unspecifiedConstraintsNode = (UnspecifiedConstraintsNode) node;
        unspecifiedConstraintsNode.f4126o = this.f4124a;
        unspecifiedConstraintsNode.f4127p = this.f4125b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return Dp.a(this.f4124a, unspecifiedConstraintsElement.f4124a) && Dp.a(this.f4125b, unspecifiedConstraintsElement.f4125b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4125b) + (Float.hashCode(this.f4124a) * 31);
    }
}
