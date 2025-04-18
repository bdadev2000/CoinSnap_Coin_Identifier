package androidx.compose.foundation;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.TraversableNode;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {1133, 1136}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public PressInteraction.Press f2428a;

    /* renamed from: b, reason: collision with root package name */
    public int f2429b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractClickableNode f2430c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f2431f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(AbstractClickableNode abstractClickableNode, long j2, MutableInteractionSource mutableInteractionSource, g gVar) {
        super(2, gVar);
        this.f2430c = abstractClickableNode;
        this.d = j2;
        this.f2431f = mutableInteractionSource;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.f2430c, this.d, this.f2431f, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteraction$2$1$delayJob$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        NodeChain nodeChain;
        PressInteraction.Press press;
        a aVar = a.f30806a;
        int i2 = this.f2429b;
        AbstractClickableNode abstractClickableNode = this.f2430c;
        if (i2 == 0) {
            q.m(obj);
            abstractClickableNode.getClass();
            ?? obj2 = new Object();
            ScrollableContainerNode.TraverseKey traverseKey = ScrollableContainerNode.f3424p;
            ClickableKt$hasScrollableContainer$1 clickableKt$hasScrollableContainer$1 = new ClickableKt$hasScrollableContainer$1(obj2);
            Modifier.Node node = abstractClickableNode.f14688a;
            if (!node.f14699n) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node node2 = node.f14691f;
            LayoutNode f2 = DelegatableNodeKt.f(abstractClickableNode);
            loop0: while (f2 != null) {
                if ((f2.B.e.d & Opcodes.ASM4) != 0) {
                    while (node2 != null) {
                        if ((node2.f14690c & Opcodes.ASM4) != 0) {
                            DelegatingNode delegatingNode = node2;
                            ?? r13 = 0;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                    if (p0.a.g(traverseKey, traversableNode.Q()) && !((Boolean) clickableKt$hasScrollableContainer$1.invoke(traversableNode)).booleanValue()) {
                                        break loop0;
                                    }
                                } else if ((delegatingNode.f14690c & Opcodes.ASM4) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node node3 = delegatingNode.f15909p;
                                    int i3 = 0;
                                    delegatingNode = delegatingNode;
                                    r13 = r13;
                                    while (node3 != null) {
                                        if ((node3.f14690c & Opcodes.ASM4) != 0) {
                                            i3++;
                                            r13 = r13;
                                            if (i3 == 1) {
                                                delegatingNode = node3;
                                            } else {
                                                if (r13 == 0) {
                                                    r13 = new MutableVector(new Modifier.Node[16]);
                                                }
                                                if (delegatingNode != 0) {
                                                    r13.b(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r13.b(node3);
                                            }
                                        }
                                        node3 = node3.f14692g;
                                        delegatingNode = delegatingNode;
                                        r13 = r13;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.b(r13);
                            }
                        }
                        node2 = node2.f14691f;
                    }
                }
                f2 = f2.B();
                node2 = (f2 == null || (nodeChain = f2.B) == null) ? null : nodeChain.d;
            }
            if (!obj2.f30919a) {
                int i4 = Clickable_androidKt.f2656b;
                ViewParent parent = DelegatableNode_androidKt.a(abstractClickableNode).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
            }
            long j2 = Clickable_androidKt.f2655a;
            this.f2429b = 1;
            if (p0.a.L(j2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                press = this.f2428a;
                q.m(obj);
                abstractClickableNode.A = press;
                return b0.f30125a;
            }
            q.m(obj);
        }
        PressInteraction.Press press2 = new PressInteraction.Press(this.d);
        this.f2428a = press2;
        this.f2429b = 2;
        if (this.f2431f.a(press2, this) == aVar) {
            return aVar;
        }
        press = press2;
        abstractClickableNode.A = press;
        return b0.f30125a;
    }
}
