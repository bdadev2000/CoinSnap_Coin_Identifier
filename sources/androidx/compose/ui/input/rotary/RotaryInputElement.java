package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RotaryInputElement extends ModifierNodeElement<RotaryInputNode> {

    /* renamed from: a, reason: collision with root package name */
    public final l f15684a;

    /* renamed from: b, reason: collision with root package name */
    public final l f15685b = null;

    public RotaryInputElement(l lVar) {
        this.f15684a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.input.rotary.RotaryInputNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f15686o = this.f15684a;
        node.f15687p = this.f15685b;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        RotaryInputNode rotaryInputNode = (RotaryInputNode) node;
        rotaryInputNode.f15686o = this.f15684a;
        rotaryInputNode.f15687p = this.f15685b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return a.g(this.f15684a, rotaryInputElement.f15684a) && a.g(this.f15685b, rotaryInputElement.f15685b);
    }

    public final int hashCode() {
        l lVar = this.f15684a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l lVar2 = this.f15685b;
        return hashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f15684a + ", onPreRotaryScrollEvent=" + this.f15685b + ')';
    }
}
