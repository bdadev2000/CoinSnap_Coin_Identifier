package g1;

import b1.v0;
import b1.w0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f30607b = AtomicIntegerFieldUpdater.newUpdater(f0.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public v0[] f30608a;

    public final void a(v0 v0Var) {
        v0Var.e((w0) this);
        v0[] v0VarArr = this.f30608a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f30607b;
        if (v0VarArr == null) {
            v0VarArr = new v0[4];
            this.f30608a = v0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= v0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(v0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            p0.a.r(copyOf, "copyOf(this, newSize)");
            v0VarArr = (v0[]) copyOf;
            this.f30608a = v0VarArr;
        }
        int i2 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i2 + 1);
        v0VarArr[i2] = v0Var;
        v0Var.f22383b = i2;
        c(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b1.v0 b(int r9) {
        /*
            r8 = this;
            b1.v0[] r0 = r8.f30608a
            p0.a.p(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = g1.f0.f30607b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            p0.a.p(r4)
            r5 = r0[r2]
            p0.a.p(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            b1.v0[] r5 = r8.f30608a
            p0.a.p(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            p0.a.p(r6)
            r7 = r5[r4]
            p0.a.p(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            p0.a.p(r4)
            r5 = r5[r2]
            p0.a.p(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            p0.a.p(r9)
            r2 = 0
            r9.e(r2)
            r9.f22383b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.f0.b(int):b1.v0");
    }

    public final void c(int i2) {
        while (i2 > 0) {
            v0[] v0VarArr = this.f30608a;
            p0.a.p(v0VarArr);
            int i3 = (i2 - 1) / 2;
            v0 v0Var = v0VarArr[i3];
            p0.a.p(v0Var);
            v0 v0Var2 = v0VarArr[i2];
            p0.a.p(v0Var2);
            if (v0Var.compareTo(v0Var2) <= 0) {
                return;
            }
            d(i2, i3);
            i2 = i3;
        }
    }

    public final void d(int i2, int i3) {
        v0[] v0VarArr = this.f30608a;
        p0.a.p(v0VarArr);
        v0 v0Var = v0VarArr[i3];
        p0.a.p(v0Var);
        v0 v0Var2 = v0VarArr[i2];
        p0.a.p(v0Var2);
        v0VarArr[i2] = v0Var;
        v0VarArr[i3] = v0Var2;
        v0Var.f22383b = i2;
        v0Var2.f22383b = i3;
    }
}
