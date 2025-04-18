package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;

/* loaded from: classes2.dex */
public class HorizontalWidgetRun extends WidgetRun {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f18142k = new int[2];

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18143a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f18143a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18143a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18143a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f18154h.e = DependencyNode.Type.d;
        this.f18155i.e = DependencyNode.Type.f18136f;
        this.f18152f = 0;
    }

    public static void m(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x024a, code lost:
    
        if (r8 != 1) goto L128;
     */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.constraintlayout.solver.widgets.analyzer.Dependency r24) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.a(androidx.constraintlayout.solver.widgets.analyzer.Dependency):void");
    }

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
            dimensionDependency.d(constraintWidget5.m());
        }
        boolean z3 = dimensionDependency.f18130j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f18042c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f18040a;
        DependencyNode dependencyNode = this.f18155i;
        DependencyNode dependencyNode2 = this.f18154h;
        if (!z3) {
            ConstraintWidget constraintWidget6 = this.f18150b;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidget6.J[0];
            this.d = dimensionBehaviour4;
            if (dimensionBehaviour4 != dimensionBehaviour2) {
                if (dimensionBehaviour4 == dimensionBehaviour && (((constraintWidget4 = constraintWidget6.K) != null && constraintWidget4.J[0] == dimensionBehaviour3) || constraintWidget4.J[0] == dimensionBehaviour)) {
                    int m2 = (constraintWidget4.m() - this.f18150b.f18036y.c()) - this.f18150b.A.c();
                    HorizontalWidgetRun horizontalWidgetRun = constraintWidget4.d;
                    WidgetRun.b(dependencyNode2, horizontalWidgetRun.f18154h, this.f18150b.f18036y.c());
                    WidgetRun.b(dependencyNode, horizontalWidgetRun.f18155i, -this.f18150b.A.c());
                    dimensionDependency.d(m2);
                    return;
                }
                if (dimensionBehaviour4 == dimensionBehaviour3) {
                    dimensionDependency.d(constraintWidget6.m());
                }
            }
        } else if (this.d == dimensionBehaviour && (((constraintWidget2 = (constraintWidget = this.f18150b).K) != null && constraintWidget2.J[0] == dimensionBehaviour3) || constraintWidget2.J[0] == dimensionBehaviour)) {
            WidgetRun.b(dependencyNode2, constraintWidget2.d.f18154h, constraintWidget.f18036y.c());
            WidgetRun.b(dependencyNode, constraintWidget2.d.f18155i, -this.f18150b.A.c());
            return;
        }
        if (dimensionDependency.f18130j) {
            ConstraintWidget constraintWidget7 = this.f18150b;
            if (constraintWidget7.f18011a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.G;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.d;
                if (constraintAnchor2 != null && constraintAnchorArr[1].d != null) {
                    if (constraintWidget7.r()) {
                        dependencyNode2.f18126f = this.f18150b.G[0].c();
                        dependencyNode.f18126f = -this.f18150b.G[1].c();
                        return;
                    }
                    DependencyNode h2 = WidgetRun.h(this.f18150b.G[0]);
                    if (h2 != null) {
                        WidgetRun.b(dependencyNode2, h2, this.f18150b.G[0].c());
                    }
                    DependencyNode h3 = WidgetRun.h(this.f18150b.G[1]);
                    if (h3 != null) {
                        WidgetRun.b(dependencyNode, h3, -this.f18150b.G[1].c());
                    }
                    dependencyNode2.f18124b = true;
                    dependencyNode.f18124b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode h4 = WidgetRun.h(constraintAnchor);
                    if (h4 != null) {
                        WidgetRun.b(dependencyNode2, h4, this.f18150b.G[0].c());
                        WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.f18127g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.d != null) {
                    DependencyNode h5 = WidgetRun.h(constraintAnchor3);
                    if (h5 != null) {
                        WidgetRun.b(dependencyNode, h5, -this.f18150b.G[1].c());
                        WidgetRun.b(dependencyNode2, dependencyNode, -dimensionDependency.f18127g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof Helper) || constraintWidget7.K == null || constraintWidget7.h(ConstraintAnchor.Type.f18007g).d != null) {
                    return;
                }
                ConstraintWidget constraintWidget8 = this.f18150b;
                WidgetRun.b(dependencyNode2, constraintWidget8.K.d.f18154h, constraintWidget8.n());
                WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.f18127g);
                return;
            }
        }
        if (this.d == dimensionBehaviour2) {
            ConstraintWidget constraintWidget9 = this.f18150b;
            int i2 = constraintWidget9.f18023j;
            if (i2 == 2) {
                ConstraintWidget constraintWidget10 = constraintWidget9.K;
                if (constraintWidget10 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget10.e.e;
                    dimensionDependency.f18132l.add(dimensionDependency2);
                    dimensionDependency2.f18131k.add(dimensionDependency);
                    dimensionDependency.f18124b = true;
                    dimensionDependency.f18131k.add(dependencyNode2);
                    dimensionDependency.f18131k.add(dependencyNode);
                }
            } else if (i2 == 3) {
                if (constraintWidget9.f18024k == 3) {
                    dependencyNode2.f18123a = this;
                    dependencyNode.f18123a = this;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget9.e;
                    verticalWidgetRun.f18154h.f18123a = this;
                    verticalWidgetRun.f18155i.f18123a = this;
                    dimensionDependency.f18123a = this;
                    if (constraintWidget9.s()) {
                        dimensionDependency.f18132l.add(this.f18150b.e.e);
                        this.f18150b.e.e.f18131k.add(dimensionDependency);
                        VerticalWidgetRun verticalWidgetRun2 = this.f18150b.e;
                        verticalWidgetRun2.e.f18123a = this;
                        dimensionDependency.f18132l.add(verticalWidgetRun2.f18154h);
                        dimensionDependency.f18132l.add(this.f18150b.e.f18155i);
                        this.f18150b.e.f18154h.f18131k.add(dimensionDependency);
                        this.f18150b.e.f18155i.f18131k.add(dimensionDependency);
                    } else if (this.f18150b.r()) {
                        this.f18150b.e.e.f18132l.add(dimensionDependency);
                        dimensionDependency.f18131k.add(this.f18150b.e.e);
                    } else {
                        this.f18150b.e.e.f18132l.add(dimensionDependency);
                    }
                } else {
                    DimensionDependency dimensionDependency3 = constraintWidget9.e.e;
                    dimensionDependency.f18132l.add(dimensionDependency3);
                    dimensionDependency3.f18131k.add(dimensionDependency);
                    this.f18150b.e.f18154h.f18131k.add(dimensionDependency);
                    this.f18150b.e.f18155i.f18131k.add(dimensionDependency);
                    dimensionDependency.f18124b = true;
                    dimensionDependency.f18131k.add(dependencyNode2);
                    dimensionDependency.f18131k.add(dependencyNode);
                    dependencyNode2.f18132l.add(dimensionDependency);
                    dependencyNode.f18132l.add(dimensionDependency);
                }
            }
        }
        ConstraintWidget constraintWidget11 = this.f18150b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget11.G;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.d;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].d != null) {
            if (constraintWidget11.r()) {
                dependencyNode2.f18126f = this.f18150b.G[0].c();
                dependencyNode.f18126f = -this.f18150b.G[1].c();
                return;
            }
            DependencyNode h6 = WidgetRun.h(this.f18150b.G[0]);
            DependencyNode h7 = WidgetRun.h(this.f18150b.G[1]);
            h6.b(this);
            h7.b(this);
            this.f18156j = WidgetRun.RunType.f18159b;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode h8 = WidgetRun.h(constraintAnchor4);
            if (h8 != null) {
                WidgetRun.b(dependencyNode2, h8, this.f18150b.G[0].c());
                c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.d != null) {
            DependencyNode h9 = WidgetRun.h(constraintAnchor6);
            if (h9 != null) {
                WidgetRun.b(dependencyNode, h9, -this.f18150b.G[1].c());
                c(dependencyNode2, dependencyNode, -1, dimensionDependency);
                return;
            }
            return;
        }
        if ((constraintWidget11 instanceof Helper) || (constraintWidget3 = constraintWidget11.K) == null) {
            return;
        }
        WidgetRun.b(dependencyNode2, constraintWidget3.d.f18154h, constraintWidget11.n());
        c(dependencyNode, dependencyNode2, 1, dimensionDependency);
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.f18154h;
        if (dependencyNode.f18130j) {
            this.f18150b.P = dependencyNode.f18127g;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void f() {
        this.f18151c = null;
        this.f18154h.c();
        this.f18155i.c();
        this.e.c();
        this.f18153g = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.f18042c || this.f18150b.f18023j == 0;
    }

    public final void n() {
        this.f18153g = false;
        DependencyNode dependencyNode = this.f18154h;
        dependencyNode.c();
        dependencyNode.f18130j = false;
        DependencyNode dependencyNode2 = this.f18155i;
        dependencyNode2.c();
        dependencyNode2.f18130j = false;
        this.e.f18130j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f18150b.Y;
    }
}
