package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.HashSet;

@StabilityInferred
/* loaded from: classes2.dex */
public final class NodeChain {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f16088a;

    /* renamed from: b, reason: collision with root package name */
    public final InnerNodeCoordinator f16089b;

    /* renamed from: c, reason: collision with root package name */
    public NodeCoordinator f16090c;
    public final TailModifierNode d;
    public Modifier.Node e;

    /* renamed from: f, reason: collision with root package name */
    public MutableVector f16091f;

    /* renamed from: g, reason: collision with root package name */
    public MutableVector f16092g;

    /* renamed from: h, reason: collision with root package name */
    public Differ f16093h;

    /* loaded from: classes2.dex */
    public final class Differ implements DiffCallback {

        /* renamed from: a, reason: collision with root package name */
        public Modifier.Node f16094a;

        /* renamed from: b, reason: collision with root package name */
        public int f16095b;

        /* renamed from: c, reason: collision with root package name */
        public MutableVector f16096c;
        public MutableVector d;
        public boolean e;

        public Differ(Modifier.Node node, int i2, MutableVector mutableVector, MutableVector mutableVector2, boolean z2) {
            this.f16094a = node;
            this.f16095b = i2;
            this.f16096c = mutableVector;
            this.d = mutableVector2;
            this.e = z2;
        }

        public final boolean a(int i2, int i3) {
            MutableVector mutableVector = this.f16096c;
            int i4 = this.f16095b;
            Modifier.Element element = (Modifier.Element) mutableVector.f14142a[i2 + i4];
            Modifier.Element element2 = (Modifier.Element) this.d.f14142a[i4 + i3];
            NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1 = NodeChainKt.f16098a;
            return p0.a.g(element, element2) || Actual_jvmKt.a(element, element2);
        }

        public final void b(int i2) {
            int i3 = this.f16095b + i2;
            Modifier.Node node = this.f16094a;
            Modifier.Element element = (Modifier.Element) this.d.f14142a[i3];
            NodeChain nodeChain = NodeChain.this;
            nodeChain.getClass();
            Modifier.Node b2 = NodeChain.b(element, node);
            this.f16094a = b2;
            if (!this.e) {
                b2.f14695j = true;
                return;
            }
            Modifier.Node node2 = b2.f14692g;
            p0.a.p(node2);
            NodeCoordinator nodeCoordinator = node2.f14694i;
            p0.a.p(nodeCoordinator);
            LayoutModifierNode c2 = DelegatableNodeKt.c(this.f16094a);
            if (c2 != null) {
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(nodeChain.f16088a, c2);
                this.f16094a.d2(layoutModifierNodeCoordinator);
                NodeChain.a(nodeChain, this.f16094a, layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.f16104q = nodeCoordinator.f16104q;
                layoutModifierNodeCoordinator.f16103p = nodeCoordinator;
                nodeCoordinator.f16104q = layoutModifierNodeCoordinator;
            } else {
                this.f16094a.d2(nodeCoordinator);
            }
            this.f16094a.U1();
            this.f16094a.a2();
            NodeKindKt.a(this.f16094a);
        }

        public final void c() {
            Modifier.Node node = this.f16094a.f14692g;
            p0.a.p(node);
            NodeChain nodeChain = NodeChain.this;
            nodeChain.getClass();
            if ((node.f14690c & 2) != 0) {
                NodeCoordinator nodeCoordinator = node.f14694i;
                p0.a.p(nodeCoordinator);
                NodeCoordinator nodeCoordinator2 = nodeCoordinator.f16104q;
                NodeCoordinator nodeCoordinator3 = nodeCoordinator.f16103p;
                p0.a.p(nodeCoordinator3);
                if (nodeCoordinator2 != null) {
                    nodeCoordinator2.f16103p = nodeCoordinator3;
                }
                nodeCoordinator3.f16104q = nodeCoordinator2;
                NodeChain.a(nodeChain, this.f16094a, nodeCoordinator3);
            }
            this.f16094a = NodeChain.c(node);
        }

        public final void d(int i2, int i3) {
            Modifier.Node node = this.f16094a.f14692g;
            p0.a.p(node);
            this.f16094a = node;
            MutableVector mutableVector = this.f16096c;
            int i4 = this.f16095b;
            Modifier.Element element = (Modifier.Element) mutableVector.f14142a[i2 + i4];
            Modifier.Element element2 = (Modifier.Element) this.d.f14142a[i4 + i3];
            boolean g2 = p0.a.g(element, element2);
            NodeChain nodeChain = NodeChain.this;
            if (g2) {
                nodeChain.getClass();
                return;
            }
            Modifier.Node node2 = this.f16094a;
            nodeChain.getClass();
            NodeChain.h(element, element2, node2);
        }
    }

