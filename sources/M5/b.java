package M5;

import E.g;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2003a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final int[][] b = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: c, reason: collision with root package name */
    public static final int[][] f2004c = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f2005d = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f2006e = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(g gVar, boolean z8) {
        int i9;
        byte b8;
        int i10 = gVar.f843c;
        int i11 = gVar.f844d;
        if (z8) {
            i9 = i11;
        } else {
            i9 = i10;
        }
        if (!z8) {
            i10 = i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            byte b9 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                byte[][] bArr = (byte[][]) gVar.f845f;
                if (z8) {
                    b8 = bArr[i13][i15];
                } else {
                    b8 = bArr[i15][i13];
                }
                if (b8 == b9) {
                    i14++;
                } else {
                    if (i14 >= 5) {
                        i12 += i14 - 2;
                    }
                    i14 = 1;
                    b9 = b8;
                }
            }
            if (i14 >= 5) {
                i12 = (i14 - 2) + i12;
            }
        }
        return i12;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:104:0x01ec. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(D5.a r27, int r28, L5.c r29, int r30, E.g r31) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.b.b(D5.a, int, L5.c, int, E.g):void");
    }

    public static int c(int i9, int i10) {
        if (i10 != 0) {
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
            int i11 = 32 - numberOfLeadingZeros;
            int i12 = i9 << (31 - numberOfLeadingZeros);
            while (32 - Integer.numberOfLeadingZeros(i12) >= i11) {
                i12 ^= i10 << ((32 - Integer.numberOfLeadingZeros(i12)) - i11);
            }
            return i12;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void d(int i9, int i10, g gVar) {
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = i9 + i11;
            if (g(gVar.a(i12, i10))) {
                gVar.b(i12, i10, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static void e(int i9, int i10, g gVar) {
        for (int i11 = 0; i11 < 7; i11++) {
            int[] iArr = b[i11];
            for (int i12 = 0; i12 < 7; i12++) {
                gVar.b(i9 + i12, i10 + i11, iArr[i12]);
            }
        }
    }

    public static void f(int i9, int i10, g gVar) {
        for (int i11 = 0; i11 < 7; i11++) {
            int i12 = i10 + i11;
            if (g(gVar.a(i9, i12))) {
                gVar.b(i9, i12, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static boolean g(int i9) {
        if (i9 == -1) {
            return true;
        }
        return false;
    }
}
