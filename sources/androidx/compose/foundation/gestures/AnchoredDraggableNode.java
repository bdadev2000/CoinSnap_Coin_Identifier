package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import h0.g;
import i0.a;
import kotlin.jvm.internal.e;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AnchoredDraggableNode<T> extends DragGestureNode {
    public Boolean A;
    public OverscrollEffect B;
    public boolean C;

    /* renamed from: y, reason: collision with root package name */
    public AnchoredDraggableState f3046y;

    /* renamed from: z, reason: collision with root package name */
    public Orientation f3047z;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object l2(p pVar, g gVar) {
        AnchoredDraggableState anchoredDraggableState = this.f3046y;
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(pVar, this, null);
        MutatePriority mutatePriority = MutatePriority.f2811a;
        anchoredDraggableState.getClass();
        Object b2 = anchoredDraggableState.f3064f.b(mutatePriority, new AnchoredDraggableState$anchoredDrag$2(anchoredDraggableState, null, anchoredDraggableNode$drag$2), gVar);
        a aVar = a.f30806a;
        b0 b0Var = b0.f30125a;
        if (b2 != aVar) {
            b2 = b0Var;
        }
        return b2 == aVar ? b2 : b0Var;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void m2(long j2) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void n2(long j2) {
        if (this.f14699n) {
            e.v(S1(), null, 0, new AnchoredDraggableNode$onDragStopped$1(this, j2, null), 3);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean o2() {
        return this.C;
    }

    public final boolean q2() {
        Boolean bool = this.A;
        if (bool == null) {
            return DelegatableNodeKt.f(this).f15960v == LayoutDirection.f17495b && this.f3047z == Orientation.f3395b;
        }
        p0.a.p(bool);
        return bool.booleanValue();
    }
}
