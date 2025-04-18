package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class BasicMeasure {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18103a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Measure f18104b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintWidgetContainer f18105c;

    /* loaded from: classes2.dex */
    public static class Measure {

        /* renamed from: a, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f18106a;

        /* renamed from: b, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f18107b;

        /* renamed from: c, reason: collision with root package name */
        public int f18108c;
        public int d;
        public int e;

        /* renamed from: f, reason: collision with root package name */
        public int f18109f;

        /* renamed from: g, reason: collision with root package name */
        public int f18110g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f18111h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f18112i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f18113j;
    }

    /* loaded from: classes2.dex */
    public enum MeasureType {
    }

    /* loaded from: classes2.dex */
    public interface Measurer {
        void a();

        void b(ConstraintWidget constraintWidget, Measure measure);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure, java.lang.Object] */
    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f18105c = constraintWidgetContainer;
    }

    public final boolean a(Measurer measurer, ConstraintWidget constraintWidget, boolean z2) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.J;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        Measure measure = this.f18104b;
        measure.f18106a = dimensionBehaviour;
        measure.f18107b = dimensionBehaviourArr[1];
        measure.f18108c = constraintWidget.m();
        measure.d = constraintWidget.j();
        measure.f18112i = false;
        measure.f18113j = z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.f18106a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f18042c;
        boolean z3 = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z4 = measure.f18107b == dimensionBehaviour3;
        boolean z5 = z3 && constraintWidget.N > 0.0f;
        boolean z6 = z4 && constraintWidget.N > 0.0f;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f18040a;
        int[] iArr = constraintWidget.f18025l;
        if (z5 && iArr[0] == 4) {
            measure.f18106a = dimensionBehaviour4;
        }
        if (z6 && iArr[1] == 4) {
            measure.f18107b = dimensionBehaviour4;
        }
        measurer.b(constraintWidget, measure);
        constraintWidget.z(measure.e);
        constraintWidget.w(measure.f18109f);
        constraintWidget.w = measure.f18111h;
        int i2 = measure.f18110g;
        constraintWidget.R = i2;
        constraintWidget.w = i2 > 0;
        measure.f18113j = false;
        return measure.f18112i;
    }

    public final void b(ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3) {
        int i4 = constraintWidgetContainer.S;
        int i5 = constraintWidgetContainer.T;
        constraintWidgetContainer.S = 0;
        constraintWidgetContainer.T = 0;
        constraintWidgetContainer.z(i2);
        constraintWidgetContainer.w(i3);
        if (i4 < 0) {
            constraintWidgetContainer.S = 0;
        } else {
            constraintWidgetContainer.S = i4;
        }
        if (i5 < 0) {
            constraintWidgetContainer.T = 0;
        } else {
            constraintWidgetContainer.T = i5;
        }
        this.f18105c.C();
    }
}
