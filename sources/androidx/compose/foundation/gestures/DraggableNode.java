package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import d0.b0;
import h0.g;
import i0.a;
import kotlin.jvm.internal.e;
import q0.p;
import q0.q;

@StabilityInferred
/* loaded from: classes.dex */
public final class DraggableNode extends DragGestureNode {
    public boolean A;
    public q B;
    public q C;
    public boolean D;

    /* renamed from: y, reason: collision with root package name */
    public DraggableState f3368y;

    /* renamed from: z, reason: collision with root package name */
    public Orientation f3369z;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object l2(p pVar, g gVar) {
        Object a2 = this.f3368y.a(new DraggableNode$drag$2(pVar, this, null), gVar);
        return a2 == a.f30806a ? a2 : b0.f30125a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void m2(long j2) {
        if (!this.f14699n || p0.a.g(this.B, DraggableKt.f3365a)) {
            return;
        }
        e.v(S1(), null, 0, new DraggableNode$onDragStarted$1(this, j2, null), 3);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void n2(long j2) {
        if (!this.f14699n || p0.a.g(this.C, DraggableKt.f3366b)) {
            return;
        }
        e.v(S1(), null, 0, new DraggableNode$onDragStopped$1(this, j2, null), 3);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean o2() {
        return this.A;
    }
}
