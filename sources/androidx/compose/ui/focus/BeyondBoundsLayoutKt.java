package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeyondBoundsLayout.kt */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0006¢\u0006\u0002\b\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"searchBeyondBounds", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/focus/FocusTargetNode;", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class BeyondBoundsLayoutKt {
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m4182searchBeyondBoundsOMvw8(FocusTargetNode focusTargetNode, int i, Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> function1) {
        Modifier.Node node;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        int m5837getBeforehoxUOeE;
        NodeChain nodes;
        FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m6086constructorimpl = NodeKind.m6086constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = focusTargetNode2.getNode().getParent();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        loop0: while (true) {
            if (requireLayoutNode == null) {
                node = null;
                break;
            }
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m6086constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m6086constructorimpl) != 0) {
                        node = parent;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((node.getKindSet() & m6086constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m6086constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(node);
                                                }
                                                node = null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        FocusTargetNode focusTargetNode3 = (FocusTargetNode) node;
        if ((focusTargetNode3 != null && Intrinsics.areEqual(focusTargetNode3.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) || (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) == null) {
            return null;
        }
        if (FocusDirection.m4186equalsimpl0(i, FocusDirection.INSTANCE.m4199getUpdhqQ8s())) {
            m5837getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m5835getAbovehoxUOeE();
        } else if (FocusDirection.m4186equalsimpl0(i, FocusDirection.INSTANCE.m4192getDowndhqQ8s())) {
            m5837getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m5838getBelowhoxUOeE();
        } else if (FocusDirection.m4186equalsimpl0(i, FocusDirection.INSTANCE.m4195getLeftdhqQ8s())) {
            m5837getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m5839getLefthoxUOeE();
        } else if (FocusDirection.m4186equalsimpl0(i, FocusDirection.INSTANCE.m4198getRightdhqQ8s())) {
            m5837getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m5840getRighthoxUOeE();
        } else if (FocusDirection.m4186equalsimpl0(i, FocusDirection.INSTANCE.m4196getNextdhqQ8s())) {
            m5837getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m5836getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m4186equalsimpl0(i, FocusDirection.INSTANCE.m4197getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            m5837getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m5837getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent.mo1138layouto7g1Pn8(m5837getBeforehoxUOeE, function1);
    }
}
