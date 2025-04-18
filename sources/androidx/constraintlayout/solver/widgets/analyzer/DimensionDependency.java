package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class DimensionDependency extends DependencyNode {

    /* renamed from: m, reason: collision with root package name */
    public int f18141m;

    public DimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof HorizontalWidgetRun) {
            this.e = DependencyNode.Type.f18134b;
        } else {
            this.e = DependencyNode.Type.f18135c;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
    public final void d(int i2) {
        if (this.f18130j) {
            return;
        }
        this.f18130j = true;
        this.f18127g = i2;
        Iterator it = this.f18131k.iterator();
        while (it.hasNext()) {
            Dependency dependency = (Dependency) it.next();
            dependency.a(dependency);
        }
    }
}
