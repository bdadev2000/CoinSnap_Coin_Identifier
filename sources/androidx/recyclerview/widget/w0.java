package androidx.recyclerview.widget;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f5111a;
    public List b;

    public final void a() {
        int[] iArr = this.f5111a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.b = null;
    }

    public final void b(int i9) {
        int[] iArr = this.f5111a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i9, 10) + 1];
            this.f5111a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i9 >= iArr.length) {
            int length = iArr.length;
            while (length <= i9) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f5111a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f5111a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public final void c(int i9) {
        List list = this.b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (((v0) this.b.get(size)).b >= i9) {
                    this.b.remove(size);
                }
            }
        }
        e(i9);
    }

    public final v0 d(int i9, int i10, int i11) {
        List list = this.b;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            v0 v0Var = (v0) this.b.get(i12);
            int i13 = v0Var.b;
            if (i13 >= i10) {
                return null;
            }
            if (i13 >= i9 && (i11 == 0 || v0Var.f5100c == i11 || v0Var.f5102f)) {
                return v0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(int r6) {
        /*
            r5 = this;
            int[] r0 = r5.f5111a
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.length
            if (r6 < r0) goto La
            return r1
        La:
            java.util.List r0 = r5.b
            if (r0 != 0) goto L10
        Le:
            r0 = r1
            goto L5f
        L10:
            r2 = 0
            if (r0 != 0) goto L14
            goto L2d
        L14:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L1a:
            if (r0 < 0) goto L2d
            java.util.List r3 = r5.b
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.v0 r3 = (androidx.recyclerview.widget.v0) r3
            int r4 = r3.b
            if (r4 != r6) goto L2a
            r2 = r3
            goto L2d
        L2a:
            int r0 = r0 + (-1)
            goto L1a
        L2d:
            if (r2 == 0) goto L34
            java.util.List r0 = r5.b
            r0.remove(r2)
        L34:
            java.util.List r0 = r5.b
            int r0 = r0.size()
            r2 = 0
        L3b:
            if (r2 >= r0) goto L4d
            java.util.List r3 = r5.b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.v0 r3 = (androidx.recyclerview.widget.v0) r3
            int r3 = r3.b
            if (r3 < r6) goto L4a
            goto L4e
        L4a:
            int r2 = r2 + 1
            goto L3b
        L4d:
            r2 = r1
        L4e:
            if (r2 == r1) goto Le
            java.util.List r0 = r5.b
            java.lang.Object r0 = r0.get(r2)
            androidx.recyclerview.widget.v0 r0 = (androidx.recyclerview.widget.v0) r0
            java.util.List r3 = r5.b
            r3.remove(r2)
            int r0 = r0.b
        L5f:
            if (r0 != r1) goto L6b
            int[] r0 = r5.f5111a
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            int[] r6 = r5.f5111a
            int r6 = r6.length
            return r6
        L6b:
            int r0 = r0 + 1
            int[] r2 = r5.f5111a
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            int[] r2 = r5.f5111a
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.w0.e(int):int");
    }

    public final void f(int i9, int i10) {
        int[] iArr = this.f5111a;
        if (iArr != null && i9 < iArr.length) {
            int i11 = i9 + i10;
            b(i11);
            int[] iArr2 = this.f5111a;
            System.arraycopy(iArr2, i9, iArr2, i11, (iArr2.length - i9) - i10);
            Arrays.fill(this.f5111a, i9, i11, -1);
            List list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    v0 v0Var = (v0) this.b.get(size);
                    int i12 = v0Var.b;
                    if (i12 >= i9) {
                        v0Var.b = i12 + i10;
                    }
                }
            }
        }
    }

    public final void g(int i9, int i10) {
        int[] iArr = this.f5111a;
        if (iArr != null && i9 < iArr.length) {
            int i11 = i9 + i10;
            b(i11);
            int[] iArr2 = this.f5111a;
            System.arraycopy(iArr2, i11, iArr2, i9, (iArr2.length - i9) - i10);
            int[] iArr3 = this.f5111a;
            Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
            List list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    v0 v0Var = (v0) this.b.get(size);
                    int i12 = v0Var.b;
                    if (i12 >= i9) {
                        if (i12 < i11) {
                            this.b.remove(size);
                        } else {
                            v0Var.b = i12 - i10;
                        }
                    }
                }
            }
        }
    }
}
