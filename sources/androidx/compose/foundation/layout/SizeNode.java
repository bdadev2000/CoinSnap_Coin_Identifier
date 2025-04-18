package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import e0.x;

/* loaded from: classes.dex */
final class SizeNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public float f4112o;

    /* renamed from: p, reason: collision with root package name */
    public float f4113p;

    /* renamed from: q, reason: collision with root package name */
    public float f4114q;

    /* renamed from: r, reason: collision with root package name */
    public float f4115r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4116s;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int A(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long e2 = e2(intrinsicMeasureScope);
        return Constraints.f(e2) ? Constraints.h(e2) : ConstraintsKt.g(intrinsicMeasurable.K(i2), e2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int E(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long e2 = e2(intrinsicMeasureScope);
        return Constraints.g(e2) ? Constraints.i(e2) : ConstraintsKt.h(intrinsicMeasurable.R(i2), e2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int K(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long e2 = e2(intrinsicMeasureScope);
        return Constraints.g(e2) ? Constraints.i(e2) : ConstraintsKt.h(intrinsicMeasurable.S(i2), e2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e2(androidx.compose.ui.unit.Density r8) {
        /*
            r7 = this;
            float r0 = r7.f4114q
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = androidx.compose.ui.unit.Dp.a(r0, r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L18
            float r0 = r7.f4114q
            int r0 = r8.F0(r0)
            if (r0 >= 0) goto L19
            r0 = r3
            goto L19
        L18:
            r0 = r2
        L19:
            float r4 = r7.f4115r
            boolean r4 = androidx.compose.ui.unit.Dp.a(r4, r1)
            if (r4 != 0) goto L2b
            float r4 = r7.f4115r
            int r4 = r8.F0(r4)
            if (r4 >= 0) goto L2c
            r4 = r3
            goto L2c
        L2b:
            r4 = r2
        L2c:
            float r5 = r7.f4112o
            boolean r5 = androidx.compose.ui.unit.Dp.a(r5, r1)
            if (r5 != 0) goto L43
            float r5 = r7.f4112o
            int r5 = r8.F0(r5)
            if (r5 <= r0) goto L3d
            r5 = r0
        L3d:
            if (r5 >= 0) goto L40
            r5 = r3
        L40:
            if (r5 == r2) goto L43
            goto L44
        L43:
            r5 = r3
        L44:
            float r6 = r7.f4113p
            boolean r1 = androidx.compose.ui.unit.Dp.a(r6, r1)
            if (r1 != 0) goto L5b
            float r1 = r7.f4113p
            int r8 = r8.F0(r1)
            if (r8 <= r4) goto L55
            r8 = r4
        L55:
            if (r8 >= 0) goto L58
            r8 = r3
        L58:
            if (r8 == r2) goto L5b
            r3 = r8
        L5b:
            long r0 = androidx.compose.ui.unit.ConstraintsKt.a(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeNode.e2(androidx.compose.ui.unit.Density):long");
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        int k2;
        int i2;
        int j3;
        int h2;
        long a2;
        long e2 = e2(measureScope);
        if (this.f4116s) {
            a2 = ConstraintsKt.f(j2, e2);
        } else {
            if (Dp.a(this.f4112o, Float.NaN)) {
                k2 = Constraints.k(j2);
                int i3 = Constraints.i(e2);
                if (k2 > i3) {
                    k2 = i3;
                }
            } else {
                k2 = Constraints.k(e2);
            }
            if (Dp.a(this.f4114q, Float.NaN)) {
                i2 = Constraints.i(j2);
                int k3 = Constraints.k(e2);
                if (i2 < k3) {
                    i2 = k3;
                }
            } else {
                i2 = Constraints.i(e2);
            }
            if (Dp.a(this.f4113p, Float.NaN)) {
                j3 = Constraints.j(j2);
                int h3 = Constraints.h(e2);
                if (j3 > h3) {
                    j3 = h3;
                }
            } else {
                j3 = Constraints.j(e2);
            }
            if (Dp.a(this.f4115r, Float.NaN)) {
                h2 = Constraints.h(j2);
                int j4 = Constraints.j(e2);
                if (h2 < j4) {
                    h2 = j4;
                }
            } else {
                h2 = Constraints.h(e2);
            }
            a2 = ConstraintsKt.a(k2, i2, j3, h2);
        }
        Placeable V = measurable.V(a2);
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new SizeNode$measure$1(V));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int q(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long e2 = e2(intrinsicMeasureScope);
        return Constraints.f(e2) ? Constraints.h(e2) : ConstraintsKt.g(intrinsicMeasurable.s(i2), e2);
    }
}
