package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DragAndDropNode$onEnded$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DragAndDropEvent f14783a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onEnded$1(DragAndDropEvent dragAndDropEvent) {
        super(1);
        this.f14783a = dragAndDropEvent;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DragAndDropNode dragAndDropNode = (DragAndDropNode) obj;
        if (!dragAndDropNode.f14688a.f14699n) {
            return TraversableNode.Companion.TraverseDescendantsAction.f16173b;
        }
        DragAndDropTarget dragAndDropTarget = dragAndDropNode.f14775r;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.R1(this.f14783a);
        }
        dragAndDropNode.f14775r = null;
        dragAndDropNode.f14774q = null;
        return TraversableNode.Companion.TraverseDescendantsAction.f16172a;
    }
}
