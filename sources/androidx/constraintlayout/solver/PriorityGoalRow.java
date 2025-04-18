package androidx.constraintlayout.solver;

import androidx.compose.foundation.text.input.a;
import androidx.constraintlayout.solver.ArrayRow;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class PriorityGoalRow extends ArrayRow {

    /* renamed from: f, reason: collision with root package name */
    public SolverVariable[] f17939f;

    /* renamed from: g, reason: collision with root package name */
    public SolverVariable[] f17940g;

    /* renamed from: h, reason: collision with root package name */
    public int f17941h;

    /* renamed from: i, reason: collision with root package name */
    public GoalVariableAccessor f17942i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.solver.PriorityGoalRow$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f17946b - solverVariable2.f17946b;
        }
    }

    /* loaded from: classes2.dex */
    public class GoalVariableAccessor implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public SolverVariable f17943a;

        public GoalVariableAccessor() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f17943a.f17946b - ((SolverVariable) obj).f17946b;
        }

        public final String toString() {
            String str = "[ ";
            if (this.f17943a != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    StringBuilder q2 = a.q(str);
                    q2.append(this.f17943a.f17950h[i2]);
                    q2.append(" ");
                    str = q2.toString();
                }
            }
            StringBuilder B = a.B(str, "] ");
            B.append(this.f17943a);
            return B.toString();
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow, androidx.constraintlayout.solver.LinearSystem.Row
    public final SolverVariable a(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f17941h; i3++) {
            SolverVariable[] solverVariableArr = this.f17939f;
            SolverVariable solverVariable = solverVariableArr[i3];
            if (!zArr[solverVariable.f17946b]) {
                GoalVariableAccessor goalVariableAccessor = this.f17942i;
                goalVariableAccessor.f17943a = solverVariable;
                int i4 = 8;
                if (i2 == -1) {
                    while (i4 >= 0) {
                        float f2 = goalVariableAccessor.f17943a.f17950h[i4];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i2 = i3;
                                break;
                            }
                            i4--;
                        }
                    }
                } else {
                    SolverVariable solverVariable2 = solverVariableArr[i2];
                    while (true) {
                        if (i4 >= 0) {
                            float f3 = solverVariable2.f17950h[i4];
                            float f4 = goalVariableAccessor.f17943a.f17950h[i4];
                            if (f4 == f3) {
                                i4--;
                            } else if (f4 >= f3) {
                            }
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f17939f[i2];
    }

    @Override // androidx.constraintlayout.solver.ArrayRow
    public final void h(ArrayRow arrayRow, boolean z2) {
        SolverVariable solverVariable = arrayRow.f17910a;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.d;
        int h2 = arrayRowVariables.h();
        for (int i2 = 0; i2 < h2; i2++) {
            SolverVariable a2 = arrayRowVariables.a(i2);
            float i3 = arrayRowVariables.i(i2);
            GoalVariableAccessor goalVariableAccessor = this.f17942i;
            goalVariableAccessor.f17943a = a2;
            boolean z3 = a2.f17945a;
            float[] fArr = solverVariable.f17950h;
            if (z3) {
                boolean z4 = true;
                for (int i4 = 0; i4 < 9; i4++) {
                    float[] fArr2 = goalVariableAccessor.f17943a.f17950h;
                    float f2 = (fArr[i4] * i3) + fArr2[i4];
                    fArr2[i4] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        goalVariableAccessor.f17943a.f17950h[i4] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    PriorityGoalRow.this.j(goalVariableAccessor.f17943a);
                }
            } else {
                for (int i5 = 0; i5 < 9; i5++) {
                    float f3 = fArr[i5];
                    if (f3 != 0.0f) {
                        float f4 = f3 * i3;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        goalVariableAccessor.f17943a.f17950h[i5] = f4;
                    } else {
                        goalVariableAccessor.f17943a.f17950h[i5] = 0.0f;
                    }
                }
                i(a2);
            }
            this.f17911b = (arrayRow.f17911b * i3) + this.f17911b;
        }
        j(solverVariable);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Comparator] */
    public final void i(SolverVariable solverVariable) {
        int i2;
        int i3 = this.f17941h + 1;
        SolverVariable[] solverVariableArr = this.f17939f;
        if (i3 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f17939f = solverVariableArr2;
            this.f17940g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f17939f;
        int i4 = this.f17941h;
        solverVariableArr3[i4] = solverVariable;
        int i5 = i4 + 1;
        this.f17941h = i5;
        if (i5 > 1 && solverVariableArr3[i4].f17946b > solverVariable.f17946b) {
            int i6 = 0;
            while (true) {
                i2 = this.f17941h;
                if (i6 >= i2) {
                    break;
                }
                this.f17940g[i6] = this.f17939f[i6];
                i6++;
            }
            Arrays.sort(this.f17940g, 0, i2, new Object());
            for (int i7 = 0; i7 < this.f17941h; i7++) {
                this.f17939f[i7] = this.f17940g[i7];
            }
        }
        solverVariable.f17945a = true;
        solverVariable.a(this);
    }

    public final void j(SolverVariable solverVariable) {
        int i2 = 0;
        while (i2 < this.f17941h) {
            if (this.f17939f[i2] == solverVariable) {
                while (true) {
                    int i3 = this.f17941h;
                    if (i2 >= i3 - 1) {
                        this.f17941h = i3 - 1;
                        solverVariable.f17945a = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f17939f;
                        int i4 = i2 + 1;
                        solverVariableArr[i2] = solverVariableArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow
    public final String toString() {
        String str = " goal -> (" + this.f17911b + ") : ";
        for (int i2 = 0; i2 < this.f17941h; i2++) {
            SolverVariable solverVariable = this.f17939f[i2];
            GoalVariableAccessor goalVariableAccessor = this.f17942i;
            goalVariableAccessor.f17943a = solverVariable;
            str = str + goalVariableAccessor + " ";
        }
        return str;
    }
}
