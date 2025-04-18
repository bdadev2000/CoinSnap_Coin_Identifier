package androidx.constraintlayout.solver.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.text.input.a;
import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* loaded from: classes3.dex */
public class Barrier extends HelperWidget {

    /* renamed from: h0, reason: collision with root package name */
    public int f17979h0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f17980i0 = true;

    /* renamed from: j0, reason: collision with root package name */
    public int f17981j0 = 0;

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void b(LinearSystem linearSystem) {
        boolean z2;
        int i2;
        ConstraintAnchor[] constraintAnchorArr = this.G;
        ConstraintAnchor constraintAnchor = this.f18036y;
        constraintAnchorArr[0] = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = this.f18037z;
        int i3 = 2;
        constraintAnchorArr[2] = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = this.A;
        constraintAnchorArr[1] = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = this.B;
        constraintAnchorArr[3] = constraintAnchor4;
        for (ConstraintAnchor constraintAnchor5 : constraintAnchorArr) {
            constraintAnchor5.f18001g = linearSystem.j(constraintAnchor5);
        }
        int i4 = this.f17979h0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr[i4];
        for (int i5 = 0; i5 < this.f18089g0; i5++) {
            ConstraintWidget constraintWidget = this.f18088f0[i5];
            if (this.f17980i0 || constraintWidget.c()) {
                int i6 = this.f17979h0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f18042c;
                if (((i6 == 0 || i6 == 1) && constraintWidget.J[0] == dimensionBehaviour && constraintWidget.f18036y.d != null && constraintWidget.A.d != null) || ((i6 == 2 || i6 == 3) && constraintWidget.J[1] == dimensionBehaviour && constraintWidget.f18037z.d != null && constraintWidget.B.d != null)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = constraintAnchor.e() || constraintAnchor3.e();
        boolean z4 = constraintAnchor2.e() || constraintAnchor4.e();
        int i7 = (z2 || !(((i2 = this.f17979h0) == 0 && z3) || ((i2 == 2 && z4) || ((i2 == 1 && z3) || (i2 == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f18089g0) {
            ConstraintWidget constraintWidget2 = this.f18088f0[i8];
            if (this.f17980i0 || constraintWidget2.c()) {
                SolverVariable j2 = linearSystem.j(constraintWidget2.G[this.f17979h0]);
                int i9 = this.f17979h0;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.G[i9];
                constraintAnchor7.f18001g = j2;
                ConstraintAnchor constraintAnchor8 = constraintAnchor7.d;
                int i10 = (constraintAnchor8 == null || constraintAnchor8.f17998b != this) ? 0 : constraintAnchor7.e;
                if (i9 == 0 || i9 == i3) {
                    SolverVariable solverVariable = constraintAnchor6.f18001g;
                    int i11 = this.f17981j0 - i10;
                    ArrayRow k2 = linearSystem.k();
                    SolverVariable l2 = linearSystem.l();
                    l2.d = 0;
                    k2.d(solverVariable, j2, l2, i11);
                    linearSystem.c(k2);
                } else {
                    SolverVariable solverVariable2 = constraintAnchor6.f18001g;
                    int i12 = this.f17981j0 + i10;
                    ArrayRow k3 = linearSystem.k();
                    SolverVariable l3 = linearSystem.l();
                    l3.d = 0;
                    k3.c(solverVariable2, j2, l3, i12);
                    linearSystem.c(k3);
                }
                linearSystem.e(constraintAnchor6.f18001g, j2, this.f17981j0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f17979h0;
        if (i13 == 0) {
            linearSystem.e(constraintAnchor3.f18001g, constraintAnchor.f18001g, 0, 8);
            linearSystem.e(constraintAnchor.f18001g, this.K.A.f18001g, 0, 4);
            linearSystem.e(constraintAnchor.f18001g, this.K.f18036y.f18001g, 0, 0);
            return;
        }
        if (i13 == 1) {
            linearSystem.e(constraintAnchor.f18001g, constraintAnchor3.f18001g, 0, 8);
            linearSystem.e(constraintAnchor.f18001g, this.K.f18036y.f18001g, 0, 4);
            linearSystem.e(constraintAnchor.f18001g, this.K.A.f18001g, 0, 0);
        } else if (i13 == 2) {
            linearSystem.e(constraintAnchor4.f18001g, constraintAnchor2.f18001g, 0, 8);
            linearSystem.e(constraintAnchor2.f18001g, this.K.B.f18001g, 0, 4);
            linearSystem.e(constraintAnchor2.f18001g, this.K.f18037z.f18001g, 0, 0);
        } else if (i13 == 3) {
            linearSystem.e(constraintAnchor2.f18001g, constraintAnchor4.f18001g, 0, 8);
            linearSystem.e(constraintAnchor2.f18001g, this.K.f18037z.f18001g, 0, 4);
            linearSystem.e(constraintAnchor2.f18001g, this.K.B.f18001g, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final boolean c() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final String toString() {
        String r2 = d.r(new StringBuilder("[Barrier] "), this.Y, " {");
        for (int i2 = 0; i2 < this.f18089g0; i2++) {
            ConstraintWidget constraintWidget = this.f18088f0[i2];
            if (i2 > 0) {
                r2 = a.j(r2, ", ");
            }
            StringBuilder q2 = a.q(r2);
            q2.append(constraintWidget.Y);
            r2 = q2.toString();
        }
        return a.j(r2, "}");
    }
}
