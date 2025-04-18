package androidx.constraintlayout.solver.widgets.analyzer;

import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class DependencyNode implements Dependency {
    public final WidgetRun d;

    /* renamed from: f, reason: collision with root package name */
    public int f18126f;

    /* renamed from: g, reason: collision with root package name */
    public int f18127g;

    /* renamed from: a, reason: collision with root package name */
    public WidgetRun f18123a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18124b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18125c = false;
    public Type e = Type.f18133a;

    /* renamed from: h, reason: collision with root package name */
    public int f18128h = 1;

    /* renamed from: i, reason: collision with root package name */
    public DimensionDependency f18129i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18130j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f18131k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f18132l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Type {

        /* renamed from: a, reason: collision with root package name */
        public static final Type f18133a;

        /* renamed from: b, reason: collision with root package name */
        public static final Type f18134b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f18135c;
        public static final Type d;

        /* renamed from: f, reason: collision with root package name */
        public static final Type f18136f;

        /* renamed from: g, reason: collision with root package name */
        public static final Type f18137g;

        /* renamed from: h, reason: collision with root package name */
        public static final Type f18138h;

        /* renamed from: i, reason: collision with root package name */
        public static final Type f18139i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ Type[] f18140j;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type] */
        static {
            ?? r02 = new Enum("UNKNOWN", 0);
            f18133a = r02;
            ?? r1 = new Enum("HORIZONTAL_DIMENSION", 1);
            f18134b = r1;
            ?? r2 = new Enum("VERTICAL_DIMENSION", 2);
            f18135c = r2;
            ?? r3 = new Enum("LEFT", 3);
            d = r3;
            ?? r4 = new Enum("RIGHT", 4);
            f18136f = r4;
            ?? r5 = new Enum("TOP", 5);
            f18137g = r5;
            ?? r6 = new Enum("BOTTOM", 6);
            f18138h = r6;
            ?? r7 = new Enum("BASELINE", 7);
            f18139i = r7;
            f18140j = new Type[]{r02, r1, r2, r3, r4, r5, r6, r7};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f18140j.clone();
        }
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.d = widgetRun;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        ArrayList arrayList = this.f18132l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).f18130j) {
                return;
            }
        }
        this.f18125c = true;
        WidgetRun widgetRun = this.f18123a;
        if (widgetRun != null) {
            widgetRun.a(this);
        }
        if (this.f18124b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        DependencyNode dependencyNode = null;
        int i2 = 0;
        while (it2.hasNext()) {
            DependencyNode dependencyNode2 = (DependencyNode) it2.next();
            if (!(dependencyNode2 instanceof DimensionDependency)) {
                i2++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i2 == 1 && dependencyNode.f18130j) {
            DimensionDependency dimensionDependency = this.f18129i;
            if (dimensionDependency != null) {
                if (!dimensionDependency.f18130j) {
                    return;
                } else {
                    this.f18126f = this.f18128h * dimensionDependency.f18127g;
                }
            }
            d(dependencyNode.f18127g + this.f18126f);
        }
        WidgetRun widgetRun2 = this.f18123a;
        if (widgetRun2 != null) {
            widgetRun2.a(this);
        }
    }

    public final void b(Dependency dependency) {
        this.f18131k.add(dependency);
        if (this.f18130j) {
            dependency.a(dependency);
        }
    }

    public final void c() {
        this.f18132l.clear();
        this.f18131k.clear();
        this.f18130j = false;
        this.f18127g = 0;
        this.f18125c = false;
        this.f18124b = false;
    }

    public void d(int i2) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f18150b.Y);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(this.e);
        sb.append("(");
        sb.append(this.f18130j ? Integer.valueOf(this.f18127g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f18132l.size());
        sb.append(":d=");
        sb.append(this.f18131k.size());
        sb.append(">");
        return sb.toString();
    }
}
