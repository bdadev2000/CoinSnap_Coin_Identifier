package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.jvm.internal.n;
import p0.a;

@ExperimentalFoundationApi
/* loaded from: classes4.dex */
final class DragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<DragSourceNodeWithDefaultPainter> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.node.DelegatingNode, androidx.compose.ui.Modifier$Node, androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.internal.n, q0.l] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? delegatingNode = new DelegatingNode();
        delegatingNode.f3004q = null;
        delegatingNode.e2(DrawModifierKt.a(new n(1, new Object(), CacheDrawScopeDragShadowCallback.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0)));
        delegatingNode.e2(new DragAndDropSourceNode(new DragSourceNodeWithDefaultPainter.AnonymousClass2(null)));
        return delegatingNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((DragSourceNodeWithDefaultPainter) node).f3004q = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        ((DragAndDropSourceWithDefaultShadowElement) obj).getClass();
        return a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }
}
