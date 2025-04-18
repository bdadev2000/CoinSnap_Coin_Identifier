package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.Pools;
import androidx.constraintlayout.solver.PriorityGoalRow;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class LinearSystem {

    /* renamed from: o, reason: collision with root package name */
    public static int f17916o = 1000;

    /* renamed from: p, reason: collision with root package name */
    public static Metrics f17917p = null;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f17918q = true;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityGoalRow f17920b;
    public ArrayRow[] e;

    /* renamed from: k, reason: collision with root package name */
    public final Cache f17927k;

    /* renamed from: n, reason: collision with root package name */
    public ArrayRow f17930n;

    /* renamed from: a, reason: collision with root package name */
    public int f17919a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f17921c = 32;
    public int d = 32;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17922f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f17923g = new boolean[32];

    /* renamed from: h, reason: collision with root package name */
    public int f17924h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f17925i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f17926j = 32;

    /* renamed from: l, reason: collision with root package name */
    public SolverVariable[] f17928l = new SolverVariable[f17916o];

    /* renamed from: m, reason: collision with root package name */
    public int f17929m = 0;

    /* loaded from: classes3.dex */
    public interface Row {
        SolverVariable a(boolean[] zArr);
    }

    /* loaded from: classes3.dex */
    public class ValuesRow extends ArrayRow {
        public ValuesRow(Cache cache) {
            this.f17910a = null;
            this.f17911b = 0.0f;
            this.f17912c = new ArrayList();
            this.e = false;
            this.d = new SolverVariableValues(this, cache);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.constraintlayout.solver.ArrayRow, androidx.constraintlayout.solver.PriorityGoalRow] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.constraintlayout.solver.Cache, java.lang.Object] */
    public LinearSystem() {
        this.e = null;
        this.e = new ArrayRow[32];
        r();
        ?? obj = new Object();
        obj.f17913a = new Pools.SimplePool();
        obj.f17914b = new Pools.SimplePool();
        obj.f17915c = new Pools.SimplePool();
        obj.d = new SolverVariable[32];
        this.f17927k = obj;
        ?? arrayRow = new ArrayRow(obj);
        arrayRow.f17939f = new SolverVariable[128];
        arrayRow.f17940g = new SolverVariable[128];
        arrayRow.f17941h = 0;
        arrayRow.f17942i = new PriorityGoalRow.GoalVariableAccessor();
        this.f17920b = arrayRow;
        if (f17918q) {
            this.f17930n = new ValuesRow(obj);
        } else {
            this.f17930n = new ArrayRow(obj);
        }
    }

    public static int m(ConstraintAnchor constraintAnchor) {
        SolverVariable solverVariable = constraintAnchor.f18001g;
        if (solverVariable != null) {
            return (int) (solverVariable.e + 0.5f);
        }
        return 0;
    }

    public final SolverVariable a(SolverVariable.Type type) {
        SolverVariable solverVariable = (SolverVariable) this.f17927k.f17915c.a();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type);
            solverVariable.f17951i = type;
        } else {
            solverVariable.c();
            solverVariable.f17951i = type;
        }
        int i2 = this.f17929m;
        int i3 = f17916o;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f17916o = i4;
            this.f17928l = (SolverVariable[]) Arrays.copyOf(this.f17928l, i4);
        }
        SolverVariable[] solverVariableArr = this.f17928l;
        int i5 = this.f17929m;
        this.f17929m = i5 + 1;
        solverVariableArr[i5] = solverVariable;
        return solverVariable;
    }

    public final void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, float f2, SolverVariable solverVariable3, SolverVariable solverVariable4, int i3, int i4) {
        ArrayRow k2 = k();
        if (solverVariable2 == solverVariable3) {
            k2.d.f(solverVariable, 1.0f);
            k2.d.f(solverVariable4, 1.0f);
            k2.d.f(solverVariable2, -2.0f);
        } else if (f2 == 0.5f) {
            k2.d.f(solverVariable, 1.0f);
            k2.d.f(solverVariable2, -1.0f);
            k2.d.f(solverVariable3, -1.0f);
            k2.d.f(solverVariable4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                k2.f17911b = (-i2) + i3;
            }
        } else if (f2 <= 0.0f) {
            k2.d.f(solverVariable, -1.0f);
            k2.d.f(solverVariable2, 1.0f);
            k2.f17911b = i2;
        } else if (f2 >= 1.0f) {
            k2.d.f(solverVariable4, -1.0f);
            k2.d.f(solverVariable3, 1.0f);
            k2.f17911b = -i3;
        } else {
            float f3 = 1.0f - f2;
            k2.d.f(solverVariable, f3 * 1.0f);
            k2.d.f(solverVariable2, f3 * (-1.0f));
            k2.d.f(solverVariable3, (-1.0f) * f2);
            k2.d.f(solverVariable4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                k2.f17911b = (i3 * f2) + ((-i2) * f3);
            }
        }
        if (i4 != 8) {
            k2.b(this, i4);
        }
        c(k2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ba, code lost:
    
        if (r4.f17954l <= 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c7, code lost:
    
        if (r4.f17954l <= 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00dc, code lost:
    
        if (r4.f17954l <= 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00df, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e9, code lost:
    
        if (r4.f17954l <= 1) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.constraintlayout.solver.ArrayRow r17) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.LinearSystem.c(androidx.constraintlayout.solver.ArrayRow):void");
    }

    public final void d(SolverVariable solverVariable, int i2) {
        int i3 = solverVariable.f17947c;
        if (i3 == -1) {
            solverVariable.e = i2;
            solverVariable.f17948f = true;
            int i4 = solverVariable.f17953k;
            for (int i5 = 0; i5 < i4; i5++) {
                solverVariable.f17952j[i5].g(solverVariable, false);
            }
            solverVariable.f17953k = 0;
            return;
        }
        if (i3 == -1) {
            ArrayRow k2 = k();
            k2.f17910a = solverVariable;
            float f2 = i2;
            solverVariable.e = f2;
            k2.f17911b = f2;
            k2.e = true;
            c(k2);
            return;
        }
        ArrayRow arrayRow = this.e[i3];
        if (arrayRow.e) {
            arrayRow.f17911b = i2;
            return;
        }
        if (arrayRow.d.h() == 0) {
            arrayRow.e = true;
            arrayRow.f17911b = i2;
            return;
        }
        ArrayRow k3 = k();
        if (i2 < 0) {
            k3.f17911b = i2 * (-1);
            k3.d.f(solverVariable, 1.0f);
        } else {
            k3.f17911b = i2;
            k3.d.f(solverVariable, -1.0f);
        }
        c(k3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(androidx.constraintlayout.solver.SolverVariable r7, androidx.constraintlayout.solver.SolverVariable r8, int r9, int r10) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = 8
            if (r10 != r2) goto L29
            boolean r3 = r8.f17948f
            if (r3 == 0) goto L29
            int r3 = r7.f17947c
            r4 = -1
            if (r3 != r4) goto L29
            float r8 = r8.e
            float r9 = (float) r9
            float r8 = r8 + r9
            r7.e = r8
            r7.f17948f = r1
            int r8 = r7.f17953k
            r9 = r0
        L1a:
            if (r9 >= r8) goto L26
            androidx.constraintlayout.solver.ArrayRow[] r10 = r7.f17952j
            r10 = r10[r9]
            r10.g(r7, r0)
            int r9 = r9 + 1
            goto L1a
        L26:
            r7.f17953k = r0
            return
        L29:
            androidx.constraintlayout.solver.ArrayRow r3 = r6.k()
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 == 0) goto L49
            if (r9 >= 0) goto L38
            int r9 = r9 * (-1)
            r0 = r1
        L38:
            float r9 = (float) r9
            r3.f17911b = r9
            if (r0 != 0) goto L3e
            goto L49
        L3e:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r9 = r3.d
            r9.f(r7, r4)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r7 = r3.d
            r7.f(r8, r5)
            goto L53
        L49:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r9 = r3.d
            r9.f(r7, r5)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r7 = r3.d
            r7.f(r8, r4)
        L53:
            if (r10 == r2) goto L58
            r3.b(r6, r10)
        L58:
            r6.c(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.LinearSystem.e(androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, int, int):void");
    }

    public final void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        ArrayRow k2 = k();
        SolverVariable l2 = l();
        l2.d = 0;
        k2.c(solverVariable, solverVariable2, l2, i2);
        if (i3 != 8) {
            k2.d.f(i(i3), (int) (k2.d.d(l2) * (-1.0f)));
        }
        c(k2);
    }

    public final void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        ArrayRow k2 = k();
        SolverVariable l2 = l();
        l2.d = 0;
        k2.d(solverVariable, solverVariable2, l2, i2);
        if (i3 != 8) {
            k2.d.f(i(i3), (int) (k2.d.d(l2) * (-1.0f)));
        }
        c(k2);
    }

    public final void h(ArrayRow arrayRow) {
        boolean z2 = f17918q;
        Cache cache = this.f17927k;
        if (z2) {
            ArrayRow arrayRow2 = this.e[this.f17925i];
            if (arrayRow2 != null) {
                cache.f17913a.b(arrayRow2);
            }
        } else {
            ArrayRow arrayRow3 = this.e[this.f17925i];
            if (arrayRow3 != null) {
                cache.f17914b.b(arrayRow3);
            }
        }
        ArrayRow[] arrayRowArr = this.e;
        int i2 = this.f17925i;
        arrayRowArr[i2] = arrayRow;
        SolverVariable solverVariable = arrayRow.f17910a;
        solverVariable.f17947c = i2;
        this.f17925i = i2 + 1;
        solverVariable.d(arrayRow);
    }

    public final SolverVariable i(int i2) {
        if (this.f17924h + 1 >= this.d) {
            n();
        }
        SolverVariable a2 = a(SolverVariable.Type.f17958c);
        int i3 = this.f17919a + 1;
        this.f17919a = i3;
        this.f17924h++;
        a2.f17946b = i3;
        a2.d = i2;
        this.f17927k.d[i3] = a2;
        PriorityGoalRow priorityGoalRow = this.f17920b;
        priorityGoalRow.f17942i.f17943a = a2;
        float[] fArr = a2.f17950h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.d] = 1.0f;
        priorityGoalRow.i(a2);
        return a2;
    }

    public final SolverVariable j(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f17924h + 1 >= this.d) {
            n();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f18001g;
            if (solverVariable == null) {
                constraintAnchor.i();
                solverVariable = constraintAnchor.f18001g;
            }
            int i2 = solverVariable.f17946b;
            Cache cache = this.f17927k;
            if (i2 == -1 || i2 > this.f17919a || cache.d[i2] == null) {
                if (i2 != -1) {
                    solverVariable.c();
                }
                int i3 = this.f17919a + 1;
                this.f17919a = i3;
                this.f17924h++;
                solverVariable.f17946b = i3;
                solverVariable.f17951i = SolverVariable.Type.f17956a;
                cache.d[i3] = solverVariable;
            }
        }
        return solverVariable;
    }

    public final ArrayRow k() {
        boolean z2 = f17918q;
        Cache cache = this.f17927k;
        if (z2) {
            ArrayRow arrayRow = (ArrayRow) cache.f17913a.a();
            if (arrayRow == null) {
                return new ValuesRow(cache);
            }
            arrayRow.f17910a = null;
            arrayRow.d.clear();
            arrayRow.f17911b = 0.0f;
            arrayRow.e = false;
            return arrayRow;
        }
        ArrayRow arrayRow2 = (ArrayRow) cache.f17914b.a();
        if (arrayRow2 == null) {
            return new ArrayRow(cache);
        }
        arrayRow2.f17910a = null;
        arrayRow2.d.clear();
        arrayRow2.f17911b = 0.0f;
        arrayRow2.e = false;
        return arrayRow2;
    }

    public final SolverVariable l() {
        if (this.f17924h + 1 >= this.d) {
            n();
        }
        SolverVariable a2 = a(SolverVariable.Type.f17957b);
        int i2 = this.f17919a + 1;
        this.f17919a = i2;
        this.f17924h++;
        a2.f17946b = i2;
        this.f17927k.d[i2] = a2;
        return a2;
    }

    public final void n() {
        int i2 = this.f17921c * 2;
        this.f17921c = i2;
        this.e = (ArrayRow[]) Arrays.copyOf(this.e, i2);
        Cache cache = this.f17927k;
        cache.d = (SolverVariable[]) Arrays.copyOf(cache.d, this.f17921c);
        int i3 = this.f17921c;
        this.f17923g = new boolean[i3];
        this.d = i3;
        this.f17926j = i3;
        Metrics metrics = f17917p;
        if (metrics != null) {
            metrics.f17932b = Math.max(metrics.f17932b, i3);
            long j2 = f17917p.f17932b;
        }
    }

    public final void o() {
        Metrics metrics = f17917p;
        PriorityGoalRow priorityGoalRow = this.f17920b;
        if (!this.f17922f) {
            p(priorityGoalRow);
            return;
        }
        if (metrics != null) {
            metrics.f17933c++;
        }
        for (int i2 = 0; i2 < this.f17925i; i2++) {
            if (!this.e[i2].e) {
                p(priorityGoalRow);
                return;
            }
        }
        for (int i3 = 0; i3 < this.f17925i; i3++) {
            ArrayRow arrayRow = this.e[i3];
            arrayRow.f17910a.e = arrayRow.f17911b;
        }
    }

    public final void p(PriorityGoalRow priorityGoalRow) {
        Cache cache;
        Metrics metrics = f17917p;
        if (metrics != null) {
            metrics.f17934f = Math.max(metrics.f17934f, this.f17924h);
            Metrics metrics2 = f17917p;
            metrics2.f17935g = Math.max(metrics2.f17935g, this.f17925i);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f17925i) {
                break;
            }
            ArrayRow arrayRow = this.e[i2];
            SolverVariable.Type type = arrayRow.f17910a.f17951i;
            SolverVariable.Type type2 = SolverVariable.Type.f17956a;
            if (type != type2) {
                float f2 = 0.0f;
                if (arrayRow.f17911b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        int i4 = 1;
                        i3++;
                        float f3 = Float.MAX_VALUE;
                        int i5 = 0;
                        int i6 = -1;
                        int i7 = -1;
                        int i8 = 0;
                        while (true) {
                            int i9 = this.f17925i;
                            cache = this.f17927k;
                            if (i5 >= i9) {
                                break;
                            }
                            ArrayRow arrayRow2 = this.e[i5];
                            if (arrayRow2.f17910a.f17951i != type2 && !arrayRow2.e && arrayRow2.f17911b < f2) {
                                int i10 = i4;
                                while (i10 < this.f17924h) {
                                    SolverVariable solverVariable = cache.d[i10];
                                    float d = arrayRow2.d.d(solverVariable);
                                    if (d > f2) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f4 = solverVariable.f17949g[i11] / d;
                                            if ((f4 < f3 && i11 == i8) || i11 > i8) {
                                                i8 = i11;
                                                f3 = f4;
                                                i6 = i5;
                                                i7 = i10;
                                            }
                                        }
                                    }
                                    i10++;
                                    f2 = 0.0f;
                                }
                            }
                            i5++;
                            f2 = 0.0f;
                            i4 = 1;
                        }
                        if (i6 != -1) {
                            ArrayRow arrayRow3 = this.e[i6];
                            arrayRow3.f17910a.f17947c = -1;
                            arrayRow3.f(cache.d[i7]);
                            SolverVariable solverVariable2 = arrayRow3.f17910a;
                            solverVariable2.f17947c = i6;
                            solverVariable2.d(arrayRow3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.f17924h / 2) {
                            z2 = true;
                        }
                        f2 = 0.0f;
                    }
                }
            }
            i2++;
        }
        q(priorityGoalRow);
        for (int i12 = 0; i12 < this.f17925i; i12++) {
            ArrayRow arrayRow4 = this.e[i12];
            arrayRow4.f17910a.e = arrayRow4.f17911b;
        }
    }

    public final void q(ArrayRow arrayRow) {
        for (int i2 = 0; i2 < this.f17924h; i2++) {
            this.f17923g[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f17924h * 2) {
                return;
            }
            SolverVariable solverVariable = arrayRow.f17910a;
            if (solverVariable != null) {
                this.f17923g[solverVariable.f17946b] = true;
            }
            SolverVariable a2 = arrayRow.a(this.f17923g);
            if (a2 != null) {
                boolean[] zArr = this.f17923g;
                int i4 = a2.f17946b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (a2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f17925i; i6++) {
                    ArrayRow arrayRow2 = this.e[i6];
                    if (arrayRow2.f17910a.f17951i != SolverVariable.Type.f17956a && !arrayRow2.e && arrayRow2.d.j(a2)) {
                        float d = arrayRow2.d.d(a2);
                        if (d < 0.0f) {
                            float f3 = (-arrayRow2.f17911b) / d;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    ArrayRow arrayRow3 = this.e[i5];
                    arrayRow3.f17910a.f17947c = -1;
                    arrayRow3.f(a2);
                    SolverVariable solverVariable2 = arrayRow3.f17910a;
                    solverVariable2.f17947c = i5;
                    solverVariable2.d(arrayRow3);
                }
            } else {
                z2 = true;
            }
        }
    }

    public final void r() {
        boolean z2 = f17918q;
        Cache cache = this.f17927k;
        int i2 = 0;
        if (z2) {
            while (true) {
                ArrayRow[] arrayRowArr = this.e;
                if (i2 >= arrayRowArr.length) {
                    return;
                }
                ArrayRow arrayRow = arrayRowArr[i2];
                if (arrayRow != null) {
                    cache.f17913a.b(arrayRow);
                }
                this.e[i2] = null;
                i2++;
            }
        } else {
            while (true) {
                ArrayRow[] arrayRowArr2 = this.e;
                if (i2 >= arrayRowArr2.length) {
                    return;
                }
                ArrayRow arrayRow2 = arrayRowArr2[i2];
                if (arrayRow2 != null) {
                    cache.f17914b.b(arrayRow2);
                }
                this.e[i2] = null;
                i2++;
            }
        }
    }

    public final void s() {
        Cache cache;
        int i2 = 0;
        while (true) {
            cache = this.f17927k;
            SolverVariable[] solverVariableArr = cache.d;
            if (i2 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i2];
            if (solverVariable != null) {
                solverVariable.c();
            }
            i2++;
        }
        Pools.SimplePool simplePool = cache.f17915c;
        SolverVariable[] solverVariableArr2 = this.f17928l;
        int i3 = this.f17929m;
        simplePool.getClass();
        if (i3 > solverVariableArr2.length) {
            i3 = solverVariableArr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            SolverVariable solverVariable2 = solverVariableArr2[i4];
            int i5 = simplePool.f17938b;
            Object[] objArr = simplePool.f17937a;
            if (i5 < objArr.length) {
                objArr[i5] = solverVariable2;
                simplePool.f17938b = i5 + 1;
            }
        }
        this.f17929m = 0;
        Arrays.fill(cache.d, (Object) null);
        this.f17919a = 0;
        PriorityGoalRow priorityGoalRow = this.f17920b;
        priorityGoalRow.f17941h = 0;
        priorityGoalRow.f17911b = 0.0f;
        this.f17924h = 1;
        for (int i6 = 0; i6 < this.f17925i; i6++) {
            this.e[i6].getClass();
        }
        r();
        this.f17925i = 0;
        if (f17918q) {
            this.f17930n = new ValuesRow(cache);
        } else {
            this.f17930n = new ArrayRow(cache);
        }
    }
}
