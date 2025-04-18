package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropEvent;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class DragAndDropTargetNode$createAndAttachDragAndDropModifierNode$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DragAndDropTargetNode f3003a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropTargetNode$createAndAttachDragAndDropModifierNode$1(DragAndDropTargetNode dragAndDropTargetNode) {
        super(1);
        this.f3003a = dragAndDropTargetNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return (Boolean) this.f3003a.f3000q.invoke((DragAndDropEvent) obj);
    }
}
