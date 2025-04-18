package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.IntSizeKt;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ClockDialNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode, LayoutAwareModifierNode {

    /* renamed from: q, reason: collision with root package name */
    public AnalogTimePickerState f8478q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8479r;

    /* renamed from: s, reason: collision with root package name */
    public int f8480s;

    /* renamed from: t, reason: collision with root package name */
    public float f8481t;

    /* renamed from: u, reason: collision with root package name */
    public float f8482u;

    /* renamed from: v, reason: collision with root package name */
    public long f8483v = 0;
    public final SuspendingPointerInputModifierNode w;
    public final SuspendingPointerInputModifierNode x;

    public ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z2, int i2) {
        this.f8478q = analogTimePickerState;
        this.f8479r = z2;
        this.f8480s = i2;
        SuspendingPointerInputModifierNodeImpl a2 = SuspendingPointerInputFilterKt.a(new ClockDialNode$pointerInputTapNode$1(this, null));
        e2(a2);
        this.w = a2;
        SuspendingPointerInputModifierNodeImpl a3 = SuspendingPointerInputFilterKt.a(new ClockDialNode$pointerInputDragNode$1(this, null));
        e2(a3);
        this.x = a3;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void e0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.w.e0(pointerEvent, pointerEventPass, j2);
        this.x.e0(pointerEvent, pointerEventPass, j2);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void m1() {
        this.w.m1();
        this.x.m1();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void n(long j2) {
        this.f8483v = IntSizeKt.b(j2);
    }
}
