package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.jvm.internal.e;

/* loaded from: classes4.dex */
final class HoverableNode extends Modifier.Node implements PointerInputModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public MutableInteractionSource f2728o;

    /* renamed from: p, reason: collision with root package name */
    public HoverInteraction.Enter f2729p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.foundation.interaction.Interaction, java.lang.Object, androidx.compose.foundation.interaction.HoverInteraction$Enter] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e2(androidx.compose.foundation.HoverableNode r4, h0.g r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof androidx.compose.foundation.HoverableNode$emitEnter$1
            if (r0 == 0) goto L16
            r0 = r5
            androidx.compose.foundation.HoverableNode$emitEnter$1 r0 = (androidx.compose.foundation.HoverableNode$emitEnter$1) r0
            int r1 = r0.f2733f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f2733f = r1
            goto L1b
        L16:
            androidx.compose.foundation.HoverableNode$emitEnter$1 r0 = new androidx.compose.foundation.HoverableNode$emitEnter$1
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f2732c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f2733f
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            androidx.compose.foundation.interaction.HoverInteraction$Enter r4 = r0.f2731b
            java.lang.Object r0 = r0.f2730a
            androidx.compose.foundation.HoverableNode r0 = (androidx.compose.foundation.HoverableNode) r0
            kotlin.jvm.internal.q.m(r5)
            r5 = r4
            r4 = r0
            goto L55
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.jvm.internal.q.m(r5)
            androidx.compose.foundation.interaction.HoverInteraction$Enter r5 = r4.f2729p
            if (r5 != 0) goto L57
            androidx.compose.foundation.interaction.HoverInteraction$Enter r5 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
            r5.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r4.f2728o
            r0.f2730a = r4
            r0.f2731b = r5
            r0.f2733f = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L55
            goto L59
        L55:
            r4.f2729p = r5
        L57:
            d0.b0 r1 = d0.b0.f30125a
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.e2(androidx.compose.foundation.HoverableNode, h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f2(androidx.compose.foundation.HoverableNode r4, h0.g r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof androidx.compose.foundation.HoverableNode$emitExit$1
            if (r0 == 0) goto L16
            r0 = r5
            androidx.compose.foundation.HoverableNode$emitExit$1 r0 = (androidx.compose.foundation.HoverableNode$emitExit$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            androidx.compose.foundation.HoverableNode$emitExit$1 r0 = new androidx.compose.foundation.HoverableNode$emitExit$1
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f2735b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f2734a
            androidx.compose.foundation.HoverableNode r4 = (androidx.compose.foundation.HoverableNode) r4
            kotlin.jvm.internal.q.m(r5)
            goto L4f
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.jvm.internal.q.m(r5)
            androidx.compose.foundation.interaction.HoverInteraction$Enter r5 = r4.f2729p
            if (r5 == 0) goto L52
            androidx.compose.foundation.interaction.HoverInteraction$Exit r2 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
            r2.<init>(r5)
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = r4.f2728o
            r0.f2734a = r4
            r0.d = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L4f
            goto L54
        L4f:
            r5 = 0
            r4.f2729p = r5
        L52:
            d0.b0 r1 = d0.b0.f30125a
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.f2(androidx.compose.foundation.HoverableNode, h0.g):java.lang.Object");
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        g2();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void e0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        if (pointerEventPass == PointerEventPass.f15573b) {
            int i2 = pointerEvent.d;
            if (PointerEventType.a(i2, 4)) {
                e.v(S1(), null, 0, new HoverableNode$onPointerEvent$1(this, null), 3);
            } else if (PointerEventType.a(i2, 5)) {
                e.v(S1(), null, 0, new HoverableNode$onPointerEvent$2(this, null), 3);
            }
        }
    }

    public final void g2() {
        HoverInteraction.Enter enter = this.f2729p;
        if (enter != null) {
            this.f2728o.b(new HoverInteraction.Exit(enter));
            this.f2729p = null;
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void m1() {
        g2();
    }
}
