package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;

/* loaded from: classes3.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public float f3789o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3790p;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int A(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return i2 != Integer.MAX_VALUE ? Math.round(i2 / this.f3789o) : intrinsicMeasurable.K(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int E(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return i2 != Integer.MAX_VALUE ? Math.round(i2 * this.f3789o) : intrinsicMeasurable.R(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int K(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return i2 != Integer.MAX_VALUE ? Math.round(i2 * this.f3789o) : intrinsicMeasurable.S(i2);
    }

    public final long e2(long j2, boolean z2) {
        int round;
        int h2 = Constraints.h(j2);
        if (h2 == Integer.MAX_VALUE || (round = Math.round(h2 * this.f3789o)) <= 0) {
            return 0L;
        }
        long a2 = IntSizeKt.a(round, h2);
        if (!z2 || ConstraintsKt.j(j2, a2)) {
            return a2;
        }
        return 0L;
    }

    public final long f2(long j2, boolean z2) {
        int round;
        int i2 = Constraints.i(j2);
        if (i2 == Integer.MAX_VALUE || (round = Math.round(i2 / this.f3789o)) <= 0) {
            return 0L;
        }
        long a2 = IntSizeKt.a(i2, round);
        if (!z2 || ConstraintsKt.j(j2, a2)) {
            return a2;
        }
        return 0L;
    }

    public final long g2(long j2, boolean z2) {
        int j3 = Constraints.j(j2);
        int round = Math.round(j3 * this.f3789o);
        if (round <= 0) {
            return 0L;
        }
        long a2 = IntSizeKt.a(round, j3);
        if (!z2 || ConstraintsKt.j(j2, a2)) {
            return a2;
        }
        return 0L;
    }

    public final long h2(long j2, boolean z2) {
        int k2 = Constraints.k(j2);
        int round = Math.round(k2 / this.f3789o);
        if (round <= 0) {
            return 0L;
        }
        long a2 = IntSizeKt.a(k2, round);
        if (!z2 || ConstraintsKt.j(j2, a2)) {
            return a2;
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (androidx.compose.ui.unit.IntSize.b(r5, 0) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        if (androidx.compose.ui.unit.IntSize.b(r5, 0) == false) goto L53;
     */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.layout.MeasureResult m(androidx.compose.ui.layout.MeasureScope r8, androidx.compose.ui.layout.Measurable r9, long r10) {
        /*
            r7 = this;
            boolean r0 = r7.f3790p
            r1 = 1
            r2 = 0
            r4 = 0
            if (r0 != 0) goto L67
            long r5 = r7.f2(r10, r1)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto L14
            goto Lc0
        L14:
            long r5 = r7.e2(r10, r1)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto L20
            goto Lc0
        L20:
            long r5 = r7.h2(r10, r1)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto L2c
            goto Lc0
        L2c:
            long r5 = r7.g2(r10, r1)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto L38
            goto Lc0
        L38:
            long r5 = r7.f2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto L44
            goto Lc0
        L44:
            long r5 = r7.e2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto L50
            goto Lc0
        L50:
            long r5 = r7.h2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto L5c
            goto Lc0
        L5c:
            long r5 = r7.g2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto Lbf
            goto Lc0
        L67:
            long r5 = r7.e2(r10, r1)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto L72
            goto Lc0
        L72:
            long r5 = r7.f2(r10, r1)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto L7d
            goto Lc0
        L7d:
            long r5 = r7.g2(r10, r1)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto L88
            goto Lc0
        L88:
            long r5 = r7.h2(r10, r1)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto L93
            goto Lc0
        L93:
            long r5 = r7.e2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto L9e
            goto Lc0
        L9e:
            long r5 = r7.f2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto La9
            goto Lc0
        La9:
            long r5 = r7.g2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto Lb4
            goto Lc0
        Lb4:
            long r5 = r7.h2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto Lbf
            goto Lc0
        Lbf:
            r5 = r2
        Lc0:
            boolean r0 = androidx.compose.ui.unit.IntSize.b(r5, r2)
            if (r0 != 0) goto Ld6
            r10 = 32
            long r10 = r5 >> r10
            int r10 = (int) r10
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r5
            int r11 = (int) r0
            long r10 = androidx.compose.ui.unit.Constraints.Companion.c(r10, r11)
        Ld6:
            androidx.compose.ui.layout.Placeable r9 = r9.V(r10)
            int r10 = r9.f15825a
            int r11 = r9.f15826b
            androidx.compose.foundation.layout.AspectRatioNode$measure$1 r0 = new androidx.compose.foundation.layout.AspectRatioNode$measure$1
            r0.<init>(r9)
            e0.x r9 = e0.x.f30219a
            androidx.compose.ui.layout.MeasureResult r8 = r8.T(r10, r11, r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.AspectRatioNode.m(androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, long):androidx.compose.ui.layout.MeasureResult");
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int q(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return i2 != Integer.MAX_VALUE ? Math.round(i2 / this.f3789o) : intrinsicMeasurable.s(i2);
    }
}
