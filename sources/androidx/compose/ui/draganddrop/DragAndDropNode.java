package androidx.compose.ui.draganddrop;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public final l f14772o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f14773p;

    /* renamed from: q, reason: collision with root package name */
    public DragAndDropModifierNode f14774q;

    /* renamed from: r, reason: collision with root package name */
    public DragAndDropTarget f14775r;

    /* loaded from: classes4.dex */
    public static final class Companion {

        /* loaded from: classes4.dex */
        public static final class DragAndDropTraversableKey {

            /* renamed from: a, reason: collision with root package name */
            public static final DragAndDropTraversableKey f14779a = new Object();
        }
    }

    public DragAndDropNode(l lVar) {
        this.f14772o = lVar;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void D0(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.f14775r;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.D0(dragAndDropEvent);
            return;
        }
        DragAndDropModifierNode dragAndDropModifierNode = this.f14774q;
        if (dragAndDropModifierNode != null) {
            dragAndDropModifierNode.D0(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void O(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.f14775r;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.O(dragAndDropEvent);
            return;
        }
        DragAndDropModifierNode dragAndDropModifierNode = this.f14774q;
        if (dragAndDropModifierNode != null) {
            dragAndDropModifierNode.O(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final boolean O0(DragAndDropEvent dragAndDropEvent) {
        DragAndDropModifierNode dragAndDropModifierNode = this.f14774q;
        if (dragAndDropModifierNode != null) {
            return dragAndDropModifierNode.O0(dragAndDropEvent);
        }
        DragAndDropTarget dragAndDropTarget = this.f14775r;
        if (dragAndDropTarget != null) {
            return dragAndDropTarget.O0(dragAndDropEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(androidx.compose.ui.draganddrop.DragAndDropEvent r4) {
        /*
            r3 = this;
            androidx.compose.ui.draganddrop.DragAndDropModifierNode r0 = r3.f14774q
            if (r0 == 0) goto L1b
            android.view.DragEvent r1 = r4.f14771a
            float r2 = r1.getX()
            float r1 = r1.getY()
            long r1 = androidx.compose.ui.geometry.OffsetKt.a(r2, r1)
            boolean r1 = androidx.compose.ui.draganddrop.DragAndDropNodeKt.c(r0, r1)
            r2 = 1
            if (r1 != r2) goto L1b
            r1 = r0
            goto L36
        L1b:
            androidx.compose.ui.Modifier$Node r1 = r3.f14688a
            boolean r1 = r1.f14699n
            if (r1 != 0) goto L23
            r1 = 0
            goto L34
        L23:
            kotlin.jvm.internal.f0 r1 = new kotlin.jvm.internal.f0
            r1.<init>()
            androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1 r2 = new androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
            r2.<init>(r1, r3, r4)
            androidx.compose.ui.node.TraversableNodeKt.d(r3, r2)
            java.lang.Object r1 = r1.f30930a
            androidx.compose.ui.node.TraversableNode r1 = (androidx.compose.ui.node.TraversableNode) r1
        L34:
            androidx.compose.ui.draganddrop.DragAndDropModifierNode r1 = (androidx.compose.ui.draganddrop.DragAndDropModifierNode) r1
        L36:
            if (r1 == 0) goto L48
            if (r0 != 0) goto L48
            r1.D0(r4)
            r1.P(r4)
            androidx.compose.ui.draganddrop.DragAndDropTarget r0 = r3.f14775r
            if (r0 == 0) goto L7b
            r0.a0(r4)
            goto L7b
        L48:
            if (r1 != 0) goto L5a
            if (r0 == 0) goto L5a
            androidx.compose.ui.draganddrop.DragAndDropTarget r2 = r3.f14775r
            if (r2 == 0) goto L56
            r2.D0(r4)
            r2.P(r4)
        L56:
            r0.a0(r4)
            goto L7b
        L5a:
            boolean r2 = p0.a.g(r1, r0)
            if (r2 != 0) goto L6e
            if (r1 == 0) goto L68
            r1.D0(r4)
            r1.P(r4)
        L68:
            if (r0 == 0) goto L7b
            r0.a0(r4)
            goto L7b
        L6e:
            if (r1 == 0) goto L74
            r1.P(r4)
            goto L7b
        L74:
            androidx.compose.ui.draganddrop.DragAndDropTarget r0 = r3.f14775r
            if (r0 == 0) goto L7b
            r0.P(r4)
        L7b:
            r3.f14774q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draganddrop.DragAndDropNode.P(androidx.compose.ui.draganddrop.DragAndDropEvent):void");
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object Q() {
        return Companion.DragAndDropTraversableKey.f14779a;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void R1(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNode$onEnded$1 dragAndDropNode$onEnded$1 = new DragAndDropNode$onEnded$1(dragAndDropEvent);
        if (dragAndDropNode$onEnded$1.invoke(this) != TraversableNode.Companion.TraverseDescendantsAction.f16172a) {
            return;
        }
        TraversableNodeKt.d(this, dragAndDropNode$onEnded$1);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        this.f14775r = null;
        this.f14774q = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void a0(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.f14775r;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.a0(dragAndDropEvent);
        }
        DragAndDropModifierNode dragAndDropModifierNode = this.f14774q;
        if (dragAndDropModifierNode != null) {
            dragAndDropModifierNode.a0(dragAndDropEvent);
        }
        this.f14774q = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    public final boolean e2(DragAndDropEvent dragAndDropEvent) {
        ?? obj = new Object();
        DragAndDropNode$acceptDragAndDropTransfer$1 dragAndDropNode$acceptDragAndDropTransfer$1 = new DragAndDropNode$acceptDragAndDropTransfer$1(dragAndDropEvent, this, obj);
        if (dragAndDropNode$acceptDragAndDropTransfer$1.invoke(this) == TraversableNode.Companion.TraverseDescendantsAction.f16172a) {
            TraversableNodeKt.d(this, dragAndDropNode$acceptDragAndDropTransfer$1);
        }
        return obj.f30919a;
    }
}
