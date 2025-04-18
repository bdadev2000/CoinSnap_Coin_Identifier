package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Guideline;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class GuidelineReference extends WidgetRun {
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        DependencyNode dependencyNode = this.f18154h;
        if (dependencyNode.f18125c && !dependencyNode.f18130j) {
            dependencyNode.d((int) ((((DependencyNode) dependencyNode.f18132l.get(0)).f18127g * ((Guideline) this.f18150b).f18082f0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.f18150b;
        Guideline guideline = (Guideline) constraintWidget;
        int i2 = guideline.f18083g0;
        int i3 = guideline.f18084h0;
        int i4 = guideline.f18086j0;
        DependencyNode dependencyNode = this.f18154h;
        if (i4 == 1) {
            if (i2 != -1) {
                dependencyNode.f18132l.add(constraintWidget.K.d.f18154h);
                this.f18150b.K.d.f18154h.f18131k.add(dependencyNode);
                dependencyNode.f18126f = i2;
            } else if (i3 != -1) {
                dependencyNode.f18132l.add(constraintWidget.K.d.f18155i);
                this.f18150b.K.d.f18155i.f18131k.add(dependencyNode);
                dependencyNode.f18126f = -i3;
            } else {
                dependencyNode.f18124b = true;
                dependencyNode.f18132l.add(constraintWidget.K.d.f18155i);
                this.f18150b.K.d.f18155i.f18131k.add(dependencyNode);
            }
            m(this.f18150b.d.f18154h);
            m(this.f18150b.d.f18155i);
            return;
        }
        if (i2 != -1) {
            dependencyNode.f18132l.add(constraintWidget.K.e.f18154h);
            this.f18150b.K.e.f18154h.f18131k.add(dependencyNode);
            dependencyNode.f18126f = i2;
        } else if (i3 != -1) {
            dependencyNode.f18132l.add(constraintWidget.K.e.f18155i);
            this.f18150b.K.e.f18155i.f18131k.add(dependencyNode);
            dependencyNode.f18126f = -i3;
        } else {
            dependencyNode.f18124b = true;
            dependencyNode.f18132l.add(constraintWidget.K.e.f18155i);
            this.f18150b.K.e.f18155i.f18131k.add(dependencyNode);
        }
        m(this.f18150b.e.f18154h);
        m(this.f18150b.e.f18155i);
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.f18150b;
        int i2 = ((Guideline) constraintWidget).f18086j0;
        DependencyNode dependencyNode = this.f18154h;
        if (i2 == 1) {
            constraintWidget.P = dependencyNode.f18127g;
        } else {
            constraintWidget.Q = dependencyNode.f18127g;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void f() {
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
