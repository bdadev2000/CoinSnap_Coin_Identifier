package androidx.compose.foundation.text.handwriting;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import q0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public class StylusHandwritingNode extends DelegatingNode implements PointerInputModifierNode, FocusEventModifierNode {

    /* renamed from: q, reason: collision with root package name */
    public a f6277q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6278r;

    /* renamed from: s, reason: collision with root package name */
    public final SuspendingPointerInputModifierNode f6279s;

    public StylusHandwritingNode(a aVar) {
        this.f6277q = aVar;
        SuspendingPointerInputModifierNodeImpl a2 = SuspendingPointerInputFilterKt.a(new StylusHandwritingNode$suspendingPointerInputModifierNode$1(this, null));
        e2(a2);
        this.f6279s = a2;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void e0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.f6279s.e0(pointerEvent, pointerEventPass, j2);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void m1() {
        this.f6279s.m1();
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void v(FocusStateImpl focusStateImpl) {
        this.f6278r = focusStateImpl.a();
    }
}
