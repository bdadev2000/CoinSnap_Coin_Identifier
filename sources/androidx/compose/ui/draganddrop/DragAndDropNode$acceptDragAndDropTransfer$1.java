package androidx.compose.ui.draganddrop;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DragAndDropNode$acceptDragAndDropTransfer$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DragAndDropEvent f14780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DragAndDropNode f14781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f14782c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$acceptDragAndDropTransfer$1(DragAndDropEvent dragAndDropEvent, DragAndDropNode dragAndDropNode, b0 b0Var) {
        super(1);
        this.f14780a = dragAndDropEvent;
        this.f14781b = dragAndDropNode;
        this.f14782c = b0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DragAndDropNode dragAndDropNode = (DragAndDropNode) obj;
        if (!dragAndDropNode.f14699n) {
            return TraversableNode.Companion.TraverseDescendantsAction.f16173b;
        }
        if (dragAndDropNode.f14775r != null) {
            InlineClassHelperKt.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            throw null;
        }
        DragAndDropTarget dragAndDropTarget = (DragAndDropTarget) dragAndDropNode.f14772o.invoke(this.f14780a);
        dragAndDropNode.f14775r = dragAndDropTarget;
        boolean z2 = dragAndDropTarget != null;
        if (z2) {
            DelegatableNodeKt.g(this.f14781b).getDragAndDropManager().b(dragAndDropNode);
        }
        b0 b0Var = this.f14782c;
        b0Var.f30919a = b0Var.f30919a || z2;
        return TraversableNode.Companion.TraverseDescendantsAction.f16172a;
    }
}
