package androidx.constraintlayout.solver;

import androidx.compose.foundation.text.input.a;
import androidx.constraintlayout.solver.ArrayRow;
import com.facebook.appevents.integrity.IntegrityManager;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {

    /* renamed from: a, reason: collision with root package name */
    public int f17960a = 16;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f17961b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f17962c = new int[16];
    public int[] d = new int[16];
    public float[] e = new float[16];

    /* renamed from: f, reason: collision with root package name */
    public int[] f17963f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    public int[] f17964g = new int[16];

    /* renamed from: h, reason: collision with root package name */
    public int f17965h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f17966i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayRow f17967j;

    /* renamed from: k, reason: collision with root package name */
    public final Cache f17968k;

    public SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.f17967j = arrayRow;
        this.f17968k = cache;
        clear();
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final SolverVariable a(int i2) {
        int i3 = this.f17965h;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f17966i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return this.f17968k.d[this.d[i4]];
            }
            i4 = this.f17964g[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void b() {
        int i2 = this.f17965h;
        int i3 = this.f17966i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.e;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f17964g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void c(SolverVariable solverVariable, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int n2 = n(solverVariable);
            if (n2 == -1) {
                f(solverVariable, f2);
                return;
            }
            float[] fArr = this.e;
            float f3 = fArr[n2] + f2;
            fArr[n2] = f3;
            if (f3 <= -0.001f || f3 >= 0.001f) {
                return;
            }
            fArr[n2] = 0.0f;
            g(solverVariable, z2);
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i2 = this.f17965h;
        for (int i3 = 0; i3 < i2; i3++) {
            SolverVariable a2 = a(i3);
            if (a2 != null) {
                a2.b(this.f17967j);
            }
        }
        for (int i4 = 0; i4 < this.f17960a; i4++) {
            this.d[i4] = -1;
            this.f17962c[i4] = -1;
        }
        for (int i5 = 0; i5 < 16; i5++) {
            this.f17961b[i5] = -1;
        }
        this.f17965h = 0;
        this.f17966i = -1;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float d(SolverVariable solverVariable) {
        int n2 = n(solverVariable);
        if (n2 != -1) {
            return this.e[n2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float e(ArrayRow arrayRow, boolean z2) {
        float d = d(arrayRow.f17910a);
        g(arrayRow.f17910a, z2);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.d;
        int i2 = solverVariableValues.f17965h;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = solverVariableValues.d[i4];
            if (i5 != -1) {
                c(this.f17968k.d[i5], solverVariableValues.e[i4] * d, z2);
                i3++;
            }
            i4++;
        }
        return d;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void f(SolverVariable solverVariable, float f2) {
        if (f2 > -0.001f && f2 < 0.001f) {
            g(solverVariable, true);
            return;
        }
        int i2 = 0;
        if (this.f17965h == 0) {
            m(0, solverVariable, f2);
            l(solverVariable, 0);
            this.f17966i = 0;
            return;
        }
        int n2 = n(solverVariable);
        if (n2 != -1) {
            this.e[n2] = f2;
            return;
        }
        int i3 = this.f17965h + 1;
        int i4 = this.f17960a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.d = Arrays.copyOf(this.d, i5);
            this.e = Arrays.copyOf(this.e, i5);
            this.f17963f = Arrays.copyOf(this.f17963f, i5);
            this.f17964g = Arrays.copyOf(this.f17964g, i5);
            this.f17962c = Arrays.copyOf(this.f17962c, i5);
            for (int i6 = this.f17960a; i6 < i5; i6++) {
                this.d[i6] = -1;
                this.f17962c[i6] = -1;
            }
            this.f17960a = i5;
        }
        int i7 = this.f17965h;
        int i8 = this.f17966i;
        int i9 = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.d[i8];
            int i12 = solverVariable.f17946b;
            if (i11 == i12) {
                this.e[i8] = f2;
                return;
            }
            if (i11 < i12) {
                i9 = i8;
            }
            i8 = this.f17964g[i8];
            if (i8 == -1) {
                break;
            }
        }
        while (true) {
            if (i2 >= this.f17960a) {
                i2 = -1;
                break;
            } else if (this.d[i2] == -1) {
                break;
            } else {
                i2++;
            }
        }
        m(i2, solverVariable, f2);
        if (i9 != -1) {
            this.f17963f[i2] = i9;
            int[] iArr = this.f17964g;
            iArr[i2] = iArr[i9];
            iArr[i9] = i2;
        } else {
            this.f17963f[i2] = -1;
            if (this.f17965h > 0) {
                this.f17964g[i2] = this.f17966i;
                this.f17966i = i2;
            } else {
                this.f17964g[i2] = -1;
            }
        }
        int i13 = this.f17964g[i2];
        if (i13 != -1) {
            this.f17963f[i13] = i2;
        }
        l(solverVariable, i2);
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float g(SolverVariable solverVariable, boolean z2) {
        int[] iArr;
        int i2;
        int n2 = n(solverVariable);
        if (n2 == -1) {
            return 0.0f;
        }
        int i3 = solverVariable.f17946b;
        int i4 = i3 % 16;
        int[] iArr2 = this.f17961b;
        int i5 = iArr2[i4];
        if (i5 != -1) {
            if (this.d[i5] == i3) {
                int[] iArr3 = this.f17962c;
                iArr2[i4] = iArr3[i5];
                iArr3[i5] = -1;
            } else {
                while (true) {
                    iArr = this.f17962c;
                    i2 = iArr[i5];
                    if (i2 == -1 || this.d[i2] == i3) {
                        break;
                    }
                    i5 = i2;
                }
                if (i2 != -1 && this.d[i2] == i3) {
                    iArr[i5] = iArr[i2];
                    iArr[i2] = -1;
                }
            }
        }
        float f2 = this.e[n2];
        if (this.f17966i == n2) {
            this.f17966i = this.f17964g[n2];
        }
        this.d[n2] = -1;
        int[] iArr4 = this.f17963f;
        int i6 = iArr4[n2];
        if (i6 != -1) {
            int[] iArr5 = this.f17964g;
            iArr5[i6] = iArr5[n2];
        }
        int i7 = this.f17964g[n2];
        if (i7 != -1) {
            iArr4[i7] = iArr4[n2];
        }
        this.f17965h--;
        solverVariable.f17954l--;
        if (z2) {
            solverVariable.b(this.f17967j);
        }
        return f2;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final int h() {
        return this.f17965h;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float i(int i2) {
        int i3 = this.f17965h;
        int i4 = this.f17966i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.e[i4];
            }
            i4 = this.f17964g[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final boolean j(SolverVariable solverVariable) {
        return n(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void k(float f2) {
        int i2 = this.f17965h;
        int i3 = this.f17966i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.e;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f17964g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    public final void l(SolverVariable solverVariable, int i2) {
        int[] iArr;
        int i3 = solverVariable.f17946b % 16;
        int[] iArr2 = this.f17961b;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f17962c;
                int i5 = iArr[i4];
                if (i5 == -1) {
                    break;
                } else {
                    i4 = i5;
                }
            }
            iArr[i4] = i2;
        }
        this.f17962c[i2] = -1;
    }

    public final void m(int i2, SolverVariable solverVariable, float f2) {
        this.d[i2] = solverVariable.f17946b;
        this.e[i2] = f2;
        this.f17963f[i2] = -1;
        this.f17964g[i2] = -1;
        solverVariable.a(this.f17967j);
        solverVariable.f17954l++;
        this.f17965h++;
    }

    public final int n(SolverVariable solverVariable) {
        if (this.f17965h == 0) {
            return -1;
        }
        int i2 = solverVariable.f17946b;
        int i3 = this.f17961b[i2 % 16];
        if (i3 == -1) {
            return -1;
        }
        if (this.d[i3] == i2) {
            return i3;
        }
        do {
            i3 = this.f17962c[i3];
            if (i3 == -1) {
                break;
            }
        } while (this.d[i3] != i2);
        if (i3 != -1 && this.d[i3] == i2) {
            return i3;
        }
        return -1;
    }

    public final String toString() {
        String j2;
        String j3;
        String str = hashCode() + " { ";
        int i2 = this.f17965h;
        for (int i3 = 0; i3 < i2; i3++) {
            SolverVariable a2 = a(i3);
            if (a2 != null) {
                String str2 = str + a2 + " = " + i(i3) + " ";
                int n2 = n(a2);
                String j4 = a.j(str2, "[p: ");
                int i4 = this.f17963f[n2];
                Cache cache = this.f17968k;
                if (i4 != -1) {
                    StringBuilder q2 = a.q(j4);
                    q2.append(cache.d[this.d[this.f17963f[n2]]]);
                    j2 = q2.toString();
                } else {
                    j2 = a.j(j4, IntegrityManager.INTEGRITY_TYPE_NONE);
                }
                String j5 = a.j(j2, ", n: ");
                if (this.f17964g[n2] != -1) {
                    StringBuilder q3 = a.q(j5);
                    q3.append(cache.d[this.d[this.f17964g[n2]]]);
                    j3 = q3.toString();
                } else {
                    j3 = a.j(j5, IntegrityManager.INTEGRITY_TYPE_NONE);
                }
                str = a.j(j3, "]");
            }
        }
        return a.j(str, " }");
    }
}
