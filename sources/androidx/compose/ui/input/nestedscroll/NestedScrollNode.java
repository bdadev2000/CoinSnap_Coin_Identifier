package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import b1.d0;

@StabilityInferred
/* loaded from: classes3.dex */
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {

    /* renamed from: o, reason: collision with root package name */
    public NestedScrollConnection f15531o;

    /* renamed from: p, reason: collision with root package name */
    public NestedScrollDispatcher f15532p;

    /* renamed from: q, reason: collision with root package name */
    public final String f15533q;

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.f15531o = nestedScrollConnection;
        this.f15532p = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.f15533q = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long E0(int i2, long j2, long j3) {
        long E0 = this.f15531o.E0(i2, j2, j3);
        boolean z2 = this.f14699n;
        NestedScrollNode nestedScrollNode = null;
        if (z2 && z2) {
            nestedScrollNode = (NestedScrollNode) TraversableNodeKt.b(this);
        }
        NestedScrollNode nestedScrollNode2 = nestedScrollNode;
        return Offset.k(E0, nestedScrollNode2 != null ? nestedScrollNode2.E0(i2, Offset.k(j2, E0), Offset.j(j3, E0)) : 0L);
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object Q() {
        return this.f15533q;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object W0(long r10, h0.g r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.f15542f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15542f = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f15541c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f15542f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            long r10 = r0.f15540b
            kotlin.jvm.internal.q.m(r12)
            goto L7d
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            long r10 = r0.f15540b
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r2 = r0.f15539a
            kotlin.jvm.internal.q.m(r12)
            goto L5e
        L3d:
            kotlin.jvm.internal.q.m(r12)
            boolean r12 = r9.f14699n
            if (r12 == 0) goto L4d
            if (r12 == 0) goto L4d
            androidx.compose.ui.node.TraversableNode r12 = androidx.compose.ui.node.TraversableNodeKt.b(r9)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r12 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r12
            goto L4e
        L4d:
            r12 = r3
        L4e:
            if (r12 == 0) goto L66
            r0.f15539a = r9
            r0.f15540b = r10
            r0.f15542f = r5
            java.lang.Object r12 = r12.W0(r10, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            r2 = r9
        L5e:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.ui.unit.Velocity) r12
            long r5 = r12.f17502a
        L62:
            r7 = r10
            r10 = r5
            r5 = r7
            goto L6a
        L66:
            r5 = 0
            r2 = r9
            goto L62
        L6a:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r12 = r2.f15531o
            long r5 = androidx.compose.ui.unit.Velocity.d(r5, r10)
            r0.f15539a = r3
            r0.f15540b = r10
            r0.f15542f = r4
            java.lang.Object r12 = r12.W0(r5, r0)
            if (r12 != r1) goto L7d
            return r1
        L7d:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.ui.unit.Velocity) r12
            long r0 = r12.f17502a
            long r10 = androidx.compose.ui.unit.Velocity.e(r10, r0)
            androidx.compose.ui.unit.Velocity r12 = new androidx.compose.ui.unit.Velocity
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.W0(long, h0.g):java.lang.Object");
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        NestedScrollDispatcher nestedScrollDispatcher = this.f15532p;
        nestedScrollDispatcher.f15519a = this;
        nestedScrollDispatcher.f15520b = new NestedScrollNode$updateDispatcherFields$1(this);
        nestedScrollDispatcher.f15521c = S1();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        NestedScrollDispatcher nestedScrollDispatcher = this.f15532p;
        if (nestedScrollDispatcher.f15519a == this) {
            nestedScrollDispatcher.f15519a = null;
        }
    }

    public final d0 e2() {
        NestedScrollNode nestedScrollNode = this.f14699n ? (NestedScrollNode) TraversableNodeKt.b(this) : null;
        if (nestedScrollNode != null) {
            return nestedScrollNode.e2();
        }
        d0 d0Var = this.f15532p.f15521c;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long g0(int i2, long j2) {
        boolean z2 = this.f14699n;
        NestedScrollNode nestedScrollNode = null;
        if (z2 && z2) {
            nestedScrollNode = (NestedScrollNode) TraversableNodeKt.b(this);
        }
        long g02 = nestedScrollNode != null ? nestedScrollNode.g0(i2, j2) : 0L;
        return Offset.k(g02, this.f15531o.g0(i2, Offset.j(j2, g02)));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h1(long r16, long r18, h0.g r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            if (r2 == 0) goto L16
            r2 = r1
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) r2
            int r3 = r2.f15538g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f15538g = r3
            goto L1b
        L16:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            r2.<init>(r15, r1)
        L1b:
            java.lang.Object r1 = r2.d
            i0.a r9 = i0.a.f30806a
            int r3 = r2.f15538g
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L44
            if (r3 == r4) goto L38
            if (r3 != r10) goto L30
            long r2 = r2.f15535b
            kotlin.jvm.internal.q.m(r1)
            goto L92
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            long r3 = r2.f15536c
            long r5 = r2.f15535b
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r7 = r2.f15534a
            kotlin.jvm.internal.q.m(r1)
            r13 = r3
            r11 = r5
            goto L62
        L44:
            kotlin.jvm.internal.q.m(r1)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r3 = r0.f15531o
            r2.f15534a = r0
            r11 = r16
            r2.f15535b = r11
            r13 = r18
            r2.f15536c = r13
            r2.f15538g = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.h1(r4, r6, r8)
            if (r1 != r9) goto L61
            return r9
        L61:
            r7 = r0
        L62:
            androidx.compose.ui.unit.Velocity r1 = (androidx.compose.ui.unit.Velocity) r1
            long r4 = r1.f17502a
            boolean r1 = r7.f14699n
            r3 = 0
            if (r1 == 0) goto L74
            if (r1 == 0) goto L74
            androidx.compose.ui.node.TraversableNode r1 = androidx.compose.ui.node.TraversableNodeKt.b(r7)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r1
            goto L75
        L74:
            r1 = r3
        L75:
            if (r1 == 0) goto L98
            long r6 = androidx.compose.ui.unit.Velocity.e(r11, r4)
            long r11 = androidx.compose.ui.unit.Velocity.d(r13, r4)
            r2.f15534a = r3
            r2.f15535b = r4
            r2.f15538g = r10
            r3 = r1
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.h1(r4, r6, r8)
            if (r1 != r9) goto L91
            return r9
        L91:
            r2 = r13
        L92:
            androidx.compose.ui.unit.Velocity r1 = (androidx.compose.ui.unit.Velocity) r1
            long r4 = r1.f17502a
            r13 = r2
            goto L9b
        L98:
            r13 = r4
            r4 = 0
        L9b:
            long r1 = androidx.compose.ui.unit.Velocity.e(r13, r4)
            androidx.compose.ui.unit.Velocity r3 = new androidx.compose.ui.unit.Velocity
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.h1(long, long, h0.g):java.lang.Object");
    }
}
