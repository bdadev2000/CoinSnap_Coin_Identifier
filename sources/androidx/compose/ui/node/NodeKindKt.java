package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.semantics.SemanticsModifier;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public final class NodeKindKt {

    /* renamed from: a, reason: collision with root package name */
    public static final MutableObjectIntMap f16140a;

    static {
        MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.f1548a;
        f16140a = new MutableObjectIntMap();
    }

    public static final void a(Modifier.Node node) {
        if (node.f14699n) {
            b(node, -1, 1);
        } else {
            InlineClassHelperKt.b("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    public static final void b(Modifier.Node node, int i2, int i3) {
        if (!(node instanceof DelegatingNode)) {
            c(node, i2 & node.f14690c, i3);
            return;
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        c(node, delegatingNode.f15908o & i2, i3);
        int i4 = (~delegatingNode.f15908o) & i2;
        for (Modifier.Node node2 = delegatingNode.f15909p; node2 != null; node2 = node2.f14692g) {
            b(node2, i4, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(Modifier.Node node, int i2, int i3) {
        if (i3 != 0 || node.T1()) {
            if ((i2 & 2) != 0 && (node instanceof LayoutModifierNode)) {
                DelegatableNodeKt.f((LayoutModifierNode) node).J();
                if (i3 == 2) {
                    NodeCoordinator d = DelegatableNodeKt.d(node, 2);
                    d.f16105r = true;
                    ((NodeCoordinator$invalidateParentLayer$1) d.E).invoke();
                    if (d.G != null) {
                        if (d.H != null) {
                            d.H = null;
                        }
                        d.W1(false, null);
                        d.f16100m.a0(false);
                    }
                }
            }
            if ((i2 & 128) != 0 && (node instanceof LayoutAwareModifierNode) && i3 != 2) {
                DelegatableNodeKt.f(node).J();
            }
            if ((i2 & 256) != 0 && (node instanceof GlobalPositionAwareModifierNode) && i3 != 2) {
                LayoutNode f2 = DelegatableNodeKt.f(node);
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = f2.C;
                if (!layoutNodeLayoutDelegate.e && !layoutNodeLayoutDelegate.d && !f2.K) {
                    LayoutNodeKt.a(f2).e(f2);
                }
            }
            if ((i2 & 4) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.a((DrawModifierNode) node);
            }
            if ((i2 & 8) != 0 && (node instanceof SemanticsModifierNode)) {
                DelegatableNodeKt.f((SemanticsModifierNode) node).K();
            }
            if ((i2 & 64) != 0 && (node instanceof ParentDataModifierNode)) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = DelegatableNodeKt.f((ParentDataModifierNode) node).C;
                layoutNodeLayoutDelegate2.f15995r.f16037r = true;
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate2.f15996s;
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.w = true;
                }
            }
            if ((i2 & 1024) != 0 && (node instanceof FocusTargetNode) && i3 != 2) {
                FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                DelegatableNodeKt.g(focusTargetNode).getFocusOwner().h(focusTargetNode);
            }
            if ((i2 & Opcodes.ACC_STRICT) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                CanFocusChecker.f15893b = null;
                focusPropertiesModifierNode.e1(CanFocusChecker.f15892a);
                if (CanFocusChecker.f15893b != null) {
                    if (i3 != 2) {
                        DelegatableNodeKt.g(focusPropertiesModifierNode).getFocusOwner().m(focusPropertiesModifierNode);
                    } else {
                        if (!focusPropertiesModifierNode.z0().f14699n) {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                        MutableVector mutableVector = new MutableVector(new Modifier.Node[16]);
                        Modifier.Node node2 = focusPropertiesModifierNode.z0().f14692g;
                        if (node2 == null) {
                            DelegatableNodeKt.a(mutableVector, focusPropertiesModifierNode.z0());
                        } else {
                            mutableVector.b(node2);
                        }
                        while (mutableVector.m()) {
                            Modifier.Node node3 = (Modifier.Node) mutableVector.o(mutableVector.f14144c - 1);
                            if ((node3.d & 1024) == 0) {
                                DelegatableNodeKt.a(mutableVector, node3);
                            } else {
                                while (true) {
                                    if (node3 == null) {
                                        break;
                                    }
                                    if ((node3.f14690c & 1024) != 0) {
                                        MutableVector mutableVector2 = null;
                                        while (node3 != null) {
                                            if (node3 instanceof FocusTargetNode) {
                                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node3;
                                                DelegatableNodeKt.g(focusTargetNode2).getFocusOwner().h(focusTargetNode2);
                                            } else if ((node3.f14690c & 1024) != 0 && (node3 instanceof DelegatingNode)) {
                                                int i4 = 0;
                                                for (Modifier.Node node4 = ((DelegatingNode) node3).f15909p; node4 != null; node4 = node4.f14692g) {
                                                    if ((node4.f14690c & 1024) != 0) {
                                                        i4++;
                                                        if (i4 == 1) {
                                                            node3 = node4;
                                                        } else {
                                                            if (mutableVector2 == null) {
                                                                mutableVector2 = new MutableVector(new Modifier.Node[16]);
                                                            }
                                                            if (node3 != null) {
                                                                mutableVector2.b(node3);
                                                                node3 = null;
                                                            }
                                                            mutableVector2.b(node4);
                                                        }
                                                    }
                                                }
                                                if (i4 == 1) {
                                                }
                                            }
                                            node3 = DelegatableNodeKt.b(mutableVector2);
                                        }
                                    } else {
                                        node3 = node3.f14692g;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if ((i2 & 4096) == 0 || !(node instanceof FocusEventModifierNode)) {
                return;
            }
            FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) node;
            DelegatableNodeKt.g(focusEventModifierNode).getFocusOwner().b(focusEventModifierNode);
        }
    }

    public static final void d(Modifier.Node node) {
        if (node.f14699n) {
            b(node, -1, 0);
        } else {
            InlineClassHelperKt.b("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    public static final int e(Modifier.Element element) {
        int i2 = element instanceof LayoutModifier ? 3 : 1;
        if (element instanceof DrawModifier) {
            i2 |= 4;
        }
        if (element instanceof SemanticsModifier) {
            i2 |= 8;
        }
        if (element instanceof PointerInputModifier) {
            i2 |= 16;
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            i2 |= 32;
        }
        if (element instanceof FocusEventModifier) {
            i2 |= 4096;
        }
        if (element instanceof FocusOrderModifier) {
            i2 |= Opcodes.ACC_STRICT;
        }
        if (element instanceof OnGloballyPositionedModifier) {
            i2 |= 256;
        }
        if (element instanceof ParentDataModifier) {
            i2 |= 64;
        }
        return ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) ? i2 | 128 : i2;
    }

    public static final int f(Modifier.Node node) {
        int i2 = node.f14690c;
        if (i2 != 0) {
            return i2;
        }
        Class<?> cls = node.getClass();
        MutableObjectIntMap mutableObjectIntMap = f16140a;
        int a2 = mutableObjectIntMap.a(cls);
        if (a2 >= 0) {
            return mutableObjectIntMap.f1547c[a2];
        }
        int i3 = node instanceof LayoutModifierNode ? 3 : 1;
        if (node instanceof DrawModifierNode) {
            i3 |= 4;
        }
        if (node instanceof SemanticsModifierNode) {
            i3 |= 8;
        }
        if (node instanceof PointerInputModifierNode) {
            i3 |= 16;
        }
        if (node instanceof ModifierLocalModifierNode) {
            i3 |= 32;
        }
        if (node instanceof ParentDataModifierNode) {
            i3 |= 64;
        }
        if (node instanceof LayoutAwareModifierNode) {
            i3 |= 128;
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            i3 |= 256;
        }
        if (node instanceof ApproachLayoutModifierNode) {
            i3 |= 512;
        }
        if (node instanceof FocusTargetNode) {
            i3 |= 1024;
        }
        if (node instanceof FocusPropertiesModifierNode) {
            i3 |= Opcodes.ACC_STRICT;
        }
        if (node instanceof FocusEventModifierNode) {
            i3 |= 4096;
        }
        if (node instanceof KeyInputModifierNode) {
            i3 |= 8192;
        }
        if (node instanceof RotaryInputModifierNode) {
            i3 |= 16384;
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            i3 |= 32768;
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            i3 |= Opcodes.ACC_DEPRECATED;
        }
        int i4 = node instanceof TraversableNode ? 262144 | i3 : i3;
        mutableObjectIntMap.g(cls, i4);
        return i4;
    }

    public static final int g(Modifier.Node node) {
        if (!(node instanceof DelegatingNode)) {
            return f(node);
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        int i2 = delegatingNode.f15908o;
        for (Modifier.Node node2 = delegatingNode.f15909p; node2 != null; node2 = node2.f14692g) {
            i2 |= g(node2);
        }
        return i2;
    }

    public static final boolean h(int i2) {
        return (i2 & 128) != 0;
    }
}
