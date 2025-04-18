package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class KeyInputElement extends ModifierNodeElement<KeyInputNode> {

    /* renamed from: a, reason: collision with root package name */
    public final l f15515a;

    /* renamed from: b, reason: collision with root package name */
    public final l f15516b;

    public KeyInputElement(l lVar, l lVar2) {
        this.f15515a = lVar;
        this.f15516b = lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.input.key.KeyInputNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f15517o = this.f15515a;
        node.f15518p = this.f15516b;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        KeyInputNode keyInputNode = (KeyInputNode) node;
        keyInputNode.f15517o = this.f15515a;
        keyInputNode.f15518p = this.f15516b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return a.g(this.f15515a, keyInputElement.f15515a) && a.g(this.f15516b, keyInputElement.f15516b);
    }

    public final int hashCode() {
        l lVar = this.f15515a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l lVar2 = this.f15516b;
        return hashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f15515a + ", onPreKeyEvent=" + this.f15516b + ')';
    }
}
