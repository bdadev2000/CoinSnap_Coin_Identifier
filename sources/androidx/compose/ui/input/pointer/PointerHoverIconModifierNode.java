package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import d0.b0;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PointerHoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public PointerIcon f15577o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15578p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15579q;

    public PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z2) {
        this.f15577o = pointerIcon;
        this.f15578p = z2;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final /* bridge */ /* synthetic */ Object Q() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        g2();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void e0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        if (pointerEventPass == PointerEventPass.f15573b) {
            if (PointerEventType.a(pointerEvent.d, 4)) {
                this.f15579q = true;
                f2();
            } else if (PointerEventType.a(pointerEvent.d, 5)) {
                g2();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    public final void e2() {
        PointerIcon pointerIcon;
        ?? obj = new Object();
        TraversableNodeKt.c(this, new PointerHoverIconModifierNode$findOverridingAncestorNode$1(obj));
        PointerHoverIconModifierNode pointerHoverIconModifierNode = (PointerHoverIconModifierNode) obj.f30930a;
        if (pointerHoverIconModifierNode == null || (pointerIcon = pointerHoverIconModifierNode.f15577o) == null) {
            pointerIcon = this.f15577o;
        }
        PointerIconService pointerIconService = (PointerIconService) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.f16447s);
        if (pointerIconService != null) {
            pointerIconService.a(pointerIcon);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    public final void f2() {
        ?? obj = new Object();
        obj.f30919a = true;
        if (!this.f15578p) {
            TraversableNodeKt.d(this, new PointerHoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1(obj));
        }
        if (obj.f30919a) {
            e2();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    public final void g2() {
        b0 b0Var;
        PointerIconService pointerIconService;
        if (this.f15579q) {
            this.f15579q = false;
            if (this.f14699n) {
                ?? obj = new Object();
                TraversableNodeKt.c(this, new PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1(obj));
                PointerHoverIconModifierNode pointerHoverIconModifierNode = (PointerHoverIconModifierNode) obj.f30930a;
                if (pointerHoverIconModifierNode != null) {
                    pointerHoverIconModifierNode.e2();
                    b0Var = b0.f30125a;
                } else {
                    b0Var = null;
                }
                if (b0Var != null || (pointerIconService = (PointerIconService) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.f16447s)) == null) {
                    return;
                }
                pointerIconService.a(null);
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void m1() {
        g2();
    }
}
