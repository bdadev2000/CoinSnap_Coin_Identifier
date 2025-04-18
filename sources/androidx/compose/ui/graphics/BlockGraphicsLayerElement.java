package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeCoordinator;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BlockGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {

    /* renamed from: a, reason: collision with root package name */
    public final l f14945a;

    public BlockGraphicsLayerElement(l lVar) {
        this.f14945a = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new BlockGraphicsLayerModifier(this.f14945a);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        BlockGraphicsLayerModifier blockGraphicsLayerModifier = (BlockGraphicsLayerModifier) node;
        blockGraphicsLayerModifier.f14946o = this.f14945a;
        NodeCoordinator nodeCoordinator = DelegatableNodeKt.d(blockGraphicsLayerModifier, 2).f16103p;
        if (nodeCoordinator != null) {
            nodeCoordinator.W1(true, blockGraphicsLayerModifier.f14946o);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && p0.a.g(this.f14945a, ((BlockGraphicsLayerElement) obj).f14945a);
    }

    public final int hashCode() {
        return this.f14945a.hashCode();
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f14945a + ')';
    }
}
