package androidx.constraintlayout.solver.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RunGroup {

    /* renamed from: a, reason: collision with root package name */
    public WidgetRun f18144a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f18145b;

    public static long a(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        ArrayList arrayList = dependencyNode.f18131k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = (Dependency) arrayList.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.d != widgetRun) {
                    j3 = Math.min(j3, a(dependencyNode2, dependencyNode2.f18126f + j2));
                }
            }
        }
        if (dependencyNode != widgetRun.f18155i) {
            return j3;
        }
        long j4 = widgetRun.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(widgetRun.f18154h, j5)), j5 - r9.f18126f);
    }

    public static long b(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        ArrayList arrayList = dependencyNode.f18131k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = (Dependency) arrayList.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.d != widgetRun) {
                    j3 = Math.max(j3, b(dependencyNode2, dependencyNode2.f18126f + j2));
                }
            }
        }
        if (dependencyNode != widgetRun.f18154h) {
            return j3;
        }
        long j4 = widgetRun.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(widgetRun.f18155i, j5)), j5 - r9.f18126f);
    }
}
