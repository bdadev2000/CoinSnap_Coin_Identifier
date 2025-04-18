package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ArrayRow implements LinearSystem.Row {
    public ArrayRowVariables d;

    /* renamed from: a, reason: collision with root package name */
    public SolverVariable f17910a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f17911b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f17912c = new ArrayList();
    public boolean e = false;

    /* loaded from: classes.dex */
    public interface ArrayRowVariables {
        SolverVariable a(int i2);

        void b();

        void c(SolverVariable solverVariable, float f2, boolean z2);

        void clear();

        float d(SolverVariable solverVariable);

        float e(ArrayRow arrayRow, boolean z2);

        void f(SolverVariable solverVariable, float f2);

        float g(SolverVariable solverVariable, boolean z2);

        int h();

        float i(int i2);

        boolean j(SolverVariable solverVariable);

        void k(float f2);
    }

    public ArrayRow(Cache cache) {
        this.d = new ArrayLinkedVariables(this, cache);
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public SolverVariable a(boolean[] zArr) {
        return e(zArr, null);
    }

    public final void b(LinearSystem linearSystem, int i2) {
        this.d.f(linearSystem.i(i2), 1.0f);
        this.d.f(linearSystem.i(i2), -1.0f);
    }

    public final void c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i2) {
        boolean z2;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            } else {
                z2 = false;
            }
            this.f17911b = i2;
            if (z2) {
                this.d.f(solverVariable, 1.0f);
                this.d.f(solverVariable2, -1.0f);
                this.d.f(solverVariable3, -1.0f);
                return;
            }
        }
        this.d.f(solverVariable, -1.0f);
        this.d.f(solverVariable2, 1.0f);
        this.d.f(solverVariable3, 1.0f);
    }

    public final void d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i2) {
        boolean z2;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            } else {
                z2 = false;
            }
            this.f17911b = i2;
            if (z2) {
                this.d.f(solverVariable, 1.0f);
                this.d.f(solverVariable2, -1.0f);
                this.d.f(solverVariable3, 1.0f);
                return;
            }
        }
        this.d.f(solverVariable, -1.0f);
        this.d.f(solverVariable2, 1.0f);
        this.d.f(solverVariable3, -1.0f);
    }

    public final SolverVariable e(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int h2 = this.d.h();
        SolverVariable solverVariable2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < h2; i2++) {
            float i3 = this.d.i(i2);
            if (i3 < 0.0f) {
                SolverVariable a2 = this.d.a(i2);
                if ((zArr == null || !zArr[a2.f17946b]) && a2 != solverVariable && (((type = a2.f17951i) == SolverVariable.Type.f17957b || type == SolverVariable.Type.f17958c) && i3 < f2)) {
                    f2 = i3;
                    solverVariable2 = a2;
                }
            }
        }
        return solverVariable2;
    }

    public final void f(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f17910a;
        if (solverVariable2 != null) {
            this.d.f(solverVariable2, -1.0f);
            this.f17910a = null;
        }
        float g2 = this.d.g(solverVariable, true) * (-1.0f);
        this.f17910a = solverVariable;
        if (g2 == 1.0f) {
            return;
        }
        this.f17911b /= g2;
        this.d.k(g2);
    }

    public final void g(SolverVariable solverVariable, boolean z2) {
        if (solverVariable.f17948f) {
            float d = this.d.d(solverVariable);
            this.f17911b = (solverVariable.e * d) + this.f17911b;
            this.d.g(solverVariable, z2);
            if (z2) {
                solverVariable.b(this);
            }
        }
    }

    public void h(ArrayRow arrayRow, boolean z2) {
        float e = this.d.e(arrayRow, z2);
        this.f17911b = (arrayRow.f17911b * e) + this.f17911b;
        if (z2) {
            arrayRow.f17910a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r10.f17910a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            androidx.constraintlayout.solver.SolverVariable r1 = r10.f17910a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = androidx.compose.foundation.text.input.a.j(r0, r1)
            float r1 = r10.f17911b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = androidx.compose.foundation.text.input.a.q(r0)
            float r1 = r10.f17911b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r10.d
            int r5 = r5.h()
        L3c:
            if (r4 >= r5) goto L9c
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r10.d
            androidx.constraintlayout.solver.SolverVariable r6 = r6.a(r4)
            if (r6 != 0) goto L47
            goto L99
        L47:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r7 = r10.d
            float r7 = r7.i(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = androidx.compose.foundation.text.input.a.j(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = androidx.compose.foundation.text.input.a.j(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = androidx.compose.foundation.text.input.a.j(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = androidx.compose.foundation.text.input.a.j(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = androidx.compose.foundation.text.input.a.j(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.ArrayRow.toString():java.lang.String");
    }
}
