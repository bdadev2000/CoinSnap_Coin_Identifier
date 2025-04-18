package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;

/* loaded from: classes3.dex */
public class VirtualLayout extends HelperWidget {

    /* renamed from: h0, reason: collision with root package name */
    public int f18091h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f18092i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f18093j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f18094k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f18095l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f18096m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f18097n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f18098o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f18099p0;

    /* renamed from: q0, reason: collision with root package name */
    public BasicMeasure.Measure f18100q0;

    /* renamed from: r0, reason: collision with root package name */
    public BasicMeasure.Measurer f18101r0;

    public void D(int i2, int i3, int i4, int i5) {
    }

    public final void E(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i2, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i3) {
        BasicMeasure.Measurer measurer;
        ConstraintWidget constraintWidget2;
        while (true) {
            measurer = this.f18101r0;
            if (measurer != null || (constraintWidget2 = this.K) == null) {
                break;
            } else {
                this.f18101r0 = ((ConstraintWidgetContainer) constraintWidget2).f18046i0;
            }
        }
        BasicMeasure.Measure measure = this.f18100q0;
        measure.f18106a = dimensionBehaviour;
        measure.f18107b = dimensionBehaviour2;
        measure.f18108c = i2;
        measure.d = i3;
        measurer.b(constraintWidget, measure);
        constraintWidget.z(measure.e);
        constraintWidget.w(measure.f18109f);
        constraintWidget.w = measure.f18111h;
        int i4 = measure.f18110g;
        constraintWidget.R = i4;
        constraintWidget.w = i4 > 0;
    }

    @Override // androidx.constraintlayout.solver.widgets.HelperWidget, androidx.constraintlayout.solver.widgets.Helper
    public final void a() {
        for (int i2 = 0; i2 < this.f18089g0; i2++) {
            ConstraintWidget constraintWidget = this.f18088f0[i2];
        }
    }
}
