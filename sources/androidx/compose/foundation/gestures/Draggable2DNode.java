package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import d0.b0;
import h0.g;
import kotlin.jvm.internal.e;
import p0.a;
import q0.l;
import q0.p;
import q0.q;

@StabilityInferred
/* loaded from: classes4.dex */
public final class Draggable2DNode extends DragGestureNode {
    public boolean A;
    public q B;
    public l C;
    public q D;
    public l E;

    /* renamed from: y, reason: collision with root package name */
    public Draggable2DState f3344y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3345z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Draggable2DNode(l lVar, int i2) {
        super(lVar, false, null, null);
        q qVar = (i2 & 64) != 0 ? Draggable2DKt.f3339a : null;
        l lVar2 = (i2 & 128) != 0 ? Draggable2DKt.f3340b : null;
        q qVar2 = (i2 & 256) != 0 ? Draggable2DKt.f3341c : null;
        l lVar3 = (i2 & 512) != 0 ? Draggable2DKt.d : null;
        this.f3344y = null;
        this.f3345z = false;
        this.A = false;
        this.B = qVar;
        this.C = lVar2;
        this.D = qVar2;
        this.E = lVar3;
    }

    public static void q2(Draggable2DNode draggable2DNode, l lVar, int i2) {
        boolean z2;
        q qVar = (i2 & 64) != 0 ? draggable2DNode.B : null;
        q qVar2 = (i2 & 128) != 0 ? draggable2DNode.D : null;
        l lVar2 = (i2 & 256) != 0 ? draggable2DNode.C : null;
        l lVar3 = (i2 & 512) != 0 ? draggable2DNode.E : null;
        boolean z3 = true;
        if (a.g(draggable2DNode.f3344y, null)) {
            z2 = false;
        } else {
            draggable2DNode.f3344y = null;
            z2 = true;
        }
        if (draggable2DNode.A) {
            draggable2DNode.A = false;
        } else {
            z3 = z2;
        }
        draggable2DNode.B = qVar;
        draggable2DNode.D = qVar2;
        draggable2DNode.C = lVar2;
        draggable2DNode.E = lVar3;
        draggable2DNode.f3345z = false;
        draggable2DNode.p2(lVar, false, null, null, z3);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object l2(p pVar, g gVar) {
        Object a2 = this.f3344y.a(new Draggable2DNode$drag$2(pVar, this, null), gVar);
        return a2 == i0.a.f30806a ? a2 : b0.f30125a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void m2(long j2) {
        this.C.invoke(new Offset(j2));
        if (!this.f14699n || this.B == Draggable2DKt.f3339a) {
            return;
        }
        e.v(S1(), null, 0, new Draggable2DNode$onDragStarted$1(this, j2, null), 3);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void n2(long j2) {
        this.E.invoke(new Velocity(j2));
        if (!this.f14699n || this.D == Draggable2DKt.f3341c) {
            return;
        }
        e.v(S1(), null, 0, new Draggable2DNode$onDragStopped$1(this, j2, null), 3);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean o2() {
        return this.f3345z;
    }
}
