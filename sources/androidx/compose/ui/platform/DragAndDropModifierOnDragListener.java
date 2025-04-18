package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.ArraySet;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.node.ModifierNodeElement;
import java.util.Iterator;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DragAndDropModifierOnDragListener implements View.OnDragListener, DragAndDropManager {

    /* renamed from: a, reason: collision with root package name */
    public final q f16481a;

    /* renamed from: b, reason: collision with root package name */
    public final DragAndDropNode f16482b = new DragAndDropNode(DragAndDropModifierOnDragListener$rootDragAndDropNode$1.f16485a);

    /* renamed from: c, reason: collision with root package name */
    public final ArraySet f16483c = new ArraySet(0);
    public final DragAndDropModifierOnDragListener$modifier$1 d = new ModifierNodeElement<DragAndDropNode>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final Modifier.Node a() {
            return DragAndDropModifierOnDragListener.this.f16482b;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final /* bridge */ /* synthetic */ void b(Modifier.Node node) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return DragAndDropModifierOnDragListener.this.f16482b.hashCode();
        }
    };

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1] */
    public DragAndDropModifierOnDragListener(q qVar) {
        this.f16481a = qVar;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public final boolean a(DragAndDropModifierNode dragAndDropModifierNode) {
        return this.f16483c.contains(dragAndDropModifierNode);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public final void b(DragAndDropModifierNode dragAndDropModifierNode) {
        this.f16483c.add(dragAndDropModifierNode);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(dragEvent);
        int action = dragEvent.getAction();
        DragAndDropNode dragAndDropNode = this.f16482b;
        switch (action) {
            case 1:
                boolean e2 = dragAndDropNode.e2(dragAndDropEvent);
                Iterator<E> it = this.f16483c.iterator();
                while (it.hasNext()) {
                    ((DragAndDropModifierNode) it.next()).O(dragAndDropEvent);
                }
                return e2;
            case 2:
                dragAndDropNode.P(dragAndDropEvent);
                return false;
            case 3:
                return dragAndDropNode.O0(dragAndDropEvent);
            case 4:
                dragAndDropNode.R1(dragAndDropEvent);
                return false;
            case 5:
                dragAndDropNode.D0(dragAndDropEvent);
                return false;
            case 6:
                dragAndDropNode.a0(dragAndDropEvent);
                return false;
            default:
                return false;
        }
    }
}
