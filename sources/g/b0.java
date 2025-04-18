package g;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;

/* loaded from: classes.dex */
public final class b0 extends Modifier.Node implements DrawModifierNode, LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public Painter f30518o;

    /* renamed from: p, reason: collision with root package name */
    public Alignment f30519p;

    /* renamed from: q, reason: collision with root package name */
    public ContentScale f30520q;

    /* renamed from: r, reason: collision with root package name */
    public float f30521r;

    /* renamed from: s, reason: collision with root package name */
    public ColorFilter f30522s;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int A(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.f30518o.mo2getIntrinsicSizeNHjbRc() == 9205357640488583168L) {
            return intrinsicMeasurable.K(i2);
        }
        int K = intrinsicMeasurable.K(Constraints.i(f2(ConstraintsKt.b(i2, 0, 13))));
        return Math.max(p0.a.t0(Size.b(e2(SizeKt.a(i2, K)))), K);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int E(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.f30518o.mo2getIntrinsicSizeNHjbRc() == 9205357640488583168L) {
            return intrinsicMeasurable.R(i2);
        }
        int R = intrinsicMeasurable.R(Constraints.h(f2(ConstraintsKt.b(0, i2, 7))));
        return Math.max(p0.a.t0(Size.d(e2(SizeKt.a(R, i2)))), R);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int K(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.f30518o.mo2getIntrinsicSizeNHjbRc() == 9205357640488583168L) {
            return intrinsicMeasurable.S(i2);
        }
        int S = intrinsicMeasurable.S(Constraints.h(f2(ConstraintsKt.b(0, i2, 7))));
        return Math.max(p0.a.t0(Size.d(e2(SizeKt.a(S, i2)))), S);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    public final long e2(long j2) {
        if (Size.e(j2)) {
            return 0L;
        }
        long mo2getIntrinsicSizeNHjbRc = this.f30518o.mo2getIntrinsicSizeNHjbRc();
        if (mo2getIntrinsicSizeNHjbRc == 9205357640488583168L) {
            return j2;
        }
        float d = Size.d(mo2getIntrinsicSizeNHjbRc);
        if (Float.isInfinite(d) || Float.isNaN(d)) {
            d = Size.d(j2);
        }
        float b2 = Size.b(mo2getIntrinsicSizeNHjbRc);
        if (Float.isInfinite(b2) || Float.isNaN(b2)) {
            b2 = Size.b(j2);
        }
        long a2 = SizeKt.a(d, b2);
        long a3 = this.f30520q.a(a2, j2);
        float a4 = ScaleFactor.a(a3);
        if (Float.isInfinite(a4) || Float.isNaN(a4)) {
            return j2;
        }
        float b3 = ScaleFactor.b(a3);
        return (Float.isInfinite(b3) || Float.isNaN(b3)) ? j2 : ScaleFactorKt.b(a2, a3);
    }

    public final long f2(long j2) {
        float k2;
        int j3;
        float z2;
        boolean g2 = Constraints.g(j2);
        boolean f2 = Constraints.f(j2);
        if (g2 && f2) {
            return j2;
        }
        boolean z3 = Constraints.e(j2) && Constraints.d(j2);
        long mo2getIntrinsicSizeNHjbRc = this.f30518o.mo2getIntrinsicSizeNHjbRc();
        if (mo2getIntrinsicSizeNHjbRc == 9205357640488583168L) {
            return z3 ? Constraints.b(j2, Constraints.i(j2), 0, Constraints.h(j2), 0, 10) : j2;
        }
        if (z3 && (g2 || f2)) {
            k2 = Constraints.i(j2);
            j3 = Constraints.h(j2);
        } else {
            float d = Size.d(mo2getIntrinsicSizeNHjbRc);
            float b2 = Size.b(mo2getIntrinsicSizeNHjbRc);
            if (Float.isInfinite(d) || Float.isNaN(d)) {
                k2 = Constraints.k(j2);
            } else {
                r.e eVar = j0.f30546b;
                k2 = p0.a.z(d, Constraints.k(j2), Constraints.i(j2));
            }
            if (!Float.isInfinite(b2) && !Float.isNaN(b2)) {
                r.e eVar2 = j0.f30546b;
                z2 = p0.a.z(b2, Constraints.j(j2), Constraints.h(j2));
                long e2 = e2(SizeKt.a(k2, z2));
                return Constraints.b(j2, ConstraintsKt.h(p0.a.t0(Size.d(e2)), j2), 0, ConstraintsKt.g(p0.a.t0(Size.b(e2)), j2), 0, 10);
            }
            j3 = Constraints.j(j2);
        }
        z2 = j3;
        long e22 = e2(SizeKt.a(k2, z2));
        return Constraints.b(j2, ConstraintsKt.h(p0.a.t0(Size.d(e22)), j2), 0, ConstraintsKt.g(p0.a.t0(Size.b(e22)), j2), 0, 10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable V = measurable.V(f2(j2));
        return measureScope.T(V.f15825a, V.f15826b, e0.x.f30219a, new a0(V));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int q(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.f30518o.mo2getIntrinsicSizeNHjbRc() == 9205357640488583168L) {
            return intrinsicMeasurable.s(i2);
        }
        int s2 = intrinsicMeasurable.s(Constraints.i(f2(ConstraintsKt.b(i2, 0, 13))));
        return Math.max(p0.a.t0(Size.b(e2(SizeKt.a(i2, s2)))), s2);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        long e2 = e2(contentDrawScope.b());
        Alignment alignment = this.f30519p;
        r.e eVar = j0.f30546b;
        long a2 = IntSizeKt.a(p0.a.t0(Size.d(e2)), p0.a.t0(Size.b(e2)));
        long b2 = contentDrawScope.b();
        long a3 = alignment.a(a2, IntSizeKt.a(p0.a.t0(Size.d(b2)), p0.a.t0(Size.b(b2))), contentDrawScope.getLayoutDirection());
        float f2 = (int) (a3 >> 32);
        float f3 = (int) (a3 & 4294967295L);
        contentDrawScope.A1().f15139a.g(f2, f3);
        this.f30518o.m4drawx_KDEd0(contentDrawScope, e2, this.f30521r, this.f30522s);
        contentDrawScope.A1().f15139a.g(-f2, -f3);
        contentDrawScope.P1();
    }
}
