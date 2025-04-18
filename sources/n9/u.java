package n9;

import java.util.Arrays;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class u {
    public static final byte[] a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f22589b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f22590c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f22591d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i12 = i11 - i10;
        boolean z13 = false;
        if (i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b3 = bArr[i14];
            if ((b3 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b3 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        if (i12 <= 2 ? i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !zArr[2] || bArr[i11 - 2] != 0 || bArr[i13] != 1 : bArr[i11 - 3] != 0 || bArr[i11 - 2] != 0 || bArr[i13] != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        zArr[0] = z11;
        if (i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : !(bArr[i11 - 2] != 0 || bArr[i13] != 0)) {
            z12 = true;
        } else {
            z12 = false;
        }
        zArr[1] = z12;
        if (bArr[i13] == 0) {
            z13 = true;
        }
        zArr[2] = z13;
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0341  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static n9.r c(int r25, int r26, byte[] r27) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.u.c(int, int, byte[]):n9.r");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static n9.t d(int r20, int r21, byte[] r22) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.u.d(int, int, byte[]):n9.t");
    }

    public static int e(byte[] bArr, int i10) {
        int i11;
        synchronized (f22590c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 < i10 - 2) {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = i10;
                        break;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f22591d;
                    if (iArr.length <= i13) {
                        f22591d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f22591d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f22591d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
