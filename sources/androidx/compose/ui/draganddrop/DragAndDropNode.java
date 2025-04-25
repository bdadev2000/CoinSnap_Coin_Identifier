package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: DragAndDropNode.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B*\u0012#\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J;\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00160\u0005¢\u0006\u0002\b\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010!\u001a\u00020\u0016H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "onDragAndDropStart", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/ParameterName;", "name", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "(Lkotlin/jvm/functions/Function1;)V", "lastChildDragAndDropModifierNode", "thisDragAndDropTarget", "traverseKey", "", "getTraverseKey", "()Ljava/lang/Object;", "acceptDragAndDropTransfer", "", "startEvent", "drag", "", "transferData", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "decorationSize", "Landroidx/compose/ui/geometry/Size;", "drawDragDecoration", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "drag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)V", "onChanged", "onDetach", "onDrop", "onEnded", "onEntered", "onExited", "onMoved", "onStarted", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode {
    private DragAndDropModifierNode lastChildDragAndDropModifierNode;
    private final Function1<DragAndDropEvent, DragAndDropTarget> onDragAndDropStart;
    private DragAndDropTarget thisDragAndDropTarget;
    private final Object traverseKey = Companion.DragAndDropTraversableKey.INSTANCE;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode(Function1<? super DragAndDropEvent, ? extends DragAndDropTarget> function1) {
        this.onDragAndDropStart = function1;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    /* renamed from: drag-12SF9DM */
    public void mo4146drag12SF9DM(DragAndDropTransferData transferData, long decorationSize, Function1<? super DrawScope, Unit> drawDragDecoration) {
        DelegatableNodeKt.requireOwner(this).getDragAndDropManager().mo4145drag12SF9DM(transferData, decorationSize, drawDragDecoration);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    public boolean acceptDragAndDropTransfer(final DragAndDropEvent startEvent) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                DragAndDropTarget dragAndDropTarget;
                Function1 function1;
                DragAndDropTarget dragAndDropTarget2;
                if (dragAndDropNode.getIsAttached()) {
                    dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
                    boolean z = true;
                    if (!(dragAndDropTarget == null)) {
                        InlineClassHelperKt.throwIllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                    }
                    function1 = dragAndDropNode.onDragAndDropStart;
                    dragAndDropNode.thisDragAndDropTarget = (DragAndDropTarget) function1.invoke(DragAndDropEvent.this);
                    dragAndDropTarget2 = dragAndDropNode.thisDragAndDropTarget;
                    boolean z2 = dragAndDropTarget2 != null;
                    if (z2) {
                        DelegatableNodeKt.requireOwner(this).getDragAndDropManager().registerNodeInterest(dragAndDropNode);
                    }
                    Ref.BooleanRef booleanRef2 = booleanRef;
                    if (!booleanRef2.element && !z2) {
                        z = false;
                    }
                    booleanRef2.element = z;
                    return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            }
        });
        return booleanRef.element;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onStarted(DragAndDropEvent event) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget == null) {
            DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
            if (dragAndDropModifierNode != null) {
                dragAndDropModifierNode.onStarted(event);
                return;
            }
            return;
        }
        dragAndDropTarget.onStarted(event);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEntered(DragAndDropEvent event) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget == null) {
            DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
            if (dragAndDropModifierNode != null) {
                dragAndDropModifierNode.onEntered(event);
                return;
            }
            return;
        }
        dragAndDropTarget.onEntered(event);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMoved(final androidx.compose.ui.draganddrop.DragAndDropEvent r5) {
        /*
            r4 = this;
            androidx.compose.ui.draganddrop.DragAndDropModifierNode r0 = r4.lastChildDragAndDropModifierNode
            if (r0 == 0) goto L11
            long r1 = androidx.compose.ui.draganddrop.DragAndDrop_androidKt.getPositionInRoot(r5)
            boolean r1 = androidx.compose.ui.draganddrop.DragAndDropNodeKt.m4147access$containsUv8p0NA(r0, r1)
            r2 = 1
            if (r1 != r2) goto L11
            r1 = r0
            goto L35
        L11:
            r1 = r4
            androidx.compose.ui.node.TraversableNode r1 = (androidx.compose.ui.node.TraversableNode) r1
            androidx.compose.ui.Modifier$Node r2 = r1.getNode()
            boolean r2 = r2.getIsAttached()
            if (r2 != 0) goto L20
            r1 = 0
            goto L33
        L20:
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1 r3 = new androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
            r3.<init>()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            androidx.compose.ui.node.TraversableNodeKt.traverseDescendants(r1, r3)
            T r1 = r2.element
            androidx.compose.ui.node.TraversableNode r1 = (androidx.compose.ui.node.TraversableNode) r1
        L33:
            androidx.compose.ui.draganddrop.DragAndDropModifierNode r1 = (androidx.compose.ui.draganddrop.DragAndDropModifierNode) r1
        L35:
            if (r1 == 0) goto L47
            if (r0 != 0) goto L47
            r0 = r1
            androidx.compose.ui.draganddrop.DragAndDropTarget r0 = (androidx.compose.ui.draganddrop.DragAndDropTarget) r0
            androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(r0, r5)
            androidx.compose.ui.draganddrop.DragAndDropTarget r0 = r4.thisDragAndDropTarget
            if (r0 == 0) goto L77
            r0.onExited(r5)
            goto L77
        L47:
            if (r1 != 0) goto L56
            if (r0 == 0) goto L56
            androidx.compose.ui.draganddrop.DragAndDropTarget r2 = r4.thisDragAndDropTarget
            if (r2 == 0) goto L52
            androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(r2, r5)
        L52:
            r0.onExited(r5)
            goto L77
        L56:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r2 != 0) goto L6a
            if (r1 == 0) goto L64
            r2 = r1
            androidx.compose.ui.draganddrop.DragAndDropTarget r2 = (androidx.compose.ui.draganddrop.DragAndDropTarget) r2
            androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(r2, r5)
        L64:
            if (r0 == 0) goto L77
            r0.onExited(r5)
            goto L77
        L6a:
            if (r1 == 0) goto L70
            r1.onMoved(r5)
            goto L77
        L70:
            androidx.compose.ui.draganddrop.DragAndDropTarget r0 = r4.thisDragAndDropTarget
            if (r0 == 0) goto L77
            r0.onMoved(r5)
        L77:
            r4.lastChildDragAndDropModifierNode = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draganddrop.DragAndDropNode.onMoved(androidx.compose.ui.draganddrop.DragAndDropEvent):void");
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onChanged(DragAndDropEvent event) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget == null) {
            DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
            if (dragAndDropModifierNode != null) {
                dragAndDropModifierNode.onChanged(event);
                return;
            }
            return;
        }
        dragAndDropTarget.onChanged(event);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onExited(DragAndDropEvent event) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onExited(event);
        }
        DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropModifierNode != null) {
            dragAndDropModifierNode.onExited(event);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public boolean onDrop(DragAndDropEvent event) {
        DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropModifierNode == null) {
            DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                return dragAndDropTarget.onDrop(event);
            }
            return false;
        }
        return dragAndDropModifierNode.onDrop(event);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEnded(final DragAndDropEvent event) {
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onEnded$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                DragAndDropTarget dragAndDropTarget;
                if (dragAndDropNode.getNode().getIsAttached()) {
                    dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
                    if (dragAndDropTarget != null) {
                        dragAndDropTarget.onEnded(DragAndDropEvent.this);
                    }
                    dragAndDropNode.thisDragAndDropTarget = null;
                    dragAndDropNode.lastChildDragAndDropModifierNode = null;
                    return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            }
        });
    }
}
