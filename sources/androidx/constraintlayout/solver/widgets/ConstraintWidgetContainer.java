package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class ConstraintWidgetContainer extends WidgetContainer {

    /* renamed from: g0, reason: collision with root package name */
    public final BasicMeasure f18044g0;

    /* renamed from: h0, reason: collision with root package name */
    public final DependencyGraph f18045h0;

    /* renamed from: i0, reason: collision with root package name */
    public BasicMeasure.Measurer f18046i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f18047j0;

    /* renamed from: k0, reason: collision with root package name */
    public final LinearSystem f18048k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f18049l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f18050m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f18051n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f18052o0;

    /* renamed from: p0, reason: collision with root package name */
    public ChainHead[] f18053p0;

    /* renamed from: q0, reason: collision with root package name */
    public ChainHead[] f18054q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f18055r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f18056s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f18057t0;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure, java.lang.Object] */
    public ConstraintWidgetContainer() {
        this.f18102f0 = new ArrayList();
        this.f18044g0 = new BasicMeasure(this);
        ?? obj = new Object();
        obj.f18118b = true;
        obj.f18119c = true;
        obj.e = new ArrayList();
        new ArrayList();
        obj.f18120f = null;
        obj.f18121g = new Object();
        obj.f18122h = new ArrayList();
        obj.f18117a = this;
        obj.d = this;
        this.f18045h0 = obj;
        this.f18046i0 = null;
        this.f18047j0 = false;
        this.f18048k0 = new LinearSystem();
        this.f18051n0 = 0;
        this.f18052o0 = 0;
        this.f18053p0 = new ChainHead[4];
        this.f18054q0 = new ChainHead[4];
        this.f18055r0 = 263;
        this.f18056s0 = false;
        this.f18057t0 = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void A(boolean z2, boolean z3) {
        super.A(z2, z3);
        int size = this.f18102f0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintWidget) this.f18102f0.get(i2)).A(z2, z3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4 A[LOOP:3: B:39:0x00d2->B:40:0x00d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0196  */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // androidx.constraintlayout.solver.widgets.WidgetContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer.C():void");
    }

    public final void D(ConstraintWidget constraintWidget, int i2) {
        if (i2 == 0) {
            int i3 = this.f18051n0 + 1;
            ChainHead[] chainHeadArr = this.f18054q0;
            if (i3 >= chainHeadArr.length) {
                this.f18054q0 = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
            }
            ChainHead[] chainHeadArr2 = this.f18054q0;
            int i4 = this.f18051n0;
            chainHeadArr2[i4] = new ChainHead(constraintWidget, 0, this.f18047j0);
            this.f18051n0 = i4 + 1;
            return;
        }
        if (i2 == 1) {
            int i5 = this.f18052o0 + 1;
            ChainHead[] chainHeadArr3 = this.f18053p0;
            if (i5 >= chainHeadArr3.length) {
                this.f18053p0 = (ChainHead[]) Arrays.copyOf(chainHeadArr3, chainHeadArr3.length * 2);
            }
            ChainHead[] chainHeadArr4 = this.f18053p0;
            int i6 = this.f18052o0;
            chainHeadArr4[i6] = new ChainHead(constraintWidget, 1, this.f18047j0);
            this.f18052o0 = i6 + 1;
        }
    }

    public final void E(LinearSystem linearSystem) {
        b(linearSystem);
        int size = this.f18102f0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.f18102f0.get(i2);
            boolean[] zArr = constraintWidget.I;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof Barrier) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.f18102f0.get(i3);
                if (constraintWidget2 instanceof Barrier) {
                    Barrier barrier = (Barrier) constraintWidget2;
                    for (int i4 = 0; i4 < barrier.f18089g0; i4++) {
                        ConstraintWidget constraintWidget3 = barrier.f18088f0[i4];
                        int i5 = barrier.f17979h0;
                        if (i5 == 0 || i5 == 1) {
                            constraintWidget3.I[0] = true;
                        } else if (i5 == 2 || i5 == 3) {
                            constraintWidget3.I[1] = true;
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            ConstraintWidget constraintWidget4 = (ConstraintWidget) this.f18102f0.get(i6);
            constraintWidget4.getClass();
            if ((constraintWidget4 instanceof VirtualLayout) || (constraintWidget4 instanceof Guideline)) {
                constraintWidget4.b(linearSystem);
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            ConstraintWidget constraintWidget5 = (ConstraintWidget) this.f18102f0.get(i7);
            boolean z3 = constraintWidget5 instanceof ConstraintWidgetContainer;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f18041b;
            if (z3) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget5.J;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f18040a;
                if (dimensionBehaviour2 == dimensionBehaviour) {
                    constraintWidget5.x(dimensionBehaviour4);
                }
                if (dimensionBehaviour3 == dimensionBehaviour) {
                    constraintWidget5.y(dimensionBehaviour4);
                }
                constraintWidget5.b(linearSystem);
                if (dimensionBehaviour2 == dimensionBehaviour) {
                    constraintWidget5.x(dimensionBehaviour2);
                }
                if (dimensionBehaviour3 == dimensionBehaviour) {
                    constraintWidget5.y(dimensionBehaviour3);
                }
            } else {
                constraintWidget5.f18021h = -1;
                constraintWidget5.f18022i = -1;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = this.J[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.d;
                if (dimensionBehaviour5 != dimensionBehaviour && constraintWidget5.J[0] == dimensionBehaviour6) {
                    ConstraintAnchor constraintAnchor = constraintWidget5.f18036y;
                    int i8 = constraintAnchor.e;
                    int m2 = m();
                    ConstraintAnchor constraintAnchor2 = constraintWidget5.A;
                    int i9 = m2 - constraintAnchor2.e;
                    constraintAnchor.f18001g = linearSystem.j(constraintAnchor);
                    constraintAnchor2.f18001g = linearSystem.j(constraintAnchor2);
                    linearSystem.d(constraintAnchor.f18001g, i8);
                    linearSystem.d(constraintAnchor2.f18001g, i9);
                    constraintWidget5.f18021h = 2;
                    constraintWidget5.P = i8;
                    int i10 = i9 - i8;
                    constraintWidget5.L = i10;
                    int i11 = constraintWidget5.S;
                    if (i10 < i11) {
                        constraintWidget5.L = i11;
                    }
                }
                if (this.J[1] != dimensionBehaviour && constraintWidget5.J[1] == dimensionBehaviour6) {
                    ConstraintAnchor constraintAnchor3 = constraintWidget5.f18037z;
                    int i12 = constraintAnchor3.e;
                    int j2 = j();
                    ConstraintAnchor constraintAnchor4 = constraintWidget5.B;
                    int i13 = j2 - constraintAnchor4.e;
                    constraintAnchor3.f18001g = linearSystem.j(constraintAnchor3);
                    constraintAnchor4.f18001g = linearSystem.j(constraintAnchor4);
                    linearSystem.d(constraintAnchor3.f18001g, i12);
                    linearSystem.d(constraintAnchor4.f18001g, i13);
                    if (constraintWidget5.R > 0 || constraintWidget5.X == 8) {
                        ConstraintAnchor constraintAnchor5 = constraintWidget5.C;
                        SolverVariable j3 = linearSystem.j(constraintAnchor5);
                        constraintAnchor5.f18001g = j3;
                        linearSystem.d(j3, constraintWidget5.R + i12);
                    }
                    constraintWidget5.f18022i = 2;
                    constraintWidget5.Q = i12;
                    int i14 = i13 - i12;
                    constraintWidget5.M = i14;
                    int i15 = constraintWidget5.T;
                    if (i14 < i15) {
                        constraintWidget5.M = i15;
                    }
                }
                if (!(constraintWidget5 instanceof VirtualLayout) && !(constraintWidget5 instanceof Guideline)) {
                    constraintWidget5.b(linearSystem);
                }
            }
        }
        if (this.f18051n0 > 0) {
            Chain.a(this, linearSystem, 0);
        }
        if (this.f18052o0 > 0) {
            Chain.a(this, linearSystem, 1);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.WidgetContainer, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void t() {
        this.f18048k0.s();
        this.f18049l0 = 0;
        this.f18050m0 = 0;
        super.t();
    }
}
