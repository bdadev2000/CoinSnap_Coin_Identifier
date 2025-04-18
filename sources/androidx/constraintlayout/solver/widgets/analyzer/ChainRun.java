package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.compose.foundation.text.input.a;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ChainRun extends WidgetRun {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f18115k;

    /* renamed from: l, reason: collision with root package name */
    public int f18116l;

    public ChainRun(ConstraintWidget constraintWidget, int i2) {
        super(constraintWidget);
        ConstraintWidget constraintWidget2;
        this.f18115k = new ArrayList();
        this.f18152f = i2;
        ConstraintWidget constraintWidget3 = this.f18150b;
        ConstraintWidget l2 = constraintWidget3.l(i2);
        while (true) {
            ConstraintWidget constraintWidget4 = l2;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            } else {
                l2 = constraintWidget3.l(this.f18152f);
            }
        }
        this.f18150b = constraintWidget2;
        int i3 = this.f18152f;
        Dependency dependency = i3 == 0 ? constraintWidget2.d : i3 == 1 ? constraintWidget2.e : null;
        ArrayList arrayList = this.f18115k;
        arrayList.add(dependency);
        ConstraintWidget k2 = constraintWidget2.k(this.f18152f);
        while (k2 != null) {
            int i4 = this.f18152f;
            arrayList.add(i4 == 0 ? k2.d : i4 == 1 ? k2.e : null);
            k2 = k2.k(this.f18152f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it.next();
            int i5 = this.f18152f;
            if (i5 == 0) {
                widgetRun.f18150b.f18013b = this;
            } else if (i5 == 1) {
                widgetRun.f18150b.f18015c = this;
            }
        }
        if (this.f18152f == 0 && ((ConstraintWidgetContainer) this.f18150b.K).f18047j0 && arrayList.size() > 1) {
            this.f18150b = ((WidgetRun) arrayList.get(arrayList.size() - 1)).f18150b;
        }
        this.f18116l = this.f18152f == 0 ? this.f18150b.f18012a0 : this.f18150b.f18014b0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:302:0x03f1, code lost:
    
        r3 = r3 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0111, code lost:
    
        r4 = r17;
        r6 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.constraintlayout.solver.widgets.analyzer.Dependency r28) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.ChainRun.a(androidx.constraintlayout.solver.widgets.analyzer.Dependency):void");
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void d() {
        ArrayList arrayList = this.f18115k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = ((WidgetRun) arrayList.get(0)).f18150b;
        ConstraintWidget constraintWidget2 = ((WidgetRun) arrayList.get(size - 1)).f18150b;
        int i2 = this.f18152f;
        DependencyNode dependencyNode = this.f18155i;
        DependencyNode dependencyNode2 = this.f18154h;
        if (i2 == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.f18036y;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.A;
            DependencyNode i3 = WidgetRun.i(constraintAnchor, 0);
            int c2 = constraintAnchor.c();
            ConstraintWidget m2 = m();
            if (m2 != null) {
                c2 = m2.f18036y.c();
            }
            if (i3 != null) {
                WidgetRun.b(dependencyNode2, i3, c2);
            }
            DependencyNode i4 = WidgetRun.i(constraintAnchor2, 0);
            int c3 = constraintAnchor2.c();
            ConstraintWidget n2 = n();
            if (n2 != null) {
                c3 = n2.A.c();
            }
            if (i4 != null) {
                WidgetRun.b(dependencyNode, i4, -c3);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.f18037z;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.B;
            DependencyNode i5 = WidgetRun.i(constraintAnchor3, 1);
            int c4 = constraintAnchor3.c();
            ConstraintWidget m3 = m();
            if (m3 != null) {
                c4 = m3.f18037z.c();
            }
            if (i5 != null) {
                WidgetRun.b(dependencyNode2, i5, c4);
            }
            DependencyNode i6 = WidgetRun.i(constraintAnchor4, 1);
            int c5 = constraintAnchor4.c();
            ConstraintWidget n3 = n();
            if (n3 != null) {
                c5 = n3.B.c();
            }
            if (i6 != null) {
                WidgetRun.b(dependencyNode, i6, -c5);
            }
        }
        dependencyNode2.f18123a = this;
        dependencyNode.f18123a = this;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f18115k;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((WidgetRun) arrayList.get(i2)).e();
            i2++;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void f() {
        this.f18151c = null;
        Iterator it = this.f18115k.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).f();
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final long j() {
        ArrayList arrayList = this.f18115k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = r5.f18155i.f18126f + ((WidgetRun) arrayList.get(i2)).j() + j2 + r5.f18154h.f18126f;
        }
        return j2;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final boolean k() {
        ArrayList arrayList = this.f18115k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((WidgetRun) arrayList.get(i2)).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f18115k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            ConstraintWidget constraintWidget = ((WidgetRun) arrayList.get(i2)).f18150b;
            if (constraintWidget.X != 8) {
                return constraintWidget;
            }
            i2++;
        }
    }

    public final ConstraintWidget n() {
        ArrayList arrayList = this.f18115k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = ((WidgetRun) arrayList.get(size)).f18150b;
            if (constraintWidget.X != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        String concat = "ChainRun ".concat(this.f18152f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f18115k.iterator();
        while (it.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it.next();
            concat = a.j(a.j(concat, "<") + widgetRun, "> ");
        }
        return concat;
    }
}
