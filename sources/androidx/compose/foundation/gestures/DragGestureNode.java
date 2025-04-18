package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import d1.f;
import h0.g;
import p0.a;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes.dex */
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {

    /* renamed from: q, reason: collision with root package name */
    public Orientation f3292q;

    /* renamed from: r, reason: collision with root package name */
    public l f3293r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3294s;

    /* renamed from: t, reason: collision with root package name */
    public MutableInteractionSource f3295t;

    /* renamed from: u, reason: collision with root package name */
    public f f3296u;

    /* renamed from: v, reason: collision with root package name */
    public DragInteraction.Start f3297v;
    public boolean w;
    public SuspendingPointerInputModifierNode x;

    public DragGestureNode(l lVar, boolean z2, MutableInteractionSource mutableInteractionSource, Orientation orientation) {
        this.f3292q = orientation;
        this.f3293r = lVar;
        this.f3294s = z2;
        this.f3295t = mutableInteractionSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h2(androidx.compose.foundation.gestures.DragGestureNode r5, h0.g r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            if (r0 == 0) goto L16
            r0 = r6
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f3318b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            androidx.compose.foundation.gestures.DragGestureNode r5 = r0.f3317a
            kotlin.jvm.internal.q.m(r6)
            goto L4f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.jvm.internal.q.m(r6)
            androidx.compose.foundation.interaction.DragInteraction$Start r6 = r5.f3297v
            if (r6 == 0) goto L52
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r5.f3295t
            if (r2 == 0) goto L4f
            androidx.compose.foundation.interaction.DragInteraction$Cancel r4 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r4.<init>(r6)
            r0.f3317a = r5
            r0.d = r3
            java.lang.Object r6 = r2.a(r4, r0)
            if (r6 != r1) goto L4f
            goto L59
        L4f:
            r6 = 0
            r5.f3297v = r6
        L52:
            r0 = 0
            r5.n2(r0)
            d0.b0 r1 = d0.b0.f30125a
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.h2(androidx.compose.foundation.gestures.DragGestureNode, h0.g):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.foundation.interaction.Interaction, androidx.compose.foundation.interaction.DragInteraction$Start, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i2(androidx.compose.foundation.gestures.DragGestureNode r6, androidx.compose.foundation.gestures.DragEvent.DragStarted r7, h0.g r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            if (r0 == 0) goto L16
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1) r0
            int r1 = r0.f3324g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f3324g = r1
            goto L1b
        L16:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.d
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f3324g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            androidx.compose.foundation.interaction.DragInteraction$Start r6 = r0.f3322c
            androidx.compose.foundation.gestures.DragEvent$DragStarted r7 = r0.f3321b
            androidx.compose.foundation.gestures.DragGestureNode r0 = r0.f3320a
            kotlin.jvm.internal.q.m(r8)
            goto L7a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            androidx.compose.foundation.gestures.DragEvent$DragStarted r7 = r0.f3321b
            androidx.compose.foundation.gestures.DragGestureNode r6 = r0.f3320a
            kotlin.jvm.internal.q.m(r8)
            goto L60
        L43:
            kotlin.jvm.internal.q.m(r8)
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = r6.f3297v
            if (r8 == 0) goto L60
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r6.f3295t
            if (r2 == 0) goto L60
            androidx.compose.foundation.interaction.DragInteraction$Cancel r5 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r5.<init>(r8)
            r0.f3320a = r6
            r0.f3321b = r7
            r0.f3324g = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L60
            goto L85
        L60:
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r8.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r6.f3295t
            if (r2 == 0) goto L7c
            r0.f3320a = r6
            r0.f3321b = r7
            r0.f3322c = r8
            r0.f3324g = r3
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 != r1) goto L78
            goto L85
        L78:
            r0 = r6
            r6 = r8
        L7a:
            r8 = r6
            r6 = r0
        L7c:
            r6.f3297v = r8
            long r7 = r7.f3172a
            r6.m2(r7)
            d0.b0 r1 = d0.b0.f30125a
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.i2(androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.foundation.gestures.DragEvent$DragStarted, h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j2(androidx.compose.foundation.gestures.DragGestureNode r5, androidx.compose.foundation.gestures.DragEvent.DragStopped r6, h0.g r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            if (r0 == 0) goto L16
            r0 = r7
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1) r0
            int r1 = r0.f3328f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f3328f = r1
            goto L1b
        L16:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f3327c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f3328f
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            androidx.compose.foundation.gestures.DragEvent$DragStopped r6 = r0.f3326b
            androidx.compose.foundation.gestures.DragGestureNode r5 = r0.f3325a
            kotlin.jvm.internal.q.m(r7)
            goto L53
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.jvm.internal.q.m(r7)
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = r5.f3297v
            if (r7 == 0) goto L56
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r5.f3295t
            if (r2 == 0) goto L53
            androidx.compose.foundation.interaction.DragInteraction$Stop r4 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r4.<init>(r7)
            r0.f3325a = r5
            r0.f3326b = r6
            r0.f3328f = r3
            java.lang.Object r7 = r2.a(r4, r0)
            if (r7 != r1) goto L53
            goto L5d
        L53:
            r7 = 0
            r5.f3297v = r7
        L56:
            long r6 = r6.f3173a
            r5.n2(r6)
            d0.b0 r1 = d0.b0.f30125a
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.j2(androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.foundation.gestures.DragEvent$DragStopped, h0.g):java.lang.Object");
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        this.w = false;
        k2();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void e0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        if (this.f3294s && this.x == null) {
            SuspendingPointerInputModifierNodeImpl a2 = SuspendingPointerInputFilterKt.a(new DragGestureNode$initializePointerInputNode$1(this, null));
            e2(a2);
            this.x = a2;
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.x;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.e0(pointerEvent, pointerEventPass, j2);
        }
    }

    public final void k2() {
        DragInteraction.Start start = this.f3297v;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.f3295t;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.b(new DragInteraction.Cancel(start));
            }
            this.f3297v = null;
        }
    }

    public abstract Object l2(p pVar, g gVar);

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void m1() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.x;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.m1();
        }
    }

    public abstract void m2(long j2);

    public abstract void n2(long j2);

    public abstract boolean o2();

    public final void p2(l lVar, boolean z2, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z3) {
        this.f3293r = lVar;
        if (this.f3294s != z2) {
            this.f3294s = z2;
            if (!z2) {
                k2();
                SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.x;
                if (suspendingPointerInputModifierNode != null) {
                    f2(suspendingPointerInputModifierNode);
                }
                this.x = null;
            }
            z3 = true;
        }
        if (!a.g(this.f3295t, mutableInteractionSource)) {
            k2();
            this.f3295t = mutableInteractionSource;
        }
        if (this.f3292q != orientation) {
            this.f3292q = orientation;
        } else if (!z3) {
            return;
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode2 = this.x;
        if (suspendingPointerInputModifierNode2 != null) {
            suspendingPointerInputModifierNode2.M0();
        }
    }
}
