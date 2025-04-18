package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.e;
import q0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PullToRefreshModifierNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, NestedScrollConnection {

    /* renamed from: q, reason: collision with root package name */
    public boolean f13168q;

    /* renamed from: r, reason: collision with root package name */
    public a f13169r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13170s;

    /* renamed from: t, reason: collision with root package name */
    public PullToRefreshState f13171t;

    /* renamed from: u, reason: collision with root package name */
    public float f13172u;

    /* renamed from: v, reason: collision with root package name */
    public final NestedScrollNode f13173v = new NestedScrollNode(this, null);
    public final ParcelableSnapshotMutableFloatState w = PrimitiveSnapshotStateKt.a(0.0f);
    public final ParcelableSnapshotMutableFloatState x = PrimitiveSnapshotStateKt.a(0.0f);

    public PullToRefreshModifierNode(boolean z2, a aVar, boolean z3, PullToRefreshState pullToRefreshState, float f2) {
        this.f13168q = z2;
        this.f13169r = aVar;
        this.f13170s = z3;
        this.f13171t = pullToRefreshState;
        this.f13172u = f2;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long E0(int i2, long j2, long j3) {
        if (this.f13171t.e() || !this.f13170s || !NestedScrollSource.a(i2, 1)) {
            return 0L;
        }
        long j22 = j2(j3);
        e.v(S1(), null, 0, new PullToRefreshModifierNode$onPostScroll$1(this, null), 3);
        return j22;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object W0(long r5, h0.g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1) r0
            int r1 = r0.f13186c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13186c = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f13184a
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f13186c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.jvm.internal.q.m(r7)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.jvm.internal.q.m(r7)
            float r5 = androidx.compose.ui.unit.Velocity.c(r5)
            r0.f13186c = r3
            java.lang.Object r7 = r4.l2(r5, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            r6 = 0
            long r5 = androidx.compose.ui.unit.VelocityKt.a(r6, r5)
            androidx.compose.ui.unit.Velocity r7 = new androidx.compose.ui.unit.Velocity
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.W0(long, h0.g):java.lang.Object");
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        e2(this.f13173v);
        e.v(S1(), null, 0, new PullToRefreshModifierNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long g0(int i2, long j2) {
        if (!this.f13171t.e() && this.f13170s && NestedScrollSource.a(i2, 1) && Offset.h(j2) < 0.0f) {
            return j2(j2);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h2(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13175b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = r0.f13174a
            kotlin.jvm.internal.q.m(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.jvm.internal.q.m(r5)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r4.f13171t
            r0.f13174a = r4
            r0.d = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r5 = r0.x
            r1 = 0
            r5.n(r1)
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r5 = r0.w
            r5.n(r1)
            d0.b0 r5 = d0.b0.f30125a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.h2(h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i2(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13178b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = r0.f13177a
            kotlin.jvm.internal.q.m(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.jvm.internal.q.m(r5)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r4.f13171t
            r0.f13177a = r4
            r0.d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            int r5 = r0.k2()
            float r5 = (float) r5
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r1 = r0.x
            r1.n(r5)
            int r5 = r0.k2()
            float r5 = (float) r5
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r0 = r0.w
            r0.n(r5)
            d0.b0 r5 = d0.b0.f30125a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.i2(h0.g):java.lang.Object");
    }

    public final long j2(long j2) {
        float c2;
        float k2;
        if (this.f13168q) {
            c2 = 0.0f;
        } else {
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.x;
            float v2 = p0.a.v(Offset.h(j2) + parcelableSnapshotMutableFloatState.c(), 0.0f);
            c2 = v2 - parcelableSnapshotMutableFloatState.c();
            parcelableSnapshotMutableFloatState.n(v2);
            if (parcelableSnapshotMutableFloatState.c() * 0.5f <= k2()) {
                k2 = parcelableSnapshotMutableFloatState.c() * 0.5f;
            } else {
                float z2 = p0.a.z(Math.abs((parcelableSnapshotMutableFloatState.c() * 0.5f) / k2()) - 1.0f, 0.0f, 2.0f);
                k2 = k2() + (k2() * (z2 - (((float) Math.pow(z2, 2)) / 4)));
            }
            this.w.n(k2);
        }
        return OffsetKt.a(0.0f, c2);
    }

    public final int k2() {
        return ((Density) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.f16434f)).F0(this.f13172u);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l2(float r7, h0.g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1) r0
            int r1 = r0.f13190f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13190f = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f13189c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f13190f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            float r7 = r0.f13188b
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = r0.f13187a
            kotlin.jvm.internal.q.m(r8)
            goto L80
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            float r7 = r0.f13188b
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = r0.f13187a
            kotlin.jvm.internal.q.m(r8)
            goto L6c
        L3f:
            kotlin.jvm.internal.q.m(r8)
            boolean r8 = r6.f13168q
            if (r8 == 0) goto L4c
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r5)
            return r7
        L4c:
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r8 = r6.x
            float r8 = r8.c()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r2
            int r2 = r6.k2()
            float r2 = (float) r2
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L72
            r0.f13187a = r6
            r0.f13188b = r7
            r0.f13190f = r4
            java.lang.Object r8 = r6.i2(r0)
            if (r8 != r1) goto L6b
            return r1
        L6b:
            r0 = r6
        L6c:
            q0.a r8 = r0.f13169r
            r8.invoke()
            goto L80
        L72:
            r0.f13187a = r6
            r0.f13188b = r7
            r0.f13190f = r3
            java.lang.Object r8 = r6.h2(r0)
            if (r8 != r1) goto L7f
            return r1
        L7f:
            r0 = r6
        L80:
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r8 = r0.x
            float r8 = r8.c()
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L8c
        L8a:
            r7 = r5
            goto L91
        L8c:
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 >= 0) goto L91
            goto L8a
        L91:
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r8 = r0.x
            r8.n(r5)
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.l2(float, h0.g):java.lang.Object");
    }
}
