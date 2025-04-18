package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class Flow extends VirtualLayout {
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public final ArrayList L0;
    public ConstraintWidget[] M0;
    public ConstraintWidget[] N0;
    public int[] O0;
    public ConstraintWidget[] P0;
    public int Q0;

    /* renamed from: s0, reason: collision with root package name */
    public int f18058s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f18059t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f18060u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f18061v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f18062w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f18063x0;

    /* renamed from: y0, reason: collision with root package name */
    public float f18064y0;

    /* renamed from: z0, reason: collision with root package name */
    public float f18065z0;

    /* loaded from: classes3.dex */
    public class WidgetsList {

        /* renamed from: a, reason: collision with root package name */
        public int f18066a;
        public ConstraintAnchor d;
        public ConstraintAnchor e;

        /* renamed from: f, reason: collision with root package name */
        public ConstraintAnchor f18069f;

        /* renamed from: g, reason: collision with root package name */
        public ConstraintAnchor f18070g;

        /* renamed from: h, reason: collision with root package name */
        public int f18071h;

        /* renamed from: i, reason: collision with root package name */
        public int f18072i;

        /* renamed from: j, reason: collision with root package name */
        public int f18073j;

        /* renamed from: k, reason: collision with root package name */
        public int f18074k;

        /* renamed from: q, reason: collision with root package name */
        public int f18080q;

        /* renamed from: b, reason: collision with root package name */
        public ConstraintWidget f18067b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f18068c = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f18075l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f18076m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f18077n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f18078o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f18079p = 0;

        public WidgetsList(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3) {
            this.f18071h = 0;
            this.f18072i = 0;
            this.f18073j = 0;
            this.f18074k = 0;
            this.f18080q = 0;
            this.f18066a = i2;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f18069f = constraintAnchor3;
            this.f18070g = constraintAnchor4;
            this.f18071h = Flow.this.f18095l0;
            this.f18072i = Flow.this.f18091h0;
            this.f18073j = Flow.this.f18096m0;
            this.f18074k = Flow.this.f18092i0;
            this.f18080q = i3;
        }

        public final void a(ConstraintWidget constraintWidget) {
            int i2 = this.f18066a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f18042c;
            Flow flow = Flow.this;
            if (i2 == 0) {
                int G = flow.G(constraintWidget, this.f18080q);
                if (constraintWidget.J[0] == dimensionBehaviour) {
                    this.f18079p++;
                    G = 0;
                }
                this.f18075l = G + (constraintWidget.X != 8 ? flow.E0 : 0) + this.f18075l;
                int F = flow.F(constraintWidget, this.f18080q);
                if (this.f18067b == null || this.f18068c < F) {
                    this.f18067b = constraintWidget;
                    this.f18068c = F;
                    this.f18076m = F;
                }
            } else {
                int G2 = flow.G(constraintWidget, this.f18080q);
                int F2 = flow.F(constraintWidget, this.f18080q);
                if (constraintWidget.J[1] == dimensionBehaviour) {
                    this.f18079p++;
                    F2 = 0;
                }
                this.f18076m = F2 + (constraintWidget.X != 8 ? flow.F0 : 0) + this.f18076m;
                if (this.f18067b == null || this.f18068c < G2) {
                    this.f18067b = constraintWidget;
                    this.f18068c = G2;
                    this.f18075l = G2;
                }
            }
            this.f18078o++;
        }

        public final void b(int i2, boolean z2, boolean z3) {
            Flow flow;
            int i3;
            int i4;
            ConstraintWidget constraintWidget;
            char c2;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = this.f18078o;
            int i11 = 0;
            while (true) {
                flow = Flow.this;
                if (i11 >= i10 || (i9 = this.f18077n + i11) >= flow.Q0) {
                    break;
                }
                ConstraintWidget constraintWidget2 = flow.P0[i9];
                if (constraintWidget2 != null) {
                    constraintWidget2.u();
                }
                i11++;
            }
            if (i10 == 0 || this.f18067b == null) {
                return;
            }
            boolean z4 = z3 && i2 == 0;
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = this.f18077n + (z2 ? (i10 - 1) - i14 : i14);
                if (i15 >= flow.Q0) {
                    break;
                }
                if (flow.P0[i15].X == 0) {
                    if (i12 == -1) {
                        i12 = i14;
                    }
                    i13 = i14;
                }
            }
            if (this.f18066a != 0) {
                ConstraintWidget constraintWidget3 = this.f18067b;
                constraintWidget3.f18012a0 = flow.f18058s0;
                int i16 = this.f18071h;
                if (i2 > 0) {
                    i16 += flow.E0;
                }
                ConstraintAnchor constraintAnchor = constraintWidget3.f18036y;
                ConstraintAnchor constraintAnchor2 = constraintWidget3.A;
                if (z2) {
                    constraintAnchor2.a(this.f18069f, i16);
                    if (z3) {
                        constraintAnchor.a(this.d, this.f18073j);
                    }
                    if (i2 > 0) {
                        this.f18069f.f17998b.f18036y.a(constraintAnchor2, 0);
                    }
                } else {
                    constraintAnchor.a(this.d, i16);
                    if (z3) {
                        constraintAnchor2.a(this.f18069f, this.f18073j);
                    }
                    if (i2 > 0) {
                        this.d.f17998b.A.a(constraintAnchor, 0);
                    }
                }
                int i17 = 0;
                ConstraintWidget constraintWidget4 = null;
                while (i17 < i10) {
                    int i18 = this.f18077n + i17;
                    if (i18 >= flow.Q0) {
                        return;
                    }
                    ConstraintWidget constraintWidget5 = flow.P0[i18];
                    if (i17 == 0) {
                        constraintWidget5.f(constraintWidget5.f18037z, this.e, this.f18072i);
                        int i19 = flow.f18059t0;
                        float f2 = flow.f18065z0;
                        if (this.f18077n == 0) {
                            i4 = flow.f18061v0;
                            i3 = -1;
                            if (i4 != -1) {
                                f2 = flow.B0;
                                i19 = i4;
                                constraintWidget5.f18014b0 = i19;
                                constraintWidget5.V = f2;
                            }
                        } else {
                            i3 = -1;
                        }
                        if (z3 && (i4 = flow.f18063x0) != i3) {
                            f2 = flow.D0;
                            i19 = i4;
                        }
                        constraintWidget5.f18014b0 = i19;
                        constraintWidget5.V = f2;
                    }
                    if (i17 == i10 - 1) {
                        constraintWidget5.f(constraintWidget5.B, this.f18070g, this.f18074k);
                    }
                    if (constraintWidget4 != null) {
                        ConstraintAnchor constraintAnchor3 = constraintWidget5.f18037z;
                        int i20 = flow.F0;
                        ConstraintAnchor constraintAnchor4 = constraintWidget4.B;
                        constraintAnchor3.a(constraintAnchor4, i20);
                        ConstraintAnchor constraintAnchor5 = constraintWidget5.f18037z;
                        if (i17 == i12) {
                            int i21 = this.f18072i;
                            if (constraintAnchor5.f()) {
                                constraintAnchor5.f18000f = i21;
                            }
                        }
                        constraintAnchor4.a(constraintAnchor5, 0);
                        if (i17 == i13 + 1) {
                            int i22 = this.f18074k;
                            if (constraintAnchor4.f()) {
                                constraintAnchor4.f18000f = i22;
                            }
                        }
                    }
                    if (constraintWidget5 != constraintWidget3) {
                        if (z2) {
                            int i23 = flow.G0;
                            if (i23 == 0) {
                                constraintWidget5.A.a(constraintAnchor2, 0);
                            } else if (i23 == 1) {
                                constraintWidget5.f18036y.a(constraintAnchor, 0);
                            } else if (i23 == 2) {
                                constraintWidget5.f18036y.a(constraintAnchor, 0);
                                constraintWidget5.A.a(constraintAnchor2, 0);
                            }
                        } else {
                            int i24 = flow.G0;
                            if (i24 == 0) {
                                constraintWidget5.f18036y.a(constraintAnchor, 0);
                            } else if (i24 == 1) {
                                constraintWidget5.A.a(constraintAnchor2, 0);
                            } else if (i24 == 2) {
                                if (z4) {
                                    constraintWidget5.f18036y.a(this.d, this.f18071h);
                                    constraintWidget5.A.a(this.f18069f, this.f18073j);
                                } else {
                                    constraintWidget5.f18036y.a(constraintAnchor, 0);
                                    constraintWidget5.A.a(constraintAnchor2, 0);
                                }
                            }
                            i17++;
                            constraintWidget4 = constraintWidget5;
                        }
                    }
                    i17++;
                    constraintWidget4 = constraintWidget5;
                }
                return;
            }
            ConstraintWidget constraintWidget6 = this.f18067b;
            constraintWidget6.f18014b0 = flow.f18059t0;
            int i25 = this.f18072i;
            if (i2 > 0) {
                i25 += flow.F0;
            }
            ConstraintAnchor constraintAnchor6 = this.e;
            ConstraintAnchor constraintAnchor7 = constraintWidget6.f18037z;
            constraintAnchor7.a(constraintAnchor6, i25);
            ConstraintAnchor constraintAnchor8 = constraintWidget6.B;
            if (z3) {
                constraintAnchor8.a(this.f18070g, this.f18074k);
            }
            if (i2 > 0) {
                this.e.f17998b.B.a(constraintAnchor7, 0);
            }
            if (flow.H0 == 3 && !constraintWidget6.w) {
                for (int i26 = 0; i26 < i10; i26++) {
                    int i27 = this.f18077n + (z2 ? (i10 - 1) - i26 : i26);
                    if (i27 >= flow.Q0) {
                        break;
                    }
                    constraintWidget = flow.P0[i27];
                    if (constraintWidget.w) {
                        break;
                    }
                }
            }
            constraintWidget = constraintWidget6;
            int i28 = 0;
            ConstraintWidget constraintWidget7 = null;
            while (i28 < i10) {
                int i29 = z2 ? (i10 - 1) - i28 : i28;
                int i30 = this.f18077n + i29;
                if (i30 >= flow.Q0) {
                    return;
                }
                ConstraintWidget constraintWidget8 = flow.P0[i30];
                if (i28 == 0) {
                    constraintWidget8.f(constraintWidget8.f18036y, this.d, this.f18071h);
                }
                if (i29 == 0) {
                    int i31 = flow.f18058s0;
                    float f3 = flow.f18064y0;
                    if (this.f18077n == 0) {
                        i8 = flow.f18060u0;
                        i5 = i31;
                        i6 = -1;
                        if (i8 != -1) {
                            f3 = flow.A0;
                            i7 = i8;
                            constraintWidget8.f18012a0 = i7;
                            constraintWidget8.U = f3;
                        }
                    } else {
                        i5 = i31;
                        i6 = -1;
                    }
                    if (!z3 || (i8 = flow.f18062w0) == i6) {
                        i7 = i5;
                        constraintWidget8.f18012a0 = i7;
                        constraintWidget8.U = f3;
                    } else {
                        f3 = flow.C0;
                        i7 = i8;
                        constraintWidget8.f18012a0 = i7;
                        constraintWidget8.U = f3;
                    }
                }
                if (i28 == i10 - 1) {
                    constraintWidget8.f(constraintWidget8.A, this.f18069f, this.f18073j);
                }
                if (constraintWidget7 != null) {
                    ConstraintAnchor constraintAnchor9 = constraintWidget8.f18036y;
                    int i32 = flow.E0;
                    ConstraintAnchor constraintAnchor10 = constraintWidget7.A;
                    constraintAnchor9.a(constraintAnchor10, i32);
                    ConstraintAnchor constraintAnchor11 = constraintWidget8.f18036y;
                    if (i28 == i12) {
                        int i33 = this.f18071h;
                        if (constraintAnchor11.f()) {
                            constraintAnchor11.f18000f = i33;
                        }
                    }
                    constraintAnchor10.a(constraintAnchor11, 0);
                    if (i28 == i13 + 1) {
                        int i34 = this.f18073j;
                        if (constraintAnchor10.f()) {
                            constraintAnchor10.f18000f = i34;
                        }
                    }
                }
                if (constraintWidget8 != constraintWidget6) {
                    int i35 = flow.H0;
                    c2 = 3;
                    if (i35 == 3 && constraintWidget.w && constraintWidget8 != constraintWidget && constraintWidget8.w) {
                        constraintWidget8.C.a(constraintWidget.C, 0);
                    } else if (i35 == 0) {
                        constraintWidget8.f18037z.a(constraintAnchor7, 0);
                    } else if (i35 == 1) {
                        constraintWidget8.B.a(constraintAnchor8, 0);
                    } else if (z4) {
                        constraintWidget8.f18037z.a(this.e, this.f18072i);
                        constraintWidget8.B.a(this.f18070g, this.f18074k);
                    } else {
                        constraintWidget8.f18037z.a(constraintAnchor7, 0);
                        constraintWidget8.B.a(constraintAnchor8, 0);
                    }
                } else {
                    c2 = 3;
                }
                i28++;
                constraintWidget7 = constraintWidget8;
            }
        }

        public final int c() {
            return this.f18066a == 1 ? this.f18076m - Flow.this.F0 : this.f18076m;
        }

        public final int d() {
            return this.f18066a == 0 ? this.f18075l - Flow.this.E0 : this.f18075l;
        }

        public final void e(int i2) {
            int i3 = this.f18079p;
            if (i3 == 0) {
                return;
            }
            int i4 = this.f18078o;
            int i5 = i2 / i3;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = this.f18077n;
                int i8 = i7 + i6;
                Flow flow = Flow.this;
                if (i8 >= flow.Q0) {
                    break;
                }
                ConstraintWidget constraintWidget = flow.P0[i7 + i6];
                int i9 = this.f18066a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f18040a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f18042c;
                if (i9 == 0) {
                    if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.J;
                        if (dimensionBehaviourArr[0] == dimensionBehaviour2 && constraintWidget.f18023j == 0) {
                            flow.E(constraintWidget, dimensionBehaviour, i5, dimensionBehaviourArr[1], constraintWidget.j());
                        }
                    }
                } else if (constraintWidget != null) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.J;
                    if (dimensionBehaviourArr2[1] == dimensionBehaviour2 && constraintWidget.f18024k == 0) {
                        flow.E(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.m(), dimensionBehaviour, i5);
                    }
                }
            }
            this.f18075l = 0;
            this.f18076m = 0;
            this.f18067b = null;
            this.f18068c = 0;
            int i10 = this.f18078o;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = this.f18077n + i11;
                Flow flow2 = Flow.this;
                if (i12 >= flow2.Q0) {
                    return;
                }
                ConstraintWidget constraintWidget2 = flow2.P0[i12];
                if (this.f18066a == 0) {
                    int m2 = constraintWidget2.m();
                    int i13 = flow2.E0;
                    if (constraintWidget2.X == 8) {
                        i13 = 0;
                    }
                    this.f18075l = m2 + i13 + this.f18075l;
                    int F = flow2.F(constraintWidget2, this.f18080q);
                    if (this.f18067b == null || this.f18068c < F) {
                        this.f18067b = constraintWidget2;
                        this.f18068c = F;
                        this.f18076m = F;
                    }
                } else {
                    int G = flow2.G(constraintWidget2, this.f18080q);
                    int F2 = flow2.F(constraintWidget2, this.f18080q);
                    int i14 = flow2.F0;
                    if (constraintWidget2.X == 8) {
                        i14 = 0;
                    }
                    this.f18076m = F2 + i14 + this.f18076m;
                    if (this.f18067b == null || this.f18068c < G) {
                        this.f18067b = constraintWidget2;
                        this.f18068c = G;
                        this.f18075l = G;
                    }
                }
            }
        }

        public final void f(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3, int i4, int i5, int i6, int i7) {
            this.f18066a = i2;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f18069f = constraintAnchor3;
            this.f18070g = constraintAnchor4;
            this.f18071h = i3;
            this.f18072i = i4;
            this.f18073j = i5;
            this.f18074k = i6;
            this.f18080q = i7;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure, java.lang.Object] */
    public Flow() {
        this.f18091h0 = 0;
        this.f18092i0 = 0;
        this.f18093j0 = 0;
        this.f18094k0 = 0;
        this.f18095l0 = 0;
        this.f18096m0 = 0;
        this.f18097n0 = false;
        this.f18098o0 = 0;
        this.f18099p0 = 0;
        this.f18100q0 = new Object();
        this.f18101r0 = null;
        this.f18058s0 = -1;
        this.f18059t0 = -1;
        this.f18060u0 = -1;
        this.f18061v0 = -1;
        this.f18062w0 = -1;
        this.f18063x0 = -1;
        this.f18064y0 = 0.5f;
        this.f18065z0 = 0.5f;
        this.A0 = 0.5f;
        this.B0 = 0.5f;
        this.C0 = 0.5f;
        this.D0 = 0.5f;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = 2;
        this.H0 = 2;
        this.I0 = 0;
        this.J0 = -1;
        this.K0 = 0;
        this.L0 = new ArrayList();
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.Q0 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0589  */
    @Override // androidx.constraintlayout.solver.widgets.VirtualLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Flow.D(int, int, int, int):void");
    }

    public final int F(ConstraintWidget constraintWidget, int i2) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.J[1] == ConstraintWidget.DimensionBehaviour.f18042c) {
            int i3 = constraintWidget.f18024k;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (constraintWidget.f18031r * i2);
                if (i4 != constraintWidget.j()) {
                    E(constraintWidget, constraintWidget.J[0], constraintWidget.m(), ConstraintWidget.DimensionBehaviour.f18040a, i4);
                }
                return i4;
            }
            if (i3 == 1) {
                return constraintWidget.j();
            }
            if (i3 == 3) {
                return (int) ((constraintWidget.m() * constraintWidget.N) + 0.5f);
            }
        }
        return constraintWidget.j();
    }

    public final int G(ConstraintWidget constraintWidget, int i2) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.J[0] == ConstraintWidget.DimensionBehaviour.f18042c) {
            int i3 = constraintWidget.f18023j;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (constraintWidget.f18028o * i2);
                if (i4 != constraintWidget.m()) {
                    E(constraintWidget, ConstraintWidget.DimensionBehaviour.f18040a, i4, constraintWidget.J[1], constraintWidget.j());
                }
                return i4;
            }
            if (i3 == 1) {
                return constraintWidget.m();
            }
            if (i3 == 3) {
                return (int) ((constraintWidget.j() * constraintWidget.N) + 0.5f);
            }
        }
        return constraintWidget.m();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void b(LinearSystem linearSystem) {
        ConstraintWidget constraintWidget;
        super.b(linearSystem);
        ConstraintWidget constraintWidget2 = this.K;
        boolean z2 = constraintWidget2 != null ? ((ConstraintWidgetContainer) constraintWidget2).f18047j0 : false;
        int i2 = this.I0;
        ArrayList arrayList = this.L0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((WidgetsList) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 == 2 && this.O0 != null && this.N0 != null && this.M0 != null) {
                for (int i4 = 0; i4 < this.Q0; i4++) {
                    this.P0[i4].u();
                }
                int[] iArr = this.O0;
                int i5 = iArr[0];
                int i6 = iArr[1];
                ConstraintWidget constraintWidget3 = null;
                for (int i7 = 0; i7 < i5; i7++) {
                    ConstraintWidget constraintWidget4 = this.N0[z2 ? (i5 - i7) - 1 : i7];
                    if (constraintWidget4 != null && constraintWidget4.X != 8) {
                        ConstraintAnchor constraintAnchor = constraintWidget4.f18036y;
                        if (i7 == 0) {
                            constraintWidget4.f(constraintAnchor, this.f18036y, this.f18095l0);
                            constraintWidget4.f18012a0 = this.f18058s0;
                            constraintWidget4.U = this.f18064y0;
                        }
                        if (i7 == i5 - 1) {
                            constraintWidget4.f(constraintWidget4.A, this.A, this.f18096m0);
                        }
                        if (i7 > 0) {
                            constraintWidget4.f(constraintAnchor, constraintWidget3.A, this.E0);
                            constraintWidget3.f(constraintWidget3.A, constraintAnchor, 0);
                        }
                        constraintWidget3 = constraintWidget4;
                    }
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    ConstraintWidget constraintWidget5 = this.M0[i8];
                    if (constraintWidget5 != null && constraintWidget5.X != 8) {
                        ConstraintAnchor constraintAnchor2 = constraintWidget5.f18037z;
                        if (i8 == 0) {
                            constraintWidget5.f(constraintAnchor2, this.f18037z, this.f18091h0);
                            constraintWidget5.f18014b0 = this.f18059t0;
                            constraintWidget5.V = this.f18065z0;
                        }
                        if (i8 == i6 - 1) {
                            constraintWidget5.f(constraintWidget5.B, this.B, this.f18092i0);
                        }
                        if (i8 > 0) {
                            constraintWidget5.f(constraintAnchor2, constraintWidget3.B, this.F0);
                            constraintWidget3.f(constraintWidget3.B, constraintAnchor2, 0);
                        }
                        constraintWidget3 = constraintWidget5;
                    }
                }
                for (int i9 = 0; i9 < i5; i9++) {
                    for (int i10 = 0; i10 < i6; i10++) {
                        int i11 = (i10 * i5) + i9;
                        if (this.K0 == 1) {
                            i11 = (i9 * i6) + i10;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.P0;
                        if (i11 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i11]) != null && constraintWidget.X != 8) {
                            ConstraintWidget constraintWidget6 = this.N0[i9];
                            ConstraintWidget constraintWidget7 = this.M0[i10];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.f(constraintWidget.f18036y, constraintWidget6.f18036y, 0);
                                constraintWidget.f(constraintWidget.A, constraintWidget6.A, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.f(constraintWidget.f18037z, constraintWidget7.f18037z, 0);
                                constraintWidget.f(constraintWidget.B, constraintWidget7.B, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((WidgetsList) arrayList.get(0)).b(0, z2, true);
        }
        this.f18097n0 = false;
    }
}
