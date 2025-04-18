package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public abstract class WidgetRun implements Dependency {

    /* renamed from: a, reason: collision with root package name */
    public int f18149a;

    /* renamed from: b, reason: collision with root package name */
    public ConstraintWidget f18150b;

    /* renamed from: c, reason: collision with root package name */
    public RunGroup f18151c;
    public ConstraintWidget.DimensionBehaviour d;
    public final DimensionDependency e = new DimensionDependency(this);

    /* renamed from: f, reason: collision with root package name */
    public int f18152f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18153g = false;

    /* renamed from: h, reason: collision with root package name */
    public final DependencyNode f18154h = new DependencyNode(this);

    /* renamed from: i, reason: collision with root package name */
    public final DependencyNode f18155i = new DependencyNode(this);

    /* renamed from: j, reason: collision with root package name */
    public RunType f18156j = RunType.f18158a;

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18157a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f18157a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18157a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18157a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18157a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18157a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class RunType {

        /* renamed from: a, reason: collision with root package name */
        public static final RunType f18158a;

        /* renamed from: b, reason: collision with root package name */
        public static final RunType f18159b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ RunType[] f18160c;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType] */
        static {
            ?? r02 = new Enum("NONE", 0);
            f18158a = r02;
            ?? r1 = new Enum("START", 1);
            ?? r2 = new Enum("END", 2);
            ?? r3 = new Enum("CENTER", 3);
            f18159b = r3;
            f18160c = new RunType[]{r02, r1, r2, r3};
        }

        public static RunType valueOf(String str) {
            return (RunType) Enum.valueOf(RunType.class, str);
        }

        public static RunType[] values() {
            return (RunType[]) f18160c.clone();
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f18150b = constraintWidget;
    }

    public static void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2) {
        dependencyNode.f18132l.add(dependencyNode2);
        dependencyNode.f18126f = i2;
        dependencyNode2.f18131k.add(dependencyNode);
    }

    public static DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.d;
        if (constraintAnchor2 == null) {
            return null;
        }
        int ordinal = constraintAnchor2.f17999c.ordinal();
        ConstraintWidget constraintWidget = constraintAnchor2.f17998b;
        if (ordinal == 1) {
            return constraintWidget.d.f18154h;
        }
        if (ordinal == 2) {
            return constraintWidget.e.f18154h;
        }
        if (ordinal == 3) {
            return constraintWidget.d.f18155i;
        }
        if (ordinal == 4) {
            return constraintWidget.e.f18155i;
        }
        if (ordinal != 5) {
            return null;
        }
        return constraintWidget.e.f18146k;
    }

    public static DependencyNode i(ConstraintAnchor constraintAnchor, int i2) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.d;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f17998b;
        WidgetRun widgetRun = i2 == 0 ? constraintWidget.d : constraintWidget.e;
        int ordinal = constraintAnchor2.f17999c.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return widgetRun.f18154h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return widgetRun.f18155i;
        }
        return null;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public void a(Dependency dependency) {
    }

    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2, DimensionDependency dimensionDependency) {
        dependencyNode.f18132l.add(dependencyNode2);
        dependencyNode.f18132l.add(this.e);
        dependencyNode.f18128h = i2;
        dependencyNode.f18129i = dimensionDependency;
        dependencyNode2.f18131k.add(dependencyNode);
        dimensionDependency.f18131k.add(dependencyNode);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int max;
        if (i3 == 0) {
            ConstraintWidget constraintWidget = this.f18150b;
            int i4 = constraintWidget.f18027n;
            max = Math.max(constraintWidget.f18026m, i2);
            if (i4 > 0) {
                max = Math.min(i4, i2);
            }
            if (max == i2) {
                return i2;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f18150b;
            int i5 = constraintWidget2.f18030q;
            max = Math.max(constraintWidget2.f18029p, i2);
            if (i5 > 0) {
                max = Math.min(i5, i2);
            }
            if (max == i2) {
                return i2;
            }
        }
        return max;
    }

    public long j() {
        if (this.e.f18130j) {
            return r0.f18127g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2) {
        DependencyNode h2 = h(constraintAnchor);
        DependencyNode h3 = h(constraintAnchor2);
        if (h2.f18130j && h3.f18130j) {
            int c2 = constraintAnchor.c() + h2.f18127g;
            int c3 = h3.f18127g - constraintAnchor2.c();
            int i3 = c3 - c2;
            DimensionDependency dimensionDependency = this.e;
            if (!dimensionDependency.f18130j) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f18042c;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    int i4 = this.f18149a;
                    if (i4 == 0) {
                        dimensionDependency.d(g(i3, i2));
                    } else if (i4 == 1) {
                        dimensionDependency.d(Math.min(g(dimensionDependency.f18141m, i2), i3));
                    } else if (i4 == 2) {
                        ConstraintWidget constraintWidget = this.f18150b;
                        ConstraintWidget constraintWidget2 = constraintWidget.K;
                        if (constraintWidget2 != null) {
                            if ((i2 == 0 ? constraintWidget2.d : constraintWidget2.e).e.f18130j) {
                                dimensionDependency.d(g((int) ((r6.f18127g * (i2 == 0 ? constraintWidget.f18028o : constraintWidget.f18031r)) + 0.5f), i2));
                            }
                        }
                    } else if (i4 == 3) {
                        ConstraintWidget constraintWidget3 = this.f18150b;
                        WidgetRun widgetRun = constraintWidget3.d;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = widgetRun.d;
                        WidgetRun widgetRun2 = constraintWidget3.e;
                        if (dimensionBehaviour3 != dimensionBehaviour2 || widgetRun.f18149a != 3 || widgetRun2.d != dimensionBehaviour2 || widgetRun2.f18149a != 3) {
                            if (i2 == 0) {
                                widgetRun = widgetRun2;
                            }
                            if (widgetRun.e.f18130j) {
                                float f2 = constraintWidget3.N;
                                dimensionDependency.d(i2 == 1 ? (int) ((r6.f18127g / f2) + 0.5f) : (int) ((f2 * r6.f18127g) + 0.5f));
                            }
                        }
                    }
                }
            }
            if (dimensionDependency.f18130j) {
                int i5 = dimensionDependency.f18127g;
                DependencyNode dependencyNode = this.f18155i;
                DependencyNode dependencyNode2 = this.f18154h;
                if (i5 == i3) {
                    dependencyNode2.d(c2);
                    dependencyNode.d(c3);
                    return;
                }
                ConstraintWidget constraintWidget4 = this.f18150b;
                float f3 = i2 == 0 ? constraintWidget4.U : constraintWidget4.V;
                if (h2 == h3) {
                    c2 = h2.f18127g;
                    c3 = h3.f18127g;
                    f3 = 0.5f;
                }
                dependencyNode2.d((int) ((((c3 - c2) - i5) * f3) + c2 + 0.5f));
                dependencyNode.d(dependencyNode2.f18127g + dimensionDependency.f18127g);
            }
        }
    }
}
