package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.b9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1121b9<T> implements InterfaceC02402z<T> {
    public static byte[] A02;
    public static String[] A03 = {"iLl0wsw23K5yUh77EmQ7aS", "GfoEaaBl8U8k0Q7PfB9fbljrax1waY16", "5gtDUT", "ShV5kwK9yY", "0fmlK", "YYoW0eMgewTEbJ6HTbYGGS2KWNlxhaI9", "", "sW1q2ctPu7RNrNZv5Ej0VW9PcKYvvqLT"};
    public int A00;
    public final Object[] A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[0].length() == 2) {
                throw new RuntimeException();
            }
            A03[0] = "a39lLlVm2wZ";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 94);
            i5++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-15, 28, 34, 21, 17, 20, 41, -48, 25, 30, -48, 36, 24, 21, -48, 32, 31, 31, 28, -47, -63, -43, -46, -115, -38, -50, -27, -115, -35, -36, -36, -39, -115, -32, -42, -25, -46, -115, -38, -30, -32, -31, -115, -49, -46, -115, -85, -115, -99};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.b9 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    public C1121b9(int i2) {
        if (i2 > 0) {
            this.A01 = new Object[i2];
            return;
        }
        throw new IllegalArgumentException(A00(20, 29, 15));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.b9 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02(T r3) {
        /*
            r2 = this;
            r1 = 0
        L1:
            int r0 = r2.A00
            if (r1 >= r0) goto L10
            java.lang.Object[] r0 = r2.A01
            r0 = r0[r1]
            if (r0 != r3) goto Ld
            r0 = 1
            return r0
        Ld:
            int r1 = r1 + 1
            goto L1
        L10:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1121b9.A02(java.lang.Object):boolean");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.b9 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.instagram.common.viewpoint.core.InterfaceC02402z
    public T A2x() {
        if (this.A00 <= 0) {
            return null;
        }
        int i2 = this.A00 - 1;
        T t2 = (T) this.A01[i2];
        this.A01[i2] = null;
        if (A03[1].charAt(25) == 't') {
            throw new RuntimeException();
        }
        A03[1] = "CkflbgsNAkMx06fZnMm4opLTGkpn7A2i";
        this.A00--;
        return t2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.b9 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.instagram.common.viewpoint.core.InterfaceC02402z
    public boolean AF1(T t2) {
        if (!A02(t2)) {
            int i2 = this.A00;
            Object[] objArr = this.A01;
            if (A03[3].length() == 20) {
                throw new RuntimeException();
            }
            A03[4] = "en1OjK";
            if (i2 < objArr.length) {
                this.A01[this.A00] = t2;
                this.A00++;
                return true;
            }
            return false;
        }
        throw new IllegalStateException(A00(0, 20, 82));
    }
}
