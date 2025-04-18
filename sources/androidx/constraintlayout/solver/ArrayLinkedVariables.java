package androidx.constraintlayout.solver;

import androidx.compose.foundation.text.input.a;
import androidx.constraintlayout.solver.ArrayRow;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayRow f17903b;

    /* renamed from: c, reason: collision with root package name */
    public final Cache f17904c;

    /* renamed from: a, reason: collision with root package name */
    public int f17902a = 0;
    public int d = 8;
    public int[] e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f17905f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f17906g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f17907h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f17908i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17909j = false;

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.f17903b = arrayRow;
        this.f17904c = cache;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final SolverVariable a(int i2) {
        int i3 = this.f17907h;
        for (int i4 = 0; i3 != -1 && i4 < this.f17902a; i4++) {
            if (i4 == i2) {
                return this.f17904c.d[this.e[i3]];
            }
            i3 = this.f17905f[i3];
        }
        return null;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void b() {
        int i2 = this.f17907h;
        for (int i3 = 0; i2 != -1 && i3 < this.f17902a; i3++) {
            float[] fArr = this.f17906g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f17905f[i2];
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void c(SolverVariable solverVariable, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.f17907h;
            ArrayRow arrayRow = this.f17903b;
            if (i2 == -1) {
                this.f17907h = 0;
                this.f17906g[0] = f2;
                this.e[0] = solverVariable.f17946b;
                this.f17905f[0] = -1;
                solverVariable.f17954l++;
                solverVariable.a(arrayRow);
                this.f17902a++;
                if (this.f17909j) {
                    return;
                }
                int i3 = this.f17908i + 1;
                this.f17908i = i3;
                int[] iArr = this.e;
                if (i3 >= iArr.length) {
                    this.f17909j = true;
                    this.f17908i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f17902a; i5++) {
                int i6 = this.e[i2];
                int i7 = solverVariable.f17946b;
                if (i6 == i7) {
                    float[] fArr = this.f17906g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.f17907h) {
                            this.f17907h = this.f17905f[i2];
                        } else {
                            int[] iArr2 = this.f17905f;
                            iArr2[i4] = iArr2[i2];
                        }
                        if (z2) {
                            solverVariable.b(arrayRow);
                        }
                        if (this.f17909j) {
                            this.f17908i = i2;
                        }
                        solverVariable.f17954l--;
                        this.f17902a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i4 = i2;
                }
                i2 = this.f17905f[i2];
            }
            int i8 = this.f17908i;
            int i9 = i8 + 1;
            if (this.f17909j) {
                int[] iArr3 = this.e;
                if (iArr3[i8] != -1) {
                    i8 = iArr3.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr4 = this.e;
            if (i8 >= iArr4.length && this.f17902a < iArr4.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr5 = this.e;
                    if (i10 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i10] == -1) {
                        i8 = i10;
                        break;
                    }
                    i10++;
                }
            }
            int[] iArr6 = this.e;
            if (i8 >= iArr6.length) {
                i8 = iArr6.length;
                int i11 = this.d * 2;
                this.d = i11;
                this.f17909j = false;
                this.f17908i = i8 - 1;
                this.f17906g = Arrays.copyOf(this.f17906g, i11);
                this.e = Arrays.copyOf(this.e, this.d);
                this.f17905f = Arrays.copyOf(this.f17905f, this.d);
            }
            this.e[i8] = solverVariable.f17946b;
            this.f17906g[i8] = f2;
            if (i4 != -1) {
                int[] iArr7 = this.f17905f;
                iArr7[i8] = iArr7[i4];
                iArr7[i4] = i8;
            } else {
                this.f17905f[i8] = this.f17907h;
                this.f17907h = i8;
            }
            solverVariable.f17954l++;
            solverVariable.a(arrayRow);
            this.f17902a++;
            if (!this.f17909j) {
                this.f17908i++;
            }
            int i12 = this.f17908i;
            int[] iArr8 = this.e;
            if (i12 >= iArr8.length) {
                this.f17909j = true;
                this.f17908i = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i2 = this.f17907h;
        for (int i3 = 0; i2 != -1 && i3 < this.f17902a; i3++) {
            SolverVariable solverVariable = this.f17904c.d[this.e[i2]];
            if (solverVariable != null) {
                solverVariable.b(this.f17903b);
            }
            i2 = this.f17905f[i2];
        }
        this.f17907h = -1;
        this.f17908i = -1;
        this.f17909j = false;
        this.f17902a = 0;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float d(SolverVariable solverVariable) {
        int i2 = this.f17907h;
        for (int i3 = 0; i2 != -1 && i3 < this.f17902a; i3++) {
            if (this.e[i2] == solverVariable.f17946b) {
                return this.f17906g[i2];
            }
            i2 = this.f17905f[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float e(ArrayRow arrayRow, boolean z2) {
        float d = d(arrayRow.f17910a);
        g(arrayRow.f17910a, z2);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.d;
        int h2 = arrayRowVariables.h();
        for (int i2 = 0; i2 < h2; i2++) {
            SolverVariable a2 = arrayRowVariables.a(i2);
            c(a2, arrayRowVariables.d(a2) * d, z2);
        }
        return d;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void f(SolverVariable solverVariable, float f2) {
        if (f2 == 0.0f) {
            g(solverVariable, true);
            return;
        }
        int i2 = this.f17907h;
        ArrayRow arrayRow = this.f17903b;
        if (i2 == -1) {
            this.f17907h = 0;
            this.f17906g[0] = f2;
            this.e[0] = solverVariable.f17946b;
            this.f17905f[0] = -1;
            solverVariable.f17954l++;
            solverVariable.a(arrayRow);
            this.f17902a++;
            if (this.f17909j) {
                return;
            }
            int i3 = this.f17908i + 1;
            this.f17908i = i3;
            int[] iArr = this.e;
            if (i3 >= iArr.length) {
                this.f17909j = true;
                this.f17908i = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f17902a; i5++) {
            int i6 = this.e[i2];
            int i7 = solverVariable.f17946b;
            if (i6 == i7) {
                this.f17906g[i2] = f2;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.f17905f[i2];
        }
        int i8 = this.f17908i;
        int i9 = i8 + 1;
        if (this.f17909j) {
            int[] iArr2 = this.e;
            if (iArr2[i8] != -1) {
                i8 = iArr2.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr3 = this.e;
        if (i8 >= iArr3.length && this.f17902a < iArr3.length) {
            int i10 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i10 >= iArr4.length) {
                    break;
                }
                if (iArr4[i10] == -1) {
                    i8 = i10;
                    break;
                }
                i10++;
            }
        }
        int[] iArr5 = this.e;
        if (i8 >= iArr5.length) {
            i8 = iArr5.length;
            int i11 = this.d * 2;
            this.d = i11;
            this.f17909j = false;
            this.f17908i = i8 - 1;
            this.f17906g = Arrays.copyOf(this.f17906g, i11);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f17905f = Arrays.copyOf(this.f17905f, this.d);
        }
        this.e[i8] = solverVariable.f17946b;
        this.f17906g[i8] = f2;
        if (i4 != -1) {
            int[] iArr6 = this.f17905f;
            iArr6[i8] = iArr6[i4];
            iArr6[i4] = i8;
        } else {
            this.f17905f[i8] = this.f17907h;
            this.f17907h = i8;
        }
        solverVariable.f17954l++;
        solverVariable.a(arrayRow);
        int i12 = this.f17902a + 1;
        this.f17902a = i12;
        if (!this.f17909j) {
            this.f17908i++;
        }
        int[] iArr7 = this.e;
        if (i12 >= iArr7.length) {
            this.f17909j = true;
        }
        if (this.f17908i >= iArr7.length) {
            this.f17909j = true;
            this.f17908i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float g(SolverVariable solverVariable, boolean z2) {
        int i2 = this.f17907h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f17902a) {
            if (this.e[i2] == solverVariable.f17946b) {
                if (i2 == this.f17907h) {
                    this.f17907h = this.f17905f[i2];
                } else {
                    int[] iArr = this.f17905f;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    solverVariable.b(this.f17903b);
                }
                solverVariable.f17954l--;
                this.f17902a--;
                this.e[i2] = -1;
                if (this.f17909j) {
                    this.f17908i = i2;
                }
                return this.f17906g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f17905f[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final int h() {
        return this.f17902a;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float i(int i2) {
        int i3 = this.f17907h;
        for (int i4 = 0; i3 != -1 && i4 < this.f17902a; i4++) {
            if (i4 == i2) {
                return this.f17906g[i3];
            }
            i3 = this.f17905f[i3];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final boolean j(SolverVariable solverVariable) {
        int i2 = this.f17907h;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f17902a; i3++) {
            if (this.e[i2] == solverVariable.f17946b) {
                return true;
            }
            i2 = this.f17905f[i2];
        }
        return false;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void k(float f2) {
        int i2 = this.f17907h;
        for (int i3 = 0; i2 != -1 && i3 < this.f17902a; i3++) {
            float[] fArr = this.f17906g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f17905f[i2];
        }
    }

    public final String toString() {
        int i2 = this.f17907h;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f17902a; i3++) {
            StringBuilder q2 = a.q(a.j(str, " -> "));
            q2.append(this.f17906g[i2]);
            q2.append(" : ");
            StringBuilder q3 = a.q(q2.toString());
            q3.append(this.f17904c.d[this.e[i2]]);
            str = q3.toString();
            i2 = this.f17905f[i2];
        }
        return str;
    }
}
