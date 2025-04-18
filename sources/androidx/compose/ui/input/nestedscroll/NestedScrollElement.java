package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NestedScrollElement extends ModifierNodeElement<NestedScrollNode> {

    /* renamed from: a, reason: collision with root package name */
    public final NestedScrollConnection f15529a;

    /* renamed from: b, reason: collision with root package name */
    public final NestedScrollDispatcher f15530b;

    public NestedScrollElement(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.f15529a = nestedScrollConnection;
        this.f15530b = nestedScrollDispatcher;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new NestedScrollNode(this.f15529a, this.f15530b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        NestedScrollNode nestedScrollNode = (NestedScrollNode) node;
        nestedScrollNode.f15531o = this.f15529a;
        NestedScrollDispatcher nestedScrollDispatcher = nestedScrollNode.f15532p;
        if (nestedScrollDispatcher.f15519a == nestedScrollNode) {
            nestedScrollDispatcher.f15519a = null;
        }
        NestedScrollDispatcher nestedScrollDispatcher2 = this.f15530b;
        if (nestedScrollDispatcher2 == null) {
            nestedScrollNode.f15532p = new NestedScrollDispatcher();
        } else if (!a.g(nestedScrollDispatcher2, nestedScrollDispatcher)) {
            nestedScrollNode.f15532p = nestedScrollDispatcher2;
        }
        if (nestedScrollNode.f14699n) {
            NestedScrollDispatcher nestedScrollDispatcher3 = nestedScrollNode.f15532p;
            nestedScrollDispatcher3.f15519a = nestedScrollNode;
            nestedScrollDispatcher3.f15520b = new NestedScrollNode$updateDispatcherFields$1(nestedScrollNode);
            nestedScrollDispatcher3.f15521c = nestedScrollNode.S1();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return a.g(nestedScrollElement.f15529a, this.f15529a) && a.g(nestedScrollElement.f15530b, this.f15530b);
    }

    public final int hashCode() {
        int hashCode = this.f15529a.hashCode() * 31;
        NestedScrollDispatcher nestedScrollDispatcher = this.f15530b;
        return hashCode + (nestedScrollDispatcher != null ? nestedScrollDispatcher.hashCode() : 0);
    }
}
