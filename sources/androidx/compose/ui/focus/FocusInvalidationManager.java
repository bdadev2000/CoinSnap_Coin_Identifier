package androidx.compose.ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: FocusInvalidationManager.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000eJ%\u0010\u0013\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00150\t2\u0006\u0010\u0014\u001a\u0002H\u0015H\u0002¢\u0006\u0002\u0010\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "invalidateOwnerFocusState", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "focusEventNodes", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "focusPropertiesNodes", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "focusTargetNodes", "Landroidx/compose/ui/focus/FocusTargetNode;", "focusTargetsWithInvalidatedFocusEvents", "hasPendingInvalidation", "", "invalidateNodes", "scheduleInvalidation", "node", ExifInterface.GPS_DIRECTION_TRUE, "(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;
    private final Function0<Unit> invalidateOwnerFocusState;
    private final Function1<Function0<Unit>, Unit> onRequestApplyChangesListener;
    private final MutableScatterSet<FocusTargetNode> focusTargetNodes = ScatterSetKt.mutableScatterSetOf();
    private final MutableScatterSet<FocusEventModifierNode> focusEventNodes = ScatterSetKt.mutableScatterSetOf();
    private final MutableScatterSet<FocusPropertiesModifierNode> focusPropertiesNodes = ScatterSetKt.mutableScatterSetOf();
    private final MutableScatterSet<FocusTargetNode> focusTargetsWithInvalidatedFocusEvents = ScatterSetKt.mutableScatterSetOf();

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(Function1<? super Function0<Unit>, Unit> function1, Function0<Unit> function0) {
        this.onRequestApplyChangesListener = function1;
        this.invalidateOwnerFocusState = function0;
    }

    public final void scheduleInvalidation(FocusTargetNode node) {
        scheduleInvalidation(this.focusTargetNodes, node);
    }

    public final void scheduleInvalidation(FocusEventModifierNode node) {
        scheduleInvalidation(this.focusEventNodes, node);
    }

    public final void scheduleInvalidation(FocusPropertiesModifierNode node) {
        scheduleInvalidation(this.focusPropertiesNodes, node);
    }

    public final boolean hasPendingInvalidation() {
        return this.focusTargetNodes.isNotEmpty() || this.focusPropertiesNodes.isNotEmpty() || this.focusEventNodes.isNotEmpty();
    }

    private final <T> void scheduleInvalidation(MutableScatterSet<T> mutableScatterSet, T t) {
        if (mutableScatterSet.add(t) && this.focusTargetNodes.get_size() + this.focusEventNodes.get_size() + this.focusPropertiesNodes.get_size() == 1) {
            this.onRequestApplyChangesListener.invoke(new FocusInvalidationManager$scheduleInvalidation$1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateNodes() {
        int i;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        FocusStateImpl focusStateImpl;
        FocusStateImpl focusStateImpl2;
        MutableVector mutableVector;
        int i2;
        MutableVector mutableVector2;
        int i3;
        long[] jArr3;
        Object[] objArr3;
        boolean z;
        Object[] objArr4;
        boolean z2;
        int i4;
        MutableVector mutableVector3;
        long[] jArr4;
        long[] jArr5;
        int i5;
        long[] jArr6;
        long[] jArr7;
        MutableScatterSet<FocusPropertiesModifierNode> mutableScatterSet = this.focusPropertiesNodes;
        Object[] objArr5 = mutableScatterSet.elements;
        long[] jArr8 = mutableScatterSet.metadata;
        int length = jArr8.length - 2;
        char c = 7;
        long j = -9187201950435737472L;
        int i6 = 8;
        int i7 = 1;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j2 = jArr8[i8];
                if ((((~j2) << c) & j2 & j) != j) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j2 & 255) < 128) {
                            FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) objArr5[(i8 << 3) + i10];
                            if (focusPropertiesModifierNode.getNode().getIsAttached()) {
                                FocusPropertiesModifierNode focusPropertiesModifierNode2 = focusPropertiesModifierNode;
                                int m6086constructorimpl = NodeKind.m6086constructorimpl(1024);
                                Modifier.Node node = focusPropertiesModifierNode2.getNode();
                                MutableVector mutableVector4 = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        this.focusTargetNodes.add((FocusTargetNode) node);
                                    } else if ((node.getKindSet() & m6086constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                        Modifier.Node delegate = ((DelegatingNode) node).getDelegate();
                                        int i11 = 0;
                                        while (delegate != null) {
                                            if ((delegate.getKindSet() & m6086constructorimpl) != 0) {
                                                i11++;
                                                if (i11 == i7) {
                                                    jArr7 = jArr8;
                                                    node = delegate;
                                                } else {
                                                    if (mutableVector4 == null) {
                                                        jArr7 = jArr8;
                                                        mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                                    } else {
                                                        jArr7 = jArr8;
                                                    }
                                                    if (node != null) {
                                                        if (mutableVector4 != null) {
                                                            Boolean.valueOf(mutableVector4.add(node));
                                                        }
                                                        node = null;
                                                    }
                                                    if (mutableVector4 != null) {
                                                        Boolean.valueOf(mutableVector4.add(delegate));
                                                    }
                                                }
                                            } else {
                                                jArr7 = jArr8;
                                            }
                                            delegate = delegate.getChild();
                                            jArr8 = jArr7;
                                            i7 = 1;
                                        }
                                        jArr6 = jArr8;
                                        int i12 = i7;
                                        if (i11 == i12) {
                                            i7 = i12;
                                            jArr8 = jArr6;
                                        }
                                        node = DelegatableNodeKt.pop(mutableVector4);
                                        jArr8 = jArr6;
                                        i7 = 1;
                                    }
                                    jArr6 = jArr8;
                                    node = DelegatableNodeKt.pop(mutableVector4);
                                    jArr8 = jArr6;
                                    i7 = 1;
                                }
                                jArr5 = jArr8;
                                if (!focusPropertiesModifierNode2.getNode().getIsAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                }
                                MutableVector mutableVector5 = new MutableVector(new Modifier.Node[16], 0);
                                Modifier.Node child = focusPropertiesModifierNode2.getNode().getChild();
                                if (child == null) {
                                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, focusPropertiesModifierNode2.getNode());
                                } else {
                                    mutableVector5.add(child);
                                }
                                while (mutableVector5.isNotEmpty()) {
                                    Modifier.Node node2 = (Modifier.Node) mutableVector5.removeAt(mutableVector5.getSize() - 1);
                                    if ((node2.getAggregateChildKindSet() & m6086constructorimpl) == 0) {
                                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, node2);
                                    } else {
                                        while (true) {
                                            if (node2 == null) {
                                                break;
                                            }
                                            if ((node2.getKindSet() & m6086constructorimpl) != 0) {
                                                MutableVector mutableVector6 = null;
                                                while (node2 != null) {
                                                    if (node2 instanceof FocusTargetNode) {
                                                        this.focusTargetNodes.add((FocusTargetNode) node2);
                                                    } else if ((node2.getKindSet() & m6086constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                                        int i13 = 0;
                                                        for (Modifier.Node delegate2 = ((DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                                            if ((delegate2.getKindSet() & m6086constructorimpl) != 0) {
                                                                i13++;
                                                                if (i13 == 1) {
                                                                    node2 = delegate2;
                                                                } else {
                                                                    if (mutableVector6 == null) {
                                                                        mutableVector6 = new MutableVector(new Modifier.Node[16], 0);
                                                                    }
                                                                    if (node2 != null) {
                                                                        if (mutableVector6 != null) {
                                                                            Boolean.valueOf(mutableVector6.add(node2));
                                                                        }
                                                                        node2 = null;
                                                                    }
                                                                    if (mutableVector6 != null) {
                                                                        Boolean.valueOf(mutableVector6.add(delegate2));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (i13 == 1) {
                                                        }
                                                    }
                                                    node2 = DelegatableNodeKt.pop(mutableVector6);
                                                }
                                            } else {
                                                node2 = node2.getChild();
                                            }
                                        }
                                    }
                                }
                            } else {
                                jArr5 = jArr8;
                            }
                            i5 = 8;
                        } else {
                            jArr5 = jArr8;
                            i5 = i6;
                        }
                        j2 >>= i5;
                        i10++;
                        i6 = i5;
                        jArr8 = jArr5;
                        i7 = 1;
                    }
                    jArr4 = jArr8;
                    if (i9 != i6) {
                        break;
                    }
                } else {
                    jArr4 = jArr8;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                jArr8 = jArr4;
                c = 7;
                j = -9187201950435737472L;
                i7 = 1;
                i6 = 8;
            }
        }
        this.focusPropertiesNodes.clear();
        MutableScatterSet<FocusEventModifierNode> mutableScatterSet2 = this.focusEventNodes;
        Object[] objArr6 = mutableScatterSet2.elements;
        long[] jArr9 = mutableScatterSet2.metadata;
        int length2 = jArr9.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j3 = jArr9[i14];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j3 & 255) < 128) {
                            FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) objArr6[(i14 << 3) + i16];
                            if (focusEventModifierNode.getNode().getIsAttached()) {
                                FocusEventModifierNode focusEventModifierNode2 = focusEventModifierNode;
                                int m6086constructorimpl2 = NodeKind.m6086constructorimpl(1024);
                                Modifier.Node node3 = focusEventModifierNode2.getNode();
                                boolean z3 = false;
                                boolean z4 = true;
                                FocusTargetNode focusTargetNode = null;
                                MutableVector mutableVector7 = null;
                                while (node3 != null) {
                                    if (node3 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node3;
                                        if (focusTargetNode != null) {
                                            z3 = true;
                                        }
                                        if (this.focusTargetNodes.contains(focusTargetNode2)) {
                                            this.focusTargetsWithInvalidatedFocusEvents.add(focusTargetNode2);
                                            z4 = false;
                                        }
                                        jArr3 = jArr9;
                                        objArr3 = objArr6;
                                        focusTargetNode = focusTargetNode2;
                                    } else {
                                        if ((node3.getKindSet() & m6086constructorimpl2) == 0 || !(node3 instanceof DelegatingNode)) {
                                            jArr3 = jArr9;
                                            objArr3 = objArr6;
                                            z = z3;
                                        } else {
                                            Modifier.Node delegate3 = ((DelegatingNode) node3).getDelegate();
                                            jArr3 = jArr9;
                                            int i17 = 0;
                                            while (delegate3 != null) {
                                                if ((delegate3.getKindSet() & m6086constructorimpl2) != 0) {
                                                    i17++;
                                                    objArr4 = objArr6;
                                                    if (i17 == 1) {
                                                        node3 = delegate3;
                                                    } else {
                                                        if (mutableVector7 == null) {
                                                            i4 = i17;
                                                            z2 = z3;
                                                            mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                        } else {
                                                            i4 = i17;
                                                            z2 = z3;
                                                            mutableVector3 = mutableVector7;
                                                        }
                                                        if (node3 != null) {
                                                            if (mutableVector3 != null) {
                                                                Boolean.valueOf(mutableVector3.add(node3));
                                                            }
                                                            node3 = null;
                                                        }
                                                        if (mutableVector3 != null) {
                                                            Boolean.valueOf(mutableVector3.add(delegate3));
                                                        }
                                                        mutableVector7 = mutableVector3;
                                                        i17 = i4;
                                                        delegate3 = delegate3.getChild();
                                                        objArr6 = objArr4;
                                                        z3 = z2;
                                                    }
                                                } else {
                                                    objArr4 = objArr6;
                                                }
                                                z2 = z3;
                                                delegate3 = delegate3.getChild();
                                                objArr6 = objArr4;
                                                z3 = z2;
                                            }
                                            objArr3 = objArr6;
                                            z = z3;
                                            if (i17 == 1) {
                                                jArr9 = jArr3;
                                                objArr6 = objArr3;
                                                z3 = z;
                                            }
                                        }
                                        z3 = z;
                                    }
                                    node3 = DelegatableNodeKt.pop(mutableVector7);
                                    jArr9 = jArr3;
                                    objArr6 = objArr3;
                                }
                                jArr2 = jArr9;
                                objArr2 = objArr6;
                                boolean z5 = z3;
                                if (!focusEventModifierNode2.getNode().getIsAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                }
                                MutableVector mutableVector8 = new MutableVector(new Modifier.Node[16], 0);
                                Modifier.Node child2 = focusEventModifierNode2.getNode().getChild();
                                if (child2 == null) {
                                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector8, focusEventModifierNode2.getNode());
                                } else {
                                    mutableVector8.add(child2);
                                }
                                boolean z6 = z5;
                                while (mutableVector8.isNotEmpty()) {
                                    Modifier.Node node4 = (Modifier.Node) mutableVector8.removeAt(mutableVector8.getSize() - 1);
                                    if ((node4.getAggregateChildKindSet() & m6086constructorimpl2) == 0) {
                                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector8, node4);
                                    } else {
                                        while (node4 != null) {
                                            if ((node4.getKindSet() & m6086constructorimpl2) != 0) {
                                                MutableVector mutableVector9 = null;
                                                while (node4 != null) {
                                                    if (node4 instanceof FocusTargetNode) {
                                                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) node4;
                                                        if (focusTargetNode != null) {
                                                            z6 = true;
                                                        }
                                                        if (this.focusTargetNodes.contains(focusTargetNode3)) {
                                                            this.focusTargetsWithInvalidatedFocusEvents.add(focusTargetNode3);
                                                            z4 = false;
                                                        }
                                                        mutableVector = mutableVector8;
                                                        focusTargetNode = focusTargetNode3;
                                                    } else if ((node4.getKindSet() & m6086constructorimpl2) == 0 || !(node4 instanceof DelegatingNode)) {
                                                        mutableVector = mutableVector8;
                                                    } else {
                                                        Modifier.Node delegate4 = ((DelegatingNode) node4).getDelegate();
                                                        int i18 = 0;
                                                        while (delegate4 != null) {
                                                            if ((delegate4.getKindSet() & m6086constructorimpl2) != 0) {
                                                                i18++;
                                                                mutableVector2 = mutableVector8;
                                                                if (i18 == 1) {
                                                                    node4 = delegate4;
                                                                } else {
                                                                    if (mutableVector9 == null) {
                                                                        i3 = m6086constructorimpl2;
                                                                        mutableVector9 = new MutableVector(new Modifier.Node[16], 0);
                                                                    } else {
                                                                        i3 = m6086constructorimpl2;
                                                                    }
                                                                    if (node4 != null) {
                                                                        if (mutableVector9 != null) {
                                                                            Boolean.valueOf(mutableVector9.add(node4));
                                                                        }
                                                                        node4 = null;
                                                                    }
                                                                    if (mutableVector9 != null) {
                                                                        Boolean.valueOf(mutableVector9.add(delegate4));
                                                                    }
                                                                    delegate4 = delegate4.getChild();
                                                                    m6086constructorimpl2 = i3;
                                                                    mutableVector8 = mutableVector2;
                                                                }
                                                            } else {
                                                                mutableVector2 = mutableVector8;
                                                            }
                                                            i3 = m6086constructorimpl2;
                                                            delegate4 = delegate4.getChild();
                                                            m6086constructorimpl2 = i3;
                                                            mutableVector8 = mutableVector2;
                                                        }
                                                        mutableVector = mutableVector8;
                                                        i2 = m6086constructorimpl2;
                                                        if (i18 == 1) {
                                                            m6086constructorimpl2 = i2;
                                                            mutableVector8 = mutableVector;
                                                        }
                                                        node4 = DelegatableNodeKt.pop(mutableVector9);
                                                        m6086constructorimpl2 = i2;
                                                        mutableVector8 = mutableVector;
                                                    }
                                                    i2 = m6086constructorimpl2;
                                                    node4 = DelegatableNodeKt.pop(mutableVector9);
                                                    m6086constructorimpl2 = i2;
                                                    mutableVector8 = mutableVector;
                                                }
                                            } else {
                                                node4 = node4.getChild();
                                                mutableVector8 = mutableVector8;
                                            }
                                        }
                                    }
                                    m6086constructorimpl2 = m6086constructorimpl2;
                                    mutableVector8 = mutableVector8;
                                }
                                if (z4) {
                                    if (z6) {
                                        focusStateImpl2 = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                                    } else {
                                        if (focusTargetNode == null || (focusStateImpl = focusTargetNode.getFocusState()) == null) {
                                            focusStateImpl = FocusStateImpl.Inactive;
                                        }
                                        focusStateImpl2 = focusStateImpl;
                                    }
                                    focusEventModifierNode.onFocusEvent(focusStateImpl2);
                                }
                                j3 >>= 8;
                                i16++;
                                jArr9 = jArr2;
                                objArr6 = objArr2;
                            } else {
                                focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                            }
                        }
                        jArr2 = jArr9;
                        objArr2 = objArr6;
                        j3 >>= 8;
                        i16++;
                        jArr9 = jArr2;
                        objArr6 = objArr2;
                    }
                    jArr = jArr9;
                    objArr = objArr6;
                    i = 0;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr9;
                    objArr = objArr6;
                    i = 0;
                }
                if (i14 == length2) {
                    break;
                }
                i14++;
                jArr9 = jArr;
                objArr6 = objArr;
            }
        } else {
            i = 0;
        }
        this.focusEventNodes.clear();
        MutableScatterSet<FocusTargetNode> mutableScatterSet3 = this.focusTargetNodes;
        Object[] objArr7 = mutableScatterSet3.elements;
        long[] jArr10 = mutableScatterSet3.metadata;
        int length3 = jArr10.length - 2;
        if (length3 >= 0) {
            int i19 = i;
            while (true) {
                long j4 = jArr10[i19];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i20 = 8 - ((~(i19 - length3)) >>> 31);
                    for (int i21 = i; i21 < i20; i21++) {
                        if ((j4 & 255) < 128) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr7[(i19 << 3) + i21];
                            if (focusTargetNode4.getIsAttached()) {
                                FocusStateImpl focusState = focusTargetNode4.getFocusState();
                                focusTargetNode4.invalidateFocus$ui_release();
                                if (focusState != focusTargetNode4.getFocusState() || this.focusTargetsWithInvalidatedFocusEvents.contains(focusTargetNode4)) {
                                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode4);
                                }
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i20 != 8) {
                        break;
                    }
                }
                if (i19 == length3) {
                    break;
                }
                i19++;
                i = 0;
            }
        }
        this.focusTargetNodes.clear();
        this.focusTargetsWithInvalidatedFocusEvents.clear();
        this.invalidateOwnerFocusState.invoke();
        if (!this.focusPropertiesNodes.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusProperties nodes");
        }
        if (!this.focusEventNodes.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusEvent nodes");
        }
        if (this.focusTargetNodes.isEmpty()) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusTarget nodes");
    }
}
