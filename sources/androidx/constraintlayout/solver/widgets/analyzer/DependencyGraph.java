package androidx.constraintlayout.solver.widgets.analyzer;

import android.support.v4.media.d;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class DependencyGraph {

    /* renamed from: a, reason: collision with root package name */
    public ConstraintWidgetContainer f18117a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18118b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18119c;
    public ConstraintWidgetContainer d;
    public ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public BasicMeasure.Measurer f18120f;

    /* renamed from: g, reason: collision with root package name */
    public BasicMeasure.Measure f18121g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f18122h;

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, androidx.constraintlayout.solver.widgets.analyzer.RunGroup] */
    public final void a(DependencyNode dependencyNode, int i2, ArrayList arrayList, RunGroup runGroup) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun.f18151c == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.f18117a;
            if (widgetRun != constraintWidgetContainer.d) {
                RunGroup runGroup2 = runGroup;
                if (widgetRun == constraintWidgetContainer.e) {
                    return;
                }
                if (runGroup == null) {
                    ?? obj = new Object();
                    obj.f18144a = null;
                    obj.f18145b = new ArrayList();
                    obj.f18144a = widgetRun;
                    arrayList.add(obj);
                    runGroup2 = obj;
                }
                widgetRun.f18151c = runGroup2;
                runGroup2.f18145b.add(widgetRun);
                DependencyNode dependencyNode2 = widgetRun.f18154h;
                Iterator it = dependencyNode2.f18131k.iterator();
                while (it.hasNext()) {
                    Dependency dependency = (Dependency) it.next();
                    if (dependency instanceof DependencyNode) {
                        a((DependencyNode) dependency, i2, arrayList, runGroup2);
                    }
                }
                DependencyNode dependencyNode3 = widgetRun.f18155i;
                Iterator it2 = dependencyNode3.f18131k.iterator();
                while (it2.hasNext()) {
                    Dependency dependency2 = (Dependency) it2.next();
                    if (dependency2 instanceof DependencyNode) {
                        a((DependencyNode) dependency2, i2, arrayList, runGroup2);
                    }
                }
                if (i2 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                    Iterator it3 = ((VerticalWidgetRun) widgetRun).f18146k.f18131k.iterator();
                    while (it3.hasNext()) {
                        Dependency dependency3 = (Dependency) it3.next();
                        if (dependency3 instanceof DependencyNode) {
                            a((DependencyNode) dependency3, i2, arrayList, runGroup2);
                        }
                    }
                }
                Iterator it4 = dependencyNode2.f18132l.iterator();
                while (it4.hasNext()) {
                    a((DependencyNode) it4.next(), i2, arrayList, runGroup2);
                }
                Iterator it5 = dependencyNode3.f18132l.iterator();
                while (it5.hasNext()) {
                    a((DependencyNode) it5.next(), i2, arrayList, runGroup2);
                }
                if (i2 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                    Iterator it6 = ((VerticalWidgetRun) widgetRun).f18146k.f18132l.iterator();
                    while (it6.hasNext()) {
                        a((DependencyNode) it6.next(), i2, arrayList, runGroup2);
                    }
                }
            }
        }
    }

    public final void b(ConstraintWidgetContainer constraintWidgetContainer) {
        int i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        VerticalWidgetRun verticalWidgetRun2;
        HorizontalWidgetRun horizontalWidgetRun2;
        Iterator it = constraintWidgetContainer.f18102f0.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.J;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr2[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr2[1];
            if (constraintWidget.X == 8) {
                constraintWidget.f18011a = true;
            } else {
                float f2 = constraintWidget.f18028o;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.f18042c;
                if (f2 < 1.0f && dimensionBehaviour4 == dimensionBehaviour6) {
                    constraintWidget.f18023j = 2;
                }
                float f3 = constraintWidget.f18031r;
                if (f3 < 1.0f && dimensionBehaviour5 == dimensionBehaviour6) {
                    constraintWidget.f18024k = 2;
                }
                float f4 = constraintWidget.N;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.f18041b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.f18040a;
                if (f4 > 0.0f) {
                    if (dimensionBehaviour4 == dimensionBehaviour6 && (dimensionBehaviour5 == dimensionBehaviour7 || dimensionBehaviour5 == dimensionBehaviour8)) {
                        constraintWidget.f18023j = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour6 && (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == dimensionBehaviour8)) {
                        constraintWidget.f18024k = 3;
                    } else if (dimensionBehaviour4 == dimensionBehaviour6 && dimensionBehaviour5 == dimensionBehaviour6) {
                        if (constraintWidget.f18023j == 0) {
                            constraintWidget.f18023j = 3;
                        }
                        if (constraintWidget.f18024k == 0) {
                            constraintWidget.f18024k = 3;
                        }
                    }
                }
                ConstraintAnchor constraintAnchor = constraintWidget.A;
                ConstraintAnchor constraintAnchor2 = constraintWidget.f18036y;
                if (dimensionBehaviour4 == dimensionBehaviour6 && constraintWidget.f18023j == 1 && (constraintAnchor2.d == null || constraintAnchor.d == null)) {
                    dimensionBehaviour4 = dimensionBehaviour7;
                }
                ConstraintAnchor constraintAnchor3 = constraintWidget.B;
                ConstraintAnchor constraintAnchor4 = constraintWidget.f18037z;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = (dimensionBehaviour5 == dimensionBehaviour6 && constraintWidget.f18024k == 1 && (constraintAnchor4.d == null || constraintAnchor3.d == null)) ? dimensionBehaviour7 : dimensionBehaviour5;
                HorizontalWidgetRun horizontalWidgetRun3 = constraintWidget.d;
                horizontalWidgetRun3.d = dimensionBehaviour4;
                int i3 = constraintWidget.f18023j;
                horizontalWidgetRun3.f18149a = i3;
                VerticalWidgetRun verticalWidgetRun3 = constraintWidget.e;
                verticalWidgetRun3.d = dimensionBehaviour9;
                Iterator it2 = it;
                int i4 = constraintWidget.f18024k;
                verticalWidgetRun3.f18149a = i4;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.d;
                if ((dimensionBehaviour4 == dimensionBehaviour10 || dimensionBehaviour4 == dimensionBehaviour8 || dimensionBehaviour4 == dimensionBehaviour7) && (dimensionBehaviour9 == dimensionBehaviour10 || dimensionBehaviour9 == dimensionBehaviour8 || dimensionBehaviour9 == dimensionBehaviour7)) {
                    int m2 = constraintWidget.m();
                    if (dimensionBehaviour4 == dimensionBehaviour10) {
                        m2 = (constraintWidgetContainer.m() - constraintAnchor2.e) - constraintAnchor.e;
                        dimensionBehaviour4 = dimensionBehaviour8;
                    }
                    int j2 = constraintWidget.j();
                    if (dimensionBehaviour9 == dimensionBehaviour10) {
                        i2 = (constraintWidgetContainer.j() - constraintAnchor4.e) - constraintAnchor3.e;
                        dimensionBehaviour = dimensionBehaviour8;
                    } else {
                        i2 = j2;
                        dimensionBehaviour = dimensionBehaviour9;
                    }
                    h(constraintWidget, dimensionBehaviour4, m2, dimensionBehaviour, i2);
                    horizontalWidgetRun3.e.d(constraintWidget.m());
                    verticalWidgetRun3.e.d(constraintWidget.j());
                    constraintWidget.f18011a = true;
                } else {
                    ConstraintAnchor[] constraintAnchorArr = constraintWidget.G;
                    if (dimensionBehaviour4 != dimensionBehaviour6 || (dimensionBehaviour9 != dimensionBehaviour7 && dimensionBehaviour9 != dimensionBehaviour8)) {
                        verticalWidgetRun = verticalWidgetRun3;
                        horizontalWidgetRun = horizontalWidgetRun3;
                    } else if (i3 == 3) {
                        if (dimensionBehaviour9 == dimensionBehaviour7) {
                            horizontalWidgetRun2 = horizontalWidgetRun3;
                            verticalWidgetRun2 = verticalWidgetRun3;
                            h(constraintWidget, dimensionBehaviour7, 0, dimensionBehaviour7, 0);
                        } else {
                            verticalWidgetRun2 = verticalWidgetRun3;
                            horizontalWidgetRun2 = horizontalWidgetRun3;
                        }
                        int j3 = constraintWidget.j();
                        h(constraintWidget, dimensionBehaviour8, (int) ((j3 * constraintWidget.N) + 0.5f), dimensionBehaviour8, j3);
                        horizontalWidgetRun2.e.d(constraintWidget.m());
                        verticalWidgetRun2.e.d(constraintWidget.j());
                        constraintWidget.f18011a = true;
                    } else {
                        verticalWidgetRun = verticalWidgetRun3;
                        horizontalWidgetRun = horizontalWidgetRun3;
                        if (i3 == 1) {
                            h(constraintWidget, dimensionBehaviour7, 0, dimensionBehaviour9, 0);
                            horizontalWidgetRun.e.f18141m = constraintWidget.m();
                        } else if (i3 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = constraintWidgetContainer.J[0];
                            if (dimensionBehaviour11 == dimensionBehaviour8 || dimensionBehaviour11 == dimensionBehaviour10) {
                                h(constraintWidget, dimensionBehaviour8, (int) ((f2 * constraintWidgetContainer.m()) + 0.5f), dimensionBehaviour9, constraintWidget.j());
                                horizontalWidgetRun.e.d(constraintWidget.m());
                                verticalWidgetRun.e.d(constraintWidget.j());
                                constraintWidget.f18011a = true;
                            }
                        } else if (constraintAnchorArr[0].d == null || constraintAnchorArr[1].d == null) {
                            h(constraintWidget, dimensionBehaviour7, 0, dimensionBehaviour9, 0);
                            horizontalWidgetRun.e.d(constraintWidget.m());
                            verticalWidgetRun.e.d(constraintWidget.j());
                            constraintWidget.f18011a = true;
                        }
                    }
                    if (dimensionBehaviour9 == dimensionBehaviour6 && (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == dimensionBehaviour8)) {
                        if (i4 == 3) {
                            if (dimensionBehaviour4 == dimensionBehaviour7) {
                                h(constraintWidget, dimensionBehaviour7, 0, dimensionBehaviour7, 0);
                            }
                            int m3 = constraintWidget.m();
                            float f5 = constraintWidget.N;
                            if (constraintWidget.O == -1) {
                                f5 = 1.0f / f5;
                            }
                            h(constraintWidget, dimensionBehaviour8, m3, dimensionBehaviour8, (int) ((m3 * f5) + 0.5f));
                            horizontalWidgetRun.e.d(constraintWidget.m());
                            verticalWidgetRun.e.d(constraintWidget.j());
                            constraintWidget.f18011a = true;
                        } else if (i4 == 1) {
                            h(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour7, 0);
                            verticalWidgetRun.e.f18141m = constraintWidget.j();
                        } else if (i4 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = constraintWidgetContainer.J[1];
                            if (dimensionBehaviour12 == dimensionBehaviour8 || dimensionBehaviour12 == dimensionBehaviour10) {
                                h(constraintWidget, dimensionBehaviour4, constraintWidget.m(), dimensionBehaviour8, (int) ((f3 * constraintWidgetContainer.j()) + 0.5f));
                                horizontalWidgetRun.e.d(constraintWidget.m());
                                verticalWidgetRun.e.d(constraintWidget.j());
                                constraintWidget.f18011a = true;
                            }
                        } else if (constraintAnchorArr[2].d == null || constraintAnchorArr[3].d == null) {
                            h(constraintWidget, dimensionBehaviour7, 0, dimensionBehaviour9, 0);
                            horizontalWidgetRun.e.d(constraintWidget.m());
                            verticalWidgetRun.e.d(constraintWidget.j());
                            constraintWidget.f18011a = true;
                        }
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour6 && dimensionBehaviour9 == dimensionBehaviour6) {
                        if (i3 == 1 || i4 == 1) {
                            h(constraintWidget, dimensionBehaviour7, 0, dimensionBehaviour7, 0);
                            horizontalWidgetRun.e.f18141m = constraintWidget.m();
                            verticalWidgetRun.e.f18141m = constraintWidget.j();
                        } else if (i4 == 2 && i3 == 2 && (((dimensionBehaviour2 = (dimensionBehaviourArr = constraintWidgetContainer.J)[0]) == dimensionBehaviour8 || dimensionBehaviour2 == dimensionBehaviour8) && ((dimensionBehaviour3 = dimensionBehaviourArr[1]) == dimensionBehaviour8 || dimensionBehaviour3 == dimensionBehaviour8))) {
                            h(constraintWidget, dimensionBehaviour8, (int) ((f2 * constraintWidgetContainer.m()) + 0.5f), dimensionBehaviour8, (int) ((f3 * constraintWidgetContainer.j()) + 0.5f));
                            horizontalWidgetRun.e.d(constraintWidget.m());
                            verticalWidgetRun.e.d(constraintWidget.j());
                            constraintWidget.f18011a = true;
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ConstraintWidgetContainer constraintWidgetContainer = this.d;
        constraintWidgetContainer.d.f();
        VerticalWidgetRun verticalWidgetRun = constraintWidgetContainer.e;
        verticalWidgetRun.f();
        arrayList.add(constraintWidgetContainer.d);
        arrayList.add(verticalWidgetRun);
        Iterator it = constraintWidgetContainer.f18102f0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (constraintWidget instanceof Guideline) {
                WidgetRun widgetRun = new WidgetRun(constraintWidget);
                constraintWidget.d.f();
                constraintWidget.e.f();
                widgetRun.f18152f = ((Guideline) constraintWidget).f18086j0;
                arrayList.add(widgetRun);
            } else {
                if (constraintWidget.r()) {
                    if (constraintWidget.f18013b == null) {
                        constraintWidget.f18013b = new ChainRun(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f18013b);
                } else {
                    arrayList.add(constraintWidget.d);
                }
                if (constraintWidget.s()) {
                    if (constraintWidget.f18015c == null) {
                        constraintWidget.f18015c = new ChainRun(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f18015c);
                } else {
                    arrayList.add(constraintWidget.e);
                }
                if (constraintWidget instanceof HelperWidget) {
                    arrayList.add(new WidgetRun(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((WidgetRun) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun widgetRun2 = (WidgetRun) it3.next();
            if (widgetRun2.f18150b != constraintWidgetContainer) {
                widgetRun2.d();
            }
        }
        ArrayList arrayList2 = this.f18122h;
        arrayList2.clear();
        ConstraintWidgetContainer constraintWidgetContainer2 = this.f18117a;
        g(constraintWidgetContainer2.d, 0, arrayList2);
        g(constraintWidgetContainer2.e, 1, arrayList2);
        this.f18118b = false;
    }

    public final int d(ConstraintWidgetContainer constraintWidgetContainer, int i2) {
        ArrayList arrayList;
        int i3;
        int i4;
        long max;
        float f2;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        ArrayList arrayList2 = this.f18122h;
        int size = arrayList2.size();
        int i5 = 0;
        long j2 = 0;
        while (i5 < size) {
            WidgetRun widgetRun = ((RunGroup) arrayList2.get(i5)).f18144a;
            if (!(widgetRun instanceof ChainRun) ? !(i2 != 0 ? (widgetRun instanceof VerticalWidgetRun) : (widgetRun instanceof HorizontalWidgetRun)) : ((ChainRun) widgetRun).f18152f != i2) {
                DependencyNode dependencyNode = (i2 == 0 ? constraintWidgetContainer2.d : constraintWidgetContainer2.e).f18154h;
                DependencyNode dependencyNode2 = (i2 == 0 ? constraintWidgetContainer2.d : constraintWidgetContainer2.e).f18155i;
                boolean contains = widgetRun.f18154h.f18132l.contains(dependencyNode);
                DependencyNode dependencyNode3 = widgetRun.f18155i;
                boolean contains2 = dependencyNode3.f18132l.contains(dependencyNode2);
                long j3 = widgetRun.j();
                DependencyNode dependencyNode4 = widgetRun.f18154h;
                if (contains && contains2) {
                    long b2 = RunGroup.b(dependencyNode4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i3 = size;
                    long a2 = RunGroup.a(dependencyNode3, 0L);
                    long j4 = b2 - j3;
                    int i6 = dependencyNode3.f18126f;
                    arrayList = arrayList3;
                    i4 = i5;
                    if (j4 >= (-i6)) {
                        j4 += i6;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = dependencyNode4.f18126f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    ConstraintWidget constraintWidget = widgetRun.f18150b;
                    if (i2 == 0) {
                        f2 = constraintWidget.U;
                    } else if (i2 == 1) {
                        f2 = constraintWidget.V;
                    } else {
                        constraintWidget.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = (float) (f2 > 0.0f ? (((float) j4) / (1.0f - f2)) + (((float) j7) / f2) : 0L);
                    max = (dependencyNode4.f18126f + ((((f3 * f2) + 0.5f) + j3) + d.a(1.0f, f2, f3, 0.5f))) - dependencyNode3.f18126f;
                } else {
                    arrayList = arrayList2;
                    i3 = size;
                    i4 = i5;
                    max = contains ? Math.max(RunGroup.b(dependencyNode4, dependencyNode4.f18126f), dependencyNode4.f18126f + j3) : contains2 ? Math.max(-RunGroup.a(dependencyNode3, dependencyNode3.f18126f), (-dependencyNode3.f18126f) + j3) : (widgetRun.j() + dependencyNode4.f18126f) - dependencyNode3.f18126f;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                i4 = i5;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i5 = i4 + 1;
            constraintWidgetContainer2 = constraintWidgetContainer;
            size = i3;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    public final boolean e(boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = z2 & true;
        boolean z6 = this.f18118b;
        ConstraintWidgetContainer constraintWidgetContainer = this.f18117a;
        if (z6 || this.f18119c) {
            Iterator it = constraintWidgetContainer.f18102f0.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
                constraintWidget.f18011a = false;
                constraintWidget.d.n();
                constraintWidget.e.m();
            }
            constraintWidgetContainer.f18011a = false;
            constraintWidgetContainer.d.n();
            constraintWidgetContainer.e.m();
            this.f18119c = false;
        }
        b(this.d);
        constraintWidgetContainer.P = 0;
        constraintWidgetContainer.Q = 0;
        ConstraintWidget.DimensionBehaviour i2 = constraintWidgetContainer.i(0);
        ConstraintWidget.DimensionBehaviour i3 = constraintWidgetContainer.i(1);
        if (this.f18118b) {
            c();
        }
        int n2 = constraintWidgetContainer.n();
        int o2 = constraintWidgetContainer.o();
        constraintWidgetContainer.d.f18154h.d(n2);
        constraintWidgetContainer.e.f18154h.d(o2);
        i();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f18041b;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f18040a;
        ArrayList arrayList = this.e;
        if (i2 == dimensionBehaviour || i3 == dimensionBehaviour) {
            if (z5) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((WidgetRun) it2.next()).k()) {
                        z5 = false;
                        break;
                    }
                }
            }
            if (z5 && i2 == dimensionBehaviour) {
                constraintWidgetContainer.x(dimensionBehaviour2);
                constraintWidgetContainer.z(d(constraintWidgetContainer, 0));
                constraintWidgetContainer.d.e.d(constraintWidgetContainer.m());
            }
            if (z5 && i3 == dimensionBehaviour) {
                constraintWidgetContainer.y(dimensionBehaviour2);
                constraintWidgetContainer.w(d(constraintWidgetContainer, 1));
                constraintWidgetContainer.e.e.d(constraintWidgetContainer.j());
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidgetContainer.J[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.d;
        if (dimensionBehaviour3 == dimensionBehaviour2 || dimensionBehaviour3 == dimensionBehaviour4) {
            int m2 = constraintWidgetContainer.m() + n2;
            constraintWidgetContainer.d.f18155i.d(m2);
            constraintWidgetContainer.d.e.d(m2 - n2);
            i();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer.J[1];
            if (dimensionBehaviour5 == dimensionBehaviour2 || dimensionBehaviour5 == dimensionBehaviour4) {
                int j2 = constraintWidgetContainer.j() + o2;
                constraintWidgetContainer.e.f18155i.d(j2);
                constraintWidgetContainer.e.e.d(j2 - o2);
            }
            i();
            z3 = true;
        } else {
            z3 = false;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it3.next();
            if (widgetRun.f18150b != constraintWidgetContainer || widgetRun.f18153g) {
                widgetRun.e();
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            WidgetRun widgetRun2 = (WidgetRun) it4.next();
            if (z3 || widgetRun2.f18150b != constraintWidgetContainer) {
                if (!widgetRun2.f18154h.f18130j || ((!widgetRun2.f18155i.f18130j && !(widgetRun2 instanceof GuidelineReference)) || (!widgetRun2.e.f18130j && !(widgetRun2 instanceof ChainRun) && !(widgetRun2 instanceof GuidelineReference)))) {
                    z4 = false;
                    break;
                }
            }
        }
        constraintWidgetContainer.x(i2);
        constraintWidgetContainer.y(i3);
        return z4;
    }

    public final boolean f(int i2, boolean z2) {
        boolean z3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z4 = true;
        boolean z5 = z2 & true;
        ConstraintWidgetContainer constraintWidgetContainer = this.f18117a;
        ConstraintWidget.DimensionBehaviour i3 = constraintWidgetContainer.i(0);
        ConstraintWidget.DimensionBehaviour i4 = constraintWidgetContainer.i(1);
        int n2 = constraintWidgetContainer.n();
        int o2 = constraintWidgetContainer.o();
        ArrayList arrayList = this.e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f18040a;
        if (z5 && (i3 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f18041b) || i4 == dimensionBehaviour)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WidgetRun widgetRun = (WidgetRun) it.next();
                if (widgetRun.f18152f == i2 && !widgetRun.k()) {
                    z5 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z5 && i3 == dimensionBehaviour) {
                    constraintWidgetContainer.x(dimensionBehaviour2);
                    constraintWidgetContainer.z(d(constraintWidgetContainer, 0));
                    constraintWidgetContainer.d.e.d(constraintWidgetContainer.m());
                }
            } else if (z5 && i4 == dimensionBehaviour) {
                constraintWidgetContainer.y(dimensionBehaviour2);
                constraintWidgetContainer.w(d(constraintWidgetContainer, 1));
                constraintWidgetContainer.e.e.d(constraintWidgetContainer.j());
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.d;
        if (i2 == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer.J[0];
            if (dimensionBehaviour4 == dimensionBehaviour2 || dimensionBehaviour4 == dimensionBehaviour3) {
                int m2 = constraintWidgetContainer.m() + n2;
                constraintWidgetContainer.d.f18155i.d(m2);
                constraintWidgetContainer.d.e.d(m2 - n2);
                z3 = true;
            }
            z3 = false;
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer.J[1];
            if (dimensionBehaviour5 == dimensionBehaviour2 || dimensionBehaviour5 == dimensionBehaviour3) {
                int j2 = constraintWidgetContainer.j() + o2;
                constraintWidgetContainer.e.f18155i.d(j2);
                constraintWidgetContainer.e.e.d(j2 - o2);
                z3 = true;
            }
            z3 = false;
        }
        i();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            WidgetRun widgetRun2 = (WidgetRun) it2.next();
            if (widgetRun2.f18152f == i2 && (widgetRun2.f18150b != constraintWidgetContainer || widgetRun2.f18153g)) {
                widgetRun2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun widgetRun3 = (WidgetRun) it3.next();
            if (widgetRun3.f18152f == i2 && (z3 || widgetRun3.f18150b != constraintWidgetContainer)) {
                if (!widgetRun3.f18154h.f18130j || !widgetRun3.f18155i.f18130j || (!(widgetRun3 instanceof ChainRun) && !widgetRun3.e.f18130j)) {
                    z4 = false;
                    break;
                }
            }
        }
        constraintWidgetContainer.x(i3);
        constraintWidgetContainer.y(i4);
        return z4;
    }

    public final void g(WidgetRun widgetRun, int i2, ArrayList arrayList) {
        DependencyNode dependencyNode;
        Iterator it = widgetRun.f18154h.f18131k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dependencyNode = widgetRun.f18155i;
            if (!hasNext) {
                break;
            }
            Dependency dependency = (Dependency) it.next();
            if (dependency instanceof DependencyNode) {
                a((DependencyNode) dependency, i2, arrayList, null);
            } else if (dependency instanceof WidgetRun) {
                a(((WidgetRun) dependency).f18154h, i2, arrayList, null);
            }
        }
        Iterator it2 = dependencyNode.f18131k.iterator();
        while (it2.hasNext()) {
            Dependency dependency2 = (Dependency) it2.next();
            if (dependency2 instanceof DependencyNode) {
                a((DependencyNode) dependency2, i2, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                a(((WidgetRun) dependency2).f18155i, i2, arrayList, null);
            }
        }
        if (i2 == 1) {
            Iterator it3 = ((VerticalWidgetRun) widgetRun).f18146k.f18131k.iterator();
            while (it3.hasNext()) {
                Dependency dependency3 = (Dependency) it3.next();
                if (dependency3 instanceof DependencyNode) {
                    a((DependencyNode) dependency3, i2, arrayList, null);
                }
            }
        }
    }

    public final void h(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i2, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i3) {
        BasicMeasure.Measure measure = this.f18121g;
        measure.f18106a = dimensionBehaviour;
        measure.f18107b = dimensionBehaviour2;
        measure.f18108c = i2;
        measure.d = i3;
        this.f18120f.b(constraintWidget, measure);
        constraintWidget.z(measure.e);
        constraintWidget.w(measure.f18109f);
        constraintWidget.w = measure.f18111h;
        int i4 = measure.f18110g;
        constraintWidget.R = i4;
        constraintWidget.w = i4 > 0;
    }

    public final void i() {
        BaselineDimensionDependency baselineDimensionDependency;
        Iterator it = this.f18117a.f18102f0.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (!constraintWidget.f18011a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.J;
                boolean z2 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i2 = constraintWidget.f18023j;
                int i3 = constraintWidget.f18024k;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f18041b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f18042c;
                boolean z3 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == dimensionBehaviour4 && i2 == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == dimensionBehaviour4 && i3 == 1)) {
                    z2 = true;
                }
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget.d;
                DimensionDependency dimensionDependency = horizontalWidgetRun.e;
                boolean z4 = dimensionDependency.f18130j;
                VerticalWidgetRun verticalWidgetRun = constraintWidget.e;
                DimensionDependency dimensionDependency2 = verticalWidgetRun.e;
                boolean z5 = dimensionDependency2.f18130j;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f18040a;
                if (z4 && z5) {
                    h(constraintWidget, dimensionBehaviour5, dimensionDependency.f18127g, dimensionBehaviour5, dimensionDependency2.f18127g);
                    constraintWidget.f18011a = true;
                } else if (z4 && z2) {
                    h(constraintWidget, dimensionBehaviour5, dimensionDependency.f18127g, dimensionBehaviour3, dimensionDependency2.f18127g);
                    if (dimensionBehaviour2 == dimensionBehaviour4) {
                        verticalWidgetRun.e.f18141m = constraintWidget.j();
                    } else {
                        verticalWidgetRun.e.d(constraintWidget.j());
                        constraintWidget.f18011a = true;
                    }
                } else if (z5 && z3) {
                    h(constraintWidget, dimensionBehaviour3, dimensionDependency.f18127g, dimensionBehaviour5, dimensionDependency2.f18127g);
                    if (dimensionBehaviour == dimensionBehaviour4) {
                        horizontalWidgetRun.e.f18141m = constraintWidget.m();
                    } else {
                        horizontalWidgetRun.e.d(constraintWidget.m());
                        constraintWidget.f18011a = true;
                    }
                }
                if (constraintWidget.f18011a && (baselineDimensionDependency = verticalWidgetRun.f18147l) != null) {
                    baselineDimensionDependency.d(constraintWidget.R);
                }
            }
        }
    }
}
