package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.Barrier;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class HelperReferences extends WidgetRun {
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        Barrier barrier = (Barrier) this.f18150b;
        int i2 = barrier.f17979h0;
        DependencyNode dependencyNode = this.f18154h;
        Iterator it = dependencyNode.f18132l.iterator();
        int i3 = 0;
        int i4 = -1;
        while (it.hasNext()) {
            int i5 = ((DependencyNode) it.next()).f18127g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            dependencyNode.d(i4 + barrier.f17981j0);
        } else {
            dependencyNode.d(i3 + barrier.f17981j0);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.f18150b;
        if (constraintWidget instanceof Barrier) {
            DependencyNode dependencyNode = this.f18154h;
            dependencyNode.f18124b = true;
            Barrier barrier = (Barrier) constraintWidget;
            int i2 = barrier.f17979h0;
            boolean z2 = barrier.f17980i0;
            int i3 = 0;
            if (i2 == 0) {
                dependencyNode.e = DependencyNode.Type.d;
                while (i3 < barrier.f18089g0) {
                    ConstraintWidget constraintWidget2 = barrier.f18088f0[i3];
                    if (z2 || constraintWidget2.X != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.d.f18154h;
                        dependencyNode2.f18131k.add(dependencyNode);
                        dependencyNode.f18132l.add(dependencyNode2);
                    }
                    i3++;
                }
                m(this.f18150b.d.f18154h);
                m(this.f18150b.d.f18155i);
                return;
            }
            if (i2 == 1) {
                dependencyNode.e = DependencyNode.Type.f18136f;
                while (i3 < barrier.f18089g0) {
                    ConstraintWidget constraintWidget3 = barrier.f18088f0[i3];
                    if (z2 || constraintWidget3.X != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.d.f18155i;
                        dependencyNode3.f18131k.add(dependencyNode);
                        dependencyNode.f18132l.add(dependencyNode3);
                    }
                    i3++;
                }
                m(this.f18150b.d.f18154h);
                m(this.f18150b.d.f18155i);
                return;
            }
            if (i2 == 2) {
                dependencyNode.e = DependencyNode.Type.f18137g;
                while (i3 < barrier.f18089g0) {
                    ConstraintWidget constraintWidget4 = barrier.f18088f0[i3];
                    if (z2 || constraintWidget4.X != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.e.f18154h;
                        dependencyNode4.f18131k.add(dependencyNode);
                        dependencyNode.f18132l.add(dependencyNode4);
                    }
                    i3++;
                }
                m(this.f18150b.e.f18154h);
                m(this.f18150b.e.f18155i);
                return;
            }
            if (i2 != 3) {
                return;
            }
            dependencyNode.e = DependencyNode.Type.f18138h;
            while (i3 < barrier.f18089g0) {
                ConstraintWidget constraintWidget5 = barrier.f18088f0[i3];
                if (z2 || constraintWidget5.X != 8) {
                    DependencyNode dependencyNode5 = constraintWidget5.e.f18155i;
                    dependencyNode5.f18131k.add(dependencyNode);
                    dependencyNode.f18132l.add(dependencyNode5);
                }
                i3++;
            }
            m(this.f18150b.e.f18154h);
            m(this.f18150b.e.f18155i);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.f18150b;
        if (constraintWidget instanceof Barrier) {
            int i2 = ((Barrier) constraintWidget).f17979h0;
            DependencyNode dependencyNode = this.f18154h;
            if (i2 == 0 || i2 == 1) {
                constraintWidget.P = dependencyNode.f18127g;
            } else {
                constraintWidget.Q = dependencyNode.f18127g;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void f() {
        this.f18151c = null;
        this.f18154h.c();
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final boolean k() {
        return false;
    }

    public final void m(DependencyNode dependencyNode) {
        DependencyNode dependencyNode2 = this.f18154h;
        dependencyNode2.f18131k.add(dependencyNode);
        dependencyNode.f18132l.add(dependencyNode2);
    }
}
