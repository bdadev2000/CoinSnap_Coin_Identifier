package androidx.compose.ui.draw;

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
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import e0.x;

/* loaded from: classes3.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public Painter f14813o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14814p;

    /* renamed from: q, reason: collision with root package name */
    public Alignment f14815q;

    /* renamed from: r, reason: collision with root package name */
    public ContentScale f14816r;

    /* renamed from: s, reason: collision with root package name */
    public float f14817s;

    /* renamed from: t, reason: collision with root package name */
    public ColorFilter f14818t;

    public static boolean f2(long j2) {
        if (!Size.a(j2, 9205357640488583168L)) {
            float b2 = Size.b(j2);
            if (!Float.isInfinite(b2) && !Float.isNaN(b2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g2(long j2) {
        if (!Size.a(j2, 9205357640488583168L)) {
            float d = Size.d(j2);
            if (!Float.isInfinite(d) && !Float.isNaN(d)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int A(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!e2()) {
            return intrinsicMeasurable.K(i2);
        }
        long h2 = h2(ConstraintsKt.b(i2, 0, 13));
        return Math.max(Constraints.j(h2), intrinsicMeasurable.K(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int E(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!e2()) {
            return intrinsicMeasurable.R(i2);
        }
        long h2 = h2(ConstraintsKt.b(0, i2, 7));
        return Math.max(Constraints.k(h2), intrinsicMeasurable.R(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int K(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!e2()) {
            return intrinsicMeasurable.S(i2);
        }
        long h2 = h2(ConstraintsKt.b(0, i2, 7));
        return Math.max(Constraints.k(h2), intrinsicMeasurable.S(i2));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    public final boolean e2() {
        return this.f14814p && this.f14813o.mo2getIntrinsicSizeNHjbRc() != 9205357640488583168L;
    }

    public final long h2(long j2) {
        boolean z2 = false;
        boolean z3 = Constraints.e(j2) && Constraints.d(j2);
        if (Constraints.g(j2) && Constraints.f(j2)) {
            z2 = true;
        }
        if ((!e2() && z3) || z2) {
            return Constraints.b(j2, Constraints.i(j2), 0, Constraints.h(j2), 0, 10);
        }
        long mo2getIntrinsicSizeNHjbRc = this.f14813o.mo2getIntrinsicSizeNHjbRc();
        long a2 = SizeKt.a(ConstraintsKt.h(g2(mo2getIntrinsicSizeNHjbRc) ? Math.round(Size.d(mo2getIntrinsicSizeNHjbRc)) : Constraints.k(j2), j2), ConstraintsKt.g(f2(mo2getIntrinsicSizeNHjbRc) ? Math.round(Size.b(mo2getIntrinsicSizeNHjbRc)) : Constraints.j(j2), j2));
        if (e2()) {
            long a3 = SizeKt.a(!g2(this.f14813o.mo2getIntrinsicSizeNHjbRc()) ? Size.d(a2) : Size.d(this.f14813o.mo2getIntrinsicSizeNHjbRc()), !f2(this.f14813o.mo2getIntrinsicSizeNHjbRc()) ? Size.b(a2) : Size.b(this.f14813o.mo2getIntrinsicSizeNHjbRc()));
            a2 = (Size.d(a2) == 0.0f || Size.b(a2) == 0.0f) ? 0L : ScaleFactorKt.b(a3, this.f14816r.a(a3, a2));
        }
        return Constraints.b(j2, ConstraintsKt.h(Math.round(Size.d(a2)), j2), 0, ConstraintsKt.g(Math.round(Size.b(a2)), j2), 0, 10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable V = measurable.V(h2(j2));
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new PainterNode$measure$1(V));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int q(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!e2()) {
            return intrinsicMeasurable.s(i2);
        }
        long h2 = h2(ConstraintsKt.b(i2, 0, 13));
        return Math.max(Constraints.j(h2), intrinsicMeasurable.s(i2));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f14813o + ", sizeToIntrinsics=" + this.f14814p + ", alignment=" + this.f14815q + ", alpha=" + this.f14817s + ", colorFilter=" + this.f14818t + ')';
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        long mo2getIntrinsicSizeNHjbRc = this.f14813o.mo2getIntrinsicSizeNHjbRc();
        long a2 = SizeKt.a(g2(mo2getIntrinsicSizeNHjbRc) ? Size.d(mo2getIntrinsicSizeNHjbRc) : Size.d(contentDrawScope.b()), f2(mo2getIntrinsicSizeNHjbRc) ? Size.b(mo2getIntrinsicSizeNHjbRc) : Size.b(contentDrawScope.b()));
        long b2 = (Size.d(contentDrawScope.b()) == 0.0f || Size.b(contentDrawScope.b()) == 0.0f) ? 0L : ScaleFactorKt.b(a2, this.f14816r.a(a2, contentDrawScope.b()));
        long a3 = this.f14815q.a(IntSizeKt.a(Math.round(Size.d(b2)), Math.round(Size.b(b2))), IntSizeKt.a(Math.round(Size.d(contentDrawScope.b())), Math.round(Size.b(contentDrawScope.b()))), contentDrawScope.getLayoutDirection());
        float f2 = (int) (a3 >> 32);
        float f3 = (int) (a3 & 4294967295L);
        contentDrawScope.A1().f15139a.g(f2, f3);
        try {
            this.f14813o.m4drawx_KDEd0(contentDrawScope, b2, this.f14817s, this.f14818t);
            contentDrawScope.A1().f15139a.g(-f2, -f3);
            contentDrawScope.P1();
        } catch (Throwable th) {
            contentDrawScope.A1().f15139a.g(-f2, -f3);
            throw th;
        }
    }
}
