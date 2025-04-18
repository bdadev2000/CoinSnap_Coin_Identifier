package androidx.compose.foundation.gestures;

import android.support.v4.media.d;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;
import q0.q;

@StabilityInferred
/* loaded from: classes2.dex */
public final class DraggableElement extends ModifierNodeElement<DraggableNode> {

    /* renamed from: a, reason: collision with root package name */
    public final DraggableState f3357a;

    /* renamed from: b, reason: collision with root package name */
    public final Orientation f3358b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3359c;
    public final MutableInteractionSource d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3360f;

    /* renamed from: g, reason: collision with root package name */
    public final q f3361g;

    /* renamed from: h, reason: collision with root package name */
    public final q f3362h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3363i;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public DraggableElement(DraggableState draggableState, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, q qVar, q qVar2, boolean z4) {
        this.f3357a = draggableState;
        this.f3358b = orientation;
        this.f3359c = z2;
        this.d = mutableInteractionSource;
        this.f3360f = z3;
        this.f3361g = qVar;
        this.f3362h = qVar2;
        this.f3363i = z4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.foundation.gestures.DraggableNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        DraggableElement$Companion$CanDrag$1 draggableElement$Companion$CanDrag$1 = DraggableElement$Companion$CanDrag$1.f3364a;
        boolean z2 = this.f3359c;
        MutableInteractionSource mutableInteractionSource = this.d;
        Orientation orientation = this.f3358b;
        ?? dragGestureNode = new DragGestureNode(draggableElement$Companion$CanDrag$1, z2, mutableInteractionSource, orientation);
        dragGestureNode.f3368y = this.f3357a;
        dragGestureNode.f3369z = orientation;
        dragGestureNode.A = this.f3360f;
        dragGestureNode.B = this.f3361g;
        dragGestureNode.C = this.f3362h;
        dragGestureNode.D = this.f3363i;
        return dragGestureNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        boolean z2;
        boolean z3;
        DraggableNode draggableNode = (DraggableNode) node;
        DraggableElement$Companion$CanDrag$1 draggableElement$Companion$CanDrag$1 = DraggableElement$Companion$CanDrag$1.f3364a;
        Orientation orientation = this.f3358b;
        boolean z4 = this.f3359c;
        MutableInteractionSource mutableInteractionSource = this.d;
        DraggableState draggableState = draggableNode.f3368y;
        DraggableState draggableState2 = this.f3357a;
        if (a.g(draggableState, draggableState2)) {
            z2 = false;
        } else {
            draggableNode.f3368y = draggableState2;
            z2 = true;
        }
        if (draggableNode.f3369z != orientation) {
            draggableNode.f3369z = orientation;
            z2 = true;
        }
        boolean z5 = draggableNode.D;
        boolean z6 = this.f3363i;
        if (z5 != z6) {
            draggableNode.D = z6;
            z3 = true;
        } else {
            z3 = z2;
        }
        draggableNode.B = this.f3361g;
        draggableNode.C = this.f3362h;
        draggableNode.A = this.f3360f;
        draggableNode.p2(draggableElement$Companion$CanDrag$1, z4, mutableInteractionSource, orientation, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return a.g(this.f3357a, draggableElement.f3357a) && this.f3358b == draggableElement.f3358b && this.f3359c == draggableElement.f3359c && a.g(this.d, draggableElement.d) && this.f3360f == draggableElement.f3360f && a.g(this.f3361g, draggableElement.f3361g) && a.g(this.f3362h, draggableElement.f3362h) && this.f3363i == draggableElement.f3363i;
    }

    public final int hashCode() {
        int g2 = d.g(this.f3359c, (this.f3358b.hashCode() + (this.f3357a.hashCode() * 31)) * 31, 31);
        MutableInteractionSource mutableInteractionSource = this.d;
        return Boolean.hashCode(this.f3363i) + ((this.f3362h.hashCode() + ((this.f3361g.hashCode() + d.g(this.f3360f, (g2 + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31, 31)) * 31)) * 31);
    }
}
