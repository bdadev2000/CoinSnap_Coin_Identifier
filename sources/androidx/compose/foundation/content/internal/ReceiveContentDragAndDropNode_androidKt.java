package androidx.compose.foundation.content.internal;

import android.view.DragEvent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.platform.ClipEntry;
import p0.a;
import q0.l;

/* loaded from: classes4.dex */
public final class ReceiveContentDragAndDropNode_androidKt {
    public static final DragAndDropNode a(final DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration, final l lVar) {
        return DragAndDropNodeKt.b(ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$1.f2901a, new DragAndDropTarget() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void D0(DragAndDropEvent dragAndDropEvent) {
                dynamicReceiveContentConfiguration.a().a();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void O(DragAndDropEvent dragAndDropEvent) {
                dynamicReceiveContentConfiguration.a().c();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final boolean O0(DragAndDropEvent dragAndDropEvent) {
                lVar.invoke(dragAndDropEvent);
                DragEvent dragEvent = dragAndDropEvent.f14771a;
                ClipEntry clipEntry = new ClipEntry(dragEvent.getClipData());
                dragEvent.getClipDescription();
                TransferableContent transferableContent = new TransferableContent(clipEntry);
                return !a.g(transferableContent, dynamicReceiveContentConfiguration.a().e(transferableContent));
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void R1(DragAndDropEvent dragAndDropEvent) {
                dynamicReceiveContentConfiguration.a().b();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void a0(DragAndDropEvent dragAndDropEvent) {
                dynamicReceiveContentConfiguration.a().d();
            }
        });
    }
}