    /* loaded from: classes2.dex */
    public interface Logger {
    }

    public NodeChain(LayoutNode layoutNode) {
        this.f16088a = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.f16089b = innerNodeCoordinator;
        this.f16090c = innerNodeCoordinator;
        TailModifierNode tailModifierNode = innerNodeCoordinator.N;
        this.d = tailModifierNode;
        this.e = tailModifierNode;
    }

    public static final void a(NodeChain nodeChain, Modifier.Node node, NodeCoordinator nodeCoordinator) {
        nodeChain.getClass();
        for (Modifier.Node node2 = node.f14691f; node2 != null; node2 = node2.f14691f) {
            if (node2 == NodeChainKt.f16098a) {
                LayoutNode B = nodeChain.f16088a.B();
                nodeCoordinator.f16104q = B != null ? B.B.f16089b : null;
                nodeChain.f16090c = nodeCoordinator;
                return;
            } else {
                if ((node2.f14690c & 2) != 0) {
                    return;
                }
                node2.d2(nodeCoordinator);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.BackwardsCompatNode, androidx.compose.ui.Modifier$Node] */
    public static Modifier.Node b(Modifier.Element element, Modifier.Node node) {
        Modifier.Node node2;
        if (element instanceof ModifierNodeElement) {
            node2 = ((ModifierNodeElement) element).a();
            node2.f14690c = NodeKindKt.g(node2);
        } else {
            ?? node3 = new Modifier.Node();
            node3.f14690c = NodeKindKt.e(element);
            node3.f15880o = element;
            node3.f15881p = true;
            node3.f15883r = new HashSet();
            node2 = node3;
        }
        if (!(!node2.f14699n)) {
            InlineClassHelperKt.b("A ModifierNodeElement cannot return an already attached node from create() ");
            throw null;
        }
        node2.f14695j = true;
        Modifier.Node node4 = node.f14692g;
        if (node4 != null) {
            node4.f14691f = node2;
            node2.f14692g = node4;
        }
        node.f14692g = node2;
        node2.f14691f = node;
        return node2;
    }

    public static Modifier.Node c(Modifier.Node node) {
        boolean z2 = node.f14699n;
        if (z2) {
            MutableObjectIntMap mutableObjectIntMap = NodeKindKt.f16140a;
            if (!z2) {
                InlineClassHelperKt.b("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
            NodeKindKt.b(node, -1, 2);
            node.b2();
            node.V1();
        }
        Modifier.Node node2 = node.f14692g;
        Modifier.Node node3 = node.f14691f;
        if (node2 != null) {
            node2.f14691f = node3;
            node.f14692g = null;
        }
        if (node3 != null) {
            node3.f14692g = node2;
            node.f14691f = null;
        }
        p0.a.p(node3);
        return node3;
    }

    public static void h(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1 = NodeChainKt.f16098a;
            p0.a.q(node, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((ModifierNodeElement) element2).b(node);
            if (node.f14699n) {
                NodeKindKt.d(node);
                return;
            } else {
                node.f14696k = true;
                return;
            }
        }
        if (!(node instanceof BackwardsCompatNode)) {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
        BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) node;
        if (backwardsCompatNode.f14699n) {
            backwardsCompatNode.f2();
        }
        backwardsCompatNode.f15880o = element2;
        backwardsCompatNode.f14690c = NodeKindKt.e(element2);
        if (backwardsCompatNode.f14699n) {
            backwardsCompatNode.e2(false);
        }
        if (node.f14699n) {
            NodeKindKt.d(node);
        } else {
            node.f14696k = true;
        }
    }

    public final boolean d(int i2) {
        return (i2 & this.e.d) != 0;
    }

    public final void e() {
        for (Modifier.Node node = this.e; node != null; node = node.f14692g) {
            node.a2();
            if (node.f14695j) {
                NodeKindKt.a(node);
            }
            if (node.f14696k) {
                NodeKindKt.d(node);
            }
            node.f14695j = false;
            node.f14696k = false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v1 ??, still in use, count: 1, list:
          (r11v1 ?? I:androidx.compose.ui.node.NodeChain$Differ) from 0x001e: IPUT 
          (r11v1 ?? I:androidx.compose.ui.node.NodeChain$Differ)
          (r29v0 'this' ?? I:androidx.compose.ui.node.NodeChain A[IMMUTABLE_TYPE, THIS])
         androidx.compose.ui.node.NodeChain.h androidx.compose.ui.node.NodeChain$Differ
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public final void f(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v1 ??, still in use, count: 1, list:
          (r11v1 ?? I:androidx.compose.ui.node.NodeChain$Differ) from 0x001e: IPUT 
          (r11v1 ?? I:androidx.compose.ui.node.NodeChain$Differ)
          (r29v0 'this' ?? I:androidx.compose.ui.node.NodeChain A[IMMUTABLE_TYPE, THIS])
         androidx.compose.ui.node.NodeChain.h androidx.compose.ui.node.NodeChain$Differ
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final void g() {
        LayoutNode layoutNode;
        LayoutModifierNodeCoordinator layoutModifierNodeCoordinator;
        Modifier.Node node = this.d.f14691f;
        NodeCoordinator nodeCoordinator = this.f16089b;
        Modifier.Node node2 = node;
        while (true) {
            layoutNode = this.f16088a;
            if (node2 == null) {
                break;
            }
            LayoutModifierNode c2 = DelegatableNodeKt.c(node2);
            if (c2 != null) {
                NodeCoordinator nodeCoordinator2 = node2.f14694i;
                if (nodeCoordinator2 != null) {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator2 = (LayoutModifierNodeCoordinator) nodeCoordinator2;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator2.N;
                    layoutModifierNodeCoordinator2.Z1(c2);
                    layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                    if (layoutModifierNode != node2) {
                        OwnedLayer ownedLayer = layoutModifierNodeCoordinator2.G;
                        layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                        if (ownedLayer != null) {
                            ownedLayer.invalidate();
                            layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                        }
                    }
                } else {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator3 = new LayoutModifierNodeCoordinator(layoutNode, c2);
                    node2.d2(layoutModifierNodeCoordinator3);
                    layoutModifierNodeCoordinator = layoutModifierNodeCoordinator3;
                }
                nodeCoordinator.f16104q = layoutModifierNodeCoordinator;
                layoutModifierNodeCoordinator.f16103p = nodeCoordinator;
                nodeCoordinator = layoutModifierNodeCoordinator;
            } else {
                node2.d2(nodeCoordinator);
            }
            node2 = node2.f14691f;
        }
        LayoutNode B = layoutNode.B();
        nodeCoordinator.f16104q = B != null ? B.B.f16089b : null;
        this.f16090c = nodeCoordinator;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Modifier.Node node = this.e;
        TailModifierNode tailModifierNode = this.d;
        if (node != tailModifierNode) {
            while (true) {
                if (node == null || node == tailModifierNode) {
                    break;
                }
                sb.append(String.valueOf(node));
                if (node.f14692g == tailModifierNode) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                node = node.f14692g;
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        p0.a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
