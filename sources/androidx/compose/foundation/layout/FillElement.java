package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FillElement extends ModifierNodeElement<FillNode> {

    /* renamed from: a, reason: collision with root package name */
    public final Direction f3886a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3887b;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public FillElement(Direction direction, float f2) {
        this.f3886a = direction;
        this.f3887b = f2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.FillNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f3888o = this.f3886a;
        node.f3889p = this.f3887b;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        FillNode fillNode = (FillNode) node;
        fillNode.f3888o = this.f3886a;
        fillNode.f3889p = this.f3887b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f3886a == fillElement.f3886a && this.f3887b == fillElement.f3887b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3887b) + (this.f3886a.hashCode() * 31);
    }
}
