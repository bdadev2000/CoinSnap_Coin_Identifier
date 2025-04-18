package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.node.DelegatingNode;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@ExperimentalFoundationApi
/* loaded from: classes4.dex */
public final class DragAndDropTargetNode extends DelegatingNode {

    /* renamed from: q, reason: collision with root package name */
    public l f3000q;

    /* renamed from: r, reason: collision with root package name */
    public DragAndDropTarget f3001r;

    /* renamed from: s, reason: collision with root package name */
    public DragAndDropModifierNode f3002s;

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        DragAndDropNode b2 = DragAndDropNodeKt.b(new DragAndDropTargetNode$createAndAttachDragAndDropModifierNode$1(this), this.f3001r);
        e2(b2);
        this.f3002s = b2;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        DragAndDropModifierNode dragAndDropModifierNode = this.f3002s;
        a.p(dragAndDropModifierNode);
        f2(dragAndDropModifierNode);
    }
}
