package s7;

import android.util.Pair;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class l2 extends x2 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f24558m = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f24559c;

    /* renamed from: d, reason: collision with root package name */
    public final v8.c1 f24560d;

    /* renamed from: f, reason: collision with root package name */
    public final int f24561f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24562g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f24563h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f24564i;

    /* renamed from: j, reason: collision with root package name */
    public final x2[] f24565j;

    /* renamed from: k, reason: collision with root package name */
    public final Object[] f24566k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f24567l;

    public l2(x2[] x2VarArr, Object[] objArr, v8.c1 c1Var) {
        this.f24560d = c1Var;
        this.f24559c = c1Var.f26083b.length;
        int length = x2VarArr.length;
        this.f24565j = x2VarArr;
        this.f24563h = new int[length];
        this.f24564i = new int[length];
        this.f24566k = objArr;
        this.f24567l = new HashMap();
        int length2 = x2VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            x2 x2Var = x2VarArr[i10];
            this.f24565j[i13] = x2Var;
            this.f24564i[i13] = i11;
            this.f24563h[i13] = i12;
            i11 += x2Var.o();
            i12 += this.f24565j[i13].h();
            this.f24567l.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.f24561f = i11;
        this.f24562g = i12;
    }

    @Override // s7.x2
    public final int a(boolean z10) {
        if (this.f24559c == 0) {
            return -1;
        }
        int i10 = 0;
        if (z10) {
            int[] iArr = this.f24560d.f26083b;
            if (iArr.length > 0) {
                i10 = iArr[0];
            } else {
                i10 = -1;
            }
        }
        do {
            x2[] x2VarArr = this.f24565j;
            if (x2VarArr[i10].p()) {
                i10 = q(i10, z10);
            } else {
                return this.f24564i[i10] + x2VarArr[i10].a(z10);
            }
        } while (i10 != -1);
        return -1;
    }

    @Override // s7.x2
    public final int b(Object obj) {
        int intValue;
        int b3;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f24567l.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 || (b3 = this.f24565j[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.f24563h[intValue] + b3;
    }

    @Override // s7.x2
    public final int c(boolean z10) {
        int i10;
        int i11 = this.f24559c;
        if (i11 == 0) {
            return -1;
        }
        if (z10) {
            int[] iArr = this.f24560d.f26083b;
            if (iArr.length > 0) {
                i10 = iArr[iArr.length - 1];
            } else {
                i10 = -1;
            }
        } else {
            i10 = i11 - 1;
        }
        do {
            x2[] x2VarArr = this.f24565j;
            if (x2VarArr[i10].p()) {
                i10 = r(i10, z10);
            } else {
                return this.f24564i[i10] + x2VarArr[i10].c(z10);
            }
        } while (i10 != -1);
        return -1;
    }

    @Override // s7.x2
    public final int e(int i10, int i11, boolean z10) {
        int[] iArr = this.f24564i;
        int i12 = 0;
        int e2 = n9.h0.e(iArr, i10 + 1, false, false);
        int i13 = iArr[e2];
        x2[] x2VarArr = this.f24565j;
        x2 x2Var = x2VarArr[e2];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int e10 = x2Var.e(i14, i12, z10);
        if (e10 != -1) {
            return i13 + e10;
        }
        int q10 = q(e2, z10);
        while (q10 != -1 && x2VarArr[q10].p()) {
            q10 = q(q10, z10);
        }
        if (q10 != -1) {
            return x2VarArr[q10].a(z10) + iArr[q10];
        }
        if (i11 != 2) {
            return -1;
        }
        return a(z10);
    }

    @Override // s7.x2
    public final v2 f(int i10, v2 v2Var, boolean z10) {
        int[] iArr = this.f24563h;
        int e2 = n9.h0.e(iArr, i10 + 1, false, false);
        int i11 = this.f24564i[e2];
        this.f24565j[e2].f(i10 - iArr[e2], v2Var, z10);
        v2Var.f24787d += i11;
        if (z10) {
            Object obj = this.f24566k[e2];
            Object obj2 = v2Var.f24786c;
            obj2.getClass();
            v2Var.f24786c = Pair.create(obj, obj2);
        }
        return v2Var;
    }

    @Override // s7.x2
    public final v2 g(Object obj, v2 v2Var) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f24567l.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i10 = this.f24564i[intValue];
        this.f24565j[intValue].g(obj3, v2Var);
        v2Var.f24787d += i10;
        v2Var.f24786c = obj;
        return v2Var;
    }

    @Override // s7.x2
    public final int h() {
        return this.f24562g;
    }

    @Override // s7.x2
    public final int k(int i10, int i11, boolean z10) {
        int[] iArr = this.f24564i;
        int i12 = 0;
        int e2 = n9.h0.e(iArr, i10 + 1, false, false);
        int i13 = iArr[e2];
        x2[] x2VarArr = this.f24565j;
        x2 x2Var = x2VarArr[e2];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int k10 = x2Var.k(i14, i12, z10);
        if (k10 != -1) {
            return i13 + k10;
        }
        int r6 = r(e2, z10);
        while (r6 != -1 && x2VarArr[r6].p()) {
            r6 = r(r6, z10);
        }
        if (r6 != -1) {
            return x2VarArr[r6].c(z10) + iArr[r6];
        }
        if (i11 != 2) {
            return -1;
        }
        return c(z10);
    }

    @Override // s7.x2
    public final Object l(int i10) {
        int[] iArr = this.f24563h;
        int e2 = n9.h0.e(iArr, i10 + 1, false, false);
        return Pair.create(this.f24566k[e2], this.f24565j[e2].l(i10 - iArr[e2]));
    }

    @Override // s7.x2
    public final w2 n(int i10, w2 w2Var, long j3) {
        int[] iArr = this.f24564i;
        int e2 = n9.h0.e(iArr, i10 + 1, false, false);
        int i11 = iArr[e2];
        int i12 = this.f24563h[e2];
        this.f24565j[e2].n(i10 - i11, w2Var, j3);
        Object obj = this.f24566k[e2];
        if (!w2.f24833t.equals(w2Var.f24839b)) {
            obj = Pair.create(obj, w2Var.f24839b);
        }
        w2Var.f24839b = obj;
        w2Var.f24853q += i12;
        w2Var.f24854r += i12;
        return w2Var;
    }

    @Override // s7.x2
    public final int o() {
        return this.f24561f;
    }

    public final int q(int i10, boolean z10) {
        if (z10) {
            v8.c1 c1Var = this.f24560d;
            int i11 = c1Var.f26084c[i10] + 1;
            int[] iArr = c1Var.f26083b;
            if (i11 >= iArr.length) {
                return -1;
            }
            return iArr[i11];
        }
        if (i10 >= this.f24559c - 1) {
            return -1;
        }
        return i10 + 1;
    }

    public final int r(int i10, boolean z10) {
        if (z10) {
            v8.c1 c1Var = this.f24560d;
            int i11 = c1Var.f26084c[i10] - 1;
            if (i11 < 0) {
                return -1;
            }
            return c1Var.f26083b[i11];
        }
        if (i10 <= 0) {
            return -1;
        }
        return (-1) + i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l2(java.util.List r7, v8.c1 r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            s7.x2[] r0 = new s7.x2[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            s7.p1 r4 = (s7.p1) r4
            int r5 = r3 + 1
            s7.x2 r4 = r4.b()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            s7.p1 r3 = (s7.p1) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.a()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.l2.<init>(java.util.List, v8.c1):void");
    }
}
