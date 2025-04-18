package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

@ExperimentalFoundationApi
/* loaded from: classes3.dex */
final class BringIntoViewRequesterElement extends ModifierNodeElement<BringIntoViewRequesterNode> {

    /* renamed from: a, reason: collision with root package name */
    public final BringIntoViewRequester f5324a;

    public BringIntoViewRequesterElement(BringIntoViewRequester bringIntoViewRequester) {
        this.f5324a = bringIntoViewRequester;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.relocation.BringIntoViewRequesterNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f5332o = this.f5324a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        BringIntoViewRequesterNode bringIntoViewRequesterNode = (BringIntoViewRequesterNode) node;
        BringIntoViewRequester bringIntoViewRequester = bringIntoViewRequesterNode.f5332o;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            a.q(bringIntoViewRequester, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).f5325a.n(bringIntoViewRequesterNode);
        }
        BringIntoViewRequester bringIntoViewRequester2 = this.f5324a;
        if (bringIntoViewRequester2 instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) bringIntoViewRequester2).f5325a.b(bringIntoViewRequesterNode);
        }
        bringIntoViewRequesterNode.f5332o = bringIntoViewRequester2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (a.g(this.f5324a, ((BringIntoViewRequesterElement) obj).f5324a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5324a.hashCode();
    }
}
