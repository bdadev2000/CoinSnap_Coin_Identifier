package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.Owner;
import org.objectweb.asm.Opcodes;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public boolean f14889o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14890p;

    /* renamed from: q, reason: collision with root package name */
    public FocusStateImpl f14891q;

    /* renamed from: r, reason: collision with root package name */
    public int f14892r;

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {

        /* renamed from: a, reason: collision with root package name */
        public static final FocusTargetElement f14893a = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final Modifier.Node a() {
            return new Modifier.Node();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final /* bridge */ /* synthetic */ void b(Modifier.Node node) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final boolean g2(FocusTargetNode focusTargetNode) {
        Modifier.Node node = focusTargetNode.f14688a;
        if (!node.f14699n) {
            InlineClassHelperKt.b("visitSubtreeIf called on an unattached node");
            throw null;
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16]);
        Modifier.Node node2 = node.f14692g;
        if (node2 == null) {
            DelegatableNodeKt.a(mutableVector, node);
        } else {
            mutableVector.b(node2);
        }
        while (mutableVector.m()) {
            Modifier.Node node3 = (Modifier.Node) mutableVector.o(mutableVector.f14144c - 1);
            if ((node3.d & 1024) != 0) {
                for (Modifier.Node node4 = node3; node4 != null; node4 = node4.f14692g) {
                    if ((node4.f14690c & 1024) != 0) {
                        MutableVector mutableVector2 = null;
                        Modifier.Node node5 = node4;
                        while (node5 != null) {
                            if (node5 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node5;
                                if (focusTargetNode2.f14891q != null) {
                                    int ordinal = focusTargetNode2.f2().ordinal();
                                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                        return true;
                                    }
                                    if (ordinal == 3) {
                                        return false;
                                    }
                                    throw new RuntimeException();
                                }
                            } else if ((node5.f14690c & 1024) != 0 && (node5 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node node6 = ((DelegatingNode) node5).f15909p; node6 != null; node6 = node6.f14692g) {
                                    if ((node6.f14690c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node5 = node6;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (node5 != null) {
                                                mutableVector2.b(node5);
                                                node5 = null;
                                            }
                                            mutableVector2.b(node6);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node5 = DelegatableNodeKt.b(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.a(mutableVector, node3);
        }
        return false;
    }

    public static final boolean h2(FocusTargetNode focusTargetNode) {
        NodeChain nodeChain;
        Modifier.Node node = focusTargetNode.f14688a;
        if (!node.f14699n) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node2 = node.f14691f;
        LayoutNode f2 = DelegatableNodeKt.f(focusTargetNode);
        while (f2 != null) {
            if ((f2.B.e.d & 1024) != 0) {
                while (node2 != null) {
                    if ((node2.f14690c & 1024) != 0) {
                        Modifier.Node node3 = node2;
                        MutableVector mutableVector = null;
                        while (node3 != null) {
                            if (node3 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node3;
                                if (focusTargetNode2.f14891q != null) {
                                    int ordinal = focusTargetNode2.f2().ordinal();
                                    if (ordinal == 0) {
                                        return false;
                                    }
                                    if (ordinal == 1) {
                                        return true;
                                    }
                                    if (ordinal == 2 || ordinal == 3) {
                                        return false;
                                    }
                                    throw new RuntimeException();
                                }
                            } else if ((node3.f14690c & 1024) != 0 && (node3 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node node4 = ((DelegatingNode) node3).f15909p; node4 != null; node4 = node4.f14692g) {
                                    if ((node4.f14690c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node3 = node4;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (node3 != null) {
                                                mutableVector.b(node3);
                                                node3 = null;
                                            }
                                            mutableVector.b(node4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.b(mutableVector);
                        }
                    }
                    node2 = node2.f14691f;
                }
            }
            f2 = f2.B();
            node2 = (f2 == null || (nodeChain = f2.B) == null) ? null : nodeChain.d;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void C0() {
        FocusStateImpl f2 = f2();
        i2();
        if (f2 != f2()) {
            FocusEventModifierNodeKt.b(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 != 2) goto L19;
     */
    @Override // androidx.compose.ui.Modifier.Node
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X1() {
        /*
            r4 = this;
            androidx.compose.ui.focus.FocusStateImpl r0 = r4.f2()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 == r1) goto L11
            r2 = 2
            if (r0 == r2) goto L36
            goto L4f
        L11:
            androidx.compose.ui.node.Owner r0 = androidx.compose.ui.node.DelegatableNodeKt.g(r4)
            androidx.compose.ui.focus.FocusOwner r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.FocusTransactionManager r0 = r0.c()
            boolean r2 = r0.f14898c     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            androidx.compose.ui.focus.FocusTransactionManager.a(r0)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r1 = move-exception
            goto L32
        L27:
            r0.f14898c = r1     // Catch: java.lang.Throwable -> L25
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.f14888c     // Catch: java.lang.Throwable -> L25
            r4.j2(r1)     // Catch: java.lang.Throwable -> L25
            androidx.compose.ui.focus.FocusTransactionManager.b(r0)
            goto L4f
        L32:
            androidx.compose.ui.focus.FocusTransactionManager.b(r0)
            throw r1
        L36:
            androidx.compose.ui.node.Owner r0 = androidx.compose.ui.node.DelegatableNodeKt.g(r4)
            androidx.compose.ui.focus.FocusOwner r0 = r0.getFocusOwner()
            r2 = 0
            r3 = 8
            r0.o(r3, r1, r2)
            androidx.compose.ui.node.Owner r0 = androidx.compose.ui.node.DelegatableNodeKt.g(r4)
            androidx.compose.ui.focus.FocusOwner r0 = r0.getFocusOwner()
            r0.h(r4)
        L4f:
            r0 = 0
            r4.f14891q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.X1():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.focus.FocusPropertiesImpl, androidx.compose.ui.focus.FocusProperties, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.compose.ui.focus.FocusPropertiesModifierNode] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.runtime.collection.MutableVector] */
    public final FocusPropertiesImpl e2() {
        NodeChain nodeChain;
        ?? obj = new Object();
        obj.f14859a = true;
        FocusRequester focusRequester = FocusRequester.f14872b;
        obj.f14860b = focusRequester;
        obj.f14861c = focusRequester;
        obj.d = focusRequester;
        obj.e = focusRequester;
        obj.f14862f = focusRequester;
        obj.f14863g = focusRequester;
        obj.f14864h = focusRequester;
        obj.f14865i = focusRequester;
        obj.f14866j = FocusPropertiesImpl$enter$1.f14868a;
        obj.f14867k = FocusPropertiesImpl$exit$1.f14869a;
        Modifier.Node node = this.f14688a;
        if (!node.f14699n) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        LayoutNode f2 = DelegatableNodeKt.f(this);
        Modifier.Node node2 = node;
        loop0: while (f2 != null) {
            if ((f2.B.e.d & 3072) != 0) {
                while (node2 != null) {
                    int i2 = node2.f14690c;
                    if ((i2 & 3072) != 0) {
                        if (node2 != node && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & Opcodes.ACC_STRICT) != 0) {
                            DelegatingNode delegatingNode = node2;
                            ?? r7 = 0;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof FocusPropertiesModifierNode) {
                                    ((FocusPropertiesModifierNode) delegatingNode).e1(obj);
                                } else if ((delegatingNode.f14690c & Opcodes.ACC_STRICT) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node node3 = delegatingNode.f15909p;
                                    int i3 = 0;
                                    delegatingNode = delegatingNode;
                                    r7 = r7;
                                    while (node3 != null) {
                                        if ((node3.f14690c & Opcodes.ACC_STRICT) != 0) {
                                            i3++;
                                            r7 = r7;
                                            if (i3 == 1) {
                                                delegatingNode = node3;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new MutableVector(new Modifier.Node[16]);
                                                }
                                                if (delegatingNode != 0) {
                                                    r7.b(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r7.b(node3);
                                            }
                                        }
                                        node3 = node3.f14692g;
                                        delegatingNode = delegatingNode;
                                        r7 = r7;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.b(r7);
                            }
                        }
                    }
                    node2 = node2.f14691f;
                }
            }
            f2 = f2.B();
            node2 = (f2 == null || (nodeChain = f2.B) == null) ? null : nodeChain.d;
        }
        return obj;
    }

    public final FocusStateImpl f2() {
        FocusStateImpl focusStateImpl;
        LayoutNode layoutNode;
        Owner owner;
        FocusOwner focusOwner;
        NodeCoordinator nodeCoordinator = this.f14688a.f14694i;
        FocusTransactionManager c2 = (nodeCoordinator == null || (layoutNode = nodeCoordinator.f16100m) == null || (owner = layoutNode.f15950l) == null || (focusOwner = owner.getFocusOwner()) == null) ? null : focusOwner.c();
        if (c2 != null && (focusStateImpl = (FocusStateImpl) c2.f14896a.c(this)) != null) {
            return focusStateImpl;
        }
        FocusStateImpl focusStateImpl2 = this.f14891q;
        return focusStateImpl2 == null ? FocusStateImpl.f14888c : focusStateImpl2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    public final void i2() {
        FocusStateImpl focusStateImpl = this.f14891q;
        if (focusStateImpl == null) {
            if (!(!(focusStateImpl != null))) {
                throw new IllegalStateException("Re-initializing focus target node.".toString());
            }
            FocusTransactionManager c2 = DelegatableNodeKt.g(this).getFocusOwner().c();
            try {
                if (c2.f14898c) {
                    FocusTransactionManager.a(c2);
                }
                c2.f14898c = true;
                j2((h2(this) && g2(this)) ? FocusStateImpl.f14887b : FocusStateImpl.f14888c);
                FocusTransactionManager.b(c2);
            } catch (Throwable th) {
                FocusTransactionManager.b(c2);
                throw th;
            }
        }
        int ordinal = f2().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            ?? obj = new Object();
            ObserverModifierNodeKt.a(this, new FocusTargetNode$invalidateFocus$1(obj, this));
            Object obj2 = obj.f30930a;
            if (obj2 == null) {
                a.B0("focusProperties");
                throw null;
            }
            if (((FocusProperties) obj2).c()) {
                return;
            }
            DelegatableNodeKt.g(this).getFocusOwner().q(true);
        }
    }

    public final void j2(FocusStateImpl focusStateImpl) {
        DelegatableNodeKt.g(this).getFocusOwner().c().f14896a.k(this, focusStateImpl);
    }
}
