package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
public final class DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f14776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DragAndDropNode f14777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DragAndDropEvent f14778c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1(f0 f0Var, DragAndDropNode dragAndDropNode, DragAndDropEvent dragAndDropEvent) {
        super(1);
        this.f14776a = f0Var;
        this.f14777b = dragAndDropNode;
        this.f14778c = dragAndDropEvent;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TraversableNode traversableNode = (TraversableNode) obj;
        DragAndDropNode dragAndDropNode = (DragAndDropNode) traversableNode;
        if (DelegatableNodeKt.g(this.f14777b).getDragAndDropManager().a(dragAndDropNode)) {
            DragAndDropEvent dragAndDropEvent = this.f14778c;
            if (DragAndDropNodeKt.c(dragAndDropNode, OffsetKt.a(dragAndDropEvent.f14771a.getX(), dragAndDropEvent.f14771a.getY()))) {
                this.f14776a.f30930a = traversableNode;
                return TraversableNode.Companion.TraverseDescendantsAction.f16174c;
            }
        }
        return TraversableNode.Companion.TraverseDescendantsAction.f16172a;
    }
}
