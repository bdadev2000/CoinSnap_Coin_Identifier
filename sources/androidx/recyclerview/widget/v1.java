package androidx.recyclerview.widget;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class v1 {
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public List f2050b;

    public final void a() {
        int[] iArr = this.a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f2050b = null;
    }

    public final void b(int i10) {
        int[] iArr = this.a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i10, 10) + 1];
            this.a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i10 >= iArr.length) {
            int length = iArr.length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public final void c(int i10) {
        List list = this.f2050b;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (((u1) this.f2050b.get(size)).f2045b >= i10) {
                    this.f2050b.remove(size);
                }
            }
        }
        e(i10);
    }

    public final u1 d(int i10, int i11, int i12) {
        List list = this.f2050b;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            u1 u1Var = (u1) this.f2050b.get(i13);
            int i14 = u1Var.f2045b;
            if (i14 >= i11) {
                return null;
            }
            if (i14 >= i10 && (i12 == 0 || u1Var.f2046c == i12 || u1Var.f2048f)) {
                return u1Var;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(int r6) {
        /*
            r5 = this;
            int[] r0 = r5.a
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.length
            if (r6 < r0) goto La
            return r1
        La:
            java.util.List r0 = r5.f2050b
            if (r0 != 0) goto Lf
            goto L5e
        Lf:
            r2 = 0
            if (r0 != 0) goto L13
            goto L2b
        L13:
            int r0 = r0.size()
            int r0 = r0 + r1
        L18:
            if (r0 < 0) goto L2b
            java.util.List r3 = r5.f2050b
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.u1 r3 = (androidx.recyclerview.widget.u1) r3
            int r4 = r3.f2045b
            if (r4 != r6) goto L28
            r2 = r3
            goto L2b
        L28:
            int r0 = r0 + (-1)
            goto L18
        L2b:
            if (r2 == 0) goto L32
            java.util.List r0 = r5.f2050b
            r0.remove(r2)
        L32:
            java.util.List r0 = r5.f2050b
            int r0 = r0.size()
            r2 = 0
        L39:
            if (r2 >= r0) goto L4b
            java.util.List r3 = r5.f2050b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.u1 r3 = (androidx.recyclerview.widget.u1) r3
            int r3 = r3.f2045b
            if (r3 < r6) goto L48
            goto L4c
        L48:
            int r2 = r2 + 1
            goto L39
        L4b:
            r2 = r1
        L4c:
            if (r2 == r1) goto L5e
            java.util.List r0 = r5.f2050b
            java.lang.Object r0 = r0.get(r2)
            androidx.recyclerview.widget.u1 r0 = (androidx.recyclerview.widget.u1) r0
            java.util.List r3 = r5.f2050b
            r3.remove(r2)
            int r0 = r0.f2045b
            goto L5f
        L5e:
            r0 = r1
        L5f:
            if (r0 != r1) goto L6b
            int[] r0 = r5.a
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            int[] r6 = r5.a
            int r6 = r6.length
            return r6
        L6b:
            int r0 = r0 + 1
            int[] r2 = r5.a
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            int[] r2 = r5.a
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.v1.e(int):int");
    }

    public final void f(int i10, int i11) {
        int[] iArr = this.a;
        if (iArr != null && i10 < iArr.length) {
            int i12 = i10 + i11;
            b(i12);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.a, i10, i12, -1);
            List list = this.f2050b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    u1 u1Var = (u1) this.f2050b.get(size);
                    int i13 = u1Var.f2045b;
                    if (i13 >= i10) {
                        u1Var.f2045b = i13 + i11;
                    }
                }
            }
        }
    }

    public final void g(int i10, int i11) {
        int[] iArr = this.a;
        if (iArr != null && i10 < iArr.length) {
            int i12 = i10 + i11;
            b(i12);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            List list = this.f2050b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    u1 u1Var = (u1) this.f2050b.get(size);
                    int i13 = u1Var.f2045b;
                    if (i13 >= i10) {
                        if (i13 < i12) {
                            this.f2050b.remove(size);
                        } else {
                            u1Var.f2045b = i13 - i11;
                        }
                    }
                }
            }
        }
    }
}
