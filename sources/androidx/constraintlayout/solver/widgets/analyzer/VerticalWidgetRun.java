package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;

/* loaded from: classes.dex */
public class VerticalWidgetRun extends WidgetRun {

    /* renamed from: k, reason: collision with root package name */
    public final DependencyNode f18146k;

    /* renamed from: l, reason: collision with root package name */
    public BaselineDimensionDependency f18147l;

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18148a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f18148a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18148a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18148a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f18146k = dependencyNode;
        this.f18147l = null;
        this.f18154h.e = DependencyNode.Type.f18137g;
        this.f18155i.e = DependencyNode.Type.f18138h;
        dependencyNode.e = DependencyNode.Type.f18139i;
        this.f18152f = 1;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        float f2;
        float f3;
        float f4;
        int i2;
        if (this.f18156j.ordinal() == 3) {
            ConstraintWidget constraintWidget = this.f18150b;
            l(constraintWidget.f18037z, constraintWidget.B, 1);
            return;
        }
        DimensionDependency dimensionDependency = this.e;
        boolean z2 = dimensionDependency.f18125c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f18042c;
        if (z2 && !dimensionDependency.f18130j && this.d == dimensionBehaviour) {
            ConstraintWidget constraintWidget2 = this.f18150b;
            int i3 = constraintWidget2.f18024k;
            if (i3 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.K;
                if (constraintWidget3 != null) {
                    if (constraintWidget3.e.e.f18130j) {
                        dimensionDependency.d((int) ((r1.f18127g * constraintWidget2.f18031r) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                DimensionDependency dimensionDependency2 = constraintWidget2.d.e;
                if (dimensionDependency2.f18130j) {
                    int i4 = constraintWidget2.O;
                    if (i4 == -1) {
                        f2 = dimensionDependency2.f18127g;
                        f3 = constraintWidget2.N;
                    } else if (i4 == 0) {
                        f4 = dimensionDependency2.f18127g * constraintWidget2.N;
                        i2 = (int) (f4 + 0.5f);
                        dimensionDependency.d(i2);
                    } else if (i4 != 1) {
                        i2 = 0;
                        dimensionDependency.d(i2);
                    } else {
                        f2 = dimensionDependency2.f18127g;
                        f3 = constraintWidget2.N;
                    }
                    f4 = f2 / f3;
                    i2 = (int) (f4 + 0.5f);
                    dimensionDependency.d(i2);
                }
            }
        }
        DependencyNode dependencyNode = this.f18154h;
        if (dependencyNode.f18125c) {
            DependencyNode dependencyNode2 = this.f18155i;
            if (dependencyNode2.f18125c) {
                if (dependencyNode.f18130j && dependencyNode2.f18130j && dimensionDependency.f18130j) {
                    return;
                }
                if (!dimensionDependency.f18130j && this.d == dimensionBehaviour) {
                    ConstraintWidget constraintWidget4 = this.f18150b;
                    if (constraintWidget4.f18023j == 0 && !constraintWidget4.s()) {
                        DependencyNode dependencyNode3 = (DependencyNode) dependencyNode.f18132l.get(0);
                        DependencyNode dependencyNode4 = (DependencyNode) dependencyNode2.f18132l.get(0);
                        int i5 = dependencyNode3.f18127g + dependencyNode.f18126f;
                        int i6 = dependencyNode4.f18127g + dependencyNode2.f18126f;
                        dependencyNode.d(i5);
                        dependencyNode2.d(i6);
                        dimensionDependency.d(i6 - i5);
                        return;
                    }
                }
                if (!dimensionDependency.f18130j && this.d == dimensionBehaviour && this.f18149a == 1 && dependencyNode.f18132l.size() > 0 && dependencyNode2.f18132l.size() > 0) {
                    DependencyNode dependencyNode5 = (DependencyNode) dependencyNode.f18132l.get(0);
                    int i7 = (((DependencyNode) dependencyNode2.f18132l.get(0)).f18127g + dependencyNode2.f18126f) - (dependencyNode5.f18127g + dependencyNode.f18126f);
                    int i8 = dimensionDependency.f18141m;
                    if (i7 < i8) {
                        dimensionDependency.d(i7);
                    } else {
                        dimensionDependency.d(i8);
                    }
                }
                if (dimensionDependency.f18130j && dependencyNode.f18132l.size() > 0 && dependencyNode2.f18132l.size() > 0) {
                    DependencyNode dependencyNode6 = (DependencyNode) dependencyNode.f18132l.get(0);
                    DependencyNode dependencyNode7 = (DependencyNode) dependencyNode2.f18132l.get(0);
                    int i9 = dependencyNode6.f18127g;
                    int i10 = dependencyNode.f18126f + i9;
                    int i11 = dependencyNode7.f18127g;
                    int i12 = dependencyNode2.f18126f + i11;
                    float f5 = this.f18150b.V;
                    if (dependencyNode6 == dependencyNode7) {
                        f5 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    dependencyNode.d((int) ((((i11 - i9) - dimensionDependency.f18127g) * f5) + i9 + 0.5f));
                    dependencyNode2.d(dependencyNode.f18127g + dimensionDependency.f18127g);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v124, types: [androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency, androidx.constraintlayout.solver.widgets.analyzer.BaselineDimensionDependency] */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5 = this.f18150b;
        boolean z2 = constraintWidget5.f18011a;
        DimensionDependency dimensionDependency = this.e;
        if (z2) {
            dimensionDependency.d(constraintWidget5.j());
        }
        boolean z3 = dimensionDependency.f18130j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f18040a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f18042c;
        DependencyNode dependencyNode = this.f18155i;
        DependencyNode dependencyNode2 = this.f18154h;
        if (!z3) {
            ConstraintWidget constraintWidget6 = this.f18150b;
            this.d = constraintWidget6.J[1];
            if (constraintWidget6.w) {
                this.f18147l = new DimensionDependency(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.d;
            if (dimensionBehaviour4 != dimensionBehaviour3) {
                if (dimensionBehaviour4 == dimensionBehaviour && (constraintWidget4 = this.f18150b.K) != null && constraintWidget4.J[1] == dimensionBehaviour2) {
                    int j2 = (constraintWidget4.j() - this.f18150b.f18037z.c()) - this.f18150b.B.c();
                    VerticalWidgetRun verticalWidgetRun = constraintWidget4.e;
                    WidgetRun.b(dependencyNode2, verticalWidgetRun.f18154h, this.f18150b.f18037z.c());
                    WidgetRun.b(dependencyNode, verticalWidgetRun.f18155i, -this.f18150b.B.c());
                    dimensionDependency.d(j2);
                    return;
                }
                if (dimensionBehaviour4 == dimensionBehaviour2) {
                    dimensionDependency.d(this.f18150b.j());
                }
            }
        } else if (this.d == dimensionBehaviour && (constraintWidget2 = (constraintWidget = this.f18150b).K) != null && constraintWidget2.J[1] == dimensionBehaviour2) {
            VerticalWidgetRun verticalWidgetRun2 = constraintWidget2.e;
            WidgetRun.b(dependencyNode2, verticalWidgetRun2.f18154h, constraintWidget.f18037z.c());
            WidgetRun.b(dependencyNode, verticalWidgetRun2.f18155i, -this.f18150b.B.c());
            return;
        }
        boolean z4 = dimensionDependency.f18130j;
        DependencyNode dependencyNode3 = this.f18146k;
        if (z4) {
            ConstraintWidget constraintWidget7 = this.f18150b;
            if (constraintWidget7.f18011a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.G;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.d;
                if (constraintAnchor2 != null && constraintAnchorArr[3].d != null) {
                    if (constraintWidget7.s()) {
                        dependencyNode2.f18126f = this.f18150b.G[2].c();
                        dependencyNode.f18126f = -this.f18150b.G[3].c();
                    } else {
                        DependencyNode h2 = WidgetRun.h(this.f18150b.G[2]);
                        if (h2 != null) {
                            WidgetRun.b(dependencyNode2, h2, this.f18150b.G[2].c());
                        }
                        DependencyNode h3 = WidgetRun.h(this.f18150b.G[3]);
                        if (h3 != null) {
                            WidgetRun.b(dependencyNode, h3, -this.f18150b.G[3].c());
                        }
                        dependencyNode2.f18124b = true;
                        dependencyNode.f18124b = true;
                    }
                    ConstraintWidget constraintWidget8 = this.f18150b;
                    if (constraintWidget8.w) {
                        WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget8.R);
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode h4 = WidgetRun.h(constraintAnchor);
                    if (h4 != null) {
                        WidgetRun.b(dependencyNode2, h4, this.f18150b.G[2].c());
                        WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.f18127g);
                        ConstraintWidget constraintWidget9 = this.f18150b;
                        if (constraintWidget9.w) {
                            WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget9.R);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.d != null) {
                    DependencyNode h5 = WidgetRun.h(constraintAnchor3);
                    if (h5 != null) {
                        WidgetRun.b(dependencyNode, h5, -this.f18150b.G[3].c());
                        WidgetRun.b(dependencyNode2, dependencyNode, -dimensionDependency.f18127g);
                    }
                    ConstraintWidget constraintWidget10 = this.f18150b;
                    if (constraintWidget10.w) {
                        WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget10.R);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.d != null) {
                    DependencyNode h6 = WidgetRun.h(constraintAnchor4);
                    if (h6 != null) {
                        WidgetRun.b(dependencyNode3, h6, 0);
                        WidgetRun.b(dependencyNode2, dependencyNode3, -this.f18150b.R);
                        WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.f18127g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof Helper) || constraintWidget7.K == null || constraintWidget7.h(ConstraintAnchor.Type.f18007g).d != null) {
                    return;
                }
                ConstraintWidget constraintWidget11 = this.f18150b;
                WidgetRun.b(dependencyNode2, constraintWidget11.K.e.f18154h, constraintWidget11.o());
                WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.f18127g);
                ConstraintWidget constraintWidget12 = this.f18150b;
                if (constraintWidget12.w) {
                    WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget12.R);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != dimensionBehaviour3) {
            dimensionDependency.b(this);
        } else {
            ConstraintWidget constraintWidget13 = this.f18150b;
            int i2 = constraintWidget13.f18024k;
            if (i2 == 2) {
                ConstraintWidget constraintWidget14 = constraintWidget13.K;
                if (constraintWidget14 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget14.e.e;
                    dimensionDependency.f18132l.add(dimensionDependency2);
                    dimensionDependency2.f18131k.add(dimensionDependency);
                    dimensionDependency.f18124b = true;
                    dimensionDependency.f18131k.add(dependencyNode2);
                    dimensionDependency.f18131k.add(dependencyNode);
                }
            } else if (i2 == 3 && !constraintWidget13.s()) {
                ConstraintWidget constraintWidget15 = this.f18150b;
                if (constraintWidget15.f18023j != 3) {
                    DimensionDependency dimensionDependency3 = constraintWidget15.d.e;
                    dimensionDependency.f18132l.add(dimensionDependency3);
                    dimensionDependency3.f18131k.add(dimensionDependency);
                    dimensionDependency.f18124b = true;
                    dimensionDependency.f18131k.add(dependencyNode2);
                    dimensionDependency.f18131k.add(dependencyNode);
                }
            }
        }
        ConstraintWidget constraintWidget16 = this.f18150b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget16.G;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.d;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].d != null) {
            if (constraintWidget16.s()) {
                dependencyNode2.f18126f = this.f18150b.G[2].c();
                dependencyNode.f18126f = -this.f18150b.G[3].c();
            } else {
                DependencyNode h7 = WidgetRun.h(this.f18150b.G[2]);
                DependencyNode h8 = WidgetRun.h(this.f18150b.G[3]);
                h7.b(this);
                h8.b(this);
                this.f18156j = WidgetRun.RunType.f18159b;
            }
            if (this.f18150b.w) {
                c(dependencyNode3, dependencyNode2, 1, this.f18147l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode h9 = WidgetRun.h(constraintAnchor5);
            if (h9 != null) {
                WidgetRun.b(dependencyNode2, h9, this.f18150b.G[2].c());
                c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                if (this.f18150b.w) {
                    c(dependencyNode3, dependencyNode2, 1, this.f18147l);
                }
                if (this.d == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget17 = this.f18150b;
                    if (constraintWidget17.N > 0.0f) {
                        HorizontalWidgetRun horizontalWidgetRun = constraintWidget17.d;
                        if (horizontalWidgetRun.d == dimensionBehaviour3) {
                            horizontalWidgetRun.e.f18131k.add(dimensionDependency);
                            dimensionDependency.f18132l.add(this.f18150b.d.e);
                            dimensionDependency.f18123a = this;
                        }
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.d != null) {
                DependencyNode h10 = WidgetRun.h(constraintAnchor7);
                if (h10 != null) {
                    WidgetRun.b(dependencyNode, h10, -this.f18150b.G[3].c());
                    c(dependencyNode2, dependencyNode, -1, dimensionDependency);
                    if (this.f18150b.w) {
                        c(dependencyNode3, dependencyNode2, 1, this.f18147l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.d != null) {
                    DependencyNode h11 = WidgetRun.h(constraintAnchor8);
                    if (h11 != null) {
                        WidgetRun.b(dependencyNode3, h11, 0);
                        c(dependencyNode2, dependencyNode3, -1, this.f18147l);
                        c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                    }
                } else if (!(constraintWidget16 instanceof Helper) && (constraintWidget3 = constraintWidget16.K) != null) {
                    WidgetRun.b(dependencyNode2, constraintWidget3.e.f18154h, constraintWidget16.o());
                    c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                    if (this.f18150b.w) {
                        c(dependencyNode3, dependencyNode2, 1, this.f18147l);
                    }
                    if (this.d == dimensionBehaviour3) {
                        ConstraintWidget constraintWidget18 = this.f18150b;
                        if (constraintWidget18.N > 0.0f) {
                            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidget18.d;
                            if (horizontalWidgetRun2.d == dimensionBehaviour3) {
                                horizontalWidgetRun2.e.f18131k.add(dimensionDependency);
                                dimensionDependency.f18132l.add(this.f18150b.d.e);
                                dimensionDependency.f18123a = this;
                            }
                        }
                    }
                }
            }
        }
        if (dimensionDependency.f18132l.size() == 0) {
            dimensionDependency.f18125c = true;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.f18154h;
        if (dependencyNode.f18130j) {
            this.f18150b.Q = dependencyNode.f18127g;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void f() {
        this.f18151c = null;
        this.f18154h.c();
        this.f18155i.c();
        this.f18146k.c();
        this.e.c();
        this.f18153g = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.f18042c || this.f18150b.f18024k == 0;
    }

    public final void m() {
        this.f18153g = false;
        DependencyNode dependencyNode = this.f18154h;
        dependencyNode.c();
        dependencyNode.f18130j = false;
        DependencyNode dependencyNode2 = this.f18155i;
        dependencyNode2.c();
        dependencyNode2.f18130j = false;
        DependencyNode dependencyNode3 = this.f18146k;
        dependencyNode3.c();
        dependencyNode3.f18130j = false;
        this.e.f18130j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f18150b.Y;
    }
}
